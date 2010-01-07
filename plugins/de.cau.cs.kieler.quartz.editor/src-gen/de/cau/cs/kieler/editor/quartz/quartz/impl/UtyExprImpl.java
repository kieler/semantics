/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.editor.quartz.quartz.impl;

import de.cau.cs.kieler.editor.quartz.quartz.QName;
import de.cau.cs.kieler.editor.quartz.quartz.QType;
import de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage;
import de.cau.cs.kieler.editor.quartz.quartz.Stmt;
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
 * An implementation of the model object '<em><b>Uty Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.UtyExprImpl#getT07 <em>T07</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.UtyExprImpl#getT13 <em>T13</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.UtyExprImpl#getT14 <em>T14</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.UtyExprImpl#getOp <em>Op</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.UtyExprImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.UtyExprImpl#getT7 <em>T7</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.UtyExprImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.UtyExprImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.UtyExprImpl#getT2 <em>T2</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.impl.UtyExprImpl#getT4 <em>T4</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UtyExprImpl extends UtyActionImpl implements UtyExpr
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UtyExprImpl()
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
    return QuartzPackage.Literals.UTY_EXPR;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.UTY_EXPR__T07, oldT07, newT07);
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
        msgs = ((InternalEObject)t07).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.UTY_EXPR__T07, null, msgs);
      if (newT07 != null)
        msgs = ((InternalEObject)newT07).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.UTY_EXPR__T07, null, msgs);
      msgs = basicSetT07(newT07, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.UTY_EXPR__T07, newT07, newT07));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.UTY_EXPR__T13, oldT13, newT13);
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
        msgs = ((InternalEObject)t13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.UTY_EXPR__T13, null, msgs);
      if (newT13 != null)
        msgs = ((InternalEObject)newT13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.UTY_EXPR__T13, null, msgs);
      msgs = basicSetT13(newT13, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.UTY_EXPR__T13, newT13, newT13));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.UTY_EXPR__T14, oldT14, newT14);
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
        msgs = ((InternalEObject)t14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.UTY_EXPR__T14, null, msgs);
      if (newT14 != null)
        msgs = ((InternalEObject)newT14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.UTY_EXPR__T14, null, msgs);
      msgs = basicSetT14(newT14, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.UTY_EXPR__T14, newT14, newT14));
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
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.UTY_EXPR__OP, oldOp, op));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.UTY_EXPR__EXPR, oldExpr, newExpr);
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
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.UTY_EXPR__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.UTY_EXPR__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.UTY_EXPR__EXPR, newExpr, newExpr));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.UTY_EXPR__T7, oldT7, newT7);
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
        msgs = ((InternalEObject)t7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.UTY_EXPR__T7, null, msgs);
      if (newT7 != null)
        msgs = ((InternalEObject)newT7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.UTY_EXPR__T7, null, msgs);
      msgs = basicSetT7(newT7, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.UTY_EXPR__T7, newT7, newT7));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.UTY_EXPR__NAME, oldName, newName);
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
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.UTY_EXPR__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.UTY_EXPR__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.UTY_EXPR__NAME, newName, newName));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.UTY_EXPR__TYPE, oldType, newType);
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
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.UTY_EXPR__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.UTY_EXPR__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.UTY_EXPR__TYPE, newType, newType));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.UTY_EXPR__T2, oldT2, newT2);
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
        msgs = ((InternalEObject)t2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.UTY_EXPR__T2, null, msgs);
      if (newT2 != null)
        msgs = ((InternalEObject)newT2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.UTY_EXPR__T2, null, msgs);
      msgs = basicSetT2(newT2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.UTY_EXPR__T2, newT2, newT2));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuartzPackage.UTY_EXPR__T4, oldT4, newT4);
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
        msgs = ((InternalEObject)t4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.UTY_EXPR__T4, null, msgs);
      if (newT4 != null)
        msgs = ((InternalEObject)newT4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuartzPackage.UTY_EXPR__T4, null, msgs);
      msgs = basicSetT4(newT4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuartzPackage.UTY_EXPR__T4, newT4, newT4));
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
      case QuartzPackage.UTY_EXPR__T07:
        return basicSetT07(null, msgs);
      case QuartzPackage.UTY_EXPR__T13:
        return basicSetT13(null, msgs);
      case QuartzPackage.UTY_EXPR__T14:
        return basicSetT14(null, msgs);
      case QuartzPackage.UTY_EXPR__EXPR:
        return basicSetExpr(null, msgs);
      case QuartzPackage.UTY_EXPR__T7:
        return basicSetT7(null, msgs);
      case QuartzPackage.UTY_EXPR__NAME:
        return basicSetName(null, msgs);
      case QuartzPackage.UTY_EXPR__TYPE:
        return basicSetType(null, msgs);
      case QuartzPackage.UTY_EXPR__T2:
        return basicSetT2(null, msgs);
      case QuartzPackage.UTY_EXPR__T4:
        return basicSetT4(null, msgs);
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
      case QuartzPackage.UTY_EXPR__T07:
        return getT07();
      case QuartzPackage.UTY_EXPR__T13:
        return getT13();
      case QuartzPackage.UTY_EXPR__T14:
        return getT14();
      case QuartzPackage.UTY_EXPR__OP:
        return getOp();
      case QuartzPackage.UTY_EXPR__EXPR:
        return getExpr();
      case QuartzPackage.UTY_EXPR__T7:
        return getT7();
      case QuartzPackage.UTY_EXPR__NAME:
        return getName();
      case QuartzPackage.UTY_EXPR__TYPE:
        return getType();
      case QuartzPackage.UTY_EXPR__T2:
        return getT2();
      case QuartzPackage.UTY_EXPR__T4:
        return getT4();
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
      case QuartzPackage.UTY_EXPR__T07:
        setT07((Stmt)newValue);
        return;
      case QuartzPackage.UTY_EXPR__T13:
        setT13((Stmt)newValue);
        return;
      case QuartzPackage.UTY_EXPR__T14:
        setT14((Stmt)newValue);
        return;
      case QuartzPackage.UTY_EXPR__OP:
        setOp((String)newValue);
        return;
      case QuartzPackage.UTY_EXPR__EXPR:
        setExpr((dUtyExprs)newValue);
        return;
      case QuartzPackage.UTY_EXPR__T7:
        setT7((UtyExpr)newValue);
        return;
      case QuartzPackage.UTY_EXPR__NAME:
        setName((QName)newValue);
        return;
      case QuartzPackage.UTY_EXPR__TYPE:
        setType((QType)newValue);
        return;
      case QuartzPackage.UTY_EXPR__T2:
        setT2((UtyExpr)newValue);
        return;
      case QuartzPackage.UTY_EXPR__T4:
        setT4((UtyExpr)newValue);
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
      case QuartzPackage.UTY_EXPR__T07:
        setT07((Stmt)null);
        return;
      case QuartzPackage.UTY_EXPR__T13:
        setT13((Stmt)null);
        return;
      case QuartzPackage.UTY_EXPR__T14:
        setT14((Stmt)null);
        return;
      case QuartzPackage.UTY_EXPR__OP:
        setOp(OP_EDEFAULT);
        return;
      case QuartzPackage.UTY_EXPR__EXPR:
        setExpr((dUtyExprs)null);
        return;
      case QuartzPackage.UTY_EXPR__T7:
        setT7((UtyExpr)null);
        return;
      case QuartzPackage.UTY_EXPR__NAME:
        setName((QName)null);
        return;
      case QuartzPackage.UTY_EXPR__TYPE:
        setType((QType)null);
        return;
      case QuartzPackage.UTY_EXPR__T2:
        setT2((UtyExpr)null);
        return;
      case QuartzPackage.UTY_EXPR__T4:
        setT4((UtyExpr)null);
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
      case QuartzPackage.UTY_EXPR__T07:
        return t07 != null;
      case QuartzPackage.UTY_EXPR__T13:
        return t13 != null;
      case QuartzPackage.UTY_EXPR__T14:
        return t14 != null;
      case QuartzPackage.UTY_EXPR__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case QuartzPackage.UTY_EXPR__EXPR:
        return expr != null;
      case QuartzPackage.UTY_EXPR__T7:
        return t7 != null;
      case QuartzPackage.UTY_EXPR__NAME:
        return name != null;
      case QuartzPackage.UTY_EXPR__TYPE:
        return type != null;
      case QuartzPackage.UTY_EXPR__T2:
        return t2 != null;
      case QuartzPackage.UTY_EXPR__T4:
        return t4 != null;
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
        case QuartzPackage.UTY_EXPR__T07: return QuartzPackage.DUTY_EXPR__T07;
        case QuartzPackage.UTY_EXPR__T13: return QuartzPackage.DUTY_EXPR__T13;
        case QuartzPackage.UTY_EXPR__T14: return QuartzPackage.DUTY_EXPR__T14;
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
        case QuartzPackage.DUTY_EXPR__T07: return QuartzPackage.UTY_EXPR__T07;
        case QuartzPackage.DUTY_EXPR__T13: return QuartzPackage.UTY_EXPR__T13;
        case QuartzPackage.DUTY_EXPR__T14: return QuartzPackage.UTY_EXPR__T14;
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

} //UtyExprImpl
