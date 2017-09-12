/**
 */
package de.cau.cs.kieler.esterel;

import de.cau.cs.kieler.kexpressions.Value;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.Constant#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getConstant()
 * @model
 * @generated
 */
public interface Constant extends EsterelDefinition {

    /**
     * Returns the value of the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Initial Value</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Initial Value</em>' containment reference.
     * @see #setInitialValue(Value)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getConstant_InitialValue()
     * @model containment="true" required="true"
     * @generated
     */
    Value getInitialValue();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.Constant#getInitialValue <em>Initial Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initial Value</em>' containment reference.
     * @see #getInitialValue()
     * @generated
     */
    void setInitialValue(Value value);
} // Constant
