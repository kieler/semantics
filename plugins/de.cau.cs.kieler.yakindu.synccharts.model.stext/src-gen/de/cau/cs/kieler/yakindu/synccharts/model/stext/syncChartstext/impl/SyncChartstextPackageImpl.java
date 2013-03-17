/**
 */
package de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.impl;

import de.cau.cs.kieler.yakindu.model.stext.synctext.SynctextPackage;

import de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.SyncChartstextFactory;
import de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.SyncChartstextPackage;
import de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.VariableDefinition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.yakindu.sct.model.stext.stext.StextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SyncChartstextPackageImpl extends EPackageImpl implements SyncChartstextPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDefinitionEClass = null;

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
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.SyncChartstextPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SyncChartstextPackageImpl()
  {
    super(eNS_URI, SyncChartstextFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SyncChartstextPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SyncChartstextPackage init()
  {
    if (isInited) return (SyncChartstextPackage)EPackage.Registry.INSTANCE.getEPackage(SyncChartstextPackage.eNS_URI);

    // Obtain or create and register package
    SyncChartstextPackageImpl theSyncChartstextPackage = (SyncChartstextPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SyncChartstextPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SyncChartstextPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    SynctextPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSyncChartstextPackage.createPackageContents();

    // Initialize created meta-data
    theSyncChartstextPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSyncChartstextPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SyncChartstextPackage.eNS_URI, theSyncChartstextPackage);
    return theSyncChartstextPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDefinition()
  {
    return variableDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDefinition_IsStatic()
  {
    return (EAttribute)variableDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDefinition_VarInitialValue()
  {
    return (EReference)variableDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SyncChartstextFactory getSyncChartstextFactory()
  {
    return (SyncChartstextFactory)getEFactoryInstance();
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
    variableDefinitionEClass = createEClass(VARIABLE_DEFINITION);
    createEAttribute(variableDefinitionEClass, VARIABLE_DEFINITION__IS_STATIC);
    createEReference(variableDefinitionEClass, VARIABLE_DEFINITION__VAR_INITIAL_VALUE);
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
    StextPackage theStextPackage = (StextPackage)EPackage.Registry.INSTANCE.getEPackage(StextPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    variableDefinitionEClass.getESuperTypes().add(theSynctextPackage.getVariableDefinition());

    // Initialize classes and features; add operations and parameters
    initEClass(variableDefinitionEClass, VariableDefinition.class, "VariableDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableDefinition_IsStatic(), ecorePackage.getEBoolean(), "isStatic", null, 0, 1, VariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableDefinition_VarInitialValue(), theStextPackage.getExpression(), null, "varInitialValue", null, 0, 1, VariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SyncChartstextPackageImpl
