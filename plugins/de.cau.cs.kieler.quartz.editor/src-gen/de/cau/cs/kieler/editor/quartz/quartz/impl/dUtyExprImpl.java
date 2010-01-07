/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.editor.quartz.quartz.impl;

import de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage;
import de.cau.cs.kieler.editor.quartz.quartz.Stmt;
import de.cau.cs.kieler.editor.quartz.quartz.dUtyExpr;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>dUty Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.dUtyExprImpl#getT07 <em>T07</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.dUtyExprImpl#getT13 <em>T13</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.dUtyExprImpl#getT14 <em>T14</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class dUtyExprImpl extends dUtyExprsImpl implements dUtyExpr
{
  /**
   * The cached value of the '{@link #getT07() <em>T07</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT07()
   * @generated
   * @ordered
   */
  protected Stmt t07;

  /**
   * The cached value of the '{@link #getT13() <em>T13</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT13()
   * @generated
   * @ordered
   */
  protected Stmt t13;

  /**
   * The cached value of the '{@link #getT14() <em>T14</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT14()
   * @generated
   * @ordered
   */
  protected Stmt t14;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected dUtyExprImpl()
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
    return QuartzPackage.Literals.DUTY_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stmt getT07()
  {
    return t07;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT07(Stmt newT07, NotificationChain msgs)
  {
    Stmt oldT07 = t07;
    t07 = newT07;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.DUTY_EXPR__T07, oldT07, newT07);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT07(Stmt newT07)
  {
    if (newT07 != t07)
    {
      NotificationChain msgs = null;
      if (t07 != null)
        msgs = ((InternalEObject)t07).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.DUTY_EXPR__T07, null, msgs);
      if (newT07 != null)
        msgs = ((InternalEObject)newT07).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.DUTY_EXPR__T07, null, msgs);
      msgs = basicSetT07(newT07, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.DUTY_EXPR__T07, newT07, newT07));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stmt getT13()
  {
    return t13;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT13(Stmt newT13, NotificationChain msgs)
  {
    Stmt oldT13 = t13;
    t13 = newT13;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.DUTY_EXPR__T13, oldT13, newT13);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT13(Stmt newT13)
  {
    if (newT13 != t13)
    {
      NotificationChain msgs = null;
      if (t13 != null)
        msgs = ((InternalEObject)t13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.DUTY_EXPR__T13, null, msgs);
      if (newT13 != null)
        msgs = ((InternalEObject)newT13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.DUTY_EXPR__T13, null, msgs);
      msgs = basicSetT13(newT13, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.DUTY_EXPR__T13, newT13, newT13));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stmt getT14()
  {
    return t14;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT14(Stmt newT14, NotificationChain msgs)
  {
    Stmt oldT14 = t14;
    t14 = newT14;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.DUTY_EXPR__T14, oldT14, newT14);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT14(Stmt newT14)
  {
    if (newT14 != t14)
    {
      NotificationChain msgs = null;
      if (t14 != null)
        msgs = ((InternalEObject)t14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.DUTY_EXPR__T14, null, msgs);
      if (newT14 != null)
        msgs = ((InternalEObject)newT14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.DUTY_EXPR__T14, null, msgs);
      msgs = basicSetT14(newT14, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.DUTY_EXPR__T14, newT14, newT14));
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
      case QuartzPackage.DUTY_EXPR__T07:
        return basicSetT07(null, msgs);
      case QuartzPackage.DUTY_EXPR__T13:
        return basicSetT13(null, msgs);
      case QuartzPackage.DUTY_EXPR__T14:
        return basicSetT14(null, msgs);
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
      case QuartzPackage.DUTY_EXPR__T07:
        return getT07();
      case QuartzPackage.DUTY_EXPR__T13:
        return getT13();
      case QuartzPackage.DUTY_EXPR__T14:
        return getT14();
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
      case QuartzPackage.DUTY_EXPR__T07:
        setT07((Stmt)newValue);
        return;
      case QuartzPackage.DUTY_EXPR__T13:
        setT13((Stmt)newValue);
        return;
      case QuartzPackage.DUTY_EXPR__T14:
        setT14((Stmt)newValue);
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
      case QuartzPackage.DUTY_EXPR__T07:
        setT07((Stmt)null);
        return;
      case QuartzPackage.DUTY_EXPR__T13:
        setT13((Stmt)null);
        return;
      case QuartzPackage.DUTY_EXPR__T14:
        setT14((Stmt)null);
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
      case QuartzPackage.DUTY_EXPR__T07:
        return t07 != null;
      case QuartzPackage.DUTY_EXPR__T13:
        return t13 != null;
      case QuartzPackage.DUTY_EXPR__T14:
        return t14 != null;
    }
    return super.eIsSet(featureID);
  }

} //dUtyExprImpl
