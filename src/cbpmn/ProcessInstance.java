/**
 */
package cbpmn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cbpmn.ProcessInstance#getProcessModel <em>Process Model</em>}</li>
 *   <li>{@link cbpmn.ProcessInstance#getExecutedNodes <em>Executed Nodes</em>}</li>
 *   <li>{@link cbpmn.ProcessInstance#getId <em>Id</em>}</li>
 *   <li>{@link cbpmn.ProcessInstance#getDataObjects <em>Data Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see cbpmn.CbpmnPackage#getProcessInstance()
 * @model
 * @generated
 */
public interface ProcessInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Process Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Model</em>' reference.
	 * @see #setProcessModel(ProcessModel)
	 * @see cbpmn.CbpmnPackage#getProcessInstance_ProcessModel()
	 * @model required="true"
	 * @generated
	 */
	ProcessModel getProcessModel();

	/**
	 * Sets the value of the '{@link cbpmn.ProcessInstance#getProcessModel <em>Process Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Model</em>' reference.
	 * @see #getProcessModel()
	 * @generated
	 */
	void setProcessModel(ProcessModel value);

	/**
	 * Returns the value of the '<em><b>Executed Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link cbpmn.FlowNodeInstance}.
	 * It is bidirectional and its opposite is '{@link cbpmn.FlowNodeInstance#getProcessInstance <em>Process Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executed Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executed Nodes</em>' containment reference list.
	 * @see cbpmn.CbpmnPackage#getProcessInstance_ExecutedNodes()
	 * @see cbpmn.FlowNodeInstance#getProcessInstance
	 * @model opposite="processInstance" containment="true"
	 * @generated
	 */
	EList<FlowNodeInstance> getExecutedNodes();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see cbpmn.CbpmnPackage#getProcessInstance_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link cbpmn.ProcessInstance#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Data Objects</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Objects</em>' containment reference list.
	 * @see cbpmn.CbpmnPackage#getProcessInstance_DataObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getDataObjects();

} // ProcessInstance
