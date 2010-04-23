/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.Statement;
import de.cau.cs.kieler.esterel.esterel.TrapExpr;
import de.cau.cs.kieler.esterel.esterel.TrapHandler;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trap Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.TrapHandlerImpl#getTrapExpr <em>Trap Expr</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.TrapHandlerImpl#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrapHandlerImpl extends MinimalEObjectImpl.Container implements TrapHandler
{
  /**
   * The cached value of the '{@link #getTrapExpr() <em>Trap Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrapExpr()
   * @generated
   * @ordered
   */
  protected TrapExpr trapExpr;

  /**
   * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement()
   * @generated
   * @ordered
   */
  protected Statement statement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TrapHandlerImpl()
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
    return EsterelPackage.Literals.TRAP_HANDLER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrapExpr getTrapExpr()
  {
    return trapExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrapExpr(TrapExpr newTrapExpr, NotificationChain msgs)
  {
    TrapExpr oldTrapExpr = trapExpr;
    trapExpr = newTrapExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.TRAP_HANDLER__TRAP_EXPR, oldTrapExpr, newTrapExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrapExpr(TrapExpr newTrapExpr)
  {
    if (newTrapExpr != trapExpr)
    {
      NotificationChain msgs = null;
      if (trapExpr != null)
        msgs = ((InternalEObject)trapExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.TRAP_HANDLER__TRAP_EXPR, null, msgs);
      if (newTrapExpr != null)
        msgs = ((InternalEObject)newTrapExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.TRAP_HANDLER__TRAP_EXPR, null, msgs);
      msgs = basicSetTrapExpr(newTrapExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.TRAP_HANDLER__TRAP_EXPR, newTrapExpr, newTrapExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getStatement()
  {
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatement(Statement newStatement, NotificationChain msgs)
  {
    Statement oldStatement = statement;
    statement = newStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.TRAP_HANDLER__STATEMENT, oldStatement, newStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatement(Statement newStatement)
  {
    if (newStatement != statement)
    {
      NotificationChain msgs = null;
      if (statement != null)
        msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.TRAP_HANDLER__STATEMENT, null, msgs);
      if (newStatement != null)
        msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.TRAP_HANDLER__STATEMENT, null, msgs);
      msgs = basicSetStatement(newStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.TRAP_HANDLER__STATEMENT, newStatement, newStatement));
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
      case EsterelPackage.TRAP_HANDLER__TRAP_EXPR:
        return basicSetTrapExpr(null, msgs);
      case EsterelPackage.TRAP_HANDLER__STATEMENT:
        return basicSetStatement(null, msgs);
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
      case EsterelPackage.TRAP_HANDLER__TRAP_EXPR:
        return getTrapExpr();
      case EsterelPackage.TRAP_HANDLER__STATEMENT:
        return getStatement();
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
      case EsterelPackage.TRAP_HANDLER__TRAP_EXPR:
        setTrapExpr((TrapExpr)newValue);
        return;
      case EsterelPackage.TRAP_HANDLER__STATEMENT:
        setStatement((Statement)newValue);
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
      case EsterelPackage.TRAP_HANDLER__TRAP_EXPR:
        setTrapExpr((TrapExpr)null);
        return;
      case EsterelPackage.TRAP_HANDLER__STATEMENT:
        setStatement((Statement)null);
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
      case EsterelPackage.TRAP_HANDLER__TRAP_EXPR:
        return trapExpr != null;
      case EsterelPackage.TRAP_HANDLER__STATEMENT:
        return statement != null;
    }
    return super.eIsSet(featureID);
  }

} //TrapHandlerImpl
