/**
 */
package de.cau.cs.kieler.prom.kibuild.impl;

import de.cau.cs.kieler.prom.kibuild.AttributeMapping;
import de.cau.cs.kieler.prom.kibuild.KibuildPackage;
import de.cau.cs.kieler.prom.kibuild.ModelCompiler;
import de.cau.cs.kieler.prom.kibuild.TemplateProcessor;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Compiler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.prom.kibuild.impl.ModelCompilerImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.prom.kibuild.impl.ModelCompilerImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.cau.cs.kieler.prom.kibuild.impl.ModelCompilerImpl#getSimulationCompiler <em>Simulation Compiler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelCompilerImpl extends MinimalEObjectImpl.Container implements ModelCompiler
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
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<AttributeMapping> attributes;

  /**
   * The cached value of the '{@link #getSimulationCompiler() <em>Simulation Compiler</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimulationCompiler()
   * @generated
   * @ordered
   */
  protected TemplateProcessor simulationCompiler;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelCompilerImpl()
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
    return KibuildPackage.Literals.MODEL_COMPILER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KibuildPackage.MODEL_COMPILER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AttributeMapping> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<AttributeMapping>(AttributeMapping.class, this, KibuildPackage.MODEL_COMPILER__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateProcessor getSimulationCompiler()
  {
    return simulationCompiler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSimulationCompiler(TemplateProcessor newSimulationCompiler, NotificationChain msgs)
  {
    TemplateProcessor oldSimulationCompiler = simulationCompiler;
    simulationCompiler = newSimulationCompiler;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KibuildPackage.MODEL_COMPILER__SIMULATION_COMPILER, oldSimulationCompiler, newSimulationCompiler);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSimulationCompiler(TemplateProcessor newSimulationCompiler)
  {
    if (newSimulationCompiler != simulationCompiler)
    {
      NotificationChain msgs = null;
      if (simulationCompiler != null)
        msgs = ((InternalEObject)simulationCompiler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KibuildPackage.MODEL_COMPILER__SIMULATION_COMPILER, null, msgs);
      if (newSimulationCompiler != null)
        msgs = ((InternalEObject)newSimulationCompiler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KibuildPackage.MODEL_COMPILER__SIMULATION_COMPILER, null, msgs);
      msgs = basicSetSimulationCompiler(newSimulationCompiler, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KibuildPackage.MODEL_COMPILER__SIMULATION_COMPILER, newSimulationCompiler, newSimulationCompiler));
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
      case KibuildPackage.MODEL_COMPILER__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case KibuildPackage.MODEL_COMPILER__SIMULATION_COMPILER:
        return basicSetSimulationCompiler(null, msgs);
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
      case KibuildPackage.MODEL_COMPILER__NAME:
        return getName();
      case KibuildPackage.MODEL_COMPILER__ATTRIBUTES:
        return getAttributes();
      case KibuildPackage.MODEL_COMPILER__SIMULATION_COMPILER:
        return getSimulationCompiler();
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
      case KibuildPackage.MODEL_COMPILER__NAME:
        setName((String)newValue);
        return;
      case KibuildPackage.MODEL_COMPILER__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends AttributeMapping>)newValue);
        return;
      case KibuildPackage.MODEL_COMPILER__SIMULATION_COMPILER:
        setSimulationCompiler((TemplateProcessor)newValue);
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
      case KibuildPackage.MODEL_COMPILER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KibuildPackage.MODEL_COMPILER__ATTRIBUTES:
        getAttributes().clear();
        return;
      case KibuildPackage.MODEL_COMPILER__SIMULATION_COMPILER:
        setSimulationCompiler((TemplateProcessor)null);
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
      case KibuildPackage.MODEL_COMPILER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KibuildPackage.MODEL_COMPILER__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case KibuildPackage.MODEL_COMPILER__SIMULATION_COMPILER:
        return simulationCompiler != null;
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

} //ModelCompilerImpl
