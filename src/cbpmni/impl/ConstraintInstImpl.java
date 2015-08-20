/**
 */
package cbpmni.impl;

import cbpmn.OCLConstraint;

import cbpmni.CbpmniPackage;
import cbpmni.ConstraintInst;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Inst</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cbpmni.impl.ConstraintInstImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link cbpmni.impl.ConstraintInstImpl#getConstraintDef <em>Constraint Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintInstImpl extends MinimalEObjectImpl.Container implements ConstraintInst {
	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> extension;

	/**
	 * The cached value of the '{@link #getConstraintDef() <em>Constraint Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintDef()
	 * @generated
	 * @ordered
	 */
	protected OCLConstraint constraintDef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintInstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CbpmniPackage.Literals.CONSTRAINT_INST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getExtension() {
		if (extension == null) {
			extension = new EObjectResolvingEList<EObject>(EObject.class, this, CbpmniPackage.CONSTRAINT_INST__EXTENSION);
		}
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLConstraint getConstraintDef() {
		if (constraintDef != null && constraintDef.eIsProxy()) {
			InternalEObject oldConstraintDef = (InternalEObject)constraintDef;
			constraintDef = (OCLConstraint)eResolveProxy(oldConstraintDef);
			if (constraintDef != oldConstraintDef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CbpmniPackage.CONSTRAINT_INST__CONSTRAINT_DEF, oldConstraintDef, constraintDef));
			}
		}
		return constraintDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLConstraint basicGetConstraintDef() {
		return constraintDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintDef(OCLConstraint newConstraintDef) {
		OCLConstraint oldConstraintDef = constraintDef;
		constraintDef = newConstraintDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmniPackage.CONSTRAINT_INST__CONSTRAINT_DEF, oldConstraintDef, constraintDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CbpmniPackage.CONSTRAINT_INST__EXTENSION:
				return getExtension();
			case CbpmniPackage.CONSTRAINT_INST__CONSTRAINT_DEF:
				if (resolve) return getConstraintDef();
				return basicGetConstraintDef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CbpmniPackage.CONSTRAINT_INST__EXTENSION:
				getExtension().clear();
				getExtension().addAll((Collection<? extends EObject>)newValue);
				return;
			case CbpmniPackage.CONSTRAINT_INST__CONSTRAINT_DEF:
				setConstraintDef((OCLConstraint)newValue);
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
			case CbpmniPackage.CONSTRAINT_INST__EXTENSION:
				getExtension().clear();
				return;
			case CbpmniPackage.CONSTRAINT_INST__CONSTRAINT_DEF:
				setConstraintDef((OCLConstraint)null);
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
			case CbpmniPackage.CONSTRAINT_INST__EXTENSION:
				return extension != null && !extension.isEmpty();
			case CbpmniPackage.CONSTRAINT_INST__CONSTRAINT_DEF:
				return constraintDef != null;
		}
		return super.eIsSet(featureID);
	}

} //ConstraintInstImpl
