/**
 */
package cbpmn.impl;

import cbpmn.Branch;
import cbpmn.CbpmnPackage;
import cbpmn.FlowNode;
import cbpmn.OCLConstraint;
import cbpmn.SplitGateway;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cbpmn.impl.BranchImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link cbpmn.impl.BranchImpl#isDefault <em>Default</em>}</li>
 *   <li>{@link cbpmn.impl.BranchImpl#getEntryConditions <em>Entry Conditions</em>}</li>
 *   <li>{@link cbpmn.impl.BranchImpl#getGateway <em>Gateway</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BranchImpl extends MinimalEObjectImpl.Container implements Branch {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowNode> nodes;

	/**
	 * The default value of the '{@link #isDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean default_ = DEFAULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntryConditions() <em>Entry Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<OCLConstraint> entryConditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CbpmnPackage.Literals.BRANCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlowNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentWithInverseEList<FlowNode>(FlowNode.class, this, CbpmnPackage.BRANCH__NODES, CbpmnPackage.FLOW_NODE__BRANCH);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(boolean newDefault) {
		boolean oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmnPackage.BRANCH__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OCLConstraint> getEntryConditions() {
		if (entryConditions == null) {
			entryConditions = new EObjectContainmentWithInverseEList<OCLConstraint>(OCLConstraint.class, this, CbpmnPackage.BRANCH__ENTRY_CONDITIONS, CbpmnPackage.OCL_CONSTRAINT__BRANCH);
		}
		return entryConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitGateway getGateway() {
		if (eContainerFeatureID() != CbpmnPackage.BRANCH__GATEWAY) return null;
		return (SplitGateway)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGateway(SplitGateway newGateway, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGateway, CbpmnPackage.BRANCH__GATEWAY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGateway(SplitGateway newGateway) {
		if (newGateway != eInternalContainer() || (eContainerFeatureID() != CbpmnPackage.BRANCH__GATEWAY && newGateway != null)) {
			if (EcoreUtil.isAncestor(this, newGateway))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGateway != null)
				msgs = ((InternalEObject)newGateway).eInverseAdd(this, CbpmnPackage.SPLIT_GATEWAY__BRANCHES, SplitGateway.class, msgs);
			msgs = basicSetGateway(newGateway, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbpmnPackage.BRANCH__GATEWAY, newGateway, newGateway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FlowNode getFirstNode() {
		for(FlowNode node:this.getNodes()){
			if(node.getPrevious()==null) return node;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FlowNode getLastNode() {
		for(FlowNode node:this.getNodes()){
			if(node.getNext()==null) return node;
		}
		return null;
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
			case CbpmnPackage.BRANCH__NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodes()).basicAdd(otherEnd, msgs);
			case CbpmnPackage.BRANCH__ENTRY_CONDITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntryConditions()).basicAdd(otherEnd, msgs);
			case CbpmnPackage.BRANCH__GATEWAY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGateway((SplitGateway)otherEnd, msgs);
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
			case CbpmnPackage.BRANCH__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case CbpmnPackage.BRANCH__ENTRY_CONDITIONS:
				return ((InternalEList<?>)getEntryConditions()).basicRemove(otherEnd, msgs);
			case CbpmnPackage.BRANCH__GATEWAY:
				return basicSetGateway(null, msgs);
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
			case CbpmnPackage.BRANCH__GATEWAY:
				return eInternalContainer().eInverseRemove(this, CbpmnPackage.SPLIT_GATEWAY__BRANCHES, SplitGateway.class, msgs);
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
			case CbpmnPackage.BRANCH__NODES:
				return getNodes();
			case CbpmnPackage.BRANCH__DEFAULT:
				return isDefault();
			case CbpmnPackage.BRANCH__ENTRY_CONDITIONS:
				return getEntryConditions();
			case CbpmnPackage.BRANCH__GATEWAY:
				return getGateway();
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
			case CbpmnPackage.BRANCH__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends FlowNode>)newValue);
				return;
			case CbpmnPackage.BRANCH__DEFAULT:
				setDefault((Boolean)newValue);
				return;
			case CbpmnPackage.BRANCH__ENTRY_CONDITIONS:
				getEntryConditions().clear();
				getEntryConditions().addAll((Collection<? extends OCLConstraint>)newValue);
				return;
			case CbpmnPackage.BRANCH__GATEWAY:
				setGateway((SplitGateway)newValue);
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
			case CbpmnPackage.BRANCH__NODES:
				getNodes().clear();
				return;
			case CbpmnPackage.BRANCH__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case CbpmnPackage.BRANCH__ENTRY_CONDITIONS:
				getEntryConditions().clear();
				return;
			case CbpmnPackage.BRANCH__GATEWAY:
				setGateway((SplitGateway)null);
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
			case CbpmnPackage.BRANCH__NODES:
				return nodes != null && !nodes.isEmpty();
			case CbpmnPackage.BRANCH__DEFAULT:
				return default_ != DEFAULT_EDEFAULT;
			case CbpmnPackage.BRANCH__ENTRY_CONDITIONS:
				return entryConditions != null && !entryConditions.isEmpty();
			case CbpmnPackage.BRANCH__GATEWAY:
				return getGateway() != null;
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
			case CbpmnPackage.BRANCH___GET_FIRST_NODE:
				return getFirstNode();
			case CbpmnPackage.BRANCH___GET_LAST_NODE:
				return getLastNode();
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
		result.append(" (default: ");
		result.append(default_);
		result.append(')');
		return result.toString();
	}

} //BranchImpl
