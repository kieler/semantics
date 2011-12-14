/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.esterel.esterel;

import de.cau.cs.kieler.core.kexpressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Exit#getTrap <em>Trap</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Exit#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getExit()
 * @model
 * @generated
 */
public interface Exit extends Statement
{
  /**
   * Returns the value of the '<em><b>Trap</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trap</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trap</em>' reference.
   * @see #setTrap(TrapDecl)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getExit_Trap()
   * @model
   * @generated
   */
  TrapDecl getTrap();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Exit#getTrap <em>Trap</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trap</em>' reference.
   * @see #getTrap()
   * @generated
   */
  void setTrap(TrapDecl value);

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
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getExit_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Exit#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // Exit
