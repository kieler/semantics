/**
 */
package de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.impl;

import de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.*;

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
public class SCChartsExpFactoryImpl extends EFactoryImpl implements SCChartsExpFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SCChartsExpFactory init()
  {
    try
    {
      SCChartsExpFactory theSCChartsExpFactory = (SCChartsExpFactory)EPackage.Registry.INSTANCE.getEFactory("http://kieler.cs.cau.de/yakindu/sccharts/stext/"); 
      if (theSCChartsExpFactory != null)
      {
        return theSCChartsExpFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SCChartsExpFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SCChartsExpFactoryImpl()
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
      case SCChartsExpPackage.SIGNAL_DEFINITION: return createSignalDefinition();
      case SCChartsExpPackage.VARIABLE_DEFINITION: return createVariableDefinition();
      case SCChartsExpPackage.EVENT_DEFINITION: return createEventDefinition();
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
  public SCChartsExpPackage getSCChartsExpPackage()
  {
    return (SCChartsExpPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SCChartsExpPackage getPackage()
  {
    return SCChartsExpPackage.eINSTANCE;
  }

} //SCChartsExpFactoryImpl
