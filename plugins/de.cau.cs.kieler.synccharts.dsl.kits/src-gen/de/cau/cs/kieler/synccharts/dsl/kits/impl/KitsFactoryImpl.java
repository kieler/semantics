/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.kits.impl;

import de.cau.cs.kieler.synccharts.dsl.kits.*;

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
public class KitsFactoryImpl extends EFactoryImpl implements KitsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static KitsFactory init()
  {
    try
    {
      KitsFactory theKitsFactory = (KitsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.cau.de/cs/kieler/synccharts/dsl/Kits"); 
      if (theKitsFactory != null)
      {
        return theKitsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new KitsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KitsFactoryImpl()
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
      case KitsPackage.REGION: return createRegion();
      case KitsPackage.STATE: return createState();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
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
  public KitsPackage getKitsPackage()
  {
    return (KitsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static KitsPackage getPackage()
  {
    return KitsPackage.eINSTANCE;
  }

} //KitsFactoryImpl
