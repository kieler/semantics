/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.expressions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.expressions.TypeIdentifier#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.expressions.TypeIdentifier#getTypeID <em>Type ID</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.expressions.TypeIdentifier#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.core.expressions.ExpressionsPackage#getTypeIdentifier()
 * @model
 * @generated
 */
public interface TypeIdentifier extends EObject {
    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The default value is <code>""</code>.
     * The literals are from the enumeration {@link de.cau.cs.kieler.core.expressions.ValueType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see de.cau.cs.kieler.core.expressions.ValueType
     * @see #setType(ValueType)
     * @see de.cau.cs.kieler.core.expressions.ExpressionsPackage#getTypeIdentifier_Type()
     * @model default=""
     * @generated
     */
    ValueType getType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.expressions.TypeIdentifier#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see de.cau.cs.kieler.core.expressions.ValueType
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
     * @see de.cau.cs.kieler.core.expressions.ExpressionsPackage#getTypeIdentifier_TypeID()
     * @model
     * @generated
     */
    String getTypeID();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.expressions.TypeIdentifier#getTypeID <em>Type ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type ID</em>' attribute.
     * @see #getTypeID()
     * @generated
     */
    void setTypeID(String value);

    /**
     * Returns the value of the '<em><b>Operator</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.core.expressions.CombineOperator}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operator</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operator</em>' attribute.
     * @see de.cau.cs.kieler.core.expressions.CombineOperator
     * @see #setOperator(CombineOperator)
     * @see de.cau.cs.kieler.core.expressions.ExpressionsPackage#getTypeIdentifier_Operator()
     * @model
     * @generated
     */
    CombineOperator getOperator();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.expressions.TypeIdentifier#getOperator <em>Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operator</em>' attribute.
     * @see de.cau.cs.kieler.core.expressions.CombineOperator
     * @see #getOperator()
     * @generated
     */
    void setOperator(CombineOperator value);

} // TypeIdentifier
