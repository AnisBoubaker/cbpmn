/**
 */
package cbpmni.impl;


import cbpmni.ActivityInst;
import cbpmni.CbpmniPackage;

import cbpmni.ConstraintInst;
import java.util.Collection;


import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;


import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Inst</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cbpmni.impl.ActivityInstImpl#getPreconditions <em>Preconditions</em>}</li>
 *   <li>{@link cbpmni.impl.ActivityInstImpl#getPostconditions <em>Postconditions</em>}</li>
 *   <li>{@link cbpmni.impl.ActivityInstImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link cbpmni.impl.ActivityInstImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityInstImpl extends FlowNodeInstImpl implements ActivityInst {
	/**
	 * The cached value of the '{@link #getPreconditions() <em>Preconditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstraintInst> preconditions;

	/**
	 * The cached value of the '{@link #getPostconditions() <em>Postconditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostconditions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstraintInst> postconditions;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityInstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CbpmniPackage.Literals.ACTIVITY_INST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getInputs() {
		if (inputs == null) {
			inputs = new EObjectResolvingEList<EObject>(EObject.class, this, CbpmniPackage.ACTIVITY_INST__INPUTS);
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
			outputs = new EObjectResolvingEList<EObject>(EObject.class, this, CbpmniPackage.ACTIVITY_INST__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstraintInst> getPreconditions() {
		if (preconditions == null) {
			preconditions = new EObjectContainmentEList<ConstraintInst>(ConstraintInst.class, this, CbpmniPackage.ACTIVITY_INST__PRECONDITIONS);
		}
		return preconditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstraintInst> getPostconditions() {
		if (postconditions == null) {
			postconditions = new EObjectContainmentEList<ConstraintInst>(ConstraintInst.class, this, CbpmniPackage.ACTIVITY_INST__POSTCONDITIONS);
		}
		return postconditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CbpmniPackage.ACTIVITY_INST__PRECONDITIONS:
				return ((InternalEList<?>)getPreconditions()).basicRemove(otherEnd, msgs);
			case CbpmniPackage.ACTIVITY_INST__POSTCONDITIONS:
				return ((InternalEList<?>)getPostconditions()).basicRemove(otherEnd, msgs);
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
			case CbpmniPackage.ACTIVITY_INST__PRECONDITIONS:
				return getPreconditions();
			case CbpmniPackage.ACTIVITY_INST__POSTCONDITIONS:
				return getPostconditions();
			case CbpmniPackage.ACTIVITY_INST__INPUTS:
				return getInputs();
			case CbpmniPackage.ACTIVITY_INST__OUTPUTS:
				return getOutputs();
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
			case CbpmniPackage.ACTIVITY_INST__PRECONDITIONS:
				getPreconditions().clear();
				getPreconditions().addAll((Collection<? extends ConstraintInst>)newValue);
				return;
			case CbpmniPackage.ACTIVITY_INST__POSTCONDITIONS:
				getPostconditions().clear();
				getPostconditions().addAll((Collection<? extends ConstraintInst>)newValue);
				return;
			case CbpmniPackage.ACTIVITY_INST__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends EObject>)newValue);
				return;
			case CbpmniPackage.ACTIVITY_INST__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends EObject>)newValue);
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
			case CbpmniPackage.ACTIVITY_INST__PRECONDITIONS:
				getPreconditions().clear();
				return;
			case CbpmniPackage.ACTIVITY_INST__POSTCONDITIONS:
				getPostconditions().clear();
				return;
			case CbpmniPackage.ACTIVITY_INST__INPUTS:
				getInputs().clear();
				return;
			case CbpmniPackage.ACTIVITY_INST__OUTPUTS:
				getOutputs().clear();
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
			case CbpmniPackage.ACTIVITY_INST__PRECONDITIONS:
				return preconditions != null && !preconditions.isEmpty();
			case CbpmniPackage.ACTIVITY_INST__POSTCONDITIONS:
				return postconditions != null && !postconditions.isEmpty();
			case CbpmniPackage.ACTIVITY_INST__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case CbpmniPackage.ACTIVITY_INST__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityInstImpl
