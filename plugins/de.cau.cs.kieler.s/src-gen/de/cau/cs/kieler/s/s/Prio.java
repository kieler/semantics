/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.s.s;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.s.s.Prio#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.s.s.SPackage#getPrio()
 * @model
 * @generated
 */
public interface Prio extends Instruction
{
  /**
   * Returns the value of the '<em><b>Priority</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Priority</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Priority</em>' containment reference.
   * @see #setPriority(IntValue)
   * @see de.cau.cs.kieler.s.s.SPackage#getPrio_Priority()
   * @model containment="true"
   * @generated
   */
  IntValue getPriority();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.s.s.Prio#getPriority <em>Priority</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priority</em>' containment reference.
   * @see #getPriority()
   * @generated
   */
  void setPriority(IntValue value);

} // Prio
