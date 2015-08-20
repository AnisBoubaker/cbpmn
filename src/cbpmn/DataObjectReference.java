/**
 */
package cbpmn;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Object Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cbpmn.DataObjectReference#getName <em>Name</em>}</li>
 *   <li>{@link cbpmn.DataObjectReference#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link cbpmn.DataObjectReference#getHigherBound <em>Higher Bound</em>}</li>
 *   <li>{@link cbpmn.DataObjectReference#getDataObjectClass <em>Data Object Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see cbpmn.CbpmnPackage#getDataObjectReference()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='lowerBoundLessThanHigherBound lowerBoundPositive higherBoundPositive'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot lowerBoundLessThanHigherBound='higherBound = -1 or lowerBound <= higherBound' lowerBoundPositive='lowerBound>=0' higherBoundPositive='higherBound>=-1'"
 * @generated
 */
public interface DataObjectReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cbpmn.CbpmnPackage#getDataObjectReference_Name()
	 * @model default="" id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cbpmn.DataObjectReference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see cbpmn.CbpmnPackage#getDataObjectReference_LowerBound()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link cbpmn.DataObjectReference#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

	/**
	 * Returns the value of the '<em><b>Higher Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Higher Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Higher Bound</em>' attribute.
	 * @see #setHigherBound(int)
	 * @see cbpmn.CbpmnPackage#getDataObjectReference_HigherBound()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getHigherBound();

	/**
	 * Sets the value of the '{@link cbpmn.DataObjectReference#getHigherBound <em>Higher Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Higher Bound</em>' attribute.
	 * @see #getHigherBound()
	 * @generated
	 */
	void setHigherBound(int value);

	/**
	 * Returns the value of the '<em><b>Data Object Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Object Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Object Class</em>' reference.
	 * @see #setDataObjectClass(EClass)
	 * @see cbpmn.CbpmnPackage#getDataObjectReference_DataObjectClass()
	 * @model required="true"
	 * @generated
	 */
	EClass getDataObjectClass();

	/**
	 * Sets the value of the '{@link cbpmn.DataObjectReference#getDataObjectClass <em>Data Object Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Object Class</em>' reference.
	 * @see #getDataObjectClass()
	 * @generated
	 */
	void setDataObjectClass(EClass value);

} // DataObjectReference
