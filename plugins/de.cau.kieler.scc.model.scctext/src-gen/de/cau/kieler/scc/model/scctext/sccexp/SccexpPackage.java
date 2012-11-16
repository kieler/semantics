/**
 */
package de.cau.kieler.scc.model.scctext.sccexp;

import org.eclipse.emf.ecore.EClass;
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
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.RootImpl <em>Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.RootImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getRoot()
   * @generated
   */
  int ROOT = 0;

  /**
   * The feature id for the '<em><b>Roots</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__ROOTS = StextPackage.ROOT__ROOTS;

  /**
   * The number of structural features of the '<em>Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_FEATURE_COUNT = StextPackage.ROOT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.DefRootImpl <em>Def Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.DefRootImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getDefRoot()
   * @generated
   */
  int DEF_ROOT = 1;

  /**
   * The number of structural features of the '<em>Def Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_ROOT_FEATURE_COUNT = StextPackage.DEF_ROOT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.StateRootImpl <em>State Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.StateRootImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getStateRoot()
   * @generated
   */
  int STATE_ROOT = 2;

  /**
   * The feature id for the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_ROOT__DEF = DEF_ROOT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>State Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_ROOT_FEATURE_COUNT = DEF_ROOT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.TransitionRootImpl <em>Transition Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.TransitionRootImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getTransitionRoot()
   * @generated
   */
  int TRANSITION_ROOT = 3;

  /**
   * The feature id for the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_ROOT__DEF = DEF_ROOT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Transition Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_ROOT_FEATURE_COUNT = DEF_ROOT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.StateScopeImpl <em>State Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.StateScopeImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getStateScope()
   * @generated
   */
  int STATE_SCOPE = 4;

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
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.InterfaceScopeRootImpl <em>Interface Scope Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.InterfaceScopeRootImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getInterfaceScopeRoot()
   * @generated
   */
  int INTERFACE_SCOPE_ROOT = 5;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_SCOPE_ROOT__DECLARATIONS = STATE_SCOPE__DECLARATIONS;

  /**
   * The feature id for the '<em><b>Events</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_SCOPE_ROOT__EVENTS = STATE_SCOPE__EVENTS;

  /**
   * The feature id for the '<em><b>Variables</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_SCOPE_ROOT__VARIABLES = STATE_SCOPE__VARIABLES;

  /**
   * The feature id for the '<em><b>Interface Scope</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_SCOPE_ROOT__INTERFACE_SCOPE = STATE_SCOPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Interface Scope Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_SCOPE_ROOT_FEATURE_COUNT = STATE_SCOPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.InterfaceScopeImpl <em>Interface Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.InterfaceScopeImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getInterfaceScope()
   * @generated
   */
  int INTERFACE_SCOPE = 6;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_SCOPE__DECLARATIONS = StextPackage.INTERFACE_SCOPE__DECLARATIONS;

  /**
   * The feature id for the '<em><b>Events</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_SCOPE__EVENTS = StextPackage.INTERFACE_SCOPE__EVENTS;

  /**
   * The feature id for the '<em><b>Variables</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_SCOPE__VARIABLES = StextPackage.INTERFACE_SCOPE__VARIABLES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_SCOPE__NAME = StextPackage.INTERFACE_SCOPE__NAME;

  /**
   * The number of structural features of the '<em>Interface Scope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_SCOPE_FEATURE_COUNT = StextPackage.INTERFACE_SCOPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.InterfaceDeclarationImpl <em>Interface Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.InterfaceDeclarationImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getInterfaceDeclaration()
   * @generated
   */
  int INTERFACE_DECLARATION = 7;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION__DECLARATIONS = INTERFACE_SCOPE__DECLARATIONS;

  /**
   * The feature id for the '<em><b>Events</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION__EVENTS = INTERFACE_SCOPE__EVENTS;

  /**
   * The feature id for the '<em><b>Variables</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION__VARIABLES = INTERFACE_SCOPE__VARIABLES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION__NAME = INTERFACE_SCOPE__NAME;

  /**
   * The number of structural features of the '<em>Interface Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION_FEATURE_COUNT = INTERFACE_SCOPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.ActionDeclarationImpl <em>Action Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.ActionDeclarationImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getActionDeclaration()
   * @generated
   */
  int ACTION_DECLARATION = 8;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_DECLARATION__DECLARATIONS = INTERFACE_SCOPE__DECLARATIONS;

  /**
   * The feature id for the '<em><b>Events</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_DECLARATION__EVENTS = INTERFACE_SCOPE__EVENTS;

  /**
   * The feature id for the '<em><b>Variables</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_DECLARATION__VARIABLES = INTERFACE_SCOPE__VARIABLES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_DECLARATION__NAME = INTERFACE_SCOPE__NAME;

  /**
   * The number of structural features of the '<em>Action Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_DECLARATION_FEATURE_COUNT = INTERFACE_SCOPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.ExitActionDeclarationImpl <em>Exit Action Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.ExitActionDeclarationImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getExitActionDeclaration()
   * @generated
   */
  int EXIT_ACTION_DECLARATION = 9;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_ACTION_DECLARATION__DECLARATIONS = ACTION_DECLARATION__DECLARATIONS;

  /**
   * The feature id for the '<em><b>Events</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_ACTION_DECLARATION__EVENTS = ACTION_DECLARATION__EVENTS;

  /**
   * The feature id for the '<em><b>Variables</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_ACTION_DECLARATION__VARIABLES = ACTION_DECLARATION__VARIABLES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_ACTION_DECLARATION__NAME = ACTION_DECLARATION__NAME;

  /**
   * The number of structural features of the '<em>Exit Action Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_ACTION_DECLARATION_FEATURE_COUNT = ACTION_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.InsideActionDeclarationImpl <em>Inside Action Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.InsideActionDeclarationImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getInsideActionDeclaration()
   * @generated
   */
  int INSIDE_ACTION_DECLARATION = 10;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSIDE_ACTION_DECLARATION__DECLARATIONS = ACTION_DECLARATION__DECLARATIONS;

  /**
   * The feature id for the '<em><b>Events</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSIDE_ACTION_DECLARATION__EVENTS = ACTION_DECLARATION__EVENTS;

  /**
   * The feature id for the '<em><b>Variables</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSIDE_ACTION_DECLARATION__VARIABLES = ACTION_DECLARATION__VARIABLES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSIDE_ACTION_DECLARATION__NAME = ACTION_DECLARATION__NAME;

  /**
   * The number of structural features of the '<em>Inside Action Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSIDE_ACTION_DECLARATION_FEATURE_COUNT = ACTION_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.EntryActionDeclarationImpl <em>Entry Action Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.EntryActionDeclarationImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getEntryActionDeclaration()
   * @generated
   */
  int ENTRY_ACTION_DECLARATION = 11;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_ACTION_DECLARATION__DECLARATIONS = ACTION_DECLARATION__DECLARATIONS;

  /**
   * The feature id for the '<em><b>Events</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_ACTION_DECLARATION__EVENTS = ACTION_DECLARATION__EVENTS;

  /**
   * The feature id for the '<em><b>Variables</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_ACTION_DECLARATION__VARIABLES = ACTION_DECLARATION__VARIABLES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_ACTION_DECLARATION__NAME = ACTION_DECLARATION__NAME;

  /**
   * The number of structural features of the '<em>Entry Action Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_ACTION_DECLARATION_FEATURE_COUNT = ACTION_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.SuspendDeclarationImpl <em>Suspend Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SuspendDeclarationImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getSuspendDeclaration()
   * @generated
   */
  int SUSPEND_DECLARATION = 12;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSPEND_DECLARATION__DECLARATIONS = INTERFACE_SCOPE__DECLARATIONS;

  /**
   * The feature id for the '<em><b>Events</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSPEND_DECLARATION__EVENTS = INTERFACE_SCOPE__EVENTS;

  /**
   * The feature id for the '<em><b>Variables</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSPEND_DECLARATION__VARIABLES = INTERFACE_SCOPE__VARIABLES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSPEND_DECLARATION__NAME = INTERFACE_SCOPE__NAME;

  /**
   * The number of structural features of the '<em>Suspend Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSPEND_DECLARATION_FEATURE_COUNT = INTERFACE_SCOPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.TransitionReactionImpl <em>Transition Reaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.TransitionReactionImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getTransitionReaction()
   * @generated
   */
  int TRANSITION_REACTION = 13;

  /**
   * The feature id for the '<em><b>Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_REACTION__TRIGGER = StextPackage.TRANSITION_REACTION__TRIGGER;

  /**
   * The feature id for the '<em><b>Effect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_REACTION__EFFECT = StextPackage.TRANSITION_REACTION__EFFECT;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_REACTION__PROPERTIES = StextPackage.TRANSITION_REACTION__PROPERTIES;

  /**
   * The number of structural features of the '<em>Transition Reaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_REACTION_FEATURE_COUNT = StextPackage.TRANSITION_REACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.MyTriggerImpl <em>My Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.MyTriggerImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getMyTrigger()
   * @generated
   */
  int MY_TRIGGER = 14;

  /**
   * The number of structural features of the '<em>My Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_TRIGGER_FEATURE_COUNT = SGraphPackage.TRIGGER_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.Root <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Root</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.Root
   * @generated
   */
  EClass getRoot();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.DefRoot <em>Def Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Def Root</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.DefRoot
   * @generated
   */
  EClass getDefRoot();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.StateRoot <em>State Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Root</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.StateRoot
   * @generated
   */
  EClass getStateRoot();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.TransitionRoot <em>Transition Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Root</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.TransitionRoot
   * @generated
   */
  EClass getTransitionRoot();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.StateScope <em>State Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Scope</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.StateScope
   * @generated
   */
  EClass getStateScope();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.InterfaceScopeRoot <em>Interface Scope Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Scope Root</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.InterfaceScopeRoot
   * @generated
   */
  EClass getInterfaceScopeRoot();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.kieler.scc.model.scctext.sccexp.InterfaceScopeRoot#getInterfaceScope <em>Interface Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interface Scope</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.InterfaceScopeRoot#getInterfaceScope()
   * @see #getInterfaceScopeRoot()
   * @generated
   */
  EReference getInterfaceScopeRoot_InterfaceScope();

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
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.InterfaceDeclaration <em>Interface Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Declaration</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.InterfaceDeclaration
   * @generated
   */
  EClass getInterfaceDeclaration();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.ActionDeclaration <em>Action Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Declaration</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.ActionDeclaration
   * @generated
   */
  EClass getActionDeclaration();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.ExitActionDeclaration <em>Exit Action Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exit Action Declaration</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.ExitActionDeclaration
   * @generated
   */
  EClass getExitActionDeclaration();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.InsideActionDeclaration <em>Inside Action Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inside Action Declaration</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.InsideActionDeclaration
   * @generated
   */
  EClass getInsideActionDeclaration();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.EntryActionDeclaration <em>Entry Action Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entry Action Declaration</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.EntryActionDeclaration
   * @generated
   */
  EClass getEntryActionDeclaration();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.SuspendDeclaration <em>Suspend Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Suspend Declaration</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.SuspendDeclaration
   * @generated
   */
  EClass getSuspendDeclaration();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.TransitionReaction <em>Transition Reaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Reaction</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.TransitionReaction
   * @generated
   */
  EClass getTransitionReaction();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.MyTrigger <em>My Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>My Trigger</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.MyTrigger
   * @generated
   */
  EClass getMyTrigger();

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
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.RootImpl <em>Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.RootImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getRoot()
     * @generated
     */
    EClass ROOT = eINSTANCE.getRoot();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.DefRootImpl <em>Def Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.DefRootImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getDefRoot()
     * @generated
     */
    EClass DEF_ROOT = eINSTANCE.getDefRoot();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.StateRootImpl <em>State Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.StateRootImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getStateRoot()
     * @generated
     */
    EClass STATE_ROOT = eINSTANCE.getStateRoot();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.TransitionRootImpl <em>Transition Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.TransitionRootImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getTransitionRoot()
     * @generated
     */
    EClass TRANSITION_ROOT = eINSTANCE.getTransitionRoot();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.StateScopeImpl <em>State Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.StateScopeImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getStateScope()
     * @generated
     */
    EClass STATE_SCOPE = eINSTANCE.getStateScope();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.InterfaceScopeRootImpl <em>Interface Scope Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.InterfaceScopeRootImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getInterfaceScopeRoot()
     * @generated
     */
    EClass INTERFACE_SCOPE_ROOT = eINSTANCE.getInterfaceScopeRoot();

    /**
     * The meta object literal for the '<em><b>Interface Scope</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_SCOPE_ROOT__INTERFACE_SCOPE = eINSTANCE.getInterfaceScopeRoot_InterfaceScope();

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
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.InterfaceDeclarationImpl <em>Interface Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.InterfaceDeclarationImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getInterfaceDeclaration()
     * @generated
     */
    EClass INTERFACE_DECLARATION = eINSTANCE.getInterfaceDeclaration();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.ActionDeclarationImpl <em>Action Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.ActionDeclarationImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getActionDeclaration()
     * @generated
     */
    EClass ACTION_DECLARATION = eINSTANCE.getActionDeclaration();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.ExitActionDeclarationImpl <em>Exit Action Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.ExitActionDeclarationImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getExitActionDeclaration()
     * @generated
     */
    EClass EXIT_ACTION_DECLARATION = eINSTANCE.getExitActionDeclaration();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.InsideActionDeclarationImpl <em>Inside Action Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.InsideActionDeclarationImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getInsideActionDeclaration()
     * @generated
     */
    EClass INSIDE_ACTION_DECLARATION = eINSTANCE.getInsideActionDeclaration();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.EntryActionDeclarationImpl <em>Entry Action Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.EntryActionDeclarationImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getEntryActionDeclaration()
     * @generated
     */
    EClass ENTRY_ACTION_DECLARATION = eINSTANCE.getEntryActionDeclaration();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.SuspendDeclarationImpl <em>Suspend Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SuspendDeclarationImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getSuspendDeclaration()
     * @generated
     */
    EClass SUSPEND_DECLARATION = eINSTANCE.getSuspendDeclaration();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.TransitionReactionImpl <em>Transition Reaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.TransitionReactionImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getTransitionReaction()
     * @generated
     */
    EClass TRANSITION_REACTION = eINSTANCE.getTransitionReaction();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.MyTriggerImpl <em>My Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.MyTriggerImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getMyTrigger()
     * @generated
     */
    EClass MY_TRIGGER = eINSTANCE.getMyTrigger();

  }

} //SccexpPackage
