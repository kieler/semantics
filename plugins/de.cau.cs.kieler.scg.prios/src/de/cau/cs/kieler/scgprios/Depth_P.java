/**
 */
package de.cau.cs.kieler.scgprios;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Depth P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.Depth_P#getSurface <em>Surface</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.Depth_P#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getDepth_P()
 * @model
 * @generated
 */
public interface Depth_P extends Node_P {
    /**
     * Returns the value of the '<em><b>Surface</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.scgprios.Surface_P#getDepth <em>Depth</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Surface</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Surface</em>' reference.
     * @see #setSurface(Surface_P)
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getDepth_P_Surface()
     * @see de.cau.cs.kieler.scgprios.Surface_P#getDepth
     * @model opposite="depth" required="true"
     * @generated
     */
    Surface_P getSurface();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.Depth_P#getSurface <em>Surface</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Surface</em>' reference.
     * @see #getSurface()
     * @generated
     */
    void setSurface(Surface_P value);

    /**
     * Returns the value of the '<em><b>Next</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Next</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Next</em>' containment reference.
     * @see #setNext(ControlFlow_P)
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getDepth_P_Next()
     * @model containment="true"
     * @generated
     */
    ControlFlow_P getNext();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.Depth_P#getNext <em>Next</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Next</em>' containment reference.
     * @see #getNext()
     * @generated
     */
    void setNext(ControlFlow_P value);

} // Depth_P
