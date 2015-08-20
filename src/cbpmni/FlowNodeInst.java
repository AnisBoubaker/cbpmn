/**
 */
package cbpmni;

import cbpmn.FlowNode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Node Inst</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cbpmni.FlowNodeInst#getNodeDef <em>Node Def</em>}</li>
 *   <li>{@link cbpmni.FlowNodeInst#getStatus <em>Status</em>}</li>
 *   <li>{@link cbpmni.FlowNodeInst#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see cbpmni.CbpmniPackage#getFlowNodeInst()
 * @model abstract="true"
 * @generated
 */
public interface FlowNodeInst extends EObject {
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
	 * @see cbpmni.CbpmniPackage#getFlowNodeInst_NodeDef()
	 * @model
	 * @generated
	 */
	FlowNode getNodeDef();

	/**
	 * Sets the value of the '{@link cbpmni.FlowNodeInst#getNodeDef <em>Node Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Def</em>' reference.
	 * @see #getNodeDef()
	 * @generated
	 */
	void setNodeDef(FlowNode value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"INACTIVE"</code>.
	 * The literals are from the enumeration {@link cbpmni.FlowNodeStatusType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see cbpmni.FlowNodeStatusType
	 * @see #setStatus(FlowNodeStatusType)
	 * @see cbpmni.CbpmniPackage#getFlowNodeInst_Status()
	 * @model default="INACTIVE"
	 * @generated
	 */
	FlowNodeStatusType getStatus();

	/**
	 * Sets the value of the '{@link cbpmni.FlowNodeInst#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see cbpmni.FlowNodeStatusType
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(FlowNodeStatusType value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(FlowNodeInst)
	 * @see cbpmni.CbpmniPackage#getFlowNodeInst_Next()
	 * @model
	 * @generated
	 */
	FlowNodeInst getNext();

	/**
	 * Sets the value of the '{@link cbpmni.FlowNodeInst#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(FlowNodeInst value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void EOperation0();

} // FlowNodeInst
