/**
 */
package de.cau.cs.kieler.s.s;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.s.s.Instruction#getContinuation <em>Continuation</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.s.s.SPackage#getInstruction()
 * @model
 * @generated
 */
public interface Instruction extends EObject
{
  /**
   * Returns the value of the '<em><b>Continuation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Continuation</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Continuation</em>' reference.
   * @see #setContinuation(Continuation)
   * @see de.cau.cs.kieler.s.s.SPackage#getInstruction_Continuation()
   * @model
   * @generated
   */
  Continuation getContinuation();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.s.s.Instruction#getContinuation <em>Continuation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Continuation</em>' reference.
   * @see #getContinuation()
   * @generated
   */
  void setContinuation(Continuation value);

} // Instruction
