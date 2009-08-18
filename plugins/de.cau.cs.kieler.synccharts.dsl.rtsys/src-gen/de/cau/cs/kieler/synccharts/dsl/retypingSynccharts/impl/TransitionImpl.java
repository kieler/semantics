/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl;

import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.TransitionType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.TransitionImpl#getSourceState <em>Source State</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.TransitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.TransitionImpl#getTargetState <em>Target State</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.TransitionImpl#isIsHistory <em>Is History</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends ActionImpl implements Transition
{
  /**
   * The cached value of the '{@link #getSourceState() <em>Source State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceState()
   * @generated
   * @ordered
   */
  protected State sourceState;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final TransitionType TYPE_EDEFAULT = TransitionType.WEAKABORT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected TransitionType type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getTargetState() <em>Target State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetState()
   * @generated
   * @ordered
   */
  protected State targetState;

  /**
   * The default value of the '{@link #isIsHistory() <em>Is History</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsHistory()
   * @generated
   * @ordered
   */
  protected static final boolean IS_HISTORY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsHistory() <em>Is History</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsHistory()
   * @generated
   * @ordered
   */
  protected boolean isHistory = IS_HISTORY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionImpl()
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
    return RetypingSyncchartsPackage.Literals.TRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getSourceState()
  {
    if (sourceState != null && sourceState.eIsProxy())
    {
      InternalEObject oldSourceState = (InternalEObject)sourceState;
      sourceState = (State)eResolveProxy(oldSourceState);
      if (sourceState != oldSourceState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RetypingSyncchartsPackage.TRANSITION__SOURCE_STATE, oldSourceState, sourceState));
      }
    }
    return sourceState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetSourceState()
  {
    return sourceState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceState(State newSourceState)
  {
    State oldSourceState = sourceState;
    sourceState = newSourceState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.TRANSITION__SOURCE_STATE, oldSourceState, sourceState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(TransitionType newType)
  {
    TransitionType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.TRANSITION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getTargetState()
  {
    if (targetState != null && targetState.eIsProxy())
    {
      InternalEObject oldTargetState = (InternalEObject)targetState;
      targetState = (State)eResolveProxy(oldTargetState);
      if (targetState != oldTargetState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RetypingSyncchartsPackage.TRANSITION__TARGET_STATE, oldTargetState, targetState));
      }
    }
    return targetState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetTargetState()
  {
    return targetState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetState(State newTargetState)
  {
    State oldTargetState = targetState;
    targetState = newTargetState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.TRANSITION__TARGET_STATE, oldTargetState, targetState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsHistory()
  {
    return isHistory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsHistory(boolean newIsHistory)
  {
    boolean oldIsHistory = isHistory;
    isHistory = newIsHistory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.TRANSITION__IS_HISTORY, oldIsHistory, isHistory));
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
      case RetypingSyncchartsPackage.TRANSITION__SOURCE_STATE:
        if (resolve) return getSourceState();
        return basicGetSourceState();
      case RetypingSyncchartsPackage.TRANSITION__TYPE:
        return getType();
      case RetypingSyncchartsPackage.TRANSITION__TARGET_STATE:
        if (resolve) return getTargetState();
        return basicGetTargetState();
      case RetypingSyncchartsPackage.TRANSITION__IS_HISTORY:
        return isIsHistory();
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
      case RetypingSyncchartsPackage.TRANSITION__SOURCE_STATE:
        setSourceState((State)newValue);
        return;
      case RetypingSyncchartsPackage.TRANSITION__TYPE:
        setType((TransitionType)newValue);
        return;
      case RetypingSyncchartsPackage.TRANSITION__TARGET_STATE:
        setTargetState((State)newValue);
        return;
      case RetypingSyncchartsPackage.TRANSITION__IS_HISTORY:
        setIsHistory((Boolean)newValue);
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
      case RetypingSyncchartsPackage.TRANSITION__SOURCE_STATE:
        setSourceState((State)null);
        return;
      case RetypingSyncchartsPackage.TRANSITION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RetypingSyncchartsPackage.TRANSITION__TARGET_STATE:
        setTargetState((State)null);
        return;
      case RetypingSyncchartsPackage.TRANSITION__IS_HISTORY:
        setIsHistory(IS_HISTORY_EDEFAULT);
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
      case RetypingSyncchartsPackage.TRANSITION__SOURCE_STATE:
        return sourceState != null;
      case RetypingSyncchartsPackage.TRANSITION__TYPE:
        return type != TYPE_EDEFAULT;
      case RetypingSyncchartsPackage.TRANSITION__TARGET_STATE:
        return targetState != null;
      case RetypingSyncchartsPackage.TRANSITION__IS_HISTORY:
        return isHistory != IS_HISTORY_EDEFAULT;
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
    result.append(" (type: ");
    result.append(type);
    result.append(", isHistory: ");
    result.append(isHistory);
    result.append(')');
    return result.toString();
  }

} //TransitionImpl
