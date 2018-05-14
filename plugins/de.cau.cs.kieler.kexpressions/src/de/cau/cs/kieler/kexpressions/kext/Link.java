/**
 */
package de.cau.cs.kieler.kexpressions.kext;

import de.cau.cs.kieler.annotations.Annotatable;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.kext.Link#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.kext.KExtPackage#getLink()
 * @model abstract="true"
 * @generated
 */
public interface Link extends Annotatable {
    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.kexpressions.kext.Linkable#getIncomingLinks <em>Incoming Links</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(Linkable)
     * @see de.cau.cs.kieler.kexpressions.kext.KExtPackage#getLink_Target()
     * @see de.cau.cs.kieler.kexpressions.kext.Linkable#getIncomingLinks
     * @model opposite="incomingLinks" required="true"
     * @generated
     */
    Linkable getTarget();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.kext.Link#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(Linkable value);

} // Link
