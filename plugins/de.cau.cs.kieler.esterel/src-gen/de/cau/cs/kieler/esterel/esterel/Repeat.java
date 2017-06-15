/**
 */
package de.cau.cs.kieler.esterel.esterel;

import de.cau.cs.kieler.kexpressions.Expression;

import de.cau.cs.kieler.scl.scl.Statement;
import de.cau.cs.kieler.scl.scl.StatementContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Repeat#isPositive <em>Positive</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Repeat#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getRepeat()
 * @model
 * @generated
 */
public interface Repeat extends StatementContainer, Statement
{
  /**
   * Returns the value of the '<em><b>Positive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Positive</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Positive</em>' attribute.
   * @see #setPositive(boolean)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getRepeat_Positive()
   * @model
   * @generated
   */
  boolean isPositive();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Repeat#isPositive <em>Positive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Positive</em>' attribute.
   * @see #isPositive()
   * @generated
   */
  void setPositive(boolean value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getRepeat_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Repeat#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // Repeat
