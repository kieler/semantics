/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.text.interfaces.interfaces;

import de.cau.cs.kieler.core.kexpressions.Signal;
import de.cau.cs.kieler.core.kexpressions.Variable;

import de.cau.cs.kieler.synccharts.Region;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region Signal Dec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.RegionSignalDec#getRegion <em>Region</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.RegionSignalDec#getVars <em>Vars</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.RegionSignalDec#getSignals <em>Signals</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.InterfacesPackage#getRegionSignalDec()
 * @model
 * @generated
 */
public interface RegionSignalDec extends EObject
{
  /**
   * Returns the value of the '<em><b>Region</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Region</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Region</em>' reference.
   * @see #setRegion(Region)
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.InterfacesPackage#getRegionSignalDec_Region()
   * @model
   * @generated
   */
  Region getRegion();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.RegionSignalDec#getRegion <em>Region</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Region</em>' reference.
   * @see #getRegion()
   * @generated
   */
  void setRegion(Region value);

  /**
   * Returns the value of the '<em><b>Vars</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.InterfacesPackage#getRegionSignalDec_Vars()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getVars();

  /**
   * Returns the value of the '<em><b>Signals</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.Signal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signals</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.InterfacesPackage#getRegionSignalDec_Signals()
   * @model containment="true"
   * @generated
   */
  EList<Signal> getSignals();

} // RegionSignalDec
