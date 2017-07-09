/**
 */
package de.cau.cs.kieler.simulation.kisim.impl;

import de.cau.cs.kieler.simulation.kisim.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KisimFactoryImpl extends EFactoryImpl implements KisimFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static KisimFactory init()
  {
    try
    {
      KisimFactory theKisimFactory = (KisimFactory)EPackage.Registry.INSTANCE.getEFactory(KisimPackage.eNS_URI);
      if (theKisimFactory != null)
      {
        return theKisimFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new KisimFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KisimFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case KisimPackage.SIMULATION_CONFIGURATION: return createSimulationConfiguration();
      case KisimPackage.DATA_HANDLER_CONFIGURATION: return createDataHandlerConfiguration();
      case KisimPackage.INITIALIZATION: return createInitialization();
      case KisimPackage.EXECUTION: return createExecution();
      case KisimPackage.ACTION: return createAction();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case KisimPackage.ACTION_OPERATION:
        return createActionOperationFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case KisimPackage.ACTION_OPERATION:
        return convertActionOperationToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimulationConfiguration createSimulationConfiguration()
  {
    SimulationConfigurationImpl simulationConfiguration = new SimulationConfigurationImpl();
    return simulationConfiguration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataHandlerConfiguration createDataHandlerConfiguration()
  {
    DataHandlerConfigurationImpl dataHandlerConfiguration = new DataHandlerConfigurationImpl();
    return dataHandlerConfiguration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Initialization createInitialization()
  {
    InitializationImpl initialization = new InitializationImpl();
    return initialization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Execution createExecution()
  {
    ExecutionImpl execution = new ExecutionImpl();
    return execution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionOperation createActionOperationFromString(EDataType eDataType, String initialValue)
  {
    ActionOperation result = ActionOperation.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertActionOperationToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KisimPackage getKisimPackage()
  {
    return (KisimPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static KisimPackage getPackage()
  {
    return KisimPackage.eINSTANCE;
  }

} //KisimFactoryImpl
