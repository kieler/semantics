/**
 */
package de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.impl;

import de.cau.cs.kieler.yakindu.model.stext.synctext.SynctextPackage;

import de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.EventDefinition;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.SCChartsExpFactory;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.SCChartsExpPackage;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.SignalDefinition;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.VariableDefinition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
  public EAttribute getVariableDefinition_IsInput()
  {
    return (EAttribute)variableDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDefinition_IsOutput()
  {
    return (EAttribute)variableDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDefinition_IsStatic()
  {
    return (EAttribute)variableDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDefinition_VarCombineOperator()
  {
    return (EAttribute)variableDefinitionEClass.getEStructuralFeatures().get(3);
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
    signalDefinitionEClass = createEClass(SIGNAL_DEFINITION);

    variableDefinitionEClass = createEClass(VARIABLE_DEFINITION);
    createEAttribute(variableDefinitionEClass, VARIABLE_DEFINITION__IS_INPUT);
    createEAttribute(variableDefinitionEClass, VARIABLE_DEFINITION__IS_OUTPUT);
    createEAttribute(variableDefinitionEClass, VARIABLE_DEFINITION__IS_STATIC);
    createEAttribute(variableDefinitionEClass, VARIABLE_DEFINITION__VAR_COMBINE_OPERATOR);

    eventDefinitionEClass = createEClass(EVENT_DEFINITION);
    createEAttribute(eventDefinitionEClass, EVENT_DEFINITION__IS_INPUT);
    createEAttribute(eventDefinitionEClass, EVENT_DEFINITION__IS_OUTPUT);
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
    signalDefinitionEClass.getESuperTypes().add(theSynctextPackage.getSignalDefinition());
    variableDefinitionEClass.getESuperTypes().add(theSynctextPackage.getVariableDefinition());
    eventDefinitionEClass.getESuperTypes().add(this.getSignalDefinition());

    // Initialize classes and features; add operations and parameters
    initEClass(signalDefinitionEClass, SignalDefinition.class, "SignalDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variableDefinitionEClass, VariableDefinition.class, "VariableDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableDefinition_IsInput(), ecorePackage.getEBoolean(), "isInput", null, 0, 1, VariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDefinition_IsOutput(), ecorePackage.getEBoolean(), "isOutput", null, 0, 1, VariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDefinition_IsStatic(), ecorePackage.getEBoolean(), "isStatic", null, 0, 1, VariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDefinition_VarCombineOperator(), theSynctextPackage.getCombineOperator(), "varCombineOperator", null, 0, 1, VariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventDefinitionEClass, EventDefinition.class, "EventDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEventDefinition_IsInput(), ecorePackage.getEBoolean(), "isInput", null, 0, 1, EventDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEventDefinition_IsOutput(), ecorePackage.getEBoolean(), "isOutput", null, 0, 1, EventDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SCChartsExpPackageImpl
