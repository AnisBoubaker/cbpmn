/**
 */
package cbpmni;

import cbpmn.ProcessModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Inst</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cbpmni.ProcessInst#getProcessDef <em>Process Def</em>}</li>
 *   <li>{@link cbpmni.ProcessInst#getTokens <em>Tokens</em>}</li>
 *   <li>{@link cbpmni.ProcessInst#getFlowNodes <em>Flow Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see cbpmni.CbpmniPackage#getProcessInst()
 * @model
 * @generated
 */
public interface ProcessInst extends EObject {
	/**
	 * Returns the value of the '<em><b>Process Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Def</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Def</em>' reference.
	 * @see #setProcessDef(ProcessModel)
	 * @see cbpmni.CbpmniPackage#getProcessInst_ProcessDef()
	 * @model
	 * @generated
	 */
	ProcessModel getProcessDef();

	/**
	 * Sets the value of the '{@link cbpmni.ProcessInst#getProcessDef <em>Process Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Def</em>' reference.
	 * @see #getProcessDef()
	 * @generated
	 */
	void setProcessDef(ProcessModel value);

	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' reference list.
	 * The list contents are of type {@link cbpmni.FlowNodeInst}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' reference list.
	 * @see cbpmni.CbpmniPackage#getProcessInst_Tokens()
	 * @model
	 * @generated
	 */
	EList<FlowNodeInst> getTokens();

	/**
	 * Returns the value of the '<em><b>Flow Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link cbpmni.FlowNodeInst}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Nodes</em>' containment reference list.
	 * @see cbpmni.CbpmniPackage#getProcessInst_FlowNodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlowNodeInst> getFlowNodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setupProcessInstance();

} // ProcessInst
