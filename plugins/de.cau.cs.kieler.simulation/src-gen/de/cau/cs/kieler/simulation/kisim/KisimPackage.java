/**
 */
package de.cau.cs.kieler.simulation.kisim;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.simulation.kisim.KisimFactory
 * @model kind="package"
 * @generated
 */
public interface KisimPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "kisim";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cau.de/cs/kieler/simulation/KiSim";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "kisim";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  KisimPackage eINSTANCE = de.cau.cs.kieler.simulation.kisim.impl.KisimPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.simulation.kisim.impl.SimulationConfigurationImpl <em>Simulation Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.simulation.kisim.impl.SimulationConfigurationImpl
   * @see de.cau.cs.kieler.simulation.kisim.impl.KisimPackageImpl#getSimulationConfiguration()
   * @generated
   */
  int SIMULATION_CONFIGURATION = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULATION_CONFIGURATION__ATTRIBUTES = 0;

  /**
   * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULATION_CONFIGURATION__HANDLERS = 1;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULATION_CONFIGURATION__INITIALIZATION = 2;

  /**
   * The feature id for the '<em><b>Execution</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULATION_CONFIGURATION__EXECUTION = 3;

  /**
   * The number of structural features of the '<em>Simulation Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULATION_CONFIGURATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.simulation.kisim.impl.DataHandlerConfigurationImpl <em>Data Handler Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.simulation.kisim.impl.DataHandlerConfigurationImpl
   * @see de.cau.cs.kieler.simulation.kisim.impl.KisimPackageImpl#getDataHandlerConfiguration()
   * @generated
   */
  int DATA_HANDLER_CONFIGURATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_HANDLER_CONFIGURATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_HANDLER_CONFIGURATION__ID = 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_HANDLER_CONFIGURATION__ATTRIBUTES = 2;

  /**
   * The number of structural features of the '<em>Data Handler Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_HANDLER_CONFIGURATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.simulation.kisim.impl.InitializationImpl <em>Initialization</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.simulation.kisim.impl.InitializationImpl
   * @see de.cau.cs.kieler.simulation.kisim.impl.KisimPackageImpl#getInitialization()
   * @generated
   */
  int INITIALIZATION = 2;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZATION__ACTIONS = 0;

  /**
   * The number of structural features of the '<em>Initialization</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.simulation.kisim.impl.ExecutionImpl <em>Execution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.simulation.kisim.impl.ExecutionImpl
   * @see de.cau.cs.kieler.simulation.kisim.impl.KisimPackageImpl#getExecution()
   * @generated
   */
  int EXECUTION = 3;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTION__ACTIONS = 0;

  /**
   * The number of structural features of the '<em>Execution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.simulation.kisim.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.simulation.kisim.impl.ActionImpl
   * @see de.cau.cs.kieler.simulation.kisim.impl.KisimPackageImpl#getAction()
   * @generated
   */
  int ACTION = 4;

  /**
   * The feature id for the '<em><b>Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__OPERATION = 0;

  /**
   * The feature id for the '<em><b>Handler</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__HANDLER = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__ID = 2;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.simulation.kisim.ActionOperation <em>Action Operation</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.simulation.kisim.ActionOperation
   * @see de.cau.cs.kieler.simulation.kisim.impl.KisimPackageImpl#getActionOperation()
   * @generated
   */
  int ACTION_OPERATION = 5;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.simulation.kisim.SimulationConfiguration <em>Simulation Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simulation Configuration</em>'.
   * @see de.cau.cs.kieler.simulation.kisim.SimulationConfiguration
   * @generated
   */
  EClass getSimulationConfiguration();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.simulation.kisim.SimulationConfiguration#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.cau.cs.kieler.simulation.kisim.SimulationConfiguration#getAttributes()
   * @see #getSimulationConfiguration()
   * @generated
   */
  EReference getSimulationConfiguration_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.simulation.kisim.SimulationConfiguration#getHandlers <em>Handlers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Handlers</em>'.
   * @see de.cau.cs.kieler.simulation.kisim.SimulationConfiguration#getHandlers()
   * @see #getSimulationConfiguration()
   * @generated
   */
  EReference getSimulationConfiguration_Handlers();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.simulation.kisim.SimulationConfiguration#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization</em>'.
   * @see de.cau.cs.kieler.simulation.kisim.SimulationConfiguration#getInitialization()
   * @see #getSimulationConfiguration()
   * @generated
   */
  EReference getSimulationConfiguration_Initialization();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.simulation.kisim.SimulationConfiguration#getExecution <em>Execution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Execution</em>'.
   * @see de.cau.cs.kieler.simulation.kisim.SimulationConfiguration#getExecution()
   * @see #getSimulationConfiguration()
   * @generated
   */
  EReference getSimulationConfiguration_Execution();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.simulation.kisim.DataHandlerConfiguration <em>Data Handler Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Handler Configuration</em>'.
   * @see de.cau.cs.kieler.simulation.kisim.DataHandlerConfiguration
   * @generated
   */
  EClass getDataHandlerConfiguration();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.simulation.kisim.DataHandlerConfiguration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.simulation.kisim.DataHandlerConfiguration#getName()
   * @see #getDataHandlerConfiguration()
   * @generated
   */
  EAttribute getDataHandlerConfiguration_Name();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.simulation.kisim.DataHandlerConfiguration#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.cau.cs.kieler.simulation.kisim.DataHandlerConfiguration#getId()
   * @see #getDataHandlerConfiguration()
   * @generated
   */
  EAttribute getDataHandlerConfiguration_Id();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.simulation.kisim.DataHandlerConfiguration#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see de.cau.cs.kieler.simulation.kisim.DataHandlerConfiguration#getAttributes()
   * @see #getDataHandlerConfiguration()
   * @generated
   */
  EReference getDataHandlerConfiguration_Attributes();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.simulation.kisim.Initialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Initialization</em>'.
   * @see de.cau.cs.kieler.simulation.kisim.Initialization
   * @generated
   */
  EClass getInitialization();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.simulation.kisim.Initialization#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see de.cau.cs.kieler.simulation.kisim.Initialization#getActions()
   * @see #getInitialization()
   * @generated
   */
  EReference getInitialization_Actions();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.simulation.kisim.Execution <em>Execution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Execution</em>'.
   * @see de.cau.cs.kieler.simulation.kisim.Execution
   * @generated
   */
  EClass getExecution();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.simulation.kisim.Execution#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see de.cau.cs.kieler.simulation.kisim.Execution#getActions()
   * @see #getExecution()
   * @generated
   */
  EReference getExecution_Actions();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.simulation.kisim.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see de.cau.cs.kieler.simulation.kisim.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.simulation.kisim.Action#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operation</em>'.
   * @see de.cau.cs.kieler.simulation.kisim.Action#getOperation()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Operation();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.simulation.kisim.Action#getHandler <em>Handler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Handler</em>'.
   * @see de.cau.cs.kieler.simulation.kisim.Action#getHandler()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Handler();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.simulation.kisim.Action#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.cau.cs.kieler.simulation.kisim.Action#getId()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Id();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.simulation.kisim.ActionOperation <em>Action Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Action Operation</em>'.
   * @see de.cau.cs.kieler.simulation.kisim.ActionOperation
   * @generated
   */
  EEnum getActionOperation();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  KisimFactory getKisimFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.simulation.kisim.impl.SimulationConfigurationImpl <em>Simulation Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.simulation.kisim.impl.SimulationConfigurationImpl
     * @see de.cau.cs.kieler.simulation.kisim.impl.KisimPackageImpl#getSimulationConfiguration()
     * @generated
     */
    EClass SIMULATION_CONFIGURATION = eINSTANCE.getSimulationConfiguration();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMULATION_CONFIGURATION__ATTRIBUTES = eINSTANCE.getSimulationConfiguration_Attributes();

    /**
     * The meta object literal for the '<em><b>Handlers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMULATION_CONFIGURATION__HANDLERS = eINSTANCE.getSimulationConfiguration_Handlers();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMULATION_CONFIGURATION__INITIALIZATION = eINSTANCE.getSimulationConfiguration_Initialization();

    /**
     * The meta object literal for the '<em><b>Execution</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMULATION_CONFIGURATION__EXECUTION = eINSTANCE.getSimulationConfiguration_Execution();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.simulation.kisim.impl.DataHandlerConfigurationImpl <em>Data Handler Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.simulation.kisim.impl.DataHandlerConfigurationImpl
     * @see de.cau.cs.kieler.simulation.kisim.impl.KisimPackageImpl#getDataHandlerConfiguration()
     * @generated
     */
    EClass DATA_HANDLER_CONFIGURATION = eINSTANCE.getDataHandlerConfiguration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_HANDLER_CONFIGURATION__NAME = eINSTANCE.getDataHandlerConfiguration_Name();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_HANDLER_CONFIGURATION__ID = eINSTANCE.getDataHandlerConfiguration_Id();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_HANDLER_CONFIGURATION__ATTRIBUTES = eINSTANCE.getDataHandlerConfiguration_Attributes();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.simulation.kisim.impl.InitializationImpl <em>Initialization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.simulation.kisim.impl.InitializationImpl
     * @see de.cau.cs.kieler.simulation.kisim.impl.KisimPackageImpl#getInitialization()
     * @generated
     */
    EClass INITIALIZATION = eINSTANCE.getInitialization();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INITIALIZATION__ACTIONS = eINSTANCE.getInitialization_Actions();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.simulation.kisim.impl.ExecutionImpl <em>Execution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.simulation.kisim.impl.ExecutionImpl
     * @see de.cau.cs.kieler.simulation.kisim.impl.KisimPackageImpl#getExecution()
     * @generated
     */
    EClass EXECUTION = eINSTANCE.getExecution();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXECUTION__ACTIONS = eINSTANCE.getExecution_Actions();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.simulation.kisim.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.simulation.kisim.impl.ActionImpl
     * @see de.cau.cs.kieler.simulation.kisim.impl.KisimPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__OPERATION = eINSTANCE.getAction_Operation();

    /**
     * The meta object literal for the '<em><b>Handler</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__HANDLER = eINSTANCE.getAction_Handler();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__ID = eINSTANCE.getAction_Id();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.simulation.kisim.ActionOperation <em>Action Operation</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.simulation.kisim.ActionOperation
     * @see de.cau.cs.kieler.simulation.kisim.impl.KisimPackageImpl#getActionOperation()
     * @generated
     */
    EEnum ACTION_OPERATION = eINSTANCE.getActionOperation();

  }

} //KisimPackage
