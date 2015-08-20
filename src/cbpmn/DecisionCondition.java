/**
 */
package cbpmn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cbpmn.DecisionCondition#isIsDefault <em>Is Default</em>}</li>
 *   <li>{@link cbpmn.DecisionCondition#getBranch <em>Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @see cbpmn.CbpmnPackage#getDecisionCondition()
 * @model
 * @generated
 */
public interface DecisionCondition extends OCLConstraint {
	/**
	 * Returns the value of the '<em><b>Branch</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cbpmn.Branch#getEntryConditions <em>Entry Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch</em>' container reference.
	 * @see #setBranch(Branch)
	 * @see cbpmn.CbpmnPackage#getDecisionCondition_Branch()
	 * @see cbpmn.Branch#getEntryConditions
	 * @model opposite="entryConditions" required="true" transient="false"
	 * @generated
	 */
	Branch getBranch();

	/**
	 * Sets the value of the '{@link cbpmn.DecisionCondition#getBranch <em>Branch</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch</em>' container reference.
	 * @see #getBranch()
	 * @generated
	 */
	void setBranch(Branch value);

	/**
	 * Returns the value of the '<em><b>Is Default</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default</em>' attribute.
	 * @see #setIsDefault(boolean)
	 * @see cbpmn.CbpmnPackage#getDecisionCondition_IsDefault()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsDefault();

	/**
	 * Sets the value of the '{@link cbpmn.DecisionCondition#isIsDefault <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default</em>' attribute.
	 * @see #isIsDefault()
	 * @generated
	 */
	void setIsDefault(boolean value);

} // DecisionCondition
