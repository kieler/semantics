/**
 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.esterel.esterel.DelayExpr;
import de.cau.cs.kieler.esterel.esterel.EsterelPackage;

import de.cau.cs.kieler.kexpressions.Expression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delay Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.DelayExprImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.DelayExprImpl#isIsImmediate <em>Is Immediate</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.DelayExprImpl#getSignalExpr <em>Signal Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DelayExprImpl extends MinimalEObjectImpl.Container implements DelayExpr
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
   * The cached value of the '{@link #getSignalExpr() <em>Signal Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignalExpr()
   * @generated
   * @ordered
   */
  protected Expression signalExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DelayExprImpl()
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
    return EsterelPackage.Literals.DELAY_EXPR;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.DELAY_EXPR__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.DELAY_EXPR__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.DELAY_EXPR__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.DELAY_EXPR__EXPRESSION, newExpression, newExpression));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.DELAY_EXPR__IS_IMMEDIATE, oldIsImmediate, isImmediate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getSignalExpr()
  {
    return signalExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSignalExpr(Expression newSignalExpr, NotificationChain msgs)
  {
    Expression oldSignalExpr = signalExpr;
    signalExpr = newSignalExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.DELAY_EXPR__SIGNAL_EXPR, oldSignalExpr, newSignalExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSignalExpr(Expression newSignalExpr)
  {
    if (newSignalExpr != signalExpr)
    {
      NotificationChain msgs = null;
      if (signalExpr != null)
        msgs = ((InternalEObject)signalExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.DELAY_EXPR__SIGNAL_EXPR, null, msgs);
      if (newSignalExpr != null)
        msgs = ((InternalEObject)newSignalExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.DELAY_EXPR__SIGNAL_EXPR, null, msgs);
      msgs = basicSetSignalExpr(newSignalExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.DELAY_EXPR__SIGNAL_EXPR, newSignalExpr, newSignalExpr));
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
      case EsterelPackage.DELAY_EXPR__EXPRESSION:
        return basicSetExpression(null, msgs);
      case EsterelPackage.DELAY_EXPR__SIGNAL_EXPR:
        return basicSetSignalExpr(null, msgs);
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
      case EsterelPackage.DELAY_EXPR__EXPRESSION:
        return getExpression();
      case EsterelPackage.DELAY_EXPR__IS_IMMEDIATE:
        return isIsImmediate();
      case EsterelPackage.DELAY_EXPR__SIGNAL_EXPR:
        return getSignalExpr();
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
      case EsterelPackage.DELAY_EXPR__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case EsterelPackage.DELAY_EXPR__IS_IMMEDIATE:
        setIsImmediate((Boolean)newValue);
        return;
      case EsterelPackage.DELAY_EXPR__SIGNAL_EXPR:
        setSignalExpr((Expression)newValue);
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
      case EsterelPackage.DELAY_EXPR__EXPRESSION:
        setExpression((Expression)null);
        return;
      case EsterelPackage.DELAY_EXPR__IS_IMMEDIATE:
        setIsImmediate(IS_IMMEDIATE_EDEFAULT);
        return;
      case EsterelPackage.DELAY_EXPR__SIGNAL_EXPR:
        setSignalExpr((Expression)null);
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
      case EsterelPackage.DELAY_EXPR__EXPRESSION:
        return expression != null;
      case EsterelPackage.DELAY_EXPR__IS_IMMEDIATE:
        return isImmediate != IS_IMMEDIATE_EDEFAULT;
      case EsterelPackage.DELAY_EXPR__SIGNAL_EXPR:
        return signalExpr != null;
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
    result.append(')');
    return result.toString();
  }

} //DelayExprImpl
