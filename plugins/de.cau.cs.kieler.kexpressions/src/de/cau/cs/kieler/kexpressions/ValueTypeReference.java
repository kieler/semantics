/**
 */
package de.cau.cs.kieler.kexpressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.ValueTypeReference#getValueType <em>Value Type</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getValueTypeReference()
 * @model
 * @generated
 */
public interface ValueTypeReference extends Expression {
    /**
     * Returns the value of the '<em><b>Value Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.kexpressions.ValueType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value Type</em>' attribute.
     * @see de.cau.cs.kieler.kexpressions.ValueType
     * @see #setValueType(ValueType)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getValueTypeReference_ValueType()
     * @model required="true"
     * @generated
     */
    ValueType getValueType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.ValueTypeReference#getValueType <em>Value Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value Type</em>' attribute.
     * @see de.cau.cs.kieler.kexpressions.ValueType
     * @see #getValueType()
     * @generated
     */
    void setValueType(ValueType value);

} // ValueTypeReference
