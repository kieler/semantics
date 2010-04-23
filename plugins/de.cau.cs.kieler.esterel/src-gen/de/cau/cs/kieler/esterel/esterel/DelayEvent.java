/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel.esterel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delay Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.DelayEvent#getSignal <em>Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.DelayEvent#getTick <em>Tick</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.DelayEvent#getPreSigExpr <em>Pre Sig Expr</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.DelayEvent#getBlockSigExpr <em>Block Sig Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getDelayEvent()
 * @model
 * @generated
 */
public interface DelayEvent extends EObject
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
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getDelayEvent_Signal()
   * @model
   * @generated
   */
  Signal getSignal();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.DelayEvent#getSignal <em>Signal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signal</em>' reference.
   * @see #getSignal()
   * @generated
   */
  void setSignal(Signal value);

  /**
   * Returns the value of the '<em><b>Tick</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tick</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tick</em>' attribute.
   * @see #setTick(String)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getDelayEvent_Tick()
   * @model
   * @generated
   */
  String getTick();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.DelayEvent#getTick <em>Tick</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tick</em>' attribute.
   * @see #getTick()
   * @generated
   */
  void setTick(String value);

  /**
   * Returns the value of the '<em><b>Pre Sig Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pre Sig Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pre Sig Expr</em>' containment reference.
   * @see #setPreSigExpr(SigExpr)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getDelayEvent_PreSigExpr()
   * @model containment="true"
   * @generated
   */
  SigExpr getPreSigExpr();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.DelayEvent#getPreSigExpr <em>Pre Sig Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pre Sig Expr</em>' containment reference.
   * @see #getPreSigExpr()
   * @generated
   */
  void setPreSigExpr(SigExpr value);

  /**
   * Returns the value of the '<em><b>Block Sig Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block Sig Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block Sig Expr</em>' containment reference.
   * @see #setBlockSigExpr(SigExpr)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getDelayEvent_BlockSigExpr()
   * @model containment="true"
   * @generated
   */
  SigExpr getBlockSigExpr();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.DelayEvent#getBlockSigExpr <em>Block Sig Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block Sig Expr</em>' containment reference.
   * @see #getBlockSigExpr()
   * @generated
   */
  void setBlockSigExpr(SigExpr value);

} // DelayEvent
