/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel.esterel;

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
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.SensorDecl#getSensor <em>Sensor</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getSensorDecl()
 * @model
 * @generated
 */
public interface SensorDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Sensor</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.esterel.Sensor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sensor</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sensor</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getSensorDecl_Sensor()
   * @model containment="true"
   * @generated
   */
  EList<Sensor> getSensor();

} // SensorDecl
