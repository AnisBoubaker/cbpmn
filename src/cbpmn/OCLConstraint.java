/**
 */
package cbpmn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cbpmn.OCLConstraint#getConstraintName <em>Constraint Name</em>}</li>
 *   <li>{@link cbpmn.OCLConstraint#getConstraintStr <em>Constraint Str</em>}</li>
 *   <li>{@link cbpmn.OCLConstraint#getBranch <em>Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @see cbpmn.CbpmnPackage#getOCLConstraint()
 * @model
 * @generated
 */
public interface OCLConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Name</em>' attribute.
	 * @see #setConstraintName(String)
	 * @see cbpmn.CbpmnPackage#getOCLConstraint_ConstraintName()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getConstraintName();

	/**
	 * Sets the value of the '{@link cbpmn.OCLConstraint#getConstraintName <em>Constraint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Name</em>' attribute.
	 * @see #getConstraintName()
	 * @generated
	 */
	void setConstraintName(String value);

	/**
	 * Returns the value of the '<em><b>Constraint Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Str</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Str</em>' attribute.
	 * @see #setConstraintStr(String)
	 * @see cbpmn.CbpmnPackage#getOCLConstraint_ConstraintStr()
	 * @model
	 * @generated
	 */
	String getConstraintStr();

	/**
	 * Sets the value of the '{@link cbpmn.OCLConstraint#getConstraintStr <em>Constraint Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Str</em>' attribute.
	 * @see #getConstraintStr()
	 * @generated
	 */
	void setConstraintStr(String value);

	/**
	 * Returns the value of the '<em><b>Branch</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link cbpmn.Branch#getEntryConditions <em>Entry Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch</em>' container reference.
	 * @see #setBranch(Branch)
	 * @see cbpmn.CbpmnPackage#getOCLConstraint_Branch()
	 * @see cbpmn.Branch#getEntryConditions
	 * @model opposite="entryConditions" transient="false"
	 * @generated
	 */
	Branch getBranch();

	/**
	 * Sets the value of the '{@link cbpmn.OCLConstraint#getBranch <em>Branch</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch</em>' container reference.
	 * @see #getBranch()
	 * @generated
	 */
	void setBranch(Branch value);

} // OCLConstraint
