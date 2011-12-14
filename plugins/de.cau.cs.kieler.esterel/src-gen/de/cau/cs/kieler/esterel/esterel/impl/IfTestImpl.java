/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.core.kexpressions.Expression;

import de.cau.cs.kieler.esterel.esterel.ElsIf;
import de.cau.cs.kieler.esterel.esterel.ElsePart;
import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.IfTest;
import de.cau.cs.kieler.esterel.esterel.ThenPart;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.IfTestImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.IfTestImpl#getThenPart <em>Then Part</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.IfTestImpl#getElsif <em>Elsif</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.IfTestImpl#getElsePart <em>Else Part</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.IfTestImpl#getOptEnd <em>Opt End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfTestImpl extends StatementImpl implements IfTest
{
  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected Expression expr;

  /**
   * The cached value of the '{@link #getThenPart() <em>Then Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThenPart()
   * @generated
   * @ordered
   */
  protected ThenPart thenPart;

  /**
   * The cached value of the '{@link #getElsif() <em>Elsif</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElsif()
   * @generated
   * @ordered
   */
  protected EList<ElsIf> elsif;

  /**
   * The cached value of the '{@link #getElsePart() <em>Else Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElsePart()
   * @generated
   * @ordered
   */
  protected ElsePart elsePart;

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
  protected IfTestImpl()
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
    return EsterelPackage.Literals.IF_TEST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(Expression newExpr, NotificationChain msgs)
  {
    Expression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.IF_TEST__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(Expression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.IF_TEST__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.IF_TEST__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.IF_TEST__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThenPart getThenPart()
  {
    return thenPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThenPart(ThenPart newThenPart, NotificationChain msgs)
  {
    ThenPart oldThenPart = thenPart;
    thenPart = newThenPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.IF_TEST__THEN_PART, oldThenPart, newThenPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThenPart(ThenPart newThenPart)
  {
    if (newThenPart != thenPart)
    {
      NotificationChain msgs = null;
      if (thenPart != null)
        msgs = ((InternalEObject)thenPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.IF_TEST__THEN_PART, null, msgs);
      if (newThenPart != null)
        msgs = ((InternalEObject)newThenPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.IF_TEST__THEN_PART, null, msgs);
      msgs = basicSetThenPart(newThenPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.IF_TEST__THEN_PART, newThenPart, newThenPart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ElsIf> getElsif()
  {
    if (elsif == null)
    {
      elsif = new EObjectContainmentEList<ElsIf>(ElsIf.class, this, EsterelPackage.IF_TEST__ELSIF);
    }
    return elsif;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElsePart getElsePart()
  {
    return elsePart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElsePart(ElsePart newElsePart, NotificationChain msgs)
  {
    ElsePart oldElsePart = elsePart;
    elsePart = newElsePart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.IF_TEST__ELSE_PART, oldElsePart, newElsePart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElsePart(ElsePart newElsePart)
  {
    if (newElsePart != elsePart)
    {
      NotificationChain msgs = null;
      if (elsePart != null)
        msgs = ((InternalEObject)elsePart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.IF_TEST__ELSE_PART, null, msgs);
      if (newElsePart != null)
        msgs = ((InternalEObject)newElsePart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.IF_TEST__ELSE_PART, null, msgs);
      msgs = basicSetElsePart(newElsePart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.IF_TEST__ELSE_PART, newElsePart, newElsePart));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.IF_TEST__OPT_END, oldOptEnd, optEnd));
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
      case EsterelPackage.IF_TEST__EXPR:
        return basicSetExpr(null, msgs);
      case EsterelPackage.IF_TEST__THEN_PART:
        return basicSetThenPart(null, msgs);
      case EsterelPackage.IF_TEST__ELSIF:
        return ((InternalEList<?>)getElsif()).basicRemove(otherEnd, msgs);
      case EsterelPackage.IF_TEST__ELSE_PART:
        return basicSetElsePart(null, msgs);
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
      case EsterelPackage.IF_TEST__EXPR:
        return getExpr();
      case EsterelPackage.IF_TEST__THEN_PART:
        return getThenPart();
      case EsterelPackage.IF_TEST__ELSIF:
        return getElsif();
      case EsterelPackage.IF_TEST__ELSE_PART:
        return getElsePart();
      case EsterelPackage.IF_TEST__OPT_END:
        return getOptEnd();
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
      case EsterelPackage.IF_TEST__EXPR:
        setExpr((Expression)newValue);
        return;
      case EsterelPackage.IF_TEST__THEN_PART:
        setThenPart((ThenPart)newValue);
        return;
      case EsterelPackage.IF_TEST__ELSIF:
        getElsif().clear();
        getElsif().addAll((Collection<? extends ElsIf>)newValue);
        return;
      case EsterelPackage.IF_TEST__ELSE_PART:
        setElsePart((ElsePart)newValue);
        return;
      case EsterelPackage.IF_TEST__OPT_END:
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
      case EsterelPackage.IF_TEST__EXPR:
        setExpr((Expression)null);
        return;
      case EsterelPackage.IF_TEST__THEN_PART:
        setThenPart((ThenPart)null);
        return;
      case EsterelPackage.IF_TEST__ELSIF:
        getElsif().clear();
        return;
      case EsterelPackage.IF_TEST__ELSE_PART:
        setElsePart((ElsePart)null);
        return;
      case EsterelPackage.IF_TEST__OPT_END:
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
      case EsterelPackage.IF_TEST__EXPR:
        return expr != null;
      case EsterelPackage.IF_TEST__THEN_PART:
        return thenPart != null;
      case EsterelPackage.IF_TEST__ELSIF:
        return elsif != null && !elsif.isEmpty();
      case EsterelPackage.IF_TEST__ELSE_PART:
        return elsePart != null;
      case EsterelPackage.IF_TEST__OPT_END:
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
    result.append(" (optEnd: ");
    result.append(optEnd);
    result.append(')');
    return result.toString();
  }

} //IfTestImpl
