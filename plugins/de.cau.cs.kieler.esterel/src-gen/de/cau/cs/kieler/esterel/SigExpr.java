/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sig Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.SigExpr#getAndExpr <em>And Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getSigExpr()
 * @model
 * @generated
 */
public interface SigExpr extends TrapExpr, DelayEvent
{
  /**
   * Returns the value of the '<em><b>And Expr</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.SigExprAND}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>And Expr</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>And Expr</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getSigExpr_AndExpr()
   * @model containment="true"
   * @generated
   */
  EList<SigExprAND> getAndExpr();

} // SigExpr
