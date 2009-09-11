/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Do Upto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.DoUpto#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getDoUpto()
 * @model
 * @generated
 */
public interface DoUpto extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(DelayExpr)
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getDoUpto_Expr()
   * @model containment="true"
   * @generated
   */
  DelayExpr getExpr();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.DoUpto#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(DelayExpr value);

} // DoUpto
