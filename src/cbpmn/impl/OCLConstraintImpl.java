/**
 */
package cbpmn.impl;

import cbpmn.Branch;
import cbpmn.CbpmnPackage;
import cbpmn.OCLConstraint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cbpmn.impl.OCLConstraintImpl#getConstraintName <em>Constraint Name</em>}</li>
 *   <li>{@link cbpmn.impl.OCLConstraintImpl#getConstraintStr <em>Constraint Str</em>}</li>
 *   <li>{@link cbpmn.impl.OCLConstraintImpl#getBranch <em>Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OCLConstraintImpl extends MinimalEObjectImpl.Container implements OCLConstraint {
	/**
	 * The default value of the '{@link #getConstraintName() <em>Constraint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraintName() <em>Constraint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintName()
	 * @generated
	 * @ordered
	 */
	protected String constraintName = CONSTRAINT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstraintStr() <em>Constraint Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintStr()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_STR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraintStr() <em>Constraint Str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintStr()
	 * @generated
	 * @ordered
	 */
	protected String constraintStr = CONSTRAINT_STR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CbpmnPackage.Literals.OCL_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraintName() {
		return constraintName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintName(String newConstraintName) {
		String oldConstraintName = constraintName;
		constraintName = newConstraintName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmnPackage.OCL_CONSTRAINT__CONSTRAINT_NAME, oldConstraintName, constraintName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraintStr() {
		return constraintStr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintStr(String newConstraintStr) {
		String oldConstraintStr = constraintStr;
		constraintStr = newConstraintStr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmnPackage.OCL_CONSTRAINT__CONSTRAINT_STR, oldConstraintStr, constraintStr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch getBranch() {
		if (eContainerFeatureID() != CbpmnPackage.OCL_CONSTRAINT__BRANCH) return null;
		return (Branch)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBranch(Branch newBranch, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBranch, CbpmnPackage.OCL_CONSTRAINT__BRANCH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBranch(Branch newBranch) {
		if (newBranch != eInternalContainer() || (eContainerFeatureID() != CbpmnPackage.OCL_CONSTRAINT__BRANCH && newBranch != null)) {
			if (EcoreUtil.isAncestor(this, newBranch))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBranch != null)
				msgs = ((InternalEObject)newBranch).eInverseAdd(this, CbpmnPackage.BRANCH__ENTRY_CONDITIONS, Branch.class, msgs);
			msgs = basicSetBranch(newBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmnPackage.OCL_CONSTRAINT__BRANCH, newBranch, newBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CbpmnPackage.OCL_CONSTRAINT__BRANCH:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBranch((Branch)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CbpmnPackage.OCL_CONSTRAINT__BRANCH:
				return basicSetBranch(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CbpmnPackage.OCL_CONSTRAINT__BRANCH:
				return eInternalContainer().eInverseRemove(this, CbpmnPackage.BRANCH__ENTRY_CONDITIONS, Branch.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CbpmnPackage.OCL_CONSTRAINT__CONSTRAINT_NAME:
				return getConstraintName();
			case CbpmnPackage.OCL_CONSTRAINT__CONSTRAINT_STR:
				return getConstraintStr();
			case CbpmnPackage.OCL_CONSTRAINT__BRANCH:
				return getBranch();
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
			case CbpmnPackage.OCL_CONSTRAINT__CONSTRAINT_NAME:
				setConstraintName((String)newValue);
				return;
			case CbpmnPackage.OCL_CONSTRAINT__CONSTRAINT_STR:
				setConstraintStr((String)newValue);
				return;
			case CbpmnPackage.OCL_CONSTRAINT__BRANCH:
				setBranch((Branch)newValue);
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
			case CbpmnPackage.OCL_CONSTRAINT__CONSTRAINT_NAME:
				setConstraintName(CONSTRAINT_NAME_EDEFAULT);
				return;
			case CbpmnPackage.OCL_CONSTRAINT__CONSTRAINT_STR:
				setConstraintStr(CONSTRAINT_STR_EDEFAULT);
				return;
			case CbpmnPackage.OCL_CONSTRAINT__BRANCH:
				setBranch((Branch)null);
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
			case CbpmnPackage.OCL_CONSTRAINT__CONSTRAINT_NAME:
				return CONSTRAINT_NAME_EDEFAULT == null ? constraintName != null : !CONSTRAINT_NAME_EDEFAULT.equals(constraintName);
			case CbpmnPackage.OCL_CONSTRAINT__CONSTRAINT_STR:
				return CONSTRAINT_STR_EDEFAULT == null ? constraintStr != null : !CONSTRAINT_STR_EDEFAULT.equals(constraintStr);
			case CbpmnPackage.OCL_CONSTRAINT__BRANCH:
				return getBranch() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (constraintName: ");
		result.append(constraintName);
		result.append(", constraintStr: ");
		result.append(constraintStr);
		result.append(')');
		return result.toString();
	}

} //OCLConstraintImpl
