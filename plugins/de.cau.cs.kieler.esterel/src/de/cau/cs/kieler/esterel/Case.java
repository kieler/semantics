/**
 */
package de.cau.cs.kieler.esterel;

import de.cau.cs.kieler.scl.StatementContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.Case#getDelay <em>Delay</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getCase()
 * @model
 * @generated
 */
public interface Case extends StatementContainer {
    /**
     * Returns the value of the '<em><b>Delay</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delay</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delay</em>' containment reference.
     * @see #setDelay(DelayExpression)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getCase_Delay()
     * @model containment="true"
     * @generated
     */
    DelayExpression getDelay();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.Case#getDelay <em>Delay</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delay</em>' containment reference.
     * @see #getDelay()
     * @generated
     */
    void setDelay(DelayExpression value);

} // Case
