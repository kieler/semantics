/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.kies.esterel;

import de.cau.cs.kieler.core.kexpressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trap Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.TrapHandler#getTrapExpr <em>Trap Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getTrapHandler()
 * @model
 * @generated
 */
public interface TrapHandler extends StatementContainer
{
  /**
   * Returns the value of the '<em><b>Trap Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trap Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trap Expr</em>' containment reference.
   * @see #setTrapExpr(Expression)
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getTrapHandler_TrapExpr()
   * @model containment="true"
   * @generated
   */
  Expression getTrapExpr();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.TrapHandler#getTrapExpr <em>Trap Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trap Expr</em>' containment reference.
   * @see #getTrapExpr()
   * @generated
   */
  void setTrapExpr(Expression value);

} // TrapHandler
