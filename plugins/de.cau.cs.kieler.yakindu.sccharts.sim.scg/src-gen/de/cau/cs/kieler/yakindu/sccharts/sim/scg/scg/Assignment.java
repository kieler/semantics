/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Assignment#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.ScgPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Instruction, de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Assignment
{
  /**
   * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Dependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependencies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependencies</em>' containment reference list.
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.ScgPackage#getAssignment_Dependencies()
   * @model containment="true"
   * @generated
   */
  EList<Dependency> getDependencies();

} // Assignment
