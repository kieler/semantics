/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.quartz.editor.quartz.impl;

import de.cau.cs.kieler.quartz.editor.quartz.AtomicStmt;
import de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage;
import de.cau.cs.kieler.quartz.editor.quartz.dUtyExpr;
import de.cau.cs.kieler.quartz.editor.quartz.dUtyExprs;

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
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.impl.dUtyExprImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.impl.dUtyExprImpl#getT03 <em>T03</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.impl.dUtyExprImpl#getT06 <em>T06</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.impl.dUtyExprImpl#getT13 <em>T13</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.impl.dUtyExprImpl#getT14 <em>T14</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.impl.dUtyExprImpl#getT07 <em>T07</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class dUtyExprImpl extends dUtyExprsImpl implements dUtyExpr
{
  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected dUtyExprs expr;

  /**
   * The cached value of the '{@link #getT03() <em>T03</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT03()
   * @generated
   * @ordered
   */
  protected AtomicStmt t03;

  /**
   * The cached value of the '{@link #getT06() <em>T06</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT06()
   * @generated
   * @ordered
   */
  protected dUtyExprs t06;

  /**
   * The cached value of the '{@link #getT13() <em>T13</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT13()
   * @generated
   * @ordered
   */
  protected AtomicStmt t13;

  /**
   * The cached value of the '{@link #getT14() <em>T14</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT14()
   * @generated
   * @ordered
   */
  protected AtomicStmt t14;

  /**
   * The cached value of the '{@link #getT07() <em>T07</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT07()
   * @generated
   * @ordered
   */
  protected AtomicStmt t07;

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
  public dUtyExprs getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(dUtyExprs newExpr, NotificationChain msgs)
  {
    dUtyExprs oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.DUTY_EXPR__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(dUtyExprs newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.DUTY_EXPR__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.DUTY_EXPR__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.DUTY_EXPR__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicStmt getT03()
  {
    return t03;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT03(AtomicStmt newT03, NotificationChain msgs)
  {
    AtomicStmt oldT03 = t03;
    t03 = newT03;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.DUTY_EXPR__T03, oldT03, newT03);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT03(AtomicStmt newT03)
  {
    if (newT03 != t03)
    {
      NotificationChain msgs = null;
      if (t03 != null)
        msgs = ((InternalEObject)t03).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.DUTY_EXPR__T03, null, msgs);
      if (newT03 != null)
        msgs = ((InternalEObject)newT03).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.DUTY_EXPR__T03, null, msgs);
      msgs = basicSetT03(newT03, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.DUTY_EXPR__T03, newT03, newT03));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public dUtyExprs getT06()
  {
    return t06;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT06(dUtyExprs newT06, NotificationChain msgs)
  {
    dUtyExprs oldT06 = t06;
    t06 = newT06;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.DUTY_EXPR__T06, oldT06, newT06);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT06(dUtyExprs newT06)
  {
    if (newT06 != t06)
    {
      NotificationChain msgs = null;
      if (t06 != null)
        msgs = ((InternalEObject)t06).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.DUTY_EXPR__T06, null, msgs);
      if (newT06 != null)
        msgs = ((InternalEObject)newT06).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.DUTY_EXPR__T06, null, msgs);
      msgs = basicSetT06(newT06, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.DUTY_EXPR__T06, newT06, newT06));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicStmt getT13()
  {
    return t13;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT13(AtomicStmt newT13, NotificationChain msgs)
  {
    AtomicStmt oldT13 = t13;
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
  public void setT13(AtomicStmt newT13)
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
  public AtomicStmt getT14()
  {
    return t14;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT14(AtomicStmt newT14, NotificationChain msgs)
  {
    AtomicStmt oldT14 = t14;
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
  public void setT14(AtomicStmt newT14)
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
  public AtomicStmt getT07()
  {
    return t07;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT07(AtomicStmt newT07, NotificationChain msgs)
  {
    AtomicStmt oldT07 = t07;
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
  public void setT07(AtomicStmt newT07)
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
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case QuartzPackage.DUTY_EXPR__EXPR:
        return basicSetExpr(null, msgs);
      case QuartzPackage.DUTY_EXPR__T03:
        return basicSetT03(null, msgs);
      case QuartzPackage.DUTY_EXPR__T06:
        return basicSetT06(null, msgs);
      case QuartzPackage.DUTY_EXPR__T13:
        return basicSetT13(null, msgs);
      case QuartzPackage.DUTY_EXPR__T14:
        return basicSetT14(null, msgs);
      case QuartzPackage.DUTY_EXPR__T07:
        return basicSetT07(null, msgs);
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
      case QuartzPackage.DUTY_EXPR__EXPR:
        return getExpr();
      case QuartzPackage.DUTY_EXPR__T03:
        return getT03();
      case QuartzPackage.DUTY_EXPR__T06:
        return getT06();
      case QuartzPackage.DUTY_EXPR__T13:
        return getT13();
      case QuartzPackage.DUTY_EXPR__T14:
        return getT14();
      case QuartzPackage.DUTY_EXPR__T07:
        return getT07();
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
      case QuartzPackage.DUTY_EXPR__EXPR:
        setExpr((dUtyExprs)newValue);
        return;
      case QuartzPackage.DUTY_EXPR__T03:
        setT03((AtomicStmt)newValue);
        return;
      case QuartzPackage.DUTY_EXPR__T06:
        setT06((dUtyExprs)newValue);
        return;
      case QuartzPackage.DUTY_EXPR__T13:
        setT13((AtomicStmt)newValue);
        return;
      case QuartzPackage.DUTY_EXPR__T14:
        setT14((AtomicStmt)newValue);
        return;
      case QuartzPackage.DUTY_EXPR__T07:
        setT07((AtomicStmt)newValue);
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
      case QuartzPackage.DUTY_EXPR__EXPR:
        setExpr((dUtyExprs)null);
        return;
      case QuartzPackage.DUTY_EXPR__T03:
        setT03((AtomicStmt)null);
        return;
      case QuartzPackage.DUTY_EXPR__T06:
        setT06((dUtyExprs)null);
        return;
      case QuartzPackage.DUTY_EXPR__T13:
        setT13((AtomicStmt)null);
        return;
      case QuartzPackage.DUTY_EXPR__T14:
        setT14((AtomicStmt)null);
        return;
      case QuartzPackage.DUTY_EXPR__T07:
        setT07((AtomicStmt)null);
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
      case QuartzPackage.DUTY_EXPR__EXPR:
        return expr != null;
      case QuartzPackage.DUTY_EXPR__T03:
        return t03 != null;
      case QuartzPackage.DUTY_EXPR__T06:
        return t06 != null;
      case QuartzPackage.DUTY_EXPR__T13:
        return t13 != null;
      case QuartzPackage.DUTY_EXPR__T14:
        return t14 != null;
      case QuartzPackage.DUTY_EXPR__T07:
        return t07 != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == AtomicStmt.class)
    {
      switch (derivedFeatureID)
      {
        case QuartzPackage.DUTY_EXPR__EXPR: return QuartzPackage.ATOMIC_STMT__EXPR;
        case QuartzPackage.DUTY_EXPR__T03: return QuartzPackage.ATOMIC_STMT__T03;
        case QuartzPackage.DUTY_EXPR__T06: return QuartzPackage.ATOMIC_STMT__T06;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == AtomicStmt.class)
    {
      switch (baseFeatureID)
      {
        case QuartzPackage.ATOMIC_STMT__EXPR: return QuartzPackage.DUTY_EXPR__EXPR;
        case QuartzPackage.ATOMIC_STMT__T03: return QuartzPackage.DUTY_EXPR__T03;
        case QuartzPackage.ATOMIC_STMT__T06: return QuartzPackage.DUTY_EXPR__T06;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //dUtyExprImpl
