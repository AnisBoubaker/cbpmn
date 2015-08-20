:-lib(ic).
:-lib(ic_global).
:-lib(ic_global_gac).
:-lib(apply).
:-lib(apply_macros).
:-lib(lists).
:-lib(ech).
:- local struct(processmodel(oid,name)).
:- local struct(activity(oid,type)).
:- local struct(branch(oid)).
:- local struct(decisiongateway(oid,type)).
:- local struct(decisioncondition(oid,isDefault)).
:- local struct(flownode(oid,name)).
:- local struct(oclconstraint(oid,constraintName,constraintStr)).
:- local struct(event(oid)).
:- local struct(parallelgateway(oid)).
:- local struct(splitgateway(oid)).
:- local struct(dataobjectreference(oid,name,lowerBound,higherBound)).
:- local struct(processinstance(oid,id)).
:- local struct(flownodeinstance(oid,status)).
:- local struct(dataobject(oid)).
:- local struct(mainbranch_processmodel(processmodel,mainbranch)).
:- local struct(processinvariants_processmodel(processmodel,processinvariants)).
:- local struct(activity_preconditions(activity,preconditions)).
:- local struct(activity_postconditions(activity,postconditions)).
:- local struct(activity_inputs(activity,inputs)).
:- local struct(activity_outputs(activity,outputs)).
:- local struct(activity_invariabilityclauses(activity,invariabilityclauses)).
:- local struct(branch_entryconditions(branch,entryconditions)).
:- local struct(branch_nodes(branch,nodes)).
:- local struct(conditions_decisiongateway(decisiongateway,conditions)).
:- local struct(branch_decisioncondition(decisioncondition,branch)).
:- local struct(next_previous(previous,next)).
:- local struct(event_trigger(event,trigger)).
:- local struct(branches_splitgateway(splitgateway,branches)).
:- local struct(dataobjectclass_dataobjectreference(dataobjectreference,dataobjectclass)).
:- local struct(processinstance_processmodel(processinstance,processmodel)).
:- local struct(executednodes_processinstance(processinstance,executednodes)).
:- local struct(dataobjects_processinstance(processinstance,dataobjects)).
:- local struct(flownodeinstance_nodedef(flownodeinstance,nodedef)).
:- local struct(flownodeinstance_inputs(flownodeinstance,inputs)).
:- local struct(flownodeinstance_outputs(flownodeinstance,outputs)).
:- local struct(dataobject_type(dataobject,type)).

findSolutions(Instances):-

	%Cardinality definitions
	SProcessModel::0..5, SActivity::0..5, SBranch::0..5, SDecisionGateway::0..5, SDecisionCondition::0..5, SFlowNode::0..5, SOCLConstraint::0..5, SEvent::0..5, SParallelGateway::0..5, SSplitGateway::0..5, SDataObjectReference::0..5, SProcessInstance::0..5, SFlowNodeInstance::0..5, SDataObject::0..5, 
	Smainbranch_processmodel::0..10, Sprocessinvariants_processmodel::0..10, Sactivity_preconditions::0..10, Sactivity_postconditions::0..10, Sactivity_inputs::0..10, Sactivity_outputs::0..10, Sactivity_invariabilityclauses::0..10, Sbranch_entryconditions::0..10, Sbranch_nodes::0..10, Sconditions_decisiongateway::0..10, Sbranch_decisioncondition::0..10, Snext_previous::0..10, Sevent_trigger::0..10, Sbranches_splitgateway::0..10, Sdataobjectclass_dataobjectreference::0..10, Sprocessinstance_processmodel::0..10, Sexecutednodes_processinstance::0..10, Sdataobjects_processinstance::0..10, Sflownodeinstance_nodedef::0..10, Sflownodeinstance_inputs::0..10, Sflownodeinstance_outputs::0..10, Sdataobject_type::0..10, 
	CardVariables=[SProcessModel, SActivity, SBranch, SDecisionGateway, SDecisionCondition, SFlowNode, SOCLConstraint, SEvent, SParallelGateway, SSplitGateway, SDataObjectReference, SProcessInstance, SFlowNodeInstance, SDataObject, Smainbranch_processmodel, Sprocessinvariants_processmodel, Sactivity_preconditions, Sactivity_postconditions, Sactivity_inputs, Sactivity_outputs, Sactivity_invariabilityclauses, Sbranch_entryconditions, Sbranch_nodes, Sconditions_decisiongateway, Sbranch_decisioncondition, Snext_previous, Sevent_trigger, Sbranches_splitgateway, Sdataobjectclass_dataobjectreference, Sprocessinstance_processmodel, Sexecutednodes_processinstance, Sdataobjects_processinstance, Sflownodeinstance_nodedef, Sflownodeinstance_inputs, Sflownodeinstance_outputs, Sdataobject_type],
	
	CardNonAbsVariables=[SProcessModel, SActivity, SBranch, SDecisionGateway, SDecisionCondition, SFlowNode, SOCLConstraint, SEvent, SParallelGateway, SSplitGateway, SDataObjectReference, SProcessInstance, SFlowNodeInstance, SDataObject, Smainbranch_processmodel, Sprocessinvariants_processmodel, Sactivity_preconditions, Sactivity_postconditions, Sactivity_inputs, Sactivity_outputs, Sactivity_invariabilityclauses, Sbranch_entryconditions, Sbranch_nodes, Sconditions_decisiongateway, Sbranch_decisioncondition, Snext_previous, Sevent_trigger, Sbranches_splitgateway, Sdataobjectclass_dataobjectreference, Sprocessinstance_processmodel, Sexecutednodes_processinstance, Sdataobjects_processinstance, Sflownodeinstance_nodedef, Sflownodeinstance_inputs, Sflownodeinstance_outputs, Sdataobject_type],
	
	%Cardinality constraints
	% cardinality constraints derived from containment tree (compositions)
	SBranch #= Smainbranch_processmodel + Sbranches_splitgateway,
	SDecisionCondition #= Sconditions_decisiongateway,
	SFlowNode #= Sbranch_nodes,
	SOCLConstraint #= Sprocessinvariants_processmodel + Sactivity_preconditions + Sactivity_postconditions + Sactivity_invariabilityclauses,
	SDataObjectReference #= Sactivity_inputs + Sactivity_outputs,
	SFlowNodeInstance #= Sexecutednodes_processinstance,
strongSatisfiability(CardNonAbsVariables),
	constraintsGenFlowNodeActivityEventSplitGateway(SFlowNode, SActivity, SEvent, SSplitGateway),
	constraintsGenOCLConstraintDecisionCondition(SOCLConstraint, SDecisionCondition),
	constraintsGenSplitGatewayDecisionGatewayParallelGateway(SSplitGateway, SDecisionGateway, SParallelGateway),
	
	constraintsmainbranch_processmodelCard(CardVariables),
	constraintsprocessinvariants_processmodelCard(CardVariables),
	constraintsactivity_preconditionsCard(CardVariables),
	constraintsactivity_postconditionsCard(CardVariables),
	constraintsactivity_inputsCard(CardVariables),
	constraintsactivity_outputsCard(CardVariables),
	constraintsactivity_invariabilityclausesCard(CardVariables),
	constraintsbranch_entryconditionsCard(CardVariables),
	constraintsbranch_nodesCard(CardVariables),
	constraintsconditions_decisiongatewayCard(CardVariables),
	constraintsbranch_decisionconditionCard(CardVariables),
	constraintsnext_previousCard(CardVariables),
	constraintsevent_triggerCard(CardVariables),
	constraintsbranches_splitgatewayCard(CardVariables),
	constraintsdataobjectclass_dataobjectreferenceCard(CardVariables),
	constraintsprocessinstance_processmodelCard(CardVariables),
	constraintsexecutednodes_processinstanceCard(CardVariables),
	constraintsdataobjects_processinstanceCard(CardVariables),
	constraintsflownodeinstance_nodedefCard(CardVariables),
	constraintsflownodeinstance_inputsCard(CardVariables),
	constraintsflownodeinstance_outputsCard(CardVariables),
	constraintsdataobject_typeCard(CardVariables),
	
	%Instantiation of cardinality variables
	labeling(CardVariables),
	
	Instances = [OProcessModel, OActivity, OBranch, ODecisionGateway, ODecisionCondition, OFlowNode, OOCLConstraint, OEvent, OParallelGateway, OSplitGateway, ODataObjectReference, OProcessInstance, OFlowNodeInstance, ODataObject, Lmainbranch_processmodel, Lprocessinvariants_processmodel, Lactivity_preconditions, Lactivity_postconditions, Lactivity_inputs, Lactivity_outputs, Lactivity_invariabilityclauses, Lbranch_entryconditions, Lbranch_nodes, Lconditions_decisiongateway, Lbranch_decisioncondition, Lnext_previous, Levent_trigger, Lbranches_splitgateway, Ldataobjectclass_dataobjectreference, Lprocessinstance_processmodel, Lexecutednodes_processinstance, Ldataobjects_processinstance, Lflownodeinstance_nodedef, Lflownodeinstance_inputs, Lflownodeinstance_outputs, Ldataobject_type ],
	
	%Object creation
	creationProcessModel(OProcessModel, SProcessModel, SProcessModel, AtProcessModel),
	creationActivity(OActivity, SActivity, SFlowNode, AtActivity),
	creationBranch(OBranch, SBranch, SBranch, AtBranch),
	creationDecisionGateway(ODecisionGateway, SDecisionGateway, SFlowNode, AtDecisionGateway),
	creationDecisionCondition(ODecisionCondition, SDecisionCondition, SOCLConstraint, AtDecisionCondition),
	creationFlowNode(OFlowNode, SFlowNode, SFlowNode, AtFlowNode),
	creationOCLConstraint(OOCLConstraint, SOCLConstraint, SOCLConstraint, AtOCLConstraint),
	creationEvent(OEvent, SEvent, SFlowNode, AtEvent),
	creationParallelGateway(OParallelGateway, SParallelGateway, SFlowNode, AtParallelGateway),
	creationSplitGateway(OSplitGateway, SSplitGateway, SFlowNode, AtSplitGateway),
	creationDataObjectReference(ODataObjectReference, SDataObjectReference, SDataObjectReference, AtDataObjectReference),
	creationProcessInstance(OProcessInstance, SProcessInstance, SProcessInstance, AtProcessInstance),
	creationFlowNodeInstance(OFlowNodeInstance, SFlowNodeInstance, SFlowNodeInstance, AtFlowNodeInstance),
	creationDataObject(ODataObject, SDataObject, SEObject, AtDataObject),
	
	
	differentOids(OProcessModel),
	differentOids(OActivity),
	differentOids(OBranch),
	differentOids(ODecisionGateway),
	differentOids(ODecisionCondition),
	differentOids(OFlowNode),
	differentOids(OOCLConstraint),
	differentOids(OEvent),
	differentOids(OParallelGateway),
	differentOids(OSplitGateway),
	differentOids(ODataObjectReference),
	differentOids(OProcessInstance),
	differentOids(OFlowNodeInstance),
	differentOids(ODataObject),
	
	orderedInstances(OProcessModel),
	orderedInstances(OActivity),
	orderedInstances(OBranch),
	orderedInstances(ODecisionGateway),
	orderedInstances(ODecisionCondition),
	orderedInstances(OFlowNode),
	orderedInstances(OOCLConstraint),
	orderedInstances(OEvent),
	orderedInstances(OParallelGateway),
	orderedInstances(OSplitGateway),
	orderedInstances(ODataObjectReference),
	orderedInstances(OProcessInstance),
	orderedInstances(OFlowNodeInstance),
	orderedInstances(ODataObject),
	existingOidsActivityInFlowNode(OActivity, OFlowNode),
	existingOidsEventInFlowNode(OEvent, OFlowNode),
	existingOidsSplitGatewayInFlowNode(OSplitGateway, OFlowNode),
	existsOidInOneOf(OFlowNode, [OActivity, OEvent, OSplitGateway]),
	existingOidsDecisionConditionInOCLConstraint(ODecisionCondition, OOCLConstraint),
	existingOidsDecisionGatewayInSplitGateway(ODecisionGateway, OSplitGateway),
	existingOidsParallelGatewayInSplitGateway(OParallelGateway, OSplitGateway),
	existsOidInOneOf(OSplitGateway, [ODecisionGateway, OParallelGateway]),
	disjointInstancesActivityEventSplitGateway(OActivity, OEvent, OSplitGateway),
	disjointInstancesDecisionCondition(ODecisionCondition),
	disjointInstancesDecisionGatewayParallelGateway(ODecisionGateway, OParallelGateway),
	
	%Links creation
	creationmainbranch_processmodel(Lmainbranch_processmodel, Smainbranch_processmodel, Pmainbranch_processmodel, SProcessModel, SBranch),
	creationprocessinvariants_processmodel(Lprocessinvariants_processmodel, Sprocessinvariants_processmodel, Pprocessinvariants_processmodel, SProcessModel, SOCLConstraint),
	creationactivity_preconditions(Lactivity_preconditions, Sactivity_preconditions, Pactivity_preconditions, SFlowNode, SOCLConstraint),
	creationactivity_postconditions(Lactivity_postconditions, Sactivity_postconditions, Pactivity_postconditions, SFlowNode, SOCLConstraint),
	creationactivity_inputs(Lactivity_inputs, Sactivity_inputs, Pactivity_inputs, SFlowNode, SDataObjectReference),
	creationactivity_outputs(Lactivity_outputs, Sactivity_outputs, Pactivity_outputs, SFlowNode, SDataObjectReference),
	creationactivity_invariabilityclauses(Lactivity_invariabilityclauses, Sactivity_invariabilityclauses, Pactivity_invariabilityclauses, SFlowNode, SOCLConstraint),
	creationbranch_entryconditions(Lbranch_entryconditions, Sbranch_entryconditions, Pbranch_entryconditions, SBranch, SOCLConstraint),
	creationbranch_nodes(Lbranch_nodes, Sbranch_nodes, Pbranch_nodes, SBranch, SFlowNode),
	creationconditions_decisiongateway(Lconditions_decisiongateway, Sconditions_decisiongateway, Pconditions_decisiongateway, SFlowNode, SOCLConstraint),
	creationbranch_decisioncondition(Lbranch_decisioncondition, Sbranch_decisioncondition, Pbranch_decisioncondition, SOCLConstraint, SBranch),
	creationnext_previous(Lnext_previous, Snext_previous, Pnext_previous, SFlowNode, SFlowNode),
	creationevent_trigger(Levent_trigger, Sevent_trigger, Pevent_trigger, SFlowNode, SOCLConstraint),
	creationbranches_splitgateway(Lbranches_splitgateway, Sbranches_splitgateway, Pbranches_splitgateway, SFlowNode, SBranch),
	creationdataobjectclass_dataobjectreference(Ldataobjectclass_dataobjectreference, Sdataobjectclass_dataobjectreference, Pdataobjectclass_dataobjectreference, SDataObjectReference, SEModelElement),
	creationprocessinstance_processmodel(Lprocessinstance_processmodel, Sprocessinstance_processmodel, Pprocessinstance_processmodel, SProcessInstance, SProcessModel),
	creationexecutednodes_processinstance(Lexecutednodes_processinstance, Sexecutednodes_processinstance, Pexecutednodes_processinstance, SProcessInstance, SFlowNodeInstance),
	creationdataobjects_processinstance(Ldataobjects_processinstance, Sdataobjects_processinstance, Pdataobjects_processinstance, SProcessInstance, SEObject),
	creationflownodeinstance_nodedef(Lflownodeinstance_nodedef, Sflownodeinstance_nodedef, Pflownodeinstance_nodedef, SFlowNodeInstance, SFlowNode),
	creationflownodeinstance_inputs(Lflownodeinstance_inputs, Sflownodeinstance_inputs, Pflownodeinstance_inputs, SFlowNodeInstance, SEObject),
	creationflownodeinstance_outputs(Lflownodeinstance_outputs, Sflownodeinstance_outputs, Pflownodeinstance_outputs, SFlowNodeInstance, SEObject),
	creationdataobject_type(Ldataobject_type, Sdataobject_type, Pdataobject_type, SEObject, SEModelElement),
	differentLinks(Lmainbranch_processmodel),
	differentLinks(Lprocessinvariants_processmodel),
	differentLinks(Lactivity_preconditions),
	differentLinks(Lactivity_postconditions),
	differentLinks(Lactivity_inputs),
	differentLinks(Lactivity_outputs),
	differentLinks(Lactivity_invariabilityclauses),
	differentLinks(Lbranch_entryconditions),
	differentLinks(Lbranch_nodes),
	differentLinks(Lconditions_decisiongateway),
	differentLinks(Lbranch_decisioncondition),
	differentLinks(Lnext_previous),
	differentLinks(Levent_trigger),
	differentLinks(Lbranches_splitgateway),
	differentLinks(Ldataobjectclass_dataobjectreference),
	differentLinks(Lprocessinstance_processmodel),
	differentLinks(Lexecutednodes_processinstance),
	differentLinks(Ldataobjects_processinstance),
	differentLinks(Lflownodeinstance_nodedef),
	differentLinks(Lflownodeinstance_inputs),
	differentLinks(Lflownodeinstance_outputs),
	differentLinks(Ldataobject_type),
	orderedLinks(Instances,"mainbranch_processmodel"),
	orderedLinks(Instances,"processinvariants_processmodel"),
	orderedLinks(Instances,"activity_preconditions"),
	orderedLinks(Instances,"activity_postconditions"),
	orderedLinks(Instances,"activity_inputs"),
	orderedLinks(Instances,"activity_outputs"),
	orderedLinks(Instances,"activity_invariabilityclauses"),
	orderedLinks(Instances,"branch_entryconditions"),
	orderedLinks(Instances,"branch_nodes"),
	orderedLinks(Instances,"conditions_decisiongateway"),
	orderedLinks(Instances,"branch_decisioncondition"),
	orderedLinks(Instances,"next_previous"),
	orderedLinks(Instances,"event_trigger"),
	orderedLinks(Instances,"branches_splitgateway"),
	orderedLinks(Instances,"dataobjectclass_dataobjectreference"),
	orderedLinks(Instances,"processinstance_processmodel"),
	orderedLinks(Instances,"executednodes_processinstance"),
	orderedLinks(Instances,"dataobjects_processinstance"),
	orderedLinks(Instances,"flownodeinstance_nodedef"),
	orderedLinks(Instances,"flownodeinstance_inputs"),
	orderedLinks(Instances,"flownodeinstance_outputs"),
	orderedLinks(Instances,"dataobject_type"),
	noSharing([Lmainbranch_processmodel, Lbranches_splitgateway]),
	noSharing([Lprocessinvariants_processmodel, Lactivity_preconditions, Lactivity_postconditions, Lactivity_invariabilityclauses]),
	noSharing([Lactivity_inputs, Lactivity_outputs]),
	
	cardinalityLinksmainbranch_processmodel(Instances),
	cardinalityLinksprocessinvariants_processmodel(Instances),
	cardinalityLinksactivity_preconditions(Instances),
	cardinalityLinksactivity_postconditions(Instances),
	cardinalityLinksactivity_inputs(Instances),
	cardinalityLinksactivity_outputs(Instances),
	cardinalityLinksactivity_invariabilityclauses(Instances),
	cardinalityLinksbranch_entryconditions(Instances),
	cardinalityLinksbranch_nodes(Instances),
	cardinalityLinksconditions_decisiongateway(Instances),
	cardinalityLinksbranch_decisioncondition(Instances),
	cardinalityLinksnext_previous(Instances),
	cardinalityLinksevent_trigger(Instances),
	cardinalityLinksbranches_splitgateway(Instances),
	cardinalityLinksdataobjectclass_dataobjectreference(Instances),
	cardinalityLinksprocessinstance_processmodel(Instances),
	cardinalityLinksexecutednodes_processinstance(Instances),
	cardinalityLinksdataobjects_processinstance(Instances),
	cardinalityLinksflownodeinstance_nodedef(Instances),
	cardinalityLinksflownodeinstance_inputs(Instances),
	cardinalityLinksflownodeinstance_outputs(Instances),
	cardinalityLinksdataobject_type(Instances),
	
	AllAttributes = [Pmainbranch_processmodel, Pprocessinvariants_processmodel, Pactivity_preconditions, Pactivity_postconditions, Pactivity_inputs, Pactivity_outputs, Pactivity_invariabilityclauses, Pbranch_entryconditions, Pbranch_nodes, Pconditions_decisiongateway, Pbranch_decisioncondition, Pnext_previous, Pevent_trigger, Pbranches_splitgateway, Pdataobjectclass_dataobjectreference, Pprocessinstance_processmodel, Pexecutednodes_processinstance, Pdataobjects_processinstance, Pflownodeinstance_nodedef, Pflownodeinstance_inputs, Pflownodeinstance_outputs, Pdataobject_type, AtProcessModel, AtActivity, AtBranch, AtDecisionGateway, AtDecisionCondition, AtFlowNode, AtOCLConstraint, AtEvent, AtParallelGateway, AtSplitGateway, AtDataObjectReference, AtProcessInstance, AtFlowNodeInstance, AtDataObject ],
	flatten(AllAttributes, Attributes),
	labeling(Attributes),
	
lowerBoundLessThanHigherBound(Instances),
	lowerBoundPositive(Instances),
	higherBoundPositive(Instances),
	
str_labeling.
	constraintsGenFlowNodeActivityEventSplitGateway(SFlowNode, SActivity, SEvent, SSplitGateway):-
	constraintsAbstractDisjointSubtypesCard(SFlowNode, [SActivity,SEvent,SSplitGateway]).
	constraintsGenOCLConstraintDecisionCondition(SOCLConstraint, SDecisionCondition):-
	constraintsDisjointSubtypesCard(SOCLConstraint, [SDecisionCondition]).
	constraintsGenSplitGatewayDecisionGatewayParallelGateway(SSplitGateway, SDecisionGateway, SParallelGateway):-
	constraintsAbstractDisjointSubtypesCard(SSplitGateway, [SDecisionGateway,SParallelGateway]).

index("ProcessModel",1).
index("Activity",2).
index("Branch",3).
index("DecisionGateway",4).
index("DecisionCondition",5).
index("FlowNode",6).
index("OCLConstraint",7).
index("Event",8).
index("ParallelGateway",9).
index("SplitGateway",10).
index("DataObjectReference",11).
index("ProcessInstance",12).
index("FlowNodeInstance",13).
index("DataObject",14).
index("mainbranch_processmodel",15).
index("processinvariants_processmodel",16).
index("activity_preconditions",17).
index("activity_postconditions",18).
index("activity_inputs",19).
index("activity_outputs",20).
index("activity_invariabilityclauses",21).
index("branch_entryconditions",22).
index("branch_nodes",23).
index("conditions_decisiongateway",24).
index("branch_decisioncondition",25).
index("next_previous",26).
index("event_trigger",27).
index("branches_splitgateway",28).
index("dataobjectclass_dataobjectreference",29).
index("processinstance_processmodel",30).
index("executednodes_processinstance",31).
index("dataobjects_processinstance",32).
index("flownodeinstance_nodedef",33).
index("flownodeinstance_inputs",34).
index("flownodeinstance_outputs",35).
index("dataobject_type",36).
attIndex("ProcessModel","name",2).
attIndex("Activity","type",2).
attIndex("DecisionGateway","type",2).
attIndex("DecisionCondition","isDefault",2).
attIndex("FlowNode","name",2).
attIndex("OCLConstraint","constraintName",2).
attIndex("OCLConstraint","constraintStr",3).
attIndex("DataObjectReference","name",2).
attIndex("DataObjectReference","lowerBound",3).
attIndex("DataObjectReference","higherBound",4).
attIndex("ProcessInstance","id",2).
attIndex("FlowNodeInstance","status",2).
attType("ProcessModel","name","EString").
attType("Activity","type","ActivityType").
attType("DecisionGateway","type","DecisionType").
attType("DecisionCondition","isDefault","EBoolean").
attType("FlowNode","name","EString").
attType("OCLConstraint","constraintName","EString").
attType("OCLConstraint","constraintStr","EString").
attType("DataObjectReference","name","EString").
attType("DataObjectReference","lowerBound","EInt").
attType("DataObjectReference","higherBound","EInt").
attType("ProcessInstance","id","EString").
attType("FlowNodeInstance","status","FlowNodeInstanceStatus").

roleIndex("mainbranch_processmodel","processmodel",1).
roleIndex("mainbranch_processmodel","mainbranch",2).
roleIndex("processinvariants_processmodel","processmodel",1).
roleIndex("processinvariants_processmodel","processinvariants",2).
roleIndex("activity_preconditions","activity",1).
roleIndex("activity_preconditions","preconditions",2).
roleIndex("activity_postconditions","activity",1).
roleIndex("activity_postconditions","postconditions",2).
roleIndex("activity_inputs","activity",1).
roleIndex("activity_inputs","inputs",2).
roleIndex("activity_outputs","activity",1).
roleIndex("activity_outputs","outputs",2).
roleIndex("activity_invariabilityclauses","activity",1).
roleIndex("activity_invariabilityclauses","invariabilityclauses",2).
roleIndex("branch_entryconditions","branch",1).
roleIndex("branch_entryconditions","entryconditions",2).
roleIndex("branch_nodes","branch",1).
roleIndex("branch_nodes","nodes",2).
roleIndex("conditions_decisiongateway","decisiongateway",1).
roleIndex("conditions_decisiongateway","conditions",2).
roleIndex("branch_decisioncondition","decisioncondition",1).
roleIndex("branch_decisioncondition","branch",2).
roleIndex("next_previous","previous",1).
roleIndex("next_previous","next",2).
roleIndex("event_trigger","event",1).
roleIndex("event_trigger","trigger",2).
roleIndex("branches_splitgateway","splitgateway",1).
roleIndex("branches_splitgateway","branches",2).
roleIndex("dataobjectclass_dataobjectreference","dataobjectreference",1).
roleIndex("dataobjectclass_dataobjectreference","dataobjectclass",2).
roleIndex("processinstance_processmodel","processinstance",1).
roleIndex("processinstance_processmodel","processmodel",2).
roleIndex("executednodes_processinstance","processinstance",1).
roleIndex("executednodes_processinstance","executednodes",2).
roleIndex("dataobjects_processinstance","processinstance",1).
roleIndex("dataobjects_processinstance","dataobjects",2).
roleIndex("flownodeinstance_nodedef","flownodeinstance",1).
roleIndex("flownodeinstance_nodedef","nodedef",2).
roleIndex("flownodeinstance_inputs","flownodeinstance",1).
roleIndex("flownodeinstance_inputs","inputs",2).
roleIndex("flownodeinstance_outputs","flownodeinstance",1).
roleIndex("flownodeinstance_outputs","outputs",2).
roleIndex("dataobject_type","dataobject",1).
roleIndex("dataobject_type","type",2).
roleType("mainbranch_processmodel","processmodel","ProcessModel").
roleType("mainbranch_processmodel","mainbranch","Branch").
roleType("processinvariants_processmodel","processmodel","ProcessModel").
roleType("processinvariants_processmodel","processinvariants","OCLConstraint").
roleType("activity_preconditions","activity","Activity").
roleType("activity_preconditions","preconditions","OCLConstraint").
roleType("activity_postconditions","activity","Activity").
roleType("activity_postconditions","postconditions","OCLConstraint").
roleType("activity_inputs","activity","Activity").
roleType("activity_inputs","inputs","DataObjectReference").
roleType("activity_outputs","activity","Activity").
roleType("activity_outputs","outputs","DataObjectReference").
roleType("activity_invariabilityclauses","activity","Activity").
roleType("activity_invariabilityclauses","invariabilityclauses","OCLConstraint").
roleType("branch_entryconditions","branch","Branch").
roleType("branch_entryconditions","entryconditions","DecisionCondition").
roleType("branch_nodes","branch","Branch").
roleType("branch_nodes","nodes","FlowNode").
roleType("conditions_decisiongateway","decisiongateway","DecisionGateway").
roleType("conditions_decisiongateway","conditions","DecisionCondition").
roleType("branch_decisioncondition","decisioncondition","DecisionCondition").
roleType("branch_decisioncondition","branch","Branch").
roleType("next_previous","previous","FlowNode").
roleType("next_previous","next","FlowNode").
roleType("event_trigger","event","Event").
roleType("event_trigger","trigger","OCLConstraint").
roleType("branches_splitgateway","splitgateway","SplitGateway").
roleType("branches_splitgateway","branches","Branch").
roleType("dataobjectclass_dataobjectreference","dataobjectreference","DataObjectReference").
roleType("dataobjectclass_dataobjectreference","dataobjectclass","EClass").
roleType("processinstance_processmodel","processinstance","ProcessInstance").
roleType("processinstance_processmodel","processmodel","ProcessModel").
roleType("executednodes_processinstance","processinstance","ProcessInstance").
roleType("executednodes_processinstance","executednodes","FlowNodeInstance").
roleType("dataobjects_processinstance","processinstance","ProcessInstance").
roleType("dataobjects_processinstance","dataobjects","EObject").
roleType("flownodeinstance_nodedef","flownodeinstance","FlowNodeInstance").
roleType("flownodeinstance_nodedef","nodedef","FlowNode").
roleType("flownodeinstance_inputs","flownodeinstance","FlowNodeInstance").
roleType("flownodeinstance_inputs","inputs","EObject").
roleType("flownodeinstance_outputs","flownodeinstance","FlowNodeInstance").
roleType("flownodeinstance_outputs","outputs","EObject").
roleType("dataobject_type","dataobject","DataObject").
roleType("dataobject_type","type","EClass").
roleMin("mainbranch_processmodel","processmodel",0).
roleMin("mainbranch_processmodel","mainbranch",1).
roleMin("processinvariants_processmodel","processmodel",0).
roleMin("processinvariants_processmodel","processinvariants",0).
roleMin("activity_preconditions","activity",0).
roleMin("activity_preconditions","preconditions",0).
roleMin("activity_postconditions","activity",0).
roleMin("activity_postconditions","postconditions",0).
roleMin("activity_inputs","activity",0).
roleMin("activity_inputs","inputs",0).
roleMin("activity_outputs","activity",0).
roleMin("activity_outputs","outputs",0).
roleMin("activity_invariabilityclauses","activity",0).
roleMin("activity_invariabilityclauses","invariabilityclauses",0).
roleMin("branch_entryconditions","branch",0).
roleMin("branch_entryconditions","entryconditions",0).
roleMin("branch_nodes","branch",0).
roleMin("branch_nodes","nodes",1).
roleMin("conditions_decisiongateway","decisiongateway",0).
roleMin("conditions_decisiongateway","conditions",1).
roleMin("branch_decisioncondition","decisioncondition",0).
roleMin("branch_decisioncondition","branch",1).
roleMin("next_previous","previous",0).
roleMin("next_previous","next",0).
roleMin("event_trigger","event",0).
roleMin("event_trigger","trigger",0).
roleMin("branches_splitgateway","splitgateway",0).
roleMin("branches_splitgateway","branches",0).
roleMin("dataobjectclass_dataobjectreference","dataobjectreference",0).
roleMin("dataobjectclass_dataobjectreference","dataobjectclass",1).
roleMin("processinstance_processmodel","processinstance",0).
roleMin("processinstance_processmodel","processmodel",1).
roleMin("executednodes_processinstance","processinstance",1).
roleMin("executednodes_processinstance","executednodes",0).
roleMin("dataobjects_processinstance","processinstance",0).
roleMin("dataobjects_processinstance","dataobjects",0).
roleMin("flownodeinstance_nodedef","flownodeinstance",0).
roleMin("flownodeinstance_nodedef","nodedef",1).
roleMin("flownodeinstance_inputs","flownodeinstance",0).
roleMin("flownodeinstance_inputs","inputs",0).
roleMin("flownodeinstance_outputs","flownodeinstance",0).
roleMin("flownodeinstance_outputs","outputs",0).
roleMin("dataobject_type","dataobject",0).
roleMin("dataobject_type","type",1).
roleMax("mainbranch_processmodel","processmodel",1).
roleMax("mainbranch_processmodel","mainbranch",1).
roleMax("processinvariants_processmodel","processmodel",1).
roleMax("processinvariants_processmodel","processinvariants","*").
roleMax("activity_preconditions","activity",1).
roleMax("activity_preconditions","preconditions","*").
roleMax("activity_postconditions","activity",1).
roleMax("activity_postconditions","postconditions","*").
roleMax("activity_inputs","activity",1).
roleMax("activity_inputs","inputs","*").
roleMax("activity_outputs","activity",1).
roleMax("activity_outputs","outputs","*").
roleMax("activity_invariabilityclauses","activity",1).
roleMax("activity_invariabilityclauses","invariabilityclauses","*").
roleMax("branch_entryconditions","branch","*").
roleMax("branch_entryconditions","entryconditions",1).
roleMax("branch_nodes","branch",1).
roleMax("branch_nodes","nodes","*").
roleMax("conditions_decisiongateway","decisiongateway",1).
roleMax("conditions_decisiongateway","conditions","*").
roleMax("branch_decisioncondition","decisioncondition","*").
roleMax("branch_decisioncondition","branch",1).
roleMax("next_previous","previous",1).
roleMax("next_previous","next",1).
roleMax("event_trigger","event","*").
roleMax("event_trigger","trigger",1).
roleMax("branches_splitgateway","splitgateway",1).
roleMax("branches_splitgateway","branches","*").
roleMax("dataobjectclass_dataobjectreference","dataobjectreference","*").
roleMax("dataobjectclass_dataobjectreference","dataobjectclass",1).
roleMax("processinstance_processmodel","processinstance","*").
roleMax("processinstance_processmodel","processmodel",1).
roleMax("executednodes_processinstance","processinstance",1).
roleMax("executednodes_processinstance","executednodes","*").
roleMax("dataobjects_processinstance","processinstance",1).
roleMax("dataobjects_processinstance","dataobjects","*").
roleMax("flownodeinstance_nodedef","flownodeinstance","*").
roleMax("flownodeinstance_nodedef","nodedef",1).
roleMax("flownodeinstance_inputs","flownodeinstance","*").
roleMax("flownodeinstance_inputs","inputs","*").
roleMax("flownodeinstance_outputs","flownodeinstance","*").
roleMax("flownodeinstance_outputs","outputs","*").
roleMax("dataobject_type","dataobject","*").
roleMax("dataobject_type","type",1).

assocIsUnique("mainbranch_processmodel", 1).
assocIsUnique("processinvariants_processmodel", 1).
assocIsUnique("activity_preconditions", 1).
assocIsUnique("activity_postconditions", 1).
assocIsUnique("activity_inputs", 1).
assocIsUnique("activity_outputs", 1).
assocIsUnique("activity_invariabilityclauses", 1).
assocIsUnique("branch_entryconditions", 1).
assocIsUnique("branch_nodes", 1).
assocIsUnique("conditions_decisiongateway", 1).
assocIsUnique("branch_decisioncondition", 1).
assocIsUnique("next_previous", 1).
assocIsUnique("event_trigger", 1).
assocIsUnique("branches_splitgateway", 1).
assocIsUnique("dataobjectclass_dataobjectreference", 1).
assocIsUnique("processinstance_processmodel", 1).
assocIsUnique("executednodes_processinstance", 1).
assocIsUnique("dataobjects_processinstance", 1).
assocIsUnique("flownodeinstance_nodedef", 1).
assocIsUnique("flownodeinstance_inputs", 1).
assocIsUnique("flownodeinstance_outputs", 1).
assocIsUnique("dataobject_type", 1).

isSubTypeOf("Activity","FlowNode").
isSubTypeOf("DecisionGateway","SplitGateway").
isSubTypeOf("DecisionCondition","OCLConstraint").
isSubTypeOf("Event","FlowNode").
isSubTypeOf("ParallelGateway","SplitGateway").
isSubTypeOf("SplitGateway","FlowNode").
isSubTypeOf("DataObject","EObject").
disjointInstancesActivityEventSplitGateway(LActivity, LEvent, LSplitGateway) :-
	disjointOids([LActivity, LEvent, LSplitGateway]).
disjointInstancesDecisionCondition(LDecisionCondition) :-
	disjointOids([LDecisionCondition]).
disjointInstancesDecisionGatewayParallelGateway(LDecisionGateway, LParallelGateway) :-
	disjointOids([LDecisionGateway, LParallelGateway]).

strongSatisfiability(CardVariables):- strongSatisfiabilityConstraint(CardVariables).

constraintsmainbranch_processmodelCard(CardVariables):-constraintsBinAssocMultiplicities("mainbranch_processmodel", "processmodel", "mainbranch", CardVariables).
constraintsprocessinvariants_processmodelCard(CardVariables):-constraintsBinAssocMultiplicities("processinvariants_processmodel", "processmodel", "processinvariants", CardVariables).
constraintsactivity_preconditionsCard(CardVariables):-constraintsBinAssocMultiplicities("activity_preconditions", "activity", "preconditions", CardVariables).
constraintsactivity_postconditionsCard(CardVariables):-constraintsBinAssocMultiplicities("activity_postconditions", "activity", "postconditions", CardVariables).
constraintsactivity_inputsCard(CardVariables):-constraintsBinAssocMultiplicities("activity_inputs", "activity", "inputs", CardVariables).
constraintsactivity_outputsCard(CardVariables):-constraintsBinAssocMultiplicities("activity_outputs", "activity", "outputs", CardVariables).
constraintsactivity_invariabilityclausesCard(CardVariables):-constraintsBinAssocMultiplicities("activity_invariabilityclauses", "activity", "invariabilityclauses", CardVariables).
constraintsbranch_entryconditionsCard(CardVariables):-constraintsBinAssocMultiplicities("branch_entryconditions", "branch", "entryconditions", CardVariables).
constraintsbranch_nodesCard(CardVariables):-constraintsBinAssocMultiplicities("branch_nodes", "branch", "nodes", CardVariables).
constraintsconditions_decisiongatewayCard(CardVariables):-constraintsBinAssocMultiplicities("conditions_decisiongateway", "decisiongateway", "conditions", CardVariables).
constraintsbranch_decisionconditionCard(CardVariables):-constraintsBinAssocMultiplicities("branch_decisioncondition", "decisioncondition", "branch", CardVariables).
constraintsnext_previousCard(CardVariables):-constraintsBinAssocMultiplicities("next_previous", "previous", "next", CardVariables).
constraintsevent_triggerCard(CardVariables):-constraintsBinAssocMultiplicities("event_trigger", "event", "trigger", CardVariables).
constraintsbranches_splitgatewayCard(CardVariables):-constraintsBinAssocMultiplicities("branches_splitgateway", "splitgateway", "branches", CardVariables).
constraintsdataobjectclass_dataobjectreferenceCard(CardVariables):-constraintsBinAssocMultiplicities("dataobjectclass_dataobjectreference", "dataobjectreference", "dataobjectclass", CardVariables).
constraintsprocessinstance_processmodelCard(CardVariables):-constraintsBinAssocMultiplicities("processinstance_processmodel", "processinstance", "processmodel", CardVariables).
constraintsexecutednodes_processinstanceCard(CardVariables):-constraintsBinAssocMultiplicities("executednodes_processinstance", "processinstance", "executednodes", CardVariables).
constraintsdataobjects_processinstanceCard(CardVariables):-constraintsBinAssocMultiplicities("dataobjects_processinstance", "processinstance", "dataobjects", CardVariables).
constraintsflownodeinstance_nodedefCard(CardVariables):-constraintsBinAssocMultiplicities("flownodeinstance_nodedef", "flownodeinstance", "nodedef", CardVariables).
constraintsflownodeinstance_inputsCard(CardVariables):-constraintsBinAssocMultiplicities("flownodeinstance_inputs", "flownodeinstance", "inputs", CardVariables).
constraintsflownodeinstance_outputsCard(CardVariables):-constraintsBinAssocMultiplicities("flownodeinstance_outputs", "flownodeinstance", "outputs", CardVariables).
constraintsdataobject_typeCard(CardVariables):-constraintsBinAssocMultiplicities("dataobject_type", "dataobject", "type", CardVariables).

creationProcessModel(Instances, Size, _, Attributes):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Attributes), for(N, 1, Size) do
		Xi=processmodel{oid:N,name:Str2}, str_len(Str2,LenStr2),LenStr2#::0..10,
		 append([N],AtIn, AtOut)).

creationActivity(Instances, Size, MaxId, Attributes):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Attributes), param(MaxId) do
		Xi=activity{oid:Integer1,type:Int2}, Integer1::1..MaxId, Int2#::[1,10,20],
		 append([Integer1,Int2],AtIn, AtOut)).

creationBranch(Instances, Size, _, Attributes):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Attributes), for(N, 1, Size) do
		Xi=branch{oid:N}, append([N],AtIn, AtOut)).

creationDecisionGateway(Instances, Size, MaxId, Attributes):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Attributes), param(MaxId) do
		Xi=decisiongateway{oid:Integer1,type:Int2}, Integer1::1..MaxId, Int2#::[1,10,20],
		 append([Integer1,Int2],AtIn, AtOut)).

creationDecisionCondition(Instances, Size, MaxId, Attributes):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Attributes), param(MaxId) do
		Xi=decisioncondition{oid:Integer1,isDefault:Int2}, Integer1::1..MaxId, Int2#::[1,10,20],
		 append([Integer1,Int2],AtIn, AtOut)).

creationFlowNode(Instances, Size, _, Attributes):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Attributes), for(N, 1, Size) do
		Xi=flownode{oid:N,name:Str2}, str_len(Str2,LenStr2),LenStr2#::0..10,
		 append([N],AtIn, AtOut)).

creationOCLConstraint(Instances, Size, _, Attributes):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Attributes), for(N, 1, Size) do
		Xi=oclconstraint{oid:N,constraintName:Str2,constraintStr:Str3}, str_len(Str2,LenStr2),LenStr2#::0..10,
		 str_len(Str3,LenStr3),LenStr3#::0..10,
		 append([N],AtIn, AtOut)).

creationEvent(Instances, Size, MaxId, Attributes):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Attributes), param(MaxId) do
		Xi=event{oid:Integer1}, Integer1::1..MaxId, append([Integer1],AtIn, AtOut)).

creationParallelGateway(Instances, Size, MaxId, Attributes):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Attributes), param(MaxId) do
		Xi=parallelgateway{oid:Integer1}, Integer1::1..MaxId, append([Integer1],AtIn, AtOut)).

creationSplitGateway(Instances, Size, MaxId, Attributes):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Attributes), param(MaxId) do
		Xi=splitgateway{oid:Integer1}, Integer1::1..MaxId, append([Integer1],AtIn, AtOut)).

creationDataObjectReference(Instances, Size, _, Attributes):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Attributes), for(N, 1, Size) do
		Xi=dataobjectreference{oid:N,name:Str2,lowerBound:Int3,higherBound:Int4}, str_len(Str2,LenStr2),LenStr2#::0..10,
		 Int3#::[1,10,20],
		 Int4#::[1,10,20],
		 append([N,Int3,Int4],AtIn, AtOut)).

creationProcessInstance(Instances, Size, _, Attributes):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Attributes), for(N, 1, Size) do
		Xi=processinstance{oid:N,id:Str2}, str_len(Str2,LenStr2),LenStr2#::0..10,
		 append([N],AtIn, AtOut)).

creationFlowNodeInstance(Instances, Size, _, Attributes):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Attributes), for(N, 1, Size) do
		Xi=flownodeinstance{oid:N,status:Int2}, Int2#::[1,10,20],
		 append([N,Int2],AtIn, AtOut)).

creationDataObject(Instances, Size, MaxId, Attributes):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Attributes), param(MaxId) do
		Xi=dataobject{oid:Integer1}, Integer1::1..MaxId, append([Integer1],AtIn, AtOut)).

existingOidsActivityInFlowNode(OActivity, OFlowNode):-existsOidIn(OActivity, OFlowNode).
existingOidsEventInFlowNode(OEvent, OFlowNode):-existsOidIn(OEvent, OFlowNode).
existingOidsSplitGatewayInFlowNode(OSplitGateway, OFlowNode):-existsOidIn(OSplitGateway, OFlowNode).
existingOidsDecisionConditionInOCLConstraint(ODecisionCondition, OOCLConstraint):-existsOidIn(ODecisionCondition, OOCLConstraint).
existingOidsDecisionGatewayInSplitGateway(ODecisionGateway, OSplitGateway):-existsOidIn(ODecisionGateway, OSplitGateway).
existingOidsParallelGatewayInSplitGateway(OParallelGateway, OSplitGateway):-existsOidIn(OParallelGateway, OSplitGateway).

creationmainbranch_processmodel(Instances, Size, Participants, SProcessModel, SBranch):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Participants), param(SProcessModel), param(SBranch) do
		Xi=mainbranch_processmodel{processmodel:ValuePart1,mainbranch:ValuePart2}, ValuePart1#>0, ValuePart1#=<SProcessModel, ValuePart2#>0, ValuePart2#=<SBranch,
		append([ValuePart1, ValuePart2],AtIn, AtOut)).
creationprocessinvariants_processmodel(Instances, Size, Participants, SProcessModel, SOCLConstraint):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Participants), param(SProcessModel), param(SOCLConstraint) do
		Xi=processinvariants_processmodel{processmodel:ValuePart1,processinvariants:ValuePart2}, ValuePart1#>0, ValuePart1#=<SProcessModel, ValuePart2#>0, ValuePart2#=<SOCLConstraint,
		append([ValuePart1, ValuePart2],AtIn, AtOut)).
creationactivity_preconditions(Instances, Size, Participants, SActivity, SOCLConstraint):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Participants), param(SActivity), param(SOCLConstraint) do
		Xi=activity_preconditions{activity:ValuePart1,preconditions:ValuePart2}, ValuePart1#>0, ValuePart1#=<SActivity, ValuePart2#>0, ValuePart2#=<SOCLConstraint,
		append([ValuePart1, ValuePart2],AtIn, AtOut)).
creationactivity_postconditions(Instances, Size, Participants, SActivity, SOCLConstraint):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Participants), param(SActivity), param(SOCLConstraint) do
		Xi=activity_postconditions{activity:ValuePart1,postconditions:ValuePart2}, ValuePart1#>0, ValuePart1#=<SActivity, ValuePart2#>0, ValuePart2#=<SOCLConstraint,
		append([ValuePart1, ValuePart2],AtIn, AtOut)).
creationactivity_inputs(Instances, Size, Participants, SActivity, SDataObjectReference):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Participants), param(SActivity), param(SDataObjectReference) do
		Xi=activity_inputs{activity:ValuePart1,inputs:ValuePart2}, ValuePart1#>0, ValuePart1#=<SActivity, ValuePart2#>0, ValuePart2#=<SDataObjectReference,
		append([ValuePart1, ValuePart2],AtIn, AtOut)).
creationactivity_outputs(Instances, Size, Participants, SActivity, SDataObjectReference):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Participants), param(SActivity), param(SDataObjectReference) do
		Xi=activity_outputs{activity:ValuePart1,outputs:ValuePart2}, ValuePart1#>0, ValuePart1#=<SActivity, ValuePart2#>0, ValuePart2#=<SDataObjectReference,
		append([ValuePart1, ValuePart2],AtIn, AtOut)).
creationactivity_invariabilityclauses(Instances, Size, Participants, SActivity, SOCLConstraint):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Participants), param(SActivity), param(SOCLConstraint) do
		Xi=activity_invariabilityclauses{activity:ValuePart1,invariabilityclauses:ValuePart2}, ValuePart1#>0, ValuePart1#=<SActivity, ValuePart2#>0, ValuePart2#=<SOCLConstraint,
		append([ValuePart1, ValuePart2],AtIn, AtOut)).
creationbranch_entryconditions(Instances, Size, Participants, SBranch, SDecisionCondition):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Participants), param(SBranch), param(SDecisionCondition) do
		Xi=branch_entryconditions{branch:ValuePart1,entryconditions:ValuePart2}, ValuePart1#>0, ValuePart1#=<SBranch, ValuePart2#>0, ValuePart2#=<SDecisionCondition,
		append([ValuePart1, ValuePart2],AtIn, AtOut)).
creationbranch_nodes(Instances, Size, Participants, SBranch, SFlowNode):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Participants), param(SBranch), param(SFlowNode) do
		Xi=branch_nodes{branch:ValuePart1,nodes:ValuePart2}, ValuePart1#>0, ValuePart1#=<SBranch, ValuePart2#>0, ValuePart2#=<SFlowNode,
		append([ValuePart1, ValuePart2],AtIn, AtOut)).
creationconditions_decisiongateway(Instances, Size, Participants, SDecisionGateway, SDecisionCondition):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Participants), param(SDecisionGateway), param(SDecisionCondition) do
		Xi=conditions_decisiongateway{decisiongateway:ValuePart1,conditions:ValuePart2}, ValuePart1#>0, ValuePart1#=<SDecisionGateway, ValuePart2#>0, ValuePart2#=<SDecisionCondition,
		append([ValuePart1, ValuePart2],AtIn, AtOut)).
creationbranch_decisioncondition(Instances, Size, Participants, SDecisionCondition, SBranch):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Participants), param(SDecisionCondition), param(SBranch) do
		Xi=branch_decisioncondition{decisioncondition:ValuePart1,branch:ValuePart2}, ValuePart1#>0, ValuePart1#=<SDecisionCondition, ValuePart2#>0, ValuePart2#=<SBranch,
		append([ValuePart1, ValuePart2],AtIn, AtOut)).
creationnext_previous(Instances, Size, Participants, SFlowNode, SFlowNode):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Participants), param(SFlowNode), param(SFlowNode) do
		Xi=next_previous{previous:ValuePart1,next:ValuePart2}, ValuePart1#>0, ValuePart1#=<SFlowNode, ValuePart2#>0, ValuePart2#=<SFlowNode,
		append([ValuePart1, ValuePart2],AtIn, AtOut)).
creationevent_trigger(Instances, Size, Participants, SEvent, SOCLConstraint):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Participants), param(SEvent), param(SOCLConstraint) do
		Xi=event_trigger{event:ValuePart1,trigger:ValuePart2}, ValuePart1#>0, ValuePart1#=<SEvent, ValuePart2#>0, ValuePart2#=<SOCLConstraint,
		append([ValuePart1, ValuePart2],AtIn, AtOut)).
creationbranches_splitgateway(Instances, Size, Participants, SSplitGateway, SBranch):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Participants), param(SSplitGateway), param(SBranch) do
		Xi=branches_splitgateway{splitgateway:ValuePart1,branches:ValuePart2}, ValuePart1#>0, ValuePart1#=<SSplitGateway, ValuePart2#>0, ValuePart2#=<SBranch,
		append([ValuePart1, ValuePart2],AtIn, AtOut)).
creationdataobjectclass_dataobjectreference(Instances, Size, Participants, SDataObjectReference, SEClass):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Participants), param(SDataObjectReference), param(SEClass) do
		Xi=dataobjectclass_dataobjectreference{dataobjectreference:ValuePart1,dataobjectclass:ValuePart2}, ValuePart1#>0, ValuePart1#=<SDataObjectReference, ValuePart2#>0, ValuePart2#=<SEClass,
		append([ValuePart1, ValuePart2],AtIn, AtOut)).
creationprocessinstance_processmodel(Instances, Size, Participants, SProcessInstance, SProcessModel):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Participants), param(SProcessInstance), param(SProcessModel) do
		Xi=processinstance_processmodel{processinstance:ValuePart1,processmodel:ValuePart2}, ValuePart1#>0, ValuePart1#=<SProcessInstance, ValuePart2#>0, ValuePart2#=<SProcessModel,
		append([ValuePart1, ValuePart2],AtIn, AtOut)).
creationexecutednodes_processinstance(Instances, Size, Participants, SProcessInstance, SFlowNodeInstance):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Participants), param(SProcessInstance), param(SFlowNodeInstance) do
		Xi=executednodes_processinstance{processinstance:ValuePart1,executednodes:ValuePart2}, ValuePart1#>0, ValuePart1#=<SProcessInstance, ValuePart2#>0, ValuePart2#=<SFlowNodeInstance,
		append([ValuePart1, ValuePart2],AtIn, AtOut)).
creationdataobjects_processinstance(Instances, Size, Participants, SProcessInstance, SEObject):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Participants), param(SProcessInstance), param(SEObject) do
		Xi=dataobjects_processinstance{processinstance:ValuePart1,dataobjects:ValuePart2}, ValuePart1#>0, ValuePart1#=<SProcessInstance, ValuePart2#>0, ValuePart2#=<SEObject,
		append([ValuePart1, ValuePart2],AtIn, AtOut)).
creationflownodeinstance_nodedef(Instances, Size, Participants, SFlowNodeInstance, SFlowNode):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Participants), param(SFlowNodeInstance), param(SFlowNode) do
		Xi=flownodeinstance_nodedef{flownodeinstance:ValuePart1,nodedef:ValuePart2}, ValuePart1#>0, ValuePart1#=<SFlowNodeInstance, ValuePart2#>0, ValuePart2#=<SFlowNode,
		append([ValuePart1, ValuePart2],AtIn, AtOut)).
creationflownodeinstance_inputs(Instances, Size, Participants, SFlowNodeInstance, SEObject):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Participants), param(SFlowNodeInstance), param(SEObject) do
		Xi=flownodeinstance_inputs{flownodeinstance:ValuePart1,inputs:ValuePart2}, ValuePart1#>0, ValuePart1#=<SFlowNodeInstance, ValuePart2#>0, ValuePart2#=<SEObject,
		append([ValuePart1, ValuePart2],AtIn, AtOut)).
creationflownodeinstance_outputs(Instances, Size, Participants, SFlowNodeInstance, SEObject):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Participants), param(SFlowNodeInstance), param(SEObject) do
		Xi=flownodeinstance_outputs{flownodeinstance:ValuePart1,outputs:ValuePart2}, ValuePart1#>0, ValuePart1#=<SFlowNodeInstance, ValuePart2#>0, ValuePart2#=<SEObject,
		append([ValuePart1, ValuePart2],AtIn, AtOut)).
creationdataobject_type(Instances, Size, Participants, SDataObject, SEClass):-
	length(Instances, Size),
	(foreach(Xi, Instances), fromto([],AtIn,AtOut,Participants), param(SDataObject), param(SEClass) do
		Xi=dataobject_type{dataobject:ValuePart1,type:ValuePart2}, ValuePart1#>0, ValuePart1#=<SDataObject, ValuePart2#>0, ValuePart2#=<SEClass,
		append([ValuePart1, ValuePart2],AtIn, AtOut)).
cardinalityLinksmainbranch_processmodel(Instances):-
	linksConstraintMultiplicities(Instances, "mainbranch_processmodel","processmodel","mainbranch").
cardinalityLinksprocessinvariants_processmodel(Instances):-
	linksConstraintMultiplicities(Instances, "processinvariants_processmodel","processmodel","processinvariants").
cardinalityLinksactivity_preconditions(Instances):-
	linksConstraintMultiplicities(Instances, "activity_preconditions","activity","preconditions").
cardinalityLinksactivity_postconditions(Instances):-
	linksConstraintMultiplicities(Instances, "activity_postconditions","activity","postconditions").
cardinalityLinksactivity_inputs(Instances):-
	linksConstraintMultiplicities(Instances, "activity_inputs","activity","inputs").
cardinalityLinksactivity_outputs(Instances):-
	linksConstraintMultiplicities(Instances, "activity_outputs","activity","outputs").
cardinalityLinksactivity_invariabilityclauses(Instances):-
	linksConstraintMultiplicities(Instances, "activity_invariabilityclauses","activity","invariabilityclauses").
cardinalityLinksbranch_entryconditions(Instances):-
	linksConstraintMultiplicities(Instances, "branch_entryconditions","branch","entryconditions").
cardinalityLinksbranch_nodes(Instances):-
	linksConstraintMultiplicities(Instances, "branch_nodes","branch","nodes").
cardinalityLinksconditions_decisiongateway(Instances):-
	linksConstraintMultiplicities(Instances, "conditions_decisiongateway","decisiongateway","conditions").
cardinalityLinksbranch_decisioncondition(Instances):-
	linksConstraintMultiplicities(Instances, "branch_decisioncondition","decisioncondition","branch").
cardinalityLinksnext_previous(Instances):-
	linksConstraintMultiplicities(Instances, "next_previous","previous","next").
cardinalityLinksevent_trigger(Instances):-
	linksConstraintMultiplicities(Instances, "event_trigger","event","trigger").
cardinalityLinksbranches_splitgateway(Instances):-
	linksConstraintMultiplicities(Instances, "branches_splitgateway","splitgateway","branches").
cardinalityLinksdataobjectclass_dataobjectreference(Instances):-
	linksConstraintMultiplicities(Instances, "dataobjectclass_dataobjectreference","dataobjectreference","dataobjectclass").
cardinalityLinksprocessinstance_processmodel(Instances):-
	linksConstraintMultiplicities(Instances, "processinstance_processmodel","processinstance","processmodel").
cardinalityLinksexecutednodes_processinstance(Instances):-
	linksConstraintMultiplicities(Instances, "executednodes_processinstance","processinstance","executednodes").
cardinalityLinksdataobjects_processinstance(Instances):-
	linksConstraintMultiplicities(Instances, "dataobjects_processinstance","processinstance","dataobjects").
cardinalityLinksflownodeinstance_nodedef(Instances):-
	linksConstraintMultiplicities(Instances, "flownodeinstance_nodedef","flownodeinstance","nodedef").
cardinalityLinksflownodeinstance_inputs(Instances):-
	linksConstraintMultiplicities(Instances, "flownodeinstance_inputs","flownodeinstance","inputs").
cardinalityLinksflownodeinstance_outputs(Instances):-
	linksConstraintMultiplicities(Instances, "flownodeinstance_outputs","flownodeinstance","outputs").
cardinalityLinksdataobject_type(Instances):-
	linksConstraintMultiplicities(Instances, "dataobject_type","dataobject","type").

% OCL constraint cbpmn::DataObjectReference.allInstances()->forAll(self : DataObjectReference | self.higherBound.=(1.-()).or(self.lowerBound.<=(self.higherBound)))
nallInstances1lowerBoundLessThanHigherBound(Instances, _, Result):-
	ocl_allInstances(Instances, "DataObjectReference", Result).
% Lookup for variable self
nVariable2lowerBoundLessThanHigherBound(_, Vars, Result):-
	ocl_variable(Vars,1,Result).
nAttribute3lowerBoundLessThanHigherBound(Instances, Vars, Result):-
	nVariable2lowerBoundLessThanHigherBound(Instances, Vars, Object),
	ocl_attributeCall(Instances,"DataObjectReference","higherBound", Object, Result).
nConstant4lowerBoundLessThanHigherBound(_, _, Result):-
	Result=1.
nunary_minus5lowerBoundLessThanHigherBound(Instances, Vars, Result):-
	ocl_unary_minus(Instances, Vars, nConstant4lowerBoundLessThanHigherBound, Result).
nequals6lowerBoundLessThanHigherBound(Instances, Vars, Result):-
	ocl_int_equals(Instances, Vars, nAttribute3lowerBoundLessThanHigherBound, nunary_minus5lowerBoundLessThanHigherBound, Result).
% Lookup for variable self
nVariable7lowerBoundLessThanHigherBound(_, Vars, Result):-
	ocl_variable(Vars,1,Result).
nAttribute8lowerBoundLessThanHigherBound(Instances, Vars, Result):-
	nVariable7lowerBoundLessThanHigherBound(Instances, Vars, Object),
	ocl_attributeCall(Instances,"DataObjectReference","lowerBound", Object, Result).
% Lookup for variable self
nVariable9lowerBoundLessThanHigherBound(_, Vars, Result):-
	ocl_variable(Vars,1,Result).
nAttribute10lowerBoundLessThanHigherBound(Instances, Vars, Result):-
	nVariable9lowerBoundLessThanHigherBound(Instances, Vars, Object),
	ocl_attributeCall(Instances,"DataObjectReference","higherBound", Object, Result).
nless_equal11lowerBoundLessThanHigherBound(Instances, Vars, Result):-
	ocl_int_less_equal(Instances, Vars, nAttribute8lowerBoundLessThanHigherBound, nAttribute10lowerBoundLessThanHigherBound, Result).
nor12lowerBoundLessThanHigherBound(Instances, Vars, Result):-
	ocl_or(Instances, Vars, nequals6lowerBoundLessThanHigherBound, nless_equal11lowerBoundLessThanHigherBound, Result).
nforAll13lowerBoundLessThanHigherBound(Instances, Vars, Result):-
	nallInstances1lowerBoundLessThanHigherBound(Instances, Vars, Value1),
	ocl_col_forAll(Instances, Vars, Value1, nor12lowerBoundLessThanHigherBound, Result).
lowerBoundLessThanHigherBound(Instances):-
	nforAll13lowerBoundLessThanHigherBound(Instances, [], Result),
	Result #=1.

% OCL constraint cbpmn::DataObjectReference.allInstances()->forAll(self : DataObjectReference | self.lowerBound.>=(0))
nallInstances1lowerBoundPositive(Instances, _, Result):-
	ocl_allInstances(Instances, "DataObjectReference", Result).
% Lookup for variable self
nVariable2lowerBoundPositive(_, Vars, Result):-
	ocl_variable(Vars,1,Result).
nAttribute3lowerBoundPositive(Instances, Vars, Result):-
	nVariable2lowerBoundPositive(Instances, Vars, Object),
	ocl_attributeCall(Instances,"DataObjectReference","lowerBound", Object, Result).
nConstant4lowerBoundPositive(_, _, Result):-
	Result=0.
ngreater_equal5lowerBoundPositive(Instances, Vars, Result):-
	ocl_int_greater_equal(Instances, Vars, nAttribute3lowerBoundPositive, nConstant4lowerBoundPositive, Result).
nforAll6lowerBoundPositive(Instances, Vars, Result):-
	nallInstances1lowerBoundPositive(Instances, Vars, Value1),
	ocl_col_forAll(Instances, Vars, Value1, ngreater_equal5lowerBoundPositive, Result).
lowerBoundPositive(Instances):-
	nforAll6lowerBoundPositive(Instances, [], Result),
	Result #=1.

% OCL constraint cbpmn::DataObjectReference.allInstances()->forAll(self : DataObjectReference | self.higherBound.>=(1.-()))
nallInstances1higherBoundPositive(Instances, _, Result):-
	ocl_allInstances(Instances, "DataObjectReference", Result).
% Lookup for variable self
nVariable2higherBoundPositive(_, Vars, Result):-
	ocl_variable(Vars,1,Result).
nAttribute3higherBoundPositive(Instances, Vars, Result):-
	nVariable2higherBoundPositive(Instances, Vars, Object),
	ocl_attributeCall(Instances,"DataObjectReference","higherBound", Object, Result).
nConstant4higherBoundPositive(_, _, Result):-
	Result=1.
nunary_minus5higherBoundPositive(Instances, Vars, Result):-
	ocl_unary_minus(Instances, Vars, nConstant4higherBoundPositive, Result).
ngreater_equal6higherBoundPositive(Instances, Vars, Result):-
	ocl_int_greater_equal(Instances, Vars, nAttribute3higherBoundPositive, nunary_minus5higherBoundPositive, Result).
nforAll7higherBoundPositive(Instances, Vars, Result):-
	nallInstances1higherBoundPositive(Instances, Vars, Value1),
	ocl_col_forAll(Instances, Vars, Value1, ngreater_equal6higherBoundPositive, Result).
higherBoundPositive(Instances):-
	nforAll7higherBoundPositive(Instances, [], Result),
	Result #=1.


