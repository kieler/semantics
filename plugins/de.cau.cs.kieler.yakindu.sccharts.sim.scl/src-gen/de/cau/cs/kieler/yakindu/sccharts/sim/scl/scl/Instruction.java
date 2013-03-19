/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Instruction#getSecondInstructions <em>Second Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage#getInstruction()
 * @model
 * @generated
 */
public interface Instruction extends EObject
{
  /**
   * Returns the value of the '<em><b>Second Instructions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second Instructions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second Instructions</em>' containment reference.
   * @see #setSecondInstructions(Instruction)
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage#getInstruction_SecondInstructions()
   * @model containment="true"
   * @generated
   */
  Instruction getSecondInstructions();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Instruction#getSecondInstructions <em>Second Instructions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second Instructions</em>' containment reference.
   * @see #getSecondInstructions()
   * @generated
   */
  void setSecondInstructions(Instruction value);

} // Instruction
