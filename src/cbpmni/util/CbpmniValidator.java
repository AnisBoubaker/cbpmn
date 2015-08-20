/**
 */
package cbpmni.util;

import cbpmni.*;

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
 * @see cbpmni.CbpmniPackage
 * @generated
 */
public class CbpmniValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CbpmniValidator INSTANCE = new CbpmniValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "cbpmni";

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
	public CbpmniValidator() {
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
	  return CbpmniPackage.eINSTANCE;
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
			case CbpmniPackage.PROCESS_INST:
				return validateProcessInst((ProcessInst)value, diagnostics, context);
			case CbpmniPackage.FLOW_NODE_INST:
				return validateFlowNodeInst((FlowNodeInst)value, diagnostics, context);
			case CbpmniPackage.ACTIVITY_INST:
				return validateActivityInst((ActivityInst)value, diagnostics, context);
			case CbpmniPackage.EVENT_INST:
				return validateEventInst((EventInst)value, diagnostics, context);
			case CbpmniPackage.SPLIT_INST:
				return validateSplitInst((SplitInst)value, diagnostics, context);
			case CbpmniPackage.BRANCH_INST:
				return validateBranchInst((BranchInst)value, diagnostics, context);
			case CbpmniPackage.CONSTRAINT_INST:
				return validateConstraintInst((ConstraintInst)value, diagnostics, context);
			case CbpmniPackage.FLOW_NODE_STATUS_TYPE:
				return validateFlowNodeStatusType((FlowNodeStatusType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessInst(ProcessInst processInst, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processInst, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlowNodeInst(FlowNodeInst flowNodeInst, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flowNodeInst, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityInst(ActivityInst activityInst, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(activityInst, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(activityInst, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activityInst, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activityInst, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(activityInst, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activityInst, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(activityInst, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(activityInst, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(activityInst, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityInst_correctArguments(activityInst, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityInst_correctNodeDef(activityInst, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the correctArguments constraint of '<em>Activity Inst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTIVITY_INST__CORRECT_ARGUMENTS__EEXPRESSION = "true";

	/**
	 * Validates the correctArguments constraint of '<em>Activity Inst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityInst_correctArguments(ActivityInst activityInst, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CbpmniPackage.Literals.ACTIVITY_INST,
				 activityInst,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "correctArguments",
				 ACTIVITY_INST__CORRECT_ARGUMENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the correctNodeDef constraint of '<em>Activity Inst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTIVITY_INST__CORRECT_NODE_DEF__EEXPRESSION = "nodeDef.oclIsTypeOf(cbpmn::Activity)";

	/**
	 * Validates the correctNodeDef constraint of '<em>Activity Inst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityInst_correctNodeDef(ActivityInst activityInst, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CbpmniPackage.Literals.ACTIVITY_INST,
				 activityInst,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "correctNodeDef",
				 ACTIVITY_INST__CORRECT_NODE_DEF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventInst(EventInst eventInst, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventInst, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSplitInst(SplitInst splitInst, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(splitInst, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBranchInst(BranchInst branchInst, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(branchInst, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintInst(ConstraintInst constraintInst, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraintInst, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlowNodeStatusType(FlowNodeStatusType flowNodeStatusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //CbpmniValidator
