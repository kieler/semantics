/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.sim.eso.eso.impl;

import de.cau.cs.kieler.sim.eso.eso.*;

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
public class EsoFactoryImpl extends EFactoryImpl implements EsoFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EsoFactory init()
  {
    try
    {
      EsoFactory theEsoFactory = (EsoFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.cau.de/cs/kieler/sim/eso/Eso"); 
      if (theEsoFactory != null)
      {
        return theEsoFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EsoFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EsoFactoryImpl()
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
      case EsoPackage.TRACELIST: return createtracelist();
      case EsoPackage.TRACE: return createtrace();
      case EsoPackage.TICK: return createtick();
      case EsoPackage.SIGNAL: return createsignal();
      case EsoPackage.KVPAIR: return createkvpair();
      case EsoPackage.ESO_INT: return createEsoInt();
      case EsoPackage.ESO_STRING: return createEsoString();
      case EsoPackage.ESO_FLOAT: return createEsoFloat();
      case EsoPackage.ESO_BOOL: return createEsoBool();
      case EsoPackage.ESO_JSON: return createEsoJson();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public tracelist createtracelist()
  {
    tracelistImpl tracelist = new tracelistImpl();
    return tracelist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public trace createtrace()
  {
    traceImpl trace = new traceImpl();
    return trace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public tick createtick()
  {
    tickImpl tick = new tickImpl();
    return tick;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public signal createsignal()
  {
    signalImpl signal = new signalImpl();
    return signal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public kvpair createkvpair()
  {
    kvpairImpl kvpair = new kvpairImpl();
    return kvpair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EsoInt createEsoInt()
  {
    EsoIntImpl esoInt = new EsoIntImpl();
    return esoInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EsoString createEsoString()
  {
    EsoStringImpl esoString = new EsoStringImpl();
    return esoString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EsoFloat createEsoFloat()
  {
    EsoFloatImpl esoFloat = new EsoFloatImpl();
    return esoFloat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EsoBool createEsoBool()
  {
    EsoBoolImpl esoBool = new EsoBoolImpl();
    return esoBool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EsoJson createEsoJson()
  {
    EsoJsonImpl esoJson = new EsoJsonImpl();
    return esoJson;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EsoPackage getEsoPackage()
  {
    return (EsoPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EsoPackage getPackage()
  {
    return EsoPackage.eINSTANCE;
  }

} //EsoFactoryImpl
