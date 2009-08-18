/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl;

import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.*;

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
public class RetypingSyncchartsFactoryImpl extends EFactoryImpl implements RetypingSyncchartsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RetypingSyncchartsFactory init()
  {
    try
    {
      RetypingSyncchartsFactory theRetypingSyncchartsFactory = (RetypingSyncchartsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.cau.de/cs/kieler/synccharts/dsl/RetypingSynccharts"); 
      if (theRetypingSyncchartsFactory != null)
      {
        return theRetypingSyncchartsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RetypingSyncchartsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RetypingSyncchartsFactoryImpl()
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
      case RetypingSyncchartsPackage.STATE: return createState();
      case RetypingSyncchartsPackage.SIGNAL_RENAMING: return createSignalRenaming();
      case RetypingSyncchartsPackage.REGION: return createRegion();
      case RetypingSyncchartsPackage.ACTION: return createAction();
      case RetypingSyncchartsPackage.VALUED_OBJECT: return createValuedObject();
      case RetypingSyncchartsPackage.VARIABLE: return createVariable();
      case RetypingSyncchartsPackage.SIGNAL: return createSignal();
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
      case RetypingSyncchartsPackage.STATE_TYPE:
        return createStateTypeFromString(eDataType, initialValue);
      case RetypingSyncchartsPackage.COMBINE_OPERATOR:
        return createCombineOperatorFromString(eDataType, initialValue);
      case RetypingSyncchartsPackage.VALUE_TYPE:
        return createValueTypeFromString(eDataType, initialValue);
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
      case RetypingSyncchartsPackage.STATE_TYPE:
        return convertStateTypeToString(eDataType, instanceValue);
      case RetypingSyncchartsPackage.COMBINE_OPERATOR:
        return convertCombineOperatorToString(eDataType, instanceValue);
      case RetypingSyncchartsPackage.VALUE_TYPE:
        return convertValueTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignalRenaming createSignalRenaming()
  {
    SignalRenamingImpl signalRenaming = new SignalRenamingImpl();
    return signalRenaming;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Region createRegion()
  {
    RegionImpl region = new RegionImpl();
    return region;
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
  public ValuedObject createValuedObject()
  {
    ValuedObjectImpl valuedObject = new ValuedObjectImpl();
    return valuedObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signal createSignal()
  {
    SignalImpl signal = new SignalImpl();
    return signal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateType createStateTypeFromString(EDataType eDataType, String initialValue)
  {
    StateType result = StateType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertStateTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CombineOperator createCombineOperatorFromString(EDataType eDataType, String initialValue)
  {
    CombineOperator result = CombineOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCombineOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueType createValueTypeFromString(EDataType eDataType, String initialValue)
  {
    ValueType result = ValueType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertValueTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RetypingSyncchartsPackage getRetypingSyncchartsPackage()
  {
    return (RetypingSyncchartsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RetypingSyncchartsPackage getPackage()
  {
    return RetypingSyncchartsPackage.eINSTANCE;
  }

} //RetypingSyncchartsFactoryImpl
