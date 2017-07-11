/**
 */
package de.cau.cs.kieler.esterel.scest.scest.impl;

import de.cau.cs.kieler.esterel.esterel.EsterelPackage;

import de.cau.cs.kieler.esterel.scest.scest.SCEstModule;
import de.cau.cs.kieler.esterel.scest.scest.SCEstProgram;
import de.cau.cs.kieler.esterel.scest.scest.ScestFactory;
import de.cau.cs.kieler.esterel.scest.scest.ScestPackage;
import de.cau.cs.kieler.esterel.scest.scest.Set;
import de.cau.cs.kieler.esterel.scest.scest.UnEmit;

import de.cau.cs.kieler.kexpressions.KExpressionsPackage;

import de.cau.cs.kieler.scl.scl.SclPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScestPackageImpl extends EPackageImpl implements ScestPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scEstProgramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scEstModuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unEmitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setEClass = null;

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
   * @see de.cau.cs.kieler.esterel.scest.scest.ScestPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ScestPackageImpl()
  {
    super(eNS_URI, ScestFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link ScestPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ScestPackage init()
  {
    if (isInited) return (ScestPackage)EPackage.Registry.INSTANCE.getEPackage(ScestPackage.eNS_URI);

    // Obtain or create and register package
    ScestPackageImpl theScestPackage = (ScestPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ScestPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ScestPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    EsterelPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theScestPackage.createPackageContents();

    // Initialize created meta-data
    theScestPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theScestPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ScestPackage.eNS_URI, theScestPackage);
    return theScestPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSCEstProgram()
  {
    return scEstProgramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSCEstModule()
  {
    return scEstModuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSCEstModule_Declarations()
  {
    return (EReference)scEstModuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnEmit()
  {
    return unEmitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnEmit_Signal()
  {
    return (EReference)unEmitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSet()
  {
    return setEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSet_Signal()
  {
    return (EReference)setEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSet_Expression()
  {
    return (EReference)setEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScestFactory getScestFactory()
  {
    return (ScestFactory)getEFactoryInstance();
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
    scEstProgramEClass = createEClass(SC_EST_PROGRAM);

    scEstModuleEClass = createEClass(SC_EST_MODULE);
    createEReference(scEstModuleEClass, SC_EST_MODULE__DECLARATIONS);

    unEmitEClass = createEClass(UN_EMIT);
    createEReference(unEmitEClass, UN_EMIT__SIGNAL);

    setEClass = createEClass(SET);
    createEReference(setEClass, SET__SIGNAL);
    createEReference(setEClass, SET__EXPRESSION);
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
    EsterelPackage theEsterelPackage = (EsterelPackage)EPackage.Registry.INSTANCE.getEPackage(EsterelPackage.eNS_URI);
    KExpressionsPackage theKExpressionsPackage = (KExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(KExpressionsPackage.eNS_URI);
    SclPackage theSclPackage = (SclPackage)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    scEstProgramEClass.getESuperTypes().add(theEsterelPackage.getProgram());
    scEstModuleEClass.getESuperTypes().add(theEsterelPackage.getModule());
    unEmitEClass.getESuperTypes().add(theSclPackage.getStatement());
    setEClass.getESuperTypes().add(theSclPackage.getStatement());

    // Initialize classes and features; add operations and parameters
    initEClass(scEstProgramEClass, SCEstProgram.class, "SCEstProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(scEstModuleEClass, SCEstModule.class, "SCEstModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSCEstModule_Declarations(), theKExpressionsPackage.getDeclaration(), null, "declarations", null, 0, -1, SCEstModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unEmitEClass, UnEmit.class, "UnEmit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnEmit_Signal(), theEsterelPackage.getISignal(), null, "signal", null, 0, 1, UnEmit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setEClass, Set.class, "Set", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSet_Signal(), theEsterelPackage.getISignal(), null, "signal", null, 0, 1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSet_Expression(), theKExpressionsPackage.getExpression(), null, "expression", null, 0, 1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //ScestPackageImpl
