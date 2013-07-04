/**
 */
package de.cau.cs.kieler.yakindu.model.stext.synctext;

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
 * @see de.cau.cs.kieler.yakindu.model.stext.synctext.SynctextFactory
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
  String eNS_URI = "http://kieler.cs.cau.de/yakindu/stext/";

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
  SynctextPackage eINSTANCE = de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.StateScopeImpl <em>State Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.StateScopeImpl
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getStateScope()
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
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SignalDefinitionImpl <em>Signal Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SignalDefinitionImpl
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getSignalDefinition()
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
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.VariableDefinitionImpl
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getVariableDefinition()
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
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.OperationDefinitionImpl <em>Operation Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.OperationDefinitionImpl
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getOperationDefinition()
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
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.LocalReactionImpl <em>Local Reaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.LocalReactionImpl
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getLocalReaction()
   * @generated
   */
  int LOCAL_REACTION = 4;

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
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_REACTION__PROPERTIES = StextPackage.LOCAL_REACTION__PROPERTIES;

  /**
   * The number of structural features of the '<em>Local Reaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_REACTION_FEATURE_COUNT = StextPackage.LOCAL_REACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.StateReactionImpl <em>State Reaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.StateReactionImpl
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getStateReaction()
   * @generated
   */
  int STATE_REACTION = 5;

  /**
   * The number of structural features of the '<em>State Reaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_REACTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.EntryImpl <em>Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.EntryImpl
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getEntry()
   * @generated
   */
  int ENTRY = 6;

  /**
   * The number of structural features of the '<em>Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_FEATURE_COUNT = STATE_REACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.InsideImpl <em>Inside</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.InsideImpl
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getInside()
   * @generated
   */
  int INSIDE = 7;

  /**
   * The number of structural features of the '<em>Inside</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSIDE_FEATURE_COUNT = STATE_REACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.ExitImpl <em>Exit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.ExitImpl
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getExit()
   * @generated
   */
  int EXIT = 8;

  /**
   * The number of structural features of the '<em>Exit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_FEATURE_COUNT = STATE_REACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SimpleScopeImpl <em>Simple Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SimpleScopeImpl
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getSimpleScope()
   * @generated
   */
  int SIMPLE_SCOPE = 9;

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
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.EventDefinitionImpl <em>Event Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.EventDefinitionImpl
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getEventDefinition()
   * @generated
   */
  int EVENT_DEFINITION = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DEFINITION__NAME = SIGNAL_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DEFINITION__INPUT = SIGNAL_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DEFINITION__OUTPUT = SIGNAL_DEFINITION_FEATURE_COUNT + 1;

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
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SuspendEffectImpl <em>Suspend Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SuspendEffectImpl
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getSuspendEffect()
   * @generated
   */
  int SUSPEND_EFFECT = 11;

  /**
   * The number of structural features of the '<em>Suspend Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSPEND_EFFECT_FEATURE_COUNT = SGraphPackage.EFFECT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.ReactionTriggerImpl <em>Reaction Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.ReactionTriggerImpl
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getReactionTrigger()
   * @generated
   */
  int REACTION_TRIGGER = 12;

  /**
   * The feature id for the '<em><b>State Reaction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_TRIGGER__STATE_REACTION = SGraphPackage.TRIGGER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Reaction Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_TRIGGER__REACTION_TRIGGER = SGraphPackage.TRIGGER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Label Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_TRIGGER__LABEL_PRIORITY = SGraphPackage.TRIGGER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Delay</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_TRIGGER__DELAY = SGraphPackage.TRIGGER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_TRIGGER__EXPRESSION = SGraphPackage.TRIGGER_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Reaction Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_TRIGGER_FEATURE_COUNT = SGraphPackage.TRIGGER_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.ReactionEffectImpl <em>Reaction Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.ReactionEffectImpl
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getReactionEffect()
   * @generated
   */
  int REACTION_EFFECT = 13;

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
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.NumericalMultiplyDivideExpressionImpl <em>Numerical Multiply Divide Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.NumericalMultiplyDivideExpressionImpl
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getNumericalMultiplyDivideExpression()
   * @generated
   */
  int NUMERICAL_MULTIPLY_DIVIDE_EXPRESSION = 14;

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
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.EventValueReferenceExpressionImpl <em>Event Value Reference Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.EventValueReferenceExpressionImpl
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getEventValueReferenceExpression()
   * @generated
   */
  int EVENT_VALUE_REFERENCE_EXPRESSION = 15;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_VALUE_REFERENCE_EXPRESSION__VALUE = StextPackage.EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Event Value Reference Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_VALUE_REFERENCE_EXPRESSION_FEATURE_COUNT = StextPackage.EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.PreValueExpressionImpl <em>Pre Value Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.PreValueExpressionImpl
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getPreValueExpression()
   * @generated
   */
  int PRE_VALUE_EXPRESSION = 16;

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
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.MultiplicativeOperator2 <em>Multiplicative Operator2</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.MultiplicativeOperator2
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getMultiplicativeOperator2()
   * @generated
   */
  int MULTIPLICATIVE_OPERATOR2 = 17;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.CombineOperator <em>Combine Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.CombineOperator
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getCombineOperator()
   * @generated
   */
  int COMBINE_OPERATOR = 18;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.StateScope <em>State Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Scope</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.StateScope
   * @generated
   */
  EClass getStateScope();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.SignalDefinition <em>Signal Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal Definition</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.SignalDefinition
   * @generated
   */
  EClass getSignalDefinition();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.VariableDefinition <em>Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Definition</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.VariableDefinition
   * @generated
   */
  EClass getVariableDefinition();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.VariableDefinition#isIsInput <em>Is Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Input</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.VariableDefinition#isIsInput()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_IsInput();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.VariableDefinition#isIsOutput <em>Is Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Output</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.VariableDefinition#isIsOutput()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_IsOutput();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.VariableDefinition#isIsStatic <em>Is Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Static</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.VariableDefinition#isIsStatic()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_IsStatic();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.VariableDefinition#getVarCombineOperator <em>Var Combine Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Combine Operator</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.VariableDefinition#getVarCombineOperator()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_VarCombineOperator();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.OperationDefinition <em>Operation Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Definition</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.OperationDefinition
   * @generated
   */
  EClass getOperationDefinition();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.OperationDefinition#getFunctionType <em>Function Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Function Type</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.OperationDefinition#getFunctionType()
   * @see #getOperationDefinition()
   * @generated
   */
  EReference getOperationDefinition_FunctionType();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.OperationDefinition#getParamType <em>Param Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Param Type</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.OperationDefinition#getParamType()
   * @see #getOperationDefinition()
   * @generated
   */
  EReference getOperationDefinition_ParamType();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.LocalReaction <em>Local Reaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Reaction</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.LocalReaction
   * @generated
   */
  EClass getLocalReaction();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.StateReaction <em>State Reaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Reaction</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.StateReaction
   * @generated
   */
  EClass getStateReaction();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.Entry <em>Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entry</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.Entry
   * @generated
   */
  EClass getEntry();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.Inside <em>Inside</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inside</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.Inside
   * @generated
   */
  EClass getInside();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.Exit <em>Exit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exit</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.Exit
   * @generated
   */
  EClass getExit();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.SimpleScope <em>Simple Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Scope</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.SimpleScope
   * @generated
   */
  EClass getSimpleScope();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.EventDefinition <em>Event Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Definition</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.EventDefinition
   * @generated
   */
  EClass getEventDefinition();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.EventDefinition#isInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.EventDefinition#isInput()
   * @see #getEventDefinition()
   * @generated
   */
  EAttribute getEventDefinition_Input();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.EventDefinition#isOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Output</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.EventDefinition#isOutput()
   * @see #getEventDefinition()
   * @generated
   */
  EAttribute getEventDefinition_Output();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.EventDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.EventDefinition#getType()
   * @see #getEventDefinition()
   * @generated
   */
  EReference getEventDefinition_Type();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.EventDefinition#getVarInitialValue <em>Var Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var Initial Value</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.EventDefinition#getVarInitialValue()
   * @see #getEventDefinition()
   * @generated
   */
  EReference getEventDefinition_VarInitialValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.EventDefinition#getVarCombineOperator <em>Var Combine Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Combine Operator</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.EventDefinition#getVarCombineOperator()
   * @see #getEventDefinition()
   * @generated
   */
  EAttribute getEventDefinition_VarCombineOperator();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.SuspendEffect <em>Suspend Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Suspend Effect</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.SuspendEffect
   * @generated
   */
  EClass getSuspendEffect();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger <em>Reaction Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reaction Trigger</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger
   * @generated
   */
  EClass getReactionTrigger();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger#getStateReaction <em>State Reaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>State Reaction</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger#getStateReaction()
   * @see #getReactionTrigger()
   * @generated
   */
  EReference getReactionTrigger_StateReaction();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger#getReactionTrigger <em>Reaction Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reaction Trigger</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger#getReactionTrigger()
   * @see #getReactionTrigger()
   * @generated
   */
  EReference getReactionTrigger_ReactionTrigger();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger#getLabelPriority <em>Label Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label Priority</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger#getLabelPriority()
   * @see #getReactionTrigger()
   * @generated
   */
  EAttribute getReactionTrigger_LabelPriority();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Delay</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger#getDelay()
   * @see #getReactionTrigger()
   * @generated
   */
  EAttribute getReactionTrigger_Delay();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger#getExpression()
   * @see #getReactionTrigger()
   * @generated
   */
  EReference getReactionTrigger_Expression();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionEffect <em>Reaction Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reaction Effect</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionEffect
   * @generated
   */
  EClass getReactionEffect();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionEffect#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionEffect#getActions()
   * @see #getReactionEffect()
   * @generated
   */
  EReference getReactionEffect_Actions();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.NumericalMultiplyDivideExpression <em>Numerical Multiply Divide Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Numerical Multiply Divide Expression</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.NumericalMultiplyDivideExpression
   * @generated
   */
  EClass getNumericalMultiplyDivideExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.NumericalMultiplyDivideExpression#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.NumericalMultiplyDivideExpression#getLeftOperand()
   * @see #getNumericalMultiplyDivideExpression()
   * @generated
   */
  EReference getNumericalMultiplyDivideExpression_LeftOperand();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.NumericalMultiplyDivideExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.NumericalMultiplyDivideExpression#getOperator()
   * @see #getNumericalMultiplyDivideExpression()
   * @generated
   */
  EAttribute getNumericalMultiplyDivideExpression_Operator();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.NumericalMultiplyDivideExpression#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.NumericalMultiplyDivideExpression#getRightOperand()
   * @see #getNumericalMultiplyDivideExpression()
   * @generated
   */
  EReference getNumericalMultiplyDivideExpression_RightOperand();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.EventValueReferenceExpression <em>Event Value Reference Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Value Reference Expression</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.EventValueReferenceExpression
   * @generated
   */
  EClass getEventValueReferenceExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.EventValueReferenceExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.EventValueReferenceExpression#getValue()
   * @see #getEventValueReferenceExpression()
   * @generated
   */
  EReference getEventValueReferenceExpression_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.PreValueExpression <em>Pre Value Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pre Value Expression</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.PreValueExpression
   * @generated
   */
  EClass getPreValueExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.PreValueExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.PreValueExpression#getValue()
   * @see #getPreValueExpression()
   * @generated
   */
  EReference getPreValueExpression_Value();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.MultiplicativeOperator2 <em>Multiplicative Operator2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Multiplicative Operator2</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.MultiplicativeOperator2
   * @generated
   */
  EEnum getMultiplicativeOperator2();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.CombineOperator <em>Combine Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Combine Operator</em>'.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.CombineOperator
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
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.StateScopeImpl <em>State Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.StateScopeImpl
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getStateScope()
     * @generated
     */
    EClass STATE_SCOPE = eINSTANCE.getStateScope();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SignalDefinitionImpl <em>Signal Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SignalDefinitionImpl
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getSignalDefinition()
     * @generated
     */
    EClass SIGNAL_DEFINITION = eINSTANCE.getSignalDefinition();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.VariableDefinitionImpl
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getVariableDefinition()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.OperationDefinitionImpl <em>Operation Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.OperationDefinitionImpl
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getOperationDefinition()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.LocalReactionImpl <em>Local Reaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.LocalReactionImpl
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getLocalReaction()
     * @generated
     */
    EClass LOCAL_REACTION = eINSTANCE.getLocalReaction();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.StateReactionImpl <em>State Reaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.StateReactionImpl
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getStateReaction()
     * @generated
     */
    EClass STATE_REACTION = eINSTANCE.getStateReaction();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.EntryImpl <em>Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.EntryImpl
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getEntry()
     * @generated
     */
    EClass ENTRY = eINSTANCE.getEntry();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.InsideImpl <em>Inside</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.InsideImpl
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getInside()
     * @generated
     */
    EClass INSIDE = eINSTANCE.getInside();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.ExitImpl <em>Exit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.ExitImpl
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getExit()
     * @generated
     */
    EClass EXIT = eINSTANCE.getExit();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SimpleScopeImpl <em>Simple Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SimpleScopeImpl
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getSimpleScope()
     * @generated
     */
    EClass SIMPLE_SCOPE = eINSTANCE.getSimpleScope();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.EventDefinitionImpl <em>Event Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.EventDefinitionImpl
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getEventDefinition()
     * @generated
     */
    EClass EVENT_DEFINITION = eINSTANCE.getEventDefinition();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_DEFINITION__INPUT = eINSTANCE.getEventDefinition_Input();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_DEFINITION__OUTPUT = eINSTANCE.getEventDefinition_Output();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SuspendEffectImpl <em>Suspend Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SuspendEffectImpl
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getSuspendEffect()
     * @generated
     */
    EClass SUSPEND_EFFECT = eINSTANCE.getSuspendEffect();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.ReactionTriggerImpl <em>Reaction Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.ReactionTriggerImpl
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getReactionTrigger()
     * @generated
     */
    EClass REACTION_TRIGGER = eINSTANCE.getReactionTrigger();

    /**
     * The meta object literal for the '<em><b>State Reaction</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REACTION_TRIGGER__STATE_REACTION = eINSTANCE.getReactionTrigger_StateReaction();

    /**
     * The meta object literal for the '<em><b>Reaction Trigger</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REACTION_TRIGGER__REACTION_TRIGGER = eINSTANCE.getReactionTrigger_ReactionTrigger();

    /**
     * The meta object literal for the '<em><b>Label Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REACTION_TRIGGER__LABEL_PRIORITY = eINSTANCE.getReactionTrigger_LabelPriority();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.ReactionEffectImpl <em>Reaction Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.ReactionEffectImpl
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getReactionEffect()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.NumericalMultiplyDivideExpressionImpl <em>Numerical Multiply Divide Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.NumericalMultiplyDivideExpressionImpl
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getNumericalMultiplyDivideExpression()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.EventValueReferenceExpressionImpl <em>Event Value Reference Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.EventValueReferenceExpressionImpl
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getEventValueReferenceExpression()
     * @generated
     */
    EClass EVENT_VALUE_REFERENCE_EXPRESSION = eINSTANCE.getEventValueReferenceExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_VALUE_REFERENCE_EXPRESSION__VALUE = eINSTANCE.getEventValueReferenceExpression_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.PreValueExpressionImpl <em>Pre Value Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.PreValueExpressionImpl
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getPreValueExpression()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.MultiplicativeOperator2 <em>Multiplicative Operator2</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.MultiplicativeOperator2
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getMultiplicativeOperator2()
     * @generated
     */
    EEnum MULTIPLICATIVE_OPERATOR2 = eINSTANCE.getMultiplicativeOperator2();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.CombineOperator <em>Combine Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.CombineOperator
     * @see de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextPackageImpl#getCombineOperator()
     * @generated
     */
    EEnum COMBINE_OPERATOR = eINSTANCE.getCombineOperator();

  }

} //SynctextPackage
