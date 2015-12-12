/**
 */
package de.cau.cs.kieler.circuit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circuit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.circuit.Circuit#getCircuits <em>Circuits</em>}</li>
 *   <li>{@link de.cau.cs.kieler.circuit.Circuit#getLinks <em>Links</em>}</li>
 *   <li>{@link de.cau.cs.kieler.circuit.Circuit#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.cau.cs.kieler.circuit.Circuit#getPorts <em>Ports</em>}</li>
 *   <li>{@link de.cau.cs.kieler.circuit.Circuit#getRelations <em>Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.circuit.CircuitPackage#getCircuit()
 * @model
 * @generated
 */
public interface Circuit extends Linkable {
	/**
	 * Returns the value of the '<em><b>Circuits</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.circuit.Circuit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circuits</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuits</em>' containment reference list.
	 * @see de.cau.cs.kieler.circuit.CircuitPackage#getCircuit_Circuits()
	 * @model containment="true"
	 * @generated
	 */
	EList<Circuit> getCircuits();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.circuit.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see de.cau.cs.kieler.circuit.CircuitPackage#getCircuit_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.circuit.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see de.cau.cs.kieler.circuit.CircuitPackage#getCircuit_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.circuit.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see de.cau.cs.kieler.circuit.CircuitPackage#getCircuit_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.circuit.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see de.cau.cs.kieler.circuit.CircuitPackage#getCircuit_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();

} // Circuit
