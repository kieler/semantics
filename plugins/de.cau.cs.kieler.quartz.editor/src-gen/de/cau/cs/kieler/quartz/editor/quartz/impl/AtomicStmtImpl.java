/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.quartz.editor.quartz.impl;

import de.cau.cs.kieler.quartz.editor.quartz.AtomicStmt;
import de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage;
import de.cau.cs.kieler.quartz.editor.quartz.dUtyExprs;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.impl.AtomicStmtImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.impl.AtomicStmtImpl#getT03 <em>T03</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.impl.AtomicStmtImpl#getT06 <em>T06</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtomicStmtImpl extends MinimalEObjectImpl.Container implements AtomicStmt
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtomicStmtImpl()
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
    return QuartzPackage.Literals.ATOMIC_STMT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.ATOMIC_STMT__EXPR, oldExpr, newExpr);
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
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.ATOMIC_STMT__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.ATOMIC_STMT__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.ATOMIC_STMT__EXPR, newExpr, newExpr));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.ATOMIC_STMT__T03, oldT03, newT03);
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
        msgs = ((InternalEObject)t03).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.ATOMIC_STMT__T03, null, msgs);
      if (newT03 != null)
        msgs = ((InternalEObject)newT03).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.ATOMIC_STMT__T03, null, msgs);
      msgs = basicSetT03(newT03, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.ATOMIC_STMT__T03, newT03, newT03));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.ATOMIC_STMT__T06, oldT06, newT06);
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
        msgs = ((InternalEObject)t06).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.ATOMIC_STMT__T06, null, msgs);
      if (newT06 != null)
        msgs = ((InternalEObject)newT06).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.ATOMIC_STMT__T06, null, msgs);
      msgs = basicSetT06(newT06, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.ATOMIC_STMT__T06, newT06, newT06));
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
      case QuartzPackage.ATOMIC_STMT__EXPR:
        return basicSetExpr(null, msgs);
      case QuartzPackage.ATOMIC_STMT__T03:
        return basicSetT03(null, msgs);
      case QuartzPackage.ATOMIC_STMT__T06:
        return basicSetT06(null, msgs);
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
      case QuartzPackage.ATOMIC_STMT__EXPR:
        return getExpr();
      case QuartzPackage.ATOMIC_STMT__T03:
        return getT03();
      case QuartzPackage.ATOMIC_STMT__T06:
        return getT06();
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
      case QuartzPackage.ATOMIC_STMT__EXPR:
        setExpr((dUtyExprs)newValue);
        return;
      case QuartzPackage.ATOMIC_STMT__T03:
        setT03((AtomicStmt)newValue);
        return;
      case QuartzPackage.ATOMIC_STMT__T06:
        setT06((dUtyExprs)newValue);
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
      case QuartzPackage.ATOMIC_STMT__EXPR:
        setExpr((dUtyExprs)null);
        return;
      case QuartzPackage.ATOMIC_STMT__T03:
        setT03((AtomicStmt)null);
        return;
      case QuartzPackage.ATOMIC_STMT__T06:
        setT06((dUtyExprs)null);
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
      case QuartzPackage.ATOMIC_STMT__EXPR:
        return expr != null;
      case QuartzPackage.ATOMIC_STMT__T03:
        return t03 != null;
      case QuartzPackage.ATOMIC_STMT__T06:
        return t06 != null;
    }
    return super.eIsSet(featureID);
  }

} //AtomicStmtImpl
