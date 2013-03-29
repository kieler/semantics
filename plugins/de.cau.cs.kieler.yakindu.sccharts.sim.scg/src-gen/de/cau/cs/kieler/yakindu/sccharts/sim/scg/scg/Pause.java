/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Pause#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.ScgPackage#getPause()
 * @model
 * @generated
 */
public interface Pause extends Instruction, de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Pause
{
  /**
   * Returns the value of the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Priority</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Priority</em>' attribute.
   * @see #setPriority(int)
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.ScgPackage#getPause_Priority()
   * @model
   * @generated
   */
  int getPriority();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Pause#getPriority <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priority</em>' attribute.
   * @see #getPriority()
   * @generated
   */
  void setPriority(int value);

} // Pause
