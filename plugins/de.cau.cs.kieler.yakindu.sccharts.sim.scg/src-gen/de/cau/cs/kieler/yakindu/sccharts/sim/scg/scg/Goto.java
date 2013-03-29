/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Goto#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.ScgPackage#getGoto()
 * @model
 * @generated
 */
public interface Goto extends Instruction, de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Goto
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
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.ScgPackage#getGoto_Priority()
   * @model
   * @generated
   */
  int getPriority();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Goto#getPriority <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priority</em>' attribute.
   * @see #getPriority()
   * @generated
   */
  void setPriority(int value);

} // Goto
