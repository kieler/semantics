/**
 */
package de.cau.cs.kieler.yakindu.model.stext.synctext.impl;

import de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger;
import de.cau.cs.kieler.yakindu.model.stext.synctext.StateReaction;
import de.cau.cs.kieler.yakindu.model.stext.synctext.SynctextPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.yakindu.sct.model.sgraph.Trigger;

import org.yakindu.sct.model.sgraph.impl.TriggerImpl;

import org.yakindu.sct.model.stext.stext.Expression;
import org.yakindu.sct.model.stext.stext.RegularEventSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reaction Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.ReactionTriggerImpl#getStateReaction <em>State Reaction</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.ReactionTriggerImpl#getReactionTrigger <em>Reaction Trigger</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.ReactionTriggerImpl#getLabelPriority <em>Label Priority</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.ReactionTriggerImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.ReactionTriggerImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.ReactionTriggerImpl#getGuardExpression <em>Guard Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReactionTriggerImpl extends TriggerImpl implements ReactionTrigger
{
  /**
   * The cached value of the '{@link #getStateReaction() <em>State Reaction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateReaction()
   * @generated
   * @ordered
   */
  protected StateReaction stateReaction;

  /**
   * The cached value of the '{@link #getReactionTrigger() <em>Reaction Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReactionTrigger()
   * @generated
   * @ordered
   */
  protected Trigger reactionTrigger;

  /**
   * The default value of the '{@link #getLabelPriority() <em>Label Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelPriority()
   * @generated
   * @ordered
   */
  protected static final int LABEL_PRIORITY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLabelPriority() <em>Label Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelPriority()
   * @generated
   * @ordered
   */
  protected int labelPriority = LABEL_PRIORITY_EDEFAULT;

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
   * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrigger()
   * @generated
   * @ordered
   */
  protected RegularEventSpec trigger;

  /**
   * The cached value of the '{@link #getGuardExpression() <em>Guard Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuardExpression()
   * @generated
   * @ordered
   */
  protected Expression guardExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReactionTriggerImpl()
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
    return SynctextPackage.Literals.REACTION_TRIGGER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateReaction getStateReaction()
  {
    return stateReaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStateReaction(StateReaction newStateReaction, NotificationChain msgs)
  {
    StateReaction oldStateReaction = stateReaction;
    stateReaction = newStateReaction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SynctextPackage.REACTION_TRIGGER__STATE_REACTION, oldStateReaction, newStateReaction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStateReaction(StateReaction newStateReaction)
  {
    if (newStateReaction != stateReaction)
    {
      NotificationChain msgs = null;
      if (stateReaction != null)
        msgs = ((InternalEObject)stateReaction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SynctextPackage.REACTION_TRIGGER__STATE_REACTION, null, msgs);
      if (newStateReaction != null)
        msgs = ((InternalEObject)newStateReaction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SynctextPackage.REACTION_TRIGGER__STATE_REACTION, null, msgs);
      msgs = basicSetStateReaction(newStateReaction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SynctextPackage.REACTION_TRIGGER__STATE_REACTION, newStateReaction, newStateReaction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trigger getReactionTrigger()
  {
    return reactionTrigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReactionTrigger(Trigger newReactionTrigger, NotificationChain msgs)
  {
    Trigger oldReactionTrigger = reactionTrigger;
    reactionTrigger = newReactionTrigger;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SynctextPackage.REACTION_TRIGGER__REACTION_TRIGGER, oldReactionTrigger, newReactionTrigger);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReactionTrigger(Trigger newReactionTrigger)
  {
    if (newReactionTrigger != reactionTrigger)
    {
      NotificationChain msgs = null;
      if (reactionTrigger != null)
        msgs = ((InternalEObject)reactionTrigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SynctextPackage.REACTION_TRIGGER__REACTION_TRIGGER, null, msgs);
      if (newReactionTrigger != null)
        msgs = ((InternalEObject)newReactionTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SynctextPackage.REACTION_TRIGGER__REACTION_TRIGGER, null, msgs);
      msgs = basicSetReactionTrigger(newReactionTrigger, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SynctextPackage.REACTION_TRIGGER__REACTION_TRIGGER, newReactionTrigger, newReactionTrigger));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLabelPriority()
  {
    return labelPriority;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabelPriority(int newLabelPriority)
  {
    int oldLabelPriority = labelPriority;
    labelPriority = newLabelPriority;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SynctextPackage.REACTION_TRIGGER__LABEL_PRIORITY, oldLabelPriority, labelPriority));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SynctextPackage.REACTION_TRIGGER__DELAY, oldDelay, delay));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegularEventSpec getTrigger()
  {
    return trigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrigger(RegularEventSpec newTrigger, NotificationChain msgs)
  {
    RegularEventSpec oldTrigger = trigger;
    trigger = newTrigger;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SynctextPackage.REACTION_TRIGGER__TRIGGER, oldTrigger, newTrigger);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrigger(RegularEventSpec newTrigger)
  {
    if (newTrigger != trigger)
    {
      NotificationChain msgs = null;
      if (trigger != null)
        msgs = ((InternalEObject)trigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SynctextPackage.REACTION_TRIGGER__TRIGGER, null, msgs);
      if (newTrigger != null)
        msgs = ((InternalEObject)newTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SynctextPackage.REACTION_TRIGGER__TRIGGER, null, msgs);
      msgs = basicSetTrigger(newTrigger, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SynctextPackage.REACTION_TRIGGER__TRIGGER, newTrigger, newTrigger));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getGuardExpression()
  {
    return guardExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGuardExpression(Expression newGuardExpression, NotificationChain msgs)
  {
    Expression oldGuardExpression = guardExpression;
    guardExpression = newGuardExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SynctextPackage.REACTION_TRIGGER__GUARD_EXPRESSION, oldGuardExpression, newGuardExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGuardExpression(Expression newGuardExpression)
  {
    if (newGuardExpression != guardExpression)
    {
      NotificationChain msgs = null;
      if (guardExpression != null)
        msgs = ((InternalEObject)guardExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SynctextPackage.REACTION_TRIGGER__GUARD_EXPRESSION, null, msgs);
      if (newGuardExpression != null)
        msgs = ((InternalEObject)newGuardExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SynctextPackage.REACTION_TRIGGER__GUARD_EXPRESSION, null, msgs);
      msgs = basicSetGuardExpression(newGuardExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SynctextPackage.REACTION_TRIGGER__GUARD_EXPRESSION, newGuardExpression, newGuardExpression));
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
      case SynctextPackage.REACTION_TRIGGER__STATE_REACTION:
        return basicSetStateReaction(null, msgs);
      case SynctextPackage.REACTION_TRIGGER__REACTION_TRIGGER:
        return basicSetReactionTrigger(null, msgs);
      case SynctextPackage.REACTION_TRIGGER__TRIGGER:
        return basicSetTrigger(null, msgs);
      case SynctextPackage.REACTION_TRIGGER__GUARD_EXPRESSION:
        return basicSetGuardExpression(null, msgs);
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
      case SynctextPackage.REACTION_TRIGGER__STATE_REACTION:
        return getStateReaction();
      case SynctextPackage.REACTION_TRIGGER__REACTION_TRIGGER:
        return getReactionTrigger();
      case SynctextPackage.REACTION_TRIGGER__LABEL_PRIORITY:
        return getLabelPriority();
      case SynctextPackage.REACTION_TRIGGER__DELAY:
        return getDelay();
      case SynctextPackage.REACTION_TRIGGER__TRIGGER:
        return getTrigger();
      case SynctextPackage.REACTION_TRIGGER__GUARD_EXPRESSION:
        return getGuardExpression();
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
      case SynctextPackage.REACTION_TRIGGER__STATE_REACTION:
        setStateReaction((StateReaction)newValue);
        return;
      case SynctextPackage.REACTION_TRIGGER__REACTION_TRIGGER:
        setReactionTrigger((Trigger)newValue);
        return;
      case SynctextPackage.REACTION_TRIGGER__LABEL_PRIORITY:
        setLabelPriority((Integer)newValue);
        return;
      case SynctextPackage.REACTION_TRIGGER__DELAY:
        setDelay((Integer)newValue);
        return;
      case SynctextPackage.REACTION_TRIGGER__TRIGGER:
        setTrigger((RegularEventSpec)newValue);
        return;
      case SynctextPackage.REACTION_TRIGGER__GUARD_EXPRESSION:
        setGuardExpression((Expression)newValue);
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
      case SynctextPackage.REACTION_TRIGGER__STATE_REACTION:
        setStateReaction((StateReaction)null);
        return;
      case SynctextPackage.REACTION_TRIGGER__REACTION_TRIGGER:
        setReactionTrigger((Trigger)null);
        return;
      case SynctextPackage.REACTION_TRIGGER__LABEL_PRIORITY:
        setLabelPriority(LABEL_PRIORITY_EDEFAULT);
        return;
      case SynctextPackage.REACTION_TRIGGER__DELAY:
        setDelay(DELAY_EDEFAULT);
        return;
      case SynctextPackage.REACTION_TRIGGER__TRIGGER:
        setTrigger((RegularEventSpec)null);
        return;
      case SynctextPackage.REACTION_TRIGGER__GUARD_EXPRESSION:
        setGuardExpression((Expression)null);
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
      case SynctextPackage.REACTION_TRIGGER__STATE_REACTION:
        return stateReaction != null;
      case SynctextPackage.REACTION_TRIGGER__REACTION_TRIGGER:
        return reactionTrigger != null;
      case SynctextPackage.REACTION_TRIGGER__LABEL_PRIORITY:
        return labelPriority != LABEL_PRIORITY_EDEFAULT;
      case SynctextPackage.REACTION_TRIGGER__DELAY:
        return delay != DELAY_EDEFAULT;
      case SynctextPackage.REACTION_TRIGGER__TRIGGER:
        return trigger != null;
      case SynctextPackage.REACTION_TRIGGER__GUARD_EXPRESSION:
        return guardExpression != null;
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
    result.append(" (labelPriority: ");
    result.append(labelPriority);
    result.append(", delay: ");
    result.append(delay);
    result.append(')');
    return result.toString();
  }

} //ReactionTriggerImpl
