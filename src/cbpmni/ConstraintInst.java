/**
 */
package cbpmni;

import cbpmn.OCLConstraint;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Inst</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cbpmni.ConstraintInst#getExtension <em>Extension</em>}</li>
 *   <li>{@link cbpmni.ConstraintInst#getConstraintDef <em>Constraint Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see cbpmni.CbpmniPackage#getConstraintInst()
 * @model
 * @generated
 */
public interface ConstraintInst extends EObject {
	/**
	 * Returns the value of the '<em><b>Extension</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' reference list.
	 * @see cbpmni.CbpmniPackage#getConstraintInst_Extension()
	 * @model
	 * @generated
	 */
	EList<EObject> getExtension();

	/**
	 * Returns the value of the '<em><b>Constraint Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Def</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Def</em>' reference.
	 * @see #setConstraintDef(OCLConstraint)
	 * @see cbpmni.CbpmniPackage#getConstraintInst_ConstraintDef()
	 * @model required="true"
	 * @generated
	 */
	OCLConstraint getConstraintDef();

	/**
	 * Sets the value of the '{@link cbpmni.ConstraintInst#getConstraintDef <em>Constraint Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Def</em>' reference.
	 * @see #getConstraintDef()
	 * @generated
	 */
	void setConstraintDef(OCLConstraint value);

} // ConstraintInst
