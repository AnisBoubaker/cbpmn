/**
 */
package cbpmn.impl;

import cbpmn.CbpmnPackage;
import cbpmn.FlowNode;
import cbpmn.FlowNodeInstance;
import cbpmn.FlowNodeInstanceStatus;
import cbpmn.ProcessInstance;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Node Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cbpmn.impl.FlowNodeInstanceImpl#getNodeDef <em>Node Def</em>}</li>
 *   <li>{@link cbpmn.impl.FlowNodeInstanceImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link cbpmn.impl.FlowNodeInstanceImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link cbpmn.impl.FlowNodeInstanceImpl#getProcessInstance <em>Process Instance</em>}</li>
 *   <li>{@link cbpmn.impl.FlowNodeInstanceImpl#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowNodeInstanceImpl extends MinimalEObjectImpl.Container implements FlowNodeInstance {
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
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> outputs;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final FlowNodeInstanceStatus STATUS_EDEFAULT = FlowNodeInstanceStatus.SUCCESS;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected FlowNodeInstanceStatus status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowNodeInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CbpmnPackage.Literals.FLOW_NODE_INSTANCE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CbpmnPackage.FLOW_NODE_INSTANCE__NODE_DEF, oldNodeDef, nodeDef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmnPackage.FLOW_NODE_INSTANCE__NODE_DEF, oldNodeDef, nodeDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getInputs() {
		if (inputs == null) {
			inputs = new EObjectResolvingEList<EObject>(EObject.class, this, CbpmnPackage.FLOW_NODE_INSTANCE__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectResolvingEList<EObject>(EObject.class, this, CbpmnPackage.FLOW_NODE_INSTANCE__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessInstance getProcessInstance() {
		if (eContainerFeatureID() != CbpmnPackage.FLOW_NODE_INSTANCE__PROCESS_INSTANCE) return null;
		return (ProcessInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessInstance(ProcessInstance newProcessInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProcessInstance, CbpmnPackage.FLOW_NODE_INSTANCE__PROCESS_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessInstance(ProcessInstance newProcessInstance) {
		if (newProcessInstance != eInternalContainer() || (eContainerFeatureID() != CbpmnPackage.FLOW_NODE_INSTANCE__PROCESS_INSTANCE && newProcessInstance != null)) {
			if (EcoreUtil.isAncestor(this, newProcessInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProcessInstance != null)
				msgs = ((InternalEObject)newProcessInstance).eInverseAdd(this, CbpmnPackage.PROCESS_INSTANCE__EXECUTED_NODES, ProcessInstance.class, msgs);
			msgs = basicSetProcessInstance(newProcessInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmnPackage.FLOW_NODE_INSTANCE__PROCESS_INSTANCE, newProcessInstance, newProcessInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNodeInstanceStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(FlowNodeInstanceStatus newStatus) {
		FlowNodeInstanceStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmnPackage.FLOW_NODE_INSTANCE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CbpmnPackage.FLOW_NODE_INSTANCE__PROCESS_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProcessInstance((ProcessInstance)otherEnd, msgs);
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
			case CbpmnPackage.FLOW_NODE_INSTANCE__PROCESS_INSTANCE:
				return basicSetProcessInstance(null, msgs);
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
			case CbpmnPackage.FLOW_NODE_INSTANCE__PROCESS_INSTANCE:
				return eInternalContainer().eInverseRemove(this, CbpmnPackage.PROCESS_INSTANCE__EXECUTED_NODES, ProcessInstance.class, msgs);
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
			case CbpmnPackage.FLOW_NODE_INSTANCE__NODE_DEF:
				if (resolve) return getNodeDef();
				return basicGetNodeDef();
			case CbpmnPackage.FLOW_NODE_INSTANCE__INPUTS:
				return getInputs();
			case CbpmnPackage.FLOW_NODE_INSTANCE__OUTPUTS:
				return getOutputs();
			case CbpmnPackage.FLOW_NODE_INSTANCE__PROCESS_INSTANCE:
				return getProcessInstance();
			case CbpmnPackage.FLOW_NODE_INSTANCE__STATUS:
				return getStatus();
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
			case CbpmnPackage.FLOW_NODE_INSTANCE__NODE_DEF:
				setNodeDef((FlowNode)newValue);
				return;
			case CbpmnPackage.FLOW_NODE_INSTANCE__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends EObject>)newValue);
				return;
			case CbpmnPackage.FLOW_NODE_INSTANCE__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends EObject>)newValue);
				return;
			case CbpmnPackage.FLOW_NODE_INSTANCE__PROCESS_INSTANCE:
				setProcessInstance((ProcessInstance)newValue);
				return;
			case CbpmnPackage.FLOW_NODE_INSTANCE__STATUS:
				setStatus((FlowNodeInstanceStatus)newValue);
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
			case CbpmnPackage.FLOW_NODE_INSTANCE__NODE_DEF:
				setNodeDef((FlowNode)null);
				return;
			case CbpmnPackage.FLOW_NODE_INSTANCE__INPUTS:
				getInputs().clear();
				return;
			case CbpmnPackage.FLOW_NODE_INSTANCE__OUTPUTS:
				getOutputs().clear();
				return;
			case CbpmnPackage.FLOW_NODE_INSTANCE__PROCESS_INSTANCE:
				setProcessInstance((ProcessInstance)null);
				return;
			case CbpmnPackage.FLOW_NODE_INSTANCE__STATUS:
				setStatus(STATUS_EDEFAULT);
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
			case CbpmnPackage.FLOW_NODE_INSTANCE__NODE_DEF:
				return nodeDef != null;
			case CbpmnPackage.FLOW_NODE_INSTANCE__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case CbpmnPackage.FLOW_NODE_INSTANCE__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case CbpmnPackage.FLOW_NODE_INSTANCE__PROCESS_INSTANCE:
				return getProcessInstance() != null;
			case CbpmnPackage.FLOW_NODE_INSTANCE__STATUS:
				return status != STATUS_EDEFAULT;
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
		result.append(" (status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //FlowNodeInstanceImpl
