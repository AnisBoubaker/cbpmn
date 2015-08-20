/**
 */
package cbpmn.impl;

import cbpmn.CbpmnPackage;
import cbpmn.FlowNodeInstance;
import cbpmn.ProcessInstance;
import cbpmn.ProcessModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cbpmn.impl.ProcessInstanceImpl#getProcessModel <em>Process Model</em>}</li>
 *   <li>{@link cbpmn.impl.ProcessInstanceImpl#getExecutedNodes <em>Executed Nodes</em>}</li>
 *   <li>{@link cbpmn.impl.ProcessInstanceImpl#getId <em>Id</em>}</li>
 *   <li>{@link cbpmn.impl.ProcessInstanceImpl#getDataObjects <em>Data Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessInstanceImpl extends MinimalEObjectImpl.Container implements ProcessInstance {
	/**
	 * The cached value of the '{@link #getProcessModel() <em>Process Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessModel()
	 * @generated
	 * @ordered
	 */
	protected ProcessModel processModel;

	/**
	 * The cached value of the '{@link #getExecutedNodes() <em>Executed Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutedNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowNodeInstance> executedNodes;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataObjects() <em>Data Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> dataObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CbpmnPackage.Literals.PROCESS_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessModel getProcessModel() {
		if (processModel != null && processModel.eIsProxy()) {
			InternalEObject oldProcessModel = (InternalEObject)processModel;
			processModel = (ProcessModel)eResolveProxy(oldProcessModel);
			if (processModel != oldProcessModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CbpmnPackage.PROCESS_INSTANCE__PROCESS_MODEL, oldProcessModel, processModel));
			}
		}
		return processModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessModel basicGetProcessModel() {
		return processModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessModel(ProcessModel newProcessModel) {
		ProcessModel oldProcessModel = processModel;
		processModel = newProcessModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmnPackage.PROCESS_INSTANCE__PROCESS_MODEL, oldProcessModel, processModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlowNodeInstance> getExecutedNodes() {
		if (executedNodes == null) {
			executedNodes = new EObjectContainmentWithInverseEList<FlowNodeInstance>(FlowNodeInstance.class, this, CbpmnPackage.PROCESS_INSTANCE__EXECUTED_NODES, CbpmnPackage.FLOW_NODE_INSTANCE__PROCESS_INSTANCE);
		}
		return executedNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmnPackage.PROCESS_INSTANCE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDataObjects() {
		if (dataObjects == null) {
			dataObjects = new EObjectContainmentEList<EObject>(EObject.class, this, CbpmnPackage.PROCESS_INSTANCE__DATA_OBJECTS);
		}
		return dataObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CbpmnPackage.PROCESS_INSTANCE__EXECUTED_NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExecutedNodes()).basicAdd(otherEnd, msgs);
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
			case CbpmnPackage.PROCESS_INSTANCE__EXECUTED_NODES:
				return ((InternalEList<?>)getExecutedNodes()).basicRemove(otherEnd, msgs);
			case CbpmnPackage.PROCESS_INSTANCE__DATA_OBJECTS:
				return ((InternalEList<?>)getDataObjects()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CbpmnPackage.PROCESS_INSTANCE__PROCESS_MODEL:
				if (resolve) return getProcessModel();
				return basicGetProcessModel();
			case CbpmnPackage.PROCESS_INSTANCE__EXECUTED_NODES:
				return getExecutedNodes();
			case CbpmnPackage.PROCESS_INSTANCE__ID:
				return getId();
			case CbpmnPackage.PROCESS_INSTANCE__DATA_OBJECTS:
				return getDataObjects();
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
			case CbpmnPackage.PROCESS_INSTANCE__PROCESS_MODEL:
				setProcessModel((ProcessModel)newValue);
				return;
			case CbpmnPackage.PROCESS_INSTANCE__EXECUTED_NODES:
				getExecutedNodes().clear();
				getExecutedNodes().addAll((Collection<? extends FlowNodeInstance>)newValue);
				return;
			case CbpmnPackage.PROCESS_INSTANCE__ID:
				setId((String)newValue);
				return;
			case CbpmnPackage.PROCESS_INSTANCE__DATA_OBJECTS:
				getDataObjects().clear();
				getDataObjects().addAll((Collection<? extends EObject>)newValue);
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
			case CbpmnPackage.PROCESS_INSTANCE__PROCESS_MODEL:
				setProcessModel((ProcessModel)null);
				return;
			case CbpmnPackage.PROCESS_INSTANCE__EXECUTED_NODES:
				getExecutedNodes().clear();
				return;
			case CbpmnPackage.PROCESS_INSTANCE__ID:
				setId(ID_EDEFAULT);
				return;
			case CbpmnPackage.PROCESS_INSTANCE__DATA_OBJECTS:
				getDataObjects().clear();
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
			case CbpmnPackage.PROCESS_INSTANCE__PROCESS_MODEL:
				return processModel != null;
			case CbpmnPackage.PROCESS_INSTANCE__EXECUTED_NODES:
				return executedNodes != null && !executedNodes.isEmpty();
			case CbpmnPackage.PROCESS_INSTANCE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CbpmnPackage.PROCESS_INSTANCE__DATA_OBJECTS:
				return dataObjects != null && !dataObjects.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ProcessInstanceImpl
