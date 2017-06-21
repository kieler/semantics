/**
 */
package de.cau.cs.kieler.kvis.kvis.impl;

import de.cau.cs.kieler.kvis.kvis.BooleanOperator;
import de.cau.cs.kieler.kvis.kvis.KvisPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kvis.kvis.impl.BooleanOperatorImpl#getAND <em>AND</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanOperatorImpl extends MinimalEObjectImpl.Container implements BooleanOperator
{
  /**
   * The default value of the '{@link #getAND() <em>AND</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAND()
   * @generated
   * @ordered
   */
  protected static final String AND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAND() <em>AND</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAND()
   * @generated
   * @ordered
   */
  protected String and = AND_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BooleanOperatorImpl()
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
    return KvisPackage.Literals.BOOLEAN_OPERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAND()
  {
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAND(String newAND)
  {
    String oldAND = and;
    and = newAND;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KvisPackage.BOOLEAN_OPERATOR__AND, oldAND, and));
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
      case KvisPackage.BOOLEAN_OPERATOR__AND:
        return getAND();
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
      case KvisPackage.BOOLEAN_OPERATOR__AND:
        setAND((String)newValue);
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
      case KvisPackage.BOOLEAN_OPERATOR__AND:
        setAND(AND_EDEFAULT);
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
      case KvisPackage.BOOLEAN_OPERATOR__AND:
        return AND_EDEFAULT == null ? and != null : !AND_EDEFAULT.equals(and);
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
    result.append(" (AND: ");
    result.append(and);
    result.append(')');
    return result.toString();
  }

} //BooleanOperatorImpl
