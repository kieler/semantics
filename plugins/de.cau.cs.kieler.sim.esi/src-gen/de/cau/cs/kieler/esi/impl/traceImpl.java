/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esi.impl;

import de.cau.cs.kieler.esi.EsiPackage;
import de.cau.cs.kieler.esi.tick;
import de.cau.cs.kieler.esi.trace;

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
 * An implementation of the model object '<em><b>trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esi.impl.traceImpl#getTicks <em>Ticks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class traceImpl extends MinimalEObjectImpl.Container implements trace
{
  /**
   * The cached value of the '{@link #getTicks() <em>Ticks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTicks()
   * @generated
   * @ordered
   */
  protected EList<tick> ticks;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected traceImpl()
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
    return EsiPackage.Literals.TRACE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<tick> getTicks()
  {
    if (ticks == null)
    {
      ticks = new EObjectContainmentEList<tick>(tick.class, this, EsiPackage.TRACE__TICKS);
    }
    return ticks;
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
      case EsiPackage.TRACE__TICKS:
        return ((InternalEList<?>)getTicks()).basicRemove(otherEnd, msgs);
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
      case EsiPackage.TRACE__TICKS:
        return getTicks();
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
      case EsiPackage.TRACE__TICKS:
        getTicks().clear();
        getTicks().addAll((Collection<? extends tick>)newValue);
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
      case EsiPackage.TRACE__TICKS:
        getTicks().clear();
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
      case EsiPackage.TRACE__TICKS:
        return ticks != null && !ticks.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //traceImpl
