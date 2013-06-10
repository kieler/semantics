/**
 */
package de.cau.cs.kieler.yakindu.model.stext.synctext;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.yakindu.model.stext.synctext.SynctextPackage
 * @generated
 */
public interface SynctextFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SynctextFactory eINSTANCE = de.cau.cs.kieler.yakindu.model.stext.synctext.impl.SynctextFactoryImpl.init();

  /**
   * Returns a new object of class '<em>State Scope</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Scope</em>'.
   * @generated
   */
  StateScope createStateScope();

  /**
   * Returns a new object of class '<em>Signal Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signal Definition</em>'.
   * @generated
   */
  SignalDefinition createSignalDefinition();

  /**
   * Returns a new object of class '<em>Variable Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Definition</em>'.
   * @generated
   */
  VariableDefinition createVariableDefinition();

  /**
   * Returns a new object of class '<em>Operation Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation Definition</em>'.
   * @generated
   */
  OperationDefinition createOperationDefinition();

  /**
   * Returns a new object of class '<em>Local Reaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Reaction</em>'.
   * @generated
   */
  LocalReaction createLocalReaction();

  /**
   * Returns a new object of class '<em>State Reaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Reaction</em>'.
   * @generated
   */
  StateReaction createStateReaction();

  /**
   * Returns a new object of class '<em>Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entry</em>'.
   * @generated
   */
  Entry createEntry();

  /**
   * Returns a new object of class '<em>Inside</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inside</em>'.
   * @generated
   */
  Inside createInside();

  /**
   * Returns a new object of class '<em>Exit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exit</em>'.
   * @generated
   */
  Exit createExit();

  /**
   * Returns a new object of class '<em>Simple Scope</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Scope</em>'.
   * @generated
   */
  SimpleScope createSimpleScope();

  /**
   * Returns a new object of class '<em>Event Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Definition</em>'.
   * @generated
   */
  EventDefinition createEventDefinition();

  /**
   * Returns a new object of class '<em>Suspend Effect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Suspend Effect</em>'.
   * @generated
   */
  SuspendEffect createSuspendEffect();

  /**
   * Returns a new object of class '<em>Reaction Trigger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reaction Trigger</em>'.
   * @generated
   */
  ReactionTrigger createReactionTrigger();

  /**
   * Returns a new object of class '<em>Reaction Effect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reaction Effect</em>'.
   * @generated
   */
  ReactionEffect createReactionEffect();

  /**
   * Returns a new object of class '<em>Numerical Multiply Divide Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Numerical Multiply Divide Expression</em>'.
   * @generated
   */
  NumericalMultiplyDivideExpression createNumericalMultiplyDivideExpression();

  /**
   * Returns a new object of class '<em>Event Value Reference Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Value Reference Expression</em>'.
   * @generated
   */
  EventValueReferenceExpression createEventValueReferenceExpression();

  /**
   * Returns a new object of class '<em>Pre Value Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pre Value Expression</em>'.
   * @generated
   */
  PreValueExpression createPreValueExpression();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SynctextPackage getSynctextPackage();

} //SynctextFactory
