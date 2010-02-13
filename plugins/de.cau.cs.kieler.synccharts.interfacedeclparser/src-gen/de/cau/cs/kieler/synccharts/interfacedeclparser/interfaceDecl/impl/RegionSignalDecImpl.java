/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.impl;

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.Variable;

import de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.InterfaceDeclPackage;
import de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.RegionSignalDec;

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
 * An implementation of the model object '<em><b>Region Signal Dec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.impl.RegionSignalDecImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.impl.RegionSignalDecImpl#getVars <em>Vars</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.interfacedeclparser.interfaceDecl.impl.RegionSignalDecImpl#getSignals <em>Signals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegionSignalDecImpl extends MinimalEObjectImpl.Container implements RegionSignalDec
{
  /**
   * The cached value of the '{@link #getRegion() <em>Region</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegion()
   * @generated
   * @ordered
   */
  protected Region region;

  /**
   * The cached value of the '{@link #getVars() <em>Vars</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVars()
   * @generated
   * @ordered
   */
  protected EList<Variable> vars;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RegionSignalDecImpl()
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
    return InterfaceDeclPackage.Literals.REGION_SIGNAL_DEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Region getRegion()
  {
    if (region != null && region.eIsProxy())
    {
      InternalEObject oldRegion = (InternalEObject)region;
      region = (Region)eResolveProxy(oldRegion);
      if (region != oldRegion)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, InterfaceDeclPackage.REGION_SIGNAL_DEC__REGION, oldRegion, region));
      }
    }
    return region;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Region basicGetRegion()
  {
    return region;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRegion(Region newRegion)
  {
    Region oldRegion = region;
    region = newRegion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InterfaceDeclPackage.REGION_SIGNAL_DEC__REGION, oldRegion, region));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getVars()
  {
    if (vars == null)
    {
      vars = new EObjectContainmentEList<Variable>(Variable.class, this, InterfaceDeclPackage.REGION_SIGNAL_DEC__VARS);
    }
    return vars;
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
      signals = new EObjectContainmentEList<Signal>(Signal.class, this, InterfaceDeclPackage.REGION_SIGNAL_DEC__SIGNALS);
    }
    return signals;
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
      case InterfaceDeclPackage.REGION_SIGNAL_DEC__VARS:
        return ((InternalEList<?>)getVars()).basicRemove(otherEnd, msgs);
      case InterfaceDeclPackage.REGION_SIGNAL_DEC__SIGNALS:
        return ((InternalEList<?>)getSignals()).basicRemove(otherEnd, msgs);
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
      case InterfaceDeclPackage.REGION_SIGNAL_DEC__REGION:
        if (resolve) return getRegion();
        return basicGetRegion();
      case InterfaceDeclPackage.REGION_SIGNAL_DEC__VARS:
        return getVars();
      case InterfaceDeclPackage.REGION_SIGNAL_DEC__SIGNALS:
        return getSignals();
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
      case InterfaceDeclPackage.REGION_SIGNAL_DEC__REGION:
        setRegion((Region)newValue);
        return;
      case InterfaceDeclPackage.REGION_SIGNAL_DEC__VARS:
        getVars().clear();
        getVars().addAll((Collection<? extends Variable>)newValue);
        return;
      case InterfaceDeclPackage.REGION_SIGNAL_DEC__SIGNALS:
        getSignals().clear();
        getSignals().addAll((Collection<? extends Signal>)newValue);
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
      case InterfaceDeclPackage.REGION_SIGNAL_DEC__REGION:
        setRegion((Region)null);
        return;
      case InterfaceDeclPackage.REGION_SIGNAL_DEC__VARS:
        getVars().clear();
        return;
      case InterfaceDeclPackage.REGION_SIGNAL_DEC__SIGNALS:
        getSignals().clear();
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
      case InterfaceDeclPackage.REGION_SIGNAL_DEC__REGION:
        return region != null;
      case InterfaceDeclPackage.REGION_SIGNAL_DEC__VARS:
        return vars != null && !vars.isEmpty();
      case InterfaceDeclPackage.REGION_SIGNAL_DEC__SIGNALS:
        return signals != null && !signals.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RegionSignalDecImpl
