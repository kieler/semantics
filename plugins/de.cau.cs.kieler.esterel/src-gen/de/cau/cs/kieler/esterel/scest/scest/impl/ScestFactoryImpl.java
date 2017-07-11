/**
 */
package de.cau.cs.kieler.esterel.scest.scest.impl;

import de.cau.cs.kieler.esterel.scest.scest.*;

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
public class ScestFactoryImpl extends EFactoryImpl implements ScestFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ScestFactory init()
  {
    try
    {
      ScestFactory theScestFactory = (ScestFactory)EPackage.Registry.INSTANCE.getEFactory(ScestPackage.eNS_URI);
      if (theScestFactory != null)
      {
        return theScestFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ScestFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScestFactoryImpl()
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
      case ScestPackage.SC_EST_PROGRAM: return createSCEstProgram();
      case ScestPackage.SC_EST_MODULE: return createSCEstModule();
      case ScestPackage.UN_EMIT: return createUnEmit();
      case ScestPackage.SET: return createSet();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SCEstProgram createSCEstProgram()
  {
    SCEstProgramImpl scEstProgram = new SCEstProgramImpl();
    return scEstProgram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SCEstModule createSCEstModule()
  {
    SCEstModuleImpl scEstModule = new SCEstModuleImpl();
    return scEstModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnEmit createUnEmit()
  {
    UnEmitImpl unEmit = new UnEmitImpl();
    return unEmit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Set createSet()
  {
    SetImpl set = new SetImpl();
    return set;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScestPackage getScestPackage()
  {
    return (ScestPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ScestPackage getPackage()
  {
    return ScestPackage.eINSTANCE;
  }

} //ScestFactoryImpl
