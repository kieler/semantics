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
   * Returns a new object of class '<em>State Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Specification</em>'.
   * @generated
   */
  StateSpecification createStateSpecification();

  /**
   * Returns a new object of class '<em>Interface Scope</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Scope</em>'.
   * @generated
   */
  InterfaceScope createInterfaceScope();

  /**
   * Returns a new object of class '<em>Variable Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Definition</em>'.
   * @generated
   */
  VariableDefinition createVariableDefinition();

  /**
   * Returns a new object of class '<em>Reaction Scope</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reaction Scope</em>'.
   * @generated
   */
  ReactionScope createReactionScope();

  /**
   * Returns a new object of class '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition</em>'.
   * @generated
   */
  Transition createTransition();

  /**
   * Returns a new object of class '<em>Exit Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exit Action</em>'.
   * @generated
   */
  ExitAction createExitAction();

  /**
   * Returns a new object of class '<em>Inside Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inside Action</em>'.
   * @generated
   */
  InsideAction createInsideAction();

  /**
   * Returns a new object of class '<em>Entry Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entry Action</em>'.
   * @generated
   */
  EntryAction createEntryAction();

  /**
   * Returns a new object of class '<em>Suspend</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Suspend</em>'.
   * @generated
   */
  Suspend createSuspend();

  /**
   * Returns a new object of class '<em>Trigger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trigger</em>'.
   * @generated
   */
  Trigger createTrigger();

  /**
   * Returns a new object of class '<em>Effect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Effect</em>'.
   * @generated
   */
  Effect createEffect();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SccexpPackage getSccexpPackage();

} //SccexpFactory
