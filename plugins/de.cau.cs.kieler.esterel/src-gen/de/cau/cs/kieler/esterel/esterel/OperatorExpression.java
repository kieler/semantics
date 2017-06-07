/**
 */
package de.cau.cs.kieler.esterel.esterel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.OperatorExpression#getSubExpressions <em>Sub Expressions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.OperatorExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getOperatorExpression()
 * @model
 * @generated
 */
public interface OperatorExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Sub Expressions</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.esterel.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Expressions</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getOperatorExpression_SubExpressions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getSubExpressions();

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.kieler.esterel.esterel.OperatorType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see de.cau.cs.kieler.esterel.esterel.OperatorType
   * @see #setOperator(OperatorType)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getOperatorExpression_Operator()
   * @model
   * @generated
   */
  OperatorType getOperator();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.OperatorExpression#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see de.cau.cs.kieler.esterel.esterel.OperatorType
   * @see #getOperator()
   * @generated
   */
  void setOperator(OperatorType value);

} // OperatorExpression
