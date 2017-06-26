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

import org.eclipse.emf.ecore.EAttribute;
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
  public EReference getSCEstProgram_Modules()
  {
    return (EReference)scEstProgramEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getSCEstModule_Name()
  {
    return (EAttribute)scEstModuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSCEstModule_IntSignalDecls()
  {
    return (EReference)scEstModuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSCEstModule_IntTypeDecls()
  {
    return (EReference)scEstModuleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSCEstModule_IntSensorDecls()
  {
    return (EReference)scEstModuleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSCEstModule_IntConstantDecls()
  {
    return (EReference)scEstModuleEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSCEstModule_IntRelationDecls()
  {
    return (EReference)scEstModuleEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSCEstModule_IntTaskDecls()
  {
    return (EReference)scEstModuleEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSCEstModule_IntFunctionDecls()
  {
    return (EReference)scEstModuleEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSCEstModule_IntProcedureDecls()
  {
    return (EReference)scEstModuleEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSCEstModule_Declarations()
  {
    return (EReference)scEstModuleEClass.getEStructuralFeatures().get(9);
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
  public EReference getSet_Expr()
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
    createEReference(scEstProgramEClass, SC_EST_PROGRAM__MODULES);

    scEstModuleEClass = createEClass(SC_EST_MODULE);
    createEAttribute(scEstModuleEClass, SC_EST_MODULE__NAME);
    createEReference(scEstModuleEClass, SC_EST_MODULE__INT_SIGNAL_DECLS);
    createEReference(scEstModuleEClass, SC_EST_MODULE__INT_TYPE_DECLS);
    createEReference(scEstModuleEClass, SC_EST_MODULE__INT_SENSOR_DECLS);
    createEReference(scEstModuleEClass, SC_EST_MODULE__INT_CONSTANT_DECLS);
    createEReference(scEstModuleEClass, SC_EST_MODULE__INT_RELATION_DECLS);
    createEReference(scEstModuleEClass, SC_EST_MODULE__INT_TASK_DECLS);
    createEReference(scEstModuleEClass, SC_EST_MODULE__INT_FUNCTION_DECLS);
    createEReference(scEstModuleEClass, SC_EST_MODULE__INT_PROCEDURE_DECLS);
    createEReference(scEstModuleEClass, SC_EST_MODULE__DECLARATIONS);

    unEmitEClass = createEClass(UN_EMIT);
    createEReference(unEmitEClass, UN_EMIT__SIGNAL);

    setEClass = createEClass(SET);
    createEReference(setEClass, SET__SIGNAL);
    createEReference(setEClass, SET__EXPR);
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
    SclPackage theSclPackage = (SclPackage)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI);
    EsterelPackage theEsterelPackage = (EsterelPackage)EPackage.Registry.INSTANCE.getEPackage(EsterelPackage.eNS_URI);
    KExpressionsPackage theKExpressionsPackage = (KExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(KExpressionsPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    scEstModuleEClass.getESuperTypes().add(theSclPackage.getStatementContainer());
    unEmitEClass.getESuperTypes().add(theSclPackage.getStatement());
    setEClass.getESuperTypes().add(theSclPackage.getStatement());

    // Initialize classes and features; add operations and parameters
    initEClass(scEstProgramEClass, SCEstProgram.class, "SCEstProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSCEstProgram_Modules(), this.getSCEstModule(), null, "modules", null, 0, -1, SCEstProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scEstModuleEClass, SCEstModule.class, "SCEstModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSCEstModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, SCEstModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSCEstModule_IntSignalDecls(), theEsterelPackage.getInterfaceSignalDecl(), null, "intSignalDecls", null, 0, -1, SCEstModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSCEstModule_IntTypeDecls(), theEsterelPackage.getTypeDecl(), null, "intTypeDecls", null, 0, -1, SCEstModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSCEstModule_IntSensorDecls(), theEsterelPackage.getSensorDecl(), null, "intSensorDecls", null, 0, -1, SCEstModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSCEstModule_IntConstantDecls(), theEsterelPackage.getConstantDecls(), null, "intConstantDecls", null, 0, -1, SCEstModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSCEstModule_IntRelationDecls(), theEsterelPackage.getRelationDecl(), null, "intRelationDecls", null, 0, -1, SCEstModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSCEstModule_IntTaskDecls(), theEsterelPackage.getTaskDecl(), null, "intTaskDecls", null, 0, -1, SCEstModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSCEstModule_IntFunctionDecls(), theEsterelPackage.getFunctionDecl(), null, "intFunctionDecls", null, 0, -1, SCEstModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSCEstModule_IntProcedureDecls(), theEsterelPackage.getProcedureDecl(), null, "intProcedureDecls", null, 0, -1, SCEstModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSCEstModule_Declarations(), theKExpressionsPackage.getDeclaration(), null, "declarations", null, 0, -1, SCEstModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unEmitEClass, UnEmit.class, "UnEmit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnEmit_Signal(), theEsterelPackage.getISignal(), null, "signal", null, 0, 1, UnEmit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setEClass, Set.class, "Set", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSet_Signal(), theEsterelPackage.getISignal(), null, "signal", null, 0, 1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSet_Expr(), theKExpressionsPackage.getExpression(), null, "expr", null, 0, 1, Set.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //ScestPackageImpl
