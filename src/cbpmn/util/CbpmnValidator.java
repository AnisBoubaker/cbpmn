/**
 */
package cbpmn.util;

import cbpmn.*;
import java.util.Map;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see cbpmn.CbpmnPackage
 * @generated
 */
public class CbpmnValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CbpmnValidator INSTANCE = new CbpmnValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "cbpmn";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CbpmnValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CbpmnPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CbpmnPackage.PROCESS_MODEL:
				return validateProcessModel((ProcessModel)value, diagnostics, context);
			case CbpmnPackage.ACTIVITY:
				return validateActivity((Activity)value, diagnostics, context);
			case CbpmnPackage.BRANCH:
				return validateBranch((Branch)value, diagnostics, context);
			case CbpmnPackage.DECISION_GATEWAY:
				return validateDecisionGateway((DecisionGateway)value, diagnostics, context);
			case CbpmnPackage.FLOW_NODE:
				return validateFlowNode((FlowNode)value, diagnostics, context);
			case CbpmnPackage.OCL_CONSTRAINT:
				return validateOCLConstraint((OCLConstraint)value, diagnostics, context);
			case CbpmnPackage.EVENT:
				return validateEvent((Event)value, diagnostics, context);
			case CbpmnPackage.PARALLEL_GATEWAY:
				return validateParallelGateway((ParallelGateway)value, diagnostics, context);
			case CbpmnPackage.SPLIT_GATEWAY:
				return validateSplitGateway((SplitGateway)value, diagnostics, context);
			case CbpmnPackage.DATA_OBJECT_REFERENCE:
				return validateDataObjectReference((DataObjectReference)value, diagnostics, context);
			case CbpmnPackage.PROCESS_INSTANCE:
				return validateProcessInstance((ProcessInstance)value, diagnostics, context);
			case CbpmnPackage.FLOW_NODE_INSTANCE:
				return validateFlowNodeInstance((FlowNodeInstance)value, diagnostics, context);
			case CbpmnPackage.DATA_OBJECT:
				return validateDataObject((DataObject)value, diagnostics, context);
			case CbpmnPackage.START_EVENT:
				return validateStartEvent((StartEvent)value, diagnostics, context);
			case CbpmnPackage.END_EVENT:
				return validateEndEvent((EndEvent)value, diagnostics, context);
			case CbpmnPackage.INTERMEDIATE_EVENT:
				return validateIntermediateEvent((IntermediateEvent)value, diagnostics, context);
			case CbpmnPackage.ACTIVITY_TYPE:
				return validateActivityType((ActivityType)value, diagnostics, context);
			case CbpmnPackage.EVENT_TYPE:
				return validateEventType((EventType)value, diagnostics, context);
			case CbpmnPackage.DECISION_TYPE:
				return validateDecisionType((DecisionType)value, diagnostics, context);
			case CbpmnPackage.GATEWAY_TYPE:
				return validateGatewayType((GatewayType)value, diagnostics, context);
			case CbpmnPackage.DATA_OBJECT_TYPE:
				return validateDataObjectType((DataObjectType)value, diagnostics, context);
			case CbpmnPackage.FLOW_NODE_INSTANCE_STATUS:
				return validateFlowNodeInstanceStatus((FlowNodeInstanceStatus)value, diagnostics, context);
			case CbpmnPackage.CBPMN_ITERATOR:
				return validateCbpmnIterator((CbpmnIterator)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessModel(ProcessModel processModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranch(Branch branch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(branch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecisionGateway(DecisionGateway decisionGateway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(decisionGateway, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlowNode(FlowNode flowNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flowNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLConstraint(OCLConstraint oclConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oclConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(event, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParallelGateway(ParallelGateway parallelGateway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parallelGateway, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSplitGateway(SplitGateway splitGateway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(splitGateway, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataObjectReference(DataObjectReference dataObjectReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataObjectReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataObjectReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataObjectReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataObjectReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataObjectReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataObjectReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataObjectReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataObjectReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataObjectReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataObjectReference_lowerBoundLessThanHigherBound(dataObjectReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataObjectReference_lowerBoundPositive(dataObjectReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataObjectReference_higherBoundPositive(dataObjectReference, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the lowerBoundLessThanHigherBound constraint of '<em>Data Object Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_OBJECT_REFERENCE__LOWER_BOUND_LESS_THAN_HIGHER_BOUND__EEXPRESSION = "higherBound = -1 or lowerBound <= higherBound";

	/**
	 * Validates the lowerBoundLessThanHigherBound constraint of '<em>Data Object Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataObjectReference_lowerBoundLessThanHigherBound(DataObjectReference dataObjectReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CbpmnPackage.Literals.DATA_OBJECT_REFERENCE,
				 dataObjectReference,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "lowerBoundLessThanHigherBound",
				 DATA_OBJECT_REFERENCE__LOWER_BOUND_LESS_THAN_HIGHER_BOUND__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the lowerBoundPositive constraint of '<em>Data Object Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_OBJECT_REFERENCE__LOWER_BOUND_POSITIVE__EEXPRESSION = "lowerBound>=0";

	/**
	 * Validates the lowerBoundPositive constraint of '<em>Data Object Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataObjectReference_lowerBoundPositive(DataObjectReference dataObjectReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CbpmnPackage.Literals.DATA_OBJECT_REFERENCE,
				 dataObjectReference,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "lowerBoundPositive",
				 DATA_OBJECT_REFERENCE__LOWER_BOUND_POSITIVE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the higherBoundPositive constraint of '<em>Data Object Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_OBJECT_REFERENCE__HIGHER_BOUND_POSITIVE__EEXPRESSION = "higherBound>=-1";

	/**
	 * Validates the higherBoundPositive constraint of '<em>Data Object Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataObjectReference_higherBoundPositive(DataObjectReference dataObjectReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CbpmnPackage.Literals.DATA_OBJECT_REFERENCE,
				 dataObjectReference,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "higherBoundPositive",
				 DATA_OBJECT_REFERENCE__HIGHER_BOUND_POSITIVE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessInstance(ProcessInstance processInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlowNodeInstance(FlowNodeInstance flowNodeInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flowNodeInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataObject(DataObject dataObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartEvent(StartEvent startEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(startEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndEvent(EndEvent endEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntermediateEvent(IntermediateEvent intermediateEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(intermediateEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityType(ActivityType activityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventType(EventType eventType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecisionType(DecisionType decisionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGatewayType(GatewayType gatewayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataObjectType(DataObjectType dataObjectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlowNodeInstanceStatus(FlowNodeInstanceStatus flowNodeInstanceStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCbpmnIterator(CbpmnIterator cbpmnIterator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CbpmnValidator
