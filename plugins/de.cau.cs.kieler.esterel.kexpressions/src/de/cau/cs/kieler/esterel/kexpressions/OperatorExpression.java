/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.esterel.kexpressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OperatorExpression is the most obvious ComplexExpression containing
 * an operator and a list of subExpressions. The meaning is that the operator 
 * should be applied to all elements of the ordered subExpression list.
 * Note that some pre-defined operators are not commutative, hence the
 * order of the subExpressions list is of importance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.kexpressions.OperatorExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage#getOperatorExpression()
 * @model
 * @generated
 */
public interface OperatorExpression extends ComplexExpression {
    /**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cau.cs.kieler.esterel.kexpressions.OperatorType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operator</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see de.cau.cs.kieler.esterel.kexpressions.OperatorType
	 * @see #setOperator(OperatorType)
	 * @see de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage#getOperatorExpression_Operator()
	 * @model
	 * @generated
	 */
    OperatorType getOperator();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.esterel.kexpressions.OperatorExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see de.cau.cs.kieler.esterel.kexpressions.OperatorType
	 * @see #getOperator()
	 * @generated
	 */
    void setOperator(OperatorType value);

} // OperatorExpression
