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
 *   <li>{@link de.cau.cs.kieler.synccharts.ComplexExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.ComplexExpression#getSubExpressions <em>Sub Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getComplexExpression()
 * @model
 * @generated
 */
public interface ComplexExpression extends Expression {
	/**
     * Returns the value of the '<em><b>Operator</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Operator#getParentExpression <em>Parent Expression</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Operator</em>' containment reference.
     * @see #setOperator(Operator)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getComplexExpression_Operator()
     * @see de.cau.cs.kieler.synccharts.Operator#getParentExpression
     * @model opposite="parentExpression" containment="true" required="true"
     * @generated
     */
	Operator getOperator();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.ComplexExpression#getOperator <em>Operator</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operator</em>' containment reference.
     * @see #getOperator()
     * @generated
     */
	void setOperator(Operator value);

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
     * @model opposite="parentExpression" containment="true" required="true" upper="2"
     * @generated
     */
	EList<Expression> getSubExpressions();

} // ComplexExpression
