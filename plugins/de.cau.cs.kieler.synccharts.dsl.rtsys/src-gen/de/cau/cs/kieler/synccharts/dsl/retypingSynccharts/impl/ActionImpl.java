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
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ActionImpl#getEntryAction <em>Entry Action</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ActionImpl#getInnerAction <em>Inner Action</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ActionImpl#getExitAction <em>Exit Action</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ActionImpl#getSuspensionTrigger <em>Suspension Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action
{
  /**
   * The default value of the '{@link #getEntryAction() <em>Entry Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryAction()
   * @generated
   * @ordered
   */
  protected static final String ENTRY_ACTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEntryAction() <em>Entry Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryAction()
   * @generated
   * @ordered
   */
  protected String entryAction = ENTRY_ACTION_EDEFAULT;

  /**
   * The default value of the '{@link #getInnerAction() <em>Inner Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInnerAction()
   * @generated
   * @ordered
   */
  protected static final String INNER_ACTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInnerAction() <em>Inner Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInnerAction()
   * @generated
   * @ordered
   */
  protected String innerAction = INNER_ACTION_EDEFAULT;

  /**
   * The default value of the '{@link #getExitAction() <em>Exit Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExitAction()
   * @generated
   * @ordered
   */
  protected static final String EXIT_ACTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExitAction() <em>Exit Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExitAction()
   * @generated
   * @ordered
   */
  protected String exitAction = EXIT_ACTION_EDEFAULT;

  /**
   * The default value of the '{@link #getSuspensionTrigger() <em>Suspension Trigger</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuspensionTrigger()
   * @generated
   * @ordered
   */
  protected static final String SUSPENSION_TRIGGER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSuspensionTrigger() <em>Suspension Trigger</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuspensionTrigger()
   * @generated
   * @ordered
   */
  protected String suspensionTrigger = SUSPENSION_TRIGGER_EDEFAULT;

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
  public String getEntryAction()
  {
    return entryAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntryAction(String newEntryAction)
  {
    String oldEntryAction = entryAction;
    entryAction = newEntryAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.ACTION__ENTRY_ACTION, oldEntryAction, entryAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInnerAction()
  {
    return innerAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInnerAction(String newInnerAction)
  {
    String oldInnerAction = innerAction;
    innerAction = newInnerAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.ACTION__INNER_ACTION, oldInnerAction, innerAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExitAction()
  {
    return exitAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExitAction(String newExitAction)
  {
    String oldExitAction = exitAction;
    exitAction = newExitAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.ACTION__EXIT_ACTION, oldExitAction, exitAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSuspensionTrigger()
  {
    return suspensionTrigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuspensionTrigger(String newSuspensionTrigger)
  {
    String oldSuspensionTrigger = suspensionTrigger;
    suspensionTrigger = newSuspensionTrigger;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.ACTION__SUSPENSION_TRIGGER, oldSuspensionTrigger, suspensionTrigger));
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
      case RetypingSyncchartsPackage.ACTION__ENTRY_ACTION:
        return getEntryAction();
      case RetypingSyncchartsPackage.ACTION__INNER_ACTION:
        return getInnerAction();
      case RetypingSyncchartsPackage.ACTION__EXIT_ACTION:
        return getExitAction();
      case RetypingSyncchartsPackage.ACTION__SUSPENSION_TRIGGER:
        return getSuspensionTrigger();
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
      case RetypingSyncchartsPackage.ACTION__ENTRY_ACTION:
        setEntryAction((String)newValue);
        return;
      case RetypingSyncchartsPackage.ACTION__INNER_ACTION:
        setInnerAction((String)newValue);
        return;
      case RetypingSyncchartsPackage.ACTION__EXIT_ACTION:
        setExitAction((String)newValue);
        return;
      case RetypingSyncchartsPackage.ACTION__SUSPENSION_TRIGGER:
        setSuspensionTrigger((String)newValue);
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
      case RetypingSyncchartsPackage.ACTION__ENTRY_ACTION:
        setEntryAction(ENTRY_ACTION_EDEFAULT);
        return;
      case RetypingSyncchartsPackage.ACTION__INNER_ACTION:
        setInnerAction(INNER_ACTION_EDEFAULT);
        return;
      case RetypingSyncchartsPackage.ACTION__EXIT_ACTION:
        setExitAction(EXIT_ACTION_EDEFAULT);
        return;
      case RetypingSyncchartsPackage.ACTION__SUSPENSION_TRIGGER:
        setSuspensionTrigger(SUSPENSION_TRIGGER_EDEFAULT);
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
      case RetypingSyncchartsPackage.ACTION__ENTRY_ACTION:
        return ENTRY_ACTION_EDEFAULT == null ? entryAction != null : !ENTRY_ACTION_EDEFAULT.equals(entryAction);
      case RetypingSyncchartsPackage.ACTION__INNER_ACTION:
        return INNER_ACTION_EDEFAULT == null ? innerAction != null : !INNER_ACTION_EDEFAULT.equals(innerAction);
      case RetypingSyncchartsPackage.ACTION__EXIT_ACTION:
        return EXIT_ACTION_EDEFAULT == null ? exitAction != null : !EXIT_ACTION_EDEFAULT.equals(exitAction);
      case RetypingSyncchartsPackage.ACTION__SUSPENSION_TRIGGER:
        return SUSPENSION_TRIGGER_EDEFAULT == null ? suspensionTrigger != null : !SUSPENSION_TRIGGER_EDEFAULT.equals(suspensionTrigger);
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
    result.append(" (entryAction: ");
    result.append(entryAction);
    result.append(", innerAction: ");
    result.append(innerAction);
    result.append(", exitAction: ");
    result.append(exitAction);
    result.append(", suspensionTrigger: ");
    result.append(suspensionTrigger);
    result.append(')');
    return result.toString();
  }

} //ActionImpl
