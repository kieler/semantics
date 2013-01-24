/**
 */
package de.cau.cs.kieler.yakindu.synccharts.model.text.syncText.impl;

import de.cau.cs.kieler.yakindu.synccharts.model.text.syncText.*;

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
public class SyncTextFactoryImpl extends EFactoryImpl implements SyncTextFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SyncTextFactory init()
  {
    try
    {
      SyncTextFactory theSyncTextFactory = (SyncTextFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.cau.de/kieler/yakindu/synccharts/SyncText"); 
      if (theSyncTextFactory != null)
      {
        return theSyncTextFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SyncTextFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SyncTextFactoryImpl()
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
      case SyncTextPackage.SIGNAL_DEFINITION: return createSignalDefinition();
      case SyncTextPackage.VARIABLE_DEFINITION: return createVariableDefinition();
      case SyncTextPackage.EVENT_DEFINITION: return createEventDefinition();
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
  public SyncTextPackage getSyncTextPackage()
  {
    return (SyncTextPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SyncTextPackage getPackage()
  {
    return SyncTextPackage.eINSTANCE;
  }

} //SyncTextFactoryImpl
