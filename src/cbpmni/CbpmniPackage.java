/**
 */
package cbpmni;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cbpmni.CbpmniFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface CbpmniPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cbpmni";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cbpmni/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cbpmni";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CbpmniPackage eINSTANCE = cbpmni.impl.CbpmniPackageImpl.init();

	/**
	 * The meta object id for the '{@link cbpmni.impl.ProcessInstImpl <em>Process Inst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmni.impl.ProcessInstImpl
	 * @see cbpmni.impl.CbpmniPackageImpl#getProcessInst()
	 * @generated
	 */
	int PROCESS_INST = 0;

	/**
	 * The feature id for the '<em><b>Process Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INST__PROCESS_DEF = 0;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INST__TOKENS = 1;

	/**
	 * The feature id for the '<em><b>Flow Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INST__FLOW_NODES = 2;

	/**
	 * The number of structural features of the '<em>Process Inst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INST_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Setup Process Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INST___SETUP_PROCESS_INSTANCE = 0;

	/**
	 * The number of operations of the '<em>Process Inst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INST_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link cbpmni.impl.FlowNodeInstImpl <em>Flow Node Inst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmni.impl.FlowNodeInstImpl
	 * @see cbpmni.impl.CbpmniPackageImpl#getFlowNodeInst()
	 * @generated
	 */
	int FLOW_NODE_INST = 1;

	/**
	 * The feature id for the '<em><b>Node Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_INST__NODE_DEF = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_INST__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_INST__NEXT = 2;

	/**
	 * The number of structural features of the '<em>Flow Node Inst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_INST_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>EOperation0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_INST___EOPERATION0 = 0;

	/**
	 * The number of operations of the '<em>Flow Node Inst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_INST_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link cbpmni.impl.ActivityInstImpl <em>Activity Inst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmni.impl.ActivityInstImpl
	 * @see cbpmni.impl.CbpmniPackageImpl#getActivityInst()
	 * @generated
	 */
	int ACTIVITY_INST = 2;

	/**
	 * The feature id for the '<em><b>Node Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INST__NODE_DEF = FLOW_NODE_INST__NODE_DEF;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INST__STATUS = FLOW_NODE_INST__STATUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INST__NEXT = FLOW_NODE_INST__NEXT;

	/**
	 * The feature id for the '<em><b>Preconditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INST__PRECONDITIONS = FLOW_NODE_INST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Postconditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INST__POSTCONDITIONS = FLOW_NODE_INST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INST__INPUTS = FLOW_NODE_INST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INST__OUTPUTS = FLOW_NODE_INST_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Activity Inst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INST_FEATURE_COUNT = FLOW_NODE_INST_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>EOperation0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INST___EOPERATION0 = FLOW_NODE_INST___EOPERATION0;

	/**
	 * The number of operations of the '<em>Activity Inst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INST_OPERATION_COUNT = FLOW_NODE_INST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cbpmni.impl.EventInstImpl <em>Event Inst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmni.impl.EventInstImpl
	 * @see cbpmni.impl.CbpmniPackageImpl#getEventInst()
	 * @generated
	 */
	int EVENT_INST = 3;

	/**
	 * The feature id for the '<em><b>Node Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INST__NODE_DEF = FLOW_NODE_INST__NODE_DEF;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INST__STATUS = FLOW_NODE_INST__STATUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INST__NEXT = FLOW_NODE_INST__NEXT;

	/**
	 * The number of structural features of the '<em>Event Inst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INST_FEATURE_COUNT = FLOW_NODE_INST_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>EOperation0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INST___EOPERATION0 = FLOW_NODE_INST___EOPERATION0;

	/**
	 * The number of operations of the '<em>Event Inst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INST_OPERATION_COUNT = FLOW_NODE_INST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cbpmni.impl.SplitInstImpl <em>Split Inst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmni.impl.SplitInstImpl
	 * @see cbpmni.impl.CbpmniPackageImpl#getSplitInst()
	 * @generated
	 */
	int SPLIT_INST = 4;

	/**
	 * The feature id for the '<em><b>Node Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_INST__NODE_DEF = FLOW_NODE_INST__NODE_DEF;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_INST__STATUS = FLOW_NODE_INST__STATUS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_INST__NEXT = FLOW_NODE_INST__NEXT;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_INST__BRANCHES = FLOW_NODE_INST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Split Inst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_INST_FEATURE_COUNT = FLOW_NODE_INST_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EOperation0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_INST___EOPERATION0 = FLOW_NODE_INST___EOPERATION0;

	/**
	 * The number of operations of the '<em>Split Inst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_INST_OPERATION_COUNT = FLOW_NODE_INST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cbpmni.impl.BranchInstImpl <em>Branch Inst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmni.impl.BranchInstImpl
	 * @see cbpmni.impl.CbpmniPackageImpl#getBranchInst()
	 * @generated
	 */
	int BRANCH_INST = 5;

	/**
	 * The feature id for the '<em><b>Branch Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_INST__BRANCH_DEF = 0;

	/**
	 * The number of structural features of the '<em>Branch Inst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_INST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Branch Inst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_INST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cbpmni.impl.ConstraintInstImpl <em>Constraint Inst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmni.impl.ConstraintInstImpl
	 * @see cbpmni.impl.CbpmniPackageImpl#getConstraintInst()
	 * @generated
	 */
	int CONSTRAINT_INST = 6;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_INST__EXTENSION = 0;

	/**
	 * The feature id for the '<em><b>Constraint Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_INST__CONSTRAINT_DEF = 1;

	/**
	 * The number of structural features of the '<em>Constraint Inst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_INST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Constraint Inst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_INST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cbpmni.FlowNodeStatusType <em>Flow Node Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmni.FlowNodeStatusType
	 * @see cbpmni.impl.CbpmniPackageImpl#getFlowNodeStatusType()
	 * @generated
	 */
	int FLOW_NODE_STATUS_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link cbpmni.ProcessInst <em>Process Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Inst</em>'.
	 * @see cbpmni.ProcessInst
	 * @generated
	 */
	EClass getProcessInst();

	/**
	 * Returns the meta object for the reference '{@link cbpmni.ProcessInst#getProcessDef <em>Process Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process Def</em>'.
	 * @see cbpmni.ProcessInst#getProcessDef()
	 * @see #getProcessInst()
	 * @generated
	 */
	EReference getProcessInst_ProcessDef();

	/**
	 * Returns the meta object for the reference list '{@link cbpmni.ProcessInst#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tokens</em>'.
	 * @see cbpmni.ProcessInst#getTokens()
	 * @see #getProcessInst()
	 * @generated
	 */
	EReference getProcessInst_Tokens();

	/**
	 * Returns the meta object for the containment reference list '{@link cbpmni.ProcessInst#getFlowNodes <em>Flow Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow Nodes</em>'.
	 * @see cbpmni.ProcessInst#getFlowNodes()
	 * @see #getProcessInst()
	 * @generated
	 */
	EReference getProcessInst_FlowNodes();

	/**
	 * Returns the meta object for the '{@link cbpmni.ProcessInst#setupProcessInstance() <em>Setup Process Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Setup Process Instance</em>' operation.
	 * @see cbpmni.ProcessInst#setupProcessInstance()
	 * @generated
	 */
	EOperation getProcessInst__SetupProcessInstance();

	/**
	 * Returns the meta object for class '{@link cbpmni.FlowNodeInst <em>Flow Node Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Node Inst</em>'.
	 * @see cbpmni.FlowNodeInst
	 * @generated
	 */
	EClass getFlowNodeInst();

	/**
	 * Returns the meta object for the reference '{@link cbpmni.FlowNodeInst#getNodeDef <em>Node Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node Def</em>'.
	 * @see cbpmni.FlowNodeInst#getNodeDef()
	 * @see #getFlowNodeInst()
	 * @generated
	 */
	EReference getFlowNodeInst_NodeDef();

	/**
	 * Returns the meta object for the attribute '{@link cbpmni.FlowNodeInst#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see cbpmni.FlowNodeInst#getStatus()
	 * @see #getFlowNodeInst()
	 * @generated
	 */
	EAttribute getFlowNodeInst_Status();

	/**
	 * Returns the meta object for the reference '{@link cbpmni.FlowNodeInst#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see cbpmni.FlowNodeInst#getNext()
	 * @see #getFlowNodeInst()
	 * @generated
	 */
	EReference getFlowNodeInst_Next();

	/**
	 * Returns the meta object for the '{@link cbpmni.FlowNodeInst#EOperation0() <em>EOperation0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>EOperation0</em>' operation.
	 * @see cbpmni.FlowNodeInst#EOperation0()
	 * @generated
	 */
	EOperation getFlowNodeInst__EOperation0();

	/**
	 * Returns the meta object for class '{@link cbpmni.ActivityInst <em>Activity Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Inst</em>'.
	 * @see cbpmni.ActivityInst
	 * @generated
	 */
	EClass getActivityInst();

	/**
	 * Returns the meta object for the reference list '{@link cbpmni.ActivityInst#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see cbpmni.ActivityInst#getInputs()
	 * @see #getActivityInst()
	 * @generated
	 */
	EReference getActivityInst_Inputs();

	/**
	 * Returns the meta object for the reference list '{@link cbpmni.ActivityInst#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outputs</em>'.
	 * @see cbpmni.ActivityInst#getOutputs()
	 * @see #getActivityInst()
	 * @generated
	 */
	EReference getActivityInst_Outputs();

	/**
	 * Returns the meta object for the containment reference list '{@link cbpmni.ActivityInst#getPreconditions <em>Preconditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preconditions</em>'.
	 * @see cbpmni.ActivityInst#getPreconditions()
	 * @see #getActivityInst()
	 * @generated
	 */
	EReference getActivityInst_Preconditions();

	/**
	 * Returns the meta object for the containment reference list '{@link cbpmni.ActivityInst#getPostconditions <em>Postconditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Postconditions</em>'.
	 * @see cbpmni.ActivityInst#getPostconditions()
	 * @see #getActivityInst()
	 * @generated
	 */
	EReference getActivityInst_Postconditions();

	/**
	 * Returns the meta object for class '{@link cbpmni.EventInst <em>Event Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Inst</em>'.
	 * @see cbpmni.EventInst
	 * @generated
	 */
	EClass getEventInst();

	/**
	 * Returns the meta object for class '{@link cbpmni.SplitInst <em>Split Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split Inst</em>'.
	 * @see cbpmni.SplitInst
	 * @generated
	 */
	EClass getSplitInst();

	/**
	 * Returns the meta object for the containment reference list '{@link cbpmni.SplitInst#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see cbpmni.SplitInst#getBranches()
	 * @see #getSplitInst()
	 * @generated
	 */
	EReference getSplitInst_Branches();

	/**
	 * Returns the meta object for class '{@link cbpmni.BranchInst <em>Branch Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch Inst</em>'.
	 * @see cbpmni.BranchInst
	 * @generated
	 */
	EClass getBranchInst();

	/**
	 * Returns the meta object for the reference '{@link cbpmni.BranchInst#getBranchDef <em>Branch Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Branch Def</em>'.
	 * @see cbpmni.BranchInst#getBranchDef()
	 * @see #getBranchInst()
	 * @generated
	 */
	EReference getBranchInst_BranchDef();

	/**
	 * Returns the meta object for class '{@link cbpmni.ConstraintInst <em>Constraint Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Inst</em>'.
	 * @see cbpmni.ConstraintInst
	 * @generated
	 */
	EClass getConstraintInst();

	/**
	 * Returns the meta object for the reference list '{@link cbpmni.ConstraintInst#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extension</em>'.
	 * @see cbpmni.ConstraintInst#getExtension()
	 * @see #getConstraintInst()
	 * @generated
	 */
	EReference getConstraintInst_Extension();

	/**
	 * Returns the meta object for the reference '{@link cbpmni.ConstraintInst#getConstraintDef <em>Constraint Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constraint Def</em>'.
	 * @see cbpmni.ConstraintInst#getConstraintDef()
	 * @see #getConstraintInst()
	 * @generated
	 */
	EReference getConstraintInst_ConstraintDef();

	/**
	 * Returns the meta object for enum '{@link cbpmni.FlowNodeStatusType <em>Flow Node Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flow Node Status Type</em>'.
	 * @see cbpmni.FlowNodeStatusType
	 * @generated
	 */
	EEnum getFlowNodeStatusType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CbpmniFactory getCbpmniFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cbpmni.impl.ProcessInstImpl <em>Process Inst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmni.impl.ProcessInstImpl
		 * @see cbpmni.impl.CbpmniPackageImpl#getProcessInst()
		 * @generated
		 */
		EClass PROCESS_INST = eINSTANCE.getProcessInst();

		/**
		 * The meta object literal for the '<em><b>Process Def</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_INST__PROCESS_DEF = eINSTANCE.getProcessInst_ProcessDef();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_INST__TOKENS = eINSTANCE.getProcessInst_Tokens();

		/**
		 * The meta object literal for the '<em><b>Flow Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_INST__FLOW_NODES = eINSTANCE.getProcessInst_FlowNodes();

		/**
		 * The meta object literal for the '<em><b>Setup Process Instance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESS_INST___SETUP_PROCESS_INSTANCE = eINSTANCE.getProcessInst__SetupProcessInstance();

		/**
		 * The meta object literal for the '{@link cbpmni.impl.FlowNodeInstImpl <em>Flow Node Inst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmni.impl.FlowNodeInstImpl
		 * @see cbpmni.impl.CbpmniPackageImpl#getFlowNodeInst()
		 * @generated
		 */
		EClass FLOW_NODE_INST = eINSTANCE.getFlowNodeInst();

		/**
		 * The meta object literal for the '<em><b>Node Def</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE_INST__NODE_DEF = eINSTANCE.getFlowNodeInst_NodeDef();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_NODE_INST__STATUS = eINSTANCE.getFlowNodeInst_Status();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE_INST__NEXT = eINSTANCE.getFlowNodeInst_Next();

		/**
		 * The meta object literal for the '<em><b>EOperation0</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FLOW_NODE_INST___EOPERATION0 = eINSTANCE.getFlowNodeInst__EOperation0();

		/**
		 * The meta object literal for the '{@link cbpmni.impl.ActivityInstImpl <em>Activity Inst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmni.impl.ActivityInstImpl
		 * @see cbpmni.impl.CbpmniPackageImpl#getActivityInst()
		 * @generated
		 */
		EClass ACTIVITY_INST = eINSTANCE.getActivityInst();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_INST__INPUTS = eINSTANCE.getActivityInst_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_INST__OUTPUTS = eINSTANCE.getActivityInst_Outputs();

		/**
		 * The meta object literal for the '<em><b>Preconditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_INST__PRECONDITIONS = eINSTANCE.getActivityInst_Preconditions();

		/**
		 * The meta object literal for the '<em><b>Postconditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_INST__POSTCONDITIONS = eINSTANCE.getActivityInst_Postconditions();

		/**
		 * The meta object literal for the '{@link cbpmni.impl.EventInstImpl <em>Event Inst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmni.impl.EventInstImpl
		 * @see cbpmni.impl.CbpmniPackageImpl#getEventInst()
		 * @generated
		 */
		EClass EVENT_INST = eINSTANCE.getEventInst();

		/**
		 * The meta object literal for the '{@link cbpmni.impl.SplitInstImpl <em>Split Inst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmni.impl.SplitInstImpl
		 * @see cbpmni.impl.CbpmniPackageImpl#getSplitInst()
		 * @generated
		 */
		EClass SPLIT_INST = eINSTANCE.getSplitInst();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT_INST__BRANCHES = eINSTANCE.getSplitInst_Branches();

		/**
		 * The meta object literal for the '{@link cbpmni.impl.BranchInstImpl <em>Branch Inst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmni.impl.BranchInstImpl
		 * @see cbpmni.impl.CbpmniPackageImpl#getBranchInst()
		 * @generated
		 */
		EClass BRANCH_INST = eINSTANCE.getBranchInst();

		/**
		 * The meta object literal for the '<em><b>Branch Def</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH_INST__BRANCH_DEF = eINSTANCE.getBranchInst_BranchDef();

		/**
		 * The meta object literal for the '{@link cbpmni.impl.ConstraintInstImpl <em>Constraint Inst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmni.impl.ConstraintInstImpl
		 * @see cbpmni.impl.CbpmniPackageImpl#getConstraintInst()
		 * @generated
		 */
		EClass CONSTRAINT_INST = eINSTANCE.getConstraintInst();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_INST__EXTENSION = eINSTANCE.getConstraintInst_Extension();

		/**
		 * The meta object literal for the '<em><b>Constraint Def</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_INST__CONSTRAINT_DEF = eINSTANCE.getConstraintInst_ConstraintDef();

		/**
		 * The meta object literal for the '{@link cbpmni.FlowNodeStatusType <em>Flow Node Status Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmni.FlowNodeStatusType
		 * @see cbpmni.impl.CbpmniPackageImpl#getFlowNodeStatusType()
		 * @generated
		 */
		EEnum FLOW_NODE_STATUS_TYPE = eINSTANCE.getFlowNodeStatusType();

	}

} //CbpmniPackage
