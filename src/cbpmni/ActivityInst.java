/**
 */
package cbpmni;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Inst</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cbpmni.ActivityInst#getPreconditions <em>Preconditions</em>}</li>
 *   <li>{@link cbpmni.ActivityInst#getPostconditions <em>Postconditions</em>}</li>
 *   <li>{@link cbpmni.ActivityInst#getInputs <em>Inputs</em>}</li>
 *   <li>{@link cbpmni.ActivityInst#getOutputs <em>Outputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see cbpmni.CbpmniPackage#getActivityInst()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='correctArguments correctNodeDef'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot correctArguments='true' correctNodeDef='nodeDef.oclIsTypeOf(cbpmn::Activity)'"
 * @generated
 */
public interface ActivityInst extends FlowNodeInst {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see cbpmni.CbpmniPackage#getActivityInst_Inputs()
	 * @model
	 * @generated
	 */
	EList<EObject> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' reference list.
	 * @see cbpmni.CbpmniPackage#getActivityInst_Outputs()
	 * @model
	 * @generated
	 */
	EList<EObject> getOutputs();

	/**
	 * Returns the value of the '<em><b>Preconditions</b></em>' containment reference list.
	 * The list contents are of type {@link cbpmni.ConstraintInst}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preconditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preconditions</em>' containment reference list.
	 * @see cbpmni.CbpmniPackage#getActivityInst_Preconditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConstraintInst> getPreconditions();

	/**
	 * Returns the value of the '<em><b>Postconditions</b></em>' containment reference list.
	 * The list contents are of type {@link cbpmni.ConstraintInst}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postconditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postconditions</em>' containment reference list.
	 * @see cbpmni.CbpmniPackage#getActivityInst_Postconditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConstraintInst> getPostconditions();

} // ActivityInst
