/**
 */
package cbpmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cbpmn.Activity#getPreConditions <em>Pre Conditions</em>}</li>
 *   <li>{@link cbpmn.Activity#getPostConditions <em>Post Conditions</em>}</li>
 *   <li>{@link cbpmn.Activity#getType <em>Type</em>}</li>
 *   <li>{@link cbpmn.Activity#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link cbpmn.Activity#getInvariabilityClauses <em>Invariability Clauses</em>}</li>
 * </ul>
 * </p>
 *
 * @see cbpmn.CbpmnPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends FlowNode {
	/**
	 * Returns the value of the '<em><b>Pre Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link cbpmn.OCLConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Conditions</em>' containment reference list.
	 * @see cbpmn.CbpmnPackage#getActivity_PreConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<OCLConstraint> getPreConditions();

	/**
	 * Returns the value of the '<em><b>Post Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link cbpmn.OCLConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Conditions</em>' containment reference list.
	 * @see cbpmn.CbpmnPackage#getActivity_PostConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<OCLConstraint> getPostConditions();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link cbpmn.ActivityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see cbpmn.ActivityType
	 * @see #setType(ActivityType)
	 * @see cbpmn.CbpmnPackage#getActivity_Type()
	 * @model
	 * @generated
	 */
	ActivityType getType();

	/**
	 * Sets the value of the '{@link cbpmn.Activity#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see cbpmn.ActivityType
	 * @see #getType()
	 * @generated
	 */
	void setType(ActivityType value);

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link cbpmn.DataObjectReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see cbpmn.CbpmnPackage#getActivity_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataObjectReference> getOutputs();

	/**
	 * Returns the value of the '<em><b>Invariability Clauses</b></em>' containment reference list.
	 * The list contents are of type {@link cbpmn.OCLConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invariability Clauses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invariability Clauses</em>' containment reference list.
	 * @see cbpmn.CbpmnPackage#getActivity_InvariabilityClauses()
	 * @model containment="true"
	 * @generated
	 */
	EList<OCLConstraint> getInvariabilityClauses();

} // Activity
