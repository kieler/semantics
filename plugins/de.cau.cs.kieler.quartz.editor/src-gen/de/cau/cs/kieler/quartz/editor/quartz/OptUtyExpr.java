/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.quartz.editor.quartz;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opt Uty Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.OptUtyExpr#getTk <em>Tk</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.OptUtyExpr#getExprs <em>Exprs</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getOptUtyExpr()
 * @model
 * @generated
 */
public interface OptUtyExpr extends OptUtyExprList
{
  /**
   * Returns the value of the '<em><b>Tk</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tk</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tk</em>' containment reference.
   * @see #setTk(UtyExpr)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getOptUtyExpr_Tk()
   * @model containment="true"
   * @generated
   */
  UtyExpr getTk();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.OptUtyExpr#getTk <em>Tk</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tk</em>' containment reference.
   * @see #getTk()
   * @generated
   */
  void setTk(UtyExpr value);

  /**
   * Returns the value of the '<em><b>Exprs</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.quartz.editor.quartz.OptUtyExpr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exprs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exprs</em>' containment reference list.
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getOptUtyExpr_Exprs()
   * @model containment="true"
   * @generated
   */
  EList<OptUtyExpr> getExprs();

} // OptUtyExpr
