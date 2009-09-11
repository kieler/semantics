/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Delay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.LoopDelay#getDelay <em>Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getLoopDelay()
 * @model
 * @generated
 */
public interface LoopDelay extends LoopEach
{
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
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getLoopDelay_Delay()
   * @model containment="true"
   * @generated
   */
  DelayExpr getDelay();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.LoopDelay#getDelay <em>Delay</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delay</em>' containment reference.
   * @see #getDelay()
   * @generated
   */
  void setDelay(DelayExpr value);

} // LoopDelay
