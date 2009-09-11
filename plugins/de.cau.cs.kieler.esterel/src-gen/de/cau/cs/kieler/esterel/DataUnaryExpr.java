/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Unary Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.DataUnaryExpr#getSignal <em>Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.DataUnaryExpr#getTrap <em>Trap</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.DataUnaryExpr#getFunction <em>Function</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.DataUnaryExpr#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getDataUnaryExpr()
 * @model
 * @generated
 */
public interface DataUnaryExpr extends EObject
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
   * @see #setSignal(Signal)
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getDataUnaryExpr_Signal()
   * @model
   * @generated
   */
  Signal getSignal();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.DataUnaryExpr#getSignal <em>Signal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signal</em>' reference.
   * @see #getSignal()
   * @generated
   */
  void setSignal(Signal value);

  /**
   * Returns the value of the '<em><b>Trap</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trap</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trap</em>' reference.
   * @see #setTrap(Trap)
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getDataUnaryExpr_Trap()
   * @model
   * @generated
   */
  Trap getTrap();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.DataUnaryExpr#getTrap <em>Trap</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trap</em>' reference.
   * @see #getTrap()
   * @generated
   */
  void setTrap(Trap value);

  /**
   * Returns the value of the '<em><b>Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' reference.
   * @see #setFunction(Function)
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getDataUnaryExpr_Function()
   * @model
   * @generated
   */
  Function getFunction();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.DataUnaryExpr#getFunction <em>Function</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' reference.
   * @see #getFunction()
   * @generated
   */
  void setFunction(Function value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.DataExpr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getDataUnaryExpr_Expression()
   * @model containment="true"
   * @generated
   */
  EList<DataExpr> getExpression();

} // DataUnaryExpr
