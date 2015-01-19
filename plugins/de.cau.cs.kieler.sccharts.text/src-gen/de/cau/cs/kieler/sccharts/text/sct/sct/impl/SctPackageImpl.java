/**
 */
package de.cau.cs.kieler.sccharts.text.sct.sct.impl;

import de.cau.cs.kieler.sccharts.SCChartsPackage;

import de.cau.cs.kieler.sccharts.text.sct.sct.ImportDecl;
import de.cau.cs.kieler.sccharts.text.sct.sct.SctFactory;
import de.cau.cs.kieler.sccharts.text.sct.sct.SctPackage;

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
public class SctPackageImpl extends EPackageImpl implements SctPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importDeclEClass = null;

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
   * @see de.cau.cs.kieler.sccharts.text.sct.sct.SctPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SctPackageImpl()
  {
    super(eNS_URI, SctFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SctPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SctPackage init()
  {
    if (isInited) return (SctPackage)EPackage.Registry.INSTANCE.getEPackage(SctPackage.eNS_URI);

    // Obtain or create and register package
    SctPackageImpl theSctPackage = (SctPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SctPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SctPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    SCChartsPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSctPackage.createPackageContents();

    // Initialize created meta-data
    theSctPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSctPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SctPackage.eNS_URI, theSctPackage);
    return theSctPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportDecl()
  {
    return importDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImportDecl_ImportedType()
  {
    return (EReference)importDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportDecl_ImportedNamespace()
  {
    return (EAttribute)importDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SctFactory getSctFactory()
  {
    return (SctFactory)getEFactoryInstance();
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
    importDeclEClass = createEClass(IMPORT_DECL);
    createEReference(importDeclEClass, IMPORT_DECL__IMPORTED_TYPE);
    createEAttribute(importDeclEClass, IMPORT_DECL__IMPORTED_NAMESPACE);
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
    SCChartsPackage theSCChartsPackage = (SCChartsPackage)EPackage.Registry.INSTANCE.getEPackage(SCChartsPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(importDeclEClass, ImportDecl.class, "ImportDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImportDecl_ImportedType(), theSCChartsPackage.getState(), null, "importedType", null, 0, 1, ImportDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImportDecl_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, ImportDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SctPackageImpl
