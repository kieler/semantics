/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.ConstantDecl;
import de.cau.cs.kieler.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.FunctionDecl;
import de.cau.cs.kieler.esterel.ModuleInterface;
import de.cau.cs.kieler.esterel.RelationDecl;
import de.cau.cs.kieler.esterel.SensorDecl;
import de.cau.cs.kieler.esterel.SignalDecl;
import de.cau.cs.kieler.esterel.TypeDecl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.ModuleInterfaceImpl#getIntSignalDecl <em>Int Signal Decl</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.ModuleInterfaceImpl#getIntTypeDecl <em>Int Type Decl</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.ModuleInterfaceImpl#getIntSensorDecl <em>Int Sensor Decl</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.ModuleInterfaceImpl#getIntConstantDecl <em>Int Constant Decl</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.ModuleInterfaceImpl#getIntRelationDecl <em>Int Relation Decl</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.ModuleInterfaceImpl#getIntFunctionDecl <em>Int Function Decl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleInterfaceImpl extends MinimalEObjectImpl.Container implements ModuleInterface
{
  /**
   * The cached value of the '{@link #getIntSignalDecl() <em>Int Signal Decl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntSignalDecl()
   * @generated
   * @ordered
   */
  protected EList<SignalDecl> intSignalDecl;

  /**
   * The cached value of the '{@link #getIntTypeDecl() <em>Int Type Decl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntTypeDecl()
   * @generated
   * @ordered
   */
  protected EList<TypeDecl> intTypeDecl;

  /**
   * The cached value of the '{@link #getIntSensorDecl() <em>Int Sensor Decl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntSensorDecl()
   * @generated
   * @ordered
   */
  protected EList<SensorDecl> intSensorDecl;

  /**
   * The cached value of the '{@link #getIntConstantDecl() <em>Int Constant Decl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntConstantDecl()
   * @generated
   * @ordered
   */
  protected EList<ConstantDecl> intConstantDecl;

  /**
   * The cached value of the '{@link #getIntRelationDecl() <em>Int Relation Decl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntRelationDecl()
   * @generated
   * @ordered
   */
  protected EList<RelationDecl> intRelationDecl;

  /**
   * The cached value of the '{@link #getIntFunctionDecl() <em>Int Function Decl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntFunctionDecl()
   * @generated
   * @ordered
   */
  protected EList<FunctionDecl> intFunctionDecl;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModuleInterfaceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EsterelPackage.Literals.MODULE_INTERFACE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SignalDecl> getIntSignalDecl()
  {
    if (intSignalDecl == null)
    {
      intSignalDecl = new EObjectContainmentEList<SignalDecl>(SignalDecl.class, this, EsterelPackage.MODULE_INTERFACE__INT_SIGNAL_DECL);
    }
    return intSignalDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeDecl> getIntTypeDecl()
  {
    if (intTypeDecl == null)
    {
      intTypeDecl = new EObjectContainmentEList<TypeDecl>(TypeDecl.class, this, EsterelPackage.MODULE_INTERFACE__INT_TYPE_DECL);
    }
    return intTypeDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SensorDecl> getIntSensorDecl()
  {
    if (intSensorDecl == null)
    {
      intSensorDecl = new EObjectContainmentEList<SensorDecl>(SensorDecl.class, this, EsterelPackage.MODULE_INTERFACE__INT_SENSOR_DECL);
    }
    return intSensorDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConstantDecl> getIntConstantDecl()
  {
    if (intConstantDecl == null)
    {
      intConstantDecl = new EObjectContainmentEList<ConstantDecl>(ConstantDecl.class, this, EsterelPackage.MODULE_INTERFACE__INT_CONSTANT_DECL);
    }
    return intConstantDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RelationDecl> getIntRelationDecl()
  {
    if (intRelationDecl == null)
    {
      intRelationDecl = new EObjectContainmentEList<RelationDecl>(RelationDecl.class, this, EsterelPackage.MODULE_INTERFACE__INT_RELATION_DECL);
    }
    return intRelationDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionDecl> getIntFunctionDecl()
  {
    if (intFunctionDecl == null)
    {
      intFunctionDecl = new EObjectContainmentEList<FunctionDecl>(FunctionDecl.class, this, EsterelPackage.MODULE_INTERFACE__INT_FUNCTION_DECL);
    }
    return intFunctionDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EsterelPackage.MODULE_INTERFACE__INT_SIGNAL_DECL:
        return ((InternalEList<?>)getIntSignalDecl()).basicRemove(otherEnd, msgs);
      case EsterelPackage.MODULE_INTERFACE__INT_TYPE_DECL:
        return ((InternalEList<?>)getIntTypeDecl()).basicRemove(otherEnd, msgs);
      case EsterelPackage.MODULE_INTERFACE__INT_SENSOR_DECL:
        return ((InternalEList<?>)getIntSensorDecl()).basicRemove(otherEnd, msgs);
      case EsterelPackage.MODULE_INTERFACE__INT_CONSTANT_DECL:
        return ((InternalEList<?>)getIntConstantDecl()).basicRemove(otherEnd, msgs);
      case EsterelPackage.MODULE_INTERFACE__INT_RELATION_DECL:
        return ((InternalEList<?>)getIntRelationDecl()).basicRemove(otherEnd, msgs);
      case EsterelPackage.MODULE_INTERFACE__INT_FUNCTION_DECL:
        return ((InternalEList<?>)getIntFunctionDecl()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EsterelPackage.MODULE_INTERFACE__INT_SIGNAL_DECL:
        return getIntSignalDecl();
      case EsterelPackage.MODULE_INTERFACE__INT_TYPE_DECL:
        return getIntTypeDecl();
      case EsterelPackage.MODULE_INTERFACE__INT_SENSOR_DECL:
        return getIntSensorDecl();
      case EsterelPackage.MODULE_INTERFACE__INT_CONSTANT_DECL:
        return getIntConstantDecl();
      case EsterelPackage.MODULE_INTERFACE__INT_RELATION_DECL:
        return getIntRelationDecl();
      case EsterelPackage.MODULE_INTERFACE__INT_FUNCTION_DECL:
        return getIntFunctionDecl();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EsterelPackage.MODULE_INTERFACE__INT_SIGNAL_DECL:
        getIntSignalDecl().clear();
        getIntSignalDecl().addAll((Collection<? extends SignalDecl>)newValue);
        return;
      case EsterelPackage.MODULE_INTERFACE__INT_TYPE_DECL:
        getIntTypeDecl().clear();
        getIntTypeDecl().addAll((Collection<? extends TypeDecl>)newValue);
        return;
      case EsterelPackage.MODULE_INTERFACE__INT_SENSOR_DECL:
        getIntSensorDecl().clear();
        getIntSensorDecl().addAll((Collection<? extends SensorDecl>)newValue);
        return;
      case EsterelPackage.MODULE_INTERFACE__INT_CONSTANT_DECL:
        getIntConstantDecl().clear();
        getIntConstantDecl().addAll((Collection<? extends ConstantDecl>)newValue);
        return;
      case EsterelPackage.MODULE_INTERFACE__INT_RELATION_DECL:
        getIntRelationDecl().clear();
        getIntRelationDecl().addAll((Collection<? extends RelationDecl>)newValue);
        return;
      case EsterelPackage.MODULE_INTERFACE__INT_FUNCTION_DECL:
        getIntFunctionDecl().clear();
        getIntFunctionDecl().addAll((Collection<? extends FunctionDecl>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EsterelPackage.MODULE_INTERFACE__INT_SIGNAL_DECL:
        getIntSignalDecl().clear();
        return;
      case EsterelPackage.MODULE_INTERFACE__INT_TYPE_DECL:
        getIntTypeDecl().clear();
        return;
      case EsterelPackage.MODULE_INTERFACE__INT_SENSOR_DECL:
        getIntSensorDecl().clear();
        return;
      case EsterelPackage.MODULE_INTERFACE__INT_CONSTANT_DECL:
        getIntConstantDecl().clear();
        return;
      case EsterelPackage.MODULE_INTERFACE__INT_RELATION_DECL:
        getIntRelationDecl().clear();
        return;
      case EsterelPackage.MODULE_INTERFACE__INT_FUNCTION_DECL:
        getIntFunctionDecl().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EsterelPackage.MODULE_INTERFACE__INT_SIGNAL_DECL:
        return intSignalDecl != null && !intSignalDecl.isEmpty();
      case EsterelPackage.MODULE_INTERFACE__INT_TYPE_DECL:
        return intTypeDecl != null && !intTypeDecl.isEmpty();
      case EsterelPackage.MODULE_INTERFACE__INT_SENSOR_DECL:
        return intSensorDecl != null && !intSensorDecl.isEmpty();
      case EsterelPackage.MODULE_INTERFACE__INT_CONSTANT_DECL:
        return intConstantDecl != null && !intConstantDecl.isEmpty();
      case EsterelPackage.MODULE_INTERFACE__INT_RELATION_DECL:
        return intRelationDecl != null && !intRelationDecl.isEmpty();
      case EsterelPackage.MODULE_INTERFACE__INT_FUNCTION_DECL:
        return intFunctionDecl != null && !intFunctionDecl.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModuleInterfaceImpl
