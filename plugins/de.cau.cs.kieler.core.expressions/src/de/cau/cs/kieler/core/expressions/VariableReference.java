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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A VariableReference has a reference to a Variable object and is a ComplexExpression.
 * Therefore such reference may have subExpressions. Those can be used to 
 * address a specific value. E.g. the Variable could carry an array
 * value and a subExpression could be an IntValue that points to a special entry in 
 * that array. 
 * <p>
 * The distinction between a Variable and a VariableReference is mainly due to containment
 * relations. A Variable is usually defined exactly once and therefore contained by some 
 * scope element. A reference to that Variable may be required multiple times where
 * such reference need to be contained at the places where the reference is used.
 * Hence we need this distinction.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.expressions.VariableReference#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.core.expressions.ExpressionsPackage#getVariableReference()
 * @model
 * @generated
 */
public interface VariableReference extends ComplexExpression {
    /**
     * Returns the value of the '<em><b>Variable</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variable</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variable</em>' reference.
     * @see #setVariable(Variable)
     * @see de.cau.cs.kieler.core.expressions.ExpressionsPackage#getVariableReference_Variable()
     * @model required="true"
     * @generated
     */
    Variable getVariable();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.core.expressions.VariableReference#getVariable <em>Variable</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Variable</em>' reference.
     * @see #getVariable()
     * @generated
     */
    void setVariable(Variable value);

} // VariableReference
