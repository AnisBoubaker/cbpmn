/**
 */
package cbpmn.impl;

import cbpmn.Activity;
import cbpmn.ActivityType;
import cbpmn.Branch;
import cbpmn.CbpmnFactory;
import cbpmn.CbpmnPackage;
import cbpmn.DataObject;
import cbpmn.DataObjectReference;
import cbpmn.DataObjectType;
import cbpmn.DecisionGateway;
import cbpmn.DecisionType;
import cbpmn.EndEvent;
import cbpmn.Event;
import cbpmn.EventType;
import cbpmn.FlowNode;
import cbpmn.FlowNodeInstance;
import cbpmn.FlowNodeInstanceStatus;
import cbpmn.GatewayType;
import cbpmn.IntermediateEvent;
import cbpmn.OCLConstraint;
import cbpmn.ParallelGateway;
import cbpmn.ProcessInstance;
import cbpmn.ProcessModel;
import cbpmn.SplitGateway;
import cbpmn.StartEvent;
import cbpmn.util.CbpmnIterator;
import cbpmn.util.CbpmnValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CbpmnPackageImpl extends EPackageImpl implements CbpmnPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataObjectReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowNodeInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermediateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum activityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum decisionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gatewayTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataObjectTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flowNodeInstanceStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cbpmnIteratorEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cbpmn.CbpmnPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CbpmnPackageImpl() {
		super(eNS_URI, CbpmnFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CbpmnPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CbpmnPackage init() {
		if (isInited) return (CbpmnPackage)EPackage.Registry.INSTANCE.getEPackage(CbpmnPackage.eNS_URI);

		// Obtain or create and register package
		CbpmnPackageImpl theCbpmnPackage = (CbpmnPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CbpmnPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CbpmnPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCbpmnPackage.createPackageContents();

		// Initialize created meta-data
		theCbpmnPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCbpmnPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CbpmnValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCbpmnPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CbpmnPackage.eNS_URI, theCbpmnPackage);
		return theCbpmnPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessModel() {
		return processModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessModel_MainBranch() {
		return (EReference)processModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessModel_ProcessInvariants() {
		return (EReference)processModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessModel_Name() {
		return (EAttribute)processModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessModel__Iterator__CbpmnIterator() {
		return processModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessModel__Iterator__CbpmnIterator_FlowNode() {
		return processModelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessModel__GetRandomStartEvent() {
		return processModelEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_PreConditions() {
		return (EReference)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_PostConditions() {
		return (EReference)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Type() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Outputs() {
		return (EReference)activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_InvariabilityClauses() {
		return (EReference)activityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBranch() {
		return branchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranch_Nodes() {
		return (EReference)branchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBranch_Default() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranch_EntryConditions() {
		return (EReference)branchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranch_Gateway() {
		return (EReference)branchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBranch__GetFirstNode() {
		return branchEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBranch__GetLastNode() {
		return branchEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionGateway() {
		return decisionGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecisionGateway_Type() {
		return (EAttribute)decisionGatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDecisionGateway__AddBranchWithCondition__Branch_OCLConstraint_boolean() {
		return decisionGatewayEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDecisionGateway__GetDefaultBranch() {
		return decisionGatewayEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDecisionGateway__GetRandomBranch() {
		return decisionGatewayEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowNode() {
		return flowNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowNode_Branch() {
		return (EReference)flowNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowNode_Next() {
		return (EReference)flowNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowNode_Previous() {
		return (EReference)flowNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowNode_Inputs() {
		return (EReference)flowNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowNode_Name() {
		return (EAttribute)flowNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLConstraint() {
		return oclConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLConstraint_ConstraintName() {
		return (EAttribute)oclConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLConstraint_ConstraintStr() {
		return (EAttribute)oclConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLConstraint_Branch() {
		return (EReference)oclConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Trigger() {
		return (EReference)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelGateway() {
		return parallelGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplitGateway() {
		return splitGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSplitGateway_Branches() {
		return (EReference)splitGatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataObjectReference() {
		return dataObjectReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataObjectReference_Name() {
		return (EAttribute)dataObjectReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataObjectReference_LowerBound() {
		return (EAttribute)dataObjectReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataObjectReference_HigherBound() {
		return (EAttribute)dataObjectReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataObjectReference_DataObjectClass() {
		return (EReference)dataObjectReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessInstance() {
		return processInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessInstance_ProcessModel() {
		return (EReference)processInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessInstance_ExecutedNodes() {
		return (EReference)processInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessInstance_Id() {
		return (EAttribute)processInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessInstance_DataObjects() {
		return (EReference)processInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowNodeInstance() {
		return flowNodeInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowNodeInstance_NodeDef() {
		return (EReference)flowNodeInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowNodeInstance_Inputs() {
		return (EReference)flowNodeInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowNodeInstance_Outputs() {
		return (EReference)flowNodeInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowNodeInstance_ProcessInstance() {
		return (EReference)flowNodeInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowNodeInstance_Status() {
		return (EAttribute)flowNodeInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataObject() {
		return dataObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataObject_Type() {
		return (EReference)dataObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartEvent() {
		return startEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndEvent() {
		return endEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntermediateEvent() {
		return intermediateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActivityType() {
		return activityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventType() {
		return eventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDecisionType() {
		return decisionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGatewayType() {
		return gatewayTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataObjectType() {
		return dataObjectTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFlowNodeInstanceStatus() {
		return flowNodeInstanceStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCbpmnIterator() {
		return cbpmnIteratorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CbpmnFactory getCbpmnFactory() {
		return (CbpmnFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		processModelEClass = createEClass(PROCESS_MODEL);
		createEReference(processModelEClass, PROCESS_MODEL__MAIN_BRANCH);
		createEReference(processModelEClass, PROCESS_MODEL__PROCESS_INVARIANTS);
		createEAttribute(processModelEClass, PROCESS_MODEL__NAME);
		createEOperation(processModelEClass, PROCESS_MODEL___ITERATOR__CBPMNITERATOR);
		createEOperation(processModelEClass, PROCESS_MODEL___ITERATOR__CBPMNITERATOR_FLOWNODE);
		createEOperation(processModelEClass, PROCESS_MODEL___GET_RANDOM_START_EVENT);

		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__PRE_CONDITIONS);
		createEReference(activityEClass, ACTIVITY__POST_CONDITIONS);
		createEAttribute(activityEClass, ACTIVITY__TYPE);
		createEReference(activityEClass, ACTIVITY__OUTPUTS);
		createEReference(activityEClass, ACTIVITY__INVARIABILITY_CLAUSES);

		branchEClass = createEClass(BRANCH);
		createEReference(branchEClass, BRANCH__NODES);
		createEAttribute(branchEClass, BRANCH__DEFAULT);
		createEReference(branchEClass, BRANCH__ENTRY_CONDITIONS);
		createEReference(branchEClass, BRANCH__GATEWAY);
		createEOperation(branchEClass, BRANCH___GET_FIRST_NODE);
		createEOperation(branchEClass, BRANCH___GET_LAST_NODE);

		decisionGatewayEClass = createEClass(DECISION_GATEWAY);
		createEAttribute(decisionGatewayEClass, DECISION_GATEWAY__TYPE);
		createEOperation(decisionGatewayEClass, DECISION_GATEWAY___ADD_BRANCH_WITH_CONDITION__BRANCH_OCLCONSTRAINT_BOOLEAN);
		createEOperation(decisionGatewayEClass, DECISION_GATEWAY___GET_DEFAULT_BRANCH);
		createEOperation(decisionGatewayEClass, DECISION_GATEWAY___GET_RANDOM_BRANCH);

		flowNodeEClass = createEClass(FLOW_NODE);
		createEReference(flowNodeEClass, FLOW_NODE__BRANCH);
		createEAttribute(flowNodeEClass, FLOW_NODE__NAME);
		createEReference(flowNodeEClass, FLOW_NODE__NEXT);
		createEReference(flowNodeEClass, FLOW_NODE__PREVIOUS);
		createEReference(flowNodeEClass, FLOW_NODE__INPUTS);

		oclConstraintEClass = createEClass(OCL_CONSTRAINT);
		createEAttribute(oclConstraintEClass, OCL_CONSTRAINT__CONSTRAINT_NAME);
		createEAttribute(oclConstraintEClass, OCL_CONSTRAINT__CONSTRAINT_STR);
		createEReference(oclConstraintEClass, OCL_CONSTRAINT__BRANCH);

		eventEClass = createEClass(EVENT);
		createEReference(eventEClass, EVENT__TRIGGER);

		parallelGatewayEClass = createEClass(PARALLEL_GATEWAY);

		splitGatewayEClass = createEClass(SPLIT_GATEWAY);
		createEReference(splitGatewayEClass, SPLIT_GATEWAY__BRANCHES);

		dataObjectReferenceEClass = createEClass(DATA_OBJECT_REFERENCE);
		createEAttribute(dataObjectReferenceEClass, DATA_OBJECT_REFERENCE__NAME);
		createEAttribute(dataObjectReferenceEClass, DATA_OBJECT_REFERENCE__LOWER_BOUND);
		createEAttribute(dataObjectReferenceEClass, DATA_OBJECT_REFERENCE__HIGHER_BOUND);
		createEReference(dataObjectReferenceEClass, DATA_OBJECT_REFERENCE__DATA_OBJECT_CLASS);

		processInstanceEClass = createEClass(PROCESS_INSTANCE);
		createEReference(processInstanceEClass, PROCESS_INSTANCE__PROCESS_MODEL);
		createEReference(processInstanceEClass, PROCESS_INSTANCE__EXECUTED_NODES);
		createEAttribute(processInstanceEClass, PROCESS_INSTANCE__ID);
		createEReference(processInstanceEClass, PROCESS_INSTANCE__DATA_OBJECTS);

		flowNodeInstanceEClass = createEClass(FLOW_NODE_INSTANCE);
		createEReference(flowNodeInstanceEClass, FLOW_NODE_INSTANCE__NODE_DEF);
		createEReference(flowNodeInstanceEClass, FLOW_NODE_INSTANCE__INPUTS);
		createEReference(flowNodeInstanceEClass, FLOW_NODE_INSTANCE__OUTPUTS);
		createEReference(flowNodeInstanceEClass, FLOW_NODE_INSTANCE__PROCESS_INSTANCE);
		createEAttribute(flowNodeInstanceEClass, FLOW_NODE_INSTANCE__STATUS);

		dataObjectEClass = createEClass(DATA_OBJECT);
		createEReference(dataObjectEClass, DATA_OBJECT__TYPE);

		startEventEClass = createEClass(START_EVENT);

		endEventEClass = createEClass(END_EVENT);

		intermediateEventEClass = createEClass(INTERMEDIATE_EVENT);

		// Create enums
		activityTypeEEnum = createEEnum(ACTIVITY_TYPE);
		eventTypeEEnum = createEEnum(EVENT_TYPE);
		decisionTypeEEnum = createEEnum(DECISION_TYPE);
		gatewayTypeEEnum = createEEnum(GATEWAY_TYPE);
		dataObjectTypeEEnum = createEEnum(DATA_OBJECT_TYPE);
		flowNodeInstanceStatusEEnum = createEEnum(FLOW_NODE_INSTANCE_STATUS);

		// Create data types
		cbpmnIteratorEDataType = createEDataType(CBPMN_ITERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		activityEClass.getESuperTypes().add(this.getFlowNode());
		decisionGatewayEClass.getESuperTypes().add(this.getSplitGateway());
		eventEClass.getESuperTypes().add(this.getFlowNode());
		parallelGatewayEClass.getESuperTypes().add(this.getSplitGateway());
		splitGatewayEClass.getESuperTypes().add(this.getFlowNode());
		dataObjectEClass.getESuperTypes().add(theEcorePackage.getEObject());
		startEventEClass.getESuperTypes().add(this.getEvent());
		endEventEClass.getESuperTypes().add(this.getEvent());
		intermediateEventEClass.getESuperTypes().add(this.getEvent());

		// Initialize classes, features, and operations; add parameters
		initEClass(processModelEClass, ProcessModel.class, "ProcessModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessModel_MainBranch(), this.getBranch(), null, "mainBranch", null, 1, 1, ProcessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessModel_ProcessInvariants(), this.getOCLConstraint(), null, "processInvariants", null, 0, -1, ProcessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessModel_Name(), theEcorePackage.getEString(), "name", "DefaultProcess", 0, 1, ProcessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getProcessModel__Iterator__CbpmnIterator(), this.getCbpmnIterator(), "iterator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCbpmnIterator(), "iterator", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProcessModel__Iterator__CbpmnIterator_FlowNode(), this.getCbpmnIterator(), "iterator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCbpmnIterator(), "iterator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFlowNode(), "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProcessModel__GetRandomStartEvent(), this.getStartEvent(), "getRandomStartEvent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_PreConditions(), this.getOCLConstraint(), null, "preConditions", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_PostConditions(), this.getOCLConstraint(), null, "postConditions", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_Type(), this.getActivityType(), "type", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Outputs(), this.getDataObjectReference(), null, "outputs", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_InvariabilityClauses(), this.getOCLConstraint(), null, "invariabilityClauses", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(branchEClass, Branch.class, "Branch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBranch_Nodes(), this.getFlowNode(), this.getFlowNode_Branch(), "nodes", null, 1, -1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_Default(), theEcorePackage.getEBoolean(), "default", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBranch_EntryConditions(), this.getOCLConstraint(), this.getOCLConstraint_Branch(), "entryConditions", null, 0, -1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBranch_Gateway(), this.getSplitGateway(), this.getSplitGateway_Branches(), "gateway", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBranch__GetFirstNode(), this.getFlowNode(), "getFirstNode", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getBranch__GetLastNode(), this.getFlowNode(), "getLastNode", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(decisionGatewayEClass, DecisionGateway.class, "DecisionGateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecisionGateway_Type(), this.getDecisionType(), "type", "EXCLUSIVE", 0, 1, DecisionGateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDecisionGateway__AddBranchWithCondition__Branch_OCLConstraint_boolean(), null, "addBranchWithCondition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBranch(), "branch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOCLConstraint(), "condition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "default_", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDecisionGateway__GetDefaultBranch(), this.getBranch(), "getDefaultBranch", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDecisionGateway__GetRandomBranch(), this.getBranch(), "getRandomBranch", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(flowNodeEClass, FlowNode.class, "FlowNode", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowNode_Branch(), this.getBranch(), this.getBranch_Nodes(), "branch", null, 0, 1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowNode_Next(), this.getFlowNode(), this.getFlowNode_Previous(), "next", null, 0, 1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowNode_Previous(), this.getFlowNode(), this.getFlowNode_Next(), "previous", null, 0, 1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowNode_Inputs(), this.getDataObjectReference(), null, "inputs", null, 0, -1, FlowNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oclConstraintEClass, OCLConstraint.class, "OCLConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOCLConstraint_ConstraintName(), ecorePackage.getEString(), "constraintName", null, 1, 1, OCLConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOCLConstraint_ConstraintStr(), ecorePackage.getEString(), "constraintStr", null, 0, 1, OCLConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOCLConstraint_Branch(), this.getBranch(), this.getBranch_EntryConditions(), "branch", null, 0, 1, OCLConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvent_Trigger(), this.getOCLConstraint(), null, "trigger", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parallelGatewayEClass, ParallelGateway.class, "ParallelGateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(splitGatewayEClass, SplitGateway.class, "SplitGateway", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSplitGateway_Branches(), this.getBranch(), this.getBranch_Gateway(), "branches", null, 0, -1, SplitGateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataObjectReferenceEClass, DataObjectReference.class, "DataObjectReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataObjectReference_Name(), theEcorePackage.getEString(), "name", "", 1, 1, DataObjectReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataObjectReference_LowerBound(), ecorePackage.getEInt(), "lowerBound", "0", 1, 1, DataObjectReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataObjectReference_HigherBound(), ecorePackage.getEInt(), "higherBound", "1", 1, 1, DataObjectReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataObjectReference_DataObjectClass(), theEcorePackage.getEClass(), null, "dataObjectClass", null, 1, 1, DataObjectReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processInstanceEClass, ProcessInstance.class, "ProcessInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessInstance_ProcessModel(), this.getProcessModel(), null, "processModel", null, 1, 1, ProcessInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessInstance_ExecutedNodes(), this.getFlowNodeInstance(), this.getFlowNodeInstance_ProcessInstance(), "executedNodes", null, 0, -1, ProcessInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessInstance_Id(), theEcorePackage.getEString(), "id", null, 0, 1, ProcessInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessInstance_DataObjects(), theEcorePackage.getEObject(), null, "dataObjects", null, 0, -1, ProcessInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowNodeInstanceEClass, FlowNodeInstance.class, "FlowNodeInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowNodeInstance_NodeDef(), this.getFlowNode(), null, "nodeDef", null, 1, 1, FlowNodeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowNodeInstance_Inputs(), theEcorePackage.getEObject(), null, "inputs", null, 0, -1, FlowNodeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowNodeInstance_Outputs(), theEcorePackage.getEObject(), null, "outputs", null, 0, -1, FlowNodeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowNodeInstance_ProcessInstance(), this.getProcessInstance(), this.getProcessInstance_ExecutedNodes(), "processInstance", null, 1, 1, FlowNodeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowNodeInstance_Status(), this.getFlowNodeInstanceStatus(), "status", "SUCCESS", 0, 1, FlowNodeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataObjectEClass, DataObject.class, "DataObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataObject_Type(), theEcorePackage.getEClass(), null, "type", null, 1, 1, DataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startEventEClass, StartEvent.class, "StartEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(endEventEClass, EndEvent.class, "EndEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intermediateEventEClass, IntermediateEvent.class, "IntermediateEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(activityTypeEEnum, ActivityType.class, "ActivityType");
		addEEnumLiteral(activityTypeEEnum, ActivityType.MANUAL);
		addEEnumLiteral(activityTypeEEnum, ActivityType.RECEIVE);
		addEEnumLiteral(activityTypeEEnum, ActivityType.SEND);
		addEEnumLiteral(activityTypeEEnum, ActivityType.SERVICE);
		addEEnumLiteral(activityTypeEEnum, ActivityType.USER);
		addEEnumLiteral(activityTypeEEnum, ActivityType.BUSINESSRULE);

		initEEnum(eventTypeEEnum, EventType.class, "EventType");
		addEEnumLiteral(eventTypeEEnum, EventType.EENUM_LITERAL0);

		initEEnum(decisionTypeEEnum, DecisionType.class, "DecisionType");
		addEEnumLiteral(decisionTypeEEnum, DecisionType.EXCLUSIVE);
		addEEnumLiteral(decisionTypeEEnum, DecisionType.INCLUSIVE);

		initEEnum(gatewayTypeEEnum, GatewayType.class, "GatewayType");
		addEEnumLiteral(gatewayTypeEEnum, GatewayType.SPLIT);
		addEEnumLiteral(gatewayTypeEEnum, GatewayType.JOIN);

		initEEnum(dataObjectTypeEEnum, DataObjectType.class, "DataObjectType");
		addEEnumLiteral(dataObjectTypeEEnum, DataObjectType.PHYSICAL);
		addEEnumLiteral(dataObjectTypeEEnum, DataObjectType.INFORMATIONAL);

		initEEnum(flowNodeInstanceStatusEEnum, FlowNodeInstanceStatus.class, "FlowNodeInstanceStatus");
		addEEnumLiteral(flowNodeInstanceStatusEEnum, FlowNodeInstanceStatus.INIT);
		addEEnumLiteral(flowNodeInstanceStatusEEnum, FlowNodeInstanceStatus.STARTED);
		addEEnumLiteral(flowNodeInstanceStatusEEnum, FlowNodeInstanceStatus.INTERRUPTED);
		addEEnumLiteral(flowNodeInstanceStatusEEnum, FlowNodeInstanceStatus.SUCCESS);
		addEEnumLiteral(flowNodeInstanceStatusEEnum, FlowNodeInstanceStatus.FAILED);

		// Initialize data types
		initEDataType(cbpmnIteratorEDataType, CbpmnIterator.class, "CbpmnIterator", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (dataObjectReferenceEClass, 
		   source, 
		   new String[] {
			 "constraints", "lowerBoundLessThanHigherBound lowerBoundPositive higherBoundPositive"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (dataObjectReferenceEClass, 
		   source, 
		   new String[] {
			 "lowerBoundLessThanHigherBound", "higherBound = -1 or lowerBound <= higherBound",
			 "lowerBoundPositive", "lowerBound>=0",
			 "higherBoundPositive", "higherBound>=-1"
		   });
	}

} //CbpmnPackageImpl
