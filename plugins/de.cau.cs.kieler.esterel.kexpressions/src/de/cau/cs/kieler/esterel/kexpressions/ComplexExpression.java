/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.esterel.kexpressions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ComplexExpression is an Expression that contains a list of sub expressions.
 * This does make sense mainly for it subtypes. It does not carry an operator
 * or something similar itself, because sub expressions make also sense in some
 * contexts without an operator, e.g. for SignalReferences.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.kexpressions.ComplexExpression#getSubExpressions <em>Sub Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage#getComplexExpression()
 * @model
 * @generated
 */
public interface ComplexExpression extends Expression {
    /**
     * Returns the value of the '<em><b>Sub Expressions</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.esterel.kexpressions.Expression}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Expressions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Expressions</em>' containment reference list.
     * @see de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage#getComplexExpression_SubExpressions()
     * @model containment="true"
     * @generated
     */
    EList<Expression> getSubExpressions();

} // ComplexExpression
