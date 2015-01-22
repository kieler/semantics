/**
 */
package de.cau.cs.kieler.scgprios;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.Entry_P#getExit <em>Exit</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.Entry_P#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getEntry_P()
 * @model
 * @generated
 */
public interface Entry_P extends Node_P {
    /**
     * Returns the value of the '<em><b>Exit</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.scgprios.Exit_P#getEntry <em>Entry</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exit</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exit</em>' reference.
     * @see #setExit(Exit_P)
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getEntry_P_Exit()
     * @see de.cau.cs.kieler.scgprios.Exit_P#getEntry
     * @model opposite="entry" required="true"
     * @generated
     */
    Exit_P getExit();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.Entry_P#getExit <em>Exit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Exit</em>' reference.
     * @see #getExit()
     * @generated
     */
    void setExit(Exit_P value);

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
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getEntry_P_Next()
     * @model containment="true"
     * @generated
     */
    ControlFlow_P getNext();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.Entry_P#getNext <em>Next</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Next</em>' containment reference.
     * @see #getNext()
     * @generated
     */
    void setNext(ControlFlow_P value);

} // Entry_P
