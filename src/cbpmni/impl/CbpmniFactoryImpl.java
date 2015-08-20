/**
 */
package cbpmni.impl;

import cbpmni.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CbpmniFactoryImpl extends EFactoryImpl implements CbpmniFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CbpmniFactory init() {
		try {
			CbpmniFactory theCbpmniFactory = (CbpmniFactory)EPackage.Registry.INSTANCE.getEFactory(CbpmniPackage.eNS_URI);
			if (theCbpmniFactory != null) {
				return theCbpmniFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CbpmniFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CbpmniFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CbpmniPackage.PROCESS_INST: return createProcessInst();
			case CbpmniPackage.ACTIVITY_INST: return createActivityInst();
			case CbpmniPackage.EVENT_INST: return createEventInst();
			case CbpmniPackage.SPLIT_INST: return createSplitInst();
			case CbpmniPackage.BRANCH_INST: return createBranchInst();
			case CbpmniPackage.CONSTRAINT_INST: return createConstraintInst();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CbpmniPackage.FLOW_NODE_STATUS_TYPE:
				return createFlowNodeStatusTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CbpmniPackage.FLOW_NODE_STATUS_TYPE:
				return convertFlowNodeStatusTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessInst createProcessInst() {
		ProcessInstImpl processInst = new ProcessInstImpl();
		return processInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityInst createActivityInst() {
		ActivityInstImpl activityInst = new ActivityInstImpl();
		return activityInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventInst createEventInst() {
		EventInstImpl eventInst = new EventInstImpl();
		return eventInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplitInst createSplitInst() {
		SplitInstImpl splitInst = new SplitInstImpl();
		return splitInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchInst createBranchInst() {
		BranchInstImpl branchInst = new BranchInstImpl();
		return branchInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintInst createConstraintInst() {
		ConstraintInstImpl constraintInst = new ConstraintInstImpl();
		return constraintInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNodeStatusType createFlowNodeStatusTypeFromString(EDataType eDataType, String initialValue) {
		FlowNodeStatusType result = FlowNodeStatusType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlowNodeStatusTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CbpmniPackage getCbpmniPackage() {
		return (CbpmniPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CbpmniPackage getPackage() {
		return CbpmniPackage.eINSTANCE;
	}

} //CbpmniFactoryImpl
