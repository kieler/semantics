/**
 */
package de.cau.cs.kieler.core.kexpressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.PrimitiveTypeReference#getPrimitiveType <em>Primitive Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getPrimitiveTypeReference()
 * @model
 * @generated
 */
public interface PrimitiveTypeReference extends Type {
    /**
     * Returns the value of the '<em><b>Primitive Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Primitive Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Primitive Type</em>' reference.
     * @see #setPrimitiveType(PrimitiveType)
     * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getPrimitiveTypeReference_PrimitiveType()
     * @model required="true"
     * @generated
     */
    PrimitiveType getPrimitiveType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.PrimitiveTypeReference#getPrimitiveType <em>Primitive Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Primitive Type</em>' reference.
     * @see #getPrimitiveType()
     * @generated
     */
    void setPrimitiveType(PrimitiveType value);

} // PrimitiveTypeReference
