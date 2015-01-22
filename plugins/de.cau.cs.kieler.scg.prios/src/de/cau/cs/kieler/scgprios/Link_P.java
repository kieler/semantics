/**
 */
package de.cau.cs.kieler.scgprios;

import de.cau.cs.kieler.core.annotations.Annotatable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.Link_P#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getLink_P()
 * @model
 * @generated
 */
public interface Link_P extends Annotatable {
    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.scgprios.Node_P#getIncoming <em>Incoming</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(Node_P)
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getLink_P_Target()
     * @see de.cau.cs.kieler.scgprios.Node_P#getIncoming
     * @model opposite="incoming" required="true"
     * @generated
     */
    Node_P getTarget();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.Link_P#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(Node_P value);

} // Link_P
