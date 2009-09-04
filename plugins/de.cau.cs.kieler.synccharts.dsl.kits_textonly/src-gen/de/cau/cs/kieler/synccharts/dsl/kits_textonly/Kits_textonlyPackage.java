/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.kits_textonly;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Kits_textonlyFactory
 * @model kind="package"
 * @generated
 */
public interface Kits_textonlyPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "kits_textonly";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cau.de/cs/kieler/synccharts/dsl/Kits_textonly";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "kits_textonly";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Kits_textonlyPackage eINSTANCE = de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.Kits_textonlyPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.RegionImpl <em>Region</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.RegionImpl
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.Kits_textonlyPackageImpl#getRegion()
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
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.StateImpl
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.Kits_textonlyPackageImpl#getState()
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
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 12;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.RenamingImpl <em>Renaming</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.RenamingImpl
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.Kits_textonlyPackageImpl#getRenaming()
   * @generated
   */
  int RENAMING = 2;

  /**
   * The feature id for the '<em><b>Old ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENAMING__OLD_ID = 0;

  /**
   * The feature id for the '<em><b>New ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENAMING__NEW_ID = 1;

  /**
   * The number of structural features of the '<em>Renaming</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENAMING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.ActionImpl
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.Kits_textonlyPackageImpl#getAction()
   * @generated
   */
  int ACTION = 3;

  /**
   * The feature id for the '<em><b>Is Immediate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__IS_IMMEDIATE = 0;

  /**
   * The feature id for the '<em><b>Delay</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__DELAY = 1;

  /**
   * The feature id for the '<em><b>Triggers And Effects</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__TRIGGERS_AND_EFFECTS = 2;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.TransitionImpl
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.Kits_textonlyPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 4;

  /**
   * The feature id for the '<em><b>Is Immediate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__IS_IMMEDIATE = ACTION__IS_IMMEDIATE;

  /**
   * The feature id for the '<em><b>Delay</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__DELAY = ACTION__DELAY;

  /**
   * The feature id for the '<em><b>Triggers And Effects</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TRIGGERS_AND_EFFECTS = ACTION__TRIGGERS_AND_EFFECTS;

  /**
   * The feature id for the '<em><b>New Source State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__NEW_SOURCE_STATE = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TYPE = ACTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TARGET_STATE = ACTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Is History</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__IS_HISTORY = ACTION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.TransitionStateImpl <em>Transition State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.TransitionStateImpl
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.Kits_textonlyPackageImpl#getTransitionState()
   * @generated
   */
  int TRANSITION_STATE = 5;

  /**
   * The feature id for the '<em><b>Is Initial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_STATE__IS_INITIAL = 0;

  /**
   * The feature id for the '<em><b>Is Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_STATE__IS_FINAL = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_STATE__TYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_STATE__NAME = 3;

  /**
   * The number of structural features of the '<em>Transition State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_STATE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.ValuedObjectImpl <em>Valued Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.ValuedObjectImpl
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.Kits_textonlyPackageImpl#getValuedObject()
   * @generated
   */
  int VALUED_OBJECT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUED_OBJECT__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUED_OBJECT__TYPE = 1;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUED_OBJECT__INITIAL_VALUE = 2;

  /**
   * The number of structural features of the '<em>Valued Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUED_OBJECT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.VariableImpl
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.Kits_textonlyPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = VALUED_OBJECT__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__TYPE = VALUED_OBJECT__TYPE;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__INITIAL_VALUE = VALUED_OBJECT__INITIAL_VALUE;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = VALUED_OBJECT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.SignalImpl <em>Signal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.SignalImpl
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.Kits_textonlyPackageImpl#getSignal()
   * @generated
   */
  int SIGNAL = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__NAME = VALUED_OBJECT__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__TYPE = VALUED_OBJECT__TYPE;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__INITIAL_VALUE = VALUED_OBJECT__INITIAL_VALUE;

  /**
   * The feature id for the '<em><b>Is Input Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__IS_INPUT_OUTPUT = VALUED_OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__IS_INPUT = VALUED_OBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Is Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__IS_OUTPUT = VALUED_OBJECT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Combine Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__COMBINE_OPERATOR = VALUED_OBJECT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Host Combine Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__HOST_COMBINE_OPERATOR = VALUED_OBJECT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Signal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_FEATURE_COUNT = VALUED_OBJECT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.StateType <em>State Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.StateType
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.Kits_textonlyPackageImpl#getStateType()
   * @generated
   */
  int STATE_TYPE = 9;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.CombineOperator <em>Combine Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.CombineOperator
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.Kits_textonlyPackageImpl#getCombineOperator()
   * @generated
   */
  int COMBINE_OPERATOR = 10;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.ValueType <em>Value Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.ValueType
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.Kits_textonlyPackageImpl#getValueType()
   * @generated
   */
  int VALUE_TYPE = 11;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.TransitionType <em>Transition Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.TransitionType
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.Kits_textonlyPackageImpl#getTransitionType()
   * @generated
   */
  int TRANSITION_TYPE = 12;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Region <em>Region</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Region</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Region
   * @generated
   */
  EClass getRegion();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Region#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Region#getId()
   * @see #getRegion()
   * @generated
   */
  EAttribute getRegion_Id();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Region#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Region#getVariables()
   * @see #getRegion()
   * @generated
   */
  EReference getRegion_Variables();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Region#getSignals <em>Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signals</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Region#getSignals()
   * @see #getRegion()
   * @generated
   */
  EReference getRegion_Signals();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Region#getInnerStates <em>Inner States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inner States</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Region#getInnerStates()
   * @see #getRegion()
   * @generated
   */
  EReference getRegion_InnerStates();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#isIsInitial <em>Is Initial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Initial</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#isIsInitial()
   * @see #getState()
   * @generated
   */
  EAttribute getState_IsInitial();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#isIsFinal <em>Is Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Final</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#isIsFinal()
   * @see #getState()
   * @generated
   */
  EAttribute getState_IsFinal();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getType()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Type();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getLabel()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Label();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getBodyText <em>Body Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Body Text</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getBodyText()
   * @see #getState()
   * @generated
   */
  EAttribute getState_BodyText();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getEntryActions <em>Entry Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entry Actions</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getEntryActions()
   * @see #getState()
   * @generated
   */
  EReference getState_EntryActions();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getInnerActions <em>Inner Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inner Actions</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getInnerActions()
   * @see #getState()
   * @generated
   */
  EReference getState_InnerActions();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getExitActions <em>Exit Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exit Actions</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getExitActions()
   * @see #getState()
   * @generated
   */
  EReference getState_ExitActions();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getSuspensionTrigger <em>Suspension Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Suspension Trigger</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getSuspensionTrigger()
   * @see #getState()
   * @generated
   */
  EReference getState_SuspensionTrigger();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getSignals <em>Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signals</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getSignals()
   * @see #getState()
   * @generated
   */
  EReference getState_Signals();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getRegions <em>Regions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Regions</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getRegions()
   * @see #getState()
   * @generated
   */
  EReference getState_Regions();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Renaming <em>Renaming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Renaming</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Renaming
   * @generated
   */
  EClass getRenaming();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Renaming#getOldID <em>Old ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Old ID</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Renaming#getOldID()
   * @see #getRenaming()
   * @generated
   */
  EAttribute getRenaming_OldID();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Renaming#getNewID <em>New ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>New ID</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Renaming#getNewID()
   * @see #getRenaming()
   * @generated
   */
  EAttribute getRenaming_NewID();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Action#isIsImmediate <em>Is Immediate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Immediate</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Action#isIsImmediate()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_IsImmediate();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Action#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Delay</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Action#getDelay()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Delay();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Action#getTriggersAndEffects <em>Triggers And Effects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Triggers And Effects</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Action#getTriggersAndEffects()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_TriggersAndEffects();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Transition#getNewSourceState <em>New Source State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>New Source State</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Transition#getNewSourceState()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_NewSourceState();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Transition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Transition#getType()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Type();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Transition#getTargetState <em>Target State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target State</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Transition#getTargetState()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_TargetState();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Transition#isIsHistory <em>Is History</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is History</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Transition#isIsHistory()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_IsHistory();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.TransitionState <em>Transition State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition State</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.TransitionState
   * @generated
   */
  EClass getTransitionState();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.TransitionState#isIsInitial <em>Is Initial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Initial</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.TransitionState#isIsInitial()
   * @see #getTransitionState()
   * @generated
   */
  EAttribute getTransitionState_IsInitial();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.TransitionState#isIsFinal <em>Is Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Final</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.TransitionState#isIsFinal()
   * @see #getTransitionState()
   * @generated
   */
  EAttribute getTransitionState_IsFinal();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.TransitionState#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.TransitionState#getType()
   * @see #getTransitionState()
   * @generated
   */
  EAttribute getTransitionState_Type();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.TransitionState#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.TransitionState#getName()
   * @see #getTransitionState()
   * @generated
   */
  EAttribute getTransitionState_Name();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.ValuedObject <em>Valued Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Valued Object</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.ValuedObject
   * @generated
   */
  EClass getValuedObject();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.ValuedObject#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.ValuedObject#getName()
   * @see #getValuedObject()
   * @generated
   */
  EAttribute getValuedObject_Name();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.ValuedObject#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.ValuedObject#getType()
   * @see #getValuedObject()
   * @generated
   */
  EAttribute getValuedObject_Type();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.ValuedObject#getInitialValue <em>Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initial Value</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.ValuedObject#getInitialValue()
   * @see #getValuedObject()
   * @generated
   */
  EAttribute getValuedObject_InitialValue();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Signal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Signal
   * @generated
   */
  EClass getSignal();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Signal#isIsInputOutput <em>Is Input Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Input Output</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Signal#isIsInputOutput()
   * @see #getSignal()
   * @generated
   */
  EAttribute getSignal_IsInputOutput();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Signal#isIsInput <em>Is Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Input</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Signal#isIsInput()
   * @see #getSignal()
   * @generated
   */
  EAttribute getSignal_IsInput();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Signal#isIsOutput <em>Is Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Output</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Signal#isIsOutput()
   * @see #getSignal()
   * @generated
   */
  EAttribute getSignal_IsOutput();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Signal#getCombineOperator <em>Combine Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Combine Operator</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Signal#getCombineOperator()
   * @see #getSignal()
   * @generated
   */
  EAttribute getSignal_CombineOperator();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Signal#getHostCombineOperator <em>Host Combine Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Host Combine Operator</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Signal#getHostCombineOperator()
   * @see #getSignal()
   * @generated
   */
  EAttribute getSignal_HostCombineOperator();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.StateType <em>State Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>State Type</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.StateType
   * @generated
   */
  EEnum getStateType();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.CombineOperator <em>Combine Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Combine Operator</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.CombineOperator
   * @generated
   */
  EEnum getCombineOperator();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.ValueType <em>Value Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Value Type</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.ValueType
   * @generated
   */
  EEnum getValueType();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.TransitionType <em>Transition Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Transition Type</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.TransitionType
   * @generated
   */
  EEnum getTransitionType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Kits_textonlyFactory getKits_textonlyFactory();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.RegionImpl <em>Region</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.RegionImpl
     * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.Kits_textonlyPackageImpl#getRegion()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.StateImpl
     * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.Kits_textonlyPackageImpl#getState()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.RenamingImpl <em>Renaming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.RenamingImpl
     * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.Kits_textonlyPackageImpl#getRenaming()
     * @generated
     */
    EClass RENAMING = eINSTANCE.getRenaming();

    /**
     * The meta object literal for the '<em><b>Old ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RENAMING__OLD_ID = eINSTANCE.getRenaming_OldID();

    /**
     * The meta object literal for the '<em><b>New ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RENAMING__NEW_ID = eINSTANCE.getRenaming_NewID();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.ActionImpl
     * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.Kits_textonlyPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Is Immediate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__IS_IMMEDIATE = eINSTANCE.getAction_IsImmediate();

    /**
     * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__DELAY = eINSTANCE.getAction_Delay();

    /**
     * The meta object literal for the '<em><b>Triggers And Effects</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__TRIGGERS_AND_EFFECTS = eINSTANCE.getAction_TriggersAndEffects();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.TransitionImpl
     * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.Kits_textonlyPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>New Source State</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__NEW_SOURCE_STATE = eINSTANCE.getTransition_NewSourceState();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__TYPE = eINSTANCE.getTransition_Type();

    /**
     * The meta object literal for the '<em><b>Target State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__TARGET_STATE = eINSTANCE.getTransition_TargetState();

    /**
     * The meta object literal for the '<em><b>Is History</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__IS_HISTORY = eINSTANCE.getTransition_IsHistory();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.TransitionStateImpl <em>Transition State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.TransitionStateImpl
     * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.Kits_textonlyPackageImpl#getTransitionState()
     * @generated
     */
    EClass TRANSITION_STATE = eINSTANCE.getTransitionState();

    /**
     * The meta object literal for the '<em><b>Is Initial</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_STATE__IS_INITIAL = eINSTANCE.getTransitionState_IsInitial();

    /**
     * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_STATE__IS_FINAL = eINSTANCE.getTransitionState_IsFinal();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_STATE__TYPE = eINSTANCE.getTransitionState_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_STATE__NAME = eINSTANCE.getTransitionState_Name();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.ValuedObjectImpl <em>Valued Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.ValuedObjectImpl
     * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.Kits_textonlyPackageImpl#getValuedObject()
     * @generated
     */
    EClass VALUED_OBJECT = eINSTANCE.getValuedObject();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUED_OBJECT__NAME = eINSTANCE.getValuedObject_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUED_OBJECT__TYPE = eINSTANCE.getValuedObject_Type();

    /**
     * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUED_OBJECT__INITIAL_VALUE = eINSTANCE.getValuedObject_InitialValue();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.VariableImpl
     * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.Kits_textonlyPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.SignalImpl <em>Signal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.SignalImpl
     * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.Kits_textonlyPackageImpl#getSignal()
     * @generated
     */
    EClass SIGNAL = eINSTANCE.getSignal();

    /**
     * The meta object literal for the '<em><b>Is Input Output</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNAL__IS_INPUT_OUTPUT = eINSTANCE.getSignal_IsInputOutput();

    /**
     * The meta object literal for the '<em><b>Is Input</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNAL__IS_INPUT = eINSTANCE.getSignal_IsInput();

    /**
     * The meta object literal for the '<em><b>Is Output</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNAL__IS_OUTPUT = eINSTANCE.getSignal_IsOutput();

    /**
     * The meta object literal for the '<em><b>Combine Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNAL__COMBINE_OPERATOR = eINSTANCE.getSignal_CombineOperator();

    /**
     * The meta object literal for the '<em><b>Host Combine Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNAL__HOST_COMBINE_OPERATOR = eINSTANCE.getSignal_HostCombineOperator();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.StateType <em>State Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.StateType
     * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.Kits_textonlyPackageImpl#getStateType()
     * @generated
     */
    EEnum STATE_TYPE = eINSTANCE.getStateType();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.CombineOperator <em>Combine Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.CombineOperator
     * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.Kits_textonlyPackageImpl#getCombineOperator()
     * @generated
     */
    EEnum COMBINE_OPERATOR = eINSTANCE.getCombineOperator();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.ValueType <em>Value Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.ValueType
     * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.Kits_textonlyPackageImpl#getValueType()
     * @generated
     */
    EEnum VALUE_TYPE = eINSTANCE.getValueType();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.TransitionType <em>Transition Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.TransitionType
     * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.Kits_textonlyPackageImpl#getTransitionType()
     * @generated
     */
    EEnum TRANSITION_TYPE = eINSTANCE.getTransitionType();

  }

} //Kits_textonlyPackage
