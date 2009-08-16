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
   * The feature id for the '<em><b>State Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__STATE_KIND = 2;

  /**
   * The feature id for the '<em><b>State ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__STATE_ID = 3;

  /**
   * The feature id for the '<em><b>State Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__STATE_LABEL = 4;

  /**
   * The feature id for the '<em><b>Body Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__BODY_TEXT = 5;

  /**
   * The feature id for the '<em><b>State Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__STATE_CONTENT = 6;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateContentImpl <em>State Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateContentImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getStateContent()
   * @generated
   */
  int STATE_CONTENT = 1;

  /**
   * The feature id for the '<em><b>Entry Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTENT__ENTRY_ACTIONS = 0;

  /**
   * The feature id for the '<em><b>Inner Action</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTENT__INNER_ACTION = 1;

  /**
   * The feature id for the '<em><b>Exit Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTENT__EXIT_ACTIONS = 2;

  /**
   * The feature id for the '<em><b>Suspension Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTENT__SUSPENSION_TRIGGER = 3;

  /**
   * The feature id for the '<em><b>Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTENT__SIGNALS = 4;

  /**
   * The feature id for the '<em><b>New State ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTENT__NEW_STATE_ID = 5;

  /**
   * The feature id for the '<em><b>Referenced State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTENT__REFERENCED_STATE = 6;

  /**
   * The feature id for the '<em><b>Signal Renamings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTENT__SIGNAL_RENAMINGS = 7;

  /**
   * The number of structural features of the '<em>State Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTENT_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.SignalRenamingImpl <em>Signal Renaming</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.SignalRenamingImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getSignalRenaming()
   * @generated
   */
  int SIGNAL_RENAMING = 2;

  /**
   * The feature id for the '<em><b>Old Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_RENAMING__OLD_SIGNAL = 0;

  /**
   * The feature id for the '<em><b>New Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_RENAMING__NEW_SIGNAL = 1;

  /**
   * The number of structural features of the '<em>Signal Renaming</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_RENAMING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ActionImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getAction()
   * @generated
   */
  int ACTION = 3;

  /**
   * The feature id for the '<em><b>Entry Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__ENTRY_ACTION = 0;

  /**
   * The feature id for the '<em><b>Inner Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__INNER_ACTION = 1;

  /**
   * The feature id for the '<em><b>Exit Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__EXIT_ACTION = 2;

  /**
   * The feature id for the '<em><b>Suspension Trigger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__SUSPENSION_TRIGGER = 3;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ValuedObjectImpl <em>Valued Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ValuedObjectImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getValuedObject()
   * @generated
   */
  int VALUED_OBJECT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUED_OBJECT__NAME = 0;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUED_OBJECT__INITIAL_VALUE = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUED_OBJECT__TYPE = 2;

  /**
   * The number of structural features of the '<em>Valued Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUED_OBJECT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.SignalImpl <em>Signal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.SignalImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getSignal()
   * @generated
   */
  int SIGNAL = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__NAME = VALUED_OBJECT__NAME;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__INITIAL_VALUE = VALUED_OBJECT__INITIAL_VALUE;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__TYPE = VALUED_OBJECT__TYPE;

  /**
   * The feature id for the '<em><b>Is Local</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__IS_LOCAL = VALUED_OBJECT_FEATURE_COUNT + 0;

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
   * The feature id for the '<em><b>Initial Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__INITIAL_VALUE = VALUED_OBJECT__INITIAL_VALUE;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__TYPE = VALUED_OBJECT__TYPE;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = VALUED_OBJECT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateType <em>State Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateType
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getStateType()
   * @generated
   */
  int STATE_TYPE = 7;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.CombineOperator <em>Combine Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.CombineOperator
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getCombineOperator()
   * @generated
   */
  int COMBINE_OPERATOR = 8;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.ValueType <em>Value Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.ValueType
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getValueType()
   * @generated
   */
  int VALUE_TYPE = 9;


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
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getStateKind <em>State Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>State Kind</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getStateKind()
   * @see #getState()
   * @generated
   */
  EAttribute getState_StateKind();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getStateID <em>State ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>State ID</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getStateID()
   * @see #getState()
   * @generated
   */
  EAttribute getState_StateID();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getStateLabel <em>State Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>State Label</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getStateLabel()
   * @see #getState()
   * @generated
   */
  EAttribute getState_StateLabel();

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
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getStateContent <em>State Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>State Content</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getStateContent()
   * @see #getState()
   * @generated
   */
  EReference getState_StateContent();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent <em>State Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Content</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent
   * @generated
   */
  EClass getStateContent();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getEntryActions <em>Entry Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entry Actions</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getEntryActions()
   * @see #getStateContent()
   * @generated
   */
  EReference getStateContent_EntryActions();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getInnerAction <em>Inner Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inner Action</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getInnerAction()
   * @see #getStateContent()
   * @generated
   */
  EReference getStateContent_InnerAction();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getExitActions <em>Exit Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exit Actions</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getExitActions()
   * @see #getStateContent()
   * @generated
   */
  EReference getStateContent_ExitActions();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getSuspensionTrigger <em>Suspension Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Suspension Trigger</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getSuspensionTrigger()
   * @see #getStateContent()
   * @generated
   */
  EReference getStateContent_SuspensionTrigger();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getSignals <em>Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signals</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getSignals()
   * @see #getStateContent()
   * @generated
   */
  EReference getStateContent_Signals();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getNewStateID <em>New State ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>New State ID</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getNewStateID()
   * @see #getStateContent()
   * @generated
   */
  EAttribute getStateContent_NewStateID();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getReferencedState <em>Referenced State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Referenced State</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getReferencedState()
   * @see #getStateContent()
   * @generated
   */
  EAttribute getStateContent_ReferencedState();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getSignalRenamings <em>Signal Renamings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signal Renamings</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getSignalRenamings()
   * @see #getStateContent()
   * @generated
   */
  EReference getStateContent_SignalRenamings();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.SignalRenaming <em>Signal Renaming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal Renaming</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.SignalRenaming
   * @generated
   */
  EClass getSignalRenaming();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.SignalRenaming#getOldSignal <em>Old Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Old Signal</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.SignalRenaming#getOldSignal()
   * @see #getSignalRenaming()
   * @generated
   */
  EReference getSignalRenaming_OldSignal();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.SignalRenaming#getNewSignal <em>New Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>New Signal</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.SignalRenaming#getNewSignal()
   * @see #getSignalRenaming()
   * @generated
   */
  EReference getSignalRenaming_NewSignal();

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
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action#getEntryAction <em>Entry Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Entry Action</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action#getEntryAction()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_EntryAction();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action#getInnerAction <em>Inner Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inner Action</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action#getInnerAction()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_InnerAction();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action#getExitAction <em>Exit Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exit Action</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action#getExitAction()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_ExitAction();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action#getSuspensionTrigger <em>Suspension Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Suspension Trigger</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action#getSuspensionTrigger()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_SuspensionTrigger();

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
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Signal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Signal
   * @generated
   */
  EClass getSignal();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Signal#isIsLocal <em>Is Local</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Local</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Signal#isIsLocal()
   * @see #getSignal()
   * @generated
   */
  EAttribute getSignal_IsLocal();

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
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Variable
   * @generated
   */
  EClass getVariable();

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
     * The meta object literal for the '<em><b>State Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__STATE_KIND = eINSTANCE.getState_StateKind();

    /**
     * The meta object literal for the '<em><b>State ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__STATE_ID = eINSTANCE.getState_StateID();

    /**
     * The meta object literal for the '<em><b>State Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__STATE_LABEL = eINSTANCE.getState_StateLabel();

    /**
     * The meta object literal for the '<em><b>Body Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__BODY_TEXT = eINSTANCE.getState_BodyText();

    /**
     * The meta object literal for the '<em><b>State Content</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__STATE_CONTENT = eINSTANCE.getState_StateContent();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateContentImpl <em>State Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateContentImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getStateContent()
     * @generated
     */
    EClass STATE_CONTENT = eINSTANCE.getStateContent();

    /**
     * The meta object literal for the '<em><b>Entry Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_CONTENT__ENTRY_ACTIONS = eINSTANCE.getStateContent_EntryActions();

    /**
     * The meta object literal for the '<em><b>Inner Action</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_CONTENT__INNER_ACTION = eINSTANCE.getStateContent_InnerAction();

    /**
     * The meta object literal for the '<em><b>Exit Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_CONTENT__EXIT_ACTIONS = eINSTANCE.getStateContent_ExitActions();

    /**
     * The meta object literal for the '<em><b>Suspension Trigger</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_CONTENT__SUSPENSION_TRIGGER = eINSTANCE.getStateContent_SuspensionTrigger();

    /**
     * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_CONTENT__SIGNALS = eINSTANCE.getStateContent_Signals();

    /**
     * The meta object literal for the '<em><b>New State ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_CONTENT__NEW_STATE_ID = eINSTANCE.getStateContent_NewStateID();

    /**
     * The meta object literal for the '<em><b>Referenced State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_CONTENT__REFERENCED_STATE = eINSTANCE.getStateContent_ReferencedState();

    /**
     * The meta object literal for the '<em><b>Signal Renamings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_CONTENT__SIGNAL_RENAMINGS = eINSTANCE.getStateContent_SignalRenamings();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.SignalRenamingImpl <em>Signal Renaming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.SignalRenamingImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getSignalRenaming()
     * @generated
     */
    EClass SIGNAL_RENAMING = eINSTANCE.getSignalRenaming();

    /**
     * The meta object literal for the '<em><b>Old Signal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNAL_RENAMING__OLD_SIGNAL = eINSTANCE.getSignalRenaming_OldSignal();

    /**
     * The meta object literal for the '<em><b>New Signal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNAL_RENAMING__NEW_SIGNAL = eINSTANCE.getSignalRenaming_NewSignal();

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
     * The meta object literal for the '<em><b>Entry Action</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__ENTRY_ACTION = eINSTANCE.getAction_EntryAction();

    /**
     * The meta object literal for the '<em><b>Inner Action</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__INNER_ACTION = eINSTANCE.getAction_InnerAction();

    /**
     * The meta object literal for the '<em><b>Exit Action</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__EXIT_ACTION = eINSTANCE.getAction_ExitAction();

    /**
     * The meta object literal for the '<em><b>Suspension Trigger</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__SUSPENSION_TRIGGER = eINSTANCE.getAction_SuspensionTrigger();

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
     * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUED_OBJECT__INITIAL_VALUE = eINSTANCE.getValuedObject_InitialValue();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUED_OBJECT__TYPE = eINSTANCE.getValuedObject_Type();

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
     * The meta object literal for the '<em><b>Is Local</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNAL__IS_LOCAL = eINSTANCE.getSignal_IsLocal();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.VariableImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

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

  }

} //RetypingSyncchartsPackage
