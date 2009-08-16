/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl;

import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Signal;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.SignalRenaming;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Renaming</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.SignalRenamingImpl#getOldSignal <em>Old Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.SignalRenamingImpl#getNewSignal <em>New Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignalRenamingImpl extends MinimalEObjectImpl.Container implements SignalRenaming
{
  /**
   * The cached value of the '{@link #getOldSignal() <em>Old Signal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOldSignal()
   * @generated
   * @ordered
   */
  protected Signal oldSignal;

  /**
   * The cached value of the '{@link #getNewSignal() <em>New Signal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewSignal()
   * @generated
   * @ordered
   */
  protected Signal newSignal;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SignalRenamingImpl()
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
    return RetypingSyncchartsPackage.Literals.SIGNAL_RENAMING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signal getOldSignal()
  {
    if (oldSignal != null && oldSignal.eIsProxy())
    {
      InternalEObject oldOldSignal = (InternalEObject)oldSignal;
      oldSignal = (Signal)eResolveProxy(oldOldSignal);
      if (oldSignal != oldOldSignal)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RetypingSyncchartsPackage.SIGNAL_RENAMING__OLD_SIGNAL, oldOldSignal, oldSignal));
      }
    }
    return oldSignal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signal basicGetOldSignal()
  {
    return oldSignal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOldSignal(Signal newOldSignal)
  {
    Signal oldOldSignal = oldSignal;
    oldSignal = newOldSignal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.SIGNAL_RENAMING__OLD_SIGNAL, oldOldSignal, oldSignal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signal getNewSignal()
  {
    if (newSignal != null && newSignal.eIsProxy())
    {
      InternalEObject oldNewSignal = (InternalEObject)newSignal;
      newSignal = (Signal)eResolveProxy(oldNewSignal);
      if (newSignal != oldNewSignal)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RetypingSyncchartsPackage.SIGNAL_RENAMING__NEW_SIGNAL, oldNewSignal, newSignal));
      }
    }
    return newSignal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signal basicGetNewSignal()
  {
    return newSignal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNewSignal(Signal newNewSignal)
  {
    Signal oldNewSignal = newSignal;
    newSignal = newNewSignal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.SIGNAL_RENAMING__NEW_SIGNAL, oldNewSignal, newSignal));
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
      case RetypingSyncchartsPackage.SIGNAL_RENAMING__OLD_SIGNAL:
        if (resolve) return getOldSignal();
        return basicGetOldSignal();
      case RetypingSyncchartsPackage.SIGNAL_RENAMING__NEW_SIGNAL:
        if (resolve) return getNewSignal();
        return basicGetNewSignal();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RetypingSyncchartsPackage.SIGNAL_RENAMING__OLD_SIGNAL:
        setOldSignal((Signal)newValue);
        return;
      case RetypingSyncchartsPackage.SIGNAL_RENAMING__NEW_SIGNAL:
        setNewSignal((Signal)newValue);
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
      case RetypingSyncchartsPackage.SIGNAL_RENAMING__OLD_SIGNAL:
        setOldSignal((Signal)null);
        return;
      case RetypingSyncchartsPackage.SIGNAL_RENAMING__NEW_SIGNAL:
        setNewSignal((Signal)null);
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
      case RetypingSyncchartsPackage.SIGNAL_RENAMING__OLD_SIGNAL:
        return oldSignal != null;
      case RetypingSyncchartsPackage.SIGNAL_RENAMING__NEW_SIGNAL:
        return newSignal != null;
    }
    return super.eIsSet(featureID);
  }

} //SignalRenamingImpl
