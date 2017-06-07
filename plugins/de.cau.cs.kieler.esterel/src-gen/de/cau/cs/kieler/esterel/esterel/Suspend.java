/**
 */
package de.cau.cs.kieler.esterel.esterel;

import de.cau.cs.kieler.scl.scl.Statement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Suspend</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Suspend#isWeak <em>Weak</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Suspend#getDelay <em>Delay</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getSuspend()
 * @model
 * @generated
 */
public interface Suspend extends StatementContainer, Statement
{
  /**
   * Returns the value of the '<em><b>Weak</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Weak</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Weak</em>' attribute.
   * @see #setWeak(boolean)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getSuspend_Weak()
   * @model
   * @generated
   */
  boolean isWeak();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Suspend#isWeak <em>Weak</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Weak</em>' attribute.
   * @see #isWeak()
   * @generated
   */
  void setWeak(boolean value);

  /**
   * Returns the value of the '<em><b>Delay</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delay</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delay</em>' containment reference.
   * @see #setDelay(DelayExpr)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getSuspend_Delay()
   * @model containment="true"
   * @generated
   */
  DelayExpr getDelay();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Suspend#getDelay <em>Delay</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delay</em>' containment reference.
   * @see #getDelay()
   * @generated
   */
  void setDelay(DelayExpr value);

} // Suspend
