/**
 */
package cbpmni.impl;

import cbpmn.FlowNode;

import cbpmni.CbpmniPackage;
import cbpmni.FlowNodeInst;
import cbpmni.FlowNodeStatusType;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Node Inst</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cbpmni.impl.FlowNodeInstImpl#getNodeDef <em>Node Def</em>}</li>
 *   <li>{@link cbpmni.impl.FlowNodeInstImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link cbpmni.impl.FlowNodeInstImpl#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FlowNodeInstImpl extends MinimalEObjectImpl.Container implements FlowNodeInst {
	/**
	 * The cached value of the '{@link #getNodeDef() <em>Node Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeDef()
	 * @generated
	 * @ordered
	 */
	protected FlowNode nodeDef;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final FlowNodeStatusType STATUS_EDEFAULT = FlowNodeStatusType.INACTIVE;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected FlowNodeStatusType status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected FlowNodeInst next;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowNodeInstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CbpmniPackage.Literals.FLOW_NODE_INST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode getNodeDef() {
		if (nodeDef != null && nodeDef.eIsProxy()) {
			InternalEObject oldNodeDef = (InternalEObject)nodeDef;
			nodeDef = (FlowNode)eResolveProxy(oldNodeDef);
			if (nodeDef != oldNodeDef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CbpmniPackage.FLOW_NODE_INST__NODE_DEF, oldNodeDef, nodeDef));
			}
		}
		return nodeDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode basicGetNodeDef() {
		return nodeDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeDef(FlowNode newNodeDef) {
		FlowNode oldNodeDef = nodeDef;
		nodeDef = newNodeDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmniPackage.FLOW_NODE_INST__NODE_DEF, oldNodeDef, nodeDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNodeStatusType getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(FlowNodeStatusType newStatus) {
		FlowNodeStatusType oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmniPackage.FLOW_NODE_INST__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNodeInst getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (FlowNodeInst)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CbpmniPackage.FLOW_NODE_INST__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNodeInst basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(FlowNodeInst newNext) {
		FlowNodeInst oldNext = next;
		next = newNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmniPackage.FLOW_NODE_INST__NEXT, oldNext, next));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void EOperation0() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CbpmniPackage.FLOW_NODE_INST__NODE_DEF:
				if (resolve) return getNodeDef();
				return basicGetNodeDef();
			case CbpmniPackage.FLOW_NODE_INST__STATUS:
				return getStatus();
			case CbpmniPackage.FLOW_NODE_INST__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
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
			case CbpmniPackage.FLOW_NODE_INST__NODE_DEF:
				setNodeDef((FlowNode)newValue);
				return;
			case CbpmniPackage.FLOW_NODE_INST__STATUS:
				setStatus((FlowNodeStatusType)newValue);
				return;
			case CbpmniPackage.FLOW_NODE_INST__NEXT:
				setNext((FlowNodeInst)newValue);
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
			case CbpmniPackage.FLOW_NODE_INST__NODE_DEF:
				setNodeDef((FlowNode)null);
				return;
			case CbpmniPackage.FLOW_NODE_INST__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case CbpmniPackage.FLOW_NODE_INST__NEXT:
				setNext((FlowNodeInst)null);
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
			case CbpmniPackage.FLOW_NODE_INST__NODE_DEF:
				return nodeDef != null;
			case CbpmniPackage.FLOW_NODE_INST__STATUS:
				return status != STATUS_EDEFAULT;
			case CbpmniPackage.FLOW_NODE_INST__NEXT:
				return next != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CbpmniPackage.FLOW_NODE_INST___EOPERATION0:
				EOperation0();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //FlowNodeInstImpl
