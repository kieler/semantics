/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.synccharts.dsl.retypingSynccharts;

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
 * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsFactory
 * @model kind="package"
 * @generated
 */
public interface RetypingSyncchartsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "retypingSynccharts";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cau.de/cs/kieler/synccharts/dsl/RetypingSynccharts";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "retypingSynccharts";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RetypingSyncchartsPackage eINSTANCE = de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getState()
   * @generated
   */
  int STATE = 0;

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
   * The feature id for the '<em><b>Signal Renamings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__SIGNAL_RENAMINGS = 5;

  /**
   * The feature id for the '<em><b>Body Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__BODY_TEXT = 6;

  /**
   * The feature id for the '<em><b>Outgoing Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__OUTGOING_TRANSITIONS = 7;

  /**
   * The feature id for the '<em><b>Entry Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__ENTRY_ACTIONS = 8;

  /**
   * The feature id for the '<em><b>Inner Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__INNER_ACTIONS = 9;

  /**
   * The feature id for the '<em><b>Exit Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__EXIT_ACTIONS = 10;

  /**
   * The feature id for the '<em><b>Suspension Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__SUSPENSION_TRIGGER = 11;

  /**
   * The feature id for the '<em><b>Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__SIGNALS = 12;

  /**
   * The feature id for the '<em><b>Regions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__REGIONS = 13;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 14;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RenamingImpl <em>Renaming</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RenamingImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getRenaming()
   * @generated
   */
  int RENAMING = 1;

  /**
   * The feature id for the '<em><b>Old Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENAMING__OLD_OBJECT = 0;

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
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ActionImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getAction()
   * @generated
   */
  int ACTION = 2;

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
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RegionImpl <em>Region</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RegionImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getRegion()
   * @generated
   */
  int REGION = 3;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION__VARIABLES = 0;

  /**
   * The feature id for the '<em><b>Inner States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION__INNER_STATES = 1;

  /**
   * The feature id for the '<em><b>Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION__SIGNALS = 2;

  /**
   * The number of structural features of the '<em>Region</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.TransitionImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getTransition()
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
   * The feature id for the '<em><b>Source State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__SOURCE_STATE = ACTION_FEATURE_COUNT + 0;

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
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ValuedObjectImpl <em>Valued Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ValuedObjectImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getValuedObject()
   * @generated
   */
  int VALUED_OBJECT = 5;

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
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.VariableImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 6;

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
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.SignalImpl <em>Signal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.SignalImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getSignal()
   * @generated
   */
  int SIGNAL = 7;

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
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateType <em>State Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateType
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getStateType()
   * @generated
   */
  int STATE_TYPE = 8;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.CombineOperator <em>Combine Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.CombineOperator
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getCombineOperator()
   * @generated
   */
  int COMBINE_OPERATOR = 9;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.ValueType <em>Value Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.ValueType
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getValueType()
   * @generated
   */
  int VALUE_TYPE = 10;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.TransitionType <em>Transition Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.TransitionType
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getTransitionType()
   * @generated
   */
  int TRANSITION_TYPE = 11;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#isIsInitial <em>Is Initial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Initial</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#isIsInitial()
   * @see #getState()
   * @generated
   */
  EAttribute getState_IsInitial();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#isIsFinal <em>Is Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Final</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#isIsFinal()
   * @see #getState()
   * @generated
   */
  EAttribute getState_IsFinal();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getType()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Type();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getLabel()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Label();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getSignalRenamings <em>Signal Renamings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signal Renamings</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getSignalRenamings()
   * @see #getState()
   * @generated
   */
  EReference getState_SignalRenamings();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getBodyText <em>Body Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Body Text</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getBodyText()
   * @see #getState()
   * @generated
   */
  EAttribute getState_BodyText();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Outgoing Transitions</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getOutgoingTransitions()
   * @see #getState()
   * @generated
   */
  EReference getState_OutgoingTransitions();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getEntryActions <em>Entry Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entry Actions</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getEntryActions()
   * @see #getState()
   * @generated
   */
  EReference getState_EntryActions();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getInnerActions <em>Inner Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inner Actions</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getInnerActions()
   * @see #getState()
   * @generated
   */
  EReference getState_InnerActions();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getExitActions <em>Exit Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exit Actions</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getExitActions()
   * @see #getState()
   * @generated
   */
  EReference getState_ExitActions();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getSuspensionTrigger <em>Suspension Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Suspension Trigger</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getSuspensionTrigger()
   * @see #getState()
   * @generated
   */
  EReference getState_SuspensionTrigger();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getSignals <em>Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signals</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getSignals()
   * @see #getState()
   * @generated
   */
  EReference getState_Signals();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getRegions <em>Regions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Regions</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getRegions()
   * @see #getState()
   * @generated
   */
  EReference getState_Regions();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Renaming <em>Renaming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Renaming</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Renaming
   * @generated
   */
  EClass getRenaming();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Renaming#getOldObject <em>Old Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Old Object</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Renaming#getOldObject()
   * @see #getRenaming()
   * @generated
   */
  EAttribute getRenaming_OldObject();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Renaming#getNewID <em>New ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>New ID</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Renaming#getNewID()
   * @see #getRenaming()
   * @generated
   */
  EAttribute getRenaming_NewID();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action#isIsImmediate <em>Is Immediate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Immediate</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action#isIsImmediate()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_IsImmediate();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Delay</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action#getDelay()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Delay();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action#getTriggersAndEffects <em>Triggers And Effects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Triggers And Effects</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action#getTriggersAndEffects()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_TriggersAndEffects();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Region <em>Region</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Region</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Region
   * @generated
   */
  EClass getRegion();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Region#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Region#getVariables()
   * @see #getRegion()
   * @generated
   */
  EReference getRegion_Variables();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Region#getInnerStates <em>Inner States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inner States</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Region#getInnerStates()
   * @see #getRegion()
   * @generated
   */
  EReference getRegion_InnerStates();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Region#getSignals <em>Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signals</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Region#getSignals()
   * @see #getRegion()
   * @generated
   */
  EReference getRegion_Signals();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getSourceState <em>Source State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source State</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getSourceState()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_SourceState();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getType()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Type();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getTargetState <em>Target State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target State</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getTargetState()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_TargetState();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#isIsHistory <em>Is History</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is History</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#isIsHistory()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_IsHistory();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.ValuedObject <em>Valued Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Valued Object</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.ValuedObject
   * @generated
   */
  EClass getValuedObject();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.ValuedObject#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.ValuedObject#getName()
   * @see #getValuedObject()
   * @generated
   */
  EAttribute getValuedObject_Name();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.ValuedObject#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.ValuedObject#getType()
   * @see #getValuedObject()
   * @generated
   */
  EAttribute getValuedObject_Type();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.ValuedObject#getInitialValue <em>Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initial Value</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.ValuedObject#getInitialValue()
   * @see #getValuedObject()
   * @generated
   */
  EAttribute getValuedObject_InitialValue();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Signal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Signal
   * @generated
   */
  EClass getSignal();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Signal#isIsInputOutput <em>Is Input Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Input Output</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Signal#isIsInputOutput()
   * @see #getSignal()
   * @generated
   */
  EAttribute getSignal_IsInputOutput();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Signal#isIsInput <em>Is Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Input</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Signal#isIsInput()
   * @see #getSignal()
   * @generated
   */
  EAttribute getSignal_IsInput();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Signal#isIsOutput <em>Is Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Output</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Signal#isIsOutput()
   * @see #getSignal()
   * @generated
   */
  EAttribute getSignal_IsOutput();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Signal#getCombineOperator <em>Combine Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Combine Operator</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Signal#getCombineOperator()
   * @see #getSignal()
   * @generated
   */
  EAttribute getSignal_CombineOperator();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Signal#getHostCombineOperator <em>Host Combine Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Host Combine Operator</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Signal#getHostCombineOperator()
   * @see #getSignal()
   * @generated
   */
  EAttribute getSignal_HostCombineOperator();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateType <em>State Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>State Type</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateType
   * @generated
   */
  EEnum getStateType();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.CombineOperator <em>Combine Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Combine Operator</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.CombineOperator
   * @generated
   */
  EEnum getCombineOperator();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.ValueType <em>Value Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Value Type</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.ValueType
   * @generated
   */
  EEnum getValueType();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.TransitionType <em>Transition Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Transition Type</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.TransitionType
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
  RetypingSyncchartsFactory getRetypingSyncchartsFactory();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getState()
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
     * The meta object literal for the '<em><b>Signal Renamings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__SIGNAL_RENAMINGS = eINSTANCE.getState_SignalRenamings();

    /**
     * The meta object literal for the '<em><b>Body Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__BODY_TEXT = eINSTANCE.getState_BodyText();

    /**
     * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__OUTGOING_TRANSITIONS = eINSTANCE.getState_OutgoingTransitions();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RenamingImpl <em>Renaming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RenamingImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getRenaming()
     * @generated
     */
    EClass RENAMING = eINSTANCE.getRenaming();

    /**
     * The meta object literal for the '<em><b>Old Object</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RENAMING__OLD_OBJECT = eINSTANCE.getRenaming_OldObject();

    /**
     * The meta object literal for the '<em><b>New ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RENAMING__NEW_ID = eINSTANCE.getRenaming_NewID();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ActionImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getAction()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RegionImpl <em>Region</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RegionImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getRegion()
     * @generated
     */
    EClass REGION = eINSTANCE.getRegion();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGION__VARIABLES = eINSTANCE.getRegion_Variables();

    /**
     * The meta object literal for the '<em><b>Inner States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGION__INNER_STATES = eINSTANCE.getRegion_InnerStates();

    /**
     * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGION__SIGNALS = eINSTANCE.getRegion_Signals();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.TransitionImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Source State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__SOURCE_STATE = eINSTANCE.getTransition_SourceState();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ValuedObjectImpl <em>Valued Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ValuedObjectImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getValuedObject()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.VariableImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.SignalImpl <em>Signal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.SignalImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getSignal()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateType <em>State Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateType
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getStateType()
     * @generated
     */
    EEnum STATE_TYPE = eINSTANCE.getStateType();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.CombineOperator <em>Combine Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.CombineOperator
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getCombineOperator()
     * @generated
     */
    EEnum COMBINE_OPERATOR = eINSTANCE.getCombineOperator();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.ValueType <em>Value Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.ValueType
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getValueType()
     * @generated
     */
    EEnum VALUE_TYPE = eINSTANCE.getValueType();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.TransitionType <em>Transition Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.TransitionType
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getTransitionType()
     * @generated
     */
    EEnum TRANSITION_TYPE = eINSTANCE.getTransitionType();

  }

} //RetypingSyncchartsPackage
