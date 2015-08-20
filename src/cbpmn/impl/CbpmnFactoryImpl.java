/**
 */
package cbpmn.impl;

import cbpmn.*;
import cbpmn.util.CbpmnIterator;
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
public class CbpmnFactoryImpl extends EFactoryImpl implements CbpmnFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CbpmnFactory init() {
		try {
			CbpmnFactory theCbpmnFactory = (CbpmnFactory)EPackage.Registry.INSTANCE.getEFactory(CbpmnPackage.eNS_URI);
			if (theCbpmnFactory != null) {
				return theCbpmnFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CbpmnFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CbpmnFactoryImpl() {
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
			case CbpmnPackage.PROCESS_MODEL: return createProcessModel();
			case CbpmnPackage.ACTIVITY: return createActivity();
			case CbpmnPackage.BRANCH: return createBranch();
			case CbpmnPackage.DECISION_GATEWAY: return createDecisionGateway();
			case CbpmnPackage.OCL_CONSTRAINT: return createOCLConstraint();
			case CbpmnPackage.PARALLEL_GATEWAY: return createParallelGateway();
			case CbpmnPackage.DATA_OBJECT_REFERENCE: return createDataObjectReference();
			case CbpmnPackage.PROCESS_INSTANCE: return createProcessInstance();
			case CbpmnPackage.FLOW_NODE_INSTANCE: return createFlowNodeInstance();
			case CbpmnPackage.DATA_OBJECT: return createDataObject();
			case CbpmnPackage.START_EVENT: return createStartEvent();
			case CbpmnPackage.END_EVENT: return createEndEvent();
			case CbpmnPackage.INTERMEDIATE_EVENT: return createIntermediateEvent();
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
			case CbpmnPackage.ACTIVITY_TYPE:
				return createActivityTypeFromString(eDataType, initialValue);
			case CbpmnPackage.EVENT_TYPE:
				return createEventTypeFromString(eDataType, initialValue);
			case CbpmnPackage.DECISION_TYPE:
				return createDecisionTypeFromString(eDataType, initialValue);
			case CbpmnPackage.GATEWAY_TYPE:
				return createGatewayTypeFromString(eDataType, initialValue);
			case CbpmnPackage.DATA_OBJECT_TYPE:
				return createDataObjectTypeFromString(eDataType, initialValue);
			case CbpmnPackage.FLOW_NODE_INSTANCE_STATUS:
				return createFlowNodeInstanceStatusFromString(eDataType, initialValue);
			case CbpmnPackage.CBPMN_ITERATOR:
				return createCbpmnIteratorFromString(eDataType, initialValue);
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
			case CbpmnPackage.ACTIVITY_TYPE:
				return convertActivityTypeToString(eDataType, instanceValue);
			case CbpmnPackage.EVENT_TYPE:
				return convertEventTypeToString(eDataType, instanceValue);
			case CbpmnPackage.DECISION_TYPE:
				return convertDecisionTypeToString(eDataType, instanceValue);
			case CbpmnPackage.GATEWAY_TYPE:
				return convertGatewayTypeToString(eDataType, instanceValue);
			case CbpmnPackage.DATA_OBJECT_TYPE:
				return convertDataObjectTypeToString(eDataType, instanceValue);
			case CbpmnPackage.FLOW_NODE_INSTANCE_STATUS:
				return convertFlowNodeInstanceStatusToString(eDataType, instanceValue);
			case CbpmnPackage.CBPMN_ITERATOR:
				return convertCbpmnIteratorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessModel createProcessModel() {
		ProcessModelImpl processModel = new ProcessModelImpl();
		return processModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch createBranch() {
		BranchImpl branch = new BranchImpl();
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionGateway createDecisionGateway() {
		DecisionGatewayImpl decisionGateway = new DecisionGatewayImpl();
		return decisionGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLConstraint createOCLConstraint() {
		OCLConstraintImpl oclConstraint = new OCLConstraintImpl();
		return oclConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelGateway createParallelGateway() {
		ParallelGatewayImpl parallelGateway = new ParallelGatewayImpl();
		return parallelGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObjectReference createDataObjectReference() {
		DataObjectReferenceImpl dataObjectReference = new DataObjectReferenceImpl();
		return dataObjectReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessInstance createProcessInstance() {
		ProcessInstanceImpl processInstance = new ProcessInstanceImpl();
		return processInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNodeInstance createFlowNodeInstance() {
		FlowNodeInstanceImpl flowNodeInstance = new FlowNodeInstanceImpl();
		return flowNodeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObject createDataObject() {
		DataObjectImpl dataObject = new DataObjectImpl();
		return dataObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartEvent createStartEvent() {
		StartEventImpl startEvent = new StartEventImpl();
		return startEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndEvent createEndEvent() {
		EndEventImpl endEvent = new EndEventImpl();
		return endEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateEvent createIntermediateEvent() {
		IntermediateEventImpl intermediateEvent = new IntermediateEventImpl();
		return intermediateEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityType createActivityTypeFromString(EDataType eDataType, String initialValue) {
		ActivityType result = ActivityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActivityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType createEventTypeFromString(EDataType eDataType, String initialValue) {
		EventType result = EventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionType createDecisionTypeFromString(EDataType eDataType, String initialValue) {
		DecisionType result = DecisionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecisionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GatewayType createGatewayTypeFromString(EDataType eDataType, String initialValue) {
		GatewayType result = GatewayType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGatewayTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObjectType createDataObjectTypeFromString(EDataType eDataType, String initialValue) {
		DataObjectType result = DataObjectType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataObjectTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowNodeInstanceStatus createFlowNodeInstanceStatusFromString(EDataType eDataType, String initialValue) {
		FlowNodeInstanceStatus result = FlowNodeInstanceStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlowNodeInstanceStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CbpmnIterator createCbpmnIteratorFromString(EDataType eDataType, String initialValue) {
		return (CbpmnIterator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCbpmnIteratorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CbpmnPackage getCbpmnPackage() {
		return (CbpmnPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CbpmnPackage getPackage() {
		return CbpmnPackage.eINSTANCE;
	}

} //CbpmnFactoryImpl
