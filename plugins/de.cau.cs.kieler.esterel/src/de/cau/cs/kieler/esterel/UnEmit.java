/**
 */
package de.cau.cs.kieler.esterel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Un Emit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.UnEmit#getSignal <em>Signal</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getUnEmit()
 * @model
 * @generated
 */
public interface UnEmit extends SCEstStatement {
    /**
     * Returns the value of the '<em><b>Signal</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Signal</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Signal</em>' reference.
     * @see #setSignal(Signal)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getUnEmit_Signal()
     * @model
     * @generated
     */
    Signal getSignal();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.UnEmit#getSignal <em>Signal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Signal</em>' reference.
     * @see #getSignal()
     * @generated
     */
    void setSignal(Signal value);

} // UnEmit
