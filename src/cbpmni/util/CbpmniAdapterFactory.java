/**
 */
package cbpmni.util;

import cbpmni.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cbpmni.CbpmniPackage
 * @generated
 */
public class CbpmniAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CbpmniPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CbpmniAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CbpmniPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CbpmniSwitch<Adapter> modelSwitch =
		new CbpmniSwitch<Adapter>() {
			@Override
			public Adapter caseProcessInst(ProcessInst object) {
				return createProcessInstAdapter();
			}
			@Override
			public Adapter caseFlowNodeInst(FlowNodeInst object) {
				return createFlowNodeInstAdapter();
			}
			@Override
			public Adapter caseActivityInst(ActivityInst object) {
				return createActivityInstAdapter();
			}
			@Override
			public Adapter caseEventInst(EventInst object) {
				return createEventInstAdapter();
			}
			@Override
			public Adapter caseSplitInst(SplitInst object) {
				return createSplitInstAdapter();
			}
			@Override
			public Adapter caseBranchInst(BranchInst object) {
				return createBranchInstAdapter();
			}
			@Override
			public Adapter caseConstraintInst(ConstraintInst object) {
				return createConstraintInstAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link cbpmni.ProcessInst <em>Process Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cbpmni.ProcessInst
	 * @generated
	 */
	public Adapter createProcessInstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cbpmni.FlowNodeInst <em>Flow Node Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cbpmni.FlowNodeInst
	 * @generated
	 */
	public Adapter createFlowNodeInstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cbpmni.ActivityInst <em>Activity Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cbpmni.ActivityInst
	 * @generated
	 */
	public Adapter createActivityInstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cbpmni.EventInst <em>Event Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cbpmni.EventInst
	 * @generated
	 */
	public Adapter createEventInstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cbpmni.SplitInst <em>Split Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cbpmni.SplitInst
	 * @generated
	 */
	public Adapter createSplitInstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cbpmni.BranchInst <em>Branch Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cbpmni.BranchInst
	 * @generated
	 */
	public Adapter createBranchInstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cbpmni.ConstraintInst <em>Constraint Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cbpmni.ConstraintInst
	 * @generated
	 */
	public Adapter createConstraintInstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CbpmniAdapterFactory
