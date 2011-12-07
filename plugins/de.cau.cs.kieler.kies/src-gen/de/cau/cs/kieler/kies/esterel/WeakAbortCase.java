/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.kies.esterel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weak Abort Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.WeakAbortCase#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getWeakAbortCase()
 * @model
 * @generated
 */
public interface WeakAbortCase extends AbortCase
{
  /**
   * Returns the value of the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' containment reference.
   * @see #setEnd(WeakAbortEnd)
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getWeakAbortCase_End()
   * @model containment="true"
   * @generated
   */
  WeakAbortEnd getEnd();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.WeakAbortCase#getEnd <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' containment reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(WeakAbortEnd value);

} // WeakAbortCase
