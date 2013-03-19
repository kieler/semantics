/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scl.s;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.Parallel#getFirstinstruction <em>Firstinstruction</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.Parallel#getSecondinstruction <em>Secondinstruction</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.SPackage#getParallel()
 * @model
 * @generated
 */
public interface Parallel extends Instruction
{
  /**
   * Returns the value of the '<em><b>Firstinstruction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Firstinstruction</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Firstinstruction</em>' containment reference.
   * @see #setFirstinstruction(Instruction)
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.SPackage#getParallel_Firstinstruction()
   * @model containment="true"
   * @generated
   */
  Instruction getFirstinstruction();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.Parallel#getFirstinstruction <em>Firstinstruction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Firstinstruction</em>' containment reference.
   * @see #getFirstinstruction()
   * @generated
   */
  void setFirstinstruction(Instruction value);

  /**
   * Returns the value of the '<em><b>Secondinstruction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Secondinstruction</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Secondinstruction</em>' containment reference.
   * @see #setSecondinstruction(Instruction)
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.SPackage#getParallel_Secondinstruction()
   * @model containment="true"
   * @generated
   */
  Instruction getSecondinstruction();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.Parallel#getSecondinstruction <em>Secondinstruction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Secondinstruction</em>' containment reference.
   * @see #getSecondinstruction()
   * @generated
   */
  void setSecondinstruction(Instruction value);

} // Parallel
