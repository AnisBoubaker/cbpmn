/**
 */
package cbpmni;

import cbpmn.Branch;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch Inst</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cbpmni.BranchInst#getBranchDef <em>Branch Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see cbpmni.CbpmniPackage#getBranchInst()
 * @model
 * @generated
 */
public interface BranchInst extends EObject {
	/**
	 * Returns the value of the '<em><b>Branch Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch Def</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Def</em>' reference.
	 * @see #setBranchDef(Branch)
	 * @see cbpmni.CbpmniPackage#getBranchInst_BranchDef()
	 * @model
	 * @generated
	 */
	Branch getBranchDef();

	/**
	 * Sets the value of the '{@link cbpmni.BranchInst#getBranchDef <em>Branch Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch Def</em>' reference.
	 * @see #getBranchDef()
	 * @generated
	 */
	void setBranchDef(Branch value);

} // BranchInst
