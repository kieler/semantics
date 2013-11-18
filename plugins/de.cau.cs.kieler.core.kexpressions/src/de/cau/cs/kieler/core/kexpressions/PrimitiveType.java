/**
 */
package de.cau.cs.kieler.core.kexpressions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.PrimitiveType#getValueType <em>Value Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.PrimitiveType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getPrimitiveType()
 * @model
 * @generated
 */
public interface PrimitiveType extends Type {
    /**
     * Returns the value of the '<em><b>Value Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.core.kexpressions.ValueType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value Type</em>' attribute.
     * @see de.cau.cs.kieler.core.kexpressions.ValueType
     * @see #setValueType(ValueType)
     * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getPrimitiveType_ValueType()
     * @model required="true"
     * @generated
     */
    ValueType getValueType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.PrimitiveType#getValueType <em>Value Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value Type</em>' attribute.
     * @see de.cau.cs.kieler.core.kexpressions.ValueType
     * @see #getValueType()
     * @generated
     */
    void setValueType(ValueType value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getPrimitiveType_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.PrimitiveType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // PrimitiveType
