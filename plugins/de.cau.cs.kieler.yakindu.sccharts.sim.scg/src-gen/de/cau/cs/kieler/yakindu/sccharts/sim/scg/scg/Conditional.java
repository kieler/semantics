/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Conditional#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Conditional#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.ScgPackage#getConditional()
 * @model
 * @generated
 */
public interface Conditional extends Instruction, de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Conditional
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
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.ScgPackage#getConditional_Priority()
   * @model
   * @generated
   */
  int getPriority();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Conditional#getPriority <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priority</em>' attribute.
   * @see #getPriority()
   * @generated
   */
  void setPriority(int value);

  /**
   * Returns the value of the '<em><b>Dependencies</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependencies</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependencies</em>' containment reference.
   * @see #setDependencies(Dependency)
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.ScgPackage#getConditional_Dependencies()
   * @model containment="true"
   * @generated
   */
  Dependency getDependencies();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Conditional#getDependencies <em>Dependencies</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dependencies</em>' containment reference.
   * @see #getDependencies()
   * @generated
   */
  void setDependencies(Dependency value);

} // Conditional
