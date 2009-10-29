/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.Statement;
import de.cau.cs.kieler.esterel.Trap;
import de.cau.cs.kieler.esterel.TrapDeclList;
import de.cau.cs.kieler.esterel.TrapHandlerList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trap</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.TrapImpl#getTrapDeclList <em>Trap Decl List</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.TrapImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.TrapImpl#getTrapHandlerList <em>Trap Handler List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrapImpl extends StatementImpl implements Trap
{
  /**
   * The cached value of the '{@link #getTrapDeclList() <em>Trap Decl List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrapDeclList()
   * @generated
   * @ordered
   */
  protected TrapDeclList trapDeclList;

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
   * The cached value of the '{@link #getTrapHandlerList() <em>Trap Handler List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrapHandlerList()
   * @generated
   * @ordered
   */
  protected TrapHandlerList trapHandlerList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TrapImpl()
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
    return EsterelPackage.Literals.TRAP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrapDeclList getTrapDeclList()
  {
    return trapDeclList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrapDeclList(TrapDeclList newTrapDeclList, NotificationChain msgs)
  {
    TrapDeclList oldTrapDeclList = trapDeclList;
    trapDeclList = newTrapDeclList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.TRAP__TRAP_DECL_LIST, oldTrapDeclList, newTrapDeclList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrapDeclList(TrapDeclList newTrapDeclList)
  {
    if (newTrapDeclList != trapDeclList)
    {
      NotificationChain msgs = null;
      if (trapDeclList != null)
        msgs = ((InternalEObject)trapDeclList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.TRAP__TRAP_DECL_LIST, null, msgs);
      if (newTrapDeclList != null)
        msgs = ((InternalEObject)newTrapDeclList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.TRAP__TRAP_DECL_LIST, null, msgs);
      msgs = basicSetTrapDeclList(newTrapDeclList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.TRAP__TRAP_DECL_LIST, newTrapDeclList, newTrapDeclList));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.TRAP__STATEMENT, oldStatement, newStatement);
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
        msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.TRAP__STATEMENT, null, msgs);
      if (newStatement != null)
        msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.TRAP__STATEMENT, null, msgs);
      msgs = basicSetStatement(newStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.TRAP__STATEMENT, newStatement, newStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TrapHandlerList getTrapHandlerList()
  {
    return trapHandlerList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrapHandlerList(TrapHandlerList newTrapHandlerList, NotificationChain msgs)
  {
    TrapHandlerList oldTrapHandlerList = trapHandlerList;
    trapHandlerList = newTrapHandlerList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.TRAP__TRAP_HANDLER_LIST, oldTrapHandlerList, newTrapHandlerList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrapHandlerList(TrapHandlerList newTrapHandlerList)
  {
    if (newTrapHandlerList != trapHandlerList)
    {
      NotificationChain msgs = null;
      if (trapHandlerList != null)
        msgs = ((InternalEObject)trapHandlerList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.TRAP__TRAP_HANDLER_LIST, null, msgs);
      if (newTrapHandlerList != null)
        msgs = ((InternalEObject)newTrapHandlerList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.TRAP__TRAP_HANDLER_LIST, null, msgs);
      msgs = basicSetTrapHandlerList(newTrapHandlerList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.TRAP__TRAP_HANDLER_LIST, newTrapHandlerList, newTrapHandlerList));
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
      case EsterelPackage.TRAP__TRAP_DECL_LIST:
        return basicSetTrapDeclList(null, msgs);
      case EsterelPackage.TRAP__STATEMENT:
        return basicSetStatement(null, msgs);
      case EsterelPackage.TRAP__TRAP_HANDLER_LIST:
        return basicSetTrapHandlerList(null, msgs);
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
      case EsterelPackage.TRAP__TRAP_DECL_LIST:
        return getTrapDeclList();
      case EsterelPackage.TRAP__STATEMENT:
        return getStatement();
      case EsterelPackage.TRAP__TRAP_HANDLER_LIST:
        return getTrapHandlerList();
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
      case EsterelPackage.TRAP__TRAP_DECL_LIST:
        setTrapDeclList((TrapDeclList)newValue);
        return;
      case EsterelPackage.TRAP__STATEMENT:
        setStatement((Statement)newValue);
        return;
      case EsterelPackage.TRAP__TRAP_HANDLER_LIST:
        setTrapHandlerList((TrapHandlerList)newValue);
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
      case EsterelPackage.TRAP__TRAP_DECL_LIST:
        setTrapDeclList((TrapDeclList)null);
        return;
      case EsterelPackage.TRAP__STATEMENT:
        setStatement((Statement)null);
        return;
      case EsterelPackage.TRAP__TRAP_HANDLER_LIST:
        setTrapHandlerList((TrapHandlerList)null);
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
      case EsterelPackage.TRAP__TRAP_DECL_LIST:
        return trapDeclList != null;
      case EsterelPackage.TRAP__STATEMENT:
        return statement != null;
      case EsterelPackage.TRAP__TRAP_HANDLER_LIST:
        return trapHandlerList != null;
    }
    return super.eIsSet(featureID);
  }

} //TrapImpl
