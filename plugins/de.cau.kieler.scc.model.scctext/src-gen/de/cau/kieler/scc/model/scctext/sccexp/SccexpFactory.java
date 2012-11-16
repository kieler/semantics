/**
 */
package de.cau.kieler.scc.model.scctext.sccexp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage
 * @generated
 */
public interface SccexpFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SccexpFactory eINSTANCE = de.cau.kieler.scc.model.scctext.sccexp.impl.SccexpFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Root</em>'.
   * @generated
   */
  Root createRoot();

  /**
   * Returns a new object of class '<em>Def Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Def Root</em>'.
   * @generated
   */
  DefRoot createDefRoot();

  /**
   * Returns a new object of class '<em>State Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Root</em>'.
   * @generated
   */
  StateRoot createStateRoot();

  /**
   * Returns a new object of class '<em>Transition Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Root</em>'.
   * @generated
   */
  TransitionRoot createTransitionRoot();

  /**
   * Returns a new object of class '<em>State Scope</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Scope</em>'.
   * @generated
   */
  StateScope createStateScope();

  /**
   * Returns a new object of class '<em>Interface Scope Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Scope Root</em>'.
   * @generated
   */
  InterfaceScopeRoot createInterfaceScopeRoot();

  /**
   * Returns a new object of class '<em>Interface Scope</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Scope</em>'.
   * @generated
   */
  InterfaceScope createInterfaceScope();

  /**
   * Returns a new object of class '<em>Interface Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Declaration</em>'.
   * @generated
   */
  InterfaceDeclaration createInterfaceDeclaration();

  /**
   * Returns a new object of class '<em>SCC Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SCC Variable Declaration</em>'.
   * @generated
   */
  SCCVariableDeclaration createSCCVariableDeclaration();

  /**
   * Returns a new object of class '<em>Local Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Variable Declaration</em>'.
   * @generated
   */
  LocalVariableDeclaration createLocalVariableDeclaration();

  /**
   * Returns a new object of class '<em>In Out Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In Out Variable Declaration</em>'.
   * @generated
   */
  InOutVariableDeclaration createInOutVariableDeclaration();

  /**
   * Returns a new object of class '<em>Output Variableeclaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Variableeclaration</em>'.
   * @generated
   */
  OutputVariableeclaration createOutputVariableeclaration();

  /**
   * Returns a new object of class '<em>Input Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Variable Declaration</em>'.
   * @generated
   */
  InputVariableDeclaration createInputVariableDeclaration();

  /**
   * Returns a new object of class '<em>Action Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Declaration</em>'.
   * @generated
   */
  ActionDeclaration createActionDeclaration();

  /**
   * Returns a new object of class '<em>Exit Action Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exit Action Declaration</em>'.
   * @generated
   */
  ExitActionDeclaration createExitActionDeclaration();

  /**
   * Returns a new object of class '<em>Inside Action Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inside Action Declaration</em>'.
   * @generated
   */
  InsideActionDeclaration createInsideActionDeclaration();

  /**
   * Returns a new object of class '<em>Entry Action Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entry Action Declaration</em>'.
   * @generated
   */
  EntryActionDeclaration createEntryActionDeclaration();

  /**
   * Returns a new object of class '<em>Action Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Variable Declaration</em>'.
   * @generated
   */
  ActionVariableDeclaration createActionVariableDeclaration();

  /**
   * Returns a new object of class '<em>Suspend Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Suspend Declaration</em>'.
   * @generated
   */
  SuspendDeclaration createSuspendDeclaration();

  /**
   * Returns a new object of class '<em>Suspend Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Suspend Variable Declaration</em>'.
   * @generated
   */
  SuspendVariableDeclaration createSuspendVariableDeclaration();

  /**
   * Returns a new object of class '<em>Transition Reaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Reaction</em>'.
   * @generated
   */
  TransitionReaction createTransitionReaction();

  /**
   * Returns a new object of class '<em>Local</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local</em>'.
   * @generated
   */
  Local createLocal();

  /**
   * Returns a new object of class '<em>Input</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input</em>'.
   * @generated
   */
  Input createInput();

  /**
   * Returns a new object of class '<em>Output</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output</em>'.
   * @generated
   */
  Output createOutput();

  /**
   * Returns a new object of class '<em>In Out</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In Out</em>'.
   * @generated
   */
  InOut createInOut();

  /**
   * Returns a new object of class '<em>My Trigger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>My Trigger</em>'.
   * @generated
   */
  MyTrigger createMyTrigger();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SccexpPackage getSccexpPackage();

} //SccexpFactory
