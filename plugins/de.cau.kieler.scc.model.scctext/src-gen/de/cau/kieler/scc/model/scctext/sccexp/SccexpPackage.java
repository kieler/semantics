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
   * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION__DECLARATION = INTERFACE_SCOPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Interface Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION_FEATURE_COUNT = INTERFACE_SCOPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.SCCVariableDeclarationImpl <em>SCC Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SCCVariableDeclarationImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getSCCVariableDeclaration()
   * @generated
   */
  int SCC_VARIABLE_DECLARATION = 8;

  /**
   * The number of structural features of the '<em>SCC Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCC_VARIABLE_DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.LocalVariableDeclarationImpl <em>Local Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.LocalVariableDeclarationImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getLocalVariableDeclaration()
   * @generated
   */
  int LOCAL_VARIABLE_DECLARATION = 9;

  /**
   * The number of structural features of the '<em>Local Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE_DECLARATION_FEATURE_COUNT = SCC_VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.InOutVariableDeclarationImpl <em>In Out Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.InOutVariableDeclarationImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getInOutVariableDeclaration()
   * @generated
   */
  int IN_OUT_VARIABLE_DECLARATION = 10;

  /**
   * The number of structural features of the '<em>In Out Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_OUT_VARIABLE_DECLARATION_FEATURE_COUNT = SCC_VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.OutputVariableeclarationImpl <em>Output Variableeclaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.OutputVariableeclarationImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getOutputVariableeclaration()
   * @generated
   */
  int OUTPUT_VARIABLEECLARATION = 11;

  /**
   * The number of structural features of the '<em>Output Variableeclaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_VARIABLEECLARATION_FEATURE_COUNT = SCC_VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.InputVariableDeclarationImpl <em>Input Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.InputVariableDeclarationImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getInputVariableDeclaration()
   * @generated
   */
  int INPUT_VARIABLE_DECLARATION = 12;

  /**
   * The number of structural features of the '<em>Input Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_VARIABLE_DECLARATION_FEATURE_COUNT = SCC_VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.ActionDeclarationImpl <em>Action Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.ActionDeclarationImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getActionDeclaration()
   * @generated
   */
  int ACTION_DECLARATION = 13;

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
  int EXIT_ACTION_DECLARATION = 14;

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
   * The feature id for the '<em><b>Exit Action Declaration</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_ACTION_DECLARATION__EXIT_ACTION_DECLARATION = ACTION_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Exit Action Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_ACTION_DECLARATION_FEATURE_COUNT = ACTION_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.InsideActionDeclarationImpl <em>Inside Action Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.InsideActionDeclarationImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getInsideActionDeclaration()
   * @generated
   */
  int INSIDE_ACTION_DECLARATION = 15;

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
   * The feature id for the '<em><b>Inside Action Declaration</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSIDE_ACTION_DECLARATION__INSIDE_ACTION_DECLARATION = ACTION_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Inside Action Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSIDE_ACTION_DECLARATION_FEATURE_COUNT = ACTION_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.EntryActionDeclarationImpl <em>Entry Action Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.EntryActionDeclarationImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getEntryActionDeclaration()
   * @generated
   */
  int ENTRY_ACTION_DECLARATION = 16;

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
   * The feature id for the '<em><b>Entry Action Declaration</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_ACTION_DECLARATION__ENTRY_ACTION_DECLARATION = ACTION_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Entry Action Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_ACTION_DECLARATION_FEATURE_COUNT = ACTION_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.ActionVariableDeclarationImpl <em>Action Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.ActionVariableDeclarationImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getActionVariableDeclaration()
   * @generated
   */
  int ACTION_VARIABLE_DECLARATION = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_VARIABLE_DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Action Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_VARIABLE_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.SuspendDeclarationImpl <em>Suspend Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SuspendDeclarationImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getSuspendDeclaration()
   * @generated
   */
  int SUSPEND_DECLARATION = 18;

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
   * The feature id for the '<em><b>Suspend Declaration</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSPEND_DECLARATION__SUSPEND_DECLARATION = INTERFACE_SCOPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Suspend Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSPEND_DECLARATION_FEATURE_COUNT = INTERFACE_SCOPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.SuspendVariableDeclarationImpl <em>Suspend Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SuspendVariableDeclarationImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getSuspendVariableDeclaration()
   * @generated
   */
  int SUSPEND_VARIABLE_DECLARATION = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSPEND_VARIABLE_DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Suspend Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUSPEND_VARIABLE_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.TransitionReactionImpl <em>Transition Reaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.TransitionReactionImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getTransitionReaction()
   * @generated
   */
  int TRANSITION_REACTION = 20;

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
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.LocalImpl <em>Local</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.LocalImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getLocal()
   * @generated
   */
  int LOCAL = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL__NAME = LOCAL_VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL__TYPE = LOCAL_VARIABLE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL__INITIAL_VALUE = LOCAL_VARIABLE_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL__OPERATOR = LOCAL_VARIABLE_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Local</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_FEATURE_COUNT = LOCAL_VARIABLE_DECLARATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.InputImpl <em>Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.InputImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getInput()
   * @generated
   */
  int INPUT = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__NAME = IN_OUT_VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__TYPE = IN_OUT_VARIABLE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__INITIAL_VALUE = IN_OUT_VARIABLE_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__OPERATOR = IN_OUT_VARIABLE_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FEATURE_COUNT = IN_OUT_VARIABLE_DECLARATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.OutputImpl <em>Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.OutputImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getOutput()
   * @generated
   */
  int OUTPUT = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__NAME = OUTPUT_VARIABLEECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__TYPE = OUTPUT_VARIABLEECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__OPERATOR = OUTPUT_VARIABLEECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_FEATURE_COUNT = OUTPUT_VARIABLEECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.InOutImpl <em>In Out</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.InOutImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getInOut()
   * @generated
   */
  int IN_OUT = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_OUT__NAME = INPUT_VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_OUT__TYPE = INPUT_VARIABLE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_OUT__INITIAL_VALUE = INPUT_VARIABLE_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_OUT__OPERATOR = INPUT_VARIABLE_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>In Out</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_OUT_FEATURE_COUNT = INPUT_VARIABLE_DECLARATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.MyTriggerImpl <em>My Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.MyTriggerImpl
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getMyTrigger()
   * @generated
   */
  int MY_TRIGGER = 25;

  /**
   * The number of structural features of the '<em>My Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_TRIGGER_FEATURE_COUNT = SGraphPackage.TRIGGER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.kieler.scc.model.scctext.sccexp.CombineOperator <em>Combine Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.scc.model.scctext.sccexp.CombineOperator
   * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getCombineOperator()
   * @generated
   */
  int COMBINE_OPERATOR = 26;


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
   * Returns the meta object for the containment reference list '{@link de.cau.kieler.scc.model.scctext.sccexp.InterfaceDeclaration#getDeclaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declaration</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.InterfaceDeclaration#getDeclaration()
   * @see #getInterfaceDeclaration()
   * @generated
   */
  EReference getInterfaceDeclaration_Declaration();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.SCCVariableDeclaration <em>SCC Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SCC Variable Declaration</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.SCCVariableDeclaration
   * @generated
   */
  EClass getSCCVariableDeclaration();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.LocalVariableDeclaration <em>Local Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Variable Declaration</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.LocalVariableDeclaration
   * @generated
   */
  EClass getLocalVariableDeclaration();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.InOutVariableDeclaration <em>In Out Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Out Variable Declaration</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.InOutVariableDeclaration
   * @generated
   */
  EClass getInOutVariableDeclaration();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.OutputVariableeclaration <em>Output Variableeclaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Variableeclaration</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.OutputVariableeclaration
   * @generated
   */
  EClass getOutputVariableeclaration();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.InputVariableDeclaration <em>Input Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Variable Declaration</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.InputVariableDeclaration
   * @generated
   */
  EClass getInputVariableDeclaration();

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
   * Returns the meta object for the containment reference list '{@link de.cau.kieler.scc.model.scctext.sccexp.ExitActionDeclaration#getExitActionDeclaration <em>Exit Action Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exit Action Declaration</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.ExitActionDeclaration#getExitActionDeclaration()
   * @see #getExitActionDeclaration()
   * @generated
   */
  EReference getExitActionDeclaration_ExitActionDeclaration();

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
   * Returns the meta object for the containment reference list '{@link de.cau.kieler.scc.model.scctext.sccexp.InsideActionDeclaration#getInsideActionDeclaration <em>Inside Action Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inside Action Declaration</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.InsideActionDeclaration#getInsideActionDeclaration()
   * @see #getInsideActionDeclaration()
   * @generated
   */
  EReference getInsideActionDeclaration_InsideActionDeclaration();

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
   * Returns the meta object for the containment reference list '{@link de.cau.kieler.scc.model.scctext.sccexp.EntryActionDeclaration#getEntryActionDeclaration <em>Entry Action Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entry Action Declaration</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.EntryActionDeclaration#getEntryActionDeclaration()
   * @see #getEntryActionDeclaration()
   * @generated
   */
  EReference getEntryActionDeclaration_EntryActionDeclaration();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.ActionVariableDeclaration <em>Action Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Variable Declaration</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.ActionVariableDeclaration
   * @generated
   */
  EClass getActionVariableDeclaration();

  /**
   * Returns the meta object for the attribute '{@link de.cau.kieler.scc.model.scctext.sccexp.ActionVariableDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.ActionVariableDeclaration#getName()
   * @see #getActionVariableDeclaration()
   * @generated
   */
  EAttribute getActionVariableDeclaration_Name();

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
   * Returns the meta object for the containment reference list '{@link de.cau.kieler.scc.model.scctext.sccexp.SuspendDeclaration#getSuspendDeclaration <em>Suspend Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Suspend Declaration</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.SuspendDeclaration#getSuspendDeclaration()
   * @see #getSuspendDeclaration()
   * @generated
   */
  EReference getSuspendDeclaration_SuspendDeclaration();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.SuspendVariableDeclaration <em>Suspend Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Suspend Variable Declaration</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.SuspendVariableDeclaration
   * @generated
   */
  EClass getSuspendVariableDeclaration();

  /**
   * Returns the meta object for the attribute '{@link de.cau.kieler.scc.model.scctext.sccexp.SuspendVariableDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.SuspendVariableDeclaration#getName()
   * @see #getSuspendVariableDeclaration()
   * @generated
   */
  EAttribute getSuspendVariableDeclaration_Name();

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
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.Local <em>Local</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.Local
   * @generated
   */
  EClass getLocal();

  /**
   * Returns the meta object for the attribute '{@link de.cau.kieler.scc.model.scctext.sccexp.Local#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.Local#getName()
   * @see #getLocal()
   * @generated
   */
  EAttribute getLocal_Name();

  /**
   * Returns the meta object for the reference '{@link de.cau.kieler.scc.model.scctext.sccexp.Local#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.Local#getType()
   * @see #getLocal()
   * @generated
   */
  EReference getLocal_Type();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.kieler.scc.model.scctext.sccexp.Local#getInitialValue <em>Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initial Value</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.Local#getInitialValue()
   * @see #getLocal()
   * @generated
   */
  EReference getLocal_InitialValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.kieler.scc.model.scctext.sccexp.Local#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.Local#getOperator()
   * @see #getLocal()
   * @generated
   */
  EAttribute getLocal_Operator();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.Input
   * @generated
   */
  EClass getInput();

  /**
   * Returns the meta object for the attribute '{@link de.cau.kieler.scc.model.scctext.sccexp.Input#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.Input#getName()
   * @see #getInput()
   * @generated
   */
  EAttribute getInput_Name();

  /**
   * Returns the meta object for the reference '{@link de.cau.kieler.scc.model.scctext.sccexp.Input#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.Input#getType()
   * @see #getInput()
   * @generated
   */
  EReference getInput_Type();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.kieler.scc.model.scctext.sccexp.Input#getInitialValue <em>Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initial Value</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.Input#getInitialValue()
   * @see #getInput()
   * @generated
   */
  EReference getInput_InitialValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.kieler.scc.model.scctext.sccexp.Input#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.Input#getOperator()
   * @see #getInput()
   * @generated
   */
  EAttribute getInput_Operator();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.Output <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.Output
   * @generated
   */
  EClass getOutput();

  /**
   * Returns the meta object for the attribute '{@link de.cau.kieler.scc.model.scctext.sccexp.Output#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.Output#getName()
   * @see #getOutput()
   * @generated
   */
  EAttribute getOutput_Name();

  /**
   * Returns the meta object for the reference '{@link de.cau.kieler.scc.model.scctext.sccexp.Output#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.Output#getType()
   * @see #getOutput()
   * @generated
   */
  EReference getOutput_Type();

  /**
   * Returns the meta object for the attribute '{@link de.cau.kieler.scc.model.scctext.sccexp.Output#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.Output#getOperator()
   * @see #getOutput()
   * @generated
   */
  EAttribute getOutput_Operator();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.scc.model.scctext.sccexp.InOut <em>In Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Out</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.InOut
   * @generated
   */
  EClass getInOut();

  /**
   * Returns the meta object for the attribute '{@link de.cau.kieler.scc.model.scctext.sccexp.InOut#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.InOut#getName()
   * @see #getInOut()
   * @generated
   */
  EAttribute getInOut_Name();

  /**
   * Returns the meta object for the reference '{@link de.cau.kieler.scc.model.scctext.sccexp.InOut#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.InOut#getType()
   * @see #getInOut()
   * @generated
   */
  EReference getInOut_Type();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.kieler.scc.model.scctext.sccexp.InOut#getInitialValue <em>Initial Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initial Value</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.InOut#getInitialValue()
   * @see #getInOut()
   * @generated
   */
  EReference getInOut_InitialValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.kieler.scc.model.scctext.sccexp.InOut#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.InOut#getOperator()
   * @see #getInOut()
   * @generated
   */
  EAttribute getInOut_Operator();

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
   * Returns the meta object for enum '{@link de.cau.kieler.scc.model.scctext.sccexp.CombineOperator <em>Combine Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Combine Operator</em>'.
   * @see de.cau.kieler.scc.model.scctext.sccexp.CombineOperator
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
     * The meta object literal for the '<em><b>Declaration</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_DECLARATION__DECLARATION = eINSTANCE.getInterfaceDeclaration_Declaration();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.SCCVariableDeclarationImpl <em>SCC Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SCCVariableDeclarationImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getSCCVariableDeclaration()
     * @generated
     */
    EClass SCC_VARIABLE_DECLARATION = eINSTANCE.getSCCVariableDeclaration();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.LocalVariableDeclarationImpl <em>Local Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.LocalVariableDeclarationImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getLocalVariableDeclaration()
     * @generated
     */
    EClass LOCAL_VARIABLE_DECLARATION = eINSTANCE.getLocalVariableDeclaration();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.InOutVariableDeclarationImpl <em>In Out Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.InOutVariableDeclarationImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getInOutVariableDeclaration()
     * @generated
     */
    EClass IN_OUT_VARIABLE_DECLARATION = eINSTANCE.getInOutVariableDeclaration();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.OutputVariableeclarationImpl <em>Output Variableeclaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.OutputVariableeclarationImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getOutputVariableeclaration()
     * @generated
     */
    EClass OUTPUT_VARIABLEECLARATION = eINSTANCE.getOutputVariableeclaration();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.InputVariableDeclarationImpl <em>Input Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.InputVariableDeclarationImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getInputVariableDeclaration()
     * @generated
     */
    EClass INPUT_VARIABLE_DECLARATION = eINSTANCE.getInputVariableDeclaration();

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
     * The meta object literal for the '<em><b>Exit Action Declaration</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXIT_ACTION_DECLARATION__EXIT_ACTION_DECLARATION = eINSTANCE.getExitActionDeclaration_ExitActionDeclaration();

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
     * The meta object literal for the '<em><b>Inside Action Declaration</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSIDE_ACTION_DECLARATION__INSIDE_ACTION_DECLARATION = eINSTANCE.getInsideActionDeclaration_InsideActionDeclaration();

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
     * The meta object literal for the '<em><b>Entry Action Declaration</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTRY_ACTION_DECLARATION__ENTRY_ACTION_DECLARATION = eINSTANCE.getEntryActionDeclaration_EntryActionDeclaration();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.ActionVariableDeclarationImpl <em>Action Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.ActionVariableDeclarationImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getActionVariableDeclaration()
     * @generated
     */
    EClass ACTION_VARIABLE_DECLARATION = eINSTANCE.getActionVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_VARIABLE_DECLARATION__NAME = eINSTANCE.getActionVariableDeclaration_Name();

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
     * The meta object literal for the '<em><b>Suspend Declaration</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUSPEND_DECLARATION__SUSPEND_DECLARATION = eINSTANCE.getSuspendDeclaration_SuspendDeclaration();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.SuspendVariableDeclarationImpl <em>Suspend Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SuspendVariableDeclarationImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getSuspendVariableDeclaration()
     * @generated
     */
    EClass SUSPEND_VARIABLE_DECLARATION = eINSTANCE.getSuspendVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUSPEND_VARIABLE_DECLARATION__NAME = eINSTANCE.getSuspendVariableDeclaration_Name();

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
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.LocalImpl <em>Local</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.LocalImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getLocal()
     * @generated
     */
    EClass LOCAL = eINSTANCE.getLocal();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL__NAME = eINSTANCE.getLocal_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL__TYPE = eINSTANCE.getLocal_Type();

    /**
     * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL__INITIAL_VALUE = eINSTANCE.getLocal_InitialValue();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL__OPERATOR = eINSTANCE.getLocal_Operator();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.InputImpl <em>Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.InputImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getInput()
     * @generated
     */
    EClass INPUT = eINSTANCE.getInput();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT__NAME = eINSTANCE.getInput_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__TYPE = eINSTANCE.getInput_Type();

    /**
     * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__INITIAL_VALUE = eINSTANCE.getInput_InitialValue();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT__OPERATOR = eINSTANCE.getInput_Operator();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.OutputImpl <em>Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.OutputImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getOutput()
     * @generated
     */
    EClass OUTPUT = eINSTANCE.getOutput();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT__NAME = eINSTANCE.getOutput_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT__TYPE = eINSTANCE.getOutput_Type();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT__OPERATOR = eINSTANCE.getOutput_Operator();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.InOutImpl <em>In Out</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.InOutImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getInOut()
     * @generated
     */
    EClass IN_OUT = eINSTANCE.getInOut();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IN_OUT__NAME = eINSTANCE.getInOut_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_OUT__TYPE = eINSTANCE.getInOut_Type();

    /**
     * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_OUT__INITIAL_VALUE = eINSTANCE.getInOut_InitialValue();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IN_OUT__OPERATOR = eINSTANCE.getInOut_Operator();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.impl.MyTriggerImpl <em>My Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.MyTriggerImpl
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getMyTrigger()
     * @generated
     */
    EClass MY_TRIGGER = eINSTANCE.getMyTrigger();

    /**
     * The meta object literal for the '{@link de.cau.kieler.scc.model.scctext.sccexp.CombineOperator <em>Combine Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.scc.model.scctext.sccexp.CombineOperator
     * @see de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpPackageImpl#getCombineOperator()
     * @generated
     */
    EEnum COMBINE_OPERATOR = eINSTANCE.getCombineOperator();

  }

} //SccexpPackage
