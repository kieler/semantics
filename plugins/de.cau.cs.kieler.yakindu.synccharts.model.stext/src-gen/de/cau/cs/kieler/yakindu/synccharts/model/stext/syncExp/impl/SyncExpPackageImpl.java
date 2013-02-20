/**
 */
package de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.impl;

import de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.SCChartsExpPackage;

import de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.EventDefinition;
import de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.SignalDefinition;
import de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.SyncExpFactory;
import de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.SyncExpPackage;
import de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.VariableDefinition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.yakindu.base.types.TypesPackage;

import org.yakindu.sct.model.stext.stext.StextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SyncExpPackageImpl extends EPackageImpl implements SyncExpPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signalDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventDefinitionEClass = null;

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
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncExp.SyncExpPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SyncExpPackageImpl()
  {
    super(eNS_URI, SyncExpFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SyncExpPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SyncExpPackage init()
  {
    if (isInited) return (SyncExpPackage)EPackage.Registry.INSTANCE.getEPackage(SyncExpPackage.eNS_URI);

    // Obtain or create and register package
    SyncExpPackageImpl theSyncExpPackage = (SyncExpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SyncExpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SyncExpPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    SCChartsExpPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSyncExpPackage.createPackageContents();

    // Initialize created meta-data
    theSyncExpPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSyncExpPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SyncExpPackage.eNS_URI, theSyncExpPackage);
    return theSyncExpPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSignalDefinition()
  {
    return signalDefinitionEClass;
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
  public EReference getVariableDefinition_VarInitialValue()
  {
    return (EReference)variableDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventDefinition()
  {
    return eventDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEventDefinition_IsInput()
  {
    return (EAttribute)eventDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEventDefinition_IsOutput()
  {
    return (EAttribute)eventDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventDefinition_Type()
  {
    return (EReference)eventDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventDefinition_VarInitialValue()
  {
    return (EReference)eventDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEventDefinition_VarCombineOperator()
  {
    return (EAttribute)eventDefinitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SyncExpFactory getSyncExpFactory()
  {
    return (SyncExpFactory)getEFactoryInstance();
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
    signalDefinitionEClass = createEClass(SIGNAL_DEFINITION);

    variableDefinitionEClass = createEClass(VARIABLE_DEFINITION);
    createEReference(variableDefinitionEClass, VARIABLE_DEFINITION__VAR_INITIAL_VALUE);

    eventDefinitionEClass = createEClass(EVENT_DEFINITION);
    createEAttribute(eventDefinitionEClass, EVENT_DEFINITION__IS_INPUT);
    createEAttribute(eventDefinitionEClass, EVENT_DEFINITION__IS_OUTPUT);
    createEReference(eventDefinitionEClass, EVENT_DEFINITION__TYPE);
    createEReference(eventDefinitionEClass, EVENT_DEFINITION__VAR_INITIAL_VALUE);
    createEAttribute(eventDefinitionEClass, EVENT_DEFINITION__VAR_COMBINE_OPERATOR);
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
    SCChartsExpPackage theSCChartsExpPackage = (SCChartsExpPackage)EPackage.Registry.INSTANCE.getEPackage(SCChartsExpPackage.eNS_URI);
    StextPackage theStextPackage = (StextPackage)EPackage.Registry.INSTANCE.getEPackage(StextPackage.eNS_URI);
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    signalDefinitionEClass.getESuperTypes().add(theSCChartsExpPackage.getSignalDefinition());
    variableDefinitionEClass.getESuperTypes().add(theSCChartsExpPackage.getVariableDefinition());
    eventDefinitionEClass.getESuperTypes().add(this.getSignalDefinition());

    // Initialize classes and features; add operations and parameters
    initEClass(signalDefinitionEClass, SignalDefinition.class, "SignalDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variableDefinitionEClass, VariableDefinition.class, "VariableDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableDefinition_VarInitialValue(), theStextPackage.getExpression(), null, "varInitialValue", null, 0, 1, VariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventDefinitionEClass, EventDefinition.class, "EventDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEventDefinition_IsInput(), ecorePackage.getEBoolean(), "isInput", null, 0, 1, EventDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEventDefinition_IsOutput(), ecorePackage.getEBoolean(), "isOutput", null, 0, 1, EventDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEventDefinition_Type(), theTypesPackage.getType(), null, "type", null, 0, 1, EventDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEventDefinition_VarInitialValue(), theStextPackage.getExpression(), null, "varInitialValue", null, 0, 1, EventDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEventDefinition_VarCombineOperator(), theSCChartsExpPackage.getCombineOperator(), "varCombineOperator", null, 0, 1, EventDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SyncExpPackageImpl
