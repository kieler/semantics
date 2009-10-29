/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.DataExpr;
import de.cau.cs.kieler.esterel.ElsIfPart;
import de.cau.cs.kieler.esterel.ElsePart;
import de.cau.cs.kieler.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.IfTest;
import de.cau.cs.kieler.esterel.ThenPart;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.IfTestImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.IfTestImpl#getThen <em>Then</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.IfTestImpl#getElseIf <em>Else If</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.IfTestImpl#getElse <em>Else</em>}</li>
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
  protected DataExpr expr;

  /**
   * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThen()
   * @generated
   * @ordered
   */
  protected ThenPart then;

  /**
   * The cached value of the '{@link #getElseIf() <em>Else If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseIf()
   * @generated
   * @ordered
   */
  protected ElsIfPart elseIf;

  /**
   * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElse()
   * @generated
   * @ordered
   */
  protected ElsePart else_;

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
  public DataExpr getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(DataExpr newExpr, NotificationChain msgs)
  {
    DataExpr oldExpr = expr;
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
  public void setExpr(DataExpr newExpr)
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
  public ThenPart getThen()
  {
    return then;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThen(ThenPart newThen, NotificationChain msgs)
  {
    ThenPart oldThen = then;
    then = newThen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.IF_TEST__THEN, oldThen, newThen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThen(ThenPart newThen)
  {
    if (newThen != then)
    {
      NotificationChain msgs = null;
      if (then != null)
        msgs = ((InternalEObject)then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.IF_TEST__THEN, null, msgs);
      if (newThen != null)
        msgs = ((InternalEObject)newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.IF_TEST__THEN, null, msgs);
      msgs = basicSetThen(newThen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.IF_TEST__THEN, newThen, newThen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElsIfPart getElseIf()
  {
    return elseIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElseIf(ElsIfPart newElseIf, NotificationChain msgs)
  {
    ElsIfPart oldElseIf = elseIf;
    elseIf = newElseIf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.IF_TEST__ELSE_IF, oldElseIf, newElseIf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElseIf(ElsIfPart newElseIf)
  {
    if (newElseIf != elseIf)
    {
      NotificationChain msgs = null;
      if (elseIf != null)
        msgs = ((InternalEObject)elseIf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.IF_TEST__ELSE_IF, null, msgs);
      if (newElseIf != null)
        msgs = ((InternalEObject)newElseIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.IF_TEST__ELSE_IF, null, msgs);
      msgs = basicSetElseIf(newElseIf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.IF_TEST__ELSE_IF, newElseIf, newElseIf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElsePart getElse()
  {
    return else_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElse(ElsePart newElse, NotificationChain msgs)
  {
    ElsePart oldElse = else_;
    else_ = newElse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.IF_TEST__ELSE, oldElse, newElse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElse(ElsePart newElse)
  {
    if (newElse != else_)
    {
      NotificationChain msgs = null;
      if (else_ != null)
        msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.IF_TEST__ELSE, null, msgs);
      if (newElse != null)
        msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.IF_TEST__ELSE, null, msgs);
      msgs = basicSetElse(newElse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.IF_TEST__ELSE, newElse, newElse));
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
      case EsterelPackage.IF_TEST__THEN:
        return basicSetThen(null, msgs);
      case EsterelPackage.IF_TEST__ELSE_IF:
        return basicSetElseIf(null, msgs);
      case EsterelPackage.IF_TEST__ELSE:
        return basicSetElse(null, msgs);
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
      case EsterelPackage.IF_TEST__THEN:
        return getThen();
      case EsterelPackage.IF_TEST__ELSE_IF:
        return getElseIf();
      case EsterelPackage.IF_TEST__ELSE:
        return getElse();
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
      case EsterelPackage.IF_TEST__EXPR:
        setExpr((DataExpr)newValue);
        return;
      case EsterelPackage.IF_TEST__THEN:
        setThen((ThenPart)newValue);
        return;
      case EsterelPackage.IF_TEST__ELSE_IF:
        setElseIf((ElsIfPart)newValue);
        return;
      case EsterelPackage.IF_TEST__ELSE:
        setElse((ElsePart)newValue);
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
        setExpr((DataExpr)null);
        return;
      case EsterelPackage.IF_TEST__THEN:
        setThen((ThenPart)null);
        return;
      case EsterelPackage.IF_TEST__ELSE_IF:
        setElseIf((ElsIfPart)null);
        return;
      case EsterelPackage.IF_TEST__ELSE:
        setElse((ElsePart)null);
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
      case EsterelPackage.IF_TEST__THEN:
        return then != null;
      case EsterelPackage.IF_TEST__ELSE_IF:
        return elseIf != null;
      case EsterelPackage.IF_TEST__ELSE:
        return else_ != null;
    }
    return super.eIsSet(featureID);
  }

} //IfTestImpl
