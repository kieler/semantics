/**
 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.core.kexpressions.Expression;

import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.Repeat;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.RepeatImpl#isPositive <em>Positive</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.RepeatImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.RepeatImpl#getOptEnd <em>Opt End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepeatImpl extends StatementContainerImpl implements Repeat
{
  /**
   * The default value of the '{@link #isPositive() <em>Positive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPositive()
   * @generated
   * @ordered
   */
  protected static final boolean POSITIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPositive() <em>Positive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPositive()
   * @generated
   * @ordered
   */
  protected boolean positive = POSITIVE_EDEFAULT;

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
   * The default value of the '{@link #getOptEnd() <em>Opt End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptEnd()
   * @generated
   * @ordered
   */
  protected static final String OPT_END_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOptEnd() <em>Opt End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptEnd()
   * @generated
   * @ordered
   */
  protected String optEnd = OPT_END_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RepeatImpl()
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
    return EsterelPackage.Literals.REPEAT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPositive()
  {
    return positive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPositive(boolean newPositive)
  {
    boolean oldPositive = positive;
    positive = newPositive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.REPEAT__POSITIVE, oldPositive, positive));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.REPEAT__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.REPEAT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.REPEAT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.REPEAT__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOptEnd()
  {
    return optEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptEnd(String newOptEnd)
  {
    String oldOptEnd = optEnd;
    optEnd = newOptEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.REPEAT__OPT_END, oldOptEnd, optEnd));
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
      case EsterelPackage.REPEAT__EXPRESSION:
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
      case EsterelPackage.REPEAT__POSITIVE:
        return isPositive();
      case EsterelPackage.REPEAT__EXPRESSION:
        return getExpression();
      case EsterelPackage.REPEAT__OPT_END:
        return getOptEnd();
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
      case EsterelPackage.REPEAT__POSITIVE:
        setPositive((Boolean)newValue);
        return;
      case EsterelPackage.REPEAT__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case EsterelPackage.REPEAT__OPT_END:
        setOptEnd((String)newValue);
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
      case EsterelPackage.REPEAT__POSITIVE:
        setPositive(POSITIVE_EDEFAULT);
        return;
      case EsterelPackage.REPEAT__EXPRESSION:
        setExpression((Expression)null);
        return;
      case EsterelPackage.REPEAT__OPT_END:
        setOptEnd(OPT_END_EDEFAULT);
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
      case EsterelPackage.REPEAT__POSITIVE:
        return positive != POSITIVE_EDEFAULT;
      case EsterelPackage.REPEAT__EXPRESSION:
        return expression != null;
      case EsterelPackage.REPEAT__OPT_END:
        return OPT_END_EDEFAULT == null ? optEnd != null : !OPT_END_EDEFAULT.equals(optEnd);
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
    result.append(" (positive: ");
    result.append(positive);
    result.append(", optEnd: ");
    result.append(optEnd);
    result.append(')');
    return result.toString();
  }

} //RepeatImpl
