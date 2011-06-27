/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.s.s;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forke</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.s.s.Forke#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.s.s.SPackage#getForke()
 * @model
 * @generated
 */
public interface Forke extends Instruction
{
  /**
   * Returns the value of the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' reference.
   * @see #setState(State)
   * @see de.cau.cs.kieler.s.s.SPackage#getForke_State()
   * @model
   * @generated
   */
  State getState();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.s.s.Forke#getState <em>State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' reference.
   * @see #getState()
   * @generated
   */
  void setState(State value);

} // Forke
