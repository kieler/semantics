/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.text.interfaces.interfaces;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.InterfacesFactory
 * @model kind="package"
 * @generated
 */
public interface InterfacesPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "interfaces";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://kieler.cs.cau.de/synccharts/interfaces";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "interfaces";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  InterfacesPackage eINSTANCE = de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.InterfacesPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.StateExtendImpl <em>State Extend</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.StateExtendImpl
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.InterfacesPackageImpl#getStateExtend()
   * @generated
   */
  int STATE_EXTEND = 0;

  /**
   * The feature id for the '<em><b>Regions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_EXTEND__REGIONS = 0;

  /**
   * The feature id for the '<em><b>In Output Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_EXTEND__IN_OUTPUT_SIGNALS = 1;

  /**
   * The feature id for the '<em><b>Output Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_EXTEND__OUTPUT_SIGNALS = 2;

  /**
   * The feature id for the '<em><b>Input Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_EXTEND__INPUT_SIGNALS = 3;

  /**
   * The feature id for the '<em><b>Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_EXTEND__SIGNALS = 4;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_EXTEND__VARIABLE = 5;

  /**
   * The number of structural features of the '<em>State Extend</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_EXTEND_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.RegionSignalDecImpl <em>Region Signal Dec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.RegionSignalDecImpl
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.InterfacesPackageImpl#getRegionSignalDec()
   * @generated
   */
  int REGION_SIGNAL_DEC = 1;

  /**
   * The feature id for the '<em><b>Region</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION_SIGNAL_DEC__REGION = 0;

  /**
   * The feature id for the '<em><b>Vars</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION_SIGNAL_DEC__VARS = 1;

  /**
   * The feature id for the '<em><b>Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION_SIGNAL_DEC__SIGNALS = 2;

  /**
   * The number of structural features of the '<em>Region Signal Dec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION_SIGNAL_DEC_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.VariablesImpl <em>Variables</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.VariablesImpl
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.InterfacesPackageImpl#getVariables()
   * @generated
   */
  int VARIABLES = 2;

  /**
   * The feature id for the '<em><b>Vars</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES__VARS = 0;

  /**
   * The number of structural features of the '<em>Variables</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.SignalsImpl <em>Signals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.SignalsImpl
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.InterfacesPackageImpl#getSignals()
   * @generated
   */
  int SIGNALS = 3;

  /**
   * The feature id for the '<em><b>Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNALS__SIGNALS = 0;

  /**
   * The number of structural features of the '<em>Signals</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNALS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.InputSignalsImpl <em>Input Signals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.InputSignalsImpl
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.InterfacesPackageImpl#getInputSignals()
   * @generated
   */
  int INPUT_SIGNALS = 4;

  /**
   * The feature id for the '<em><b>Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_SIGNALS__SIGNALS = 0;

  /**
   * The number of structural features of the '<em>Input Signals</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_SIGNALS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.OutputSignalsImpl <em>Output Signals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.OutputSignalsImpl
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.InterfacesPackageImpl#getOutputSignals()
   * @generated
   */
  int OUTPUT_SIGNALS = 5;

  /**
   * The feature id for the '<em><b>Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_SIGNALS__SIGNALS = 0;

  /**
   * The number of structural features of the '<em>Output Signals</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_SIGNALS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.InOutputSignalsImpl <em>In Output Signals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.InOutputSignalsImpl
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.InterfacesPackageImpl#getInOutputSignals()
   * @generated
   */
  int IN_OUTPUT_SIGNALS = 6;

  /**
   * The feature id for the '<em><b>Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_OUTPUT_SIGNALS__SIGNALS = 0;

  /**
   * The number of structural features of the '<em>In Output Signals</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_OUTPUT_SIGNALS_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.StateExtend <em>State Extend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Extend</em>'.
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.StateExtend
   * @generated
   */
  EClass getStateExtend();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.StateExtend#getRegions <em>Regions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Regions</em>'.
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.StateExtend#getRegions()
   * @see #getStateExtend()
   * @generated
   */
  EReference getStateExtend_Regions();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.StateExtend#getInOutputSignals <em>In Output Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>In Output Signals</em>'.
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.StateExtend#getInOutputSignals()
   * @see #getStateExtend()
   * @generated
   */
  EReference getStateExtend_InOutputSignals();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.StateExtend#getOutputSignals <em>Output Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Output Signals</em>'.
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.StateExtend#getOutputSignals()
   * @see #getStateExtend()
   * @generated
   */
  EReference getStateExtend_OutputSignals();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.StateExtend#getInputSignals <em>Input Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Input Signals</em>'.
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.StateExtend#getInputSignals()
   * @see #getStateExtend()
   * @generated
   */
  EReference getStateExtend_InputSignals();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.StateExtend#getSignals <em>Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signals</em>'.
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.StateExtend#getSignals()
   * @see #getStateExtend()
   * @generated
   */
  EReference getStateExtend_Signals();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.StateExtend#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variable</em>'.
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.StateExtend#getVariable()
   * @see #getStateExtend()
   * @generated
   */
  EReference getStateExtend_Variable();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.RegionSignalDec <em>Region Signal Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Region Signal Dec</em>'.
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.RegionSignalDec
   * @generated
   */
  EClass getRegionSignalDec();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.RegionSignalDec#getRegion <em>Region</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Region</em>'.
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.RegionSignalDec#getRegion()
   * @see #getRegionSignalDec()
   * @generated
   */
  EReference getRegionSignalDec_Region();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.RegionSignalDec#getVars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vars</em>'.
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.RegionSignalDec#getVars()
   * @see #getRegionSignalDec()
   * @generated
   */
  EReference getRegionSignalDec_Vars();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.RegionSignalDec#getSignals <em>Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signals</em>'.
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.RegionSignalDec#getSignals()
   * @see #getRegionSignalDec()
   * @generated
   */
  EReference getRegionSignalDec_Signals();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.Variables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variables</em>'.
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.Variables
   * @generated
   */
  EClass getVariables();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.Variables#getVars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vars</em>'.
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.Variables#getVars()
   * @see #getVariables()
   * @generated
   */
  EReference getVariables_Vars();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.Signals <em>Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signals</em>'.
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.Signals
   * @generated
   */
  EClass getSignals();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.Signals#getSignals <em>Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signals</em>'.
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.Signals#getSignals()
   * @see #getSignals()
   * @generated
   */
  EReference getSignals_Signals();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.InputSignals <em>Input Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Signals</em>'.
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.InputSignals
   * @generated
   */
  EClass getInputSignals();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.InputSignals#getSignals <em>Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signals</em>'.
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.InputSignals#getSignals()
   * @see #getInputSignals()
   * @generated
   */
  EReference getInputSignals_Signals();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.OutputSignals <em>Output Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Signals</em>'.
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.OutputSignals
   * @generated
   */
  EClass getOutputSignals();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.OutputSignals#getSignals <em>Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signals</em>'.
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.OutputSignals#getSignals()
   * @see #getOutputSignals()
   * @generated
   */
  EReference getOutputSignals_Signals();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.InOutputSignals <em>In Output Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Output Signals</em>'.
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.InOutputSignals
   * @generated
   */
  EClass getInOutputSignals();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.InOutputSignals#getSignals <em>Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signals</em>'.
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.InOutputSignals#getSignals()
   * @see #getInOutputSignals()
   * @generated
   */
  EReference getInOutputSignals_Signals();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  InterfacesFactory getInterfacesFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.StateExtendImpl <em>State Extend</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.StateExtendImpl
     * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.InterfacesPackageImpl#getStateExtend()
     * @generated
     */
    EClass STATE_EXTEND = eINSTANCE.getStateExtend();

    /**
     * The meta object literal for the '<em><b>Regions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_EXTEND__REGIONS = eINSTANCE.getStateExtend_Regions();

    /**
     * The meta object literal for the '<em><b>In Output Signals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_EXTEND__IN_OUTPUT_SIGNALS = eINSTANCE.getStateExtend_InOutputSignals();

    /**
     * The meta object literal for the '<em><b>Output Signals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_EXTEND__OUTPUT_SIGNALS = eINSTANCE.getStateExtend_OutputSignals();

    /**
     * The meta object literal for the '<em><b>Input Signals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_EXTEND__INPUT_SIGNALS = eINSTANCE.getStateExtend_InputSignals();

    /**
     * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_EXTEND__SIGNALS = eINSTANCE.getStateExtend_Signals();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_EXTEND__VARIABLE = eINSTANCE.getStateExtend_Variable();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.RegionSignalDecImpl <em>Region Signal Dec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.RegionSignalDecImpl
     * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.InterfacesPackageImpl#getRegionSignalDec()
     * @generated
     */
    EClass REGION_SIGNAL_DEC = eINSTANCE.getRegionSignalDec();

    /**
     * The meta object literal for the '<em><b>Region</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGION_SIGNAL_DEC__REGION = eINSTANCE.getRegionSignalDec_Region();

    /**
     * The meta object literal for the '<em><b>Vars</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGION_SIGNAL_DEC__VARS = eINSTANCE.getRegionSignalDec_Vars();

    /**
     * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGION_SIGNAL_DEC__SIGNALS = eINSTANCE.getRegionSignalDec_Signals();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.VariablesImpl <em>Variables</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.VariablesImpl
     * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.InterfacesPackageImpl#getVariables()
     * @generated
     */
    EClass VARIABLES = eINSTANCE.getVariables();

    /**
     * The meta object literal for the '<em><b>Vars</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLES__VARS = eINSTANCE.getVariables_Vars();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.SignalsImpl <em>Signals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.SignalsImpl
     * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.InterfacesPackageImpl#getSignals()
     * @generated
     */
    EClass SIGNALS = eINSTANCE.getSignals();

    /**
     * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNALS__SIGNALS = eINSTANCE.getSignals_Signals();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.InputSignalsImpl <em>Input Signals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.InputSignalsImpl
     * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.InterfacesPackageImpl#getInputSignals()
     * @generated
     */
    EClass INPUT_SIGNALS = eINSTANCE.getInputSignals();

    /**
     * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_SIGNALS__SIGNALS = eINSTANCE.getInputSignals_Signals();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.OutputSignalsImpl <em>Output Signals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.OutputSignalsImpl
     * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.InterfacesPackageImpl#getOutputSignals()
     * @generated
     */
    EClass OUTPUT_SIGNALS = eINSTANCE.getOutputSignals();

    /**
     * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_SIGNALS__SIGNALS = eINSTANCE.getOutputSignals_Signals();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.InOutputSignalsImpl <em>In Output Signals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.InOutputSignalsImpl
     * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl.InterfacesPackageImpl#getInOutputSignals()
     * @generated
     */
    EClass IN_OUTPUT_SIGNALS = eINSTANCE.getInOutputSignals();

    /**
     * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_OUTPUT_SIGNALS__SIGNALS = eINSTANCE.getInOutputSignals_Signals();

  }

} //InterfacesPackage
