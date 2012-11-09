/**
 */
package de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.KidsexpFactory
 * @model kind="package"
 * @generated
 */
public interface KidsexpPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "kidsexp";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cau.de/kieler/synccharts/yakindu/model/reqtext/Kidsexp";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "kidsexp";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  KidsexpPackage eINSTANCE = de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.KidsexpPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.RootImpl <em>Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.RootImpl
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.KidsexpPackageImpl#getRoot()
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
   * The meta object id for the '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.DefRootImpl <em>Def Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.DefRootImpl
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.KidsexpPackageImpl#getDefRoot()
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
   * The meta object id for the '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.StatechartRootImpl <em>Statechart Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.StatechartRootImpl
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.KidsexpPackageImpl#getStatechartRoot()
   * @generated
   */
  int STATECHART_ROOT = 2;

  /**
   * The feature id for the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATECHART_ROOT__DEF = DEF_ROOT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Statechart Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATECHART_ROOT_FEATURE_COUNT = DEF_ROOT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.StateRootImpl <em>State Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.StateRootImpl
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.KidsexpPackageImpl#getStateRoot()
   * @generated
   */
  int STATE_ROOT = 3;

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
   * The meta object id for the '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.TransitionRootImpl <em>Transition Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.TransitionRootImpl
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.KidsexpPackageImpl#getTransitionRoot()
   * @generated
   */
  int TRANSITION_ROOT = 4;

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
   * The meta object id for the '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.TransitionSpecificationImpl <em>Transition Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.TransitionSpecificationImpl
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.KidsexpPackageImpl#getTransitionSpecification()
   * @generated
   */
  int TRANSITION_SPECIFICATION = 5;

  /**
   * The feature id for the '<em><b>Reaction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_SPECIFICATION__REACTION = StextPackage.TRANSITION_SPECIFICATION__REACTION;

  /**
   * The number of structural features of the '<em>Transition Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_SPECIFICATION_FEATURE_COUNT = StextPackage.TRANSITION_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.StatechartSpecificationImpl <em>Statechart Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.StatechartSpecificationImpl
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.KidsexpPackageImpl#getStatechartSpecification()
   * @generated
   */
  int STATECHART_SPECIFICATION = 6;

  /**
   * The feature id for the '<em><b>Scopes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATECHART_SPECIFICATION__SCOPES = StextPackage.STATECHART_SPECIFICATION__SCOPES;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATECHART_SPECIFICATION__NAMESPACE = StextPackage.STATECHART_SPECIFICATION__NAMESPACE;

  /**
   * The number of structural features of the '<em>Statechart Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATECHART_SPECIFICATION_FEATURE_COUNT = StextPackage.STATECHART_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.StateSpecificationImpl <em>State Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.StateSpecificationImpl
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.KidsexpPackageImpl#getStateSpecification()
   * @generated
   */
  int STATE_SPECIFICATION = 7;

  /**
   * The feature id for the '<em><b>Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_SPECIFICATION__SCOPE = StextPackage.STATE_SPECIFICATION__SCOPE;

  /**
   * The number of structural features of the '<em>State Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_SPECIFICATION_FEATURE_COUNT = StextPackage.STATE_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.TransitionReactionImpl <em>Transition Reaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.TransitionReactionImpl
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.KidsexpPackageImpl#getTransitionReaction()
   * @generated
   */
  int TRANSITION_REACTION = 8;

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
   * The meta object id for the '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.ReactionTriggerImpl <em>Reaction Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.ReactionTriggerImpl
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.KidsexpPackageImpl#getReactionTrigger()
   * @generated
   */
  int REACTION_TRIGGER = 9;

  /**
   * The number of structural features of the '<em>Reaction Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_TRIGGER_FEATURE_COUNT = SGraphPackage.TRIGGER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.ReactionEffectImpl <em>Reaction Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.ReactionEffectImpl
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.KidsexpPackageImpl#getReactionEffect()
   * @generated
   */
  int REACTION_EFFECT = 10;

  /**
   * The number of structural features of the '<em>Reaction Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACTION_EFFECT_FEATURE_COUNT = SGraphPackage.EFFECT_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.Root <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Root</em>'.
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.Root
   * @generated
   */
  EClass getRoot();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.DefRoot <em>Def Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Def Root</em>'.
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.DefRoot
   * @generated
   */
  EClass getDefRoot();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.StatechartRoot <em>Statechart Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statechart Root</em>'.
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.StatechartRoot
   * @generated
   */
  EClass getStatechartRoot();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.StateRoot <em>State Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Root</em>'.
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.StateRoot
   * @generated
   */
  EClass getStateRoot();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.TransitionRoot <em>Transition Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Root</em>'.
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.TransitionRoot
   * @generated
   */
  EClass getTransitionRoot();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.TransitionSpecification <em>Transition Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Specification</em>'.
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.TransitionSpecification
   * @generated
   */
  EClass getTransitionSpecification();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.StatechartSpecification <em>Statechart Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statechart Specification</em>'.
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.StatechartSpecification
   * @generated
   */
  EClass getStatechartSpecification();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.StateSpecification <em>State Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Specification</em>'.
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.StateSpecification
   * @generated
   */
  EClass getStateSpecification();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.TransitionReaction <em>Transition Reaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Reaction</em>'.
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.TransitionReaction
   * @generated
   */
  EClass getTransitionReaction();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.ReactionTrigger <em>Reaction Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reaction Trigger</em>'.
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.ReactionTrigger
   * @generated
   */
  EClass getReactionTrigger();

  /**
   * Returns the meta object for class '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.ReactionEffect <em>Reaction Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reaction Effect</em>'.
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.ReactionEffect
   * @generated
   */
  EClass getReactionEffect();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  KidsexpFactory getKidsexpFactory();

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
     * The meta object literal for the '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.RootImpl <em>Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.RootImpl
     * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.KidsexpPackageImpl#getRoot()
     * @generated
     */
    EClass ROOT = eINSTANCE.getRoot();

    /**
     * The meta object literal for the '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.DefRootImpl <em>Def Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.DefRootImpl
     * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.KidsexpPackageImpl#getDefRoot()
     * @generated
     */
    EClass DEF_ROOT = eINSTANCE.getDefRoot();

    /**
     * The meta object literal for the '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.StatechartRootImpl <em>Statechart Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.StatechartRootImpl
     * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.KidsexpPackageImpl#getStatechartRoot()
     * @generated
     */
    EClass STATECHART_ROOT = eINSTANCE.getStatechartRoot();

    /**
     * The meta object literal for the '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.StateRootImpl <em>State Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.StateRootImpl
     * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.KidsexpPackageImpl#getStateRoot()
     * @generated
     */
    EClass STATE_ROOT = eINSTANCE.getStateRoot();

    /**
     * The meta object literal for the '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.TransitionRootImpl <em>Transition Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.TransitionRootImpl
     * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.KidsexpPackageImpl#getTransitionRoot()
     * @generated
     */
    EClass TRANSITION_ROOT = eINSTANCE.getTransitionRoot();

    /**
     * The meta object literal for the '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.TransitionSpecificationImpl <em>Transition Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.TransitionSpecificationImpl
     * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.KidsexpPackageImpl#getTransitionSpecification()
     * @generated
     */
    EClass TRANSITION_SPECIFICATION = eINSTANCE.getTransitionSpecification();

    /**
     * The meta object literal for the '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.StatechartSpecificationImpl <em>Statechart Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.StatechartSpecificationImpl
     * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.KidsexpPackageImpl#getStatechartSpecification()
     * @generated
     */
    EClass STATECHART_SPECIFICATION = eINSTANCE.getStatechartSpecification();

    /**
     * The meta object literal for the '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.StateSpecificationImpl <em>State Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.StateSpecificationImpl
     * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.KidsexpPackageImpl#getStateSpecification()
     * @generated
     */
    EClass STATE_SPECIFICATION = eINSTANCE.getStateSpecification();

    /**
     * The meta object literal for the '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.TransitionReactionImpl <em>Transition Reaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.TransitionReactionImpl
     * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.KidsexpPackageImpl#getTransitionReaction()
     * @generated
     */
    EClass TRANSITION_REACTION = eINSTANCE.getTransitionReaction();

    /**
     * The meta object literal for the '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.ReactionTriggerImpl <em>Reaction Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.ReactionTriggerImpl
     * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.KidsexpPackageImpl#getReactionTrigger()
     * @generated
     */
    EClass REACTION_TRIGGER = eINSTANCE.getReactionTrigger();

    /**
     * The meta object literal for the '{@link de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.ReactionEffectImpl <em>Reaction Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.ReactionEffectImpl
     * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl.KidsexpPackageImpl#getReactionEffect()
     * @generated
     */
    EClass REACTION_EFFECT = eINSTANCE.getReactionEffect();

  }

} //KidsexpPackage
