/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.kies.esterel.impl;

import de.cau.cs.kieler.core.kexpressions.Expression;

import de.cau.cs.kieler.kies.esterel.EsterelPackage;
import de.cau.cs.kieler.kies.esterel.PresentEvent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Present Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.impl.PresentEventImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.impl.PresentEventImpl#getFB <em>FB</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.impl.PresentEventImpl#getEB <em>EB</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.impl.PresentEventImpl#getTick <em>Tick</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PresentEventImpl extends MinimalEObjectImpl.Container implements PresentEvent
{
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * The default value of the '{@link #getFB() <em>FB</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFB()
   * @generated
   * @ordered
   */
  protected static final String FB_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFB() <em>FB</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFB()
   * @generated
   * @ordered
   */
  protected String fB = FB_EDEFAULT;

  /**
   * The default value of the '{@link #getEB() <em>EB</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEB()
   * @generated
   * @ordered
   */
  protected static final String EB_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEB() <em>EB</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEB()
   * @generated
   * @ordered
   */
  protected String eB = EB_EDEFAULT;

  /**
   * The default value of the '{@link #getTick() <em>Tick</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTick()
   * @generated
   * @ordered
   */
  protected static final String TICK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTick() <em>Tick</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTick()
   * @generated
   * @ordered
   */
  protected String tick = TICK_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PresentEventImpl()
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
    return EsterelPackage.Literals.PRESENT_EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.PRESENT_EVENT__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.PRESENT_EVENT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.PRESENT_EVENT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.PRESENT_EVENT__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFB()
  {
    return fB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFB(String newFB)
  {
    String oldFB = fB;
    fB = newFB;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.PRESENT_EVENT__FB, oldFB, fB));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEB()
  {
    return eB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEB(String newEB)
  {
    String oldEB = eB;
    eB = newEB;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.PRESENT_EVENT__EB, oldEB, eB));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTick()
  {
    return tick;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTick(String newTick)
  {
    String oldTick = tick;
    tick = newTick;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.PRESENT_EVENT__TICK, oldTick, tick));
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
      case EsterelPackage.PRESENT_EVENT__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case EsterelPackage.PRESENT_EVENT__EXPRESSION:
        return getExpression();
      case EsterelPackage.PRESENT_EVENT__FB:
        return getFB();
      case EsterelPackage.PRESENT_EVENT__EB:
        return getEB();
      case EsterelPackage.PRESENT_EVENT__TICK:
        return getTick();
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
      case EsterelPackage.PRESENT_EVENT__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case EsterelPackage.PRESENT_EVENT__FB:
        setFB((String)newValue);
        return;
      case EsterelPackage.PRESENT_EVENT__EB:
        setEB((String)newValue);
        return;
      case EsterelPackage.PRESENT_EVENT__TICK:
        setTick((String)newValue);
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
      case EsterelPackage.PRESENT_EVENT__EXPRESSION:
        setExpression((Expression)null);
        return;
      case EsterelPackage.PRESENT_EVENT__FB:
        setFB(FB_EDEFAULT);
        return;
      case EsterelPackage.PRESENT_EVENT__EB:
        setEB(EB_EDEFAULT);
        return;
      case EsterelPackage.PRESENT_EVENT__TICK:
        setTick(TICK_EDEFAULT);
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
      case EsterelPackage.PRESENT_EVENT__EXPRESSION:
        return expression != null;
      case EsterelPackage.PRESENT_EVENT__FB:
        return FB_EDEFAULT == null ? fB != null : !FB_EDEFAULT.equals(fB);
      case EsterelPackage.PRESENT_EVENT__EB:
        return EB_EDEFAULT == null ? eB != null : !EB_EDEFAULT.equals(eB);
      case EsterelPackage.PRESENT_EVENT__TICK:
        return TICK_EDEFAULT == null ? tick != null : !TICK_EDEFAULT.equals(tick);
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
    result.append(" (fB: ");
    result.append(fB);
    result.append(", eB: ");
    result.append(eB);
    result.append(", tick: ");
    result.append(tick);
    result.append(')');
    return result.toString();
  }

} //PresentEventImpl
