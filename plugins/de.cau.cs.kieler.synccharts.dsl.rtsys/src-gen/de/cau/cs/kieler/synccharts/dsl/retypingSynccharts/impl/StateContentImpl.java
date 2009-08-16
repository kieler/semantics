/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl;

import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Signal;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.SignalRenaming;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateContentImpl#getEntryActions <em>Entry Actions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateContentImpl#getInnerAction <em>Inner Action</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateContentImpl#getExitActions <em>Exit Actions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateContentImpl#getSuspensionTrigger <em>Suspension Trigger</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateContentImpl#getSignals <em>Signals</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateContentImpl#getNewStateID <em>New State ID</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateContentImpl#getReferencedState <em>Referenced State</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateContentImpl#getSignalRenamings <em>Signal Renamings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateContentImpl extends MinimalEObjectImpl.Container implements StateContent
{
  /**
   * The cached value of the '{@link #getEntryActions() <em>Entry Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryActions()
   * @generated
   * @ordered
   */
  protected EList<Action> entryActions;

  /**
   * The cached value of the '{@link #getInnerAction() <em>Inner Action</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInnerAction()
   * @generated
   * @ordered
   */
  protected EList<Action> innerAction;

  /**
   * The cached value of the '{@link #getExitActions() <em>Exit Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExitActions()
   * @generated
   * @ordered
   */
  protected EList<Action> exitActions;

  /**
   * The cached value of the '{@link #getSuspensionTrigger() <em>Suspension Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuspensionTrigger()
   * @generated
   * @ordered
   */
  protected Action suspensionTrigger;

  /**
   * The cached value of the '{@link #getSignals() <em>Signals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignals()
   * @generated
   * @ordered
   */
  protected EList<Signal> signals;

  /**
   * The default value of the '{@link #getNewStateID() <em>New State ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewStateID()
   * @generated
   * @ordered
   */
  protected static final String NEW_STATE_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNewStateID() <em>New State ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewStateID()
   * @generated
   * @ordered
   */
  protected String newStateID = NEW_STATE_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getReferencedState() <em>Referenced State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferencedState()
   * @generated
   * @ordered
   */
  protected static final String REFERENCED_STATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReferencedState() <em>Referenced State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferencedState()
   * @generated
   * @ordered
   */
  protected String referencedState = REFERENCED_STATE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSignalRenamings() <em>Signal Renamings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignalRenamings()
   * @generated
   * @ordered
   */
  protected EList<SignalRenaming> signalRenamings;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateContentImpl()
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
    return RetypingSyncchartsPackage.Literals.STATE_CONTENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getEntryActions()
  {
    if (entryActions == null)
    {
      entryActions = new EObjectContainmentEList<Action>(Action.class, this, RetypingSyncchartsPackage.STATE_CONTENT__ENTRY_ACTIONS);
    }
    return entryActions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getInnerAction()
  {
    if (innerAction == null)
    {
      innerAction = new EObjectContainmentEList<Action>(Action.class, this, RetypingSyncchartsPackage.STATE_CONTENT__INNER_ACTION);
    }
    return innerAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getExitActions()
  {
    if (exitActions == null)
    {
      exitActions = new EObjectContainmentEList<Action>(Action.class, this, RetypingSyncchartsPackage.STATE_CONTENT__EXIT_ACTIONS);
    }
    return exitActions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action getSuspensionTrigger()
  {
    return suspensionTrigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSuspensionTrigger(Action newSuspensionTrigger, NotificationChain msgs)
  {
    Action oldSuspensionTrigger = suspensionTrigger;
    suspensionTrigger = newSuspensionTrigger;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.STATE_CONTENT__SUSPENSION_TRIGGER, oldSuspensionTrigger, newSuspensionTrigger);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuspensionTrigger(Action newSuspensionTrigger)
  {
    if (newSuspensionTrigger != suspensionTrigger)
    {
      NotificationChain msgs = null;
      if (suspensionTrigger != null)
        msgs = ((InternalEObject)suspensionTrigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RetypingSyncchartsPackage.STATE_CONTENT__SUSPENSION_TRIGGER, null, msgs);
      if (newSuspensionTrigger != null)
        msgs = ((InternalEObject)newSuspensionTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RetypingSyncchartsPackage.STATE_CONTENT__SUSPENSION_TRIGGER, null, msgs);
      msgs = basicSetSuspensionTrigger(newSuspensionTrigger, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.STATE_CONTENT__SUSPENSION_TRIGGER, newSuspensionTrigger, newSuspensionTrigger));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Signal> getSignals()
  {
    if (signals == null)
    {
      signals = new EObjectContainmentEList<Signal>(Signal.class, this, RetypingSyncchartsPackage.STATE_CONTENT__SIGNALS);
    }
    return signals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNewStateID()
  {
    return newStateID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNewStateID(String newNewStateID)
  {
    String oldNewStateID = newStateID;
    newStateID = newNewStateID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.STATE_CONTENT__NEW_STATE_ID, oldNewStateID, newStateID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReferencedState()
  {
    return referencedState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferencedState(String newReferencedState)
  {
    String oldReferencedState = referencedState;
    referencedState = newReferencedState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.STATE_CONTENT__REFERENCED_STATE, oldReferencedState, referencedState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SignalRenaming> getSignalRenamings()
  {
    if (signalRenamings == null)
    {
      signalRenamings = new EObjectContainmentEList<SignalRenaming>(SignalRenaming.class, this, RetypingSyncchartsPackage.STATE_CONTENT__SIGNAL_RENAMINGS);
    }
    return signalRenamings;
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
      case RetypingSyncchartsPackage.STATE_CONTENT__ENTRY_ACTIONS:
        return ((InternalEList<?>)getEntryActions()).basicRemove(otherEnd, msgs);
      case RetypingSyncchartsPackage.STATE_CONTENT__INNER_ACTION:
        return ((InternalEList<?>)getInnerAction()).basicRemove(otherEnd, msgs);
      case RetypingSyncchartsPackage.STATE_CONTENT__EXIT_ACTIONS:
        return ((InternalEList<?>)getExitActions()).basicRemove(otherEnd, msgs);
      case RetypingSyncchartsPackage.STATE_CONTENT__SUSPENSION_TRIGGER:
        return basicSetSuspensionTrigger(null, msgs);
      case RetypingSyncchartsPackage.STATE_CONTENT__SIGNALS:
        return ((InternalEList<?>)getSignals()).basicRemove(otherEnd, msgs);
      case RetypingSyncchartsPackage.STATE_CONTENT__SIGNAL_RENAMINGS:
        return ((InternalEList<?>)getSignalRenamings()).basicRemove(otherEnd, msgs);
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
      case RetypingSyncchartsPackage.STATE_CONTENT__ENTRY_ACTIONS:
        return getEntryActions();
      case RetypingSyncchartsPackage.STATE_CONTENT__INNER_ACTION:
        return getInnerAction();
      case RetypingSyncchartsPackage.STATE_CONTENT__EXIT_ACTIONS:
        return getExitActions();
      case RetypingSyncchartsPackage.STATE_CONTENT__SUSPENSION_TRIGGER:
        return getSuspensionTrigger();
      case RetypingSyncchartsPackage.STATE_CONTENT__SIGNALS:
        return getSignals();
      case RetypingSyncchartsPackage.STATE_CONTENT__NEW_STATE_ID:
        return getNewStateID();
      case RetypingSyncchartsPackage.STATE_CONTENT__REFERENCED_STATE:
        return getReferencedState();
      case RetypingSyncchartsPackage.STATE_CONTENT__SIGNAL_RENAMINGS:
        return getSignalRenamings();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RetypingSyncchartsPackage.STATE_CONTENT__ENTRY_ACTIONS:
        getEntryActions().clear();
        getEntryActions().addAll((Collection<? extends Action>)newValue);
        return;
      case RetypingSyncchartsPackage.STATE_CONTENT__INNER_ACTION:
        getInnerAction().clear();
        getInnerAction().addAll((Collection<? extends Action>)newValue);
        return;
      case RetypingSyncchartsPackage.STATE_CONTENT__EXIT_ACTIONS:
        getExitActions().clear();
        getExitActions().addAll((Collection<? extends Action>)newValue);
        return;
      case RetypingSyncchartsPackage.STATE_CONTENT__SUSPENSION_TRIGGER:
        setSuspensionTrigger((Action)newValue);
        return;
      case RetypingSyncchartsPackage.STATE_CONTENT__SIGNALS:
        getSignals().clear();
        getSignals().addAll((Collection<? extends Signal>)newValue);
        return;
      case RetypingSyncchartsPackage.STATE_CONTENT__NEW_STATE_ID:
        setNewStateID((String)newValue);
        return;
      case RetypingSyncchartsPackage.STATE_CONTENT__REFERENCED_STATE:
        setReferencedState((String)newValue);
        return;
      case RetypingSyncchartsPackage.STATE_CONTENT__SIGNAL_RENAMINGS:
        getSignalRenamings().clear();
        getSignalRenamings().addAll((Collection<? extends SignalRenaming>)newValue);
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
      case RetypingSyncchartsPackage.STATE_CONTENT__ENTRY_ACTIONS:
        getEntryActions().clear();
        return;
      case RetypingSyncchartsPackage.STATE_CONTENT__INNER_ACTION:
        getInnerAction().clear();
        return;
      case RetypingSyncchartsPackage.STATE_CONTENT__EXIT_ACTIONS:
        getExitActions().clear();
        return;
      case RetypingSyncchartsPackage.STATE_CONTENT__SUSPENSION_TRIGGER:
        setSuspensionTrigger((Action)null);
        return;
      case RetypingSyncchartsPackage.STATE_CONTENT__SIGNALS:
        getSignals().clear();
        return;
      case RetypingSyncchartsPackage.STATE_CONTENT__NEW_STATE_ID:
        setNewStateID(NEW_STATE_ID_EDEFAULT);
        return;
      case RetypingSyncchartsPackage.STATE_CONTENT__REFERENCED_STATE:
        setReferencedState(REFERENCED_STATE_EDEFAULT);
        return;
      case RetypingSyncchartsPackage.STATE_CONTENT__SIGNAL_RENAMINGS:
        getSignalRenamings().clear();
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
      case RetypingSyncchartsPackage.STATE_CONTENT__ENTRY_ACTIONS:
        return entryActions != null && !entryActions.isEmpty();
      case RetypingSyncchartsPackage.STATE_CONTENT__INNER_ACTION:
        return innerAction != null && !innerAction.isEmpty();
      case RetypingSyncchartsPackage.STATE_CONTENT__EXIT_ACTIONS:
        return exitActions != null && !exitActions.isEmpty();
      case RetypingSyncchartsPackage.STATE_CONTENT__SUSPENSION_TRIGGER:
        return suspensionTrigger != null;
      case RetypingSyncchartsPackage.STATE_CONTENT__SIGNALS:
        return signals != null && !signals.isEmpty();
      case RetypingSyncchartsPackage.STATE_CONTENT__NEW_STATE_ID:
        return NEW_STATE_ID_EDEFAULT == null ? newStateID != null : !NEW_STATE_ID_EDEFAULT.equals(newStateID);
      case RetypingSyncchartsPackage.STATE_CONTENT__REFERENCED_STATE:
        return REFERENCED_STATE_EDEFAULT == null ? referencedState != null : !REFERENCED_STATE_EDEFAULT.equals(referencedState);
      case RetypingSyncchartsPackage.STATE_CONTENT__SIGNAL_RENAMINGS:
        return signalRenamings != null && !signalRenamings.isEmpty();
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
    result.append(" (newStateID: ");
    result.append(newStateID);
    result.append(", referencedState: ");
    result.append(referencedState);
    result.append(')');
    return result.toString();
  }

} //StateContentImpl
