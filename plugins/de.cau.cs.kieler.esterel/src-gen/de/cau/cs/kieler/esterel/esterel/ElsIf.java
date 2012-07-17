/**
 */
package de.cau.cs.kieler.esterel.esterel;

import de.cau.cs.kieler.core.kexpressions.Expression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Els If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.ElsIf#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.ElsIf#getThenPart <em>Then Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getElsIf()
 * @model
 * @generated
 */
public interface ElsIf extends EObject
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
   * @see #setExpr(Expression)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getElsIf_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.ElsIf#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Then Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Part</em>' containment reference.
   * @see #setThenPart(ThenPart)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getElsIf_ThenPart()
   * @model containment="true"
   * @generated
   */
  ThenPart getThenPart();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.ElsIf#getThenPart <em>Then Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then Part</em>' containment reference.
   * @see #getThenPart()
   * @generated
   */
  void setThenPart(ThenPart value);

} // ElsIf
