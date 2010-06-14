/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.OperatorExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getOperatorExpression()
 * @model
 * @generated
 */
public interface OperatorExpression extends ComplexExpression {
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
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getOperatorExpression_Operator()
	 * @model
	 * @generated
	 */
	OperatorType getOperator();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.OperatorExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see de.cau.cs.kieler.synccharts.OperatorType
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(OperatorType value);

} // OperatorExpression
