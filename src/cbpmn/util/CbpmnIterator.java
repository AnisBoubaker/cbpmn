package cbpmn.util;

import java.util.Iterator;

import cbpmn.FlowNode;
import cbpmn.ProcessModel;
import cbpmn.StartEvent;

public interface CbpmnIterator extends Iterator<FlowNode> {

	public void setProcessModel(ProcessModel model);
	public void setStartNode(FlowNode start);
}
