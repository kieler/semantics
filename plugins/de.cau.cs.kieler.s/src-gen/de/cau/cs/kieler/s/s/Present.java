/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.s.s;

import de.cau.cs.kieler.core.expressions.Expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Present</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.s.s.Present#getSignal <em>Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.s.s.Present#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.s.s.SPackage#getPresent()
 * @model
 * @generated
 */
public interface Present extends Instruction
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
   * @see #setSignal(Expression)
   * @see de.cau.cs.kieler.s.s.SPackage#getPresent_Signal()
   * @model containment="true"
   * @generated
   */
  Expression getSignal();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.s.s.Present#getSignal <em>Signal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signal</em>' containment reference.
   * @see #getSignal()
   * @generated
   */
  void setSignal(Expression value);

  /**
   * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.s.s.Instruction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instructions</em>' containment reference list.
   * @see de.cau.cs.kieler.s.s.SPackage#getPresent_Instructions()
   * @model containment="true"
   * @generated
   */
  EList<Instruction> getInstructions();

} // Present
