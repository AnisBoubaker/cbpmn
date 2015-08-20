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

public class CbpmnReverseIterator implements CbpmnIterator {

	private ProcessModel processModel;
	private FlowNode startNode;
	private FlowNode currentNode;
	private boolean isIterating;
	private List<FlowNode> parallelPool;
	private Stack<Branch> branchingPool;
	private Stack<SplitGateway> gatewaysPool;
	
	public CbpmnReverseIterator() {
		this.isIterating = false;
		this.startNode = null;
		this.processModel = null;
		this.parallelPool = new ArrayList<FlowNode>();
		this.branchingPool = new Stack<Branch>();
		this.gatewaysPool = new Stack<SplitGateway>();
	}
	
	@Override
	public boolean hasNext() {
		if(!this.isIterating && this.startNode!=null) return true;
		CbpmnReverseIteratorMemento memento=null;
		memento = this.createMemento();
		FlowNode next = next();
		this.restoreFromMemento(memento);
		return (next!=null);
	}

	@Override
	public FlowNode next() {
		FlowNode potentialNode;
		if(!this.isIterating){
			this.currentNode = this.startNode;
			this.isIterating = true;
			return this.currentNode;
		}
		if(this.parallelPool.size()>0){//We are in a parallel pool, select randomly
			potentialNode = getRandomFlowNodeInParallelSetting();
		} else {
			potentialNode = this.currentNode.getPrevious();
		}
		if(potentialNode instanceof DecisionGateway){
			DecisionGateway gateway = (DecisionGateway)potentialNode;
			this.gatewaysPool.add(gateway);
			for(Branch branch: gateway.getBranches()){
				this.branchingPool.push(branch);
			}
			potentialNode = null;
		}
		
		if(potentialNode instanceof ParallelGateway){
			ParallelGateway gateway = (ParallelGateway)potentialNode;
			this.gatewaysPool.add(gateway);
			for(Branch branch: gateway.getBranches()){
				this.parallelPool.add(branch.getLastNode());
			}
			potentialNode = this.getRandomFlowNodeInParallelSetting();
		}
		
		if(potentialNode==null && !this.branchingPool.isEmpty()){//Check if we have branches in the branching pool.
			potentialNode = this.branchingPool.pop().getLastNode();
			while(potentialNode==null && !this.branchingPool.isEmpty()){
				potentialNode = this.branchingPool.pop().getLastNode();
			}
		}
		if(potentialNode==null && !this.gatewaysPool.isEmpty()){
			return this.currentNode =  this.gatewaysPool.pop();
		}
		if(potentialNode==null)
			return this.currentNode=null;
		
		
		
		
		return this.currentNode = potentialNode;
		
	}
	
	private FlowNode getRandomFlowNodeInParallelSetting(){
		if(this.parallelPool.isEmpty()) return null;
		Random randomGenerator = new Random(); 
		FlowNode randomNode = this.parallelPool.get( randomGenerator.nextInt(this.parallelPool.size()) );
		this.parallelPool.remove( randomNode );
		
		if( randomNode.getPrevious()!=null) 
			this.parallelPool.add(randomNode.getPrevious());
		
		return randomNode;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("This iterator does not support the remove operation.");
	}

	@Override
	public void setProcessModel(ProcessModel model) {
		this.processModel = model;
	}

	@Override
	public void setStartNode(FlowNode start) {
		this.startNode = start;
		this.currentNode = start;
	}
	
	private CbpmnReverseIteratorMemento createMemento(){
		CbpmnReverseIteratorMemento memento = new CbpmnReverseIteratorMemento();
		memento.setBranchingPool(branchingPool);
		memento.setCurrentNode(currentNode);
		memento.setGatewaysPool(gatewaysPool);
		memento.setIterating(isIterating);
		memento.setParallelPool(parallelPool);
		memento.setProcessModel(processModel);
		memento.setStartNode(startNode);
		return memento;
	}
	
	private void restoreFromMemento(CbpmnReverseIteratorMemento memento){
		this.branchingPool = memento.getBranchingPool();
		this.currentNode = memento.getCurrentNode();
		this.gatewaysPool = memento.getGatewaysPool();
		this.isIterating = memento.isIterating();
		this.parallelPool = memento.getParallelPool();
		this.processModel = memento.getProcessModel();
		this.startNode = memento.getStartNode();
	}
	
	private class CbpmnReverseIteratorMemento{
		private ProcessModel processModel;
		private FlowNode startNode;
		private FlowNode currentNode;
		private boolean isIterating;
		private List<FlowNode> parallelPool;
		private Stack<Branch> branchingPool;
		private Stack<SplitGateway> gatewaysPool;
		/**
		 * @return the processModel
		 */
		public ProcessModel getProcessModel() {
			return processModel;
		}
		/**
		 * @param processModel the processModel to set
		 */
		public void setProcessModel(ProcessModel processModel) {
			this.processModel = processModel;
		}
		/**
		 * @return the startNode
		 */
		public FlowNode getStartNode() {
			return startNode;
		}
		/**
		 * @param startNode the startNode to set
		 */
		public void setStartNode(FlowNode startNode) {
			this.startNode = startNode;
		}
		/**
		 * @return the currentNode
		 */
		public FlowNode getCurrentNode() {
			return currentNode;
		}
		/**
		 * @param currentNode the currentNode to set
		 */
		public void setCurrentNode(FlowNode currentNode) {
			this.currentNode = currentNode;
		}
		/**
		 * @return the isIterating
		 */
		public boolean isIterating() {
			return isIterating;
		}
		/**
		 * @param isIterating the isIterating to set
		 */
		public void setIterating(boolean isIterating) {
			this.isIterating = isIterating;
		}
		/**
		 * @return the parallelPool
		 */
		public List<FlowNode> getParallelPool() {
			return parallelPool;
		}
		/**
		 * @param parallelPool the parallelPool to set
		 */
		public void setParallelPool(List<FlowNode> parallelPool) {
			this.parallelPool = new ArrayList<FlowNode>();
			this.parallelPool.addAll(parallelPool);
		}
		/**
		 * @return the branchingPool
		 */
		public Stack<Branch> getBranchingPool() {
			return branchingPool;
		}
		/**
		 * @param branchingPool the branchingPool to set
		 */
		public void setBranchingPool(Stack<Branch> branchingPool) {
			this.branchingPool = new Stack<Branch>();
			this.branchingPool.addAll(branchingPool);
		}
		/**
		 * @return the decisionGatewaysPool
		 */
		public Stack<SplitGateway> getGatewaysPool() {
			return gatewaysPool;
		}
		/**
		 * @param decisionGatewaysPool the decisionGatewaysPool to set
		 */
		public void setGatewaysPool(Stack<SplitGateway> decisionGatewaysPool) {
			this.gatewaysPool = new Stack<SplitGateway>();
			this.gatewaysPool.addAll(decisionGatewaysPool);
		}
		
		
	}

}
