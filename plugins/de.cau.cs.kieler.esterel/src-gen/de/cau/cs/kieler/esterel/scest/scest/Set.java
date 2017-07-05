/**
 */
package de.cau.cs.kieler.esterel.scest.scest;

import de.cau.cs.kieler.esterel.esterel.ISignal;

import de.cau.cs.kieler.kexpressions.Expression;

import de.cau.cs.kieler.scl.scl.Statement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.scest.scest.Set#getSignal <em>Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.scest.scest.Set#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.scest.scest.ScestPackage#getSet()
 * @model
 * @generated
 */
public interface Set extends Statement
{
  /**
   * Returns the value of the '<em><b>Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signal</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signal</em>' reference.
   * @see #setSignal(ISignal)
   * @see de.cau.cs.kieler.esterel.scest.scest.ScestPackage#getSet_Signal()
   * @model
   * @generated
   */
  ISignal getSignal();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.scest.scest.Set#getSignal <em>Signal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signal</em>' reference.
   * @see #getSignal()
   * @generated
   */
  void setSignal(ISignal value);

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
   * @see de.cau.cs.kieler.esterel.scest.scest.ScestPackage#getSet_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.scest.scest.Set#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // Set
