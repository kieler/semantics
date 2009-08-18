/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl;

import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ActionImpl#isIsImmediate <em>Is Immediate</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ActionImpl#getTriggersAndEfects <em>Triggers And Efects</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ActionImpl#getDelay <em>Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action
{
  /**
   * The default value of the '{@link #isIsImmediate() <em>Is Immediate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsImmediate()
   * @generated
   * @ordered
   */
  protected static final boolean IS_IMMEDIATE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsImmediate() <em>Is Immediate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsImmediate()
   * @generated
   * @ordered
   */
  protected boolean isImmediate = IS_IMMEDIATE_EDEFAULT;

  /**
   * The default value of the '{@link #getTriggersAndEfects() <em>Triggers And Efects</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTriggersAndEfects()
   * @generated
   * @ordered
   */
  protected static final String TRIGGERS_AND_EFECTS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTriggersAndEfects() <em>Triggers And Efects</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTriggersAndEfects()
   * @generated
   * @ordered
   */
  protected String triggersAndEfects = TRIGGERS_AND_EFECTS_EDEFAULT;

  /**
   * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelay()
   * @generated
   * @ordered
   */
  protected static final int DELAY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelay()
   * @generated
   * @ordered
   */
  protected int delay = DELAY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionImpl()
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
    return RetypingSyncchartsPackage.Literals.ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsImmediate()
  {
    return isImmediate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsImmediate(boolean newIsImmediate)
  {
    boolean oldIsImmediate = isImmediate;
    isImmediate = newIsImmediate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.ACTION__IS_IMMEDIATE, oldIsImmediate, isImmediate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTriggersAndEfects()
  {
    return triggersAndEfects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTriggersAndEfects(String newTriggersAndEfects)
  {
    String oldTriggersAndEfects = triggersAndEfects;
    triggersAndEfects = newTriggersAndEfects;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.ACTION__TRIGGERS_AND_EFECTS, oldTriggersAndEfects, triggersAndEfects));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDelay()
  {
    return delay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelay(int newDelay)
  {
    int oldDelay = delay;
    delay = newDelay;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.ACTION__DELAY, oldDelay, delay));
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
      case RetypingSyncchartsPackage.ACTION__IS_IMMEDIATE:
        return isIsImmediate();
      case RetypingSyncchartsPackage.ACTION__TRIGGERS_AND_EFECTS:
        return getTriggersAndEfects();
      case RetypingSyncchartsPackage.ACTION__DELAY:
        return getDelay();
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
      case RetypingSyncchartsPackage.ACTION__IS_IMMEDIATE:
        setIsImmediate((Boolean)newValue);
        return;
      case RetypingSyncchartsPackage.ACTION__TRIGGERS_AND_EFECTS:
        setTriggersAndEfects((String)newValue);
        return;
      case RetypingSyncchartsPackage.ACTION__DELAY:
        setDelay((Integer)newValue);
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
      case RetypingSyncchartsPackage.ACTION__IS_IMMEDIATE:
        setIsImmediate(IS_IMMEDIATE_EDEFAULT);
        return;
      case RetypingSyncchartsPackage.ACTION__TRIGGERS_AND_EFECTS:
        setTriggersAndEfects(TRIGGERS_AND_EFECTS_EDEFAULT);
        return;
      case RetypingSyncchartsPackage.ACTION__DELAY:
        setDelay(DELAY_EDEFAULT);
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
      case RetypingSyncchartsPackage.ACTION__IS_IMMEDIATE:
        return isImmediate != IS_IMMEDIATE_EDEFAULT;
      case RetypingSyncchartsPackage.ACTION__TRIGGERS_AND_EFECTS:
        return TRIGGERS_AND_EFECTS_EDEFAULT == null ? triggersAndEfects != null : !TRIGGERS_AND_EFECTS_EDEFAULT.equals(triggersAndEfects);
      case RetypingSyncchartsPackage.ACTION__DELAY:
        return delay != DELAY_EDEFAULT;
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
    result.append(" (isImmediate: ");
    result.append(isImmediate);
    result.append(", triggersAndEfects: ");
    result.append(triggersAndEfects);
    result.append(", delay: ");
    result.append(delay);
    result.append(')');
    return result.toString();
  }

} //ActionImpl
