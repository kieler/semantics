/**
 */
package de.cau.cs.kieler.scl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.SequencePart#isSemicolon <em>Semicolon</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.scl.SCLPackage#getSequencePart()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SequencePart extends EObject {
    /**
     * Returns the value of the '<em><b>Semicolon</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Semicolon</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Semicolon</em>' attribute.
     * @see #setSemicolon(boolean)
     * @see de.cau.cs.kieler.scl.SCLPackage#getSequencePart_Semicolon()
     * @model default="false" required="true"
     * @generated
     */
    boolean isSemicolon();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scl.SequencePart#isSemicolon <em>Semicolon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Semicolon</em>' attribute.
     * @see #isSemicolon()
     * @generated
     */
    void setSemicolon(boolean value);

} // SequencePart
