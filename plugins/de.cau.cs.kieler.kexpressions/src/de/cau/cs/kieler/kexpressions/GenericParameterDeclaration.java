/**
 */
package de.cau.cs.kieler.kexpressions;

import de.cau.cs.kieler.annotations.NamedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Parameter Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.GenericParameterDeclaration#isReference <em>Reference</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.GenericParameterDeclaration#getValueType <em>Value Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.GenericParameterDeclaration#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getGenericParameterDeclaration()
 * @model
 * @generated
 */
public interface GenericParameterDeclaration extends Declaration {
    /**
     * Returns the value of the '<em><b>Reference</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reference</em>' attribute.
     * @see #setReference(boolean)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getGenericParameterDeclaration_Reference()
     * @model required="true"
     * @generated
     */
    boolean isReference();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.GenericParameterDeclaration#isReference <em>Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reference</em>' attribute.
     * @see #isReference()
     * @generated
     */
    void setReference(boolean value);

    /**
     * Returns the value of the '<em><b>Value Type</b></em>' attribute.
     * The default value is <code>"UNKNOWN"</code>.
     * The literals are from the enumeration {@link de.cau.cs.kieler.kexpressions.ValueType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value Type</em>' attribute.
     * @see de.cau.cs.kieler.kexpressions.ValueType
     * @see #setValueType(ValueType)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getGenericParameterDeclaration_ValueType()
     * @model default="UNKNOWN"
     * @generated
     */
    ValueType getValueType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.GenericParameterDeclaration#getValueType <em>Value Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value Type</em>' attribute.
     * @see de.cau.cs.kieler.kexpressions.ValueType
     * @see #getValueType()
     * @generated
     */
    void setValueType(ValueType value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(NamedObject)
     * @see de.cau.cs.kieler.kexpressions.KExpressionsPackage#getGenericParameterDeclaration_Type()
     * @model
     * @generated
     */
    NamedObject getType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.kexpressions.GenericParameterDeclaration#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(NamedObject value);

} // GenericParameterDeclaration
