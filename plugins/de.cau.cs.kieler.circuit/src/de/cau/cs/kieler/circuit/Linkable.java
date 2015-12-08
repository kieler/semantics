/**
 */
package de.cau.cs.kieler.circuit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linkable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.circuit.Linkable#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link de.cau.cs.kieler.circuit.Linkable#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link de.cau.cs.kieler.circuit.Linkable#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.circuit.CircuitPackage#getLinkable()
 * @model abstract="true"
 * @generated
 */
public interface Linkable extends EObject {
	/**
	 * Returns the value of the '<em><b>Incoming Links</b></em>' reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.circuit.Link}.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.circuit.Link#getTarger <em>Targer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Links</em>' reference list.
	 * @see de.cau.cs.kieler.circuit.CircuitPackage#getLinkable_IncomingLinks()
	 * @see de.cau.cs.kieler.circuit.Link#getTarger
	 * @model opposite="targer"
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
	 * @see de.cau.cs.kieler.circuit.CircuitPackage#getLinkable_OutgoingLinks()
	 * @see de.cau.cs.kieler.circuit.Link#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Link> getOutgoingLinks();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.cau.cs.kieler.circuit.CircuitPackage#getLinkable_Id()
	 * @model default=""
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.circuit.Linkable#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Linkable
