/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.SigExprUnary;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sig Expr Unary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.SigExprUnaryImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.SigExprUnaryImpl#getSigExpr <em>Sig Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SigExprUnaryImpl extends MinimalEObjectImpl.Container implements SigExprUnary
{
  /**
   * The default value of the '{@link #getExpr() <em>Expr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected static final String EXPR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected String expr = EXPR_EDEFAULT;

  /**
   * The cached value of the '{@link #getSigExpr() <em>Sig Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSigExpr()
   * @generated
   * @ordered
   */
  protected EObject sigExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SigExprUnaryImpl()
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
    return EsterelPackage.Literals.SIG_EXPR_UNARY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(String newExpr)
  {
    String oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.SIG_EXPR_UNARY__EXPR, oldExpr, expr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getSigExpr()
  {
    return sigExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSigExpr(EObject newSigExpr, NotificationChain msgs)
  {
    EObject oldSigExpr = sigExpr;
    sigExpr = newSigExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.SIG_EXPR_UNARY__SIG_EXPR, oldSigExpr, newSigExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSigExpr(EObject newSigExpr)
  {
    if (newSigExpr != sigExpr)
    {
      NotificationChain msgs = null;
      if (sigExpr != null)
        msgs = ((InternalEObject)sigExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.SIG_EXPR_UNARY__SIG_EXPR, null, msgs);
      if (newSigExpr != null)
        msgs = ((InternalEObject)newSigExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.SIG_EXPR_UNARY__SIG_EXPR, null, msgs);
      msgs = basicSetSigExpr(newSigExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.SIG_EXPR_UNARY__SIG_EXPR, newSigExpr, newSigExpr));
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
      case EsterelPackage.SIG_EXPR_UNARY__SIG_EXPR:
        return basicSetSigExpr(null, msgs);
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
      case EsterelPackage.SIG_EXPR_UNARY__EXPR:
        return getExpr();
      case EsterelPackage.SIG_EXPR_UNARY__SIG_EXPR:
        return getSigExpr();
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
      case EsterelPackage.SIG_EXPR_UNARY__EXPR:
        setExpr((String)newValue);
        return;
      case EsterelPackage.SIG_EXPR_UNARY__SIG_EXPR:
        setSigExpr((EObject)newValue);
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
      case EsterelPackage.SIG_EXPR_UNARY__EXPR:
        setExpr(EXPR_EDEFAULT);
        return;
      case EsterelPackage.SIG_EXPR_UNARY__SIG_EXPR:
        setSigExpr((EObject)null);
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
      case EsterelPackage.SIG_EXPR_UNARY__EXPR:
        return EXPR_EDEFAULT == null ? expr != null : !EXPR_EDEFAULT.equals(expr);
      case EsterelPackage.SIG_EXPR_UNARY__SIG_EXPR:
        return sigExpr != null;
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
    result.append(" (expr: ");
    result.append(expr);
    result.append(')');
    return result.toString();
  }

} //SigExprUnaryImpl
