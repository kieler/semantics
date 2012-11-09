/**
 */
package de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.impl;

import de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.DefRoot;
import de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.KidsexpFactory;
import de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.KidsexpPackage;
import de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.ReactionEffect;
import de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.ReactionTrigger;
import de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.Root;
import de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.StateRoot;
import de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.StateSpecification;
import de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.StatechartRoot;
import de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.StatechartSpecification;
import de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.TransitionReaction;
import de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.TransitionRoot;
import de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.TransitionSpecification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.yakindu.sct.model.sgraph.SGraphPackage;

import org.yakindu.sct.model.stext.stext.StextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KidsexpPackageImpl extends EPackageImpl implements KidsexpPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statechartRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statechartSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionReactionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reactionTriggerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reactionEffectEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.cau.kieler.synccharts.yakindu.model.reqtext.kidsexp.KidsexpPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private KidsexpPackageImpl()
  {
    super(eNS_URI, KidsexpFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link KidsexpPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static KidsexpPackage init()
  {
    if (isInited) return (KidsexpPackage)EPackage.Registry.INSTANCE.getEPackage(KidsexpPackage.eNS_URI);

    // Obtain or create and register package
    KidsexpPackageImpl theKidsexpPackage = (KidsexpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KidsexpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KidsexpPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    StextPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theKidsexpPackage.createPackageContents();

    // Initialize created meta-data
    theKidsexpPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theKidsexpPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(KidsexpPackage.eNS_URI, theKidsexpPackage);
    return theKidsexpPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRoot()
  {
    return rootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefRoot()
  {
    return defRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatechartRoot()
  {
    return statechartRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateRoot()
  {
    return stateRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionRoot()
  {
    return transitionRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionSpecification()
  {
    return transitionSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatechartSpecification()
  {
    return statechartSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateSpecification()
  {
    return stateSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionReaction()
  {
    return transitionReactionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReactionTrigger()
  {
    return reactionTriggerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReactionEffect()
  {
    return reactionEffectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KidsexpFactory getKidsexpFactory()
  {
    return (KidsexpFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    rootEClass = createEClass(ROOT);

    defRootEClass = createEClass(DEF_ROOT);

    statechartRootEClass = createEClass(STATECHART_ROOT);

    stateRootEClass = createEClass(STATE_ROOT);

    transitionRootEClass = createEClass(TRANSITION_ROOT);

    transitionSpecificationEClass = createEClass(TRANSITION_SPECIFICATION);

    statechartSpecificationEClass = createEClass(STATECHART_SPECIFICATION);

    stateSpecificationEClass = createEClass(STATE_SPECIFICATION);

    transitionReactionEClass = createEClass(TRANSITION_REACTION);

    reactionTriggerEClass = createEClass(REACTION_TRIGGER);

    reactionEffectEClass = createEClass(REACTION_EFFECT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    StextPackage theStextPackage = (StextPackage)EPackage.Registry.INSTANCE.getEPackage(StextPackage.eNS_URI);
    SGraphPackage theSGraphPackage = (SGraphPackage)EPackage.Registry.INSTANCE.getEPackage(SGraphPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    rootEClass.getESuperTypes().add(theStextPackage.getRoot());
    defRootEClass.getESuperTypes().add(theStextPackage.getDefRoot());
    statechartRootEClass.getESuperTypes().add(this.getDefRoot());
    statechartRootEClass.getESuperTypes().add(theStextPackage.getStatechartRoot());
    stateRootEClass.getESuperTypes().add(this.getDefRoot());
    stateRootEClass.getESuperTypes().add(theStextPackage.getStateRoot());
    transitionRootEClass.getESuperTypes().add(this.getDefRoot());
    transitionRootEClass.getESuperTypes().add(theStextPackage.getTransitionRoot());
    transitionSpecificationEClass.getESuperTypes().add(theStextPackage.getTransitionSpecification());
    statechartSpecificationEClass.getESuperTypes().add(theStextPackage.getStatechartSpecification());
    stateSpecificationEClass.getESuperTypes().add(theStextPackage.getStateSpecification());
    transitionReactionEClass.getESuperTypes().add(theStextPackage.getTransitionReaction());
    reactionTriggerEClass.getESuperTypes().add(theSGraphPackage.getTrigger());
    reactionEffectEClass.getESuperTypes().add(theSGraphPackage.getEffect());

    // Initialize classes and features; add operations and parameters
    initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(defRootEClass, DefRoot.class, "DefRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(statechartRootEClass, StatechartRoot.class, "StatechartRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stateRootEClass, StateRoot.class, "StateRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(transitionRootEClass, TransitionRoot.class, "TransitionRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(transitionSpecificationEClass, TransitionSpecification.class, "TransitionSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(statechartSpecificationEClass, StatechartSpecification.class, "StatechartSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stateSpecificationEClass, StateSpecification.class, "StateSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(transitionReactionEClass, TransitionReaction.class, "TransitionReaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(reactionTriggerEClass, ReactionTrigger.class, "ReactionTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(reactionEffectEClass, ReactionEffect.class, "ReactionEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //KidsexpPackageImpl
