/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.kies.esterel;

import de.cau.cs.kieler.core.kexpressions.ISignal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor With Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.SensorWithType#getSensor <em>Sensor</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.SensorWithType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getSensorWithType()
 * @model
 * @generated
 */
public interface SensorWithType extends EObject
{
  /**
   * Returns the value of the '<em><b>Sensor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sensor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sensor</em>' containment reference.
   * @see #setSensor(ISignal)
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getSensorWithType_Sensor()
   * @model containment="true"
   * @generated
   */
  ISignal getSensor();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.SensorWithType#getSensor <em>Sensor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sensor</em>' containment reference.
   * @see #getSensor()
   * @generated
   */
  void setSensor(ISignal value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TypeIdentifier)
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getSensorWithType_Type()
   * @model containment="true"
   * @generated
   */
  TypeIdentifier getType();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.SensorWithType#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeIdentifier value);

} // SensorWithType
