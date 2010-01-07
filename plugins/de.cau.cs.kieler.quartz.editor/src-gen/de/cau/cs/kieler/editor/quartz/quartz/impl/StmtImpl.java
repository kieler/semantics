/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.editor.quartz.quartz.impl;

import de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage;
import de.cau.cs.kieler.editor.quartz.quartz.SeqStmt;
import de.cau.cs.kieler.editor.quartz.quartz.Stmt;
import de.cau.cs.kieler.editor.quartz.quartz.dUtyExprs;

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
 * An implementation of the model object '<em><b>Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.StmtImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.StmtImpl#getRight <em>Right</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.StmtImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.StmtImpl#getT03 <em>T03</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.StmtImpl#getT06 <em>T06</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.StmtImpl#getT16 <em>T16</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StmtImpl extends AtomicStmtImpl implements Stmt
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected SeqStmt left;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected EList<SeqStmt> right;

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
  protected Stmt t03;

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
   * The cached value of the '{@link #getT16() <em>T16</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT16()
   * @generated
   * @ordered
   */
  protected Stmt t16;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StmtImpl()
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
    return QuartzPackage.Literals.STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeqStmt getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(SeqStmt newLeft, NotificationChain msgs)
  {
    SeqStmt oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.STMT__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(SeqStmt newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.STMT__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.STMT__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.STMT__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SeqStmt> getRight()
  {
    if (right == null)
    {
      right = new EObjectContainmentEList<SeqStmt>(SeqStmt.class, this, QuartzPackage.STMT__RIGHT);
    }
    return right;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.STMT__EXPR, oldExpr, newExpr);
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
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.STMT__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.STMT__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.STMT__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stmt getT03()
  {
    return t03;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT03(Stmt newT03, NotificationChain msgs)
  {
    Stmt oldT03 = t03;
    t03 = newT03;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.STMT__T03, oldT03, newT03);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT03(Stmt newT03)
  {
    if (newT03 != t03)
    {
      NotificationChain msgs = null;
      if (t03 != null)
        msgs = ((InternalEObject)t03).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.STMT__T03, null, msgs);
      if (newT03 != null)
        msgs = ((InternalEObject)newT03).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.STMT__T03, null, msgs);
      msgs = basicSetT03(newT03, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.STMT__T03, newT03, newT03));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.STMT__T06, oldT06, newT06);
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
        msgs = ((InternalEObject)t06).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.STMT__T06, null, msgs);
      if (newT06 != null)
        msgs = ((InternalEObject)newT06).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.STMT__T06, null, msgs);
      msgs = basicSetT06(newT06, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.STMT__T06, newT06, newT06));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stmt getT16()
  {
    return t16;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT16(Stmt newT16, NotificationChain msgs)
  {
    Stmt oldT16 = t16;
    t16 = newT16;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.STMT__T16, oldT16, newT16);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT16(Stmt newT16)
  {
    if (newT16 != t16)
    {
      NotificationChain msgs = null;
      if (t16 != null)
        msgs = ((InternalEObject)t16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.STMT__T16, null, msgs);
      if (newT16 != null)
        msgs = ((InternalEObject)newT16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.STMT__T16, null, msgs);
      msgs = basicSetT16(newT16, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.STMT__T16, newT16, newT16));
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
      case QuartzPackage.STMT__LEFT:
        return basicSetLeft(null, msgs);
      case QuartzPackage.STMT__RIGHT:
        return ((InternalEList<?>)getRight()).basicRemove(otherEnd, msgs);
      case QuartzPackage.STMT__EXPR:
        return basicSetExpr(null, msgs);
      case QuartzPackage.STMT__T03:
        return basicSetT03(null, msgs);
      case QuartzPackage.STMT__T06:
        return basicSetT06(null, msgs);
      case QuartzPackage.STMT__T16:
        return basicSetT16(null, msgs);
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
      case QuartzPackage.STMT__LEFT:
        return getLeft();
      case QuartzPackage.STMT__RIGHT:
        return getRight();
      case QuartzPackage.STMT__EXPR:
        return getExpr();
      case QuartzPackage.STMT__T03:
        return getT03();
      case QuartzPackage.STMT__T06:
        return getT06();
      case QuartzPackage.STMT__T16:
        return getT16();
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
      case QuartzPackage.STMT__LEFT:
        setLeft((SeqStmt)newValue);
        return;
      case QuartzPackage.STMT__RIGHT:
        getRight().clear();
        getRight().addAll((Collection<? extends SeqStmt>)newValue);
        return;
      case QuartzPackage.STMT__EXPR:
        setExpr((dUtyExprs)newValue);
        return;
      case QuartzPackage.STMT__T03:
        setT03((Stmt)newValue);
        return;
      case QuartzPackage.STMT__T06:
        setT06((dUtyExprs)newValue);
        return;
      case QuartzPackage.STMT__T16:
        setT16((Stmt)newValue);
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
      case QuartzPackage.STMT__LEFT:
        setLeft((SeqStmt)null);
        return;
      case QuartzPackage.STMT__RIGHT:
        getRight().clear();
        return;
      case QuartzPackage.STMT__EXPR:
        setExpr((dUtyExprs)null);
        return;
      case QuartzPackage.STMT__T03:
        setT03((Stmt)null);
        return;
      case QuartzPackage.STMT__T06:
        setT06((dUtyExprs)null);
        return;
      case QuartzPackage.STMT__T16:
        setT16((Stmt)null);
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
      case QuartzPackage.STMT__LEFT:
        return left != null;
      case QuartzPackage.STMT__RIGHT:
        return right != null && !right.isEmpty();
      case QuartzPackage.STMT__EXPR:
        return expr != null;
      case QuartzPackage.STMT__T03:
        return t03 != null;
      case QuartzPackage.STMT__T06:
        return t06 != null;
      case QuartzPackage.STMT__T16:
        return t16 != null;
    }
    return super.eIsSet(featureID);
  }

} //StmtImpl
