/**
 */
package cbpmn.impl;

import cbpmn.Activity;
import cbpmn.ActivityType;
import cbpmn.Branch;
import cbpmn.CbpmnPackage;
import cbpmn.DataObjectReference;
import cbpmn.FlowNode;
import cbpmn.OCLConstraint;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cbpmn.impl.ActivityImpl#getBranch <em>Branch</em>}</li>
 *   <li>{@link cbpmn.impl.ActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link cbpmn.impl.ActivityImpl#getNext <em>Next</em>}</li>
 *   <li>{@link cbpmn.impl.ActivityImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link cbpmn.impl.ActivityImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link cbpmn.impl.ActivityImpl#getPreConditions <em>Pre Conditions</em>}</li>
 *   <li>{@link cbpmn.impl.ActivityImpl#getPostConditions <em>Post Conditions</em>}</li>
 *   <li>{@link cbpmn.impl.ActivityImpl#getType <em>Type</em>}</li>
 *   <li>{@link cbpmn.impl.ActivityImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link cbpmn.impl.ActivityImpl#getInvariabilityClauses <em>Invariability Clauses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends MinimalEObjectImpl.Container implements Activity {
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
	 * The cached value of the '{@link #getPreConditions() <em>Pre Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<OCLConstraint> preConditions;

	/**
	 * The cached value of the '{@link #getPostConditions() <em>Post Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<OCLConstraint> postConditions;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ActivityType TYPE_EDEFAULT = ActivityType.MANUAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ActivityType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<DataObjectReference> outputs;

	/**
	 * The cached value of the '{@link #getInvariabilityClauses() <em>Invariability Clauses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariabilityClauses()
	 * @generated
	 * @ordered
	 */
	protected EList<OCLConstraint> invariabilityClauses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CbpmnPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch getBranch() {
		if (eContainerFeatureID() != CbpmnPackage.ACTIVITY__BRANCH) return null;
		return (Branch)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBranch(Branch newBranch, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBranch, CbpmnPackage.ACTIVITY__BRANCH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBranch(Branch newBranch) {
		if (newBranch != eInternalContainer() || (eContainerFeatureID() != CbpmnPackage.ACTIVITY__BRANCH && newBranch != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmnPackage.ACTIVITY__BRANCH, newBranch, newBranch));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CbpmnPackage.ACTIVITY__NEXT, oldNext, next));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CbpmnPackage.ACTIVITY__NEXT, oldNext, newNext);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmnPackage.ACTIVITY__NEXT, newNext, newNext));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CbpmnPackage.ACTIVITY__PREVIOUS, oldPrevious, previous));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CbpmnPackage.ACTIVITY__PREVIOUS, oldPrevious, newPrevious);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmnPackage.ACTIVITY__PREVIOUS, newPrevious, newPrevious));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmnPackage.ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OCLConstraint> getPreConditions() {
		if (preConditions == null) {
			preConditions = new EObjectContainmentEList<OCLConstraint>(OCLConstraint.class, this, CbpmnPackage.ACTIVITY__PRE_CONDITIONS);
		}
		return preConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OCLConstraint> getPostConditions() {
		if (postConditions == null) {
			postConditions = new EObjectContainmentEList<OCLConstraint>(OCLConstraint.class, this, CbpmnPackage.ACTIVITY__POST_CONDITIONS);
		}
		return postConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ActivityType newType) {
		ActivityType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmnPackage.ACTIVITY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataObjectReference> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<DataObjectReference>(DataObjectReference.class, this, CbpmnPackage.ACTIVITY__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataObjectReference> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<DataObjectReference>(DataObjectReference.class, this, CbpmnPackage.ACTIVITY__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OCLConstraint> getInvariabilityClauses() {
		if (invariabilityClauses == null) {
			invariabilityClauses = new EObjectContainmentEList<OCLConstraint>(OCLConstraint.class, this, CbpmnPackage.ACTIVITY__INVARIABILITY_CLAUSES);
		}
		return invariabilityClauses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CbpmnPackage.ACTIVITY__BRANCH:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBranch((Branch)otherEnd, msgs);
			case CbpmnPackage.ACTIVITY__NEXT:
				if (next != null)
					msgs = ((InternalEObject)next).eInverseRemove(this, CbpmnPackage.FLOW_NODE__PREVIOUS, FlowNode.class, msgs);
				return basicSetNext((FlowNode)otherEnd, msgs);
			case CbpmnPackage.ACTIVITY__PREVIOUS:
				if (previous != null)
					msgs = ((InternalEObject)previous).eInverseRemove(this, CbpmnPackage.FLOW_NODE__NEXT, FlowNode.class, msgs);
				return basicSetPrevious((FlowNode)otherEnd, msgs);
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
			case CbpmnPackage.ACTIVITY__BRANCH:
				return basicSetBranch(null, msgs);
			case CbpmnPackage.ACTIVITY__NEXT:
				return basicSetNext(null, msgs);
			case CbpmnPackage.ACTIVITY__PREVIOUS:
				return basicSetPrevious(null, msgs);
			case CbpmnPackage.ACTIVITY__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case CbpmnPackage.ACTIVITY__PRE_CONDITIONS:
				return ((InternalEList<?>)getPreConditions()).basicRemove(otherEnd, msgs);
			case CbpmnPackage.ACTIVITY__POST_CONDITIONS:
				return ((InternalEList<?>)getPostConditions()).basicRemove(otherEnd, msgs);
			case CbpmnPackage.ACTIVITY__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case CbpmnPackage.ACTIVITY__INVARIABILITY_CLAUSES:
				return ((InternalEList<?>)getInvariabilityClauses()).basicRemove(otherEnd, msgs);
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
			case CbpmnPackage.ACTIVITY__BRANCH:
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
			case CbpmnPackage.ACTIVITY__BRANCH:
				return getBranch();
			case CbpmnPackage.ACTIVITY__NAME:
				return getName();
			case CbpmnPackage.ACTIVITY__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case CbpmnPackage.ACTIVITY__PREVIOUS:
				if (resolve) return getPrevious();
				return basicGetPrevious();
			case CbpmnPackage.ACTIVITY__INPUTS:
				return getInputs();
			case CbpmnPackage.ACTIVITY__PRE_CONDITIONS:
				return getPreConditions();
			case CbpmnPackage.ACTIVITY__POST_CONDITIONS:
				return getPostConditions();
			case CbpmnPackage.ACTIVITY__TYPE:
				return getType();
			case CbpmnPackage.ACTIVITY__OUTPUTS:
				return getOutputs();
			case CbpmnPackage.ACTIVITY__INVARIABILITY_CLAUSES:
				return getInvariabilityClauses();
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
			case CbpmnPackage.ACTIVITY__BRANCH:
				setBranch((Branch)newValue);
				return;
			case CbpmnPackage.ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case CbpmnPackage.ACTIVITY__NEXT:
				setNext((FlowNode)newValue);
				return;
			case CbpmnPackage.ACTIVITY__PREVIOUS:
				setPrevious((FlowNode)newValue);
				return;
			case CbpmnPackage.ACTIVITY__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends DataObjectReference>)newValue);
				return;
			case CbpmnPackage.ACTIVITY__PRE_CONDITIONS:
				getPreConditions().clear();
				getPreConditions().addAll((Collection<? extends OCLConstraint>)newValue);
				return;
			case CbpmnPackage.ACTIVITY__POST_CONDITIONS:
				getPostConditions().clear();
				getPostConditions().addAll((Collection<? extends OCLConstraint>)newValue);
				return;
			case CbpmnPackage.ACTIVITY__TYPE:
				setType((ActivityType)newValue);
				return;
			case CbpmnPackage.ACTIVITY__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends DataObjectReference>)newValue);
				return;
			case CbpmnPackage.ACTIVITY__INVARIABILITY_CLAUSES:
				getInvariabilityClauses().clear();
				getInvariabilityClauses().addAll((Collection<? extends OCLConstraint>)newValue);
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
			case CbpmnPackage.ACTIVITY__BRANCH:
				setBranch((Branch)null);
				return;
			case CbpmnPackage.ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CbpmnPackage.ACTIVITY__NEXT:
				setNext((FlowNode)null);
				return;
			case CbpmnPackage.ACTIVITY__PREVIOUS:
				setPrevious((FlowNode)null);
				return;
			case CbpmnPackage.ACTIVITY__INPUTS:
				getInputs().clear();
				return;
			case CbpmnPackage.ACTIVITY__PRE_CONDITIONS:
				getPreConditions().clear();
				return;
			case CbpmnPackage.ACTIVITY__POST_CONDITIONS:
				getPostConditions().clear();
				return;
			case CbpmnPackage.ACTIVITY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CbpmnPackage.ACTIVITY__OUTPUTS:
				getOutputs().clear();
				return;
			case CbpmnPackage.ACTIVITY__INVARIABILITY_CLAUSES:
				getInvariabilityClauses().clear();
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
			case CbpmnPackage.ACTIVITY__BRANCH:
				return getBranch() != null;
			case CbpmnPackage.ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CbpmnPackage.ACTIVITY__NEXT:
				return next != null;
			case CbpmnPackage.ACTIVITY__PREVIOUS:
				return previous != null;
			case CbpmnPackage.ACTIVITY__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case CbpmnPackage.ACTIVITY__PRE_CONDITIONS:
				return preConditions != null && !preConditions.isEmpty();
			case CbpmnPackage.ACTIVITY__POST_CONDITIONS:
				return postConditions != null && !postConditions.isEmpty();
			case CbpmnPackage.ACTIVITY__TYPE:
				return type != TYPE_EDEFAULT;
			case CbpmnPackage.ACTIVITY__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case CbpmnPackage.ACTIVITY__INVARIABILITY_CLAUSES:
				return invariabilityClauses != null && !invariabilityClauses.isEmpty();
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
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
