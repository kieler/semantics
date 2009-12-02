/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.Signal;
import de.cau.cs.kieler.esterel.esterel.SignalRenaming;

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
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.SignalRenamingImpl#getNewName <em>New Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.SignalRenamingImpl#getOldName <em>Old Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignalRenamingImpl extends MinimalEObjectImpl.Container implements SignalRenaming
{
  /**
   * The cached value of the '{@link #getNewName() <em>New Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewName()
   * @generated
   * @ordered
   */
  protected Signal newName;

  /**
   * The cached value of the '{@link #getOldName() <em>Old Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOldName()
   * @generated
   * @ordered
   */
  protected Signal oldName;

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
    return EsterelPackage.Literals.SIGNAL_RENAMING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signal getNewName()
  {
    if (newName != null && newName.eIsProxy())
    {
      InternalEObject oldNewName = (InternalEObject)newName;
      newName = (Signal)eResolveProxy(oldNewName);
      if (newName != oldNewName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.SIGNAL_RENAMING__NEW_NAME, oldNewName, newName));
      }
    }
    return newName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signal basicGetNewName()
  {
    return newName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNewName(Signal newNewName)
  {
    Signal oldNewName = newName;
    newName = newNewName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.SIGNAL_RENAMING__NEW_NAME, oldNewName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signal getOldName()
  {
    if (oldName != null && oldName.eIsProxy())
    {
      InternalEObject oldOldName = (InternalEObject)oldName;
      oldName = (Signal)eResolveProxy(oldOldName);
      if (oldName != oldOldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.SIGNAL_RENAMING__OLD_NAME, oldOldName, oldName));
      }
    }
    return oldName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signal basicGetOldName()
  {
    return oldName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOldName(Signal newOldName)
  {
    Signal oldOldName = oldName;
    oldName = newOldName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.SIGNAL_RENAMING__OLD_NAME, oldOldName, oldName));
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
      case EsterelPackage.SIGNAL_RENAMING__NEW_NAME:
        if (resolve) return getNewName();
        return basicGetNewName();
      case EsterelPackage.SIGNAL_RENAMING__OLD_NAME:
        if (resolve) return getOldName();
        return basicGetOldName();
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
      case EsterelPackage.SIGNAL_RENAMING__NEW_NAME:
        setNewName((Signal)newValue);
        return;
      case EsterelPackage.SIGNAL_RENAMING__OLD_NAME:
        setOldName((Signal)newValue);
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
      case EsterelPackage.SIGNAL_RENAMING__NEW_NAME:
        setNewName((Signal)null);
        return;
      case EsterelPackage.SIGNAL_RENAMING__OLD_NAME:
        setOldName((Signal)null);
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
      case EsterelPackage.SIGNAL_RENAMING__NEW_NAME:
        return newName != null;
      case EsterelPackage.SIGNAL_RENAMING__OLD_NAME:
        return oldName != null;
    }
    return super.eIsSet(featureID);
  }

} //SignalRenamingImpl
