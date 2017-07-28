/**
 */
package de.cau.cs.kieler.simulation.kisim.impl;

import de.cau.cs.kieler.prom.kibuild.KibuildPackage;

import de.cau.cs.kieler.simulation.kisim.Action;
import de.cau.cs.kieler.simulation.kisim.ActionOperation;
import de.cau.cs.kieler.simulation.kisim.DataHandlerConfiguration;
import de.cau.cs.kieler.simulation.kisim.Execution;
import de.cau.cs.kieler.simulation.kisim.Initialization;
import de.cau.cs.kieler.simulation.kisim.KisimFactory;
import de.cau.cs.kieler.simulation.kisim.KisimPackage;
import de.cau.cs.kieler.simulation.kisim.SimulationConfiguration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KisimPackageImpl extends EPackageImpl implements KisimPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simulationConfigurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataHandlerConfigurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initializationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass executionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum actionOperationEEnum = null;

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
   * @see de.cau.cs.kieler.simulation.kisim.KisimPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private KisimPackageImpl()
  {
    super(eNS_URI, KisimFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link KisimPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static KisimPackage init()
  {
    if (isInited) return (KisimPackage)EPackage.Registry.INSTANCE.getEPackage(KisimPackage.eNS_URI);

    // Obtain or create and register package
    KisimPackageImpl theKisimPackage = (KisimPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KisimPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KisimPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    KibuildPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theKisimPackage.createPackageContents();

    // Initialize created meta-data
    theKisimPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theKisimPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(KisimPackage.eNS_URI, theKisimPackage);
    return theKisimPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimulationConfiguration()
  {
    return simulationConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimulationConfiguration_Attributes()
  {
    return (EReference)simulationConfigurationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimulationConfiguration_Handlers()
  {
    return (EReference)simulationConfigurationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimulationConfiguration_Initialization()
  {
    return (EReference)simulationConfigurationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimulationConfiguration_Execution()
  {
    return (EReference)simulationConfigurationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataHandlerConfiguration()
  {
    return dataHandlerConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataHandlerConfiguration_Name()
  {
    return (EAttribute)dataHandlerConfigurationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataHandlerConfiguration_Id()
  {
    return (EAttribute)dataHandlerConfigurationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataHandlerConfiguration_Attributes()
  {
    return (EReference)dataHandlerConfigurationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInitialization()
  {
    return initializationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInitialization_Actions()
  {
    return (EReference)initializationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExecution()
  {
    return executionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecution_Actions()
  {
    return (EReference)executionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAction()
  {
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAction_Operation()
  {
    return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAction_Handler()
  {
    return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAction_Id()
  {
    return (EAttribute)actionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getActionOperation()
  {
    return actionOperationEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KisimFactory getKisimFactory()
  {
    return (KisimFactory)getEFactoryInstance();
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
    simulationConfigurationEClass = createEClass(SIMULATION_CONFIGURATION);
    createEReference(simulationConfigurationEClass, SIMULATION_CONFIGURATION__ATTRIBUTES);
    createEReference(simulationConfigurationEClass, SIMULATION_CONFIGURATION__HANDLERS);
    createEReference(simulationConfigurationEClass, SIMULATION_CONFIGURATION__INITIALIZATION);
    createEReference(simulationConfigurationEClass, SIMULATION_CONFIGURATION__EXECUTION);

    dataHandlerConfigurationEClass = createEClass(DATA_HANDLER_CONFIGURATION);
    createEAttribute(dataHandlerConfigurationEClass, DATA_HANDLER_CONFIGURATION__NAME);
    createEAttribute(dataHandlerConfigurationEClass, DATA_HANDLER_CONFIGURATION__ID);
    createEReference(dataHandlerConfigurationEClass, DATA_HANDLER_CONFIGURATION__ATTRIBUTES);

    initializationEClass = createEClass(INITIALIZATION);
    createEReference(initializationEClass, INITIALIZATION__ACTIONS);

    executionEClass = createEClass(EXECUTION);
    createEReference(executionEClass, EXECUTION__ACTIONS);

    actionEClass = createEClass(ACTION);
    createEAttribute(actionEClass, ACTION__OPERATION);
    createEAttribute(actionEClass, ACTION__HANDLER);
    createEAttribute(actionEClass, ACTION__ID);

    // Create enums
    actionOperationEEnum = createEEnum(ACTION_OPERATION);
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
    KibuildPackage theKibuildPackage = (KibuildPackage)EPackage.Registry.INSTANCE.getEPackage(KibuildPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(simulationConfigurationEClass, SimulationConfiguration.class, "SimulationConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSimulationConfiguration_Attributes(), theKibuildPackage.getAttributeMapping(), null, "attributes", null, 0, -1, SimulationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimulationConfiguration_Handlers(), this.getDataHandlerConfiguration(), null, "handlers", null, 0, -1, SimulationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimulationConfiguration_Initialization(), this.getInitialization(), null, "initialization", null, 0, 1, SimulationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimulationConfiguration_Execution(), this.getExecution(), null, "execution", null, 0, 1, SimulationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataHandlerConfigurationEClass, DataHandlerConfiguration.class, "DataHandlerConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataHandlerConfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataHandlerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDataHandlerConfiguration_Id(), ecorePackage.getEString(), "id", null, 0, 1, DataHandlerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataHandlerConfiguration_Attributes(), theKibuildPackage.getAttributeMapping(), null, "attributes", null, 0, -1, DataHandlerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(initializationEClass, Initialization.class, "Initialization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInitialization_Actions(), this.getAction(), null, "actions", null, 0, -1, Initialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(executionEClass, Execution.class, "Execution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExecution_Actions(), this.getAction(), null, "actions", null, 0, -1, Execution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAction_Operation(), this.getActionOperation(), "operation", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAction_Handler(), ecorePackage.getEString(), "handler", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAction_Id(), ecorePackage.getEString(), "id", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(actionOperationEEnum, ActionOperation.class, "ActionOperation");
    addEEnumLiteral(actionOperationEEnum, ActionOperation.WRITE);
    addEEnumLiteral(actionOperationEEnum, ActionOperation.READ);

    // Create resource
    createResource(eNS_URI);
  }

} //KisimPackageImpl
