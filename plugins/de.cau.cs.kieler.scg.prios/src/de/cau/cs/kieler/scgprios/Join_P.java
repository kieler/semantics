/**
 */
package de.cau.cs.kieler.scgprios;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.Join_P#getFork <em>Fork</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.Join_P#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getJoin_P()
 * @model
 * @generated
 */
public interface Join_P extends Node_P {
    /**
     * Returns the value of the '<em><b>Fork</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.scgprios.Fork_P#getJoin <em>Join</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fork</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fork</em>' reference.
     * @see #setFork(Fork_P)
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getJoin_P_Fork()
     * @see de.cau.cs.kieler.scgprios.Fork_P#getJoin
     * @model opposite="join" required="true"
     * @generated
     */
    Fork_P getFork();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.Join_P#getFork <em>Fork</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fork</em>' reference.
     * @see #getFork()
     * @generated
     */
    void setFork(Fork_P value);

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
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getJoin_P_Next()
     * @model containment="true"
     * @generated
     */
    ControlFlow_P getNext();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.Join_P#getNext <em>Next</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Next</em>' containment reference.
     * @see #getNext()
     * @generated
     */
    void setNext(ControlFlow_P value);

} // Join_P
