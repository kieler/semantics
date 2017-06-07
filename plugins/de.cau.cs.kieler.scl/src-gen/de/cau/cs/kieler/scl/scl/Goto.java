/**
 */
package de.cau.cs.kieler.scl.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.scl.Goto#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.scl.scl.SclPackage#getGoto()
 * @model
 * @generated
 */
public interface Goto extends Statement {
    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(Label)
     * @see de.cau.cs.kieler.scl.scl.SclPackage#getGoto_Target()
     * @model required="true"
     * @generated
     */
    Label getTarget();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.scl.scl.Goto#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(Label value);

} // Goto
