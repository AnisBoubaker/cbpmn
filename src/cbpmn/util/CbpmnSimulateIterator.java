package cbpmn.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

import cbpmn.Branch;
import cbpmn.DecisionGateway;
import cbpmn.FlowNode;
import cbpmn.ParallelGateway;
import cbpmn.ProcessModel;
import cbpmn.SplitGateway;
import cbpmn.StartEvent;

/**
 * Iterator class that iterates through process' activities respecting the control flow constraints. 
 * This iterator simulates an execution by: 
 * 1. Choosing randomly a branch when faced with a DecisionGateway. It chooses systematically the default
 * branch if one is set; 
 * 2. Choosing randomly an activity from parallel branches (but always respects the control flow constraints).
 * 
 * @author Anis Boubaker
 *
 */
public class CbpmnSimulateIterator implements CbpmnIterator {

	private ProcessModel processModel;
	private StartEvent startEvent;
	private List<FlowNode> parrallelPool;
	private FlowNode currentPosition = null;
	private Stack<SplitGateway> branchingGateway = null;
	private boolean isIterating = false;
	
	public CbpmnSimulateIterator(){
		this.parrallelPool = new ArrayList<FlowNode>();
		this.branchingGateway = new Stack<SplitGateway>();
		this.currentPosition = null;
	}
	
	public CbpmnSimulateIterator(ProcessModel model){
		this();
		this.processModel = model;
		this.startEvent = this.processModel.getRandomStartEvent();
	}
	
	public CbpmnSimulateIterator(ProcessModel model, StartEvent start){
		this();
		this.processModel = model;
		this.startEvent = start;
	}
	
	@Override
	public void setProcessModel(ProcessModel model){
		this.processModel = model;
	}
	
	@Override
	public void setStartNode(FlowNode start) {
		if(!(start instanceof StartEvent)) throw new IllegalArgumentException("The start node of this iterator must be a start event.");
		StartEvent startEvent = (StartEvent)start;
		this.startEvent = startEvent;
	}
	
	
	@Override
	public boolean hasNext() {
		if(!isIterating){
			if(this.startEvent==null) this.startEvent = this.processModel.getRandomStartEvent();
			if(this.startEvent==null) return false;
			return true;
		}
		FlowNode next = next(false);
		if(next==null) isIterating = false;
		return next!=null;
	}

	@Override
	public FlowNode next() {
		return this.next(true);
	}
	
	/**
	 * Function that iterates through the activities. This is the core of the iterator used both by next() and
	 * hasNext(). The boolean parameter (advance) tells the iterator if the iterator should advance to the new
	 * position or should it only simulate (simulation is used by hasNext() ). 
	 * 
	 * @param advance If set to true, the next position will be retained as the current iterator's position.
	 * @return The next flow node following the current position in the process. 
	 */
	private FlowNode next(boolean advance) {
		CbpmnSimulateIteratorMemento memento=null;
		if(!advance){
			memento = createMemento();
		}
		
		if(this.parrallelPool.size()>0) { //We are in a parallel setting, we get an activity randomly from the pool
			currentPosition = getRandomFlowNodeInParallelSetting();
		} else if(this.isIterating) {
			if(currentPosition==null) return null;
			if(currentPosition instanceof DecisionGateway){
				//TODO: for testing purposes, we use the default branch, or a random if no default.
				Branch selectedBranch = ((DecisionGateway)currentPosition).getRandomBranch();
				currentPosition = selectedBranch.getFirstNode();
			} else {
				currentPosition = currentPosition.getNext();
			}
		} else {
			this.currentPosition = this.startEvent;
			this.isIterating = true;
			return this.currentPosition;
		}
		
		if(currentPosition==null && !this.branchingGateway.isEmpty()){
			this.currentPosition = this.branchingGateway.pop().getNext();
		}
		
		if(currentPosition instanceof DecisionGateway){
			this.branchingGateway.push((DecisionGateway)currentPosition);
		}
		if(currentPosition instanceof ParallelGateway){
			this.branchingGateway.push((ParallelGateway)this.currentPosition);
			for(Branch branch : ((ParallelGateway)this.currentPosition).getBranches()){
				FlowNode firstInBranch = branch.getFirstNode();
				if(firstInBranch!=null){
					this.parrallelPool.add(firstInBranch);
				}
			}
		}		
		if(!advance){
			FlowNode newPosition = currentPosition;
			restoreFromMemento(memento);
			return newPosition;
		}
		
		return currentPosition;
	}
	
	private FlowNode getRandomFlowNodeInParallelSetting(){
		if(this.parrallelPool.isEmpty()) return null;
		Random randomGenerator = new Random();
		FlowNode randomNode = this.parrallelPool.get( randomGenerator.nextInt(this.parrallelPool.size()) ); 
		this.parrallelPool.remove(randomNode);
		if(randomNode.getNext()!=null) this.parrallelPool.add(randomNode.getNext());
		return randomNode;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("Remove operation is not supported by a CbpmnIterator.");
	}
	
	private CbpmnSimulateIteratorMemento createMemento(){
		CbpmnSimulateIteratorMemento memento = new CbpmnSimulateIteratorMemento();
		memento.setBranchingGateway(branchingGateway);
		memento.setCurrentPosition(currentPosition);
		memento.setParrallelPool(parrallelPool);
		memento.setProcessModel(processModel);
		memento.setStartEvent(startEvent);
		memento.setIsIterating(isIterating);
		return memento;
	}
	
	private void restoreFromMemento(CbpmnSimulateIteratorMemento memento){
		this.branchingGateway.removeAllElements();
		this.branchingGateway.addAll(memento.getBranchingGateway());
		this.currentPosition = memento.getCurrentPosition();
		this.parrallelPool.clear();
		this.parrallelPool.addAll(memento.getParrallelPool());
		this.processModel = memento.getProcessModel();
		this.startEvent = memento.getStartEvent();
		this.isIterating = memento.getIsIterating();
	}
	
	
	public ProcessModel getProcessModel() {
		return processModel;
	}

	public StartEvent getStartEvent() {
		return startEvent;
	}	
	
	private class CbpmnSimulateIteratorMemento{
		private ProcessModel processModel;
		private StartEvent startEvent;
		private List<FlowNode> parrallelPool;
		private FlowNode currentPosition = null;
		private Stack<SplitGateway> branchingGateway = null;
		private boolean isIterating;
		
		public ProcessModel getProcessModel() {
			return processModel;
		}
		public boolean getIsIterating() {
			return this.isIterating;
		}
		public void setIsIterating(boolean isIterating) {
			this.isIterating = isIterating;			
		}
		public void setProcessModel(ProcessModel processModel) {
			this.processModel = processModel;
		}
		public StartEvent getStartEvent() {
			return startEvent;
		}
		public void setStartEvent(StartEvent startEvent) {
			this.startEvent = startEvent;
		}
		public List<FlowNode> getParrallelPool() {
			return parrallelPool;
		}
		public void setParrallelPool(List<FlowNode> parrallelPool) {
			this.parrallelPool = new ArrayList<FlowNode>();
			this.parrallelPool.addAll(parrallelPool);
		}
		public FlowNode getCurrentPosition() {
			return currentPosition;
		}
		public void setCurrentPosition(FlowNode currentPosition) {
			this.currentPosition = currentPosition;
		}
		public Stack<SplitGateway> getBranchingGateway() {
			return branchingGateway;
		}
		public void setBranchingGateway(Stack<SplitGateway> branchingGateway) {
			this.branchingGateway = new Stack<SplitGateway>();
			this.branchingGateway.addAll(branchingGateway);
		}
		
	}

}
