/**
 */
package cbpmni.impl;

import cbpmn.ProcessModel;

import cbpmni.CbpmniPackage;
import cbpmni.FlowNodeInst;
import cbpmni.ProcessInst;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Inst</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cbpmni.impl.ProcessInstImpl#getProcessDef <em>Process Def</em>}</li>
 *   <li>{@link cbpmni.impl.ProcessInstImpl#getTokens <em>Tokens</em>}</li>
 *   <li>{@link cbpmni.impl.ProcessInstImpl#getFlowNodes <em>Flow Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessInstImpl extends MinimalEObjectImpl.Container implements ProcessInst {
	/**
	 * The cached value of the '{@link #getProcessDef() <em>Process Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessDef()
	 * @generated
	 * @ordered
	 */
	protected ProcessModel processDef;

	/**
	 * The cached value of the '{@link #getTokens() <em>Tokens</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowNodeInst> tokens;

	/**
	 * The cached value of the '{@link #getFlowNodes() <em>Flow Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowNodeInst> flowNodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessInstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CbpmniPackage.Literals.PROCESS_INST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessModel getProcessDef() {
		if (processDef != null && processDef.eIsProxy()) {
			InternalEObject oldProcessDef = (InternalEObject)processDef;
			processDef = (ProcessModel)eResolveProxy(oldProcessDef);
			if (processDef != oldProcessDef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CbpmniPackage.PROCESS_INST__PROCESS_DEF, oldProcessDef, processDef));
			}
		}
		return processDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessModel basicGetProcessDef() {
		return processDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessDef(ProcessModel newProcessDef) {
		ProcessModel oldProcessDef = processDef;
		processDef = newProcessDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmniPackage.PROCESS_INST__PROCESS_DEF, oldProcessDef, processDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlowNodeInst> getTokens() {
		if (tokens == null) {
			tokens = new EObjectResolvingEList<FlowNodeInst>(FlowNodeInst.class, this, CbpmniPackage.PROCESS_INST__TOKENS);
		}
		return tokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlowNodeInst> getFlowNodes() {
		if (flowNodes == null) {
			flowNodes = new EObjectContainmentEList<FlowNodeInst>(FlowNodeInst.class, this, CbpmniPackage.PROCESS_INST__FLOW_NODES);
		}
		return flowNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setupProcessInstance() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CbpmniPackage.PROCESS_INST__FLOW_NODES:
				return ((InternalEList<?>)getFlowNodes()).basicRemove(otherEnd, msgs);
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
			case CbpmniPackage.PROCESS_INST__PROCESS_DEF:
				if (resolve) return getProcessDef();
				return basicGetProcessDef();
			case CbpmniPackage.PROCESS_INST__TOKENS:
				return getTokens();
			case CbpmniPackage.PROCESS_INST__FLOW_NODES:
				return getFlowNodes();
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
			case CbpmniPackage.PROCESS_INST__PROCESS_DEF:
				setProcessDef((ProcessModel)newValue);
				return;
			case CbpmniPackage.PROCESS_INST__TOKENS:
				getTokens().clear();
				getTokens().addAll((Collection<? extends FlowNodeInst>)newValue);
				return;
			case CbpmniPackage.PROCESS_INST__FLOW_NODES:
				getFlowNodes().clear();
				getFlowNodes().addAll((Collection<? extends FlowNodeInst>)newValue);
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
			case CbpmniPackage.PROCESS_INST__PROCESS_DEF:
				setProcessDef((ProcessModel)null);
				return;
			case CbpmniPackage.PROCESS_INST__TOKENS:
				getTokens().clear();
				return;
			case CbpmniPackage.PROCESS_INST__FLOW_NODES:
				getFlowNodes().clear();
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
			case CbpmniPackage.PROCESS_INST__PROCESS_DEF:
				return processDef != null;
			case CbpmniPackage.PROCESS_INST__TOKENS:
				return tokens != null && !tokens.isEmpty();
			case CbpmniPackage.PROCESS_INST__FLOW_NODES:
				return flowNodes != null && !flowNodes.isEmpty();
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
			case CbpmniPackage.PROCESS_INST___SETUP_PROCESS_INSTANCE:
				setupProcessInstance();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ProcessInstImpl
