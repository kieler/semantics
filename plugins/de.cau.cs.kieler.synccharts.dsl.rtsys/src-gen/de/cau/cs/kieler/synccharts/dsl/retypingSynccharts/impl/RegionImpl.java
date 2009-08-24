/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl;

import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Region;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Signal;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Variable;

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
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RegionImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RegionImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RegionImpl#getSignals <em>Signals</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RegionImpl#getInnerStates <em>Inner States</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegionImpl extends MinimalEObjectImpl.Container implements Region
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<Variable> variables;

  /**
   * The cached value of the '{@link #getSignals() <em>Signals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignals()
   * @generated
   * @ordered
   */
  protected EList<Signal> signals;

  /**
   * The cached value of the '{@link #getInnerStates() <em>Inner States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInnerStates()
   * @generated
   * @ordered
   */
  protected EList<State> innerStates;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RegionImpl()
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
    return RetypingSyncchartsPackage.Literals.REGION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.REGION__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectContainmentEList<Variable>(Variable.class, this, RetypingSyncchartsPackage.REGION__VARIABLES);
    }
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Signal> getSignals()
  {
    if (signals == null)
    {
      signals = new EObjectContainmentEList<Signal>(Signal.class, this, RetypingSyncchartsPackage.REGION__SIGNALS);
    }
    return signals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<State> getInnerStates()
  {
    if (innerStates == null)
    {
      innerStates = new EObjectContainmentEList<State>(State.class, this, RetypingSyncchartsPackage.REGION__INNER_STATES);
    }
    return innerStates;
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
      case RetypingSyncchartsPackage.REGION__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
      case RetypingSyncchartsPackage.REGION__SIGNALS:
        return ((InternalEList<?>)getSignals()).basicRemove(otherEnd, msgs);
      case RetypingSyncchartsPackage.REGION__INNER_STATES:
        return ((InternalEList<?>)getInnerStates()).basicRemove(otherEnd, msgs);
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
      case RetypingSyncchartsPackage.REGION__ID:
        return getId();
      case RetypingSyncchartsPackage.REGION__VARIABLES:
        return getVariables();
      case RetypingSyncchartsPackage.REGION__SIGNALS:
        return getSignals();
      case RetypingSyncchartsPackage.REGION__INNER_STATES:
        return getInnerStates();
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
      case RetypingSyncchartsPackage.REGION__ID:
        setId((String)newValue);
        return;
      case RetypingSyncchartsPackage.REGION__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends Variable>)newValue);
        return;
      case RetypingSyncchartsPackage.REGION__SIGNALS:
        getSignals().clear();
        getSignals().addAll((Collection<? extends Signal>)newValue);
        return;
      case RetypingSyncchartsPackage.REGION__INNER_STATES:
        getInnerStates().clear();
        getInnerStates().addAll((Collection<? extends State>)newValue);
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
      case RetypingSyncchartsPackage.REGION__ID:
        setId(ID_EDEFAULT);
        return;
      case RetypingSyncchartsPackage.REGION__VARIABLES:
        getVariables().clear();
        return;
      case RetypingSyncchartsPackage.REGION__SIGNALS:
        getSignals().clear();
        return;
      case RetypingSyncchartsPackage.REGION__INNER_STATES:
        getInnerStates().clear();
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
      case RetypingSyncchartsPackage.REGION__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case RetypingSyncchartsPackage.REGION__VARIABLES:
        return variables != null && !variables.isEmpty();
      case RetypingSyncchartsPackage.REGION__SIGNALS:
        return signals != null && !signals.isEmpty();
      case RetypingSyncchartsPackage.REGION__INNER_STATES:
        return innerStates != null && !innerStates.isEmpty();
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
    result.append(" (id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //RegionImpl
