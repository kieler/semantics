/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl;

import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.TransitionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.TransitionImpl#getSourceStateName <em>Source State Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.TransitionImpl#getTransitionType <em>Transition Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.TransitionImpl#getTargetStateName <em>Target State Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.TransitionImpl#getDeclaredTargetState <em>Declared Target State</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.TransitionImpl#getTransitionLabel <em>Transition Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition
{
  /**
   * The default value of the '{@link #getSourceStateName() <em>Source State Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceStateName()
   * @generated
   * @ordered
   */
  protected static final String SOURCE_STATE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSourceStateName() <em>Source State Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceStateName()
   * @generated
   * @ordered
   */
  protected String sourceStateName = SOURCE_STATE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getTransitionType() <em>Transition Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitionType()
   * @generated
   * @ordered
   */
  protected static final TransitionType TRANSITION_TYPE_EDEFAULT = TransitionType.STRONGABORT;

  /**
   * The cached value of the '{@link #getTransitionType() <em>Transition Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitionType()
   * @generated
   * @ordered
   */
  protected TransitionType transitionType = TRANSITION_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getTargetStateName() <em>Target State Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetStateName()
   * @generated
   * @ordered
   */
  protected static final String TARGET_STATE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTargetStateName() <em>Target State Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetStateName()
   * @generated
   * @ordered
   */
  protected String targetStateName = TARGET_STATE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getDeclaredTargetState() <em>Declared Target State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaredTargetState()
   * @generated
   * @ordered
   */
  protected State declaredTargetState;

  /**
   * The cached value of the '{@link #getTransitionLabel() <em>Transition Label</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitionLabel()
   * @generated
   * @ordered
   */
  protected Action transitionLabel;

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
  public String getSourceStateName()
  {
    return sourceStateName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceStateName(String newSourceStateName)
  {
    String oldSourceStateName = sourceStateName;
    sourceStateName = newSourceStateName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.TRANSITION__SOURCE_STATE_NAME, oldSourceStateName, sourceStateName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionType getTransitionType()
  {
    return transitionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransitionType(TransitionType newTransitionType)
  {
    TransitionType oldTransitionType = transitionType;
    transitionType = newTransitionType == null ? TRANSITION_TYPE_EDEFAULT : newTransitionType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.TRANSITION__TRANSITION_TYPE, oldTransitionType, transitionType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTargetStateName()
  {
    return targetStateName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetStateName(String newTargetStateName)
  {
    String oldTargetStateName = targetStateName;
    targetStateName = newTargetStateName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.TRANSITION__TARGET_STATE_NAME, oldTargetStateName, targetStateName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getDeclaredTargetState()
  {
    return declaredTargetState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclaredTargetState(State newDeclaredTargetState, NotificationChain msgs)
  {
    State oldDeclaredTargetState = declaredTargetState;
    declaredTargetState = newDeclaredTargetState;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.TRANSITION__DECLARED_TARGET_STATE, oldDeclaredTargetState, newDeclaredTargetState);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaredTargetState(State newDeclaredTargetState)
  {
    if (newDeclaredTargetState != declaredTargetState)
    {
      NotificationChain msgs = null;
      if (declaredTargetState != null)
        msgs = ((InternalEObject)declaredTargetState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RetypingSyncchartsPackage.TRANSITION__DECLARED_TARGET_STATE, null, msgs);
      if (newDeclaredTargetState != null)
        msgs = ((InternalEObject)newDeclaredTargetState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RetypingSyncchartsPackage.TRANSITION__DECLARED_TARGET_STATE, null, msgs);
      msgs = basicSetDeclaredTargetState(newDeclaredTargetState, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.TRANSITION__DECLARED_TARGET_STATE, newDeclaredTargetState, newDeclaredTargetState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action getTransitionLabel()
  {
    if (transitionLabel != null && transitionLabel.eIsProxy())
    {
      InternalEObject oldTransitionLabel = (InternalEObject)transitionLabel;
      transitionLabel = (Action)eResolveProxy(oldTransitionLabel);
      if (transitionLabel != oldTransitionLabel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RetypingSyncchartsPackage.TRANSITION__TRANSITION_LABEL, oldTransitionLabel, transitionLabel));
      }
    }
    return transitionLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action basicGetTransitionLabel()
  {
    return transitionLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransitionLabel(Action newTransitionLabel)
  {
    Action oldTransitionLabel = transitionLabel;
    transitionLabel = newTransitionLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.TRANSITION__TRANSITION_LABEL, oldTransitionLabel, transitionLabel));
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
      case RetypingSyncchartsPackage.TRANSITION__DECLARED_TARGET_STATE:
        return basicSetDeclaredTargetState(null, msgs);
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
      case RetypingSyncchartsPackage.TRANSITION__SOURCE_STATE_NAME:
        return getSourceStateName();
      case RetypingSyncchartsPackage.TRANSITION__TRANSITION_TYPE:
        return getTransitionType();
      case RetypingSyncchartsPackage.TRANSITION__TARGET_STATE_NAME:
        return getTargetStateName();
      case RetypingSyncchartsPackage.TRANSITION__DECLARED_TARGET_STATE:
        return getDeclaredTargetState();
      case RetypingSyncchartsPackage.TRANSITION__TRANSITION_LABEL:
        if (resolve) return getTransitionLabel();
        return basicGetTransitionLabel();
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
      case RetypingSyncchartsPackage.TRANSITION__SOURCE_STATE_NAME:
        setSourceStateName((String)newValue);
        return;
      case RetypingSyncchartsPackage.TRANSITION__TRANSITION_TYPE:
        setTransitionType((TransitionType)newValue);
        return;
      case RetypingSyncchartsPackage.TRANSITION__TARGET_STATE_NAME:
        setTargetStateName((String)newValue);
        return;
      case RetypingSyncchartsPackage.TRANSITION__DECLARED_TARGET_STATE:
        setDeclaredTargetState((State)newValue);
        return;
      case RetypingSyncchartsPackage.TRANSITION__TRANSITION_LABEL:
        setTransitionLabel((Action)newValue);
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
      case RetypingSyncchartsPackage.TRANSITION__SOURCE_STATE_NAME:
        setSourceStateName(SOURCE_STATE_NAME_EDEFAULT);
        return;
      case RetypingSyncchartsPackage.TRANSITION__TRANSITION_TYPE:
        setTransitionType(TRANSITION_TYPE_EDEFAULT);
        return;
      case RetypingSyncchartsPackage.TRANSITION__TARGET_STATE_NAME:
        setTargetStateName(TARGET_STATE_NAME_EDEFAULT);
        return;
      case RetypingSyncchartsPackage.TRANSITION__DECLARED_TARGET_STATE:
        setDeclaredTargetState((State)null);
        return;
      case RetypingSyncchartsPackage.TRANSITION__TRANSITION_LABEL:
        setTransitionLabel((Action)null);
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
      case RetypingSyncchartsPackage.TRANSITION__SOURCE_STATE_NAME:
        return SOURCE_STATE_NAME_EDEFAULT == null ? sourceStateName != null : !SOURCE_STATE_NAME_EDEFAULT.equals(sourceStateName);
      case RetypingSyncchartsPackage.TRANSITION__TRANSITION_TYPE:
        return transitionType != TRANSITION_TYPE_EDEFAULT;
      case RetypingSyncchartsPackage.TRANSITION__TARGET_STATE_NAME:
        return TARGET_STATE_NAME_EDEFAULT == null ? targetStateName != null : !TARGET_STATE_NAME_EDEFAULT.equals(targetStateName);
      case RetypingSyncchartsPackage.TRANSITION__DECLARED_TARGET_STATE:
        return declaredTargetState != null;
      case RetypingSyncchartsPackage.TRANSITION__TRANSITION_LABEL:
        return transitionLabel != null;
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
    result.append(" (sourceStateName: ");
    result.append(sourceStateName);
    result.append(", transitionType: ");
    result.append(transitionType);
    result.append(", targetStateName: ");
    result.append(targetStateName);
    result.append(')');
    return result.toString();
  }

} //TransitionImpl
