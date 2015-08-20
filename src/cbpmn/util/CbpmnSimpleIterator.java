package cbpmn.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cbpmn.Branch;
import cbpmn.FlowNode;
import cbpmn.ProcessModel;
import cbpmn.SplitGateway;

public class CbpmnSimpleIterator implements CbpmnIterator {

	private ProcessModel processModel;
	private Iterator<FlowNode> iterator;
	private List<Branch> branchesPool;
	
	public CbpmnSimpleIterator(){
		this.processModel = null;
		this.branchesPool = new ArrayList<Branch>();
	}
	
	@Override
	public boolean hasNext() {
		if(this.processModel==null) throw new IllegalAccessError("The process model must be set first.");
		if(this.iterator.hasNext()) return true;
		while(!this.branchesPool.isEmpty()){
			Branch branch = this.branchesPool.remove(0);
			this.iterator = branch.getNodes().iterator();
			if(this.iterator.hasNext()) return true;
		}
		return false;
	}

	@Override
	public FlowNode next() {
		if(this.processModel==null) throw new IllegalAccessError("The process model must be set first.");
		FlowNode next = iterator.next();
		if(next instanceof SplitGateway){
			SplitGateway gateway = (SplitGateway)next;
			this.branchesPool.addAll(gateway.getBranches());
		}
		return next;
	}

	@Override
	public void remove() throws UnsupportedOperationException {
		throw new UnsupportedOperationException("This iterator does not permit to remove an element.");
	}

	@Override
	public void setProcessModel(ProcessModel model) {
		this.processModel = model;
		this.iterator = this.processModel.getMainBranch().getNodes().iterator();
	}

	@Override
	public void setStartNode(FlowNode start) throws UnsupportedOperationException{
		throw new UnsupportedOperationException("This iterator does not follow the control flow, thus it is useless to set the start event.");
	}

}
