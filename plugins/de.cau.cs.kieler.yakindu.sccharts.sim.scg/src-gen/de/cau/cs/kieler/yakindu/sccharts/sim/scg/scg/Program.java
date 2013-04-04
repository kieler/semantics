/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg;

import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.VariableDeclaration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Program#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.ScgPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Program
{
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
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.ScgPackage#getProgram_Variables()
   * @model containment="true"
   * @generated
   */
  EList<VariableDeclaration> getVariables();

} // Program
