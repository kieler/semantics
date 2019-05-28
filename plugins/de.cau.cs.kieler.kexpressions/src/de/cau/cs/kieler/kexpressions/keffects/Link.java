/**
 */
package de.cau.cs.kieler.kexpressions.keffects;

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
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.Link#getTarget <em>Target</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.Link#getTag <em>Tag</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.Link#getReference <em>Reference</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.Link#getOriginalSource <em>Original Source</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.keffects.Link#getOriginalTarget <em>Original Target</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage#getLink()
 * @model abstract="true"
 * @generated
 */
public interface Link extends Annotatable {
    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.kexpressions.keffects.Linkable#getIncomingLinks <em>Incoming Links</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(Linkable)
     * @see de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage#getLink_Target()
     * @see de.cau.cs.kieler.kexpressions.keffects.Linkable#getIncomingLinks
     * @model opposite="incomingLinks" required="true" transient="true"
     * @generated
     */
    Linkable getTarget();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.keffects.Link#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(Linkable value);

    /**
     * Returns the value of the '<em><b>Tag</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tag</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tag</em>' attribute.
     * @see #setTag(String)
     * @see de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage#getLink_Tag()
     * @model
     * @generated
     */
    String getTag();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.keffects.Link#getTag <em>Tag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tag</em>' attribute.
     * @see #getTag()
     * @generated
     */
    void setTag(String value);

    /**
     * Returns the value of the '<em><b>Reference</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reference</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reference</em>' reference.
     * @see #setReference(EObject)
     * @see de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage#getLink_Reference()
     * @model
     * @generated
     */
    EObject getReference();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.keffects.Link#getReference <em>Reference</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reference</em>' reference.
     * @see #getReference()
     * @generated
     */
    void setReference(EObject value);

    /**
     * Returns the value of the '<em><b>Original Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Original Source</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Original Source</em>' reference.
     * @see #setOriginalSource(EObject)
     * @see de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage#getLink_OriginalSource()
     * @model
     * @generated
     */
    EObject getOriginalSource();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.keffects.Link#getOriginalSource <em>Original Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Original Source</em>' reference.
     * @see #getOriginalSource()
     * @generated
     */
    void setOriginalSource(EObject value);

    /**
     * Returns the value of the '<em><b>Original Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Original Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Original Target</em>' reference.
     * @see #setOriginalTarget(EObject)
     * @see de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage#getLink_OriginalTarget()
     * @model
     * @generated
     */
    EObject getOriginalTarget();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.keffects.Link#getOriginalTarget <em>Original Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Original Target</em>' reference.
     * @see #getOriginalTarget()
     * @generated
     */
    void setOriginalTarget(EObject value);

} // Link
