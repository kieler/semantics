/**
 */
package de.cau.kieler.scc.model.scctext.sccexp.impl;

import de.cau.kieler.scc.model.scctext.sccexp.ActionDeclaration;
import de.cau.kieler.scc.model.scctext.sccexp.ActionVariableDeclaration;
import de.cau.kieler.scc.model.scctext.sccexp.CombineOperator;
import de.cau.kieler.scc.model.scctext.sccexp.DefRoot;
import de.cau.kieler.scc.model.scctext.sccexp.EntryActionDeclaration;
import de.cau.kieler.scc.model.scctext.sccexp.ExitActionDeclaration;
import de.cau.kieler.scc.model.scctext.sccexp.InOut;
import de.cau.kieler.scc.model.scctext.sccexp.InOutVariableDeclaration;
import de.cau.kieler.scc.model.scctext.sccexp.Input;
import de.cau.kieler.scc.model.scctext.sccexp.InputVariableDeclaration;
import de.cau.kieler.scc.model.scctext.sccexp.InsideActionDeclaration;
import de.cau.kieler.scc.model.scctext.sccexp.InterfaceDeclaration;
import de.cau.kieler.scc.model.scctext.sccexp.InterfaceScope;
import de.cau.kieler.scc.model.scctext.sccexp.InterfaceScopeRoot;
import de.cau.kieler.scc.model.scctext.sccexp.Local;
import de.cau.kieler.scc.model.scctext.sccexp.LocalVariableDeclaration;
import de.cau.kieler.scc.model.scctext.sccexp.MyTrigger;
import de.cau.kieler.scc.model.scctext.sccexp.Output;
import de.cau.kieler.scc.model.scctext.sccexp.OutputVariableeclaration;
import de.cau.kieler.scc.model.scctext.sccexp.Root;
import de.cau.kieler.scc.model.scctext.sccexp.SCCVariableDeclaration;
import de.cau.kieler.scc.model.scctext.sccexp.SccexpFactory;
import de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage;
import de.cau.kieler.scc.model.scctext.sccexp.StateRoot;
import de.cau.kieler.scc.model.scctext.sccexp.StateScope;
import de.cau.kieler.scc.model.scctext.sccexp.SuspendDeclaration;
import de.cau.kieler.scc.model.scctext.sccexp.SuspendVariableDeclaration;
import de.cau.kieler.scc.model.scctext.sccexp.TransitionReaction;
import de.cau.kieler.scc.model.scctext.sccexp.TransitionRoot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.yakindu.base.types.TypesPackage;

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
  private EClass sccVariableDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localVariableDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inOutVariableDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputVariableeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputVariableDeclarationEClass = null;

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
  private EClass actionVariableDeclarationEClass = null;

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
  private EClass suspendVariableDeclarationEClass = null;

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
  private EClass localEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inOutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass myTriggerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum combineOperatorEEnum = null;

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
  public EReference getInterfaceDeclaration_Declaration()
  {
    return (EReference)interfaceDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSCCVariableDeclaration()
  {
    return sccVariableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalVariableDeclaration()
  {
    return localVariableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInOutVariableDeclaration()
  {
    return inOutVariableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutputVariableeclaration()
  {
    return outputVariableeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInputVariableDeclaration()
  {
    return inputVariableDeclarationEClass;
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
  public EReference getExitActionDeclaration_ExitActionDeclaration()
  {
    return (EReference)exitActionDeclarationEClass.getEStructuralFeatures().get(0);
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
  public EReference getInsideActionDeclaration_InsideActionDeclaration()
  {
    return (EReference)insideActionDeclarationEClass.getEStructuralFeatures().get(0);
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
  public EReference getEntryActionDeclaration_EntryActionDeclaration()
  {
    return (EReference)entryActionDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionVariableDeclaration()
  {
    return actionVariableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionVariableDeclaration_Name()
  {
    return (EAttribute)actionVariableDeclarationEClass.getEStructuralFeatures().get(0);
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
  public EReference getSuspendDeclaration_SuspendDeclaration()
  {
    return (EReference)suspendDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSuspendVariableDeclaration()
  {
    return suspendVariableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSuspendVariableDeclaration_Name()
  {
    return (EAttribute)suspendVariableDeclarationEClass.getEStructuralFeatures().get(0);
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
  public EClass getLocal()
  {
    return localEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocal_Name()
  {
    return (EAttribute)localEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocal_Type()
  {
    return (EReference)localEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocal_InitialValue()
  {
    return (EReference)localEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocal_Operator()
  {
    return (EAttribute)localEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInput()
  {
    return inputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInput_Name()
  {
    return (EAttribute)inputEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInput_Type()
  {
    return (EReference)inputEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInput_InitialValue()
  {
    return (EReference)inputEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInput_Operator()
  {
    return (EAttribute)inputEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutput()
  {
    return outputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutput_Name()
  {
    return (EAttribute)outputEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutput_Type()
  {
    return (EReference)outputEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutput_Operator()
  {
    return (EAttribute)outputEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInOut()
  {
    return inOutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInOut_Name()
  {
    return (EAttribute)inOutEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInOut_Type()
  {
    return (EReference)inOutEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInOut_InitialValue()
  {
    return (EReference)inOutEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInOut_Operator()
  {
    return (EAttribute)inOutEClass.getEStructuralFeatures().get(3);
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
  public EEnum getCombineOperator()
  {
    return combineOperatorEEnum;
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
    createEReference(interfaceDeclarationEClass, INTERFACE_DECLARATION__DECLARATION);

    sccVariableDeclarationEClass = createEClass(SCC_VARIABLE_DECLARATION);

    localVariableDeclarationEClass = createEClass(LOCAL_VARIABLE_DECLARATION);

    inOutVariableDeclarationEClass = createEClass(IN_OUT_VARIABLE_DECLARATION);

    outputVariableeclarationEClass = createEClass(OUTPUT_VARIABLEECLARATION);

    inputVariableDeclarationEClass = createEClass(INPUT_VARIABLE_DECLARATION);

    actionDeclarationEClass = createEClass(ACTION_DECLARATION);

    exitActionDeclarationEClass = createEClass(EXIT_ACTION_DECLARATION);
    createEReference(exitActionDeclarationEClass, EXIT_ACTION_DECLARATION__EXIT_ACTION_DECLARATION);

    insideActionDeclarationEClass = createEClass(INSIDE_ACTION_DECLARATION);
    createEReference(insideActionDeclarationEClass, INSIDE_ACTION_DECLARATION__INSIDE_ACTION_DECLARATION);

    entryActionDeclarationEClass = createEClass(ENTRY_ACTION_DECLARATION);
    createEReference(entryActionDeclarationEClass, ENTRY_ACTION_DECLARATION__ENTRY_ACTION_DECLARATION);

    actionVariableDeclarationEClass = createEClass(ACTION_VARIABLE_DECLARATION);
    createEAttribute(actionVariableDeclarationEClass, ACTION_VARIABLE_DECLARATION__NAME);

    suspendDeclarationEClass = createEClass(SUSPEND_DECLARATION);
    createEReference(suspendDeclarationEClass, SUSPEND_DECLARATION__SUSPEND_DECLARATION);

    suspendVariableDeclarationEClass = createEClass(SUSPEND_VARIABLE_DECLARATION);
    createEAttribute(suspendVariableDeclarationEClass, SUSPEND_VARIABLE_DECLARATION__NAME);

    transitionReactionEClass = createEClass(TRANSITION_REACTION);

    localEClass = createEClass(LOCAL);
    createEAttribute(localEClass, LOCAL__NAME);
    createEReference(localEClass, LOCAL__TYPE);
    createEReference(localEClass, LOCAL__INITIAL_VALUE);
    createEAttribute(localEClass, LOCAL__OPERATOR);

    inputEClass = createEClass(INPUT);
    createEAttribute(inputEClass, INPUT__NAME);
    createEReference(inputEClass, INPUT__TYPE);
    createEReference(inputEClass, INPUT__INITIAL_VALUE);
    createEAttribute(inputEClass, INPUT__OPERATOR);

    outputEClass = createEClass(OUTPUT);
    createEAttribute(outputEClass, OUTPUT__NAME);
    createEReference(outputEClass, OUTPUT__TYPE);
    createEAttribute(outputEClass, OUTPUT__OPERATOR);

    inOutEClass = createEClass(IN_OUT);
    createEAttribute(inOutEClass, IN_OUT__NAME);
    createEReference(inOutEClass, IN_OUT__TYPE);
    createEReference(inOutEClass, IN_OUT__INITIAL_VALUE);
    createEAttribute(inOutEClass, IN_OUT__OPERATOR);

    myTriggerEClass = createEClass(MY_TRIGGER);

    // Create enums
    combineOperatorEEnum = createEEnum(COMBINE_OPERATOR);
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
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

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
    localVariableDeclarationEClass.getESuperTypes().add(this.getSCCVariableDeclaration());
    inOutVariableDeclarationEClass.getESuperTypes().add(this.getSCCVariableDeclaration());
    outputVariableeclarationEClass.getESuperTypes().add(this.getSCCVariableDeclaration());
    inputVariableDeclarationEClass.getESuperTypes().add(this.getSCCVariableDeclaration());
    actionDeclarationEClass.getESuperTypes().add(this.getInterfaceScope());
    exitActionDeclarationEClass.getESuperTypes().add(this.getActionDeclaration());
    insideActionDeclarationEClass.getESuperTypes().add(this.getActionDeclaration());
    entryActionDeclarationEClass.getESuperTypes().add(this.getActionDeclaration());
    suspendDeclarationEClass.getESuperTypes().add(this.getInterfaceScope());
    transitionReactionEClass.getESuperTypes().add(theStextPackage.getTransitionReaction());
    localEClass.getESuperTypes().add(this.getLocalVariableDeclaration());
    inputEClass.getESuperTypes().add(this.getInOutVariableDeclaration());
    outputEClass.getESuperTypes().add(this.getOutputVariableeclaration());
    inOutEClass.getESuperTypes().add(this.getInputVariableDeclaration());
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
    initEReference(getInterfaceDeclaration_Declaration(), this.getSCCVariableDeclaration(), null, "declaration", null, 0, -1, InterfaceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sccVariableDeclarationEClass, SCCVariableDeclaration.class, "SCCVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(localVariableDeclarationEClass, LocalVariableDeclaration.class, "LocalVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inOutVariableDeclarationEClass, InOutVariableDeclaration.class, "InOutVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(outputVariableeclarationEClass, OutputVariableeclaration.class, "OutputVariableeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inputVariableDeclarationEClass, InputVariableDeclaration.class, "InputVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(actionDeclarationEClass, ActionDeclaration.class, "ActionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exitActionDeclarationEClass, ExitActionDeclaration.class, "ExitActionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExitActionDeclaration_ExitActionDeclaration(), this.getActionVariableDeclaration(), null, "exitActionDeclaration", null, 0, -1, ExitActionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(insideActionDeclarationEClass, InsideActionDeclaration.class, "InsideActionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInsideActionDeclaration_InsideActionDeclaration(), this.getActionVariableDeclaration(), null, "insideActionDeclaration", null, 0, -1, InsideActionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entryActionDeclarationEClass, EntryActionDeclaration.class, "EntryActionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntryActionDeclaration_EntryActionDeclaration(), this.getActionVariableDeclaration(), null, "entryActionDeclaration", null, 0, -1, EntryActionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionVariableDeclarationEClass, ActionVariableDeclaration.class, "ActionVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActionVariableDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActionVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(suspendDeclarationEClass, SuspendDeclaration.class, "SuspendDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSuspendDeclaration_SuspendDeclaration(), this.getSuspendVariableDeclaration(), null, "suspendDeclaration", null, 0, -1, SuspendDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(suspendVariableDeclarationEClass, SuspendVariableDeclaration.class, "SuspendVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSuspendVariableDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, SuspendVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionReactionEClass, TransitionReaction.class, "TransitionReaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(localEClass, Local.class, "Local", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLocal_Name(), ecorePackage.getEString(), "name", null, 0, 1, Local.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLocal_Type(), theTypesPackage.getType(), null, "type", null, 0, 1, Local.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLocal_InitialValue(), theStextPackage.getExpression(), null, "initialValue", null, 0, 1, Local.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLocal_Operator(), this.getCombineOperator(), "operator", null, 0, 1, Local.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInput_Name(), ecorePackage.getEString(), "name", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInput_Type(), theTypesPackage.getType(), null, "type", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInput_InitialValue(), theStextPackage.getExpression(), null, "initialValue", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInput_Operator(), this.getCombineOperator(), "operator", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOutput_Name(), ecorePackage.getEString(), "name", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutput_Type(), theTypesPackage.getType(), null, "type", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOutput_Operator(), this.getCombineOperator(), "operator", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inOutEClass, InOut.class, "InOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInOut_Name(), ecorePackage.getEString(), "name", null, 0, 1, InOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInOut_Type(), theTypesPackage.getType(), null, "type", null, 0, 1, InOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInOut_InitialValue(), theStextPackage.getExpression(), null, "initialValue", null, 0, 1, InOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInOut_Operator(), this.getCombineOperator(), "operator", null, 0, 1, InOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(myTriggerEClass, MyTrigger.class, "MyTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(combineOperatorEEnum, CombineOperator.class, "CombineOperator");
    addEEnumLiteral(combineOperatorEEnum, CombineOperator.NONE);
    addEEnumLiteral(combineOperatorEEnum, CombineOperator.ADD);
    addEEnumLiteral(combineOperatorEEnum, CombineOperator.MULT);
    addEEnumLiteral(combineOperatorEEnum, CombineOperator.MAX);
    addEEnumLiteral(combineOperatorEEnum, CombineOperator.MIN);
    addEEnumLiteral(combineOperatorEEnum, CombineOperator.OR);
    addEEnumLiteral(combineOperatorEEnum, CombineOperator.AND);
    addEEnumLiteral(combineOperatorEEnum, CombineOperator.HOST);

    // Create resource
    createResource(eNS_URI);
  }

} //SccexpPackageImpl
