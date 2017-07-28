/**
 */
package de.cau.cs.kieler.simulation.kisim.impl;

import de.cau.cs.kieler.prom.kibuild.AttributeMapping;

import de.cau.cs.kieler.simulation.kisim.DataHandlerConfiguration;
import de.cau.cs.kieler.simulation.kisim.Execution;
import de.cau.cs.kieler.simulation.kisim.Initialization;
import de.cau.cs.kieler.simulation.kisim.KisimPackage;
import de.cau.cs.kieler.simulation.kisim.SimulationConfiguration;

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
 * An implementation of the model object '<em><b>Simulation Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.simulation.kisim.impl.SimulationConfigurationImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simulation.kisim.impl.SimulationConfigurationImpl#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simulation.kisim.impl.SimulationConfigurationImpl#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simulation.kisim.impl.SimulationConfigurationImpl#getExecution <em>Execution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimulationConfigurationImpl extends MinimalEObjectImpl.Container implements SimulationConfiguration
{
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
   * The cached value of the '{@link #getHandlers() <em>Handlers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHandlers()
   * @generated
   * @ordered
   */
  protected EList<DataHandlerConfiguration> handlers;

  /**
   * The cached value of the '{@link #getInitialization() <em>Initialization</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialization()
   * @generated
   * @ordered
   */
  protected Initialization initialization;

  /**
   * The cached value of the '{@link #getExecution() <em>Execution</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecution()
   * @generated
   * @ordered
   */
  protected Execution execution;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimulationConfigurationImpl()
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
    return KisimPackage.Literals.SIMULATION_CONFIGURATION;
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
      attributes = new EObjectContainmentEList<AttributeMapping>(AttributeMapping.class, this, KisimPackage.SIMULATION_CONFIGURATION__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DataHandlerConfiguration> getHandlers()
  {
    if (handlers == null)
    {
      handlers = new EObjectContainmentEList<DataHandlerConfiguration>(DataHandlerConfiguration.class, this, KisimPackage.SIMULATION_CONFIGURATION__HANDLERS);
    }
    return handlers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Initialization getInitialization()
  {
    return initialization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitialization(Initialization newInitialization, NotificationChain msgs)
  {
    Initialization oldInitialization = initialization;
    initialization = newInitialization;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KisimPackage.SIMULATION_CONFIGURATION__INITIALIZATION, oldInitialization, newInitialization);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialization(Initialization newInitialization)
  {
    if (newInitialization != initialization)
    {
      NotificationChain msgs = null;
      if (initialization != null)
        msgs = ((InternalEObject)initialization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KisimPackage.SIMULATION_CONFIGURATION__INITIALIZATION, null, msgs);
      if (newInitialization != null)
        msgs = ((InternalEObject)newInitialization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KisimPackage.SIMULATION_CONFIGURATION__INITIALIZATION, null, msgs);
      msgs = basicSetInitialization(newInitialization, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KisimPackage.SIMULATION_CONFIGURATION__INITIALIZATION, newInitialization, newInitialization));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Execution getExecution()
  {
    return execution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExecution(Execution newExecution, NotificationChain msgs)
  {
    Execution oldExecution = execution;
    execution = newExecution;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KisimPackage.SIMULATION_CONFIGURATION__EXECUTION, oldExecution, newExecution);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExecution(Execution newExecution)
  {
    if (newExecution != execution)
    {
      NotificationChain msgs = null;
      if (execution != null)
        msgs = ((InternalEObject)execution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KisimPackage.SIMULATION_CONFIGURATION__EXECUTION, null, msgs);
      if (newExecution != null)
        msgs = ((InternalEObject)newExecution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KisimPackage.SIMULATION_CONFIGURATION__EXECUTION, null, msgs);
      msgs = basicSetExecution(newExecution, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KisimPackage.SIMULATION_CONFIGURATION__EXECUTION, newExecution, newExecution));
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
      case KisimPackage.SIMULATION_CONFIGURATION__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case KisimPackage.SIMULATION_CONFIGURATION__HANDLERS:
        return ((InternalEList<?>)getHandlers()).basicRemove(otherEnd, msgs);
      case KisimPackage.SIMULATION_CONFIGURATION__INITIALIZATION:
        return basicSetInitialization(null, msgs);
      case KisimPackage.SIMULATION_CONFIGURATION__EXECUTION:
        return basicSetExecution(null, msgs);
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
      case KisimPackage.SIMULATION_CONFIGURATION__ATTRIBUTES:
        return getAttributes();
      case KisimPackage.SIMULATION_CONFIGURATION__HANDLERS:
        return getHandlers();
      case KisimPackage.SIMULATION_CONFIGURATION__INITIALIZATION:
        return getInitialization();
      case KisimPackage.SIMULATION_CONFIGURATION__EXECUTION:
        return getExecution();
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
      case KisimPackage.SIMULATION_CONFIGURATION__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends AttributeMapping>)newValue);
        return;
      case KisimPackage.SIMULATION_CONFIGURATION__HANDLERS:
        getHandlers().clear();
        getHandlers().addAll((Collection<? extends DataHandlerConfiguration>)newValue);
        return;
      case KisimPackage.SIMULATION_CONFIGURATION__INITIALIZATION:
        setInitialization((Initialization)newValue);
        return;
      case KisimPackage.SIMULATION_CONFIGURATION__EXECUTION:
        setExecution((Execution)newValue);
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
      case KisimPackage.SIMULATION_CONFIGURATION__ATTRIBUTES:
        getAttributes().clear();
        return;
      case KisimPackage.SIMULATION_CONFIGURATION__HANDLERS:
        getHandlers().clear();
        return;
      case KisimPackage.SIMULATION_CONFIGURATION__INITIALIZATION:
        setInitialization((Initialization)null);
        return;
      case KisimPackage.SIMULATION_CONFIGURATION__EXECUTION:
        setExecution((Execution)null);
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
      case KisimPackage.SIMULATION_CONFIGURATION__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case KisimPackage.SIMULATION_CONFIGURATION__HANDLERS:
        return handlers != null && !handlers.isEmpty();
      case KisimPackage.SIMULATION_CONFIGURATION__INITIALIZATION:
        return initialization != null;
      case KisimPackage.SIMULATION_CONFIGURATION__EXECUTION:
        return execution != null;
    }
    return super.eIsSet(featureID);
  }

} //SimulationConfigurationImpl
