/**
 */
package cbpmn.impl;

import cbpmn.CbpmnPackage;
import cbpmn.DataObjectReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Object Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cbpmn.impl.DataObjectReferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link cbpmn.impl.DataObjectReferenceImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link cbpmn.impl.DataObjectReferenceImpl#getHigherBound <em>Higher Bound</em>}</li>
 *   <li>{@link cbpmn.impl.DataObjectReferenceImpl#getDataObjectClass <em>Data Object Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataObjectReferenceImpl extends MinimalEObjectImpl.Container implements DataObjectReference {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected int lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getHigherBound() <em>Higher Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigherBound()
	 * @generated
	 * @ordered
	 */
	protected static final int HIGHER_BOUND_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getHigherBound() <em>Higher Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigherBound()
	 * @generated
	 * @ordered
	 */
	protected int higherBound = HIGHER_BOUND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataObjectClass() <em>Data Object Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataObjectClass()
	 * @generated
	 * @ordered
	 */
	protected EClass dataObjectClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataObjectReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CbpmnPackage.Literals.DATA_OBJECT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmnPackage.DATA_OBJECT_REFERENCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(int newLowerBound) {
		int oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmnPackage.DATA_OBJECT_REFERENCE__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHigherBound() {
		return higherBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHigherBound(int newHigherBound) {
		int oldHigherBound = higherBound;
		higherBound = newHigherBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmnPackage.DATA_OBJECT_REFERENCE__HIGHER_BOUND, oldHigherBound, higherBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataObjectClass() {
		if (dataObjectClass != null && dataObjectClass.eIsProxy()) {
			InternalEObject oldDataObjectClass = (InternalEObject)dataObjectClass;
			dataObjectClass = (EClass)eResolveProxy(oldDataObjectClass);
			if (dataObjectClass != oldDataObjectClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CbpmnPackage.DATA_OBJECT_REFERENCE__DATA_OBJECT_CLASS, oldDataObjectClass, dataObjectClass));
			}
		}
		return dataObjectClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetDataObjectClass() {
		return dataObjectClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataObjectClass(EClass newDataObjectClass) {
		EClass oldDataObjectClass = dataObjectClass;
		dataObjectClass = newDataObjectClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmnPackage.DATA_OBJECT_REFERENCE__DATA_OBJECT_CLASS, oldDataObjectClass, dataObjectClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CbpmnPackage.DATA_OBJECT_REFERENCE__NAME:
				return getName();
			case CbpmnPackage.DATA_OBJECT_REFERENCE__LOWER_BOUND:
				return getLowerBound();
			case CbpmnPackage.DATA_OBJECT_REFERENCE__HIGHER_BOUND:
				return getHigherBound();
			case CbpmnPackage.DATA_OBJECT_REFERENCE__DATA_OBJECT_CLASS:
				if (resolve) return getDataObjectClass();
				return basicGetDataObjectClass();
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
			case CbpmnPackage.DATA_OBJECT_REFERENCE__NAME:
				setName((String)newValue);
				return;
			case CbpmnPackage.DATA_OBJECT_REFERENCE__LOWER_BOUND:
				setLowerBound((Integer)newValue);
				return;
			case CbpmnPackage.DATA_OBJECT_REFERENCE__HIGHER_BOUND:
				setHigherBound((Integer)newValue);
				return;
			case CbpmnPackage.DATA_OBJECT_REFERENCE__DATA_OBJECT_CLASS:
				setDataObjectClass((EClass)newValue);
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
			case CbpmnPackage.DATA_OBJECT_REFERENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CbpmnPackage.DATA_OBJECT_REFERENCE__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case CbpmnPackage.DATA_OBJECT_REFERENCE__HIGHER_BOUND:
				setHigherBound(HIGHER_BOUND_EDEFAULT);
				return;
			case CbpmnPackage.DATA_OBJECT_REFERENCE__DATA_OBJECT_CLASS:
				setDataObjectClass((EClass)null);
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
			case CbpmnPackage.DATA_OBJECT_REFERENCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CbpmnPackage.DATA_OBJECT_REFERENCE__LOWER_BOUND:
				return lowerBound != LOWER_BOUND_EDEFAULT;
			case CbpmnPackage.DATA_OBJECT_REFERENCE__HIGHER_BOUND:
				return higherBound != HIGHER_BOUND_EDEFAULT;
			case CbpmnPackage.DATA_OBJECT_REFERENCE__DATA_OBJECT_CLASS:
				return dataObjectClass != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", lowerBound: ");
		result.append(lowerBound);
		result.append(", higherBound: ");
		result.append(higherBound);
		result.append(')');
		return result.toString();
	}

} //DataObjectReferenceImpl
