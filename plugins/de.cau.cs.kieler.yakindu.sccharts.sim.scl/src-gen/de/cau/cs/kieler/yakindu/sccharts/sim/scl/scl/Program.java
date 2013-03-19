/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.yakindu.sct.model.stext.stext.VariableDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Program#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Program#getVariables <em>Variables</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Program#getInstruction <em>Instruction</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage#getProgram_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Program#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link org.yakindu.sct.model.stext.stext.VariableDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage#getProgram_Variables()
   * @model containment="true"
   * @generated
   */
  EList<VariableDefinition> getVariables();

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
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage#getProgram_Instruction()
   * @model containment="true"
   * @generated
   */
  Instruction getInstruction();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Program#getInstruction <em>Instruction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instruction</em>' containment reference.
   * @see #getInstruction()
   * @generated
   */
  void setInstruction(Instruction value);

} // Program
