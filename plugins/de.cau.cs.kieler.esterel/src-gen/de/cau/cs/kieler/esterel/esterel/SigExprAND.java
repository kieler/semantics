/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.esterel.esterel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sig Expr AND</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.SigExprAND#getUnaExpr <em>Una Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getSigExprAND()
 * @model
 * @generated
 */
public interface SigExprAND extends EObject
{
  /**
   * Returns the value of the '<em><b>Una Expr</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.esterel.SigExprUnary}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Una Expr</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Una Expr</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getSigExprAND_UnaExpr()
   * @model containment="true"
   * @generated
   */
  EList<SigExprUnary> getUnaExpr();

} // SigExprAND
