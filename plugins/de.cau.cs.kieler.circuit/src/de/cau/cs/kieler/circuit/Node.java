/**
 */
package de.cau.cs.kieler.circuit;

import de.cau.cs.kieler.core.annotations.NamedObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.circuit.Node#getInputPorts <em>Input Ports</em>}</li>
 *   <li>{@link de.cau.cs.kieler.circuit.Node#getOutputPorts <em>Output Ports</em>}</li>
 *   <li>{@link de.cau.cs.kieler.circuit.Node#getNodeID <em>Node ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.circuit.CircuitPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends NamedObject {
	/**
	 * Returns the value of the '<em><b>Input Ports</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.circuit.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Ports</em>' reference list.
	 * @see de.cau.cs.kieler.circuit.CircuitPackage#getNode_InputPorts()
	 * @model
	 * @generated
	 */
	EList<Port> getInputPorts();

	/**
	 * Returns the value of the '<em><b>Output Ports</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.circuit.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Ports</em>' reference list.
	 * @see de.cau.cs.kieler.circuit.CircuitPackage#getNode_OutputPorts()
	 * @model
	 * @generated
	 */
	EList<Port> getOutputPorts();

	/**
	 * Returns the value of the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node ID</em>' attribute.
	 * @see #setNodeID(String)
	 * @see de.cau.cs.kieler.circuit.CircuitPackage#getNode_NodeID()
	 * @model
	 * @generated
	 */
	String getNodeID();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.circuit.Node#getNodeID <em>Node ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node ID</em>' attribute.
	 * @see #getNodeID()
	 * @generated
	 */
	void setNodeID(String value);

} // Node
