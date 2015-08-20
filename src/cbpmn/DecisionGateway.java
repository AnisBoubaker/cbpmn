/**
 */
package cbpmn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cbpmn.DecisionGateway#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see cbpmn.CbpmnPackage#getDecisionGateway()
 * @model
 * @generated
 */
public interface DecisionGateway extends SplitGateway {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"EXCLUSIVE"</code>.
	 * The literals are from the enumeration {@link cbpmn.DecisionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see cbpmn.DecisionType
	 * @see #setType(DecisionType)
	 * @see cbpmn.CbpmnPackage#getDecisionGateway_Type()
	 * @model default="EXCLUSIVE"
	 * @generated
	 */
	DecisionType getType();

	/**
	 * Sets the value of the '{@link cbpmn.DecisionGateway#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see cbpmn.DecisionType
	 * @see #getType()
	 * @generated
	 */
	void setType(DecisionType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addBranchWithCondition(Branch branch, OCLConstraint condition, boolean default_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Branch getDefaultBranch();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Branch getRandomBranch();

} // DecisionGateway
