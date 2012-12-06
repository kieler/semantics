/**
 */
package de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp;

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
 * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.SccexpFactory
 * @model kind="package"
 * @generated
 */
public interface SccexpPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sccexp";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://cau.kieler.de/scc/SCCExp";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sccexp";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SccexpPackage eINSTANCE = de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.StateScopeImpl <em>State Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.StateScopeImpl
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getStateScope()
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
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SignalDefinitionImpl <em>Signal Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SignalDefinitionImpl
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getSignalDefinition()
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
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.VariableDefinitionImpl
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getVariableDefinition()
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
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__DIRECTION = StextPackage.VARIABLE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__IS_STATIC = StextPackage.VARIABLE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Var Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__VAR_INITIAL_VALUE = StextPackage.VARIABLE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Var Combine Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__VAR_COMBINE_OPERATOR = StextPackage.VARIABLE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Variable Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_FEATURE_COUNT = StextPackage.VARIABLE_DEFINITION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.LocalReactionImpl <em>Local Reaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.LocalReactionImpl
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getLocalReaction()
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
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.StateActionImpl <em>State Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.StateActionImpl
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getStateAction()
   * @generated
   */
  int STATE_ACTION = 4;

  /**
   * The number of structural features of the '<em>State Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_ACTION_FEATURE_COUNT = StextPackage.EVENT_SPEC_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.EntryImpl <em>Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.EntryImpl
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getEntry()
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
  int ENTRY_FEATURE_COUNT = STATE_ACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.InsideImpl <em>Inside</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.InsideImpl
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getInside()
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
  int INSIDE_FEATURE_COUNT = STATE_ACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.ExitImpl <em>Exit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.ExitImpl
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getExit()
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
  int EXIT_FEATURE_COUNT = STATE_ACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SimpleScopeImpl <em>Simple Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SimpleScopeImpl
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getSimpleScope()
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
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.EventDefinitionImpl <em>Event Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.EventDefinitionImpl
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getEventDefinition()
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
   * The number of structural features of the '<em>Event Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DEFINITION_FEATURE_COUNT = SIGNAL_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.ReactionTriggerImpl <em>Reaction Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.ReactionTriggerImpl
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getReactionTrigger()
   * @generated
   */
  int REACTION_TRIGGER = 10;

  /**
   * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_TRIGGER__TRIGGERS = SGraphPackage.TRIGGER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Guard Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_TRIGGER__GUARD_EXPRESSION = SGraphPackage.TRIGGER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Is Immediate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_TRIGGER__IS_IMMEDIATE = SGraphPackage.TRIGGER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Delay</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_TRIGGER__DELAY = SGraphPackage.TRIGGER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Reaction Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_TRIGGER_FEATURE_COUNT = SGraphPackage.TRIGGER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.ReactionEffectImpl <em>Reaction Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.ReactionEffectImpl
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getReactionEffect()
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
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.PreValueExpressionreturnsImpl <em>Pre Value Expressionreturns</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.PreValueExpressionreturnsImpl
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getPreValueExpressionreturns()
   * @generated
   */
  int PRE_VALUE_EXPRESSIONRETURNS = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_VALUE_EXPRESSIONRETURNS__VALUE = StextPackage.EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pre Value Expressionreturns</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_VALUE_EXPRESSIONRETURNS_FEATURE_COUNT = StextPackage.EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.CombineOperator <em>Combine Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.CombineOperator
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getCombineOperator()
   * @generated
   */
  int COMBINE_OPERATOR = 13;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.VarDirection <em>Var Direction</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.VarDirection
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getVarDirection()
   * @generated
   */
  int VAR_DIRECTION = 14;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.StateScope <em>State Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Scope</em>'.
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.StateScope
   * @generated
   */
  EClass getStateScope();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.SignalDefinition <em>Signal Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal Definition</em>'.
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.SignalDefinition
   * @generated
   */
  EClass getSignalDefinition();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.VariableDefinition <em>Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Definition</em>'.
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.VariableDefinition
   * @generated
   */
  EClass getVariableDefinition();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.VariableDefinition#getDirection <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Direction</em>'.
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.VariableDefinition#getDirection()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_Direction();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.VariableDefinition#isIsStatic <em>Is Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Static</em>'.
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.VariableDefinition#isIsStatic()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_IsStatic();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.VariableDefinition#getVarInitialValue <em>Var Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var Initial Value</em>'.
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.VariableDefinition#getVarInitialValue()
   * @see #getVariableDefinition()
   * @generated
   */
  EReference getVariableDefinition_VarInitialValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.VariableDefinition#getVarCombineOperator <em>Var Combine Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Combine Operator</em>'.
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.VariableDefinition#getVarCombineOperator()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_VarCombineOperator();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.LocalReaction <em>Local Reaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Reaction</em>'.
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.LocalReaction
   * @generated
   */
  EClass getLocalReaction();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.StateAction <em>State Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Action</em>'.
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.StateAction
   * @generated
   */
  EClass getStateAction();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.Entry <em>Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entry</em>'.
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.Entry
   * @generated
   */
  EClass getEntry();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.Inside <em>Inside</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inside</em>'.
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.Inside
   * @generated
   */
  EClass getInside();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.Exit <em>Exit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exit</em>'.
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.Exit
   * @generated
   */
  EClass getExit();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.SimpleScope <em>Simple Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Scope</em>'.
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.SimpleScope
   * @generated
   */
  EClass getSimpleScope();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.EventDefinition <em>Event Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Definition</em>'.
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.EventDefinition
   * @generated
   */
  EClass getEventDefinition();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.ReactionTrigger <em>Reaction Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reaction Trigger</em>'.
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.ReactionTrigger
   * @generated
   */
  EClass getReactionTrigger();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.ReactionTrigger#getTriggers <em>Triggers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Triggers</em>'.
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.ReactionTrigger#getTriggers()
   * @see #getReactionTrigger()
   * @generated
   */
  EReference getReactionTrigger_Triggers();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.ReactionTrigger#getGuardExpression <em>Guard Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guard Expression</em>'.
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.ReactionTrigger#getGuardExpression()
   * @see #getReactionTrigger()
   * @generated
   */
  EReference getReactionTrigger_GuardExpression();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.ReactionTrigger#isIsImmediate <em>Is Immediate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Immediate</em>'.
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.ReactionTrigger#isIsImmediate()
   * @see #getReactionTrigger()
   * @generated
   */
  EAttribute getReactionTrigger_IsImmediate();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.ReactionTrigger#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Delay</em>'.
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.ReactionTrigger#getDelay()
   * @see #getReactionTrigger()
   * @generated
   */
  EAttribute getReactionTrigger_Delay();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.ReactionEffect <em>Reaction Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reaction Effect</em>'.
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.ReactionEffect
   * @generated
   */
  EClass getReactionEffect();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.ReactionEffect#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.ReactionEffect#getActions()
   * @see #getReactionEffect()
   * @generated
   */
  EReference getReactionEffect_Actions();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.PreValueExpressionreturns <em>Pre Value Expressionreturns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pre Value Expressionreturns</em>'.
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.PreValueExpressionreturns
   * @generated
   */
  EClass getPreValueExpressionreturns();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.PreValueExpressionreturns#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.PreValueExpressionreturns#getValue()
   * @see #getPreValueExpressionreturns()
   * @generated
   */
  EReference getPreValueExpressionreturns_Value();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.CombineOperator <em>Combine Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Combine Operator</em>'.
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.CombineOperator
   * @generated
   */
  EEnum getCombineOperator();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.VarDirection <em>Var Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Var Direction</em>'.
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.VarDirection
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
  SccexpFactory getSccexpFactory();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.StateScopeImpl <em>State Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.StateScopeImpl
     * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getStateScope()
     * @generated
     */
    EClass STATE_SCOPE = eINSTANCE.getStateScope();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SignalDefinitionImpl <em>Signal Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SignalDefinitionImpl
     * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getSignalDefinition()
     * @generated
     */
    EClass SIGNAL_DEFINITION = eINSTANCE.getSignalDefinition();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.VariableDefinitionImpl
     * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getVariableDefinition()
     * @generated
     */
    EClass VARIABLE_DEFINITION = eINSTANCE.getVariableDefinition();

    /**
     * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION__DIRECTION = eINSTANCE.getVariableDefinition_Direction();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.LocalReactionImpl <em>Local Reaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.LocalReactionImpl
     * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getLocalReaction()
     * @generated
     */
    EClass LOCAL_REACTION = eINSTANCE.getLocalReaction();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.StateActionImpl <em>State Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.StateActionImpl
     * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getStateAction()
     * @generated
     */
    EClass STATE_ACTION = eINSTANCE.getStateAction();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.EntryImpl <em>Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.EntryImpl
     * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getEntry()
     * @generated
     */
    EClass ENTRY = eINSTANCE.getEntry();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.InsideImpl <em>Inside</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.InsideImpl
     * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getInside()
     * @generated
     */
    EClass INSIDE = eINSTANCE.getInside();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.ExitImpl <em>Exit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.ExitImpl
     * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getExit()
     * @generated
     */
    EClass EXIT = eINSTANCE.getExit();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SimpleScopeImpl <em>Simple Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SimpleScopeImpl
     * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getSimpleScope()
     * @generated
     */
    EClass SIMPLE_SCOPE = eINSTANCE.getSimpleScope();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.EventDefinitionImpl <em>Event Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.EventDefinitionImpl
     * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getEventDefinition()
     * @generated
     */
    EClass EVENT_DEFINITION = eINSTANCE.getEventDefinition();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.ReactionTriggerImpl <em>Reaction Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.ReactionTriggerImpl
     * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getReactionTrigger()
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
     * The meta object literal for the '<em><b>Guard Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REACTION_TRIGGER__GUARD_EXPRESSION = eINSTANCE.getReactionTrigger_GuardExpression();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.ReactionEffectImpl <em>Reaction Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.ReactionEffectImpl
     * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getReactionEffect()
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
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.PreValueExpressionreturnsImpl <em>Pre Value Expressionreturns</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.PreValueExpressionreturnsImpl
     * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getPreValueExpressionreturns()
     * @generated
     */
    EClass PRE_VALUE_EXPRESSIONRETURNS = eINSTANCE.getPreValueExpressionreturns();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRE_VALUE_EXPRESSIONRETURNS__VALUE = eINSTANCE.getPreValueExpressionreturns_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.CombineOperator <em>Combine Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.CombineOperator
     * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getCombineOperator()
     * @generated
     */
    EEnum COMBINE_OPERATOR = eINSTANCE.getCombineOperator();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.VarDirection <em>Var Direction</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.VarDirection
     * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getVarDirection()
     * @generated
     */
    EEnum VAR_DIRECTION = eINSTANCE.getVarDirection();

  }

} //SccexpPackage
