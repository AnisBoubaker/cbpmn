/**
 */
package cbpmni;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cbpmni.CbpmniPackage
 * @generated
 */
public interface CbpmniFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CbpmniFactory eINSTANCE = cbpmni.impl.CbpmniFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Process Inst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Inst</em>'.
	 * @generated
	 */
	ProcessInst createProcessInst();

	/**
	 * Returns a new object of class '<em>Activity Inst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Inst</em>'.
	 * @generated
	 */
	ActivityInst createActivityInst();

	/**
	 * Returns a new object of class '<em>Event Inst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Inst</em>'.
	 * @generated
	 */
	EventInst createEventInst();

	/**
	 * Returns a new object of class '<em>Split Inst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Split Inst</em>'.
	 * @generated
	 */
	SplitInst createSplitInst();

	/**
	 * Returns a new object of class '<em>Branch Inst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Branch Inst</em>'.
	 * @generated
	 */
	BranchInst createBranchInst();

	/**
	 * Returns a new object of class '<em>Constraint Inst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint Inst</em>'.
	 * @generated
	 */
	ConstraintInst createConstraintInst();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CbpmniPackage getCbpmniPackage();

} //CbpmniFactory
