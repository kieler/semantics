/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.Statement;
import de.cau.cs.kieler.esterel.WeakAbort;
import de.cau.cs.kieler.esterel.WeakAbortBody;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weak Abort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.WeakAbortImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.WeakAbortImpl#getWeakAbortBody <em>Weak Abort Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WeakAbortImpl extends StatementImpl implements WeakAbort
{
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
   * The cached value of the '{@link #getWeakAbortBody() <em>Weak Abort Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeakAbortBody()
   * @generated
   * @ordered
   */
  protected WeakAbortBody weakAbortBody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WeakAbortImpl()
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
    return EsterelPackage.Literals.WEAK_ABORT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.WEAK_ABORT__STATEMENT, oldStatement, newStatement);
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
        msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.WEAK_ABORT__STATEMENT, null, msgs);
      if (newStatement != null)
        msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.WEAK_ABORT__STATEMENT, null, msgs);
      msgs = basicSetStatement(newStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.WEAK_ABORT__STATEMENT, newStatement, newStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeakAbortBody getWeakAbortBody()
  {
    return weakAbortBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWeakAbortBody(WeakAbortBody newWeakAbortBody, NotificationChain msgs)
  {
    WeakAbortBody oldWeakAbortBody = weakAbortBody;
    weakAbortBody = newWeakAbortBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.WEAK_ABORT__WEAK_ABORT_BODY, oldWeakAbortBody, newWeakAbortBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeakAbortBody(WeakAbortBody newWeakAbortBody)
  {
    if (newWeakAbortBody != weakAbortBody)
    {
      NotificationChain msgs = null;
      if (weakAbortBody != null)
        msgs = ((InternalEObject)weakAbortBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.WEAK_ABORT__WEAK_ABORT_BODY, null, msgs);
      if (newWeakAbortBody != null)
        msgs = ((InternalEObject)newWeakAbortBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.WEAK_ABORT__WEAK_ABORT_BODY, null, msgs);
      msgs = basicSetWeakAbortBody(newWeakAbortBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.WEAK_ABORT__WEAK_ABORT_BODY, newWeakAbortBody, newWeakAbortBody));
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
      case EsterelPackage.WEAK_ABORT__STATEMENT:
        return basicSetStatement(null, msgs);
      case EsterelPackage.WEAK_ABORT__WEAK_ABORT_BODY:
        return basicSetWeakAbortBody(null, msgs);
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
      case EsterelPackage.WEAK_ABORT__STATEMENT:
        return getStatement();
      case EsterelPackage.WEAK_ABORT__WEAK_ABORT_BODY:
        return getWeakAbortBody();
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
      case EsterelPackage.WEAK_ABORT__STATEMENT:
        setStatement((Statement)newValue);
        return;
      case EsterelPackage.WEAK_ABORT__WEAK_ABORT_BODY:
        setWeakAbortBody((WeakAbortBody)newValue);
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
      case EsterelPackage.WEAK_ABORT__STATEMENT:
        setStatement((Statement)null);
        return;
      case EsterelPackage.WEAK_ABORT__WEAK_ABORT_BODY:
        setWeakAbortBody((WeakAbortBody)null);
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
      case EsterelPackage.WEAK_ABORT__STATEMENT:
        return statement != null;
      case EsterelPackage.WEAK_ABORT__WEAK_ABORT_BODY:
        return weakAbortBody != null;
    }
    return super.eIsSet(featureID);
  }

} //WeakAbortImpl
