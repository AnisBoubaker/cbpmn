/**
 */
package cbpmni;


import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Split Inst</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cbpmni.SplitInst#getBranches <em>Branches</em>}</li>
 * </ul>
 * </p>
 *
 * @see cbpmni.CbpmniPackage#getSplitInst()
 * @model
 * @generated
 */
public interface SplitInst extends FlowNodeInst {
	/**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
	 * The list contents are of type {@link cbpmni.BranchInst}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branches</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' containment reference list.
	 * @see cbpmni.CbpmniPackage#getSplitInst_Branches()
	 * @model containment="true"
	 * @generated
	 */
	EList<BranchInst> getBranches();

} // SplitInst
