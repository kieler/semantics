/**
 */
package de.cau.cs.kieler.scl.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.scl.InstructionStatement#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.scl.scl.SclPackage#getInstructionStatement()
 * @model
 * @generated
 */
public interface InstructionStatement extends Statement
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
   * @see de.cau.cs.kieler.scl.scl.SclPackage#getInstructionStatement_Instruction()
   * @model containment="true"
   * @generated
   */
  Instruction getInstruction();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.scl.scl.InstructionStatement#getInstruction <em>Instruction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instruction</em>' containment reference.
   * @see #getInstruction()
   * @generated
   */
  void setInstruction(Instruction value);

} // InstructionStatement
