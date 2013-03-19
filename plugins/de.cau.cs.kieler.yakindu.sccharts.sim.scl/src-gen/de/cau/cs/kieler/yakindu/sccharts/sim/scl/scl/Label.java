/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Label#getInstruction <em>Instruction</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage#getLabel()
 * @model
 * @generated
 */
public interface Label extends Instruction
{
  /**
   * Returns the value of the '<em><b>Instruction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instruction</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instruction</em>' containment reference.
   * @see #setInstruction(Instruction)
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage#getLabel_Instruction()
   * @model containment="true"
   * @generated
   */
  Instruction getInstruction();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Label#getInstruction <em>Instruction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instruction</em>' containment reference.
   * @see #getInstruction()
   * @generated
   */
  void setInstruction(Instruction value);

} // Label
