/**
 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.esterel.esterel.ConstantDecls;
import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.FunctionDecl;
import de.cau.cs.kieler.esterel.esterel.InterfaceSignalDecl;
import de.cau.cs.kieler.esterel.esterel.Module;
import de.cau.cs.kieler.esterel.esterel.ProcedureDecl;
import de.cau.cs.kieler.esterel.esterel.RelationDecl;
import de.cau.cs.kieler.esterel.esterel.SensorDecl;
import de.cau.cs.kieler.esterel.esterel.TaskDecl;
import de.cau.cs.kieler.esterel.esterel.TypeDecl;

import de.cau.cs.kieler.scl.scl.impl.StatementContainerImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ModuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ModuleImpl#getIntSignalDecls <em>Int Signal Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ModuleImpl#getIntTypeDecls <em>Int Type Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ModuleImpl#getIntSensorDecls <em>Int Sensor Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ModuleImpl#getIntConstantDecls <em>Int Constant Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ModuleImpl#getIntRelationDecls <em>Int Relation Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ModuleImpl#getIntTaskDecls <em>Int Task Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ModuleImpl#getIntFunctionDecls <em>Int Function Decls</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ModuleImpl#getIntProcedureDecls <em>Int Procedure Decls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleImpl extends StatementContainerImpl implements Module
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
  protected ModuleImpl()
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
    return EsterelPackage.Literals.MODULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.MODULE__NAME, oldName, name));
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
      intSignalDecls = new EObjectContainmentEList<InterfaceSignalDecl>(InterfaceSignalDecl.class, this, EsterelPackage.MODULE__INT_SIGNAL_DECLS);
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
      intTypeDecls = new EObjectContainmentEList<TypeDecl>(TypeDecl.class, this, EsterelPackage.MODULE__INT_TYPE_DECLS);
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
      intSensorDecls = new EObjectContainmentEList<SensorDecl>(SensorDecl.class, this, EsterelPackage.MODULE__INT_SENSOR_DECLS);
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
      intConstantDecls = new EObjectContainmentEList<ConstantDecls>(ConstantDecls.class, this, EsterelPackage.MODULE__INT_CONSTANT_DECLS);
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
      intRelationDecls = new EObjectContainmentEList<RelationDecl>(RelationDecl.class, this, EsterelPackage.MODULE__INT_RELATION_DECLS);
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
      intTaskDecls = new EObjectContainmentEList<TaskDecl>(TaskDecl.class, this, EsterelPackage.MODULE__INT_TASK_DECLS);
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
      intFunctionDecls = new EObjectContainmentEList<FunctionDecl>(FunctionDecl.class, this, EsterelPackage.MODULE__INT_FUNCTION_DECLS);
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
      intProcedureDecls = new EObjectContainmentEList<ProcedureDecl>(ProcedureDecl.class, this, EsterelPackage.MODULE__INT_PROCEDURE_DECLS);
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
      case EsterelPackage.MODULE__INT_SIGNAL_DECLS:
        return ((InternalEList<?>)getIntSignalDecls()).basicRemove(otherEnd, msgs);
      case EsterelPackage.MODULE__INT_TYPE_DECLS:
        return ((InternalEList<?>)getIntTypeDecls()).basicRemove(otherEnd, msgs);
      case EsterelPackage.MODULE__INT_SENSOR_DECLS:
        return ((InternalEList<?>)getIntSensorDecls()).basicRemove(otherEnd, msgs);
      case EsterelPackage.MODULE__INT_CONSTANT_DECLS:
        return ((InternalEList<?>)getIntConstantDecls()).basicRemove(otherEnd, msgs);
      case EsterelPackage.MODULE__INT_RELATION_DECLS:
        return ((InternalEList<?>)getIntRelationDecls()).basicRemove(otherEnd, msgs);
      case EsterelPackage.MODULE__INT_TASK_DECLS:
        return ((InternalEList<?>)getIntTaskDecls()).basicRemove(otherEnd, msgs);
      case EsterelPackage.MODULE__INT_FUNCTION_DECLS:
        return ((InternalEList<?>)getIntFunctionDecls()).basicRemove(otherEnd, msgs);
      case EsterelPackage.MODULE__INT_PROCEDURE_DECLS:
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
      case EsterelPackage.MODULE__NAME:
        return getName();
      case EsterelPackage.MODULE__INT_SIGNAL_DECLS:
        return getIntSignalDecls();
      case EsterelPackage.MODULE__INT_TYPE_DECLS:
        return getIntTypeDecls();
      case EsterelPackage.MODULE__INT_SENSOR_DECLS:
        return getIntSensorDecls();
      case EsterelPackage.MODULE__INT_CONSTANT_DECLS:
        return getIntConstantDecls();
      case EsterelPackage.MODULE__INT_RELATION_DECLS:
        return getIntRelationDecls();
      case EsterelPackage.MODULE__INT_TASK_DECLS:
        return getIntTaskDecls();
      case EsterelPackage.MODULE__INT_FUNCTION_DECLS:
        return getIntFunctionDecls();
      case EsterelPackage.MODULE__INT_PROCEDURE_DECLS:
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
      case EsterelPackage.MODULE__NAME:
        setName((String)newValue);
        return;
      case EsterelPackage.MODULE__INT_SIGNAL_DECLS:
        getIntSignalDecls().clear();
        getIntSignalDecls().addAll((Collection<? extends InterfaceSignalDecl>)newValue);
        return;
      case EsterelPackage.MODULE__INT_TYPE_DECLS:
        getIntTypeDecls().clear();
        getIntTypeDecls().addAll((Collection<? extends TypeDecl>)newValue);
        return;
      case EsterelPackage.MODULE__INT_SENSOR_DECLS:
        getIntSensorDecls().clear();
        getIntSensorDecls().addAll((Collection<? extends SensorDecl>)newValue);
        return;
      case EsterelPackage.MODULE__INT_CONSTANT_DECLS:
        getIntConstantDecls().clear();
        getIntConstantDecls().addAll((Collection<? extends ConstantDecls>)newValue);
        return;
      case EsterelPackage.MODULE__INT_RELATION_DECLS:
        getIntRelationDecls().clear();
        getIntRelationDecls().addAll((Collection<? extends RelationDecl>)newValue);
        return;
      case EsterelPackage.MODULE__INT_TASK_DECLS:
        getIntTaskDecls().clear();
        getIntTaskDecls().addAll((Collection<? extends TaskDecl>)newValue);
        return;
      case EsterelPackage.MODULE__INT_FUNCTION_DECLS:
        getIntFunctionDecls().clear();
        getIntFunctionDecls().addAll((Collection<? extends FunctionDecl>)newValue);
        return;
      case EsterelPackage.MODULE__INT_PROCEDURE_DECLS:
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
      case EsterelPackage.MODULE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EsterelPackage.MODULE__INT_SIGNAL_DECLS:
        getIntSignalDecls().clear();
        return;
      case EsterelPackage.MODULE__INT_TYPE_DECLS:
        getIntTypeDecls().clear();
        return;
      case EsterelPackage.MODULE__INT_SENSOR_DECLS:
        getIntSensorDecls().clear();
        return;
      case EsterelPackage.MODULE__INT_CONSTANT_DECLS:
        getIntConstantDecls().clear();
        return;
      case EsterelPackage.MODULE__INT_RELATION_DECLS:
        getIntRelationDecls().clear();
        return;
      case EsterelPackage.MODULE__INT_TASK_DECLS:
        getIntTaskDecls().clear();
        return;
      case EsterelPackage.MODULE__INT_FUNCTION_DECLS:
        getIntFunctionDecls().clear();
        return;
      case EsterelPackage.MODULE__INT_PROCEDURE_DECLS:
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
      case EsterelPackage.MODULE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EsterelPackage.MODULE__INT_SIGNAL_DECLS:
        return intSignalDecls != null && !intSignalDecls.isEmpty();
      case EsterelPackage.MODULE__INT_TYPE_DECLS:
        return intTypeDecls != null && !intTypeDecls.isEmpty();
      case EsterelPackage.MODULE__INT_SENSOR_DECLS:
        return intSensorDecls != null && !intSensorDecls.isEmpty();
      case EsterelPackage.MODULE__INT_CONSTANT_DECLS:
        return intConstantDecls != null && !intConstantDecls.isEmpty();
      case EsterelPackage.MODULE__INT_RELATION_DECLS:
        return intRelationDecls != null && !intRelationDecls.isEmpty();
      case EsterelPackage.MODULE__INT_TASK_DECLS:
        return intTaskDecls != null && !intTaskDecls.isEmpty();
      case EsterelPackage.MODULE__INT_FUNCTION_DECLS:
        return intFunctionDecls != null && !intFunctionDecls.isEmpty();
      case EsterelPackage.MODULE__INT_PROCEDURE_DECLS:
        return intProcedureDecls != null && !intProcedureDecls.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ModuleImpl
