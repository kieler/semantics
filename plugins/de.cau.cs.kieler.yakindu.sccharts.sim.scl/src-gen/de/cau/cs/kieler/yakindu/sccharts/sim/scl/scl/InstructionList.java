/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionList#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionList#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage#getInstructionList()
 * @model
 * @generated
 */
public interface InstructionList extends Scope
{
  /**
   * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionSequence}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instructions</em>' containment reference list.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage#getInstructionList_Instructions()
   * @model containment="true"
   * @generated
   */
  EList<InstructionSequence> getInstructions();

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.VariableDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage#getInstructionList_Variables()
   * @model containment="true"
   * @generated
   */
  EList<VariableDeclaration> getVariables();

} // InstructionList
