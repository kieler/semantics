/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.s.s;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.s.s.Emit#getSignal <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.s.s.SPackage#getEmit()
 * @model
 * @generated
 */
public interface Emit extends Instruction
{
  /**
   * Returns the value of the '<em><b>Signal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signal</em>' containment reference.
   * @see #setSignal(SignalReference)
   * @see de.cau.cs.kieler.s.s.SPackage#getEmit_Signal()
   * @model containment="true"
   * @generated
   */
  SignalReference getSignal();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.s.s.Emit#getSignal <em>Signal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signal</em>' containment reference.
   * @see #getSignal()
   * @generated
   */
  void setSignal(SignalReference value);

} // Emit
