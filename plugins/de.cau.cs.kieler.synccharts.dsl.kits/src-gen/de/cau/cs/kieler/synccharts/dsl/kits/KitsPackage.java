/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.kits;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see de.cau.cs.kieler.synccharts.dsl.kits.KitsFactory
 * @model kind="package"
 * @generated
 */
public interface KitsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "kits";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cau.de/cs/kieler/synccharts/dsl/Kits";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "kits";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  KitsPackage eINSTANCE = de.cau.cs.kieler.synccharts.dsl.kits.impl.KitsPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.kits.impl.RegionImpl <em>Region</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.kits.impl.RegionImpl
   * @see de.cau.cs.kieler.synccharts.dsl.kits.impl.KitsPackageImpl#getRegion()
   * @generated
   */
  int REGION = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION__ID = 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION__VARIABLES = 1;

  /**
   * The feature id for the '<em><b>Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION__SIGNALS = 2;

  /**
   * The feature id for the '<em><b>Inner States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION__INNER_STATES = 3;

  /**
   * The number of structural features of the '<em>Region</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.kits.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.kits.impl.StateImpl
   * @see de.cau.cs.kieler.synccharts.dsl.kits.impl.KitsPackageImpl#getState()
   * @generated
   */
  int STATE = 1;

  /**
   * The feature id for the '<em><b>Is Initial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__IS_INITIAL = 0;

  /**
   * The feature id for the '<em><b>Is Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__IS_FINAL = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__TYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 3;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__LABEL = 4;

  /**
   * The feature id for the '<em><b>Body Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__BODY_TEXT = 5;

  /**
   * The feature id for the '<em><b>Entry Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__ENTRY_ACTIONS = 6;

  /**
   * The feature id for the '<em><b>Inner Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__INNER_ACTIONS = 7;

  /**
   * The feature id for the '<em><b>Exit Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__EXIT_ACTIONS = 8;

  /**
   * The feature id for the '<em><b>Suspension Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__SUSPENSION_TRIGGER = 9;

  /**
   * The feature id for the '<em><b>Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__SIGNALS = 10;

  /**
   * The feature id for the '<em><b>Regions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__REGIONS = 11;

  /**
   * The feature id for the '<em><b>Outgoing Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__OUTGOING_TRANSITIONS = 12;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 13;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.kits.Region <em>Region</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Region</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits.Region
   * @generated
   */
  EClass getRegion();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits.Region#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits.Region#getId()
   * @see #getRegion()
   * @generated
   */
  EAttribute getRegion_Id();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.kits.Region#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits.Region#getVariables()
   * @see #getRegion()
   * @generated
   */
  EReference getRegion_Variables();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.kits.Region#getSignals <em>Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signals</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits.Region#getSignals()
   * @see #getRegion()
   * @generated
   */
  EReference getRegion_Signals();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.kits.Region#getInnerStates <em>Inner States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inner States</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits.Region#getInnerStates()
   * @see #getRegion()
   * @generated
   */
  EReference getRegion_InnerStates();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.kits.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits.State#isIsInitial <em>Is Initial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Initial</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits.State#isIsInitial()
   * @see #getState()
   * @generated
   */
  EAttribute getState_IsInitial();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits.State#isIsFinal <em>Is Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Final</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits.State#isIsFinal()
   * @see #getState()
   * @generated
   */
  EAttribute getState_IsFinal();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits.State#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits.State#getType()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Type();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits.State#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits.State#getLabel()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Label();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits.State#getBodyText <em>Body Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Body Text</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits.State#getBodyText()
   * @see #getState()
   * @generated
   */
  EAttribute getState_BodyText();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.kits.State#getEntryActions <em>Entry Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entry Actions</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits.State#getEntryActions()
   * @see #getState()
   * @generated
   */
  EReference getState_EntryActions();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.kits.State#getInnerActions <em>Inner Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inner Actions</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits.State#getInnerActions()
   * @see #getState()
   * @generated
   */
  EReference getState_InnerActions();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.kits.State#getExitActions <em>Exit Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exit Actions</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits.State#getExitActions()
   * @see #getState()
   * @generated
   */
  EReference getState_ExitActions();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.dsl.kits.State#getSuspensionTrigger <em>Suspension Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Suspension Trigger</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits.State#getSuspensionTrigger()
   * @see #getState()
   * @generated
   */
  EReference getState_SuspensionTrigger();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.kits.State#getSignals <em>Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signals</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits.State#getSignals()
   * @see #getState()
   * @generated
   */
  EReference getState_Signals();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.kits.State#getRegions <em>Regions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Regions</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits.State#getRegions()
   * @see #getState()
   * @generated
   */
  EReference getState_Regions();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.kits.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Outgoing Transitions</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits.State#getOutgoingTransitions()
   * @see #getState()
   * @generated
   */
  EReference getState_OutgoingTransitions();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  KitsFactory getKitsFactory();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.kits.impl.RegionImpl <em>Region</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.kits.impl.RegionImpl
     * @see de.cau.cs.kieler.synccharts.dsl.kits.impl.KitsPackageImpl#getRegion()
     * @generated
     */
    EClass REGION = eINSTANCE.getRegion();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGION__ID = eINSTANCE.getRegion_Id();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGION__VARIABLES = eINSTANCE.getRegion_Variables();

    /**
     * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGION__SIGNALS = eINSTANCE.getRegion_Signals();

    /**
     * The meta object literal for the '<em><b>Inner States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGION__INNER_STATES = eINSTANCE.getRegion_InnerStates();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.kits.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.kits.impl.StateImpl
     * @see de.cau.cs.kieler.synccharts.dsl.kits.impl.KitsPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Is Initial</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__IS_INITIAL = eINSTANCE.getState_IsInitial();

    /**
     * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__IS_FINAL = eINSTANCE.getState_IsFinal();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__TYPE = eINSTANCE.getState_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__LABEL = eINSTANCE.getState_Label();

    /**
     * The meta object literal for the '<em><b>Body Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__BODY_TEXT = eINSTANCE.getState_BodyText();

    /**
     * The meta object literal for the '<em><b>Entry Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__ENTRY_ACTIONS = eINSTANCE.getState_EntryActions();

    /**
     * The meta object literal for the '<em><b>Inner Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__INNER_ACTIONS = eINSTANCE.getState_InnerActions();

    /**
     * The meta object literal for the '<em><b>Exit Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__EXIT_ACTIONS = eINSTANCE.getState_ExitActions();

    /**
     * The meta object literal for the '<em><b>Suspension Trigger</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__SUSPENSION_TRIGGER = eINSTANCE.getState_SuspensionTrigger();

    /**
     * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__SIGNALS = eINSTANCE.getState_Signals();

    /**
     * The meta object literal for the '<em><b>Regions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__REGIONS = eINSTANCE.getState_Regions();

    /**
     * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__OUTGOING_TRANSITIONS = eINSTANCE.getState_OutgoingTransitions();

  }

} //KitsPackage
