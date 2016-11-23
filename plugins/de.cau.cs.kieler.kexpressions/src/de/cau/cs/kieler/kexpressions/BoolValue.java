/**
 */
package de.cau.cs.kieler.kexpressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Boolean value object.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.BoolValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getBoolValue()
 * @model
 * @generated
 */
public interface BoolValue extends Value {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(Boolean)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getBoolValue_Value()
     * @model required="true"
     * @generated
     */
    Boolean getValue();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.BoolValue#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(Boolean value);

} // BoolValue
