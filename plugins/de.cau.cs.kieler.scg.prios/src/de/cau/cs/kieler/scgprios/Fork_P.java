/**
 */
package de.cau.cs.kieler.scgprios;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fork P</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.Fork_P#getJoin <em>Join</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.Fork_P#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getFork_P()
 * @model
 * @generated
 */
public interface Fork_P extends Node_P {
    /**
     * Returns the value of the '<em><b>Join</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.scgprios.Join_P#getFork <em>Fork</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Join</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Join</em>' reference.
     * @see #setJoin(Join_P)
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getFork_P_Join()
     * @see de.cau.cs.kieler.scgprios.Join_P#getFork
     * @model opposite="fork" required="true"
     * @generated
     */
    Join_P getJoin();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scgprios.Fork_P#getJoin <em>Join</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Join</em>' reference.
     * @see #getJoin()
     * @generated
     */
    void setJoin(Join_P value);

    /**
     * Returns the value of the '<em><b>Next</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.scgprios.ControlFlow_P}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Next</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Next</em>' containment reference list.
     * @see de.cau.cs.kieler.scgprios.ScgpriosPackage#getFork_P_Next()
     * @model containment="true" required="true"
     * @generated
     */
    EList<ControlFlow_P> getNext();

} // Fork_P
