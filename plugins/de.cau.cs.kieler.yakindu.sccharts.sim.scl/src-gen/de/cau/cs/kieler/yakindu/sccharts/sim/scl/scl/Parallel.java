/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Parallel#getFirstInstruction <em>First Instruction</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Parallel#getSecondInstruction <em>Second Instruction</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage#getParallel()
 * @model
 * @generated
 */
public interface Parallel extends Instruction
{
  /**
   * Returns the value of the '<em><b>First Instruction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Instruction</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Instruction</em>' containment reference.
   * @see #setFirstInstruction(Instruction)
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage#getParallel_FirstInstruction()
   * @model containment="true"
   * @generated
   */
  Instruction getFirstInstruction();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Parallel#getFirstInstruction <em>First Instruction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Instruction</em>' containment reference.
   * @see #getFirstInstruction()
   * @generated
   */
  void setFirstInstruction(Instruction value);

  /**
   * Returns the value of the '<em><b>Second Instruction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second Instruction</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second Instruction</em>' containment reference.
   * @see #setSecondInstruction(Instruction)
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage#getParallel_SecondInstruction()
   * @model containment="true"
   * @generated
   */
  Instruction getSecondInstruction();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Parallel#getSecondInstruction <em>Second Instruction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second Instruction</em>' containment reference.
   * @see #getSecondInstruction()
   * @generated
   */
  void setSecondInstruction(Instruction value);

} // Parallel
