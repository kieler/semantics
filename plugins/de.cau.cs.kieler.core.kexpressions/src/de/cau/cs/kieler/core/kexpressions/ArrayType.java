/**
 */
package de.cau.cs.kieler.core.kexpressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.ArrayType#getElementType <em>Element Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.ArrayType#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getArrayType()
 * @model
 * @generated
 */
public interface ArrayType extends Type {
    /**
     * Returns the value of the '<em><b>Element Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Element Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Element Type</em>' containment reference.
     * @see #setElementType(Type)
     * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getArrayType_ElementType()
     * @model containment="true" required="true"
     * @generated
     */
    Type getElementType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.ArrayType#getElementType <em>Element Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Element Type</em>' containment reference.
     * @see #getElementType()
     * @generated
     */
    void setElementType(Type value);

    /**
     * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cardinality</em>' attribute.
     * @see #setCardinality(int)
     * @see de.cau.cs.kieler.core.kexpressions.KExpressionsPackage#getArrayType_Cardinality()
     * @model
     * @generated
     */
    int getCardinality();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.kexpressions.ArrayType#getCardinality <em>Cardinality</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cardinality</em>' attribute.
     * @see #getCardinality()
     * @generated
     */
    void setCardinality(int value);

} // ArrayType
