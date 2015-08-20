/**
 */
package cbpmni.util;

import cbpmni.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see cbpmni.CbpmniPackage
 * @generated
 */
public class CbpmniSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CbpmniPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CbpmniSwitch() {
		if (modelPackage == null) {
			modelPackage = CbpmniPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CbpmniPackage.PROCESS_INST: {
				ProcessInst processInst = (ProcessInst)theEObject;
				T result = caseProcessInst(processInst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CbpmniPackage.FLOW_NODE_INST: {
				FlowNodeInst flowNodeInst = (FlowNodeInst)theEObject;
				T result = caseFlowNodeInst(flowNodeInst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CbpmniPackage.ACTIVITY_INST: {
				ActivityInst activityInst = (ActivityInst)theEObject;
				T result = caseActivityInst(activityInst);
				if (result == null) result = caseFlowNodeInst(activityInst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CbpmniPackage.EVENT_INST: {
				EventInst eventInst = (EventInst)theEObject;
				T result = caseEventInst(eventInst);
				if (result == null) result = caseFlowNodeInst(eventInst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CbpmniPackage.SPLIT_INST: {
				SplitInst splitInst = (SplitInst)theEObject;
				T result = caseSplitInst(splitInst);
				if (result == null) result = caseFlowNodeInst(splitInst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CbpmniPackage.BRANCH_INST: {
				BranchInst branchInst = (BranchInst)theEObject;
				T result = caseBranchInst(branchInst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CbpmniPackage.CONSTRAINT_INST: {
				ConstraintInst constraintInst = (ConstraintInst)theEObject;
				T result = caseConstraintInst(constraintInst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Inst</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Inst</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessInst(ProcessInst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Node Inst</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Node Inst</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowNodeInst(FlowNodeInst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Inst</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Inst</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityInst(ActivityInst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Inst</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Inst</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventInst(EventInst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split Inst</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split Inst</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplitInst(SplitInst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Branch Inst</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Branch Inst</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBranchInst(BranchInst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Inst</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Inst</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintInst(ConstraintInst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CbpmniSwitch
