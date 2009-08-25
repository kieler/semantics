/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl;

import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Renaming;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage;

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
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RenamingImpl#getOldObject <em>Old Object</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RenamingImpl#getNewID <em>New ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RenamingImpl extends MinimalEObjectImpl.Container implements Renaming
{
  /**
   * The default value of the '{@link #getOldObject() <em>Old Object</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOldObject()
   * @generated
   * @ordered
   */
  protected static final String OLD_OBJECT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOldObject() <em>Old Object</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOldObject()
   * @generated
   * @ordered
   */
  protected String oldObject = OLD_OBJECT_EDEFAULT;

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
    return RetypingSyncchartsPackage.Literals.RENAMING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOldObject()
  {
    return oldObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOldObject(String newOldObject)
  {
    String oldOldObject = oldObject;
    oldObject = newOldObject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.RENAMING__OLD_OBJECT, oldOldObject, oldObject));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.RENAMING__NEW_ID, oldNewID, newID));
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
      case RetypingSyncchartsPackage.RENAMING__OLD_OBJECT:
        return getOldObject();
      case RetypingSyncchartsPackage.RENAMING__NEW_ID:
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
      case RetypingSyncchartsPackage.RENAMING__OLD_OBJECT:
        setOldObject((String)newValue);
        return;
      case RetypingSyncchartsPackage.RENAMING__NEW_ID:
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
      case RetypingSyncchartsPackage.RENAMING__OLD_OBJECT:
        setOldObject(OLD_OBJECT_EDEFAULT);
        return;
      case RetypingSyncchartsPackage.RENAMING__NEW_ID:
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
      case RetypingSyncchartsPackage.RENAMING__OLD_OBJECT:
        return OLD_OBJECT_EDEFAULT == null ? oldObject != null : !OLD_OBJECT_EDEFAULT.equals(oldObject);
      case RetypingSyncchartsPackage.RENAMING__NEW_ID:
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
    result.append(" (oldObject: ");
    result.append(oldObject);
    result.append(", newID: ");
    result.append(newID);
    result.append(')');
    return result.toString();
  }

} //RenamingImpl
