/**
 */
package de.cau.cs.kieler.scgprios;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Surface P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.Surface_P#getDepth <em>Depth</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getSurface_P()
 * @model
 * @generated
 */
public interface Surface_P extends Node_P {
    /**
     * Returns the value of the '<em><b>Depth</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.scgprios.Depth_P#getSurface <em>Surface</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Depth</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Depth</em>' reference.
     * @see #setDepth(Depth_P)
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getSurface_P_Depth()
     * @see de.cau.cs.kieler.scgprios.Depth_P#getSurface
     * @model opposite="surface" required="true"
     * @generated
     */
    Depth_P getDepth();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.Surface_P#getDepth <em>Depth</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Depth</em>' reference.
     * @see #getDepth()
     * @generated
     */
    void setDepth(Depth_P value);

} // Surface_P
