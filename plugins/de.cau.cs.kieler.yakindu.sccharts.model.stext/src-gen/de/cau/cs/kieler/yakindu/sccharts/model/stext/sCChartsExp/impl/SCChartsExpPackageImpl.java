/**
 */
package de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.impl;

import de.cau.cs.kieler.yakindu.model.stext.synctext.SynctextPackage;

import de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.Dummy;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.SCChartsExpFactory;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.SCChartsExpPackage;

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
public class SCChartsExpPackageImpl extends EPackageImpl implements SCChartsExpPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dummyEClass = null;

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
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.SCChartsExpPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SCChartsExpPackageImpl()
  {
    super(eNS_URI, SCChartsExpFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SCChartsExpPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SCChartsExpPackage init()
  {
    if (isInited) return (SCChartsExpPackage)EPackage.Registry.INSTANCE.getEPackage(SCChartsExpPackage.eNS_URI);

    // Obtain or create and register package
    SCChartsExpPackageImpl theSCChartsExpPackage = (SCChartsExpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SCChartsExpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SCChartsExpPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    SynctextPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSCChartsExpPackage.createPackageContents();

    // Initialize created meta-data
    theSCChartsExpPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSCChartsExpPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SCChartsExpPackage.eNS_URI, theSCChartsExpPackage);
    return theSCChartsExpPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDummy()
  {
    return dummyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDummy_VariableDefinition()
  {
    return (EReference)dummyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SCChartsExpFactory getSCChartsExpFactory()
  {
    return (SCChartsExpFactory)getEFactoryInstance();
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
    dummyEClass = createEClass(DUMMY);
    createEReference(dummyEClass, DUMMY__VARIABLE_DEFINITION);
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
    SynctextPackage theSynctextPackage = (SynctextPackage)EPackage.Registry.INSTANCE.getEPackage(SynctextPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(dummyEClass, Dummy.class, "Dummy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDummy_VariableDefinition(), theSynctextPackage.getVariableDefinition(), null, "variableDefinition", null, 0, 1, Dummy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SCChartsExpPackageImpl
