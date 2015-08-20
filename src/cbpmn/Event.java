/**
 */
package cbpmn;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cbpmn.Event#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see cbpmn.CbpmnPackage#getEvent()
 * @model abstract="true"
 * @generated
 */
public interface Event extends FlowNode {
	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference.
	 * @see #setTrigger(OCLConstraint)
	 * @see cbpmn.CbpmnPackage#getEvent_Trigger()
	 * @model containment="true"
	 * @generated
	 */
	OCLConstraint getTrigger();

	/**
	 * Sets the value of the '{@link cbpmn.Event#getTrigger <em>Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' containment reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(OCLConstraint value);

} // Event
