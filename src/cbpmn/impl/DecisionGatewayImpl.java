/**
 */
package cbpmn.impl;

import cbpmn.Branch;
import cbpmn.CbpmnPackage;
import cbpmn.DataObjectReference;
import cbpmn.DecisionCondition;
import cbpmn.DecisionGateway;
import cbpmn.DecisionType;
import cbpmn.FlowNode;
import cbpmn.OCLConstraint;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Random;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cbpmn.impl.DecisionGatewayImpl#getBranch <em>Branch</em>}</li>
 *   <li>{@link cbpmn.impl.DecisionGatewayImpl#getName <em>Name</em>}</li>
 *   <li>{@link cbpmn.impl.DecisionGatewayImpl#getNext <em>Next</em>}</li>
 *   <li>{@link cbpmn.impl.DecisionGatewayImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link cbpmn.impl.DecisionGatewayImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link cbpmn.impl.DecisionGatewayImpl#getBranches <em>Branches</em>}</li>
 *   <li>{@link cbpmn.impl.DecisionGatewayImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecisionGatewayImpl extends MinimalEObjectImpl.Container implements DecisionGateway {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected FlowNode next;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected FlowNode previous;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<DataObjectReference> inputs;

	/**
	 * The cached value of the '{@link #getBranches() <em>Branches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranches()
	 * @generated
	 * @ordered
	 */
	protected EList<Branch> branches;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DecisionType TYPE_EDEFAULT = DecisionType.EXCLUSIVE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DecisionType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionGatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CbpmnPackage.Literals.DECISION_GATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch getBranch() {
		if (eContainerFeatureID() != CbpmnPackage.DECISION_GATEWAY__BRANCH) return null;
		return (Branch)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBranch(Branch newBranch, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBranch, CbpmnPackage.DECISION_GATEWAY__BRANCH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBranch(Branch newBranch) {
		if (newBranch != eInternalContainer() || (eContainerFeatureID() != CbpmnPackage.DECISION_GATEWAY__BRANCH && newBranch != null)) {
			if (EcoreUtil.isAncestor(this, newBranch))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBranch != null)
				msgs = ((InternalEObject)newBranch).eInverseAdd(this, CbpmnPackage.BRANCH__NODES, Branch.class, msgs);
			msgs = basicSetBranch(newBranch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmnPackage.DECISION_GATEWAY__BRANCH, newBranch, newBranch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public FlowNode getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (FlowNode)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CbpmnPackage.DECISION_GATEWAY__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(FlowNode newNext, NotificationChain msgs) {
		FlowNode oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CbpmnPackage.DECISION_GATEWAY__NEXT, oldNext, newNext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(FlowNode newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, CbpmnPackage.FLOW_NODE__PREVIOUS, FlowNode.class, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, CbpmnPackage.FLOW_NODE__PREVIOUS, FlowNode.class, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmnPackage.DECISION_GATEWAY__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode getPrevious() {
		if (previous != null && previous.eIsProxy()) {
			InternalEObject oldPrevious = (InternalEObject)previous;
			previous = (FlowNode)eResolveProxy(oldPrevious);
			if (previous != oldPrevious) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CbpmnPackage.DECISION_GATEWAY__PREVIOUS, oldPrevious, previous));
			}
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNode basicGetPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(FlowNode newPrevious, NotificationChain msgs) {
		FlowNode oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CbpmnPackage.DECISION_GATEWAY__PREVIOUS, oldPrevious, newPrevious);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevious(FlowNode newPrevious) {
		if (newPrevious != previous) {
			NotificationChain msgs = null;
			if (previous != null)
				msgs = ((InternalEObject)previous).eInverseRemove(this, CbpmnPackage.FLOW_NODE__NEXT, FlowNode.class, msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject)newPrevious).eInverseAdd(this, CbpmnPackage.FLOW_NODE__NEXT, FlowNode.class, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmnPackage.DECISION_GATEWAY__PREVIOUS, newPrevious, newPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataObjectReference> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<DataObjectReference>(DataObjectReference.class, this, CbpmnPackage.DECISION_GATEWAY__INPUTS);
		}
		return inputs;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmnPackage.DECISION_GATEWAY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Branch> getBranches() {
		if (branches == null) {
			branches = new EObjectContainmentWithInverseEList<Branch>(Branch.class, this, CbpmnPackage.DECISION_GATEWAY__BRANCHES, CbpmnPackage.BRANCH__GATEWAY);
		}
		return branches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DecisionType newType) {
		DecisionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmnPackage.DECISION_GATEWAY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addBranchWithCondition(Branch branch, OCLConstraint condition, boolean default_) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addBranchWithCondition(Branch branch, DecisionCondition condition, boolean default_) {
		this.branches.add(branch);
		branch.getEntryConditions().add(condition);
		condition.setIsDefault(default_);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Branch getDefaultBranch() {
		for(Branch branch: this.branches){
			if(branch.isDefault()) 
				return branch;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Branch getRandomBranch() {
		if(this.branches.size()==0) return null;
		if(this.getDefaultBranch()!=null) return this.getDefaultBranch();
		Random randomGenerator = new Random();
		return this.branches.get( randomGenerator.nextInt(this.branches.size()) );
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
			case CbpmnPackage.DECISION_GATEWAY__BRANCH:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBranch((Branch)otherEnd, msgs);
			case CbpmnPackage.DECISION_GATEWAY__NEXT:
				if (next != null)
					msgs = ((InternalEObject)next).eInverseRemove(this, CbpmnPackage.FLOW_NODE__PREVIOUS, FlowNode.class, msgs);
				return basicSetNext((FlowNode)otherEnd, msgs);
			case CbpmnPackage.DECISION_GATEWAY__PREVIOUS:
				if (previous != null)
					msgs = ((InternalEObject)previous).eInverseRemove(this, CbpmnPackage.FLOW_NODE__NEXT, FlowNode.class, msgs);
				return basicSetPrevious((FlowNode)otherEnd, msgs);
			case CbpmnPackage.DECISION_GATEWAY__BRANCHES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBranches()).basicAdd(otherEnd, msgs);
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
			case CbpmnPackage.DECISION_GATEWAY__BRANCH:
				return basicSetBranch(null, msgs);
			case CbpmnPackage.DECISION_GATEWAY__NEXT:
				return basicSetNext(null, msgs);
			case CbpmnPackage.DECISION_GATEWAY__PREVIOUS:
				return basicSetPrevious(null, msgs);
			case CbpmnPackage.DECISION_GATEWAY__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case CbpmnPackage.DECISION_GATEWAY__BRANCHES:
				return ((InternalEList<?>)getBranches()).basicRemove(otherEnd, msgs);
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
			case CbpmnPackage.DECISION_GATEWAY__BRANCH:
				return eInternalContainer().eInverseRemove(this, CbpmnPackage.BRANCH__NODES, Branch.class, msgs);
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
			case CbpmnPackage.DECISION_GATEWAY__BRANCH:
				return getBranch();
			case CbpmnPackage.DECISION_GATEWAY__NAME:
				return getName();
			case CbpmnPackage.DECISION_GATEWAY__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case CbpmnPackage.DECISION_GATEWAY__PREVIOUS:
				if (resolve) return getPrevious();
				return basicGetPrevious();
			case CbpmnPackage.DECISION_GATEWAY__INPUTS:
				return getInputs();
			case CbpmnPackage.DECISION_GATEWAY__BRANCHES:
				return getBranches();
			case CbpmnPackage.DECISION_GATEWAY__TYPE:
				return getType();
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
			case CbpmnPackage.DECISION_GATEWAY__BRANCH:
				setBranch((Branch)newValue);
				return;
			case CbpmnPackage.DECISION_GATEWAY__NAME:
				setName((String)newValue);
				return;
			case CbpmnPackage.DECISION_GATEWAY__NEXT:
				setNext((FlowNode)newValue);
				return;
			case CbpmnPackage.DECISION_GATEWAY__PREVIOUS:
				setPrevious((FlowNode)newValue);
				return;
			case CbpmnPackage.DECISION_GATEWAY__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends DataObjectReference>)newValue);
				return;
			case CbpmnPackage.DECISION_GATEWAY__BRANCHES:
				getBranches().clear();
				getBranches().addAll((Collection<? extends Branch>)newValue);
				return;
			case CbpmnPackage.DECISION_GATEWAY__TYPE:
				setType((DecisionType)newValue);
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
			case CbpmnPackage.DECISION_GATEWAY__BRANCH:
				setBranch((Branch)null);
				return;
			case CbpmnPackage.DECISION_GATEWAY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CbpmnPackage.DECISION_GATEWAY__NEXT:
				setNext((FlowNode)null);
				return;
			case CbpmnPackage.DECISION_GATEWAY__PREVIOUS:
				setPrevious((FlowNode)null);
				return;
			case CbpmnPackage.DECISION_GATEWAY__INPUTS:
				getInputs().clear();
				return;
			case CbpmnPackage.DECISION_GATEWAY__BRANCHES:
				getBranches().clear();
				return;
			case CbpmnPackage.DECISION_GATEWAY__TYPE:
				setType(TYPE_EDEFAULT);
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
			case CbpmnPackage.DECISION_GATEWAY__BRANCH:
				return getBranch() != null;
			case CbpmnPackage.DECISION_GATEWAY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CbpmnPackage.DECISION_GATEWAY__NEXT:
				return next != null;
			case CbpmnPackage.DECISION_GATEWAY__PREVIOUS:
				return previous != null;
			case CbpmnPackage.DECISION_GATEWAY__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case CbpmnPackage.DECISION_GATEWAY__BRANCHES:
				return branches != null && !branches.isEmpty();
			case CbpmnPackage.DECISION_GATEWAY__TYPE:
				return type != TYPE_EDEFAULT;
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
			case CbpmnPackage.DECISION_GATEWAY___ADD_BRANCH_WITH_CONDITION__BRANCH_OCLCONSTRAINT_BOOLEAN:
				addBranchWithCondition((Branch)arguments.get(0), (OCLConstraint)arguments.get(1), (Boolean)arguments.get(2));
				return null;
			case CbpmnPackage.DECISION_GATEWAY___GET_DEFAULT_BRANCH:
				return getDefaultBranch();
			case CbpmnPackage.DECISION_GATEWAY___GET_RANDOM_BRANCH:
				return getRandomBranch();
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
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //DecisionGatewayImpl
