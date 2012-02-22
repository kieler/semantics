/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.sim.eso.eso.impl;

import de.cau.cs.kieler.sim.eso.eso.EsoPackage;
import de.cau.cs.kieler.sim.eso.eso.trace;
import de.cau.cs.kieler.sim.eso.eso.tracelist;

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
 * An implementation of the model object '<em><b>tracelist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sim.eso.eso.impl.tracelistImpl#getTraces <em>Traces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class tracelistImpl extends MinimalEObjectImpl.Container implements tracelist
{
  /**
   * The cached value of the '{@link #getTraces() <em>Traces</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTraces()
   * @generated
   * @ordered
   */
  protected EList<trace> traces;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected tracelistImpl()
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
    return EsoPackage.Literals.TRACELIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<trace> getTraces()
  {
    if (traces == null)
    {
      traces = new EObjectContainmentEList<trace>(trace.class, this, EsoPackage.TRACELIST__TRACES);
    }
    return traces;
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
      case EsoPackage.TRACELIST__TRACES:
        return ((InternalEList<?>)getTraces()).basicRemove(otherEnd, msgs);
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
      case EsoPackage.TRACELIST__TRACES:
        return getTraces();
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
      case EsoPackage.TRACELIST__TRACES:
        getTraces().clear();
        getTraces().addAll((Collection<? extends trace>)newValue);
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
      case EsoPackage.TRACELIST__TRACES:
        getTraces().clear();
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
      case EsoPackage.TRACELIST__TRACES:
        return traces != null && !traces.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //tracelistImpl
