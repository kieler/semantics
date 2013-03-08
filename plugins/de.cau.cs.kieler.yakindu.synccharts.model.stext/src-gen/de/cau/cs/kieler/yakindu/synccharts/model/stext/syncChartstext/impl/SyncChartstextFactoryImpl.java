/**
 */
package de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.impl;

import de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.*;

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
public class SyncChartstextFactoryImpl extends EFactoryImpl implements SyncChartstextFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SyncChartstextFactory init()
  {
    try
    {
      SyncChartstextFactory theSyncChartstextFactory = (SyncChartstextFactory)EPackage.Registry.INSTANCE.getEFactory("http://kieler.cs.cau.de/yakindu/synccharts/stext/"); 
      if (theSyncChartstextFactory != null)
      {
        return theSyncChartstextFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SyncChartstextFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SyncChartstextFactoryImpl()
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
      case SyncChartstextPackage.SIGNAL_DEFINITION: return createSignalDefinition();
      case SyncChartstextPackage.VARIABLE_DEFINITION: return createVariableDefinition();
      case SyncChartstextPackage.EVENT_DEFINITION: return createEventDefinition();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignalDefinition createSignalDefinition()
  {
    SignalDefinitionImpl signalDefinition = new SignalDefinitionImpl();
    return signalDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDefinition createVariableDefinition()
  {
    VariableDefinitionImpl variableDefinition = new VariableDefinitionImpl();
    return variableDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventDefinition createEventDefinition()
  {
    EventDefinitionImpl eventDefinition = new EventDefinitionImpl();
    return eventDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SyncChartstextPackage getSyncChartstextPackage()
  {
    return (SyncChartstextPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SyncChartstextPackage getPackage()
  {
    return SyncChartstextPackage.eINSTANCE;
  }

} //SyncChartstextFactoryImpl
