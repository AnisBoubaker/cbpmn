/**
 */
package cbpmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Split Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cbpmn.SplitGateway#getBranches <em>Branches</em>}</li>
 * </ul>
 * </p>
 *
 * @see cbpmn.CbpmnPackage#getSplitGateway()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SplitGateway extends FlowNode {
	/**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
	 * The list contents are of type {@link cbpmn.Branch}.
	 * It is bidirectional and its opposite is '{@link cbpmn.Branch#getGateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branches</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' containment reference list.
	 * @see cbpmn.CbpmnPackage#getSplitGateway_Branches()
	 * @see cbpmn.Branch#getGateway
	 * @model opposite="gateway" containment="true"
	 * @generated
	 */
	EList<Branch> getBranches();

} // SplitGateway
