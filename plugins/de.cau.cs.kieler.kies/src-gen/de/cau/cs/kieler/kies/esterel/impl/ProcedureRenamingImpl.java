/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.kies.esterel.impl;

import de.cau.cs.kieler.kies.esterel.EsterelPackage;
import de.cau.cs.kieler.kies.esterel.Procedure;
import de.cau.cs.kieler.kies.esterel.ProcedureRenaming;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Renaming</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.impl.ProcedureRenamingImpl#getNewName <em>New Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.impl.ProcedureRenamingImpl#getOldName <em>Old Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureRenamingImpl extends MinimalEObjectImpl.Container implements ProcedureRenaming
{
  /**
   * The cached value of the '{@link #getNewName() <em>New Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewName()
   * @generated
   * @ordered
   */
  protected Procedure newName;

  /**
   * The cached value of the '{@link #getOldName() <em>Old Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOldName()
   * @generated
   * @ordered
   */
  protected Procedure oldName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcedureRenamingImpl()
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
    return EsterelPackage.Literals.PROCEDURE_RENAMING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Procedure getNewName()
  {
    if (newName != null && newName.eIsProxy())
    {
      InternalEObject oldNewName = (InternalEObject)newName;
      newName = (Procedure)eResolveProxy(oldNewName);
      if (newName != oldNewName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.PROCEDURE_RENAMING__NEW_NAME, oldNewName, newName));
      }
    }
    return newName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Procedure basicGetNewName()
  {
    return newName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNewName(Procedure newNewName)
  {
    Procedure oldNewName = newName;
    newName = newNewName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.PROCEDURE_RENAMING__NEW_NAME, oldNewName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Procedure getOldName()
  {
    if (oldName != null && oldName.eIsProxy())
    {
      InternalEObject oldOldName = (InternalEObject)oldName;
      oldName = (Procedure)eResolveProxy(oldOldName);
      if (oldName != oldOldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.PROCEDURE_RENAMING__OLD_NAME, oldOldName, oldName));
      }
    }
    return oldName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Procedure basicGetOldName()
  {
    return oldName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOldName(Procedure newOldName)
  {
    Procedure oldOldName = oldName;
    oldName = newOldName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.PROCEDURE_RENAMING__OLD_NAME, oldOldName, oldName));
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
      case EsterelPackage.PROCEDURE_RENAMING__NEW_NAME:
        if (resolve) return getNewName();
        return basicGetNewName();
      case EsterelPackage.PROCEDURE_RENAMING__OLD_NAME:
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
      case EsterelPackage.PROCEDURE_RENAMING__NEW_NAME:
        setNewName((Procedure)newValue);
        return;
      case EsterelPackage.PROCEDURE_RENAMING__OLD_NAME:
        setOldName((Procedure)newValue);
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
      case EsterelPackage.PROCEDURE_RENAMING__NEW_NAME:
        setNewName((Procedure)null);
        return;
      case EsterelPackage.PROCEDURE_RENAMING__OLD_NAME:
        setOldName((Procedure)null);
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
      case EsterelPackage.PROCEDURE_RENAMING__NEW_NAME:
        return newName != null;
      case EsterelPackage.PROCEDURE_RENAMING__OLD_NAME:
        return oldName != null;
    }
    return super.eIsSet(featureID);
  }

} //ProcedureRenamingImpl
