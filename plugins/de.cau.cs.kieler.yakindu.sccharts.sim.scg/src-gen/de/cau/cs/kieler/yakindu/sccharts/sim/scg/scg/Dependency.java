/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Dependency#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.ScgPackage#getDependency()
 * @model
 * @generated
 */
public interface Dependency extends EObject
{
  /**
   * Returns the value of the '<em><b>Dependencies</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependencies</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependencies</em>' reference.
   * @see #setDependencies(Assignment)
   * @see de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.ScgPackage#getDependency_Dependencies()
   * @model
   * @generated
   */
  Assignment getDependencies();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Dependency#getDependencies <em>Dependencies</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dependencies</em>' reference.
   * @see #getDependencies()
   * @generated
   */
  void setDependencies(Assignment value);

} // Dependency
