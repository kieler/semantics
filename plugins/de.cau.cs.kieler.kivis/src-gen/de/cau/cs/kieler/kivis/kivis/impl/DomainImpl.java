/**
 */
package de.cau.cs.kieler.kivis.kivis.impl;

import de.cau.cs.kieler.kivis.kivis.Domain;
import de.cau.cs.kieler.kivis.kivis.Interval;
import de.cau.cs.kieler.kivis.kivis.KivisPackage;

import de.cau.cs.kieler.prom.kibuild.Literal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.impl.DomainImpl#isOtherValues <em>Other Values</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.impl.DomainImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.impl.DomainImpl#getRange <em>Range</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.impl.DomainImpl#isCurrentValue <em>Current Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain
{
  /**
   * The default value of the '{@link #isOtherValues() <em>Other Values</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOtherValues()
   * @generated
   * @ordered
   */
  protected static final boolean OTHER_VALUES_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOtherValues() <em>Other Values</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOtherValues()
   * @generated
   * @ordered
   */
  protected boolean otherValues = OTHER_VALUES_EDEFAULT;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Literal value;

  /**
   * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
  protected Interval range;

  /**
   * The default value of the '{@link #isCurrentValue() <em>Current Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCurrentValue()
   * @generated
   * @ordered
   */
  protected static final boolean CURRENT_VALUE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCurrentValue() <em>Current Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCurrentValue()
   * @generated
   * @ordered
   */
  protected boolean currentValue = CURRENT_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomainImpl()
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
    return KivisPackage.Literals.DOMAIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOtherValues()
  {
    return otherValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOtherValues(boolean newOtherValues)
  {
    boolean oldOtherValues = otherValues;
    otherValues = newOtherValues;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KivisPackage.DOMAIN__OTHER_VALUES, oldOtherValues, otherValues));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Literal newValue, NotificationChain msgs)
  {
    Literal oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KivisPackage.DOMAIN__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(Literal newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KivisPackage.DOMAIN__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KivisPackage.DOMAIN__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KivisPackage.DOMAIN__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interval getRange()
  {
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRange(Interval newRange, NotificationChain msgs)
  {
    Interval oldRange = range;
    range = newRange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KivisPackage.DOMAIN__RANGE, oldRange, newRange);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRange(Interval newRange)
  {
    if (newRange != range)
    {
      NotificationChain msgs = null;
      if (range != null)
        msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KivisPackage.DOMAIN__RANGE, null, msgs);
      if (newRange != null)
        msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KivisPackage.DOMAIN__RANGE, null, msgs);
      msgs = basicSetRange(newRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KivisPackage.DOMAIN__RANGE, newRange, newRange));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCurrentValue()
  {
    return currentValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCurrentValue(boolean newCurrentValue)
  {
    boolean oldCurrentValue = currentValue;
    currentValue = newCurrentValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KivisPackage.DOMAIN__CURRENT_VALUE, oldCurrentValue, currentValue));
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
      case KivisPackage.DOMAIN__VALUE:
        return basicSetValue(null, msgs);
      case KivisPackage.DOMAIN__RANGE:
        return basicSetRange(null, msgs);
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
      case KivisPackage.DOMAIN__OTHER_VALUES:
        return isOtherValues();
      case KivisPackage.DOMAIN__VALUE:
        return getValue();
      case KivisPackage.DOMAIN__RANGE:
        return getRange();
      case KivisPackage.DOMAIN__CURRENT_VALUE:
        return isCurrentValue();
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
      case KivisPackage.DOMAIN__OTHER_VALUES:
        setOtherValues((Boolean)newValue);
        return;
      case KivisPackage.DOMAIN__VALUE:
        setValue((Literal)newValue);
        return;
      case KivisPackage.DOMAIN__RANGE:
        setRange((Interval)newValue);
        return;
      case KivisPackage.DOMAIN__CURRENT_VALUE:
        setCurrentValue((Boolean)newValue);
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
      case KivisPackage.DOMAIN__OTHER_VALUES:
        setOtherValues(OTHER_VALUES_EDEFAULT);
        return;
      case KivisPackage.DOMAIN__VALUE:
        setValue((Literal)null);
        return;
      case KivisPackage.DOMAIN__RANGE:
        setRange((Interval)null);
        return;
      case KivisPackage.DOMAIN__CURRENT_VALUE:
        setCurrentValue(CURRENT_VALUE_EDEFAULT);
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
      case KivisPackage.DOMAIN__OTHER_VALUES:
        return otherValues != OTHER_VALUES_EDEFAULT;
      case KivisPackage.DOMAIN__VALUE:
        return value != null;
      case KivisPackage.DOMAIN__RANGE:
        return range != null;
      case KivisPackage.DOMAIN__CURRENT_VALUE:
        return currentValue != CURRENT_VALUE_EDEFAULT;
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
    result.append(" (otherValues: ");
    result.append(otherValues);
    result.append(", currentValue: ");
    result.append(currentValue);
    result.append(')');
    return result.toString();
  }

} //DomainImpl
