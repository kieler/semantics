/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.transitionlabel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.transitionlabel.Expression#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.transitionlabel.Expression#getSubExpressions <em>Sub Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.transitionlabel.TransitionlabelPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.kieler.synccharts.transitionlabel.OperatorKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.OperatorKind
   * @see #setOperator(OperatorKind)
   * @see de.cau.cs.kieler.synccharts.transitionlabel.TransitionlabelPackage#getExpression_Operator()
   * @model
   * @generated
   */
  OperatorKind getOperator();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.transitionlabel.Expression#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.OperatorKind
   * @see #getOperator()
   * @generated
   */
  void setOperator(OperatorKind value);

  /**
   * Returns the value of the '<em><b>Sub Expressions</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.synccharts.transitionlabel.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Expressions</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.transitionlabel.TransitionlabelPackage#getExpression_SubExpressions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getSubExpressions();

} // Expression
