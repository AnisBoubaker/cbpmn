/**
 */
package cbpmn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cbpmn.Branch#getNodes <em>Nodes</em>}</li>
 *   <li>{@link cbpmn.Branch#isDefault <em>Default</em>}</li>
 *   <li>{@link cbpmn.Branch#getEntryConditions <em>Entry Conditions</em>}</li>
 *   <li>{@link cbpmn.Branch#getGateway <em>Gateway</em>}</li>
 * </ul>
 * </p>
 *
 * @see cbpmn.CbpmnPackage#getBranch()
 * @model
 * @generated
 */
public interface Branch extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link cbpmn.FlowNode}.
	 * It is bidirectional and its opposite is '{@link cbpmn.FlowNode#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see cbpmn.CbpmnPackage#getBranch_Nodes()
	 * @see cbpmn.FlowNode#getBranch
	 * @model opposite="branch" containment="true" required="true"
	 * @generated
	 */
	EList<FlowNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(boolean)
	 * @see cbpmn.CbpmnPackage#getBranch_Default()
	 * @model
	 * @generated
	 */
	boolean isDefault();

	/**
	 * Sets the value of the '{@link cbpmn.Branch#isDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #isDefault()
	 * @generated
	 */
	void setDefault(boolean value);

	/**
	 * Returns the value of the '<em><b>Entry Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link cbpmn.OCLConstraint}.
	 * It is bidirectional and its opposite is '{@link cbpmn.OCLConstraint#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Conditions</em>' containment reference list.
	 * @see cbpmn.CbpmnPackage#getBranch_EntryConditions()
	 * @see cbpmn.OCLConstraint#getBranch
	 * @model opposite="branch" containment="true"
	 * @generated
	 */
	EList<OCLConstraint> getEntryConditions();

	/**
	 * Returns the value of the '<em><b>Gateway</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cbpmn.SplitGateway#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateway</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway</em>' container reference.
	 * @see #setGateway(SplitGateway)
	 * @see cbpmn.CbpmnPackage#getBranch_Gateway()
	 * @see cbpmn.SplitGateway#getBranches
	 * @model opposite="branches" transient="false"
	 * @generated
	 */
	SplitGateway getGateway();

	/**
	 * Sets the value of the '{@link cbpmn.Branch#getGateway <em>Gateway</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway</em>' container reference.
	 * @see #getGateway()
	 * @generated
	 */
	void setGateway(SplitGateway value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	FlowNode getFirstNode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	FlowNode getLastNode();

} // Branch
