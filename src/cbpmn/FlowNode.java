/**
 */
package cbpmn;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cbpmn.FlowNode#getBranch <em>Branch</em>}</li>
 *   <li>{@link cbpmn.FlowNode#getName <em>Name</em>}</li>
 *   <li>{@link cbpmn.FlowNode#getNext <em>Next</em>}</li>
 *   <li>{@link cbpmn.FlowNode#getPrevious <em>Previous</em>}</li>
 *   <li>{@link cbpmn.FlowNode#getInputs <em>Inputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see cbpmn.CbpmnPackage#getFlowNode()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface FlowNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Branch</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cbpmn.Branch#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch</em>' container reference.
	 * @see #setBranch(Branch)
	 * @see cbpmn.CbpmnPackage#getFlowNode_Branch()
	 * @see cbpmn.Branch#getNodes
	 * @model opposite="nodes" transient="false"
	 * @generated
	 */
	Branch getBranch();

	/**
	 * Sets the value of the '{@link cbpmn.FlowNode#getBranch <em>Branch</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch</em>' container reference.
	 * @see #getBranch()
	 * @generated
	 */
	void setBranch(Branch value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cbpmn.FlowNode#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(FlowNode)
	 * @see cbpmn.CbpmnPackage#getFlowNode_Next()
	 * @see cbpmn.FlowNode#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	FlowNode getNext();

	/**
	 * Sets the value of the '{@link cbpmn.FlowNode#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(FlowNode value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cbpmn.FlowNode#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(FlowNode)
	 * @see cbpmn.CbpmnPackage#getFlowNode_Previous()
	 * @see cbpmn.FlowNode#getNext
	 * @model opposite="next"
	 * @generated
	 */
	FlowNode getPrevious();

	/**
	 * Sets the value of the '{@link cbpmn.FlowNode#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(FlowNode value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link cbpmn.DataObjectReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see cbpmn.CbpmnPackage#getFlowNode_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataObjectReference> getInputs();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cbpmn.CbpmnPackage#getFlowNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cbpmn.FlowNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // FlowNode
