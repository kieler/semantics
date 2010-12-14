/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.synccharts.text.interfaces.interfaces.impl;

import de.cau.cs.kieler.synccharts.text.interfaces.interfaces.*;

import org.eclipse.emf.ecore.EClass;
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
public class InterfacesFactoryImpl extends EFactoryImpl implements InterfacesFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static InterfacesFactory init()
  {
    try
    {
      InterfacesFactory theInterfacesFactory = (InterfacesFactory)EPackage.Registry.INSTANCE.getEFactory("http://kieler.cs.cau.de/synccharts/interfaces"); 
      if (theInterfacesFactory != null)
      {
        return theInterfacesFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new InterfacesFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfacesFactoryImpl()
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
      case InterfacesPackage.STATE_EXTEND: return createStateExtend();
      case InterfacesPackage.REGION_SIGNAL_DEC: return createRegionSignalDec();
      case InterfacesPackage.VARIABLES: return createVariables();
      case InterfacesPackage.SIGNALS: return createSignals();
      case InterfacesPackage.INPUT_SIGNALS: return createInputSignals();
      case InterfacesPackage.OUTPUT_SIGNALS: return createOutputSignals();
      case InterfacesPackage.IN_OUTPUT_SIGNALS: return createInOutputSignals();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateExtend createStateExtend()
  {
    StateExtendImpl stateExtend = new StateExtendImpl();
    return stateExtend;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegionSignalDec createRegionSignalDec()
  {
    RegionSignalDecImpl regionSignalDec = new RegionSignalDecImpl();
    return regionSignalDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variables createVariables()
  {
    VariablesImpl variables = new VariablesImpl();
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signals createSignals()
  {
    SignalsImpl signals = new SignalsImpl();
    return signals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputSignals createInputSignals()
  {
    InputSignalsImpl inputSignals = new InputSignalsImpl();
    return inputSignals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputSignals createOutputSignals()
  {
    OutputSignalsImpl outputSignals = new OutputSignalsImpl();
    return outputSignals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InOutputSignals createInOutputSignals()
  {
    InOutputSignalsImpl inOutputSignals = new InOutputSignalsImpl();
    return inOutputSignals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfacesPackage getInterfacesPackage()
  {
    return (InterfacesPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static InterfacesPackage getPackage()
  {
    return InterfacesPackage.eINSTANCE;
  }

} //InterfacesFactoryImpl
