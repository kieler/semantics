/**
 */
package de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.SccexpPackage
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
  SccexpFactory eINSTANCE = de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.impl.SccexpFactoryImpl.init();

  /**
   * Returns a new object of class '<em>State Scope</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Scope</em>'.
   * @generated
   */
  StateScope createStateScope();

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
   * Returns a new object of class '<em>Simple Scope</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Scope</em>'.
   * @generated
   */
  SimpleScope createSimpleScope();

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
   * Returns a new object of class '<em>Reaction Trigger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reaction Trigger</em>'.
   * @generated
   */
  ReactionTrigger createReactionTrigger();

  /**
   * Returns a new object of class '<em>Pre Value Expressionreturns</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pre Value Expressionreturns</em>'.
   * @generated
   */
  PreValueExpressionreturns createPreValueExpressionreturns();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SccexpPackage getSccexpPackage();

} //SccexpFactory
