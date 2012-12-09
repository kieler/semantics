/**
 */
package de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.sCChartsExp.impl;

import de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.sCChartsExp.ReactionTrigger;
import de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.sCChartsExp.SCChartsExpPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.yakindu.sct.model.sgraph.impl.TriggerImpl;

import org.yakindu.sct.model.stext.stext.EventSpec;
import org.yakindu.sct.model.stext.stext.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reaction Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.sCChartsExp.impl.ReactionTriggerImpl#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.sCChartsExp.impl.ReactionTriggerImpl#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.sCChartsExp.impl.ReactionTriggerImpl#isIsImmediate <em>Is Immediate</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.sCChartsExp.impl.ReactionTriggerImpl#getDelay <em>Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReactionTriggerImpl extends TriggerImpl implements ReactionTrigger
{
  /**
   * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTriggers()
   * @generated
   * @ordered
   */
  protected EList<EventSpec> triggers;

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
    return SCChartsExpPackage.Literals.REACTION_TRIGGER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EventSpec> getTriggers()
  {
    if (triggers == null)
    {
      triggers = new EObjectContainmentEList<EventSpec>(EventSpec.class, this, SCChartsExpPackage.REACTION_TRIGGER__TRIGGERS);
    }
    return triggers;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCChartsExpPackage.REACTION_TRIGGER__GUARD_EXPRESSION, oldGuardExpression, newGuardExpression);
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
        msgs = ((InternalEObject)guardExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SCChartsExpPackage.REACTION_TRIGGER__GUARD_EXPRESSION, null, msgs);
      if (newGuardExpression != null)
        msgs = ((InternalEObject)newGuardExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SCChartsExpPackage.REACTION_TRIGGER__GUARD_EXPRESSION, null, msgs);
      msgs = basicSetGuardExpression(newGuardExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SCChartsExpPackage.REACTION_TRIGGER__GUARD_EXPRESSION, newGuardExpression, newGuardExpression));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SCChartsExpPackage.REACTION_TRIGGER__IS_IMMEDIATE, oldIsImmediate, isImmediate));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SCChartsExpPackage.REACTION_TRIGGER__DELAY, oldDelay, delay));
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
      case SCChartsExpPackage.REACTION_TRIGGER__TRIGGERS:
        return ((InternalEList<?>)getTriggers()).basicRemove(otherEnd, msgs);
      case SCChartsExpPackage.REACTION_TRIGGER__GUARD_EXPRESSION:
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
      case SCChartsExpPackage.REACTION_TRIGGER__TRIGGERS:
        return getTriggers();
      case SCChartsExpPackage.REACTION_TRIGGER__GUARD_EXPRESSION:
        return getGuardExpression();
      case SCChartsExpPackage.REACTION_TRIGGER__IS_IMMEDIATE:
        return isIsImmediate();
      case SCChartsExpPackage.REACTION_TRIGGER__DELAY:
        return getDelay();
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
      case SCChartsExpPackage.REACTION_TRIGGER__TRIGGERS:
        getTriggers().clear();
        getTriggers().addAll((Collection<? extends EventSpec>)newValue);
        return;
      case SCChartsExpPackage.REACTION_TRIGGER__GUARD_EXPRESSION:
        setGuardExpression((Expression)newValue);
        return;
      case SCChartsExpPackage.REACTION_TRIGGER__IS_IMMEDIATE:
        setIsImmediate((Boolean)newValue);
        return;
      case SCChartsExpPackage.REACTION_TRIGGER__DELAY:
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
      case SCChartsExpPackage.REACTION_TRIGGER__TRIGGERS:
        getTriggers().clear();
        return;
      case SCChartsExpPackage.REACTION_TRIGGER__GUARD_EXPRESSION:
        setGuardExpression((Expression)null);
        return;
      case SCChartsExpPackage.REACTION_TRIGGER__IS_IMMEDIATE:
        setIsImmediate(IS_IMMEDIATE_EDEFAULT);
        return;
      case SCChartsExpPackage.REACTION_TRIGGER__DELAY:
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
      case SCChartsExpPackage.REACTION_TRIGGER__TRIGGERS:
        return triggers != null && !triggers.isEmpty();
      case SCChartsExpPackage.REACTION_TRIGGER__GUARD_EXPRESSION:
        return guardExpression != null;
      case SCChartsExpPackage.REACTION_TRIGGER__IS_IMMEDIATE:
        return isImmediate != IS_IMMEDIATE_EDEFAULT;
      case SCChartsExpPackage.REACTION_TRIGGER__DELAY:
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
    result.append(", delay: ");
    result.append(delay);
    result.append(')');
    return result.toString();
  }

} //ReactionTriggerImpl
