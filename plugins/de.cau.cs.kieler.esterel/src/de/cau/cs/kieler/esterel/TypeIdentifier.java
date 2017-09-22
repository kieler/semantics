/**
 */
package de.cau.cs.kieler.esterel;

import de.cau.cs.kieler.kexpressions.CombineOperator;
import de.cau.cs.kieler.kexpressions.ValueType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.TypeIdentifier#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.TypeIdentifier#getIdType <em>Id Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.TypeIdentifier#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.TypeIdentifier#getEsterelType <em>Esterel Type</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getTypeIdentifier()
 * @model
 * @generated
 */
public interface TypeIdentifier extends EObject {
    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.kexpressions.ValueType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see de.cau.cs.kieler.kexpressions.ValueType
     * @see #setType(ValueType)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getTypeIdentifier_Type()
     * @model
     * @generated
     */
    ValueType getType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.TypeIdentifier#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see de.cau.cs.kieler.kexpressions.ValueType
     * @see #getType()
     * @generated
     */
    void setType(ValueType value);

    /**
     * Returns the value of the '<em><b>Id Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id Type</em>' attribute.
     * @see #setIdType(String)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getTypeIdentifier_IdType()
     * @model
     * @generated
     */
    String getIdType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.TypeIdentifier#getIdType <em>Id Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id Type</em>' attribute.
     * @see #getIdType()
     * @generated
     */
    void setIdType(String value);

    /**
     * Returns the value of the '<em><b>Operator</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.kexpressions.CombineOperator}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operator</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operator</em>' attribute.
     * @see de.cau.cs.kieler.kexpressions.CombineOperator
     * @see #setOperator(CombineOperator)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getTypeIdentifier_Operator()
     * @model
     * @generated
     */
    CombineOperator getOperator();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.TypeIdentifier#getOperator <em>Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operator</em>' attribute.
     * @see de.cau.cs.kieler.kexpressions.CombineOperator
     * @see #getOperator()
     * @generated
     */
    void setOperator(CombineOperator value);

    /**
     * Returns the value of the '<em><b>Esterel Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Esterel Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Esterel Type</em>' reference.
     * @see #setEsterelType(TypeDefinition)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getTypeIdentifier_EsterelType()
     * @model
     * @generated
     */
    TypeDefinition getEsterelType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.TypeIdentifier#getEsterelType <em>Esterel Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Esterel Type</em>' reference.
     * @see #getEsterelType()
     * @generated
     */
    void setEsterelType(TypeDefinition value);

} // TypeIdentifier
