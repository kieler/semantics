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
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Parallel#getFirstThread <em>First Thread</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Parallel#getSecondThread <em>Second Thread</em>}</li>
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
   * Returns the value of the '<em><b>First Thread</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Thread</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Thread</em>' containment reference.
   * @see #setFirstThread(Instruction)
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage#getParallel_FirstThread()
   * @model containment="true"
   * @generated
   */
  Instruction getFirstThread();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Parallel#getFirstThread <em>First Thread</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Thread</em>' containment reference.
   * @see #getFirstThread()
   * @generated
   */
  void setFirstThread(Instruction value);

  /**
   * Returns the value of the '<em><b>Second Thread</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second Thread</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second Thread</em>' containment reference.
   * @see #setSecondThread(Instruction)
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage#getParallel_SecondThread()
   * @model containment="true"
   * @generated
   */
  Instruction getSecondThread();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Parallel#getSecondThread <em>Second Thread</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second Thread</em>' containment reference.
   * @see #getSecondThread()
   * @generated
   */
  void setSecondThread(Instruction value);

} // Parallel
