/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.impl;

import de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.*;

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
public class InterfaceDeclFactoryImpl extends EFactoryImpl implements InterfaceDeclFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static InterfaceDeclFactory init()
  {
    try
    {
      InterfaceDeclFactory theInterfaceDeclFactory = (InterfaceDeclFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.cau.de/cs/kieler/synccharts/interfacedeclparser/InterfaceDecl"); 
      if (theInterfaceDeclFactory != null)
      {
        return theInterfaceDeclFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new InterfaceDeclFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceDeclFactoryImpl()
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
      case InterfaceDeclPackage.STATE_EXTEND: return createStateExtend();
      case InterfaceDeclPackage.REGION_SIGNAL_DEC: return createRegionSignalDec();
      case InterfaceDeclPackage.VARIABLES: return createVariables();
      case InterfaceDeclPackage.SIGNALS: return createSignals();
      case InterfaceDeclPackage.RENAMINGS: return createRenamings();
      case InterfaceDeclPackage.INPUT_SIGNALS: return createInputSignals();
      case InterfaceDeclPackage.OUTPUT_SIGNALS: return createOutputSignals();
      case InterfaceDeclPackage.IN_OUTPUT_SIGNALS: return createInOutputSignals();
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
  public Renamings createRenamings()
  {
    RenamingsImpl renamings = new RenamingsImpl();
    return renamings;
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
  public InterfaceDeclPackage getInterfaceDeclPackage()
  {
    return (InterfaceDeclPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static InterfaceDeclPackage getPackage()
  {
    return InterfaceDeclPackage.eINSTANCE;
  }

} //InterfaceDeclFactoryImpl
