/**
 */
package cbpmni.impl;

import cbpmn.CbpmnPackage;

import cbpmni.ActivityInst;
import cbpmni.BranchInst;
import cbpmni.CbpmniFactory;
import cbpmni.CbpmniPackage;
import cbpmni.ConstraintInst;
import cbpmni.EventInst;
import cbpmni.FlowNodeInst;
import cbpmni.FlowNodeStatusType;
import cbpmni.ProcessInst;
import cbpmni.SplitInst;

import cbpmni.util.CbpmniValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class CbpmniPackageImpl extends EPackageImpl implements CbpmniPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processInstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowNodeInstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityInstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventInstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitInstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchInstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintInstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flowNodeStatusTypeEEnum = null;

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
	 * @see cbpmni.CbpmniPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CbpmniPackageImpl() {
		super(eNS_URI, CbpmniFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CbpmniPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CbpmniPackage init() {
		if (isInited) return (CbpmniPackage)EPackage.Registry.INSTANCE.getEPackage(CbpmniPackage.eNS_URI);

		// Obtain or create and register package
		CbpmniPackageImpl theCbpmniPackage = (CbpmniPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CbpmniPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CbpmniPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CbpmnPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCbpmniPackage.createPackageContents();

		// Initialize created meta-data
		theCbpmniPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCbpmniPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CbpmniValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCbpmniPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CbpmniPackage.eNS_URI, theCbpmniPackage);
		return theCbpmniPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessInst() {
		return processInstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessInst_ProcessDef() {
		return (EReference)processInstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessInst_Tokens() {
		return (EReference)processInstEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessInst_FlowNodes() {
		return (EReference)processInstEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessInst__SetupProcessInstance() {
		return processInstEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowNodeInst() {
		return flowNodeInstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowNodeInst_NodeDef() {
		return (EReference)flowNodeInstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowNodeInst_Status() {
		return (EAttribute)flowNodeInstEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowNodeInst_Next() {
		return (EReference)flowNodeInstEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFlowNodeInst__EOperation0() {
		return flowNodeInstEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityInst() {
		return activityInstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityInst_Inputs() {
		return (EReference)activityInstEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityInst_Outputs() {
		return (EReference)activityInstEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityInst_Preconditions() {
		return (EReference)activityInstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityInst_Postconditions() {
		return (EReference)activityInstEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventInst() {
		return eventInstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplitInst() {
		return splitInstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSplitInst_Branches() {
		return (EReference)splitInstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBranchInst() {
		return branchInstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranchInst_BranchDef() {
		return (EReference)branchInstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintInst() {
		return constraintInstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintInst_Extension() {
		return (EReference)constraintInstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintInst_ConstraintDef() {
		return (EReference)constraintInstEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFlowNodeStatusType() {
		return flowNodeStatusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CbpmniFactory getCbpmniFactory() {
		return (CbpmniFactory)getEFactoryInstance();
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
		processInstEClass = createEClass(PROCESS_INST);
		createEReference(processInstEClass, PROCESS_INST__PROCESS_DEF);
		createEReference(processInstEClass, PROCESS_INST__TOKENS);
		createEReference(processInstEClass, PROCESS_INST__FLOW_NODES);
		createEOperation(processInstEClass, PROCESS_INST___SETUP_PROCESS_INSTANCE);

		flowNodeInstEClass = createEClass(FLOW_NODE_INST);
		createEReference(flowNodeInstEClass, FLOW_NODE_INST__NODE_DEF);
		createEAttribute(flowNodeInstEClass, FLOW_NODE_INST__STATUS);
		createEReference(flowNodeInstEClass, FLOW_NODE_INST__NEXT);
		createEOperation(flowNodeInstEClass, FLOW_NODE_INST___EOPERATION0);

		activityInstEClass = createEClass(ACTIVITY_INST);
		createEReference(activityInstEClass, ACTIVITY_INST__PRECONDITIONS);
		createEReference(activityInstEClass, ACTIVITY_INST__POSTCONDITIONS);
		createEReference(activityInstEClass, ACTIVITY_INST__INPUTS);
		createEReference(activityInstEClass, ACTIVITY_INST__OUTPUTS);

		eventInstEClass = createEClass(EVENT_INST);

		splitInstEClass = createEClass(SPLIT_INST);
		createEReference(splitInstEClass, SPLIT_INST__BRANCHES);

		branchInstEClass = createEClass(BRANCH_INST);
		createEReference(branchInstEClass, BRANCH_INST__BRANCH_DEF);

		constraintInstEClass = createEClass(CONSTRAINT_INST);
		createEReference(constraintInstEClass, CONSTRAINT_INST__EXTENSION);
		createEReference(constraintInstEClass, CONSTRAINT_INST__CONSTRAINT_DEF);

		// Create enums
		flowNodeStatusTypeEEnum = createEEnum(FLOW_NODE_STATUS_TYPE);
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
		CbpmnPackage theCbpmnPackage = (CbpmnPackage)EPackage.Registry.INSTANCE.getEPackage(CbpmnPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		activityInstEClass.getESuperTypes().add(this.getFlowNodeInst());
		eventInstEClass.getESuperTypes().add(this.getFlowNodeInst());
		splitInstEClass.getESuperTypes().add(this.getFlowNodeInst());

		// Initialize classes, features, and operations; add parameters
		initEClass(processInstEClass, ProcessInst.class, "ProcessInst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessInst_ProcessDef(), theCbpmnPackage.getProcessModel(), null, "processDef", null, 0, 1, ProcessInst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessInst_Tokens(), this.getFlowNodeInst(), null, "tokens", null, 0, -1, ProcessInst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessInst_FlowNodes(), this.getFlowNodeInst(), null, "flowNodes", null, 0, -1, ProcessInst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getProcessInst__SetupProcessInstance(), null, "setupProcessInstance", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(flowNodeInstEClass, FlowNodeInst.class, "FlowNodeInst", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowNodeInst_NodeDef(), theCbpmnPackage.getFlowNode(), null, "nodeDef", null, 0, 1, FlowNodeInst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowNodeInst_Status(), this.getFlowNodeStatusType(), "status", "INACTIVE", 0, 1, FlowNodeInst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowNodeInst_Next(), this.getFlowNodeInst(), null, "next", null, 0, 1, FlowNodeInst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFlowNodeInst__EOperation0(), null, "EOperation0", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityInstEClass, ActivityInst.class, "ActivityInst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityInst_Preconditions(), this.getConstraintInst(), null, "preconditions", null, 0, -1, ActivityInst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityInst_Postconditions(), this.getConstraintInst(), null, "postconditions", null, 0, -1, ActivityInst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityInst_Inputs(), theEcorePackage.getEObject(), null, "inputs", null, 0, -1, ActivityInst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityInst_Outputs(), theEcorePackage.getEObject(), null, "outputs", null, 0, -1, ActivityInst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventInstEClass, EventInst.class, "EventInst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(splitInstEClass, SplitInst.class, "SplitInst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSplitInst_Branches(), this.getBranchInst(), null, "branches", null, 0, -1, SplitInst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(branchInstEClass, BranchInst.class, "BranchInst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBranchInst_BranchDef(), theCbpmnPackage.getBranch(), null, "branchDef", null, 0, 1, BranchInst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintInstEClass, ConstraintInst.class, "ConstraintInst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintInst_Extension(), ecorePackage.getEObject(), null, "extension", null, 0, -1, ConstraintInst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintInst_ConstraintDef(), theCbpmnPackage.getOCLConstraint(), null, "constraintDef", null, 1, 1, ConstraintInst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(flowNodeStatusTypeEEnum, FlowNodeStatusType.class, "FlowNodeStatusType");
		addEEnumLiteral(flowNodeStatusTypeEEnum, FlowNodeStatusType.INACTIVE);
		addEEnumLiteral(flowNodeStatusTypeEEnum, FlowNodeStatusType.READY);
		addEEnumLiteral(flowNodeStatusTypeEEnum, FlowNodeStatusType.RUNNING);
		addEEnumLiteral(flowNodeStatusTypeEEnum, FlowNodeStatusType.COMPLETED);
		addEEnumLiteral(flowNodeStatusTypeEEnum, FlowNodeStatusType.ABORTED);

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
		  (activityInstEClass, 
		   source, 
		   new String[] {
			 "constraints", "correctArguments correctNodeDef"
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
		  (activityInstEClass, 
		   source, 
		   new String[] {
			 "correctArguments", "true",
			 "correctNodeDef", "nodeDef.oclIsTypeOf(cbpmn::Activity)"
		   });
	}

} //CbpmniPackageImpl
