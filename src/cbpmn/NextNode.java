/**
 */
package cbpmn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Next Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cbpmn.NextNode#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see cbpmn.CbpmnPackage#getNextNode()
 * @model
 * @generated
 */
public interface NextNode<N extends FlowNode> extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(FlowNode)
	 * @see cbpmn.CbpmnPackage#getNextNode_Target()
	 * @model required="true"
	 * @generated
	 */
	N getTarget();

	/**
	 * Sets the value of the '{@link cbpmn.NextNode#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(N value);

} // NextNode
