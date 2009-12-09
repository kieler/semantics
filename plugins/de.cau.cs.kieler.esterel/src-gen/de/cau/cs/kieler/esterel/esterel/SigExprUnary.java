/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel.esterel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sig Expr Unary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.SigExprUnary#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.SigExprUnary#getSigExpr <em>Sig Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getSigExprUnary()
 * @model
 * @generated
 */
public interface SigExprUnary extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' attribute.
   * @see #setExpr(String)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getSigExprUnary_Expr()
   * @model
   * @generated
   */
  String getExpr();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.SigExprUnary#getExpr <em>Expr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' attribute.
   * @see #getExpr()
   * @generated
   */
  void setExpr(String value);

  /**
   * Returns the value of the '<em><b>Sig Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sig Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sig Expr</em>' containment reference.
   * @see #setSigExpr(EObject)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getSigExprUnary_SigExpr()
   * @model containment="true"
   * @generated
   */
  EObject getSigExpr();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.SigExprUnary#getSigExpr <em>Sig Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sig Expr</em>' containment reference.
   * @see #getSigExpr()
   * @generated
   */
  void setSigExpr(EObject value);

} // SigExprUnary
