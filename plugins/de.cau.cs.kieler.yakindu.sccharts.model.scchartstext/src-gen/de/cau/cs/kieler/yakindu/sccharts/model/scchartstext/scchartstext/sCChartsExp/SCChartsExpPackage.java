/**
 */
package de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.yakindu.sct.model.sgraph.SGraphPackage;

import org.yakindu.sct.model.stext.stext.StextPackage;

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
 * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.SCChartsExpFactory
 * @model kind="package"
 * @generated
 */
public interface SCChartsExpPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sCChartsExp";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cau.de/cs/kieler/yakindu/sccharts/model/scchartstext/scchartstext/SCChartsExp";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sCChartsExp";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SCChartsExpPackage eINSTANCE = de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.StateScopeImpl <em>State Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.StateScopeImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getStateScope()
   * @generated
   */
  int STATE_SCOPE = 0;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_SCOPE__DECLARATIONS = SGraphPackage.SCOPE__DECLARATIONS;

  /**
   * The feature id for the '<em><b>Events</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_SCOPE__EVENTS = SGraphPackage.SCOPE__EVENTS;

  /**
   * The feature id for the '<em><b>Variables</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_SCOPE__VARIABLES = SGraphPackage.SCOPE__VARIABLES;

  /**
   * The number of structural features of the '<em>State Scope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_SCOPE_FEATURE_COUNT = SGraphPackage.SCOPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SignalDefinitionImpl <em>Signal Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SignalDefinitionImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getSignalDefinition()
   * @generated
   */
  int SIGNAL_DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_DEFINITION__NAME = SGraphPackage.EVENT__NAME;

  /**
   * The number of structural features of the '<em>Signal Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_DEFINITION_FEATURE_COUNT = SGraphPackage.EVENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.VariableDefinitionImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getVariableDefinition()
   * @generated
   */
  int VARIABLE_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__NAME = StextPackage.VARIABLE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__TYPE = StextPackage.VARIABLE_DEFINITION__TYPE;

  /**
   * The feature id for the '<em><b>Owning Type</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__OWNING_TYPE = StextPackage.VARIABLE_DEFINITION__OWNING_TYPE;

  /**
   * The feature id for the '<em><b>Readonly</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__READONLY = StextPackage.VARIABLE_DEFINITION__READONLY;

  /**
   * The feature id for the '<em><b>External</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__EXTERNAL = StextPackage.VARIABLE_DEFINITION__EXTERNAL;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__INITIAL_VALUE = StextPackage.VARIABLE_DEFINITION__INITIAL_VALUE;

  /**
   * The feature id for the '<em><b>Is Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__IS_INPUT = StextPackage.VARIABLE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__IS_OUTPUT = StextPackage.VARIABLE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Is Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__IS_STATIC = StextPackage.VARIABLE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Var Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__VAR_INITIAL_VALUE = StextPackage.VARIABLE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Var Combine Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__VAR_COMBINE_OPERATOR = StextPackage.VARIABLE_DEFINITION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Variable Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_FEATURE_COUNT = StextPackage.VARIABLE_DEFINITION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.LocalReactionImpl <em>Local Reaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.LocalReactionImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getLocalReaction()
   * @generated
   */
  int LOCAL_REACTION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_REACTION__NAME = StextPackage.LOCAL_REACTION__NAME;

  /**
   * The feature id for the '<em><b>Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_REACTION__TRIGGER = StextPackage.LOCAL_REACTION__TRIGGER;

  /**
   * The feature id for the '<em><b>Effect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_REACTION__EFFECT = StextPackage.LOCAL_REACTION__EFFECT;

  /**
   * The number of structural features of the '<em>Local Reaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_REACTION_FEATURE_COUNT = StextPackage.LOCAL_REACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.StateReactionImpl <em>State Reaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.StateReactionImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getStateReaction()
   * @generated
   */
  int STATE_REACTION = 4;

  /**
   * The number of structural features of the '<em>State Reaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_REACTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.EntryImpl <em>Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.EntryImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getEntry()
   * @generated
   */
  int ENTRY = 5;

  /**
   * The number of structural features of the '<em>Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_FEATURE_COUNT = STATE_REACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.InsideImpl <em>Inside</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.InsideImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getInside()
   * @generated
   */
  int INSIDE = 6;

  /**
   * The number of structural features of the '<em>Inside</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSIDE_FEATURE_COUNT = STATE_REACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.ExitImpl <em>Exit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.ExitImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getExit()
   * @generated
   */
  int EXIT = 7;

  /**
   * The number of structural features of the '<em>Exit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_FEATURE_COUNT = STATE_REACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SimpleScopeImpl <em>Simple Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SimpleScopeImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getSimpleScope()
   * @generated
   */
  int SIMPLE_SCOPE = 8;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SCOPE__DECLARATIONS = STATE_SCOPE__DECLARATIONS;

  /**
   * The feature id for the '<em><b>Events</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SCOPE__EVENTS = STATE_SCOPE__EVENTS;

  /**
   * The feature id for the '<em><b>Variables</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SCOPE__VARIABLES = STATE_SCOPE__VARIABLES;

  /**
   * The number of structural features of the '<em>Simple Scope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SCOPE_FEATURE_COUNT = STATE_SCOPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.EventDefinitionImpl <em>Event Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.EventDefinitionImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getEventDefinition()
   * @generated
   */
  int EVENT_DEFINITION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DEFINITION__NAME = SIGNAL_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Is Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DEFINITION__IS_INPUT = SIGNAL_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DEFINITION__IS_OUTPUT = SIGNAL_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Event Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DEFINITION_FEATURE_COUNT = SIGNAL_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SuspendEffectImpl <em>Suspend Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SuspendEffectImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getSuspendEffect()
   * @generated
   */
  int SUSPEND_EFFECT = 10;

  /**
   * The number of structural features of the '<em>Suspend Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSPEND_EFFECT_FEATURE_COUNT = SGraphPackage.EFFECT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.ReactionTriggerImpl <em>Reaction Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.ReactionTriggerImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getReactionTrigger()
   * @generated
   */
  int REACTION_TRIGGER = 11;

  /**
   * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_TRIGGER__TRIGGERS = SGraphPackage.TRIGGER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Immediate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_TRIGGER__IS_IMMEDIATE = SGraphPackage.TRIGGER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Delay</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_TRIGGER__DELAY = SGraphPackage.TRIGGER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Guard Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_TRIGGER__GUARD_EXPRESSION = SGraphPackage.TRIGGER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Reaction Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_TRIGGER_FEATURE_COUNT = SGraphPackage.TRIGGER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.ReactionEffectImpl <em>Reaction Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.ReactionEffectImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getReactionEffect()
   * @generated
   */
  int REACTION_EFFECT = 12;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_EFFECT__ACTIONS = SGraphPackage.EFFECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Reaction Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_EFFECT_FEATURE_COUNT = SGraphPackage.EFFECT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.PreValueExpressionImpl <em>Pre Value Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.PreValueExpressionImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getPreValueExpression()
   * @generated
   */
  int PRE_VALUE_EXPRESSION = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_VALUE_EXPRESSION__VALUE = StextPackage.EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pre Value Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_VALUE_EXPRESSION_FEATURE_COUNT = StextPackage.EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.CombineOperator <em>Combine Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.CombineOperator
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getCombineOperator()
   * @generated
   */
  int COMBINE_OPERATOR = 14;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.VarDirection <em>Var Direction</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.VarDirection
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getVarDirection()
   * @generated
   */
  int VAR_DIRECTION = 15;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.StateScope <em>State Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Scope</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.StateScope
   * @generated
   */
  EClass getStateScope();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.SignalDefinition <em>Signal Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal Definition</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.SignalDefinition
   * @generated
   */
  EClass getSignalDefinition();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.VariableDefinition <em>Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Definition</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.VariableDefinition
   * @generated
   */
  EClass getVariableDefinition();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.VariableDefinition#isIsInput <em>Is Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Input</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.VariableDefinition#isIsInput()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_IsInput();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.VariableDefinition#isIsOutput <em>Is Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Output</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.VariableDefinition#isIsOutput()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_IsOutput();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.VariableDefinition#isIsStatic <em>Is Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Static</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.VariableDefinition#isIsStatic()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_IsStatic();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.VariableDefinition#getVarInitialValue <em>Var Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var Initial Value</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.VariableDefinition#getVarInitialValue()
   * @see #getVariableDefinition()
   * @generated
   */
  EReference getVariableDefinition_VarInitialValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.VariableDefinition#getVarCombineOperator <em>Var Combine Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Combine Operator</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.VariableDefinition#getVarCombineOperator()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_VarCombineOperator();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.LocalReaction <em>Local Reaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Reaction</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.LocalReaction
   * @generated
   */
  EClass getLocalReaction();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.StateReaction <em>State Reaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Reaction</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.StateReaction
   * @generated
   */
  EClass getStateReaction();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.Entry <em>Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entry</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.Entry
   * @generated
   */
  EClass getEntry();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.Inside <em>Inside</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inside</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.Inside
   * @generated
   */
  EClass getInside();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.Exit <em>Exit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exit</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.Exit
   * @generated
   */
  EClass getExit();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.SimpleScope <em>Simple Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Scope</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.SimpleScope
   * @generated
   */
  EClass getSimpleScope();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.EventDefinition <em>Event Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Definition</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.EventDefinition
   * @generated
   */
  EClass getEventDefinition();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.EventDefinition#isIsInput <em>Is Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Input</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.EventDefinition#isIsInput()
   * @see #getEventDefinition()
   * @generated
   */
  EAttribute getEventDefinition_IsInput();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.EventDefinition#isIsOutput <em>Is Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Output</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.EventDefinition#isIsOutput()
   * @see #getEventDefinition()
   * @generated
   */
  EAttribute getEventDefinition_IsOutput();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.SuspendEffect <em>Suspend Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Suspend Effect</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.SuspendEffect
   * @generated
   */
  EClass getSuspendEffect();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.ReactionTrigger <em>Reaction Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reaction Trigger</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.ReactionTrigger
   * @generated
   */
  EClass getReactionTrigger();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.ReactionTrigger#getTriggers <em>Triggers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Triggers</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.ReactionTrigger#getTriggers()
   * @see #getReactionTrigger()
   * @generated
   */
  EReference getReactionTrigger_Triggers();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.ReactionTrigger#isIsImmediate <em>Is Immediate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Immediate</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.ReactionTrigger#isIsImmediate()
   * @see #getReactionTrigger()
   * @generated
   */
  EAttribute getReactionTrigger_IsImmediate();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.ReactionTrigger#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Delay</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.ReactionTrigger#getDelay()
   * @see #getReactionTrigger()
   * @generated
   */
  EAttribute getReactionTrigger_Delay();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.ReactionTrigger#getGuardExpression <em>Guard Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guard Expression</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.ReactionTrigger#getGuardExpression()
   * @see #getReactionTrigger()
   * @generated
   */
  EReference getReactionTrigger_GuardExpression();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.ReactionEffect <em>Reaction Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reaction Effect</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.ReactionEffect
   * @generated
   */
  EClass getReactionEffect();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.ReactionEffect#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.ReactionEffect#getActions()
   * @see #getReactionEffect()
   * @generated
   */
  EReference getReactionEffect_Actions();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.PreValueExpression <em>Pre Value Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pre Value Expression</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.PreValueExpression
   * @generated
   */
  EClass getPreValueExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.PreValueExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.PreValueExpression#getValue()
   * @see #getPreValueExpression()
   * @generated
   */
  EReference getPreValueExpression_Value();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.CombineOperator <em>Combine Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Combine Operator</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.CombineOperator
   * @generated
   */
  EEnum getCombineOperator();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.VarDirection <em>Var Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Var Direction</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.VarDirection
   * @generated
   */
  EEnum getVarDirection();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SCChartsExpFactory getSCChartsExpFactory();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.StateScopeImpl <em>State Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.StateScopeImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getStateScope()
     * @generated
     */
    EClass STATE_SCOPE = eINSTANCE.getStateScope();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SignalDefinitionImpl <em>Signal Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SignalDefinitionImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getSignalDefinition()
     * @generated
     */
    EClass SIGNAL_DEFINITION = eINSTANCE.getSignalDefinition();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.VariableDefinitionImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getVariableDefinition()
     * @generated
     */
    EClass VARIABLE_DEFINITION = eINSTANCE.getVariableDefinition();

    /**
     * The meta object literal for the '<em><b>Is Input</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION__IS_INPUT = eINSTANCE.getVariableDefinition_IsInput();

    /**
     * The meta object literal for the '<em><b>Is Output</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION__IS_OUTPUT = eINSTANCE.getVariableDefinition_IsOutput();

    /**
     * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION__IS_STATIC = eINSTANCE.getVariableDefinition_IsStatic();

    /**
     * The meta object literal for the '<em><b>Var Initial Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DEFINITION__VAR_INITIAL_VALUE = eINSTANCE.getVariableDefinition_VarInitialValue();

    /**
     * The meta object literal for the '<em><b>Var Combine Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION__VAR_COMBINE_OPERATOR = eINSTANCE.getVariableDefinition_VarCombineOperator();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.LocalReactionImpl <em>Local Reaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.LocalReactionImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getLocalReaction()
     * @generated
     */
    EClass LOCAL_REACTION = eINSTANCE.getLocalReaction();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.StateReactionImpl <em>State Reaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.StateReactionImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getStateReaction()
     * @generated
     */
    EClass STATE_REACTION = eINSTANCE.getStateReaction();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.EntryImpl <em>Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.EntryImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getEntry()
     * @generated
     */
    EClass ENTRY = eINSTANCE.getEntry();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.InsideImpl <em>Inside</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.InsideImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getInside()
     * @generated
     */
    EClass INSIDE = eINSTANCE.getInside();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.ExitImpl <em>Exit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.ExitImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getExit()
     * @generated
     */
    EClass EXIT = eINSTANCE.getExit();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SimpleScopeImpl <em>Simple Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SimpleScopeImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getSimpleScope()
     * @generated
     */
    EClass SIMPLE_SCOPE = eINSTANCE.getSimpleScope();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.EventDefinitionImpl <em>Event Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.EventDefinitionImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getEventDefinition()
     * @generated
     */
    EClass EVENT_DEFINITION = eINSTANCE.getEventDefinition();

    /**
     * The meta object literal for the '<em><b>Is Input</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_DEFINITION__IS_INPUT = eINSTANCE.getEventDefinition_IsInput();

    /**
     * The meta object literal for the '<em><b>Is Output</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_DEFINITION__IS_OUTPUT = eINSTANCE.getEventDefinition_IsOutput();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SuspendEffectImpl <em>Suspend Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SuspendEffectImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getSuspendEffect()
     * @generated
     */
    EClass SUSPEND_EFFECT = eINSTANCE.getSuspendEffect();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.ReactionTriggerImpl <em>Reaction Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.ReactionTriggerImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getReactionTrigger()
     * @generated
     */
    EClass REACTION_TRIGGER = eINSTANCE.getReactionTrigger();

    /**
     * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REACTION_TRIGGER__TRIGGERS = eINSTANCE.getReactionTrigger_Triggers();

    /**
     * The meta object literal for the '<em><b>Is Immediate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REACTION_TRIGGER__IS_IMMEDIATE = eINSTANCE.getReactionTrigger_IsImmediate();

    /**
     * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REACTION_TRIGGER__DELAY = eINSTANCE.getReactionTrigger_Delay();

    /**
     * The meta object literal for the '<em><b>Guard Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REACTION_TRIGGER__GUARD_EXPRESSION = eINSTANCE.getReactionTrigger_GuardExpression();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.ReactionEffectImpl <em>Reaction Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.ReactionEffectImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getReactionEffect()
     * @generated
     */
    EClass REACTION_EFFECT = eINSTANCE.getReactionEffect();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REACTION_EFFECT__ACTIONS = eINSTANCE.getReactionEffect_Actions();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.PreValueExpressionImpl <em>Pre Value Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.PreValueExpressionImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getPreValueExpression()
     * @generated
     */
    EClass PRE_VALUE_EXPRESSION = eINSTANCE.getPreValueExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRE_VALUE_EXPRESSION__VALUE = eINSTANCE.getPreValueExpression_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.CombineOperator <em>Combine Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.CombineOperator
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getCombineOperator()
     * @generated
     */
    EEnum COMBINE_OPERATOR = eINSTANCE.getCombineOperator();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.VarDirection <em>Var Direction</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.VarDirection
     * @see de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.scchartstext.sCChartsExp.impl.SCChartsExpPackageImpl#getVarDirection()
     * @generated
     */
    EEnum VAR_DIRECTION = eINSTANCE.getVarDirection();

  }

} //SCChartsExpPackage
