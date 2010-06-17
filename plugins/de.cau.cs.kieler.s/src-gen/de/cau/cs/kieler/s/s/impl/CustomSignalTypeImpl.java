/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.s.s.impl;

import de.cau.cs.kieler.s.s.CustomSignalType;
import de.cau.cs.kieler.s.s.SPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Signal Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.s.s.impl.CustomSignalTypeImpl#getCustomType <em>Custom Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomSignalTypeImpl extends SignalTypeImpl implements CustomSignalType
{
  /**
   * The default value of the '{@link #getCustomType() <em>Custom Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomType()
   * @generated
   * @ordered
   */
  protected static final String CUSTOM_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCustomType() <em>Custom Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomType()
   * @generated
   * @ordered
   */
  protected String customType = CUSTOM_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CustomSignalTypeImpl()
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
    return SPackage.Literals.CUSTOM_SIGNAL_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCustomType()
  {
    return customType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCustomType(String newCustomType)
  {
    String oldCustomType = customType;
    customType = newCustomType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPackage.CUSTOM_SIGNAL_TYPE__CUSTOM_TYPE, oldCustomType, customType));
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
      case SPackage.CUSTOM_SIGNAL_TYPE__CUSTOM_TYPE:
        return getCustomType();
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
      case SPackage.CUSTOM_SIGNAL_TYPE__CUSTOM_TYPE:
        setCustomType((String)newValue);
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
      case SPackage.CUSTOM_SIGNAL_TYPE__CUSTOM_TYPE:
        setCustomType(CUSTOM_TYPE_EDEFAULT);
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
      case SPackage.CUSTOM_SIGNAL_TYPE__CUSTOM_TYPE:
        return CUSTOM_TYPE_EDEFAULT == null ? customType != null : !CUSTOM_TYPE_EDEFAULT.equals(customType);
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
    result.append(" (customType: ");
    result.append(customType);
    result.append(')');
    return result.toString();
  }

} //CustomSignalTypeImpl
