/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scl.s;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.Instruction#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.Instruction#getSecondinstructions <em>Secondinstructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.SPackage#getInstruction()
 * @model
 * @generated
 */
public interface Instruction extends EObject
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
   * @see #setInstruction(EObject)
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.SPackage#getInstruction_Instruction()
   * @model containment="true"
   * @generated
   */
  EObject getInstruction();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.Instruction#getInstruction <em>Instruction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instruction</em>' containment reference.
   * @see #getInstruction()
   * @generated
   */
  void setInstruction(EObject value);

  /**
   * Returns the value of the '<em><b>Secondinstructions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Secondinstructions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Secondinstructions</em>' containment reference.
   * @see #setSecondinstructions(Instruction)
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.SPackage#getInstruction_Secondinstructions()
   * @model containment="true"
   * @generated
   */
  Instruction getSecondinstructions();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.Instruction#getSecondinstructions <em>Secondinstructions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Secondinstructions</em>' containment reference.
   * @see #getSecondinstructions()
   * @generated
   */
  void setSecondinstructions(Instruction value);

} // Instruction
