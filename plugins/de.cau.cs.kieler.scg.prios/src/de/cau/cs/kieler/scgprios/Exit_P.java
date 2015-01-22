/**
 */
package de.cau.cs.kieler.scgprios;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exit P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.Exit_P#getEntry <em>Entry</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.Exit_P#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getExit_P()
 * @model
 * @generated
 */
public interface Exit_P extends Node_P {
    /**
     * Returns the value of the '<em><b>Entry</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.scgprios.Entry_P#getExit <em>Exit</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entry</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entry</em>' reference.
     * @see #setEntry(Entry_P)
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getExit_P_Entry()
     * @see de.cau.cs.kieler.scgprios.Entry_P#getExit
     * @model opposite="exit" required="true"
     * @generated
     */
    Entry_P getEntry();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.Exit_P#getEntry <em>Entry</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entry</em>' reference.
     * @see #getEntry()
     * @generated
     */
    void setEntry(Entry_P value);

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
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getExit_P_Next()
     * @model containment="true"
     * @generated
     */
    ControlFlow_P getNext();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.Exit_P#getNext <em>Next</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Next</em>' containment reference.
     * @see #getNext()
     * @generated
     */
    void setNext(ControlFlow_P value);

} // Exit_P
