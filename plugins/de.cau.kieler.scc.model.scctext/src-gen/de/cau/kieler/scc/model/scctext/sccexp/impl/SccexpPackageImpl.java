/**
 */
package de.cau.kieler.scc.model.scctext.sccexp.impl;

import de.cau.kieler.scc.model.scctext.sccexp.ActionDeclaration;
import de.cau.kieler.scc.model.scctext.sccexp.DefRoot;
import de.cau.kieler.scc.model.scctext.sccexp.EntryActionDeclaration;
import de.cau.kieler.scc.model.scctext.sccexp.ExitActionDeclaration;
import de.cau.kieler.scc.model.scctext.sccexp.InsideActionDeclaration;
import de.cau.kieler.scc.model.scctext.sccexp.InterfaceDeclaration;
import de.cau.kieler.scc.model.scctext.sccexp.InterfaceScope;
import de.cau.kieler.scc.model.scctext.sccexp.InterfaceScopeRoot;
import de.cau.kieler.scc.model.scctext.sccexp.MyTrigger;
import de.cau.kieler.scc.model.scctext.sccexp.Root;
import de.cau.kieler.scc.model.scctext.sccexp.SccexpFactory;
import de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage;
import de.cau.kieler.scc.model.scctext.sccexp.StateRoot;
import de.cau.kieler.scc.model.scctext.sccexp.StateScope;
import de.cau.kieler.scc.model.scctext.sccexp.SuspendDeclaration;
import de.cau.kieler.scc.model.scctext.sccexp.TransitionReaction;
import de.cau.kieler.scc.model.scctext.sccexp.TransitionRoot;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.yakindu.sct.model.sgraph.SGraphPackage;

import org.yakindu.sct.model.stext.stext.StextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SccexpPackageImpl extends EPackageImpl implements SccexpPackage
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
  private EClass stateScopeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceScopeRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceScopeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exitActionDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass insideActionDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entryActionDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass suspendDeclarationEClass = null;

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
  private EClass myTriggerEClass = null;

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
   * @see de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SccexpPackageImpl()
  {
    super(eNS_URI, SccexpFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SccexpPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SccexpPackage init()
  {
    if (isInited) return (SccexpPackage)EPackage.Registry.INSTANCE.getEPackage(SccexpPackage.eNS_URI);

    // Obtain or create and register package
    SccexpPackageImpl theSccexpPackage = (SccexpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SccexpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SccexpPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    StextPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSccexpPackage.createPackageContents();

    // Initialize created meta-data
    theSccexpPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSccexpPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SccexpPackage.eNS_URI, theSccexpPackage);
    return theSccexpPackage;
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
  public EClass getStateScope()
  {
    return stateScopeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceScopeRoot()
  {
    return interfaceScopeRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceScopeRoot_InterfaceScope()
  {
    return (EReference)interfaceScopeRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceScope()
  {
    return interfaceScopeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceDeclaration()
  {
    return interfaceDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionDeclaration()
  {
    return actionDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExitActionDeclaration()
  {
    return exitActionDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInsideActionDeclaration()
  {
    return insideActionDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntryActionDeclaration()
  {
    return entryActionDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSuspendDeclaration()
  {
    return suspendDeclarationEClass;
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
  public EClass getMyTrigger()
  {
    return myTriggerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SccexpFactory getSccexpFactory()
  {
    return (SccexpFactory)getEFactoryInstance();
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

    stateRootEClass = createEClass(STATE_ROOT);

    transitionRootEClass = createEClass(TRANSITION_ROOT);

    stateScopeEClass = createEClass(STATE_SCOPE);

    interfaceScopeRootEClass = createEClass(INTERFACE_SCOPE_ROOT);
    createEReference(interfaceScopeRootEClass, INTERFACE_SCOPE_ROOT__INTERFACE_SCOPE);

    interfaceScopeEClass = createEClass(INTERFACE_SCOPE);

    interfaceDeclarationEClass = createEClass(INTERFACE_DECLARATION);

    actionDeclarationEClass = createEClass(ACTION_DECLARATION);

    exitActionDeclarationEClass = createEClass(EXIT_ACTION_DECLARATION);

    insideActionDeclarationEClass = createEClass(INSIDE_ACTION_DECLARATION);

    entryActionDeclarationEClass = createEClass(ENTRY_ACTION_DECLARATION);

    suspendDeclarationEClass = createEClass(SUSPEND_DECLARATION);

    transitionReactionEClass = createEClass(TRANSITION_REACTION);

    myTriggerEClass = createEClass(MY_TRIGGER);
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
    stateRootEClass.getESuperTypes().add(this.getDefRoot());
    stateRootEClass.getESuperTypes().add(theStextPackage.getStateRoot());
    transitionRootEClass.getESuperTypes().add(this.getDefRoot());
    transitionRootEClass.getESuperTypes().add(theStextPackage.getTransitionRoot());
    stateScopeEClass.getESuperTypes().add(theSGraphPackage.getScope());
    interfaceScopeRootEClass.getESuperTypes().add(this.getStateScope());
    interfaceScopeEClass.getESuperTypes().add(theStextPackage.getInterfaceScope());
    interfaceDeclarationEClass.getESuperTypes().add(this.getInterfaceScope());
    actionDeclarationEClass.getESuperTypes().add(this.getInterfaceScope());
    exitActionDeclarationEClass.getESuperTypes().add(this.getActionDeclaration());
    insideActionDeclarationEClass.getESuperTypes().add(this.getActionDeclaration());
    entryActionDeclarationEClass.getESuperTypes().add(this.getActionDeclaration());
    suspendDeclarationEClass.getESuperTypes().add(this.getInterfaceScope());
    transitionReactionEClass.getESuperTypes().add(theStextPackage.getTransitionReaction());
    myTriggerEClass.getESuperTypes().add(theSGraphPackage.getTrigger());

    // Initialize classes and features; add operations and parameters
    initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(defRootEClass, DefRoot.class, "DefRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stateRootEClass, StateRoot.class, "StateRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(transitionRootEClass, TransitionRoot.class, "TransitionRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stateScopeEClass, StateScope.class, "StateScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interfaceScopeRootEClass, InterfaceScopeRoot.class, "InterfaceScopeRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterfaceScopeRoot_InterfaceScope(), this.getInterfaceScope(), null, "interfaceScope", null, 0, -1, InterfaceScopeRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceScopeEClass, InterfaceScope.class, "InterfaceScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interfaceDeclarationEClass, InterfaceDeclaration.class, "InterfaceDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(actionDeclarationEClass, ActionDeclaration.class, "ActionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exitActionDeclarationEClass, ExitActionDeclaration.class, "ExitActionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(insideActionDeclarationEClass, InsideActionDeclaration.class, "InsideActionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(entryActionDeclarationEClass, EntryActionDeclaration.class, "EntryActionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(suspendDeclarationEClass, SuspendDeclaration.class, "SuspendDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(transitionReactionEClass, TransitionReaction.class, "TransitionReaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(myTriggerEClass, MyTrigger.class, "MyTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //SccexpPackageImpl
