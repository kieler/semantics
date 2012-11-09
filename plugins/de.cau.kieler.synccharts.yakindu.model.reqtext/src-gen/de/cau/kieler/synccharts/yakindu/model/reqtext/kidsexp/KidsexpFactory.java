/**
 */
package de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.KidsexpPackage
 * @generated
 */
public interface KidsexpFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  KidsexpFactory eINSTANCE = de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.KidsexpFactoryImpl.init();

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
   * Returns a new object of class '<em>Statechart Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statechart Root</em>'.
   * @generated
   */
  StatechartRoot createStatechartRoot();

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
   * Returns a new object of class '<em>Transition Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Specification</em>'.
   * @generated
   */
  TransitionSpecification createTransitionSpecification();

  /**
   * Returns a new object of class '<em>Statechart Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statechart Specification</em>'.
   * @generated
   */
  StatechartSpecification createStatechartSpecification();

  /**
   * Returns a new object of class '<em>State Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Specification</em>'.
   * @generated
   */
  StateSpecification createStateSpecification();

  /**
   * Returns a new object of class '<em>Transition Reaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Reaction</em>'.
   * @generated
   */
  TransitionReaction createTransitionReaction();

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
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  KidsexpPackage getKidsexpPackage();

} //KidsexpFactory
