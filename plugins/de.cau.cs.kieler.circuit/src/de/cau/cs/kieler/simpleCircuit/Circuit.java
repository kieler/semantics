/**
 */
package de.cau.cs.kieler.simpleCircuit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circuit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.simpleCircuit.Circuit#getInnerCircuits <em>Inner Circuits</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simpleCircuit.Circuit#getInnerLinks <em>Inner Links</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simpleCircuit.Circuit#getPorts <em>Ports</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simpleCircuit.Circuit#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simpleCircuit.Circuit#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simpleCircuit.Circuit#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.simpleCircuit.SimpleCircuitPackage#getCircuit()
 * @model
 * @generated
 */
public interface Circuit extends EObject {
	/**
	 * Returns the value of the '<em><b>Inner Circuits</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.simpleCircuit.Circuit}.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.simpleCircuit.Circuit#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Circuits</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Circuits</em>' containment reference list.
	 * @see de.cau.cs.kieler.simpleCircuit.SimpleCircuitPackage#getCircuit_InnerCircuits()
	 * @see de.cau.cs.kieler.simpleCircuit.Circuit#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Circuit> getInnerCircuits();

	/**
	 * Returns the value of the '<em><b>Inner Links</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.simpleCircuit.Link}.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.simpleCircuit.Link#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Links</em>' containment reference list.
	 * @see de.cau.cs.kieler.simpleCircuit.SimpleCircuitPackage#getCircuit_InnerLinks()
	 * @see de.cau.cs.kieler.simpleCircuit.Link#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Link> getInnerLinks();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.simpleCircuit.Port}.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.simpleCircuit.Port#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see de.cau.cs.kieler.simpleCircuit.SimpleCircuitPackage#getCircuit_Ports()
	 * @see de.cau.cs.kieler.simpleCircuit.Port#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.cau.cs.kieler.simpleCircuit.SimpleCircuitPackage#getCircuit_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.simpleCircuit.Circuit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.cau.cs.kieler.simpleCircuit.SimpleCircuitPackage#getCircuit_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.simpleCircuit.Circuit#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.simpleCircuit.Circuit#getInnerCircuits <em>Inner Circuits</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Circuit)
	 * @see de.cau.cs.kieler.simpleCircuit.SimpleCircuitPackage#getCircuit_Parent()
	 * @see de.cau.cs.kieler.simpleCircuit.Circuit#getInnerCircuits
	 * @model opposite="innerCircuits" required="true" transient="false"
	 * @generated
	 */
	Circuit getParent();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.simpleCircuit.Circuit#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Circuit value);

} // Circuit
