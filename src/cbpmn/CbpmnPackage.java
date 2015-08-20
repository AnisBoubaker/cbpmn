/**
 */
package cbpmn;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

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
 * @see cbpmn.CbpmnFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface CbpmnPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cbpmn";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.latece.uqam.ca/cbpmn/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cbpmn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CbpmnPackage eINSTANCE = cbpmn.impl.CbpmnPackageImpl.init();

	/**
	 * The meta object id for the '{@link cbpmn.impl.ProcessModelImpl <em>Process Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmn.impl.ProcessModelImpl
	 * @see cbpmn.impl.CbpmnPackageImpl#getProcessModel()
	 * @generated
	 */
	int PROCESS_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Main Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL__MAIN_BRANCH = 0;

	/**
	 * The feature id for the '<em><b>Process Invariants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL__PROCESS_INVARIANTS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL__NAME = 2;

	/**
	 * The number of structural features of the '<em>Process Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL___ITERATOR__CBPMNITERATOR = 0;

	/**
	 * The operation id for the '<em>Iterator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL___ITERATOR__CBPMNITERATOR_FLOWNODE = 1;

	/**
	 * The operation id for the '<em>Get Random Start Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL___GET_RANDOM_START_EVENT = 2;

	/**
	 * The number of operations of the '<em>Process Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_MODEL_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link cbpmn.FlowNode <em>Flow Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmn.FlowNode
	 * @see cbpmn.impl.CbpmnPackageImpl#getFlowNode()
	 * @generated
	 */
	int FLOW_NODE = 4;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__BRANCH = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__NEXT = 2;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__PREVIOUS = 3;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__INPUTS = 4;

	/**
	 * The number of structural features of the '<em>Flow Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Flow Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cbpmn.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmn.impl.ActivityImpl
	 * @see cbpmn.impl.CbpmnPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__BRANCH = FLOW_NODE__BRANCH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NEXT = FLOW_NODE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PREVIOUS = FLOW_NODE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INPUTS = FLOW_NODE__INPUTS;

	/**
	 * The feature id for the '<em><b>Pre Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PRE_CONDITIONS = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Post Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__POST_CONDITIONS = FLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TYPE = FLOW_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUTPUTS = FLOW_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Invariability Clauses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INVARIABILITY_CLAUSES = FLOW_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = FLOW_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cbpmn.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmn.impl.BranchImpl
	 * @see cbpmn.impl.CbpmnPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 2;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__NODES = 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__DEFAULT = 1;

	/**
	 * The feature id for the '<em><b>Entry Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__ENTRY_CONDITIONS = 2;

	/**
	 * The feature id for the '<em><b>Gateway</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__GATEWAY = 3;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get First Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH___GET_FIRST_NODE = 0;

	/**
	 * The operation id for the '<em>Get Last Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH___GET_LAST_NODE = 1;

	/**
	 * The number of operations of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link cbpmn.SplitGateway <em>Split Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmn.SplitGateway
	 * @see cbpmn.impl.CbpmnPackageImpl#getSplitGateway()
	 * @generated
	 */
	int SPLIT_GATEWAY = 8;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_GATEWAY__BRANCH = FLOW_NODE__BRANCH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_GATEWAY__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_GATEWAY__NEXT = FLOW_NODE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_GATEWAY__PREVIOUS = FLOW_NODE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_GATEWAY__INPUTS = FLOW_NODE__INPUTS;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_GATEWAY__BRANCHES = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Split Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_GATEWAY_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Split Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_GATEWAY_OPERATION_COUNT = FLOW_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cbpmn.impl.DecisionGatewayImpl <em>Decision Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmn.impl.DecisionGatewayImpl
	 * @see cbpmn.impl.CbpmnPackageImpl#getDecisionGateway()
	 * @generated
	 */
	int DECISION_GATEWAY = 3;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_GATEWAY__BRANCH = SPLIT_GATEWAY__BRANCH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_GATEWAY__NAME = SPLIT_GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_GATEWAY__NEXT = SPLIT_GATEWAY__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_GATEWAY__PREVIOUS = SPLIT_GATEWAY__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_GATEWAY__INPUTS = SPLIT_GATEWAY__INPUTS;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_GATEWAY__BRANCHES = SPLIT_GATEWAY__BRANCHES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_GATEWAY__TYPE = SPLIT_GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decision Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_GATEWAY_FEATURE_COUNT = SPLIT_GATEWAY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Branch With Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_GATEWAY___ADD_BRANCH_WITH_CONDITION__BRANCH_OCLCONSTRAINT_BOOLEAN = SPLIT_GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Default Branch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_GATEWAY___GET_DEFAULT_BRANCH = SPLIT_GATEWAY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Random Branch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_GATEWAY___GET_RANDOM_BRANCH = SPLIT_GATEWAY_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Decision Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_GATEWAY_OPERATION_COUNT = SPLIT_GATEWAY_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link cbpmn.impl.OCLConstraintImpl <em>OCL Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmn.impl.OCLConstraintImpl
	 * @see cbpmn.impl.CbpmnPackageImpl#getOCLConstraint()
	 * @generated
	 */
	int OCL_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Constraint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT__CONSTRAINT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Constraint Str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT__CONSTRAINT_STR = 1;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT__BRANCH = 2;

	/**
	 * The number of structural features of the '<em>OCL Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>OCL Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cbpmn.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmn.impl.EventImpl
	 * @see cbpmn.impl.CbpmnPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 6;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__BRANCH = FLOW_NODE__BRANCH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NEXT = FLOW_NODE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PREVIOUS = FLOW_NODE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__INPUTS = FLOW_NODE__INPUTS;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TRIGGER = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = FLOW_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cbpmn.impl.ParallelGatewayImpl <em>Parallel Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmn.impl.ParallelGatewayImpl
	 * @see cbpmn.impl.CbpmnPackageImpl#getParallelGateway()
	 * @generated
	 */
	int PARALLEL_GATEWAY = 7;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__BRANCH = SPLIT_GATEWAY__BRANCH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__NAME = SPLIT_GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__NEXT = SPLIT_GATEWAY__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__PREVIOUS = SPLIT_GATEWAY__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__INPUTS = SPLIT_GATEWAY__INPUTS;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__BRANCHES = SPLIT_GATEWAY__BRANCHES;

	/**
	 * The number of structural features of the '<em>Parallel Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_FEATURE_COUNT = SPLIT_GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parallel Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_OPERATION_COUNT = SPLIT_GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cbpmn.impl.DataObjectReferenceImpl <em>Data Object Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmn.impl.DataObjectReferenceImpl
	 * @see cbpmn.impl.CbpmnPackageImpl#getDataObjectReference()
	 * @generated
	 */
	int DATA_OBJECT_REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE__LOWER_BOUND = 1;

	/**
	 * The feature id for the '<em><b>Higher Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE__HIGHER_BOUND = 2;

	/**
	 * The feature id for the '<em><b>Data Object Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE__DATA_OBJECT_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Data Object Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data Object Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cbpmn.impl.ProcessInstanceImpl <em>Process Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmn.impl.ProcessInstanceImpl
	 * @see cbpmn.impl.CbpmnPackageImpl#getProcessInstance()
	 * @generated
	 */
	int PROCESS_INSTANCE = 10;

	/**
	 * The feature id for the '<em><b>Process Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INSTANCE__PROCESS_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Executed Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INSTANCE__EXECUTED_NODES = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INSTANCE__ID = 2;

	/**
	 * The feature id for the '<em><b>Data Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INSTANCE__DATA_OBJECTS = 3;

	/**
	 * The number of structural features of the '<em>Process Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INSTANCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Process Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cbpmn.impl.FlowNodeInstanceImpl <em>Flow Node Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmn.impl.FlowNodeInstanceImpl
	 * @see cbpmn.impl.CbpmnPackageImpl#getFlowNodeInstance()
	 * @generated
	 */
	int FLOW_NODE_INSTANCE = 11;

	/**
	 * The feature id for the '<em><b>Node Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_INSTANCE__NODE_DEF = 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_INSTANCE__INPUTS = 1;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_INSTANCE__OUTPUTS = 2;

	/**
	 * The feature id for the '<em><b>Process Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_INSTANCE__PROCESS_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_INSTANCE__STATUS = 4;

	/**
	 * The number of structural features of the '<em>Flow Node Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_INSTANCE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Flow Node Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cbpmn.impl.DataObjectImpl <em>Data Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmn.impl.DataObjectImpl
	 * @see cbpmn.impl.CbpmnPackageImpl#getDataObject()
	 * @generated
	 */
	int DATA_OBJECT = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__TYPE = EcorePackage.EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT___ECLASS = EcorePackage.EOBJECT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT___EIS_PROXY = EcorePackage.EOBJECT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT___ERESOURCE = EcorePackage.EOBJECT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT___ECONTAINER = EcorePackage.EOBJECT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT___ECONTAINING_FEATURE = EcorePackage.EOBJECT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT___ECONTAINMENT_FEATURE = EcorePackage.EOBJECT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT___ECONTENTS = EcorePackage.EOBJECT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT___EALL_CONTENTS = EcorePackage.EOBJECT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT___ECROSS_REFERENCES = EcorePackage.EOBJECT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT___EGET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN = EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT___ESET__ESTRUCTURALFEATURE_OBJECT = EcorePackage.EOBJECT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT___EIS_SET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT___EUNSET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT___EINVOKE__EOPERATION_ELIST = EcorePackage.EOBJECT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The number of operations of the '<em>Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_OPERATION_COUNT = EcorePackage.EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cbpmn.impl.StartEventImpl <em>Start Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmn.impl.StartEventImpl
	 * @see cbpmn.impl.CbpmnPackageImpl#getStartEvent()
	 * @generated
	 */
	int START_EVENT = 13;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__BRANCH = EVENT__BRANCH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__NEXT = EVENT__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__PREVIOUS = EVENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__INPUTS = EVENT__INPUTS;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__TRIGGER = EVENT__TRIGGER;

	/**
	 * The number of structural features of the '<em>Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cbpmn.impl.EndEventImpl <em>End Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmn.impl.EndEventImpl
	 * @see cbpmn.impl.CbpmnPackageImpl#getEndEvent()
	 * @generated
	 */
	int END_EVENT = 14;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__BRANCH = EVENT__BRANCH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__NEXT = EVENT__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__PREVIOUS = EVENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__INPUTS = EVENT__INPUTS;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__TRIGGER = EVENT__TRIGGER;

	/**
	 * The number of structural features of the '<em>End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cbpmn.impl.IntermediateEventImpl <em>Intermediate Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmn.impl.IntermediateEventImpl
	 * @see cbpmn.impl.CbpmnPackageImpl#getIntermediateEvent()
	 * @generated
	 */
	int INTERMEDIATE_EVENT = 15;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__BRANCH = EVENT__BRANCH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__NEXT = EVENT__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__PREVIOUS = EVENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__INPUTS = EVENT__INPUTS;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__TRIGGER = EVENT__TRIGGER;

	/**
	 * The number of structural features of the '<em>Intermediate Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Intermediate Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cbpmn.ActivityType <em>Activity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmn.ActivityType
	 * @see cbpmn.impl.CbpmnPackageImpl#getActivityType()
	 * @generated
	 */
	int ACTIVITY_TYPE = 16;

	/**
	 * The meta object id for the '{@link cbpmn.EventType <em>Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmn.EventType
	 * @see cbpmn.impl.CbpmnPackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 17;

	/**
	 * The meta object id for the '{@link cbpmn.DecisionType <em>Decision Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmn.DecisionType
	 * @see cbpmn.impl.CbpmnPackageImpl#getDecisionType()
	 * @generated
	 */
	int DECISION_TYPE = 18;

	/**
	 * The meta object id for the '{@link cbpmn.GatewayType <em>Gateway Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmn.GatewayType
	 * @see cbpmn.impl.CbpmnPackageImpl#getGatewayType()
	 * @generated
	 */
	int GATEWAY_TYPE = 19;

	/**
	 * The meta object id for the '{@link cbpmn.DataObjectType <em>Data Object Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmn.DataObjectType
	 * @see cbpmn.impl.CbpmnPackageImpl#getDataObjectType()
	 * @generated
	 */
	int DATA_OBJECT_TYPE = 20;


	/**
	 * The meta object id for the '{@link cbpmn.FlowNodeInstanceStatus <em>Flow Node Instance Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmn.FlowNodeInstanceStatus
	 * @see cbpmn.impl.CbpmnPackageImpl#getFlowNodeInstanceStatus()
	 * @generated
	 */
	int FLOW_NODE_INSTANCE_STATUS = 21;


	/**
	 * The meta object id for the '<em>Iterator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbpmn.util.CbpmnIterator
	 * @see cbpmn.impl.CbpmnPackageImpl#getCbpmnIterator()
	 * @generated
	 */
	int CBPMN_ITERATOR = 22;

	/**
	 * Returns the meta object for class '{@link cbpmn.ProcessModel <em>Process Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Model</em>'.
	 * @see cbpmn.ProcessModel
	 * @generated
	 */
	EClass getProcessModel();

	/**
	 * Returns the meta object for the containment reference '{@link cbpmn.ProcessModel#getMainBranch <em>Main Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Main Branch</em>'.
	 * @see cbpmn.ProcessModel#getMainBranch()
	 * @see #getProcessModel()
	 * @generated
	 */
	EReference getProcessModel_MainBranch();

	/**
	 * Returns the meta object for the containment reference list '{@link cbpmn.ProcessModel#getProcessInvariants <em>Process Invariants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process Invariants</em>'.
	 * @see cbpmn.ProcessModel#getProcessInvariants()
	 * @see #getProcessModel()
	 * @generated
	 */
	EReference getProcessModel_ProcessInvariants();

	/**
	 * Returns the meta object for the attribute '{@link cbpmn.ProcessModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cbpmn.ProcessModel#getName()
	 * @see #getProcessModel()
	 * @generated
	 */
	EAttribute getProcessModel_Name();

	/**
	 * Returns the meta object for the '{@link cbpmn.ProcessModel#iterator(cbpmn.util.CbpmnIterator) <em>Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Iterator</em>' operation.
	 * @see cbpmn.ProcessModel#iterator(cbpmn.util.CbpmnIterator)
	 * @generated
	 */
	EOperation getProcessModel__Iterator__CbpmnIterator();

	/**
	 * Returns the meta object for the '{@link cbpmn.ProcessModel#iterator(cbpmn.util.CbpmnIterator, cbpmn.FlowNode) <em>Iterator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Iterator</em>' operation.
	 * @see cbpmn.ProcessModel#iterator(cbpmn.util.CbpmnIterator, cbpmn.FlowNode)
	 * @generated
	 */
	EOperation getProcessModel__Iterator__CbpmnIterator_FlowNode();

	/**
	 * Returns the meta object for the '{@link cbpmn.ProcessModel#getRandomStartEvent() <em>Get Random Start Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Random Start Event</em>' operation.
	 * @see cbpmn.ProcessModel#getRandomStartEvent()
	 * @generated
	 */
	EOperation getProcessModel__GetRandomStartEvent();

	/**
	 * Returns the meta object for class '{@link cbpmn.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see cbpmn.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link cbpmn.Activity#getPreConditions <em>Pre Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre Conditions</em>'.
	 * @see cbpmn.Activity#getPreConditions()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_PreConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link cbpmn.Activity#getPostConditions <em>Post Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Conditions</em>'.
	 * @see cbpmn.Activity#getPostConditions()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_PostConditions();

	/**
	 * Returns the meta object for the attribute '{@link cbpmn.Activity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cbpmn.Activity#getType()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link cbpmn.Activity#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see cbpmn.Activity#getOutputs()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Outputs();

	/**
	 * Returns the meta object for the containment reference list '{@link cbpmn.Activity#getInvariabilityClauses <em>Invariability Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invariability Clauses</em>'.
	 * @see cbpmn.Activity#getInvariabilityClauses()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_InvariabilityClauses();

	/**
	 * Returns the meta object for class '{@link cbpmn.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see cbpmn.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the containment reference list '{@link cbpmn.Branch#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see cbpmn.Branch#getNodes()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_Nodes();

	/**
	 * Returns the meta object for the attribute '{@link cbpmn.Branch#isDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see cbpmn.Branch#isDefault()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Default();

	/**
	 * Returns the meta object for the containment reference list '{@link cbpmn.Branch#getEntryConditions <em>Entry Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Conditions</em>'.
	 * @see cbpmn.Branch#getEntryConditions()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_EntryConditions();

	/**
	 * Returns the meta object for the container reference '{@link cbpmn.Branch#getGateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gateway</em>'.
	 * @see cbpmn.Branch#getGateway()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_Gateway();

	/**
	 * Returns the meta object for the '{@link cbpmn.Branch#getFirstNode() <em>Get First Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get First Node</em>' operation.
	 * @see cbpmn.Branch#getFirstNode()
	 * @generated
	 */
	EOperation getBranch__GetFirstNode();

	/**
	 * Returns the meta object for the '{@link cbpmn.Branch#getLastNode() <em>Get Last Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Last Node</em>' operation.
	 * @see cbpmn.Branch#getLastNode()
	 * @generated
	 */
	EOperation getBranch__GetLastNode();

	/**
	 * Returns the meta object for class '{@link cbpmn.DecisionGateway <em>Decision Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Gateway</em>'.
	 * @see cbpmn.DecisionGateway
	 * @generated
	 */
	EClass getDecisionGateway();

	/**
	 * Returns the meta object for the attribute '{@link cbpmn.DecisionGateway#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cbpmn.DecisionGateway#getType()
	 * @see #getDecisionGateway()
	 * @generated
	 */
	EAttribute getDecisionGateway_Type();

	/**
	 * Returns the meta object for the '{@link cbpmn.DecisionGateway#addBranchWithCondition(cbpmn.Branch, cbpmn.OCLConstraint, boolean) <em>Add Branch With Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Branch With Condition</em>' operation.
	 * @see cbpmn.DecisionGateway#addBranchWithCondition(cbpmn.Branch, cbpmn.OCLConstraint, boolean)
	 * @generated
	 */
	EOperation getDecisionGateway__AddBranchWithCondition__Branch_OCLConstraint_boolean();

	/**
	 * Returns the meta object for the '{@link cbpmn.DecisionGateway#getDefaultBranch() <em>Get Default Branch</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Branch</em>' operation.
	 * @see cbpmn.DecisionGateway#getDefaultBranch()
	 * @generated
	 */
	EOperation getDecisionGateway__GetDefaultBranch();

	/**
	 * Returns the meta object for the '{@link cbpmn.DecisionGateway#getRandomBranch() <em>Get Random Branch</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Random Branch</em>' operation.
	 * @see cbpmn.DecisionGateway#getRandomBranch()
	 * @generated
	 */
	EOperation getDecisionGateway__GetRandomBranch();

	/**
	 * Returns the meta object for class '{@link cbpmn.FlowNode <em>Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Node</em>'.
	 * @see cbpmn.FlowNode
	 * @generated
	 */
	EClass getFlowNode();

	/**
	 * Returns the meta object for the container reference '{@link cbpmn.FlowNode#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Branch</em>'.
	 * @see cbpmn.FlowNode#getBranch()
	 * @see #getFlowNode()
	 * @generated
	 */
	EReference getFlowNode_Branch();

	/**
	 * Returns the meta object for the reference '{@link cbpmn.FlowNode#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see cbpmn.FlowNode#getNext()
	 * @see #getFlowNode()
	 * @generated
	 */
	EReference getFlowNode_Next();

	/**
	 * Returns the meta object for the reference '{@link cbpmn.FlowNode#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see cbpmn.FlowNode#getPrevious()
	 * @see #getFlowNode()
	 * @generated
	 */
	EReference getFlowNode_Previous();

	/**
	 * Returns the meta object for the containment reference list '{@link cbpmn.FlowNode#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see cbpmn.FlowNode#getInputs()
	 * @see #getFlowNode()
	 * @generated
	 */
	EReference getFlowNode_Inputs();

	/**
	 * Returns the meta object for the attribute '{@link cbpmn.FlowNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cbpmn.FlowNode#getName()
	 * @see #getFlowNode()
	 * @generated
	 */
	EAttribute getFlowNode_Name();

	/**
	 * Returns the meta object for class '{@link cbpmn.OCLConstraint <em>OCL Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Constraint</em>'.
	 * @see cbpmn.OCLConstraint
	 * @generated
	 */
	EClass getOCLConstraint();

	/**
	 * Returns the meta object for the attribute '{@link cbpmn.OCLConstraint#getConstraintName <em>Constraint Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Name</em>'.
	 * @see cbpmn.OCLConstraint#getConstraintName()
	 * @see #getOCLConstraint()
	 * @generated
	 */
	EAttribute getOCLConstraint_ConstraintName();

	/**
	 * Returns the meta object for the attribute '{@link cbpmn.OCLConstraint#getConstraintStr <em>Constraint Str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Str</em>'.
	 * @see cbpmn.OCLConstraint#getConstraintStr()
	 * @see #getOCLConstraint()
	 * @generated
	 */
	EAttribute getOCLConstraint_ConstraintStr();

	/**
	 * Returns the meta object for the container reference '{@link cbpmn.OCLConstraint#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Branch</em>'.
	 * @see cbpmn.OCLConstraint#getBranch()
	 * @see #getOCLConstraint()
	 * @generated
	 */
	EReference getOCLConstraint_Branch();

	/**
	 * Returns the meta object for class '{@link cbpmn.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see cbpmn.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the containment reference '{@link cbpmn.Event#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger</em>'.
	 * @see cbpmn.Event#getTrigger()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Trigger();

	/**
	 * Returns the meta object for class '{@link cbpmn.ParallelGateway <em>Parallel Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Gateway</em>'.
	 * @see cbpmn.ParallelGateway
	 * @generated
	 */
	EClass getParallelGateway();

	/**
	 * Returns the meta object for class '{@link cbpmn.SplitGateway <em>Split Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split Gateway</em>'.
	 * @see cbpmn.SplitGateway
	 * @generated
	 */
	EClass getSplitGateway();

	/**
	 * Returns the meta object for the containment reference list '{@link cbpmn.SplitGateway#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see cbpmn.SplitGateway#getBranches()
	 * @see #getSplitGateway()
	 * @generated
	 */
	EReference getSplitGateway_Branches();

	/**
	 * Returns the meta object for class '{@link cbpmn.DataObjectReference <em>Data Object Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Object Reference</em>'.
	 * @see cbpmn.DataObjectReference
	 * @generated
	 */
	EClass getDataObjectReference();

	/**
	 * Returns the meta object for the attribute '{@link cbpmn.DataObjectReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cbpmn.DataObjectReference#getName()
	 * @see #getDataObjectReference()
	 * @generated
	 */
	EAttribute getDataObjectReference_Name();

	/**
	 * Returns the meta object for the attribute '{@link cbpmn.DataObjectReference#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see cbpmn.DataObjectReference#getLowerBound()
	 * @see #getDataObjectReference()
	 * @generated
	 */
	EAttribute getDataObjectReference_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link cbpmn.DataObjectReference#getHigherBound <em>Higher Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Higher Bound</em>'.
	 * @see cbpmn.DataObjectReference#getHigherBound()
	 * @see #getDataObjectReference()
	 * @generated
	 */
	EAttribute getDataObjectReference_HigherBound();

	/**
	 * Returns the meta object for the reference '{@link cbpmn.DataObjectReference#getDataObjectClass <em>Data Object Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Object Class</em>'.
	 * @see cbpmn.DataObjectReference#getDataObjectClass()
	 * @see #getDataObjectReference()
	 * @generated
	 */
	EReference getDataObjectReference_DataObjectClass();

	/**
	 * Returns the meta object for class '{@link cbpmn.ProcessInstance <em>Process Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Instance</em>'.
	 * @see cbpmn.ProcessInstance
	 * @generated
	 */
	EClass getProcessInstance();

	/**
	 * Returns the meta object for the reference '{@link cbpmn.ProcessInstance#getProcessModel <em>Process Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process Model</em>'.
	 * @see cbpmn.ProcessInstance#getProcessModel()
	 * @see #getProcessInstance()
	 * @generated
	 */
	EReference getProcessInstance_ProcessModel();

	/**
	 * Returns the meta object for the containment reference list '{@link cbpmn.ProcessInstance#getExecutedNodes <em>Executed Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executed Nodes</em>'.
	 * @see cbpmn.ProcessInstance#getExecutedNodes()
	 * @see #getProcessInstance()
	 * @generated
	 */
	EReference getProcessInstance_ExecutedNodes();

	/**
	 * Returns the meta object for the attribute '{@link cbpmn.ProcessInstance#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cbpmn.ProcessInstance#getId()
	 * @see #getProcessInstance()
	 * @generated
	 */
	EAttribute getProcessInstance_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link cbpmn.ProcessInstance#getDataObjects <em>Data Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Objects</em>'.
	 * @see cbpmn.ProcessInstance#getDataObjects()
	 * @see #getProcessInstance()
	 * @generated
	 */
	EReference getProcessInstance_DataObjects();

	/**
	 * Returns the meta object for class '{@link cbpmn.FlowNodeInstance <em>Flow Node Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Node Instance</em>'.
	 * @see cbpmn.FlowNodeInstance
	 * @generated
	 */
	EClass getFlowNodeInstance();

	/**
	 * Returns the meta object for the reference '{@link cbpmn.FlowNodeInstance#getNodeDef <em>Node Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node Def</em>'.
	 * @see cbpmn.FlowNodeInstance#getNodeDef()
	 * @see #getFlowNodeInstance()
	 * @generated
	 */
	EReference getFlowNodeInstance_NodeDef();

	/**
	 * Returns the meta object for the reference list '{@link cbpmn.FlowNodeInstance#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see cbpmn.FlowNodeInstance#getInputs()
	 * @see #getFlowNodeInstance()
	 * @generated
	 */
	EReference getFlowNodeInstance_Inputs();

	/**
	 * Returns the meta object for the reference list '{@link cbpmn.FlowNodeInstance#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outputs</em>'.
	 * @see cbpmn.FlowNodeInstance#getOutputs()
	 * @see #getFlowNodeInstance()
	 * @generated
	 */
	EReference getFlowNodeInstance_Outputs();

	/**
	 * Returns the meta object for the container reference '{@link cbpmn.FlowNodeInstance#getProcessInstance <em>Process Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Process Instance</em>'.
	 * @see cbpmn.FlowNodeInstance#getProcessInstance()
	 * @see #getFlowNodeInstance()
	 * @generated
	 */
	EReference getFlowNodeInstance_ProcessInstance();

	/**
	 * Returns the meta object for the attribute '{@link cbpmn.FlowNodeInstance#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see cbpmn.FlowNodeInstance#getStatus()
	 * @see #getFlowNodeInstance()
	 * @generated
	 */
	EAttribute getFlowNodeInstance_Status();

	/**
	 * Returns the meta object for class '{@link cbpmn.DataObject <em>Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Object</em>'.
	 * @see cbpmn.DataObject
	 * @generated
	 */
	EClass getDataObject();

	/**
	 * Returns the meta object for the reference '{@link cbpmn.DataObject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see cbpmn.DataObject#getType()
	 * @see #getDataObject()
	 * @generated
	 */
	EReference getDataObject_Type();

	/**
	 * Returns the meta object for class '{@link cbpmn.StartEvent <em>Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Event</em>'.
	 * @see cbpmn.StartEvent
	 * @generated
	 */
	EClass getStartEvent();

	/**
	 * Returns the meta object for class '{@link cbpmn.EndEvent <em>End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Event</em>'.
	 * @see cbpmn.EndEvent
	 * @generated
	 */
	EClass getEndEvent();

	/**
	 * Returns the meta object for class '{@link cbpmn.IntermediateEvent <em>Intermediate Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Event</em>'.
	 * @see cbpmn.IntermediateEvent
	 * @generated
	 */
	EClass getIntermediateEvent();

	/**
	 * Returns the meta object for enum '{@link cbpmn.ActivityType <em>Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Activity Type</em>'.
	 * @see cbpmn.ActivityType
	 * @generated
	 */
	EEnum getActivityType();

	/**
	 * Returns the meta object for enum '{@link cbpmn.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Type</em>'.
	 * @see cbpmn.EventType
	 * @generated
	 */
	EEnum getEventType();

	/**
	 * Returns the meta object for enum '{@link cbpmn.DecisionType <em>Decision Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Decision Type</em>'.
	 * @see cbpmn.DecisionType
	 * @generated
	 */
	EEnum getDecisionType();

	/**
	 * Returns the meta object for enum '{@link cbpmn.GatewayType <em>Gateway Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gateway Type</em>'.
	 * @see cbpmn.GatewayType
	 * @generated
	 */
	EEnum getGatewayType();

	/**
	 * Returns the meta object for enum '{@link cbpmn.DataObjectType <em>Data Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Object Type</em>'.
	 * @see cbpmn.DataObjectType
	 * @generated
	 */
	EEnum getDataObjectType();

	/**
	 * Returns the meta object for enum '{@link cbpmn.FlowNodeInstanceStatus <em>Flow Node Instance Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flow Node Instance Status</em>'.
	 * @see cbpmn.FlowNodeInstanceStatus
	 * @generated
	 */
	EEnum getFlowNodeInstanceStatus();

	/**
	 * Returns the meta object for data type '{@link cbpmn.util.CbpmnIterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Iterator</em>'.
	 * @see cbpmn.util.CbpmnIterator
	 * @model instanceClass="cbpmn.util.CbpmnIterator"
	 * @generated
	 */
	EDataType getCbpmnIterator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CbpmnFactory getCbpmnFactory();

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
		 * The meta object literal for the '{@link cbpmn.impl.ProcessModelImpl <em>Process Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmn.impl.ProcessModelImpl
		 * @see cbpmn.impl.CbpmnPackageImpl#getProcessModel()
		 * @generated
		 */
		EClass PROCESS_MODEL = eINSTANCE.getProcessModel();

		/**
		 * The meta object literal for the '<em><b>Main Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODEL__MAIN_BRANCH = eINSTANCE.getProcessModel_MainBranch();

		/**
		 * The meta object literal for the '<em><b>Process Invariants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_MODEL__PROCESS_INVARIANTS = eINSTANCE.getProcessModel_ProcessInvariants();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_MODEL__NAME = eINSTANCE.getProcessModel_Name();

		/**
		 * The meta object literal for the '<em><b>Iterator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESS_MODEL___ITERATOR__CBPMNITERATOR = eINSTANCE.getProcessModel__Iterator__CbpmnIterator();

		/**
		 * The meta object literal for the '<em><b>Iterator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESS_MODEL___ITERATOR__CBPMNITERATOR_FLOWNODE = eINSTANCE.getProcessModel__Iterator__CbpmnIterator_FlowNode();

		/**
		 * The meta object literal for the '<em><b>Get Random Start Event</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESS_MODEL___GET_RANDOM_START_EVENT = eINSTANCE.getProcessModel__GetRandomStartEvent();

		/**
		 * The meta object literal for the '{@link cbpmn.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmn.impl.ActivityImpl
		 * @see cbpmn.impl.CbpmnPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Pre Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__PRE_CONDITIONS = eINSTANCE.getActivity_PreConditions();

		/**
		 * The meta object literal for the '<em><b>Post Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__POST_CONDITIONS = eINSTANCE.getActivity_PostConditions();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__TYPE = eINSTANCE.getActivity_Type();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__OUTPUTS = eINSTANCE.getActivity_Outputs();

		/**
		 * The meta object literal for the '<em><b>Invariability Clauses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__INVARIABILITY_CLAUSES = eINSTANCE.getActivity_InvariabilityClauses();

		/**
		 * The meta object literal for the '{@link cbpmn.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmn.impl.BranchImpl
		 * @see cbpmn.impl.CbpmnPackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__NODES = eINSTANCE.getBranch_Nodes();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__DEFAULT = eINSTANCE.getBranch_Default();

		/**
		 * The meta object literal for the '<em><b>Entry Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__ENTRY_CONDITIONS = eINSTANCE.getBranch_EntryConditions();

		/**
		 * The meta object literal for the '<em><b>Gateway</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__GATEWAY = eINSTANCE.getBranch_Gateway();

		/**
		 * The meta object literal for the '<em><b>Get First Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BRANCH___GET_FIRST_NODE = eINSTANCE.getBranch__GetFirstNode();

		/**
		 * The meta object literal for the '<em><b>Get Last Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BRANCH___GET_LAST_NODE = eINSTANCE.getBranch__GetLastNode();

		/**
		 * The meta object literal for the '{@link cbpmn.impl.DecisionGatewayImpl <em>Decision Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmn.impl.DecisionGatewayImpl
		 * @see cbpmn.impl.CbpmnPackageImpl#getDecisionGateway()
		 * @generated
		 */
		EClass DECISION_GATEWAY = eINSTANCE.getDecisionGateway();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_GATEWAY__TYPE = eINSTANCE.getDecisionGateway_Type();

		/**
		 * The meta object literal for the '<em><b>Add Branch With Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECISION_GATEWAY___ADD_BRANCH_WITH_CONDITION__BRANCH_OCLCONSTRAINT_BOOLEAN = eINSTANCE.getDecisionGateway__AddBranchWithCondition__Branch_OCLConstraint_boolean();

		/**
		 * The meta object literal for the '<em><b>Get Default Branch</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECISION_GATEWAY___GET_DEFAULT_BRANCH = eINSTANCE.getDecisionGateway__GetDefaultBranch();

		/**
		 * The meta object literal for the '<em><b>Get Random Branch</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DECISION_GATEWAY___GET_RANDOM_BRANCH = eINSTANCE.getDecisionGateway__GetRandomBranch();

		/**
		 * The meta object literal for the '{@link cbpmn.FlowNode <em>Flow Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmn.FlowNode
		 * @see cbpmn.impl.CbpmnPackageImpl#getFlowNode()
		 * @generated
		 */
		EClass FLOW_NODE = eINSTANCE.getFlowNode();

		/**
		 * The meta object literal for the '<em><b>Branch</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE__BRANCH = eINSTANCE.getFlowNode_Branch();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE__NEXT = eINSTANCE.getFlowNode_Next();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE__PREVIOUS = eINSTANCE.getFlowNode_Previous();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE__INPUTS = eINSTANCE.getFlowNode_Inputs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_NODE__NAME = eINSTANCE.getFlowNode_Name();

		/**
		 * The meta object literal for the '{@link cbpmn.impl.OCLConstraintImpl <em>OCL Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmn.impl.OCLConstraintImpl
		 * @see cbpmn.impl.CbpmnPackageImpl#getOCLConstraint()
		 * @generated
		 */
		EClass OCL_CONSTRAINT = eINSTANCE.getOCLConstraint();

		/**
		 * The meta object literal for the '<em><b>Constraint Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_CONSTRAINT__CONSTRAINT_NAME = eINSTANCE.getOCLConstraint_ConstraintName();

		/**
		 * The meta object literal for the '<em><b>Constraint Str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_CONSTRAINT__CONSTRAINT_STR = eINSTANCE.getOCLConstraint_ConstraintStr();

		/**
		 * The meta object literal for the '<em><b>Branch</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CONSTRAINT__BRANCH = eINSTANCE.getOCLConstraint_Branch();

		/**
		 * The meta object literal for the '{@link cbpmn.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmn.impl.EventImpl
		 * @see cbpmn.impl.CbpmnPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__TRIGGER = eINSTANCE.getEvent_Trigger();

		/**
		 * The meta object literal for the '{@link cbpmn.impl.ParallelGatewayImpl <em>Parallel Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmn.impl.ParallelGatewayImpl
		 * @see cbpmn.impl.CbpmnPackageImpl#getParallelGateway()
		 * @generated
		 */
		EClass PARALLEL_GATEWAY = eINSTANCE.getParallelGateway();

		/**
		 * The meta object literal for the '{@link cbpmn.SplitGateway <em>Split Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmn.SplitGateway
		 * @see cbpmn.impl.CbpmnPackageImpl#getSplitGateway()
		 * @generated
		 */
		EClass SPLIT_GATEWAY = eINSTANCE.getSplitGateway();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT_GATEWAY__BRANCHES = eINSTANCE.getSplitGateway_Branches();

		/**
		 * The meta object literal for the '{@link cbpmn.impl.DataObjectReferenceImpl <em>Data Object Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmn.impl.DataObjectReferenceImpl
		 * @see cbpmn.impl.CbpmnPackageImpl#getDataObjectReference()
		 * @generated
		 */
		EClass DATA_OBJECT_REFERENCE = eINSTANCE.getDataObjectReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_OBJECT_REFERENCE__NAME = eINSTANCE.getDataObjectReference_Name();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_OBJECT_REFERENCE__LOWER_BOUND = eINSTANCE.getDataObjectReference_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Higher Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_OBJECT_REFERENCE__HIGHER_BOUND = eINSTANCE.getDataObjectReference_HigherBound();

		/**
		 * The meta object literal for the '<em><b>Data Object Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OBJECT_REFERENCE__DATA_OBJECT_CLASS = eINSTANCE.getDataObjectReference_DataObjectClass();

		/**
		 * The meta object literal for the '{@link cbpmn.impl.ProcessInstanceImpl <em>Process Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmn.impl.ProcessInstanceImpl
		 * @see cbpmn.impl.CbpmnPackageImpl#getProcessInstance()
		 * @generated
		 */
		EClass PROCESS_INSTANCE = eINSTANCE.getProcessInstance();

		/**
		 * The meta object literal for the '<em><b>Process Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_INSTANCE__PROCESS_MODEL = eINSTANCE.getProcessInstance_ProcessModel();

		/**
		 * The meta object literal for the '<em><b>Executed Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_INSTANCE__EXECUTED_NODES = eINSTANCE.getProcessInstance_ExecutedNodes();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_INSTANCE__ID = eINSTANCE.getProcessInstance_Id();

		/**
		 * The meta object literal for the '<em><b>Data Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_INSTANCE__DATA_OBJECTS = eINSTANCE.getProcessInstance_DataObjects();

		/**
		 * The meta object literal for the '{@link cbpmn.impl.FlowNodeInstanceImpl <em>Flow Node Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmn.impl.FlowNodeInstanceImpl
		 * @see cbpmn.impl.CbpmnPackageImpl#getFlowNodeInstance()
		 * @generated
		 */
		EClass FLOW_NODE_INSTANCE = eINSTANCE.getFlowNodeInstance();

		/**
		 * The meta object literal for the '<em><b>Node Def</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE_INSTANCE__NODE_DEF = eINSTANCE.getFlowNodeInstance_NodeDef();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE_INSTANCE__INPUTS = eINSTANCE.getFlowNodeInstance_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE_INSTANCE__OUTPUTS = eINSTANCE.getFlowNodeInstance_Outputs();

		/**
		 * The meta object literal for the '<em><b>Process Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE_INSTANCE__PROCESS_INSTANCE = eINSTANCE.getFlowNodeInstance_ProcessInstance();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_NODE_INSTANCE__STATUS = eINSTANCE.getFlowNodeInstance_Status();

		/**
		 * The meta object literal for the '{@link cbpmn.impl.DataObjectImpl <em>Data Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmn.impl.DataObjectImpl
		 * @see cbpmn.impl.CbpmnPackageImpl#getDataObject()
		 * @generated
		 */
		EClass DATA_OBJECT = eINSTANCE.getDataObject();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OBJECT__TYPE = eINSTANCE.getDataObject_Type();

		/**
		 * The meta object literal for the '{@link cbpmn.impl.StartEventImpl <em>Start Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmn.impl.StartEventImpl
		 * @see cbpmn.impl.CbpmnPackageImpl#getStartEvent()
		 * @generated
		 */
		EClass START_EVENT = eINSTANCE.getStartEvent();

		/**
		 * The meta object literal for the '{@link cbpmn.impl.EndEventImpl <em>End Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmn.impl.EndEventImpl
		 * @see cbpmn.impl.CbpmnPackageImpl#getEndEvent()
		 * @generated
		 */
		EClass END_EVENT = eINSTANCE.getEndEvent();

		/**
		 * The meta object literal for the '{@link cbpmn.impl.IntermediateEventImpl <em>Intermediate Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmn.impl.IntermediateEventImpl
		 * @see cbpmn.impl.CbpmnPackageImpl#getIntermediateEvent()
		 * @generated
		 */
		EClass INTERMEDIATE_EVENT = eINSTANCE.getIntermediateEvent();

		/**
		 * The meta object literal for the '{@link cbpmn.ActivityType <em>Activity Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmn.ActivityType
		 * @see cbpmn.impl.CbpmnPackageImpl#getActivityType()
		 * @generated
		 */
		EEnum ACTIVITY_TYPE = eINSTANCE.getActivityType();

		/**
		 * The meta object literal for the '{@link cbpmn.EventType <em>Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmn.EventType
		 * @see cbpmn.impl.CbpmnPackageImpl#getEventType()
		 * @generated
		 */
		EEnum EVENT_TYPE = eINSTANCE.getEventType();

		/**
		 * The meta object literal for the '{@link cbpmn.DecisionType <em>Decision Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmn.DecisionType
		 * @see cbpmn.impl.CbpmnPackageImpl#getDecisionType()
		 * @generated
		 */
		EEnum DECISION_TYPE = eINSTANCE.getDecisionType();

		/**
		 * The meta object literal for the '{@link cbpmn.GatewayType <em>Gateway Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmn.GatewayType
		 * @see cbpmn.impl.CbpmnPackageImpl#getGatewayType()
		 * @generated
		 */
		EEnum GATEWAY_TYPE = eINSTANCE.getGatewayType();

		/**
		 * The meta object literal for the '{@link cbpmn.DataObjectType <em>Data Object Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmn.DataObjectType
		 * @see cbpmn.impl.CbpmnPackageImpl#getDataObjectType()
		 * @generated
		 */
		EEnum DATA_OBJECT_TYPE = eINSTANCE.getDataObjectType();

		/**
		 * The meta object literal for the '{@link cbpmn.FlowNodeInstanceStatus <em>Flow Node Instance Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmn.FlowNodeInstanceStatus
		 * @see cbpmn.impl.CbpmnPackageImpl#getFlowNodeInstanceStatus()
		 * @generated
		 */
		EEnum FLOW_NODE_INSTANCE_STATUS = eINSTANCE.getFlowNodeInstanceStatus();

		/**
		 * The meta object literal for the '<em>Iterator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbpmn.util.CbpmnIterator
		 * @see cbpmn.impl.CbpmnPackageImpl#getCbpmnIterator()
		 * @generated
		 */
		EDataType CBPMN_ITERATOR = eINSTANCE.getCbpmnIterator();

	}

} //CbpmnPackage
