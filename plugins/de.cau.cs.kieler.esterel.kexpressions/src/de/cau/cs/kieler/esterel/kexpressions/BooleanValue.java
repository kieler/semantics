/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.esterel.kexpressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Boolean value object.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.kexpressions.BooleanValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage#getBooleanValue()
 * @model
 * @generated
 */
public interface BooleanValue extends Value {
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
     * @see de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage#getBooleanValue_Value()
     * @model required="true"
     * @generated
     */
    Boolean getValue();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.kexpressions.BooleanValue#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(Boolean value);

} // BooleanValue
