/**
 */
package cbpmni.impl;

import cbpmn.Branch;

import cbpmni.BranchInst;
import cbpmni.CbpmniPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch Inst</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cbpmni.impl.BranchInstImpl#getBranchDef <em>Branch Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BranchInstImpl extends MinimalEObjectImpl.Container implements BranchInst {
	/**
	 * The cached value of the '{@link #getBranchDef() <em>Branch Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchDef()
	 * @generated
	 * @ordered
	 */
	protected Branch branchDef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchInstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CbpmniPackage.Literals.BRANCH_INST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch getBranchDef() {
		if (branchDef != null && branchDef.eIsProxy()) {
			InternalEObject oldBranchDef = (InternalEObject)branchDef;
			branchDef = (Branch)eResolveProxy(oldBranchDef);
			if (branchDef != oldBranchDef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CbpmniPackage.BRANCH_INST__BRANCH_DEF, oldBranchDef, branchDef));
			}
		}
		return branchDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch basicGetBranchDef() {
		return branchDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBranchDef(Branch newBranchDef) {
		Branch oldBranchDef = branchDef;
		branchDef = newBranchDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmniPackage.BRANCH_INST__BRANCH_DEF, oldBranchDef, branchDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CbpmniPackage.BRANCH_INST__BRANCH_DEF:
				if (resolve) return getBranchDef();
				return basicGetBranchDef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CbpmniPackage.BRANCH_INST__BRANCH_DEF:
				setBranchDef((Branch)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CbpmniPackage.BRANCH_INST__BRANCH_DEF:
				setBranchDef((Branch)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CbpmniPackage.BRANCH_INST__BRANCH_DEF:
				return branchDef != null;
		}
		return super.eIsSet(featureID);
	}

} //BranchInstImpl
