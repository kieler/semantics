/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.editor.quartz.quartz.impl;

import de.cau.cs.kieler.editor.quartz.quartz.AtomicStmt;
import de.cau.cs.kieler.editor.quartz.quartz.Generic;
import de.cau.cs.kieler.editor.quartz.quartz.OptUtyExprList;
import de.cau.cs.kieler.editor.quartz.quartz.QName;
import de.cau.cs.kieler.editor.quartz.quartz.QType;
import de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage;
import de.cau.cs.kieler.editor.quartz.quartz.Stmt;
import de.cau.cs.kieler.editor.quartz.quartz.UtyAction;
import de.cau.cs.kieler.editor.quartz.quartz.UtyExpr;
import de.cau.cs.kieler.editor.quartz.quartz.dUtyExpr;
import de.cau.cs.kieler.editor.quartz.quartz.dUtyExprs;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QName</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QNameImpl#getT07 <em>T07</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QNameImpl#getT13 <em>T13</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QNameImpl#getT14 <em>T14</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QNameImpl#getOp <em>Op</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QNameImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QNameImpl#getT7 <em>T7</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QNameImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QNameImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QNameImpl#getT2 <em>T2</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QNameImpl#getT4 <em>T4</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QNameImpl#getT <em>T</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QNameImpl#getT23 <em>T23</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QNameImpl#getT6 <em>T6</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QNameImpl#getT5 <em>T5</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QNameImpl#getExprs <em>Exprs</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QNameImpl#getStmt <em>Stmt</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QNameImpl#getTs <em>Ts</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QNameImpl#getT08 <em>T08</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QNameImpl#getT10 <em>T10</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.QNameImpl#getT24 <em>T24</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QNameImpl extends InOutNameImpl implements QName
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
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

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
   * The cached value of the '{@link #getT7() <em>T7</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT7()
   * @generated
   * @ordered
   */
  protected UtyExpr t7;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected QName name;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected QType type;

  /**
   * The cached value of the '{@link #getT2() <em>T2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT2()
   * @generated
   * @ordered
   */
  protected UtyExpr t2;

  /**
   * The cached value of the '{@link #getT4() <em>T4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT4()
   * @generated
   * @ordered
   */
  protected UtyExpr t4;

  /**
   * The cached value of the '{@link #getT() <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT()
   * @generated
   * @ordered
   */
  protected Stmt t;

  /**
   * The cached value of the '{@link #getT23() <em>T23</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT23()
   * @generated
   * @ordered
   */
  protected Stmt t23;

  /**
   * The cached value of the '{@link #getT6() <em>T6</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT6()
   * @generated
   * @ordered
   */
  protected UtyExpr t6;

  /**
   * The cached value of the '{@link #getT5() <em>T5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT5()
   * @generated
   * @ordered
   */
  protected UtyExpr t5;

  /**
   * The cached value of the '{@link #getExprs() <em>Exprs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprs()
   * @generated
   * @ordered
   */
  protected OptUtyExprList exprs;

  /**
   * The cached value of the '{@link #getStmt() <em>Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStmt()
   * @generated
   * @ordered
   */
  protected Stmt stmt;

  /**
   * The cached value of the '{@link #getTs() <em>Ts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTs()
   * @generated
   * @ordered
   */
  protected dUtyExprs ts;

  /**
   * The cached value of the '{@link #getT08() <em>T08</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT08()
   * @generated
   * @ordered
   */
  protected Stmt t08;

  /**
   * The cached value of the '{@link #getT10() <em>T10</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT10()
   * @generated
   * @ordered
   */
  protected Stmt t10;

  /**
   * The cached value of the '{@link #getT24() <em>T24</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT24()
   * @generated
   * @ordered
   */
  protected Stmt t24;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QNameImpl()
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
    return QuartzPackage.Literals.QNAME;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__T07, oldT07, newT07);
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
        msgs = ((InternalEObject)t07).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__T07, null, msgs);
      if (newT07 != null)
        msgs = ((InternalEObject)newT07).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__T07, null, msgs);
      msgs = basicSetT07(newT07, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__T07, newT07, newT07));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__T13, oldT13, newT13);
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
        msgs = ((InternalEObject)t13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__T13, null, msgs);
      if (newT13 != null)
        msgs = ((InternalEObject)newT13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__T13, null, msgs);
      msgs = basicSetT13(newT13, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__T13, newT13, newT13));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__T14, oldT14, newT14);
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
        msgs = ((InternalEObject)t14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__T14, null, msgs);
      if (newT14 != null)
        msgs = ((InternalEObject)newT14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__T14, null, msgs);
      msgs = basicSetT14(newT14, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__T14, newT14, newT14));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__OP, oldOp, op));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__EXPR, oldExpr, newExpr);
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
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UtyExpr getT7()
  {
    return t7;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT7(UtyExpr newT7, NotificationChain msgs)
  {
    UtyExpr oldT7 = t7;
    t7 = newT7;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__T7, oldT7, newT7);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT7(UtyExpr newT7)
  {
    if (newT7 != t7)
    {
      NotificationChain msgs = null;
      if (t7 != null)
        msgs = ((InternalEObject)t7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__T7, null, msgs);
      if (newT7 != null)
        msgs = ((InternalEObject)newT7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__T7, null, msgs);
      msgs = basicSetT7(newT7, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__T7, newT7, newT7));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QName getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(QName newName, NotificationChain msgs)
  {
    QName oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(QName newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(QType newType, NotificationChain msgs)
  {
    QType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(QType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UtyExpr getT2()
  {
    return t2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT2(UtyExpr newT2, NotificationChain msgs)
  {
    UtyExpr oldT2 = t2;
    t2 = newT2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__T2, oldT2, newT2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT2(UtyExpr newT2)
  {
    if (newT2 != t2)
    {
      NotificationChain msgs = null;
      if (t2 != null)
        msgs = ((InternalEObject)t2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__T2, null, msgs);
      if (newT2 != null)
        msgs = ((InternalEObject)newT2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__T2, null, msgs);
      msgs = basicSetT2(newT2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__T2, newT2, newT2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UtyExpr getT4()
  {
    return t4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT4(UtyExpr newT4, NotificationChain msgs)
  {
    UtyExpr oldT4 = t4;
    t4 = newT4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__T4, oldT4, newT4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT4(UtyExpr newT4)
  {
    if (newT4 != t4)
    {
      NotificationChain msgs = null;
      if (t4 != null)
        msgs = ((InternalEObject)t4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__T4, null, msgs);
      if (newT4 != null)
        msgs = ((InternalEObject)newT4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__T4, null, msgs);
      msgs = basicSetT4(newT4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__T4, newT4, newT4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stmt getT()
  {
    return t;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT(Stmt newT, NotificationChain msgs)
  {
    Stmt oldT = t;
    t = newT;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__T, oldT, newT);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT(Stmt newT)
  {
    if (newT != t)
    {
      NotificationChain msgs = null;
      if (t != null)
        msgs = ((InternalEObject)t).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__T, null, msgs);
      if (newT != null)
        msgs = ((InternalEObject)newT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__T, null, msgs);
      msgs = basicSetT(newT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__T, newT, newT));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stmt getT23()
  {
    return t23;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT23(Stmt newT23, NotificationChain msgs)
  {
    Stmt oldT23 = t23;
    t23 = newT23;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__T23, oldT23, newT23);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT23(Stmt newT23)
  {
    if (newT23 != t23)
    {
      NotificationChain msgs = null;
      if (t23 != null)
        msgs = ((InternalEObject)t23).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__T23, null, msgs);
      if (newT23 != null)
        msgs = ((InternalEObject)newT23).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__T23, null, msgs);
      msgs = basicSetT23(newT23, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__T23, newT23, newT23));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UtyExpr getT6()
  {
    return t6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT6(UtyExpr newT6, NotificationChain msgs)
  {
    UtyExpr oldT6 = t6;
    t6 = newT6;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__T6, oldT6, newT6);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT6(UtyExpr newT6)
  {
    if (newT6 != t6)
    {
      NotificationChain msgs = null;
      if (t6 != null)
        msgs = ((InternalEObject)t6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__T6, null, msgs);
      if (newT6 != null)
        msgs = ((InternalEObject)newT6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__T6, null, msgs);
      msgs = basicSetT6(newT6, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__T6, newT6, newT6));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UtyExpr getT5()
  {
    return t5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT5(UtyExpr newT5, NotificationChain msgs)
  {
    UtyExpr oldT5 = t5;
    t5 = newT5;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__T5, oldT5, newT5);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT5(UtyExpr newT5)
  {
    if (newT5 != t5)
    {
      NotificationChain msgs = null;
      if (t5 != null)
        msgs = ((InternalEObject)t5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__T5, null, msgs);
      if (newT5 != null)
        msgs = ((InternalEObject)newT5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__T5, null, msgs);
      msgs = basicSetT5(newT5, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__T5, newT5, newT5));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptUtyExprList getExprs()
  {
    return exprs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprs(OptUtyExprList newExprs, NotificationChain msgs)
  {
    OptUtyExprList oldExprs = exprs;
    exprs = newExprs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__EXPRS, oldExprs, newExprs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprs(OptUtyExprList newExprs)
  {
    if (newExprs != exprs)
    {
      NotificationChain msgs = null;
      if (exprs != null)
        msgs = ((InternalEObject)exprs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__EXPRS, null, msgs);
      if (newExprs != null)
        msgs = ((InternalEObject)newExprs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__EXPRS, null, msgs);
      msgs = basicSetExprs(newExprs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__EXPRS, newExprs, newExprs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stmt getStmt()
  {
    return stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStmt(Stmt newStmt, NotificationChain msgs)
  {
    Stmt oldStmt = stmt;
    stmt = newStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__STMT, oldStmt, newStmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStmt(Stmt newStmt)
  {
    if (newStmt != stmt)
    {
      NotificationChain msgs = null;
      if (stmt != null)
        msgs = ((InternalEObject)stmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__STMT, null, msgs);
      if (newStmt != null)
        msgs = ((InternalEObject)newStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__STMT, null, msgs);
      msgs = basicSetStmt(newStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__STMT, newStmt, newStmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public dUtyExprs getTs()
  {
    return ts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTs(dUtyExprs newTs, NotificationChain msgs)
  {
    dUtyExprs oldTs = ts;
    ts = newTs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__TS, oldTs, newTs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTs(dUtyExprs newTs)
  {
    if (newTs != ts)
    {
      NotificationChain msgs = null;
      if (ts != null)
        msgs = ((InternalEObject)ts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__TS, null, msgs);
      if (newTs != null)
        msgs = ((InternalEObject)newTs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__TS, null, msgs);
      msgs = basicSetTs(newTs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__TS, newTs, newTs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stmt getT08()
  {
    return t08;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT08(Stmt newT08, NotificationChain msgs)
  {
    Stmt oldT08 = t08;
    t08 = newT08;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__T08, oldT08, newT08);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT08(Stmt newT08)
  {
    if (newT08 != t08)
    {
      NotificationChain msgs = null;
      if (t08 != null)
        msgs = ((InternalEObject)t08).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__T08, null, msgs);
      if (newT08 != null)
        msgs = ((InternalEObject)newT08).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__T08, null, msgs);
      msgs = basicSetT08(newT08, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__T08, newT08, newT08));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stmt getT10()
  {
    return t10;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT10(Stmt newT10, NotificationChain msgs)
  {
    Stmt oldT10 = t10;
    t10 = newT10;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__T10, oldT10, newT10);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT10(Stmt newT10)
  {
    if (newT10 != t10)
    {
      NotificationChain msgs = null;
      if (t10 != null)
        msgs = ((InternalEObject)t10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__T10, null, msgs);
      if (newT10 != null)
        msgs = ((InternalEObject)newT10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__T10, null, msgs);
      msgs = basicSetT10(newT10, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__T10, newT10, newT10));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stmt getT24()
  {
    return t24;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT24(Stmt newT24, NotificationChain msgs)
  {
    Stmt oldT24 = t24;
    t24 = newT24;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__T24, oldT24, newT24);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT24(Stmt newT24)
  {
    if (newT24 != t24)
    {
      NotificationChain msgs = null;
      if (t24 != null)
        msgs = ((InternalEObject)t24).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__T24, null, msgs);
      if (newT24 != null)
        msgs = ((InternalEObject)newT24).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.QNAME__T24, null, msgs);
      msgs = basicSetT24(newT24, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.QNAME__T24, newT24, newT24));
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
      case QuartzPackage.QNAME__T07:
        return basicSetT07(null, msgs);
      case QuartzPackage.QNAME__T13:
        return basicSetT13(null, msgs);
      case QuartzPackage.QNAME__T14:
        return basicSetT14(null, msgs);
      case QuartzPackage.QNAME__EXPR:
        return basicSetExpr(null, msgs);
      case QuartzPackage.QNAME__T7:
        return basicSetT7(null, msgs);
      case QuartzPackage.QNAME__NAME:
        return basicSetName(null, msgs);
      case QuartzPackage.QNAME__TYPE:
        return basicSetType(null, msgs);
      case QuartzPackage.QNAME__T2:
        return basicSetT2(null, msgs);
      case QuartzPackage.QNAME__T4:
        return basicSetT4(null, msgs);
      case QuartzPackage.QNAME__T:
        return basicSetT(null, msgs);
      case QuartzPackage.QNAME__T23:
        return basicSetT23(null, msgs);
      case QuartzPackage.QNAME__T6:
        return basicSetT6(null, msgs);
      case QuartzPackage.QNAME__T5:
        return basicSetT5(null, msgs);
      case QuartzPackage.QNAME__EXPRS:
        return basicSetExprs(null, msgs);
      case QuartzPackage.QNAME__STMT:
        return basicSetStmt(null, msgs);
      case QuartzPackage.QNAME__TS:
        return basicSetTs(null, msgs);
      case QuartzPackage.QNAME__T08:
        return basicSetT08(null, msgs);
      case QuartzPackage.QNAME__T10:
        return basicSetT10(null, msgs);
      case QuartzPackage.QNAME__T24:
        return basicSetT24(null, msgs);
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
      case QuartzPackage.QNAME__T07:
        return getT07();
      case QuartzPackage.QNAME__T13:
        return getT13();
      case QuartzPackage.QNAME__T14:
        return getT14();
      case QuartzPackage.QNAME__OP:
        return getOp();
      case QuartzPackage.QNAME__EXPR:
        return getExpr();
      case QuartzPackage.QNAME__T7:
        return getT7();
      case QuartzPackage.QNAME__NAME:
        return getName();
      case QuartzPackage.QNAME__TYPE:
        return getType();
      case QuartzPackage.QNAME__T2:
        return getT2();
      case QuartzPackage.QNAME__T4:
        return getT4();
      case QuartzPackage.QNAME__T:
        return getT();
      case QuartzPackage.QNAME__T23:
        return getT23();
      case QuartzPackage.QNAME__T6:
        return getT6();
      case QuartzPackage.QNAME__T5:
        return getT5();
      case QuartzPackage.QNAME__EXPRS:
        return getExprs();
      case QuartzPackage.QNAME__STMT:
        return getStmt();
      case QuartzPackage.QNAME__TS:
        return getTs();
      case QuartzPackage.QNAME__T08:
        return getT08();
      case QuartzPackage.QNAME__T10:
        return getT10();
      case QuartzPackage.QNAME__T24:
        return getT24();
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
      case QuartzPackage.QNAME__T07:
        setT07((Stmt)newValue);
        return;
      case QuartzPackage.QNAME__T13:
        setT13((Stmt)newValue);
        return;
      case QuartzPackage.QNAME__T14:
        setT14((Stmt)newValue);
        return;
      case QuartzPackage.QNAME__OP:
        setOp((String)newValue);
        return;
      case QuartzPackage.QNAME__EXPR:
        setExpr((dUtyExprs)newValue);
        return;
      case QuartzPackage.QNAME__T7:
        setT7((UtyExpr)newValue);
        return;
      case QuartzPackage.QNAME__NAME:
        setName((QName)newValue);
        return;
      case QuartzPackage.QNAME__TYPE:
        setType((QType)newValue);
        return;
      case QuartzPackage.QNAME__T2:
        setT2((UtyExpr)newValue);
        return;
      case QuartzPackage.QNAME__T4:
        setT4((UtyExpr)newValue);
        return;
      case QuartzPackage.QNAME__T:
        setT((Stmt)newValue);
        return;
      case QuartzPackage.QNAME__T23:
        setT23((Stmt)newValue);
        return;
      case QuartzPackage.QNAME__T6:
        setT6((UtyExpr)newValue);
        return;
      case QuartzPackage.QNAME__T5:
        setT5((UtyExpr)newValue);
        return;
      case QuartzPackage.QNAME__EXPRS:
        setExprs((OptUtyExprList)newValue);
        return;
      case QuartzPackage.QNAME__STMT:
        setStmt((Stmt)newValue);
        return;
      case QuartzPackage.QNAME__TS:
        setTs((dUtyExprs)newValue);
        return;
      case QuartzPackage.QNAME__T08:
        setT08((Stmt)newValue);
        return;
      case QuartzPackage.QNAME__T10:
        setT10((Stmt)newValue);
        return;
      case QuartzPackage.QNAME__T24:
        setT24((Stmt)newValue);
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
      case QuartzPackage.QNAME__T07:
        setT07((Stmt)null);
        return;
      case QuartzPackage.QNAME__T13:
        setT13((Stmt)null);
        return;
      case QuartzPackage.QNAME__T14:
        setT14((Stmt)null);
        return;
      case QuartzPackage.QNAME__OP:
        setOp(OP_EDEFAULT);
        return;
      case QuartzPackage.QNAME__EXPR:
        setExpr((dUtyExprs)null);
        return;
      case QuartzPackage.QNAME__T7:
        setT7((UtyExpr)null);
        return;
      case QuartzPackage.QNAME__NAME:
        setName((QName)null);
        return;
      case QuartzPackage.QNAME__TYPE:
        setType((QType)null);
        return;
      case QuartzPackage.QNAME__T2:
        setT2((UtyExpr)null);
        return;
      case QuartzPackage.QNAME__T4:
        setT4((UtyExpr)null);
        return;
      case QuartzPackage.QNAME__T:
        setT((Stmt)null);
        return;
      case QuartzPackage.QNAME__T23:
        setT23((Stmt)null);
        return;
      case QuartzPackage.QNAME__T6:
        setT6((UtyExpr)null);
        return;
      case QuartzPackage.QNAME__T5:
        setT5((UtyExpr)null);
        return;
      case QuartzPackage.QNAME__EXPRS:
        setExprs((OptUtyExprList)null);
        return;
      case QuartzPackage.QNAME__STMT:
        setStmt((Stmt)null);
        return;
      case QuartzPackage.QNAME__TS:
        setTs((dUtyExprs)null);
        return;
      case QuartzPackage.QNAME__T08:
        setT08((Stmt)null);
        return;
      case QuartzPackage.QNAME__T10:
        setT10((Stmt)null);
        return;
      case QuartzPackage.QNAME__T24:
        setT24((Stmt)null);
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
      case QuartzPackage.QNAME__T07:
        return t07 != null;
      case QuartzPackage.QNAME__T13:
        return t13 != null;
      case QuartzPackage.QNAME__T14:
        return t14 != null;
      case QuartzPackage.QNAME__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case QuartzPackage.QNAME__EXPR:
        return expr != null;
      case QuartzPackage.QNAME__T7:
        return t7 != null;
      case QuartzPackage.QNAME__NAME:
        return name != null;
      case QuartzPackage.QNAME__TYPE:
        return type != null;
      case QuartzPackage.QNAME__T2:
        return t2 != null;
      case QuartzPackage.QNAME__T4:
        return t4 != null;
      case QuartzPackage.QNAME__T:
        return t != null;
      case QuartzPackage.QNAME__T23:
        return t23 != null;
      case QuartzPackage.QNAME__T6:
        return t6 != null;
      case QuartzPackage.QNAME__T5:
        return t5 != null;
      case QuartzPackage.QNAME__EXPRS:
        return exprs != null;
      case QuartzPackage.QNAME__STMT:
        return stmt != null;
      case QuartzPackage.QNAME__TS:
        return ts != null;
      case QuartzPackage.QNAME__T08:
        return t08 != null;
      case QuartzPackage.QNAME__T10:
        return t10 != null;
      case QuartzPackage.QNAME__T24:
        return t24 != null;
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
        default: return -1;
      }
    }
    if (baseClass == UtyAction.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == dUtyExprs.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == dUtyExpr.class)
    {
      switch (derivedFeatureID)
      {
        case QuartzPackage.QNAME__T07: return QuartzPackage.DUTY_EXPR__T07;
        case QuartzPackage.QNAME__T13: return QuartzPackage.DUTY_EXPR__T13;
        case QuartzPackage.QNAME__T14: return QuartzPackage.DUTY_EXPR__T14;
        default: return -1;
      }
    }
    if (baseClass == UtyExpr.class)
    {
      switch (derivedFeatureID)
      {
        case QuartzPackage.QNAME__OP: return QuartzPackage.UTY_EXPR__OP;
        case QuartzPackage.QNAME__EXPR: return QuartzPackage.UTY_EXPR__EXPR;
        case QuartzPackage.QNAME__T7: return QuartzPackage.UTY_EXPR__T7;
        case QuartzPackage.QNAME__NAME: return QuartzPackage.UTY_EXPR__NAME;
        case QuartzPackage.QNAME__TYPE: return QuartzPackage.UTY_EXPR__TYPE;
        case QuartzPackage.QNAME__T2: return QuartzPackage.UTY_EXPR__T2;
        case QuartzPackage.QNAME__T4: return QuartzPackage.UTY_EXPR__T4;
        default: return -1;
      }
    }
    if (baseClass == Generic.class)
    {
      switch (derivedFeatureID)
      {
        case QuartzPackage.QNAME__T: return QuartzPackage.GENERIC__T;
        case QuartzPackage.QNAME__T23: return QuartzPackage.GENERIC__T23;
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
        default: return -1;
      }
    }
    if (baseClass == UtyAction.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == dUtyExprs.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == dUtyExpr.class)
    {
      switch (baseFeatureID)
      {
        case QuartzPackage.DUTY_EXPR__T07: return QuartzPackage.QNAME__T07;
        case QuartzPackage.DUTY_EXPR__T13: return QuartzPackage.QNAME__T13;
        case QuartzPackage.DUTY_EXPR__T14: return QuartzPackage.QNAME__T14;
        default: return -1;
      }
    }
    if (baseClass == UtyExpr.class)
    {
      switch (baseFeatureID)
      {
        case QuartzPackage.UTY_EXPR__OP: return QuartzPackage.QNAME__OP;
        case QuartzPackage.UTY_EXPR__EXPR: return QuartzPackage.QNAME__EXPR;
        case QuartzPackage.UTY_EXPR__T7: return QuartzPackage.QNAME__T7;
        case QuartzPackage.UTY_EXPR__NAME: return QuartzPackage.QNAME__NAME;
        case QuartzPackage.UTY_EXPR__TYPE: return QuartzPackage.QNAME__TYPE;
        case QuartzPackage.UTY_EXPR__T2: return QuartzPackage.QNAME__T2;
        case QuartzPackage.UTY_EXPR__T4: return QuartzPackage.QNAME__T4;
        default: return -1;
      }
    }
    if (baseClass == Generic.class)
    {
      switch (baseFeatureID)
      {
        case QuartzPackage.GENERIC__T: return QuartzPackage.QNAME__T;
        case QuartzPackage.GENERIC__T23: return QuartzPackage.QNAME__T23;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //QNameImpl
