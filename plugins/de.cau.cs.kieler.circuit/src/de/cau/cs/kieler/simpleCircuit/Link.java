/**
 */
package de.cau.cs.kieler.simpleCircuit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.simpleCircuit.Link#getSource <em>Source</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simpleCircuit.Link#getTarget <em>Target</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simpleCircuit.Link#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simpleCircuit.Link#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.simpleCircuit.SimpleCircuitPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.simpleCircuit.Port#getOutgoingLinks <em>Outgoing Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Port)
	 * @see de.cau.cs.kieler.simpleCircuit.SimpleCircuitPackage#getLink_Source()
	 * @see de.cau.cs.kieler.simpleCircuit.Port#getOutgoingLinks
	 * @model opposite="outgoingLinks"
	 * @generated
	 */
	Port getSource();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.simpleCircuit.Link#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Port value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.simpleCircuit.Port}.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.simpleCircuit.Port#getIncomingLinks <em>Incoming Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see de.cau.cs.kieler.simpleCircuit.SimpleCircuitPackage#getLink_Target()
	 * @see de.cau.cs.kieler.simpleCircuit.Port#getIncomingLinks
	 * @model opposite="incomingLinks"
	 * @generated
	 */
	EList<Port> getTarget();

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
	 * @see de.cau.cs.kieler.simpleCircuit.SimpleCircuitPackage#getLink_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.simpleCircuit.Link#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.simpleCircuit.Circuit#getInnerLinks <em>Inner Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Circuit)
	 * @see de.cau.cs.kieler.simpleCircuit.SimpleCircuitPackage#getLink_Parent()
	 * @see de.cau.cs.kieler.simpleCircuit.Circuit#getInnerLinks
	 * @model opposite="innerLinks" required="true" transient="false"
	 * @generated
	 */
	Circuit getParent();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.simpleCircuit.Link#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Circuit value);

} // Link
