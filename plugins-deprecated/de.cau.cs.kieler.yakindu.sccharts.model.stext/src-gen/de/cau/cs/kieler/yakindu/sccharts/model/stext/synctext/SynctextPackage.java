/**
 */
package de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext;

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
 * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SynctextFactory
 * @model kind="package"
 * @generated
 */
public interface SynctextPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "synctext";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://kieler.cs.cau.de/yakindu/sccharts/stext/";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "synctext";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SynctextPackage eINSTANCE = de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.StateScopeImpl <em>State Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.StateScopeImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getStateScope()
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
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SignalDefinitionImpl <em>Signal Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SignalDefinitionImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getSignalDefinition()
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
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.VariableDefinitionImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getVariableDefinition()
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
  int VARIABLE_DEFINITION__NAME = SGraphPackage.VARIABLE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__TYPE = SGraphPackage.VARIABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Owning Type</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__OWNING_TYPE = SGraphPackage.VARIABLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Readonly</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__READONLY = SGraphPackage.VARIABLE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>External</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__EXTERNAL = SGraphPackage.VARIABLE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__INITIAL_VALUE = SGraphPackage.VARIABLE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Is Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__IS_INPUT = SGraphPackage.VARIABLE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Is Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__IS_OUTPUT = SGraphPackage.VARIABLE_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Is Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__IS_STATIC = SGraphPackage.VARIABLE_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Var Combine Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__VAR_COMBINE_OPERATOR = SGraphPackage.VARIABLE_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Variable Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_FEATURE_COUNT = SGraphPackage.VARIABLE_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.OperationDefinitionImpl <em>Operation Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.OperationDefinitionImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getOperationDefinition()
   * @generated
   */
  int OPERATION_DEFINITION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_DEFINITION__NAME = StextPackage.OPERATION_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_DEFINITION__TYPE = StextPackage.OPERATION_DEFINITION__TYPE;

  /**
   * The feature id for the '<em><b>Owning Type</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_DEFINITION__OWNING_TYPE = StextPackage.OPERATION_DEFINITION__OWNING_TYPE;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_DEFINITION__PARAMETERS = StextPackage.OPERATION_DEFINITION__PARAMETERS;

  /**
   * The feature id for the '<em><b>Function Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_DEFINITION__FUNCTION_TYPE = StextPackage.OPERATION_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Param Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_DEFINITION__PARAM_TYPE = StextPackage.OPERATION_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Operation Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_DEFINITION_FEATURE_COUNT = StextPackage.OPERATION_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.LocalEntryReactionImpl <em>Local Entry Reaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.LocalEntryReactionImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getLocalEntryReaction()
   * @generated
   */
  int LOCAL_ENTRY_REACTION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_ENTRY_REACTION__NAME = SGraphPackage.DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_ENTRY_REACTION__TRIGGER = SGraphPackage.DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Effect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_ENTRY_REACTION__EFFECT = SGraphPackage.DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Local Entry Reaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_ENTRY_REACTION_FEATURE_COUNT = SGraphPackage.DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.LocalDuringReactionImpl <em>Local During Reaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.LocalDuringReactionImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getLocalDuringReaction()
   * @generated
   */
  int LOCAL_DURING_REACTION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_DURING_REACTION__NAME = SGraphPackage.DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Is Immediate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_DURING_REACTION__IS_IMMEDIATE = SGraphPackage.DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_DURING_REACTION__TRIGGER = SGraphPackage.DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Effect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_DURING_REACTION__EFFECT = SGraphPackage.DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Local During Reaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_DURING_REACTION_FEATURE_COUNT = SGraphPackage.DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.LocalExitReactionImpl <em>Local Exit Reaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.LocalExitReactionImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getLocalExitReaction()
   * @generated
   */
  int LOCAL_EXIT_REACTION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_EXIT_REACTION__NAME = SGraphPackage.DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_EXIT_REACTION__TRIGGER = SGraphPackage.DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Effect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_EXIT_REACTION__EFFECT = SGraphPackage.DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Local Exit Reaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_EXIT_REACTION_FEATURE_COUNT = SGraphPackage.DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.LocalSuspendReactionImpl <em>Local Suspend Reaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.LocalSuspendReactionImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getLocalSuspendReaction()
   * @generated
   */
  int LOCAL_SUSPEND_REACTION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_SUSPEND_REACTION__NAME = SGraphPackage.DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Is Immediate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_SUSPEND_REACTION__IS_IMMEDIATE = SGraphPackage.DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_SUSPEND_REACTION__TRIGGER = SGraphPackage.DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Local Suspend Reaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_SUSPEND_REACTION_FEATURE_COUNT = SGraphPackage.DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SimpleScopeImpl <em>Simple Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SimpleScopeImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getSimpleScope()
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
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.EventDefinitionImpl <em>Event Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.EventDefinitionImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getEventDefinition()
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
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DEFINITION__TYPE = SIGNAL_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Var Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DEFINITION__VAR_INITIAL_VALUE = SIGNAL_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Var Combine Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DEFINITION__VAR_COMBINE_OPERATOR = SIGNAL_DEFINITION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Event Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DEFINITION_FEATURE_COUNT = SIGNAL_DEFINITION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.ReactionTriggerImpl <em>Reaction Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.ReactionTriggerImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getReactionTrigger()
   * @generated
   */
  int REACTION_TRIGGER = 10;

  /**
   * The feature id for the '<em><b>Delay</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_TRIGGER__DELAY = SGraphPackage.TRIGGER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_TRIGGER__EXPRESSION = SGraphPackage.TRIGGER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Label Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_TRIGGER__LABEL_PRIORITY = SGraphPackage.TRIGGER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Reaction Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_TRIGGER_FEATURE_COUNT = SGraphPackage.TRIGGER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.ReactionEffectImpl <em>Reaction Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.ReactionEffectImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getReactionEffect()
   * @generated
   */
  int REACTION_EFFECT = 11;

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
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.NumericalMultiplyDivideExpressionImpl <em>Numerical Multiply Divide Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.NumericalMultiplyDivideExpressionImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getNumericalMultiplyDivideExpression()
   * @generated
   */
  int NUMERICAL_MULTIPLY_DIVIDE_EXPRESSION = 12;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERICAL_MULTIPLY_DIVIDE_EXPRESSION__LEFT_OPERAND = StextPackage.EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERICAL_MULTIPLY_DIVIDE_EXPRESSION__OPERATOR = StextPackage.EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERICAL_MULTIPLY_DIVIDE_EXPRESSION__RIGHT_OPERAND = StextPackage.EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Numerical Multiply Divide Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERICAL_MULTIPLY_DIVIDE_EXPRESSION_FEATURE_COUNT = StextPackage.EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.ValReferenceExpressionImpl <em>Val Reference Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.ValReferenceExpressionImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getValReferenceExpression()
   * @generated
   */
  int VAL_REFERENCE_EXPRESSION = 13;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAL_REFERENCE_EXPRESSION__EXPRESSION = StextPackage.EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Val Reference Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAL_REFERENCE_EXPRESSION_FEATURE_COUNT = StextPackage.EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.PreReferenceExpressionImpl <em>Pre Reference Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.PreReferenceExpressionImpl
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getPreReferenceExpression()
   * @generated
   */
  int PRE_REFERENCE_EXPRESSION = 14;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_REFERENCE_EXPRESSION__EXPRESSION = StextPackage.EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pre Reference Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_REFERENCE_EXPRESSION_FEATURE_COUNT = StextPackage.EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.MultiplicativeOperator2 <em>Multiplicative Operator2</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.MultiplicativeOperator2
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getMultiplicativeOperator2()
   * @generated
   */
  int MULTIPLICATIVE_OPERATOR2 = 15;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.CombineOperator <em>Combine Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.CombineOperator
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getCombineOperator()
   * @generated
   */
  int COMBINE_OPERATOR = 16;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.StateScope <em>State Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Scope</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.StateScope
   * @generated
   */
  EClass getStateScope();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SignalDefinition <em>Signal Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal Definition</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SignalDefinition
   * @generated
   */
  EClass getSignalDefinition();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.VariableDefinition <em>Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Definition</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.VariableDefinition
   * @generated
   */
  EClass getVariableDefinition();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.VariableDefinition#isIsInput <em>Is Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Input</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.VariableDefinition#isIsInput()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_IsInput();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.VariableDefinition#isIsOutput <em>Is Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Output</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.VariableDefinition#isIsOutput()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_IsOutput();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.VariableDefinition#isIsStatic <em>Is Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Static</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.VariableDefinition#isIsStatic()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_IsStatic();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.VariableDefinition#getVarCombineOperator <em>Var Combine Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Combine Operator</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.VariableDefinition#getVarCombineOperator()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_VarCombineOperator();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.OperationDefinition <em>Operation Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Definition</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.OperationDefinition
   * @generated
   */
  EClass getOperationDefinition();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.OperationDefinition#getFunctionType <em>Function Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Function Type</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.OperationDefinition#getFunctionType()
   * @see #getOperationDefinition()
   * @generated
   */
  EReference getOperationDefinition_FunctionType();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.OperationDefinition#getParamType <em>Param Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Param Type</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.OperationDefinition#getParamType()
   * @see #getOperationDefinition()
   * @generated
   */
  EReference getOperationDefinition_ParamType();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalEntryReaction <em>Local Entry Reaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Entry Reaction</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalEntryReaction
   * @generated
   */
  EClass getLocalEntryReaction();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalEntryReaction#getTrigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trigger</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalEntryReaction#getTrigger()
   * @see #getLocalEntryReaction()
   * @generated
   */
  EReference getLocalEntryReaction_Trigger();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalEntryReaction#getEffect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Effect</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalEntryReaction#getEffect()
   * @see #getLocalEntryReaction()
   * @generated
   */
  EReference getLocalEntryReaction_Effect();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalDuringReaction <em>Local During Reaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local During Reaction</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalDuringReaction
   * @generated
   */
  EClass getLocalDuringReaction();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalDuringReaction#isIsImmediate <em>Is Immediate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Immediate</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalDuringReaction#isIsImmediate()
   * @see #getLocalDuringReaction()
   * @generated
   */
  EAttribute getLocalDuringReaction_IsImmediate();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalDuringReaction#getTrigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trigger</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalDuringReaction#getTrigger()
   * @see #getLocalDuringReaction()
   * @generated
   */
  EReference getLocalDuringReaction_Trigger();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalDuringReaction#getEffect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Effect</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalDuringReaction#getEffect()
   * @see #getLocalDuringReaction()
   * @generated
   */
  EReference getLocalDuringReaction_Effect();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalExitReaction <em>Local Exit Reaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Exit Reaction</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalExitReaction
   * @generated
   */
  EClass getLocalExitReaction();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalExitReaction#getTrigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trigger</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalExitReaction#getTrigger()
   * @see #getLocalExitReaction()
   * @generated
   */
  EReference getLocalExitReaction_Trigger();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalExitReaction#getEffect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Effect</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalExitReaction#getEffect()
   * @see #getLocalExitReaction()
   * @generated
   */
  EReference getLocalExitReaction_Effect();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalSuspendReaction <em>Local Suspend Reaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Suspend Reaction</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalSuspendReaction
   * @generated
   */
  EClass getLocalSuspendReaction();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalSuspendReaction#isIsImmediate <em>Is Immediate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Immediate</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalSuspendReaction#isIsImmediate()
   * @see #getLocalSuspendReaction()
   * @generated
   */
  EAttribute getLocalSuspendReaction_IsImmediate();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalSuspendReaction#getTrigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trigger</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalSuspendReaction#getTrigger()
   * @see #getLocalSuspendReaction()
   * @generated
   */
  EReference getLocalSuspendReaction_Trigger();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SimpleScope <em>Simple Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Scope</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SimpleScope
   * @generated
   */
  EClass getSimpleScope();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.EventDefinition <em>Event Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Definition</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.EventDefinition
   * @generated
   */
  EClass getEventDefinition();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.EventDefinition#isIsInput <em>Is Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Input</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.EventDefinition#isIsInput()
   * @see #getEventDefinition()
   * @generated
   */
  EAttribute getEventDefinition_IsInput();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.EventDefinition#isIsOutput <em>Is Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Output</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.EventDefinition#isIsOutput()
   * @see #getEventDefinition()
   * @generated
   */
  EAttribute getEventDefinition_IsOutput();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.EventDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.EventDefinition#getType()
   * @see #getEventDefinition()
   * @generated
   */
  EReference getEventDefinition_Type();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.EventDefinition#getVarInitialValue <em>Var Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var Initial Value</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.EventDefinition#getVarInitialValue()
   * @see #getEventDefinition()
   * @generated
   */
  EReference getEventDefinition_VarInitialValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.EventDefinition#getVarCombineOperator <em>Var Combine Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Combine Operator</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.EventDefinition#getVarCombineOperator()
   * @see #getEventDefinition()
   * @generated
   */
  EAttribute getEventDefinition_VarCombineOperator();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ReactionTrigger <em>Reaction Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reaction Trigger</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ReactionTrigger
   * @generated
   */
  EClass getReactionTrigger();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ReactionTrigger#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Delay</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ReactionTrigger#getDelay()
   * @see #getReactionTrigger()
   * @generated
   */
  EAttribute getReactionTrigger_Delay();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ReactionTrigger#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ReactionTrigger#getExpression()
   * @see #getReactionTrigger()
   * @generated
   */
  EReference getReactionTrigger_Expression();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ReactionTrigger#getLabelPriority <em>Label Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label Priority</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ReactionTrigger#getLabelPriority()
   * @see #getReactionTrigger()
   * @generated
   */
  EAttribute getReactionTrigger_LabelPriority();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ReactionEffect <em>Reaction Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reaction Effect</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ReactionEffect
   * @generated
   */
  EClass getReactionEffect();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ReactionEffect#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ReactionEffect#getActions()
   * @see #getReactionEffect()
   * @generated
   */
  EReference getReactionEffect_Actions();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.NumericalMultiplyDivideExpression <em>Numerical Multiply Divide Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Numerical Multiply Divide Expression</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.NumericalMultiplyDivideExpression
   * @generated
   */
  EClass getNumericalMultiplyDivideExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.NumericalMultiplyDivideExpression#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.NumericalMultiplyDivideExpression#getLeftOperand()
   * @see #getNumericalMultiplyDivideExpression()
   * @generated
   */
  EReference getNumericalMultiplyDivideExpression_LeftOperand();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.NumericalMultiplyDivideExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.NumericalMultiplyDivideExpression#getOperator()
   * @see #getNumericalMultiplyDivideExpression()
   * @generated
   */
  EAttribute getNumericalMultiplyDivideExpression_Operator();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.NumericalMultiplyDivideExpression#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.NumericalMultiplyDivideExpression#getRightOperand()
   * @see #getNumericalMultiplyDivideExpression()
   * @generated
   */
  EReference getNumericalMultiplyDivideExpression_RightOperand();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ValReferenceExpression <em>Val Reference Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Val Reference Expression</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ValReferenceExpression
   * @generated
   */
  EClass getValReferenceExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ValReferenceExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ValReferenceExpression#getExpression()
   * @see #getValReferenceExpression()
   * @generated
   */
  EReference getValReferenceExpression_Expression();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.PreReferenceExpression <em>Pre Reference Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pre Reference Expression</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.PreReferenceExpression
   * @generated
   */
  EClass getPreReferenceExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.PreReferenceExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.PreReferenceExpression#getExpression()
   * @see #getPreReferenceExpression()
   * @generated
   */
  EReference getPreReferenceExpression_Expression();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.MultiplicativeOperator2 <em>Multiplicative Operator2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Multiplicative Operator2</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.MultiplicativeOperator2
   * @generated
   */
  EEnum getMultiplicativeOperator2();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.CombineOperator <em>Combine Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Combine Operator</em>'.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.CombineOperator
   * @generated
   */
  EEnum getCombineOperator();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SynctextFactory getSynctextFactory();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.StateScopeImpl <em>State Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.StateScopeImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getStateScope()
     * @generated
     */
    EClass STATE_SCOPE = eINSTANCE.getStateScope();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SignalDefinitionImpl <em>Signal Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SignalDefinitionImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getSignalDefinition()
     * @generated
     */
    EClass SIGNAL_DEFINITION = eINSTANCE.getSignalDefinition();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.VariableDefinitionImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getVariableDefinition()
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
     * The meta object literal for the '<em><b>Var Combine Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION__VAR_COMBINE_OPERATOR = eINSTANCE.getVariableDefinition_VarCombineOperator();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.OperationDefinitionImpl <em>Operation Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.OperationDefinitionImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getOperationDefinition()
     * @generated
     */
    EClass OPERATION_DEFINITION = eINSTANCE.getOperationDefinition();

    /**
     * The meta object literal for the '<em><b>Function Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_DEFINITION__FUNCTION_TYPE = eINSTANCE.getOperationDefinition_FunctionType();

    /**
     * The meta object literal for the '<em><b>Param Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_DEFINITION__PARAM_TYPE = eINSTANCE.getOperationDefinition_ParamType();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.LocalEntryReactionImpl <em>Local Entry Reaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.LocalEntryReactionImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getLocalEntryReaction()
     * @generated
     */
    EClass LOCAL_ENTRY_REACTION = eINSTANCE.getLocalEntryReaction();

    /**
     * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_ENTRY_REACTION__TRIGGER = eINSTANCE.getLocalEntryReaction_Trigger();

    /**
     * The meta object literal for the '<em><b>Effect</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_ENTRY_REACTION__EFFECT = eINSTANCE.getLocalEntryReaction_Effect();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.LocalDuringReactionImpl <em>Local During Reaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.LocalDuringReactionImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getLocalDuringReaction()
     * @generated
     */
    EClass LOCAL_DURING_REACTION = eINSTANCE.getLocalDuringReaction();

    /**
     * The meta object literal for the '<em><b>Is Immediate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_DURING_REACTION__IS_IMMEDIATE = eINSTANCE.getLocalDuringReaction_IsImmediate();

    /**
     * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_DURING_REACTION__TRIGGER = eINSTANCE.getLocalDuringReaction_Trigger();

    /**
     * The meta object literal for the '<em><b>Effect</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_DURING_REACTION__EFFECT = eINSTANCE.getLocalDuringReaction_Effect();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.LocalExitReactionImpl <em>Local Exit Reaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.LocalExitReactionImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getLocalExitReaction()
     * @generated
     */
    EClass LOCAL_EXIT_REACTION = eINSTANCE.getLocalExitReaction();

    /**
     * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_EXIT_REACTION__TRIGGER = eINSTANCE.getLocalExitReaction_Trigger();

    /**
     * The meta object literal for the '<em><b>Effect</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_EXIT_REACTION__EFFECT = eINSTANCE.getLocalExitReaction_Effect();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.LocalSuspendReactionImpl <em>Local Suspend Reaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.LocalSuspendReactionImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getLocalSuspendReaction()
     * @generated
     */
    EClass LOCAL_SUSPEND_REACTION = eINSTANCE.getLocalSuspendReaction();

    /**
     * The meta object literal for the '<em><b>Is Immediate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_SUSPEND_REACTION__IS_IMMEDIATE = eINSTANCE.getLocalSuspendReaction_IsImmediate();

    /**
     * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_SUSPEND_REACTION__TRIGGER = eINSTANCE.getLocalSuspendReaction_Trigger();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SimpleScopeImpl <em>Simple Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SimpleScopeImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getSimpleScope()
     * @generated
     */
    EClass SIMPLE_SCOPE = eINSTANCE.getSimpleScope();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.EventDefinitionImpl <em>Event Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.EventDefinitionImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getEventDefinition()
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
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_DEFINITION__TYPE = eINSTANCE.getEventDefinition_Type();

    /**
     * The meta object literal for the '<em><b>Var Initial Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_DEFINITION__VAR_INITIAL_VALUE = eINSTANCE.getEventDefinition_VarInitialValue();

    /**
     * The meta object literal for the '<em><b>Var Combine Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_DEFINITION__VAR_COMBINE_OPERATOR = eINSTANCE.getEventDefinition_VarCombineOperator();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.ReactionTriggerImpl <em>Reaction Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.ReactionTriggerImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getReactionTrigger()
     * @generated
     */
    EClass REACTION_TRIGGER = eINSTANCE.getReactionTrigger();

    /**
     * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REACTION_TRIGGER__DELAY = eINSTANCE.getReactionTrigger_Delay();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REACTION_TRIGGER__EXPRESSION = eINSTANCE.getReactionTrigger_Expression();

    /**
     * The meta object literal for the '<em><b>Label Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REACTION_TRIGGER__LABEL_PRIORITY = eINSTANCE.getReactionTrigger_LabelPriority();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.ReactionEffectImpl <em>Reaction Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.ReactionEffectImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getReactionEffect()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.NumericalMultiplyDivideExpressionImpl <em>Numerical Multiply Divide Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.NumericalMultiplyDivideExpressionImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getNumericalMultiplyDivideExpression()
     * @generated
     */
    EClass NUMERICAL_MULTIPLY_DIVIDE_EXPRESSION = eINSTANCE.getNumericalMultiplyDivideExpression();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMERICAL_MULTIPLY_DIVIDE_EXPRESSION__LEFT_OPERAND = eINSTANCE.getNumericalMultiplyDivideExpression_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMERICAL_MULTIPLY_DIVIDE_EXPRESSION__OPERATOR = eINSTANCE.getNumericalMultiplyDivideExpression_Operator();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMERICAL_MULTIPLY_DIVIDE_EXPRESSION__RIGHT_OPERAND = eINSTANCE.getNumericalMultiplyDivideExpression_RightOperand();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.ValReferenceExpressionImpl <em>Val Reference Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.ValReferenceExpressionImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getValReferenceExpression()
     * @generated
     */
    EClass VAL_REFERENCE_EXPRESSION = eINSTANCE.getValReferenceExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAL_REFERENCE_EXPRESSION__EXPRESSION = eINSTANCE.getValReferenceExpression_Expression();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.PreReferenceExpressionImpl <em>Pre Reference Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.PreReferenceExpressionImpl
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getPreReferenceExpression()
     * @generated
     */
    EClass PRE_REFERENCE_EXPRESSION = eINSTANCE.getPreReferenceExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRE_REFERENCE_EXPRESSION__EXPRESSION = eINSTANCE.getPreReferenceExpression_Expression();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.MultiplicativeOperator2 <em>Multiplicative Operator2</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.MultiplicativeOperator2
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getMultiplicativeOperator2()
     * @generated
     */
    EEnum MULTIPLICATIVE_OPERATOR2 = eINSTANCE.getMultiplicativeOperator2();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.CombineOperator <em>Combine Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.CombineOperator
     * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.SynctextPackageImpl#getCombineOperator()
     * @generated
     */
    EEnum COMBINE_OPERATOR = eINSTANCE.getCombineOperator();

  }

} //SynctextPackage
