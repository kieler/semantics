/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.ComplexExpression#getSubExpressions <em>Sub Expressions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.ComplexExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getComplexExpression()
 * @model
 * @generated
 */
public interface ComplexExpression extends Expression {
    /**
     * Returns the value of the '<em><b>Sub Expressions</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.synccharts.Expression}.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Expression#getParentExpression <em>Parent Expression</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Expressions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Expressions</em>' containment reference list.
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getComplexExpression_SubExpressions()
     * @see de.cau.cs.kieler.synccharts.Expression#getParentExpression
     * @model opposite="parentExpression" containment="true" required="true"
     * @generated
     */
    EList<Expression> getSubExpressions();

    /**
     * Returns the value of the '<em><b>Operator</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.synccharts.OperatorType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operator</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operator</em>' attribute.
     * @see de.cau.cs.kieler.synccharts.OperatorType
     * @see #setOperator(OperatorType)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getComplexExpression_Operator()
     * @model required="true"
     * @generated
     */
    OperatorType getOperator();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.ComplexExpression#getOperator <em>Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operator</em>' attribute.
     * @see de.cau.cs.kieler.synccharts.OperatorType
     * @see #getOperator()
     * @generated
     */
    void setOperator(OperatorType value);

} // ComplexExpression
