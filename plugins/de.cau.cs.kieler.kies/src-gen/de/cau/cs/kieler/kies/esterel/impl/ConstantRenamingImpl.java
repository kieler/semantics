/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.kies.esterel.impl;

import de.cau.cs.kieler.core.kexpressions.ValuedObject;

import de.cau.cs.kieler.kies.esterel.ConstantRenaming;
import de.cau.cs.kieler.kies.esterel.EsterelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant Renaming</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.impl.ConstantRenamingImpl#getNewName <em>New Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.impl.ConstantRenamingImpl#getNewValue <em>New Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.impl.ConstantRenamingImpl#getOldName <em>Old Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstantRenamingImpl extends MinimalEObjectImpl.Container implements ConstantRenaming
{
  /**
   * The cached value of the '{@link #getNewName() <em>New Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewName()
   * @generated
   * @ordered
   */
  protected ValuedObject newName;

  /**
   * The default value of the '{@link #getNewValue() <em>New Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewValue()
   * @generated
   * @ordered
   */
  protected static final String NEW_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNewValue() <em>New Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewValue()
   * @generated
   * @ordered
   */
  protected String newValue = NEW_VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getOldName() <em>Old Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOldName()
   * @generated
   * @ordered
   */
  protected ValuedObject oldName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstantRenamingImpl()
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
    return EsterelPackage.Literals.CONSTANT_RENAMING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValuedObject getNewName()
  {
    if (newName != null && newName.eIsProxy())
    {
      InternalEObject oldNewName = (InternalEObject)newName;
      newName = (ValuedObject)eResolveProxy(oldNewName);
      if (newName != oldNewName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.CONSTANT_RENAMING__NEW_NAME, oldNewName, newName));
      }
    }
    return newName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValuedObject basicGetNewName()
  {
    return newName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNewName(ValuedObject newNewName)
  {
    ValuedObject oldNewName = newName;
    newName = newNewName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.CONSTANT_RENAMING__NEW_NAME, oldNewName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNewValue()
  {
    return newValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNewValue(String newNewValue)
  {
    String oldNewValue = newValue;
    newValue = newNewValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.CONSTANT_RENAMING__NEW_VALUE, oldNewValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValuedObject getOldName()
  {
    if (oldName != null && oldName.eIsProxy())
    {
      InternalEObject oldOldName = (InternalEObject)oldName;
      oldName = (ValuedObject)eResolveProxy(oldOldName);
      if (oldName != oldOldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.CONSTANT_RENAMING__OLD_NAME, oldOldName, oldName));
      }
    }
    return oldName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValuedObject basicGetOldName()
  {
    return oldName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOldName(ValuedObject newOldName)
  {
    ValuedObject oldOldName = oldName;
    oldName = newOldName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.CONSTANT_RENAMING__OLD_NAME, oldOldName, oldName));
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
      case EsterelPackage.CONSTANT_RENAMING__NEW_NAME:
        if (resolve) return getNewName();
        return basicGetNewName();
      case EsterelPackage.CONSTANT_RENAMING__NEW_VALUE:
        return getNewValue();
      case EsterelPackage.CONSTANT_RENAMING__OLD_NAME:
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
      case EsterelPackage.CONSTANT_RENAMING__NEW_NAME:
        setNewName((ValuedObject)newValue);
        return;
      case EsterelPackage.CONSTANT_RENAMING__NEW_VALUE:
        setNewValue((String)newValue);
        return;
      case EsterelPackage.CONSTANT_RENAMING__OLD_NAME:
        setOldName((ValuedObject)newValue);
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
      case EsterelPackage.CONSTANT_RENAMING__NEW_NAME:
        setNewName((ValuedObject)null);
        return;
      case EsterelPackage.CONSTANT_RENAMING__NEW_VALUE:
        setNewValue(NEW_VALUE_EDEFAULT);
        return;
      case EsterelPackage.CONSTANT_RENAMING__OLD_NAME:
        setOldName((ValuedObject)null);
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
      case EsterelPackage.CONSTANT_RENAMING__NEW_NAME:
        return newName != null;
      case EsterelPackage.CONSTANT_RENAMING__NEW_VALUE:
        return NEW_VALUE_EDEFAULT == null ? newValue != null : !NEW_VALUE_EDEFAULT.equals(newValue);
      case EsterelPackage.CONSTANT_RENAMING__OLD_NAME:
        return oldName != null;
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
    result.append(" (newValue: ");
    result.append(newValue);
    result.append(')');
    return result.toString();
  }

} //ConstantRenamingImpl
