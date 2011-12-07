/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.kies.esterel.impl;

import de.cau.cs.kieler.core.kexpressions.InterfaceSignalDecl;

import de.cau.cs.kieler.kies.esterel.ConstantDecls;
import de.cau.cs.kieler.kies.esterel.EsterelPackage;
import de.cau.cs.kieler.kies.esterel.FunctionDecl;
import de.cau.cs.kieler.kies.esterel.ModuleInterface;
import de.cau.cs.kieler.kies.esterel.ProcedureDecl;
import de.cau.cs.kieler.kies.esterel.RelationDecl;
import de.cau.cs.kieler.kies.esterel.SensorDecl;
import de.cau.cs.kieler.kies.esterel.TaskDecl;
import de.cau.cs.kieler.kies.esterel.TypeDecl;

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
 *   <li>{@link de.cau.cs.kieler.kies.esterel.impl.ModuleInterfaceImpl#getIntSignalDecls <em>Int Signal Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.impl.ModuleInterfaceImpl#getIntTypeDecls <em>Int Type Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.impl.ModuleInterfaceImpl#getIntSensorDecls <em>Int Sensor Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.impl.ModuleInterfaceImpl#getIntConstantDecls <em>Int Constant Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.impl.ModuleInterfaceImpl#getIntRelationDecls <em>Int Relation Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.impl.ModuleInterfaceImpl#getIntTaskDecls <em>Int Task Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.impl.ModuleInterfaceImpl#getIntFunctionDecls <em>Int Function Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.impl.ModuleInterfaceImpl#getIntProcedureDecls <em>Int Procedure Decls</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleInterfaceImpl extends MinimalEObjectImpl.Container implements ModuleInterface
{
  /**
   * The cached value of the '{@link #getIntSignalDecls() <em>Int Signal Decls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntSignalDecls()
   * @generated
   * @ordered
   */
  protected EList<InterfaceSignalDecl> intSignalDecls;

  /**
   * The cached value of the '{@link #getIntTypeDecls() <em>Int Type Decls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntTypeDecls()
   * @generated
   * @ordered
   */
  protected EList<TypeDecl> intTypeDecls;

  /**
   * The cached value of the '{@link #getIntSensorDecls() <em>Int Sensor Decls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntSensorDecls()
   * @generated
   * @ordered
   */
  protected EList<SensorDecl> intSensorDecls;

  /**
   * The cached value of the '{@link #getIntConstantDecls() <em>Int Constant Decls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntConstantDecls()
   * @generated
   * @ordered
   */
  protected EList<ConstantDecls> intConstantDecls;

  /**
   * The cached value of the '{@link #getIntRelationDecls() <em>Int Relation Decls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntRelationDecls()
   * @generated
   * @ordered
   */
  protected EList<RelationDecl> intRelationDecls;

  /**
   * The cached value of the '{@link #getIntTaskDecls() <em>Int Task Decls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntTaskDecls()
   * @generated
   * @ordered
   */
  protected EList<TaskDecl> intTaskDecls;

  /**
   * The cached value of the '{@link #getIntFunctionDecls() <em>Int Function Decls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntFunctionDecls()
   * @generated
   * @ordered
   */
  protected EList<FunctionDecl> intFunctionDecls;

  /**
   * The cached value of the '{@link #getIntProcedureDecls() <em>Int Procedure Decls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntProcedureDecls()
   * @generated
   * @ordered
   */
  protected EList<ProcedureDecl> intProcedureDecls;

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
  public EList<InterfaceSignalDecl> getIntSignalDecls()
  {
    if (intSignalDecls == null)
    {
      intSignalDecls = new EObjectContainmentEList<InterfaceSignalDecl>(InterfaceSignalDecl.class, this, EsterelPackage.MODULE_INTERFACE__INT_SIGNAL_DECLS);
    }
    return intSignalDecls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeDecl> getIntTypeDecls()
  {
    if (intTypeDecls == null)
    {
      intTypeDecls = new EObjectContainmentEList<TypeDecl>(TypeDecl.class, this, EsterelPackage.MODULE_INTERFACE__INT_TYPE_DECLS);
    }
    return intTypeDecls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SensorDecl> getIntSensorDecls()
  {
    if (intSensorDecls == null)
    {
      intSensorDecls = new EObjectContainmentEList<SensorDecl>(SensorDecl.class, this, EsterelPackage.MODULE_INTERFACE__INT_SENSOR_DECLS);
    }
    return intSensorDecls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConstantDecls> getIntConstantDecls()
  {
    if (intConstantDecls == null)
    {
      intConstantDecls = new EObjectContainmentEList<ConstantDecls>(ConstantDecls.class, this, EsterelPackage.MODULE_INTERFACE__INT_CONSTANT_DECLS);
    }
    return intConstantDecls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RelationDecl> getIntRelationDecls()
  {
    if (intRelationDecls == null)
    {
      intRelationDecls = new EObjectContainmentEList<RelationDecl>(RelationDecl.class, this, EsterelPackage.MODULE_INTERFACE__INT_RELATION_DECLS);
    }
    return intRelationDecls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TaskDecl> getIntTaskDecls()
  {
    if (intTaskDecls == null)
    {
      intTaskDecls = new EObjectContainmentEList<TaskDecl>(TaskDecl.class, this, EsterelPackage.MODULE_INTERFACE__INT_TASK_DECLS);
    }
    return intTaskDecls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionDecl> getIntFunctionDecls()
  {
    if (intFunctionDecls == null)
    {
      intFunctionDecls = new EObjectContainmentEList<FunctionDecl>(FunctionDecl.class, this, EsterelPackage.MODULE_INTERFACE__INT_FUNCTION_DECLS);
    }
    return intFunctionDecls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProcedureDecl> getIntProcedureDecls()
  {
    if (intProcedureDecls == null)
    {
      intProcedureDecls = new EObjectContainmentEList<ProcedureDecl>(ProcedureDecl.class, this, EsterelPackage.MODULE_INTERFACE__INT_PROCEDURE_DECLS);
    }
    return intProcedureDecls;
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
      case EsterelPackage.MODULE_INTERFACE__INT_SIGNAL_DECLS:
        return ((InternalEList<?>)getIntSignalDecls()).basicRemove(otherEnd, msgs);
      case EsterelPackage.MODULE_INTERFACE__INT_TYPE_DECLS:
        return ((InternalEList<?>)getIntTypeDecls()).basicRemove(otherEnd, msgs);
      case EsterelPackage.MODULE_INTERFACE__INT_SENSOR_DECLS:
        return ((InternalEList<?>)getIntSensorDecls()).basicRemove(otherEnd, msgs);
      case EsterelPackage.MODULE_INTERFACE__INT_CONSTANT_DECLS:
        return ((InternalEList<?>)getIntConstantDecls()).basicRemove(otherEnd, msgs);
      case EsterelPackage.MODULE_INTERFACE__INT_RELATION_DECLS:
        return ((InternalEList<?>)getIntRelationDecls()).basicRemove(otherEnd, msgs);
      case EsterelPackage.MODULE_INTERFACE__INT_TASK_DECLS:
        return ((InternalEList<?>)getIntTaskDecls()).basicRemove(otherEnd, msgs);
      case EsterelPackage.MODULE_INTERFACE__INT_FUNCTION_DECLS:
        return ((InternalEList<?>)getIntFunctionDecls()).basicRemove(otherEnd, msgs);
      case EsterelPackage.MODULE_INTERFACE__INT_PROCEDURE_DECLS:
        return ((InternalEList<?>)getIntProcedureDecls()).basicRemove(otherEnd, msgs);
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
      case EsterelPackage.MODULE_INTERFACE__INT_SIGNAL_DECLS:
        return getIntSignalDecls();
      case EsterelPackage.MODULE_INTERFACE__INT_TYPE_DECLS:
        return getIntTypeDecls();
      case EsterelPackage.MODULE_INTERFACE__INT_SENSOR_DECLS:
        return getIntSensorDecls();
      case EsterelPackage.MODULE_INTERFACE__INT_CONSTANT_DECLS:
        return getIntConstantDecls();
      case EsterelPackage.MODULE_INTERFACE__INT_RELATION_DECLS:
        return getIntRelationDecls();
      case EsterelPackage.MODULE_INTERFACE__INT_TASK_DECLS:
        return getIntTaskDecls();
      case EsterelPackage.MODULE_INTERFACE__INT_FUNCTION_DECLS:
        return getIntFunctionDecls();
      case EsterelPackage.MODULE_INTERFACE__INT_PROCEDURE_DECLS:
        return getIntProcedureDecls();
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
      case EsterelPackage.MODULE_INTERFACE__INT_SIGNAL_DECLS:
        getIntSignalDecls().clear();
        getIntSignalDecls().addAll((Collection<? extends InterfaceSignalDecl>)newValue);
        return;
      case EsterelPackage.MODULE_INTERFACE__INT_TYPE_DECLS:
        getIntTypeDecls().clear();
        getIntTypeDecls().addAll((Collection<? extends TypeDecl>)newValue);
        return;
      case EsterelPackage.MODULE_INTERFACE__INT_SENSOR_DECLS:
        getIntSensorDecls().clear();
        getIntSensorDecls().addAll((Collection<? extends SensorDecl>)newValue);
        return;
      case EsterelPackage.MODULE_INTERFACE__INT_CONSTANT_DECLS:
        getIntConstantDecls().clear();
        getIntConstantDecls().addAll((Collection<? extends ConstantDecls>)newValue);
        return;
      case EsterelPackage.MODULE_INTERFACE__INT_RELATION_DECLS:
        getIntRelationDecls().clear();
        getIntRelationDecls().addAll((Collection<? extends RelationDecl>)newValue);
        return;
      case EsterelPackage.MODULE_INTERFACE__INT_TASK_DECLS:
        getIntTaskDecls().clear();
        getIntTaskDecls().addAll((Collection<? extends TaskDecl>)newValue);
        return;
      case EsterelPackage.MODULE_INTERFACE__INT_FUNCTION_DECLS:
        getIntFunctionDecls().clear();
        getIntFunctionDecls().addAll((Collection<? extends FunctionDecl>)newValue);
        return;
      case EsterelPackage.MODULE_INTERFACE__INT_PROCEDURE_DECLS:
        getIntProcedureDecls().clear();
        getIntProcedureDecls().addAll((Collection<? extends ProcedureDecl>)newValue);
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
      case EsterelPackage.MODULE_INTERFACE__INT_SIGNAL_DECLS:
        getIntSignalDecls().clear();
        return;
      case EsterelPackage.MODULE_INTERFACE__INT_TYPE_DECLS:
        getIntTypeDecls().clear();
        return;
      case EsterelPackage.MODULE_INTERFACE__INT_SENSOR_DECLS:
        getIntSensorDecls().clear();
        return;
      case EsterelPackage.MODULE_INTERFACE__INT_CONSTANT_DECLS:
        getIntConstantDecls().clear();
        return;
      case EsterelPackage.MODULE_INTERFACE__INT_RELATION_DECLS:
        getIntRelationDecls().clear();
        return;
      case EsterelPackage.MODULE_INTERFACE__INT_TASK_DECLS:
        getIntTaskDecls().clear();
        return;
      case EsterelPackage.MODULE_INTERFACE__INT_FUNCTION_DECLS:
        getIntFunctionDecls().clear();
        return;
      case EsterelPackage.MODULE_INTERFACE__INT_PROCEDURE_DECLS:
        getIntProcedureDecls().clear();
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
      case EsterelPackage.MODULE_INTERFACE__INT_SIGNAL_DECLS:
        return intSignalDecls != null && !intSignalDecls.isEmpty();
      case EsterelPackage.MODULE_INTERFACE__INT_TYPE_DECLS:
        return intTypeDecls != null && !intTypeDecls.isEmpty();
      case EsterelPackage.MODULE_INTERFACE__INT_SENSOR_DECLS:
        return intSensorDecls != null && !intSensorDecls.isEmpty();
      case EsterelPackage.MODULE_INTERFACE__INT_CONSTANT_DECLS:
        return intConstantDecls != null && !intConstantDecls.isEmpty();
      case EsterelPackage.MODULE_INTERFACE__INT_RELATION_DECLS:
        return intRelationDecls != null && !intRelationDecls.isEmpty();
      case EsterelPackage.MODULE_INTERFACE__INT_TASK_DECLS:
        return intTaskDecls != null && !intTaskDecls.isEmpty();
      case EsterelPackage.MODULE_INTERFACE__INT_FUNCTION_DECLS:
        return intFunctionDecls != null && !intFunctionDecls.isEmpty();
      case EsterelPackage.MODULE_INTERFACE__INT_PROCEDURE_DECLS:
        return intProcedureDecls != null && !intProcedureDecls.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModuleInterfaceImpl
