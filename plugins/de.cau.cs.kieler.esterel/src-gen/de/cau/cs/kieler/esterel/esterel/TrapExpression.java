/**
 */
package de.cau.cs.kieler.esterel.esterel;

import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.ISignal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trap Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.TrapExpression#getTrap <em>Trap</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getTrapExpression()
 * @model
 * @generated
 */
public interface TrapExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Trap</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trap</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trap</em>' reference.
   * @see #setTrap(ISignal)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getTrapExpression_Trap()
   * @model
   * @generated
   */
  ISignal getTrap();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.TrapExpression#getTrap <em>Trap</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trap</em>' reference.
   * @see #getTrap()
   * @generated
   */
  void setTrap(ISignal value);

} // TrapExpression
