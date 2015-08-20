/**
 */
package cbpmn;

import cbpmn.util.CbpmnIterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cbpmn.ProcessModel#getMainBranch <em>Main Branch</em>}</li>
 *   <li>{@link cbpmn.ProcessModel#getProcessInvariants <em>Process Invariants</em>}</li>
 *   <li>{@link cbpmn.ProcessModel#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see cbpmn.CbpmnPackage#getProcessModel()
 * @model
 * @generated
 */
public interface ProcessModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Main Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Branch</em>' containment reference.
	 * @see #setMainBranch(Branch)
	 * @see cbpmn.CbpmnPackage#getProcessModel_MainBranch()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Branch getMainBranch();

	/**
	 * Sets the value of the '{@link cbpmn.ProcessModel#getMainBranch <em>Main Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Branch</em>' containment reference.
	 * @see #getMainBranch()
	 * @generated
	 */
	void setMainBranch(Branch value);

	/**
	 * Returns the value of the '<em><b>Process Invariants</b></em>' containment reference list.
	 * The list contents are of type {@link cbpmn.OCLConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Invariants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Invariants</em>' containment reference list.
	 * @see cbpmn.CbpmnPackage#getProcessModel_ProcessInvariants()
	 * @model containment="true"
	 * @generated
	 */
	EList<OCLConstraint> getProcessInvariants();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"DefaultProcess"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cbpmn.CbpmnPackage#getProcessModel_Name()
	 * @model default="DefaultProcess"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cbpmn.ProcessModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="cbpmn.CbpmnIterator" iteratorDataType="cbpmn.CbpmnIterator"
	 * @generated
	 */
	CbpmnIterator iterator(CbpmnIterator iterator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="cbpmn.CbpmnIterator" iteratorDataType="cbpmn.CbpmnIterator"
	 * @generated
	 */
	CbpmnIterator iterator(CbpmnIterator iterator, FlowNode start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	StartEvent getRandomStartEvent();

} // ProcessModel
