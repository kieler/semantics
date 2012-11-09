/**
 */
package de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl;

import de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KidsexpFactoryImpl extends EFactoryImpl implements KidsexpFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static KidsexpFactory init()
  {
    try
    {
      KidsexpFactory theKidsexpFactory = (KidsexpFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.cau.de/kieler/synccharts/yakindu/model/reqtext/Kidsexp"); 
      if (theKidsexpFactory != null)
      {
        return theKidsexpFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new KidsexpFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KidsexpFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case KidsexpPackage.ROOT: return createRoot();
      case KidsexpPackage.DEF_ROOT: return createDefRoot();
      case KidsexpPackage.STATECHART_ROOT: return createStatechartRoot();
      case KidsexpPackage.STATE_ROOT: return createStateRoot();
      case KidsexpPackage.TRANSITION_ROOT: return createTransitionRoot();
      case KidsexpPackage.TRANSITION_SPECIFICATION: return createTransitionSpecification();
      case KidsexpPackage.STATECHART_SPECIFICATION: return createStatechartSpecification();
      case KidsexpPackage.STATE_SPECIFICATION: return createStateSpecification();
      case KidsexpPackage.TRANSITION_REACTION: return createTransitionReaction();
      case KidsexpPackage.REACTION_TRIGGER: return createReactionTrigger();
      case KidsexpPackage.REACTION_EFFECT: return createReactionEffect();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Root createRoot()
  {
    RootImpl root = new RootImpl();
    return root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefRoot createDefRoot()
  {
    DefRootImpl defRoot = new DefRootImpl();
    return defRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatechartRoot createStatechartRoot()
  {
    StatechartRootImpl statechartRoot = new StatechartRootImpl();
    return statechartRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateRoot createStateRoot()
  {
    StateRootImpl stateRoot = new StateRootImpl();
    return stateRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionRoot createTransitionRoot()
  {
    TransitionRootImpl transitionRoot = new TransitionRootImpl();
    return transitionRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionSpecification createTransitionSpecification()
  {
    TransitionSpecificationImpl transitionSpecification = new TransitionSpecificationImpl();
    return transitionSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatechartSpecification createStatechartSpecification()
  {
    StatechartSpecificationImpl statechartSpecification = new StatechartSpecificationImpl();
    return statechartSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateSpecification createStateSpecification()
  {
    StateSpecificationImpl stateSpecification = new StateSpecificationImpl();
    return stateSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionReaction createTransitionReaction()
  {
    TransitionReactionImpl transitionReaction = new TransitionReactionImpl();
    return transitionReaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReactionTrigger createReactionTrigger()
  {
    ReactionTriggerImpl reactionTrigger = new ReactionTriggerImpl();
    return reactionTrigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReactionEffect createReactionEffect()
  {
    ReactionEffectImpl reactionEffect = new ReactionEffectImpl();
    return reactionEffect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KidsexpPackage getKidsexpPackage()
  {
    return (KidsexpPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static KidsexpPackage getPackage()
  {
    return KidsexpPackage.eINSTANCE;
  }

} //KidsexpFactoryImpl
