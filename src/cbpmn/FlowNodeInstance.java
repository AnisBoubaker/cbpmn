/**
 */
package cbpmn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Node Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cbpmn.FlowNodeInstance#getNodeDef <em>Node Def</em>}</li>
 *   <li>{@link cbpmn.FlowNodeInstance#getInputs <em>Inputs</em>}</li>
 *   <li>{@link cbpmn.FlowNodeInstance#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link cbpmn.FlowNodeInstance#getProcessInstance <em>Process Instance</em>}</li>
 *   <li>{@link cbpmn.FlowNodeInstance#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see cbpmn.CbpmnPackage#getFlowNodeInstance()
 * @model
 * @generated
 */
public interface FlowNodeInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Def</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Def</em>' reference.
	 * @see #setNodeDef(FlowNode)
	 * @see cbpmn.CbpmnPackage#getFlowNodeInstance_NodeDef()
	 * @model required="true"
	 * @generated
	 */
	FlowNode getNodeDef();

	/**
	 * Sets the value of the '{@link cbpmn.FlowNodeInstance#getNodeDef <em>Node Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Def</em>' reference.
	 * @see #getNodeDef()
	 * @generated
	 */
	void setNodeDef(FlowNode value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see cbpmn.CbpmnPackage#getFlowNodeInstance_Inputs()
	 * @model
	 * @generated
	 */
	EList<EObject> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' reference list.
	 * @see cbpmn.CbpmnPackage#getFlowNodeInstance_Outputs()
	 * @model
	 * @generated
	 */
	EList<EObject> getOutputs();

	/**
	 * Returns the value of the '<em><b>Process Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cbpmn.ProcessInstance#getExecutedNodes <em>Executed Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Instance</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Instance</em>' container reference.
	 * @see #setProcessInstance(ProcessInstance)
	 * @see cbpmn.CbpmnPackage#getFlowNodeInstance_ProcessInstance()
	 * @see cbpmn.ProcessInstance#getExecutedNodes
	 * @model opposite="executedNodes" required="true" transient="false"
	 * @generated
	 */
	ProcessInstance getProcessInstance();

	/**
	 * Sets the value of the '{@link cbpmn.FlowNodeInstance#getProcessInstance <em>Process Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Instance</em>' container reference.
	 * @see #getProcessInstance()
	 * @generated
	 */
	void setProcessInstance(ProcessInstance value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"SUCCESS"</code>.
	 * The literals are from the enumeration {@link cbpmn.FlowNodeInstanceStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see cbpmn.FlowNodeInstanceStatus
	 * @see #setStatus(FlowNodeInstanceStatus)
	 * @see cbpmn.CbpmnPackage#getFlowNodeInstance_Status()
	 * @model default="SUCCESS"
	 * @generated
	 */
	FlowNodeInstanceStatus getStatus();

	/**
	 * Sets the value of the '{@link cbpmn.FlowNodeInstance#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see cbpmn.FlowNodeInstanceStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(FlowNodeInstanceStatus value);

} // FlowNodeInstance
