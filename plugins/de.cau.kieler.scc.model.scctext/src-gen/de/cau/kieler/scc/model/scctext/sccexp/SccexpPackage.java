/**
 */
package de.cau.kieler.scc.model.scctext.sccexp;

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
 * @see de.cau.kieler.scc.model.scctext.sccexp.SccexpFactory
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
  SccexpPackage eINSTANCE = de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.StateSpecificationImpl <em>State Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.StateSpecificationImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getStateSpecification()
   * @generated
   */
  int STATE_SPECIFICATION = 0;

  /**
   * The feature id for the '<em><b>Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_SPECIFICATION__SCOPE = StextPackage.STATE_SPECIFICATION__SCOPE;

  /**
   * The feature id for the '<em><b>Scopes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_SPECIFICATION__SCOPES = StextPackage.STATE_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>State Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_SPECIFICATION_FEATURE_COUNT = StextPackage.STATE_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.InterfaceScopeImpl <em>Interface Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.InterfaceScopeImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getInterfaceScope()
   * @generated
   */
  int INTERFACE_SCOPE = 1;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_SCOPE__DECLARATIONS = SGraphPackage.SCOPE__DECLARATIONS;

  /**
   * The feature id for the '<em><b>Events</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_SCOPE__EVENTS = SGraphPackage.SCOPE__EVENTS;

  /**
   * The feature id for the '<em><b>Variables</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_SCOPE__VARIABLES = SGraphPackage.SCOPE__VARIABLES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_SCOPE__NAME = SGraphPackage.SCOPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Interface Scope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_SCOPE_FEATURE_COUNT = SGraphPackage.SCOPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.VariableDefinitionImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getVariableDefinition()
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
  int VARIABLE_DEFINITION__NAME = SGraphPackage.DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__TYPE = SGraphPackage.DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Owning Type</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__OWNING_TYPE = SGraphPackage.DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Readonly</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__READONLY = SGraphPackage.DECLARATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>External</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__EXTERNAL = SGraphPackage.DECLARATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__INITIAL_VALUE = SGraphPackage.DECLARATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__DIRECTION = SGraphPackage.DECLARATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Is Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__IS_STATIC = SGraphPackage.DECLARATION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__VAR_NAME = SGraphPackage.DECLARATION_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Var Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__VAR_TYPE = SGraphPackage.DECLARATION_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Var Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__VAR_INITIAL_VALUE = SGraphPackage.DECLARATION_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Var Combine Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__VAR_COMBINE_OPERATOR = SGraphPackage.DECLARATION_FEATURE_COUNT + 10;

  /**
   * The number of structural features of the '<em>Variable Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_FEATURE_COUNT = SGraphPackage.DECLARATION_FEATURE_COUNT + 11;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.ReactionScopeImpl <em>Reaction Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.ReactionScopeImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getReactionScope()
   * @generated
   */
  int REACTION_SCOPE = 3;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_SCOPE__DECLARATIONS = SGraphPackage.SCOPE__DECLARATIONS;

  /**
   * The feature id for the '<em><b>Events</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_SCOPE__EVENTS = SGraphPackage.SCOPE__EVENTS;

  /**
   * The feature id for the '<em><b>Variables</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_SCOPE__VARIABLES = SGraphPackage.SCOPE__VARIABLES;

  /**
   * The feature id for the '<em><b>Reaction Scope</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_SCOPE__REACTION_SCOPE = SGraphPackage.SCOPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Reaction Scope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_SCOPE_FEATURE_COUNT = SGraphPackage.SCOPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.TransitionImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 4;

  /**
   * The feature id for the '<em><b>Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TRIGGER = SGraphPackage.REACTION__TRIGGER;

  /**
   * The feature id for the '<em><b>Effect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__EFFECT = SGraphPackage.REACTION__EFFECT;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = SGraphPackage.REACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.ExitActionImpl <em>Exit Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.ExitActionImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getExitAction()
   * @generated
   */
  int EXIT_ACTION = 5;

  /**
   * The feature id for the '<em><b>Effect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_ACTION__EFFECT = SGraphPackage.EFFECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Exit Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_ACTION_FEATURE_COUNT = SGraphPackage.EFFECT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.InsideActionImpl <em>Inside Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.InsideActionImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getInsideAction()
   * @generated
   */
  int INSIDE_ACTION = 6;

  /**
   * The feature id for the '<em><b>Effect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSIDE_ACTION__EFFECT = SGraphPackage.EFFECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Inside Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSIDE_ACTION_FEATURE_COUNT = SGraphPackage.EFFECT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.EntryActionImpl <em>Entry Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.EntryActionImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getEntryAction()
   * @generated
   */
  int ENTRY_ACTION = 7;

  /**
   * The feature id for the '<em><b>Effect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_ACTION__EFFECT = SGraphPackage.EFFECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Entry Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_ACTION_FEATURE_COUNT = SGraphPackage.EFFECT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.SuspendImpl <em>Suspend</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SuspendImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getSuspend()
   * @generated
   */
  int SUSPEND = 8;

  /**
   * The feature id for the '<em><b>Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSPEND__TRIGGER = SGraphPackage.TRIGGER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Suspend</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSPEND_FEATURE_COUNT = SGraphPackage.TRIGGER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.TriggerImpl <em>Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.TriggerImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getTrigger()
   * @generated
   */
  int TRIGGER = 9;

  /**
   * The feature id for the '<em><b>Is Immediate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__IS_IMMEDIATE = SGraphPackage.TRIGGER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Delay</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__DELAY = SGraphPackage.TRIGGER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__EXPRESSION = SGraphPackage.TRIGGER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER_FEATURE_COUNT = SGraphPackage.TRIGGER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.EffectImpl <em>Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.EffectImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getEffect()
   * @generated
   */
  int EFFECT = 10;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT__ACTIONS = SGraphPackage.EFFECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_FEATURE_COUNT = SGraphPackage.EFFECT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.CombineOperator <em>Combine Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.CombineOperator
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getCombineOperator()
   * @generated
   */
  int COMBINE_OPERATOR = 11;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.VarDirection <em>Var Direction</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.VarDirection
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getVarDirection()
   * @generated
   */
  int VAR_DIRECTION = 12;


  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.StateSpecification <em>State Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Specification</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.StateSpecification
   * @generated
   */
  EClass getStateSpecification();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.kieler.scc.model.scctext.sccexp.StateSpecification#getScopes <em>Scopes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Scopes</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.StateSpecification#getScopes()
   * @see #getStateSpecification()
   * @generated
   */
  EReference getStateSpecification_Scopes();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.InterfaceScope <em>Interface Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Scope</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.InterfaceScope
   * @generated
   */
  EClass getInterfaceScope();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.VariableDefinition <em>Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Definition</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.VariableDefinition
   * @generated
   */
  EClass getVariableDefinition();

  /**
   * Returns the meta object for the attribute '{@link de.cau.kieler.scc.model.scctext.sccexp.VariableDefinition#getDirection <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Direction</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.VariableDefinition#getDirection()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_Direction();

  /**
   * Returns the meta object for the attribute '{@link de.cau.kieler.scc.model.scctext.sccexp.VariableDefinition#isIsStatic <em>Is Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Static</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.VariableDefinition#isIsStatic()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_IsStatic();

  /**
   * Returns the meta object for the attribute '{@link de.cau.kieler.scc.model.scctext.sccexp.VariableDefinition#getVarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Name</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.VariableDefinition#getVarName()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_VarName();

  /**
   * Returns the meta object for the reference '{@link de.cau.kieler.scc.model.scctext.sccexp.VariableDefinition#getVarType <em>Var Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var Type</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.VariableDefinition#getVarType()
   * @see #getVariableDefinition()
   * @generated
   */
  EReference getVariableDefinition_VarType();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.kieler.scc.model.scctext.sccexp.VariableDefinition#getVarInitialValue <em>Var Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var Initial Value</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.VariableDefinition#getVarInitialValue()
   * @see #getVariableDefinition()
   * @generated
   */
  EReference getVariableDefinition_VarInitialValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.kieler.scc.model.scctext.sccexp.VariableDefinition#getVarCombineOperator <em>Var Combine Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var Combine Operator</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.VariableDefinition#getVarCombineOperator()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_VarCombineOperator();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.ReactionScope <em>Reaction Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reaction Scope</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.ReactionScope
   * @generated
   */
  EClass getReactionScope();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.kieler.scc.model.scctext.sccexp.ReactionScope#getReactionScope <em>Reaction Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Reaction Scope</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.ReactionScope#getReactionScope()
   * @see #getReactionScope()
   * @generated
   */
  EReference getReactionScope_ReactionScope();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.ExitAction <em>Exit Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exit Action</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.ExitAction
   * @generated
   */
  EClass getExitAction();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.kieler.scc.model.scctext.sccexp.ExitAction#getEffect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Effect</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.ExitAction#getEffect()
   * @see #getExitAction()
   * @generated
   */
  EReference getExitAction_Effect();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.InsideAction <em>Inside Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inside Action</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.InsideAction
   * @generated
   */
  EClass getInsideAction();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.kieler.scc.model.scctext.sccexp.InsideAction#getEffect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Effect</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.InsideAction#getEffect()
   * @see #getInsideAction()
   * @generated
   */
  EReference getInsideAction_Effect();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.EntryAction <em>Entry Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entry Action</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.EntryAction
   * @generated
   */
  EClass getEntryAction();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.kieler.scc.model.scctext.sccexp.EntryAction#getEffect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Effect</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.EntryAction#getEffect()
   * @see #getEntryAction()
   * @generated
   */
  EReference getEntryAction_Effect();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.Suspend <em>Suspend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Suspend</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.Suspend
   * @generated
   */
  EClass getSuspend();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.kieler.scc.model.scctext.sccexp.Suspend#getTrigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trigger</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.Suspend#getTrigger()
   * @see #getSuspend()
   * @generated
   */
  EReference getSuspend_Trigger();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.Trigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trigger</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.Trigger
   * @generated
   */
  EClass getTrigger();

  /**
   * Returns the meta object for the attribute '{@link de.cau.kieler.scc.model.scctext.sccexp.Trigger#isIsImmediate <em>Is Immediate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Immediate</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.Trigger#isIsImmediate()
   * @see #getTrigger()
   * @generated
   */
  EAttribute getTrigger_IsImmediate();

  /**
   * Returns the meta object for the attribute '{@link de.cau.kieler.scc.model.scctext.sccexp.Trigger#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Delay</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.Trigger#getDelay()
   * @see #getTrigger()
   * @generated
   */
  EAttribute getTrigger_Delay();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.kieler.scc.model.scctext.sccexp.Trigger#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.Trigger#getExpression()
   * @see #getTrigger()
   * @generated
   */
  EReference getTrigger_Expression();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.Effect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Effect</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.Effect
   * @generated
   */
  EClass getEffect();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.kieler.scc.model.scctext.sccexp.Effect#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.Effect#getActions()
   * @see #getEffect()
   * @generated
   */
  EReference getEffect_Actions();

  /**
   * Returns the meta object for enum '{@link de.cau.kieler.scc.model.scctext.sccexp.CombineOperator <em>Combine Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Combine Operator</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.CombineOperator
   * @generated
   */
  EEnum getCombineOperator();

  /**
   * Returns the meta object for enum '{@link de.cau.kieler.scc.model.scctext.sccexp.VarDirection <em>Var Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Var Direction</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.VarDirection
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
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.StateSpecificationImpl <em>State Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.StateSpecificationImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getStateSpecification()
     * @generated
     */
    EClass STATE_SPECIFICATION = eINSTANCE.getStateSpecification();

    /**
     * The meta object literal for the '<em><b>Scopes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_SPECIFICATION__SCOPES = eINSTANCE.getStateSpecification_Scopes();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.InterfaceScopeImpl <em>Interface Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.InterfaceScopeImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getInterfaceScope()
     * @generated
     */
    EClass INTERFACE_SCOPE = eINSTANCE.getInterfaceScope();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.VariableDefinitionImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getVariableDefinition()
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
     * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION__VAR_NAME = eINSTANCE.getVariableDefinition_VarName();

    /**
     * The meta object literal for the '<em><b>Var Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DEFINITION__VAR_TYPE = eINSTANCE.getVariableDefinition_VarType();

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
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.ReactionScopeImpl <em>Reaction Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.ReactionScopeImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getReactionScope()
     * @generated
     */
    EClass REACTION_SCOPE = eINSTANCE.getReactionScope();

    /**
     * The meta object literal for the '<em><b>Reaction Scope</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REACTION_SCOPE__REACTION_SCOPE = eINSTANCE.getReactionScope_ReactionScope();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.TransitionImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.ExitActionImpl <em>Exit Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.ExitActionImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getExitAction()
     * @generated
     */
    EClass EXIT_ACTION = eINSTANCE.getExitAction();

    /**
     * The meta object literal for the '<em><b>Effect</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXIT_ACTION__EFFECT = eINSTANCE.getExitAction_Effect();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.InsideActionImpl <em>Inside Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.InsideActionImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getInsideAction()
     * @generated
     */
    EClass INSIDE_ACTION = eINSTANCE.getInsideAction();

    /**
     * The meta object literal for the '<em><b>Effect</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSIDE_ACTION__EFFECT = eINSTANCE.getInsideAction_Effect();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.EntryActionImpl <em>Entry Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.EntryActionImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getEntryAction()
     * @generated
     */
    EClass ENTRY_ACTION = eINSTANCE.getEntryAction();

    /**
     * The meta object literal for the '<em><b>Effect</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTRY_ACTION__EFFECT = eINSTANCE.getEntryAction_Effect();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.SuspendImpl <em>Suspend</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SuspendImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getSuspend()
     * @generated
     */
    EClass SUSPEND = eINSTANCE.getSuspend();

    /**
     * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUSPEND__TRIGGER = eINSTANCE.getSuspend_Trigger();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.TriggerImpl <em>Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.TriggerImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getTrigger()
     * @generated
     */
    EClass TRIGGER = eINSTANCE.getTrigger();

    /**
     * The meta object literal for the '<em><b>Is Immediate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRIGGER__IS_IMMEDIATE = eINSTANCE.getTrigger_IsImmediate();

    /**
     * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRIGGER__DELAY = eINSTANCE.getTrigger_Delay();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRIGGER__EXPRESSION = eINSTANCE.getTrigger_Expression();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.EffectImpl <em>Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.EffectImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getEffect()
     * @generated
     */
    EClass EFFECT = eINSTANCE.getEffect();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EFFECT__ACTIONS = eINSTANCE.getEffect_Actions();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.CombineOperator <em>Combine Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.CombineOperator
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getCombineOperator()
     * @generated
     */
    EEnum COMBINE_OPERATOR = eINSTANCE.getCombineOperator();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.VarDirection <em>Var Direction</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.VarDirection
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getVarDirection()
     * @generated
     */
    EEnum VAR_DIRECTION = eINSTANCE.getVarDirection();

  }

} //SccexpPackage
