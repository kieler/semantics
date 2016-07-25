/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.esterel.kexpressions;

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
 *   <li>{@link de.cau.cs.kieler.esterel.kexpressions.TypeIdentifier#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.kexpressions.TypeIdentifier#getTypeID <em>Type ID</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.kexpressions.TypeIdentifier#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage#getTypeIdentifier()
 * @model
 * @generated
 */
public interface TypeIdentifier extends EObject {
    /**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"pure"</code>.
	 * The literals are from the enumeration {@link de.cau.cs.kieler.esterel.kexpressions.ValueType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.cau.cs.kieler.esterel.kexpressions.ValueType
	 * @see #setType(ValueType)
	 * @see de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage#getTypeIdentifier_Type()
	 * @model default="pure"
	 * @generated
	 */
    ValueType getType();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.esterel.kexpressions.TypeIdentifier#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.cau.cs.kieler.esterel.kexpressions.ValueType
	 * @see #getType()
	 * @generated
	 */
    void setType(ValueType value);

    /**
	 * Returns the value of the '<em><b>Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Type ID</em>' attribute.
	 * @see #setTypeID(String)
	 * @see de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage#getTypeIdentifier_TypeID()
	 * @model
	 * @generated
	 */
    String getTypeID();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.esterel.kexpressions.TypeIdentifier#getTypeID <em>Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type ID</em>' attribute.
	 * @see #getTypeID()
	 * @generated
	 */
    void setTypeID(String value);

    /**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cau.cs.kieler.esterel.kexpressions.CombineOperator}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operator</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see de.cau.cs.kieler.esterel.kexpressions.CombineOperator
	 * @see #setOperator(CombineOperator)
	 * @see de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage#getTypeIdentifier_Operator()
	 * @model
	 * @generated
	 */
    CombineOperator getOperator();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.esterel.kexpressions.TypeIdentifier#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see de.cau.cs.kieler.esterel.kexpressions.CombineOperator
	 * @see #getOperator()
	 * @generated
	 */
    void setOperator(CombineOperator value);

} // TypeIdentifier
