/**
 */
package de.cau.cs.kieler.simpleCircuit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.simpleCircuit.Port#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simpleCircuit.Port#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simpleCircuit.Port#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simpleCircuit.Port#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simpleCircuit.Port#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.simpleCircuit.SimpleCircuitPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Incoming Links</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.simpleCircuit.Link}.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.simpleCircuit.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Links</em>' reference list.
	 * @see de.cau.cs.kieler.simpleCircuit.SimpleCircuitPackage#getPort_IncomingLinks()
	 * @see de.cau.cs.kieler.simpleCircuit.Link#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Link> getIncomingLinks();

	/**
	 * Returns the value of the '<em><b>Outgoing Links</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.simpleCircuit.Link}.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.simpleCircuit.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Links</em>' reference list.
	 * @see de.cau.cs.kieler.simpleCircuit.SimpleCircuitPackage#getPort_OutgoingLinks()
	 * @see de.cau.cs.kieler.simpleCircuit.Link#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Link> getOutgoingLinks();

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
	 * @see de.cau.cs.kieler.simpleCircuit.SimpleCircuitPackage#getPort_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.simpleCircuit.Port#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cau.cs.kieler.simpleCircuit.PortType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.cau.cs.kieler.simpleCircuit.PortType
	 * @see #setType(PortType)
	 * @see de.cau.cs.kieler.simpleCircuit.SimpleCircuitPackage#getPort_Type()
	 * @model required="true"
	 * @generated
	 */
	PortType getType();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.simpleCircuit.Port#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.cau.cs.kieler.simpleCircuit.PortType
	 * @see #getType()
	 * @generated
	 */
	void setType(PortType value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.simpleCircuit.Circuit#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Circuit)
	 * @see de.cau.cs.kieler.simpleCircuit.SimpleCircuitPackage#getPort_Parent()
	 * @see de.cau.cs.kieler.simpleCircuit.Circuit#getPorts
	 * @model opposite="ports" required="true" transient="false"
	 * @generated
	 */
	Circuit getParent();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.simpleCircuit.Port#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Circuit value);

} // Port
