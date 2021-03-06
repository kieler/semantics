/**
 * generated by Xtext
 */
package de.cau.cs.kieler.lustre.lustre.impl;

import de.cau.cs.kieler.kexpressions.Expression;

import de.cau.cs.kieler.kexpressions.keffects.Effect;

import de.cau.cs.kieler.lustre.lustre.AnAction;
import de.cau.cs.kieler.lustre.lustre.LustrePackage;
import de.cau.cs.kieler.lustre.lustre.StateValuedObject;

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
 * An implementation of the model object '<em><b>An Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.lustre.lustre.impl.AnActionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.cau.cs.kieler.lustre.lustre.impl.AnActionImpl#getEffects <em>Effects</em>}</li>
 *   <li>{@link de.cau.cs.kieler.lustre.lustre.impl.AnActionImpl#isHistory <em>History</em>}</li>
 *   <li>{@link de.cau.cs.kieler.lustre.lustre.impl.AnActionImpl#getNextState <em>Next State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnActionImpl extends MinimalEObjectImpl.Container implements AnAction
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Expression condition;

  /**
   * The cached value of the '{@link #getEffects() <em>Effects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEffects()
   * @generated
   * @ordered
   */
  protected EList<Effect> effects;

  /**
   * The default value of the '{@link #isHistory() <em>History</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHistory()
   * @generated
   * @ordered
   */
  protected static final boolean HISTORY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHistory() <em>History</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHistory()
   * @generated
   * @ordered
   */
  protected boolean history = HISTORY_EDEFAULT;

  /**
   * The cached value of the '{@link #getNextState() <em>Next State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNextState()
   * @generated
   * @ordered
   */
  protected StateValuedObject nextState;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnActionImpl()
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
    return LustrePackage.Literals.AN_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs)
  {
    Expression oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LustrePackage.AN_ACTION__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCondition(Expression newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LustrePackage.AN_ACTION__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LustrePackage.AN_ACTION__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LustrePackage.AN_ACTION__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Effect> getEffects()
  {
    if (effects == null)
    {
      effects = new EObjectContainmentEList<Effect>(Effect.class, this, LustrePackage.AN_ACTION__EFFECTS);
    }
    return effects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isHistory()
  {
    return history;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHistory(boolean newHistory)
  {
    boolean oldHistory = history;
    history = newHistory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LustrePackage.AN_ACTION__HISTORY, oldHistory, history));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StateValuedObject getNextState()
  {
    if (nextState != null && nextState.eIsProxy())
    {
      InternalEObject oldNextState = (InternalEObject)nextState;
      nextState = (StateValuedObject)eResolveProxy(oldNextState);
      if (nextState != oldNextState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LustrePackage.AN_ACTION__NEXT_STATE, oldNextState, nextState));
      }
    }
    return nextState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateValuedObject basicGetNextState()
  {
    return nextState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNextState(StateValuedObject newNextState)
  {
    StateValuedObject oldNextState = nextState;
    nextState = newNextState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LustrePackage.AN_ACTION__NEXT_STATE, oldNextState, nextState));
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
      case LustrePackage.AN_ACTION__CONDITION:
        return basicSetCondition(null, msgs);
      case LustrePackage.AN_ACTION__EFFECTS:
        return ((InternalEList<?>)getEffects()).basicRemove(otherEnd, msgs);
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
      case LustrePackage.AN_ACTION__CONDITION:
        return getCondition();
      case LustrePackage.AN_ACTION__EFFECTS:
        return getEffects();
      case LustrePackage.AN_ACTION__HISTORY:
        return isHistory();
      case LustrePackage.AN_ACTION__NEXT_STATE:
        if (resolve) return getNextState();
        return basicGetNextState();
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
      case LustrePackage.AN_ACTION__CONDITION:
        setCondition((Expression)newValue);
        return;
      case LustrePackage.AN_ACTION__EFFECTS:
        getEffects().clear();
        getEffects().addAll((Collection<? extends Effect>)newValue);
        return;
      case LustrePackage.AN_ACTION__HISTORY:
        setHistory((Boolean)newValue);
        return;
      case LustrePackage.AN_ACTION__NEXT_STATE:
        setNextState((StateValuedObject)newValue);
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
      case LustrePackage.AN_ACTION__CONDITION:
        setCondition((Expression)null);
        return;
      case LustrePackage.AN_ACTION__EFFECTS:
        getEffects().clear();
        return;
      case LustrePackage.AN_ACTION__HISTORY:
        setHistory(HISTORY_EDEFAULT);
        return;
      case LustrePackage.AN_ACTION__NEXT_STATE:
        setNextState((StateValuedObject)null);
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
      case LustrePackage.AN_ACTION__CONDITION:
        return condition != null;
      case LustrePackage.AN_ACTION__EFFECTS:
        return effects != null && !effects.isEmpty();
      case LustrePackage.AN_ACTION__HISTORY:
        return history != HISTORY_EDEFAULT;
      case LustrePackage.AN_ACTION__NEXT_STATE:
        return nextState != null;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (history: ");
    result.append(history);
    result.append(')');
    return result.toString();
  }

} //AnActionImpl
