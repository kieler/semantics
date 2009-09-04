/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl;

import de.cau.cs.kieler.synccharts.dsl.kits_textonly.Kits_textonlyPackage;
import de.cau.cs.kieler.synccharts.dsl.kits_textonly.Renaming;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Renaming</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.RenamingImpl#getOldID <em>Old ID</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.RenamingImpl#getNewID <em>New ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RenamingImpl extends MinimalEObjectImpl.Container implements Renaming
{
  /**
   * The default value of the '{@link #getOldID() <em>Old ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOldID()
   * @generated
   * @ordered
   */
  protected static final String OLD_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOldID() <em>Old ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOldID()
   * @generated
   * @ordered
   */
  protected String oldID = OLD_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getNewID() <em>New ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewID()
   * @generated
   * @ordered
   */
  protected static final String NEW_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNewID() <em>New ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewID()
   * @generated
   * @ordered
   */
  protected String newID = NEW_ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RenamingImpl()
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
    return Kits_textonlyPackage.Literals.RENAMING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOldID()
  {
    return oldID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOldID(String newOldID)
  {
    String oldOldID = oldID;
    oldID = newOldID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Kits_textonlyPackage.RENAMING__OLD_ID, oldOldID, oldID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNewID()
  {
    return newID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNewID(String newNewID)
  {
    String oldNewID = newID;
    newID = newNewID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Kits_textonlyPackage.RENAMING__NEW_ID, oldNewID, newID));
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
      case Kits_textonlyPackage.RENAMING__OLD_ID:
        return getOldID();
      case Kits_textonlyPackage.RENAMING__NEW_ID:
        return getNewID();
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
      case Kits_textonlyPackage.RENAMING__OLD_ID:
        setOldID((String)newValue);
        return;
      case Kits_textonlyPackage.RENAMING__NEW_ID:
        setNewID((String)newValue);
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
      case Kits_textonlyPackage.RENAMING__OLD_ID:
        setOldID(OLD_ID_EDEFAULT);
        return;
      case Kits_textonlyPackage.RENAMING__NEW_ID:
        setNewID(NEW_ID_EDEFAULT);
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
      case Kits_textonlyPackage.RENAMING__OLD_ID:
        return OLD_ID_EDEFAULT == null ? oldID != null : !OLD_ID_EDEFAULT.equals(oldID);
      case Kits_textonlyPackage.RENAMING__NEW_ID:
        return NEW_ID_EDEFAULT == null ? newID != null : !NEW_ID_EDEFAULT.equals(newID);
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
    result.append(" (oldID: ");
    result.append(oldID);
    result.append(", newID: ");
    result.append(newID);
    result.append(')');
    return result.toString();
  }

} //RenamingImpl
