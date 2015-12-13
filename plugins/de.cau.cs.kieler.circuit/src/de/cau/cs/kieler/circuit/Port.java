/**
 */
package de.cau.cs.kieler.circuit;

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
 *   <li>{@link de.cau.cs.kieler.circuit.Port#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link de.cau.cs.kieler.circuit.Port#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link de.cau.cs.kieler.circuit.Port#getNode <em>Node</em>}</li>
 *   <li>{@link de.cau.cs.kieler.circuit.Port#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.circuit.Port#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.circuit.CircuitPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Incoming Links</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.circuit.Link}.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.circuit.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Links</em>' reference list.
	 * @see de.cau.cs.kieler.circuit.CircuitPackage#getPort_IncomingLinks()
	 * @see de.cau.cs.kieler.circuit.Link#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Link> getIncomingLinks();

	/**
	 * Returns the value of the '<em><b>Outgoing Links</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.circuit.Link}.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.circuit.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Links</em>' reference list.
	 * @see de.cau.cs.kieler.circuit.CircuitPackage#getPort_OutgoingLinks()
	 * @see de.cau.cs.kieler.circuit.Link#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Link> getOutgoingLinks();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.circuit.Node#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' container reference.
	 * @see #setNode(Node)
	 * @see de.cau.cs.kieler.circuit.CircuitPackage#getPort_Node()
	 * @see de.cau.cs.kieler.circuit.Node#getPorts
	 * @model opposite="ports" transient="false"
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.circuit.Port#getNode <em>Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' container reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Node value);

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
	 * @see de.cau.cs.kieler.circuit.CircuitPackage#getPort_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.circuit.Port#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cau.cs.kieler.circuit.PortType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.cau.cs.kieler.circuit.PortType
	 * @see #setType(PortType)
	 * @see de.cau.cs.kieler.circuit.CircuitPackage#getPort_Type()
	 * @model required="true"
	 * @generated
	 */
	PortType getType();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.circuit.Port#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.cau.cs.kieler.circuit.PortType
	 * @see #getType()
	 * @generated
	 */
	void setType(PortType value);

} // Port
