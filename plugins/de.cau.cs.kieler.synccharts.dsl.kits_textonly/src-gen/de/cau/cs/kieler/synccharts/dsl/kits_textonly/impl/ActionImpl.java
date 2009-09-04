/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl;

import de.cau.cs.kieler.synccharts.dsl.kits_textonly.Action;
import de.cau.cs.kieler.synccharts.dsl.kits_textonly.Kits_textonlyPackage;

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
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.ActionImpl#isIsImmediate <em>Is Immediate</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.ActionImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.impl.ActionImpl#getTriggersAndEffects <em>Triggers And Effects</em>}</li>
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
   * The default value of the '{@link #getTriggersAndEffects() <em>Triggers And Effects</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTriggersAndEffects()
   * @generated
   * @ordered
   */
  protected static final String TRIGGERS_AND_EFFECTS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTriggersAndEffects() <em>Triggers And Effects</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTriggersAndEffects()
   * @generated
   * @ordered
   */
  protected String triggersAndEffects = TRIGGERS_AND_EFFECTS_EDEFAULT;

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
    return Kits_textonlyPackage.Literals.ACTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, Kits_textonlyPackage.ACTION__IS_IMMEDIATE, oldIsImmediate, isImmediate));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Kits_textonlyPackage.ACTION__DELAY, oldDelay, delay));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTriggersAndEffects()
  {
    return triggersAndEffects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTriggersAndEffects(String newTriggersAndEffects)
  {
    String oldTriggersAndEffects = triggersAndEffects;
    triggersAndEffects = newTriggersAndEffects;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Kits_textonlyPackage.ACTION__TRIGGERS_AND_EFFECTS, oldTriggersAndEffects, triggersAndEffects));
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
      case Kits_textonlyPackage.ACTION__IS_IMMEDIATE:
        return isIsImmediate();
      case Kits_textonlyPackage.ACTION__DELAY:
        return getDelay();
      case Kits_textonlyPackage.ACTION__TRIGGERS_AND_EFFECTS:
        return getTriggersAndEffects();
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
      case Kits_textonlyPackage.ACTION__IS_IMMEDIATE:
        setIsImmediate((Boolean)newValue);
        return;
      case Kits_textonlyPackage.ACTION__DELAY:
        setDelay((Integer)newValue);
        return;
      case Kits_textonlyPackage.ACTION__TRIGGERS_AND_EFFECTS:
        setTriggersAndEffects((String)newValue);
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
      case Kits_textonlyPackage.ACTION__IS_IMMEDIATE:
        setIsImmediate(IS_IMMEDIATE_EDEFAULT);
        return;
      case Kits_textonlyPackage.ACTION__DELAY:
        setDelay(DELAY_EDEFAULT);
        return;
      case Kits_textonlyPackage.ACTION__TRIGGERS_AND_EFFECTS:
        setTriggersAndEffects(TRIGGERS_AND_EFFECTS_EDEFAULT);
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
      case Kits_textonlyPackage.ACTION__IS_IMMEDIATE:
        return isImmediate != IS_IMMEDIATE_EDEFAULT;
      case Kits_textonlyPackage.ACTION__DELAY:
        return delay != DELAY_EDEFAULT;
      case Kits_textonlyPackage.ACTION__TRIGGERS_AND_EFFECTS:
        return TRIGGERS_AND_EFFECTS_EDEFAULT == null ? triggersAndEffects != null : !TRIGGERS_AND_EFFECTS_EDEFAULT.equals(triggersAndEffects);
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
    result.append(", delay: ");
    result.append(delay);
    result.append(", triggersAndEffects: ");
    result.append(triggersAndEffects);
    result.append(')');
    return result.toString();
  }

} //ActionImpl
