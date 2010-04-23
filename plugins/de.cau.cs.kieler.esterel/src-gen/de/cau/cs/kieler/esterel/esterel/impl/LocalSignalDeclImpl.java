/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.LocalSignalDecl;
import de.cau.cs.kieler.esterel.esterel.LocalSignalList;
import de.cau.cs.kieler.esterel.esterel.Statement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Signal Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.LocalSignalDeclImpl#getSignalList <em>Signal List</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.LocalSignalDeclImpl#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalSignalDeclImpl extends StatementImpl implements LocalSignalDecl
{
  /**
   * The cached value of the '{@link #getSignalList() <em>Signal List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignalList()
   * @generated
   * @ordered
   */
  protected LocalSignalList signalList;

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
  protected LocalSignalDeclImpl()
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
    return EsterelPackage.Literals.LOCAL_SIGNAL_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalSignalList getSignalList()
  {
    return signalList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSignalList(LocalSignalList newSignalList, NotificationChain msgs)
  {
    LocalSignalList oldSignalList = signalList;
    signalList = newSignalList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.LOCAL_SIGNAL_DECL__SIGNAL_LIST, oldSignalList, newSignalList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSignalList(LocalSignalList newSignalList)
  {
    if (newSignalList != signalList)
    {
      NotificationChain msgs = null;
      if (signalList != null)
        msgs = ((InternalEObject)signalList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.LOCAL_SIGNAL_DECL__SIGNAL_LIST, null, msgs);
      if (newSignalList != null)
        msgs = ((InternalEObject)newSignalList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.LOCAL_SIGNAL_DECL__SIGNAL_LIST, null, msgs);
      msgs = basicSetSignalList(newSignalList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.LOCAL_SIGNAL_DECL__SIGNAL_LIST, newSignalList, newSignalList));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.LOCAL_SIGNAL_DECL__STATEMENT, oldStatement, newStatement);
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
        msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.LOCAL_SIGNAL_DECL__STATEMENT, null, msgs);
      if (newStatement != null)
        msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.LOCAL_SIGNAL_DECL__STATEMENT, null, msgs);
      msgs = basicSetStatement(newStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.LOCAL_SIGNAL_DECL__STATEMENT, newStatement, newStatement));
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
      case EsterelPackage.LOCAL_SIGNAL_DECL__SIGNAL_LIST:
        return basicSetSignalList(null, msgs);
      case EsterelPackage.LOCAL_SIGNAL_DECL__STATEMENT:
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
      case EsterelPackage.LOCAL_SIGNAL_DECL__SIGNAL_LIST:
        return getSignalList();
      case EsterelPackage.LOCAL_SIGNAL_DECL__STATEMENT:
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
      case EsterelPackage.LOCAL_SIGNAL_DECL__SIGNAL_LIST:
        setSignalList((LocalSignalList)newValue);
        return;
      case EsterelPackage.LOCAL_SIGNAL_DECL__STATEMENT:
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
      case EsterelPackage.LOCAL_SIGNAL_DECL__SIGNAL_LIST:
        setSignalList((LocalSignalList)null);
        return;
      case EsterelPackage.LOCAL_SIGNAL_DECL__STATEMENT:
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
      case EsterelPackage.LOCAL_SIGNAL_DECL__SIGNAL_LIST:
        return signalList != null;
      case EsterelPackage.LOCAL_SIGNAL_DECL__STATEMENT:
        return statement != null;
    }
    return super.eIsSet(featureID);
  }

} //LocalSignalDeclImpl
