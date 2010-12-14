/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.kies.esterel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.SensorDecl#getSensors <em>Sensors</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getSensorDecl()
 * @model
 * @generated
 */
public interface SensorDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Sensors</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.kies.esterel.SensorWithType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sensors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sensors</em>' containment reference list.
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getSensorDecl_Sensors()
   * @model containment="true"
   * @generated
   */
  EList<SensorWithType> getSensors();

} // SensorDecl
