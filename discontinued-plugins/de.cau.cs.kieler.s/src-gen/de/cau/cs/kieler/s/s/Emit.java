/**
 */
package de.cau.cs.kieler.s.s;

import de.cau.cs.kieler.kexpressions.Expression;
import de.cau.cs.kieler.kexpressions.ValuedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.s.s.Emit#getSignal <em>Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.s.s.Emit#getValue <em>Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.s.s.Emit#getContinuation <em>Continuation</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.s.s.SPackage#getEmit()
 * @model
 * @generated
 */
public interface Emit extends Instruction
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
   * @see de.cau.cs.kieler.s.s.SPackage#getEmit_Signal()
   * @model
   * @generated
   */
  ValuedObject getSignal();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.s.s.Emit#getSignal <em>Signal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signal</em>' reference.
   * @see #getSignal()
   * @generated
   */
  void setSignal(ValuedObject value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Expression)
   * @see de.cau.cs.kieler.s.s.SPackage#getEmit_Value()
   * @model containment="true"
   * @generated
   */
  Expression getValue();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.s.s.Emit#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Expression value);

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
   * @see de.cau.cs.kieler.s.s.SPackage#getEmit_Continuation()
   * @model
   * @generated
   */
  State getContinuation();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.s.s.Emit#getContinuation <em>Continuation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Continuation</em>' reference.
   * @see #getContinuation()
   * @generated
   */
  void setContinuation(State value);

} // Emit
