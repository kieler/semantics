/**
 */
package de.cau.cs.kieler.s.s;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.s.s.Prio#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.cau.cs.kieler.s.s.Prio#getContinuation <em>Continuation</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.s.s.SPackage#getPrio()
 * @model
 * @generated
 */
public interface Prio extends Instruction
{
  /**
   * Returns the value of the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Priority</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Priority</em>' attribute.
   * @see #setPriority(int)
   * @see de.cau.cs.kieler.s.s.SPackage#getPrio_Priority()
   * @model
   * @generated
   */
  int getPriority();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.s.s.Prio#getPriority <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priority</em>' attribute.
   * @see #getPriority()
   * @generated
   */
  void setPriority(int value);

  /**
   * Returns the value of the '<em><b>Continuation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Continuation</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Continuation</em>' reference.
   * @see #setContinuation(State)
   * @see de.cau.cs.kieler.s.s.SPackage#getPrio_Continuation()
   * @model
   * @generated
   */
  State getContinuation();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.s.s.Prio#getContinuation <em>Continuation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Continuation</em>' reference.
   * @see #getContinuation()
   * @generated
   */
  void setContinuation(State value);

} // Prio
