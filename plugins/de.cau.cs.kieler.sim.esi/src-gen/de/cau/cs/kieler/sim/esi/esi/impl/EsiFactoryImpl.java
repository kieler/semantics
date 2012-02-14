/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.sim.esi.esi.impl;

import de.cau.cs.kieler.sim.esi.esi.*;

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
public class EsiFactoryImpl extends EFactoryImpl implements EsiFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EsiFactory init()
  {
    try
    {
      EsiFactory theEsiFactory = (EsiFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.cau.de/cs/kieler/sim/esi/Esi"); 
      if (theEsiFactory != null)
      {
        return theEsiFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EsiFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EsiFactoryImpl()
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
      case EsiPackage.TRACELIST: return createtracelist();
      case EsiPackage.TRACE: return createtrace();
      case EsiPackage.TICK: return createtick();
      case EsiPackage.SIGNAL: return createsignal();
      case EsiPackage.KVPAIR: return createkvpair();
      case EsiPackage.ESO_INT: return createEsoInt();
      case EsiPackage.ESO_STRING: return createEsoString();
      case EsiPackage.ESO_FLOAT: return createEsoFloat();
      case EsiPackage.ESO_BOOL: return createEsoBool();
      case EsiPackage.ESO_JSON: return createEsoJson();
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
  public EsiPackage getEsiPackage()
  {
    return (EsiPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EsiPackage getPackage()
  {
    return EsiPackage.eINSTANCE;
  }

} //EsiFactoryImpl
