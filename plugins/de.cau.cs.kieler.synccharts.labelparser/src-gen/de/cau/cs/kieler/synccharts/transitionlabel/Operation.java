/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.transitionlabel;

import de.cau.cs.kieler.synccharts.Expression;
import de.cau.cs.kieler.synccharts.OperatorType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.transitionlabel.Operation#getSubExpressions <em>Sub Expressions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.transitionlabel.Operation#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.transitionlabel.Operation#getSubExpression <em>Sub Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.transitionlabel.TransitionlabelPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends Expression
{
  /**
   * Returns the value of the '<em><b>Sub Expressions</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.synccharts.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Expressions</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.TransitionlabelPackage#getOperation_SubExpressions()
   * @model containment="true"
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
   * @see de.cau.cs.kieler.synccharts.transitionlabel.TransitionlabelPackage#getOperation_Operator()
   * @model
   * @generated
   */
  OperatorType getOperator();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.transitionlabel.Operation#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see de.cau.cs.kieler.synccharts.OperatorType
   * @see #getOperator()
   * @generated
   */
  void setOperator(OperatorType value);

  /**
   * Returns the value of the '<em><b>Sub Expression</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.synccharts.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Expression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Expression</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.TransitionlabelPackage#getOperation_SubExpression()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getSubExpression();

} // Operation
