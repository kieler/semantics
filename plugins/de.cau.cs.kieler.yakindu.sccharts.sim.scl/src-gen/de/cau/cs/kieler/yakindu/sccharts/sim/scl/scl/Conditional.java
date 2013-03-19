/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl;

import org.yakindu.sct.model.stext.stext.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Conditional#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Conditional#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage#getConditional()
 * @model
 * @generated
 */
public interface Conditional extends Instruction
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage#getConditional_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Conditional#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Instructions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instructions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instructions</em>' containment reference.
   * @see #setInstructions(Instruction)
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage#getConditional_Instructions()
   * @model containment="true"
   * @generated
   */
  Instruction getInstructions();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Conditional#getInstructions <em>Instructions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instructions</em>' containment reference.
   * @see #getInstructions()
   * @generated
   */
  void setInstructions(Instruction value);

} // Conditional
