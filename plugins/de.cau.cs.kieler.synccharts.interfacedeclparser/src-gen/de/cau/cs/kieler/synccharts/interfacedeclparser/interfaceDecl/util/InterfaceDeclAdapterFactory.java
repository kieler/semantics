/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.util;

import de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.InterfaceDeclPackage
 * @generated
 */
public class InterfaceDeclAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static InterfaceDeclPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceDeclAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = InterfaceDeclPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InterfaceDeclSwitch<Adapter> modelSwitch =
    new InterfaceDeclSwitch<Adapter>()
    {
      @Override
      public Adapter caseStateExtend(StateExtend object)
      {
        return createStateExtendAdapter();
      }
      @Override
      public Adapter caseRegionSignalDec(RegionSignalDec object)
      {
        return createRegionSignalDecAdapter();
      }
      @Override
      public Adapter caseSignals(Signals object)
      {
        return createSignalsAdapter();
      }
      @Override
      public Adapter caseInputSignals(InputSignals object)
      {
        return createInputSignalsAdapter();
      }
      @Override
      public Adapter caseOutputSignals(OutputSignals object)
      {
        return createOutputSignalsAdapter();
      }
      @Override
      public Adapter caseInOutputSignals(InOutputSignals object)
      {
        return createInOutputSignalsAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.StateExtend <em>State Extend</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.StateExtend
   * @generated
   */
  public Adapter createStateExtendAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.RegionSignalDec <em>Region Signal Dec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.RegionSignalDec
   * @generated
   */
  public Adapter createRegionSignalDecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.Signals <em>Signals</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.Signals
   * @generated
   */
  public Adapter createSignalsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.InputSignals <em>Input Signals</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.InputSignals
   * @generated
   */
  public Adapter createInputSignalsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.OutputSignals <em>Output Signals</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.OutputSignals
   * @generated
   */
  public Adapter createOutputSignalsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.InOutputSignals <em>In Output Signals</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.InOutputSignals
   * @generated
   */
  public Adapter createInOutputSignalsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //InterfaceDeclAdapterFactory
