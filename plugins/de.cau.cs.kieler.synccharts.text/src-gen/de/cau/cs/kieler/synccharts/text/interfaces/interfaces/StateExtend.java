/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.text.interfaces.interfaces;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Extend</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.StateExtend#getRegions <em>Regions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.StateExtend#getInOutputSignals <em>In Output Signals</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.StateExtend#getOutputSignals <em>Output Signals</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.StateExtend#getInputSignals <em>Input Signals</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.StateExtend#getSignals <em>Signals</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.StateExtend#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.InterfacesPackage#getStateExtend()
 * @model
 * @generated
 */
public interface StateExtend extends EObject
{
  /**
   * Returns the value of the '<em><b>Regions</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.RegionSignalDec}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Regions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Regions</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.InterfacesPackage#getStateExtend_Regions()
   * @model containment="true"
   * @generated
   */
  EList<RegionSignalDec> getRegions();

  /**
   * Returns the value of the '<em><b>In Output Signals</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.InOutputSignals}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In Output Signals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In Output Signals</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.InterfacesPackage#getStateExtend_InOutputSignals()
   * @model containment="true"
   * @generated
   */
  EList<InOutputSignals> getInOutputSignals();

  /**
   * Returns the value of the '<em><b>Output Signals</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.OutputSignals}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output Signals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Signals</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.InterfacesPackage#getStateExtend_OutputSignals()
   * @model containment="true"
   * @generated
   */
  EList<OutputSignals> getOutputSignals();

  /**
   * Returns the value of the '<em><b>Input Signals</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.InputSignals}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input Signals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Signals</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.InterfacesPackage#getStateExtend_InputSignals()
   * @model containment="true"
   * @generated
   */
  EList<InputSignals> getInputSignals();

  /**
   * Returns the value of the '<em><b>Signals</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.Signals}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signals</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.InterfacesPackage#getStateExtend_Signals()
   * @model containment="true"
   * @generated
   */
  EList<Signals> getSignals();

  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.Variables}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.InterfacesPackage#getStateExtend_Variable()
   * @model containment="true"
   * @generated
   */
  EList<Variables> getVariable();

} // StateExtend
