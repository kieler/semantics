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

} // Node
