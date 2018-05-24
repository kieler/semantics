/**
 */
package de.cau.cs.kieler.kexpressions.keffects;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linkable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.Linkable#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.Linkable#getIncomingLinks <em>Incoming Links</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage#getLinkable()
 * @model abstract="true"
 * @generated
 */
public interface Linkable extends EObject {
    /**
     * Returns the value of the '<em><b>Outgoing Links</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kexpressions.keffects.Link}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outgoing Links</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outgoing Links</em>' containment reference list.
     * @see de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage#getLinkable_OutgoingLinks()
     * @model containment="true" transient="true"
     * @generated
     */
    EList<Link> getOutgoingLinks();

    /**
     * Returns the value of the '<em><b>Incoming Links</b></em>' reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kexpressions.keffects.Link}.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.kexpressions.keffects.Link#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Incoming Links</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Incoming Links</em>' reference list.
     * @see de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage#getLinkable_IncomingLinks()
     * @see de.cau.cs.kieler.kexpressions.keffects.Link#getTarget
     * @model opposite="target" transient="true"
     * @generated
     */
    EList<Link> getIncomingLinks();

} // Linkable
