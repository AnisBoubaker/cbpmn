/**
 */
package cbpmn.impl;

import cbpmn.Branch;
import cbpmn.CbpmnPackage;
import cbpmn.FlowNode;
import cbpmn.OCLConstraint;
import cbpmn.ProcessModel;
import cbpmn.StartEvent;
import cbpmn.util.CbpmnIterator;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cbpmn.impl.ProcessModelImpl#getMainBranch <em>Main Branch</em>}</li>
 *   <li>{@link cbpmn.impl.ProcessModelImpl#getProcessInvariants <em>Process Invariants</em>}</li>
 *   <li>{@link cbpmn.impl.ProcessModelImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessModelImpl extends MinimalEObjectImpl.Container implements ProcessModel {
	/**
	 * The cached value of the '{@link #getMainBranch() <em>Main Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainBranch()
	 * @generated
	 * @ordered
	 */
	protected Branch mainBranch;

	/**
	 * The cached value of the '{@link #getProcessInvariants() <em>Process Invariants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessInvariants()
	 * @generated
	 * @ordered
	 */
	protected EList<OCLConstraint> processInvariants;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "DefaultProcess";

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CbpmnPackage.Literals.PROCESS_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch getMainBranch() {
		return mainBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainBranch(Branch newMainBranch, NotificationChain msgs) {
		Branch oldMainBranch = mainBranch;
		mainBranch = newMainBranch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CbpmnPackage.PROCESS_MODEL__MAIN_BRANCH, oldMainBranch, newMainBranch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainBranch(Branch newMainBranch) {
		if (newMainBranch != mainBranch) {
			NotificationChain msgs = null;
			if (mainBranch != null)
				msgs = ((InternalEObject)mainBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CbpmnPackage.PROCESS_MODEL__MAIN_BRANCH, null, msgs);
			if (newMainBranch != null)
				msgs = ((InternalEObject)newMainBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CbpmnPackage.PROCESS_MODEL__MAIN_BRANCH, null, msgs);
			msgs = basicSetMainBranch(newMainBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmnPackage.PROCESS_MODEL__MAIN_BRANCH, newMainBranch, newMainBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OCLConstraint> getProcessInvariants() {
		if (processInvariants == null) {
			processInvariants = new EObjectContainmentEList<OCLConstraint>(OCLConstraint.class, this, CbpmnPackage.PROCESS_MODEL__PROCESS_INVARIANTS);
		}
		return processInvariants;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmnPackage.PROCESS_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CbpmnIterator iterator(CbpmnIterator iterator) {
		iterator.setProcessModel(this);
		return iterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CbpmnIterator iterator(CbpmnIterator iterator, FlowNode start) {
		iterator.setProcessModel(this);
		iterator.setStartNode(start);
		return iterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public StartEvent getRandomStartEvent() {
		Branch root = this.getMainBranch();
		List<StartEvent> pool = new ArrayList<StartEvent>();
		for(FlowNode node: root.getNodes()){
			if(node instanceof StartEvent) pool.add((StartEvent)node);
		}
		Random randomGenerator = new Random();
		return pool.get( randomGenerator.nextInt(pool.size()) );
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CbpmnPackage.PROCESS_MODEL__MAIN_BRANCH:
				return basicSetMainBranch(null, msgs);
			case CbpmnPackage.PROCESS_MODEL__PROCESS_INVARIANTS:
				return ((InternalEList<?>)getProcessInvariants()).basicRemove(otherEnd, msgs);
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
			case CbpmnPackage.PROCESS_MODEL__MAIN_BRANCH:
				return getMainBranch();
			case CbpmnPackage.PROCESS_MODEL__PROCESS_INVARIANTS:
				return getProcessInvariants();
			case CbpmnPackage.PROCESS_MODEL__NAME:
				return getName();
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
			case CbpmnPackage.PROCESS_MODEL__MAIN_BRANCH:
				setMainBranch((Branch)newValue);
				return;
			case CbpmnPackage.PROCESS_MODEL__PROCESS_INVARIANTS:
				getProcessInvariants().clear();
				getProcessInvariants().addAll((Collection<? extends OCLConstraint>)newValue);
				return;
			case CbpmnPackage.PROCESS_MODEL__NAME:
				setName((String)newValue);
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
			case CbpmnPackage.PROCESS_MODEL__MAIN_BRANCH:
				setMainBranch((Branch)null);
				return;
			case CbpmnPackage.PROCESS_MODEL__PROCESS_INVARIANTS:
				getProcessInvariants().clear();
				return;
			case CbpmnPackage.PROCESS_MODEL__NAME:
				setName(NAME_EDEFAULT);
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
			case CbpmnPackage.PROCESS_MODEL__MAIN_BRANCH:
				return mainBranch != null;
			case CbpmnPackage.PROCESS_MODEL__PROCESS_INVARIANTS:
				return processInvariants != null && !processInvariants.isEmpty();
			case CbpmnPackage.PROCESS_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CbpmnPackage.PROCESS_MODEL___ITERATOR__CBPMNITERATOR:
				return iterator((CbpmnIterator)arguments.get(0));
			case CbpmnPackage.PROCESS_MODEL___ITERATOR__CBPMNITERATOR_FLOWNODE:
				return iterator((CbpmnIterator)arguments.get(0), (FlowNode)arguments.get(1));
			case CbpmnPackage.PROCESS_MODEL___GET_RANDOM_START_EVENT:
				return getRandomStartEvent();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ProcessModelImpl
