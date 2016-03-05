/**
 */
package de.cau.cs.kieler.s.s;

import de.cau.cs.kieler.core.kexpressions.ValuedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.s.s.LocalSignal#getSignal <em>Signal</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.s.s.SPackage#getLocalSignal()
 * @model
 * @generated
 */
public interface LocalSignal extends Instruction
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
   * @see #setSignal(ValuedObject)
   * @see de.cau.cs.kieler.s.s.SPackage#getLocalSignal_Signal()
   * @model
   * @generated
   */
  ValuedObject getSignal();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.s.s.LocalSignal#getSignal <em>Signal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signal</em>' reference.
   * @see #getSignal()
   * @generated
   */
  void setSignal(ValuedObject value);

} // LocalSignal
