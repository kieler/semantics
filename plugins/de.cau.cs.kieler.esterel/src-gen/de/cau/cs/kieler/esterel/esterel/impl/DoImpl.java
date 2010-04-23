/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.esterel.esterel.Do;
import de.cau.cs.kieler.esterel.esterel.DoUpto;
import de.cau.cs.kieler.esterel.esterel.DoWatching;
import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.Statement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Do</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.DoImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.DoImpl#getEndUp <em>End Up</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.DoImpl#getEndWatch <em>End Watch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DoImpl extends StatementImpl implements Do
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
   * The cached value of the '{@link #getEndUp() <em>End Up</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndUp()
   * @generated
   * @ordered
   */
  protected DoUpto endUp;

  /**
   * The cached value of the '{@link #getEndWatch() <em>End Watch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndWatch()
   * @generated
   * @ordered
   */
  protected DoWatching endWatch;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DoImpl()
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
    return EsterelPackage.Literals.DO;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.DO__STATEMENT, oldStatement, newStatement);
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
        msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.DO__STATEMENT, null, msgs);
      if (newStatement != null)
        msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.DO__STATEMENT, null, msgs);
      msgs = basicSetStatement(newStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.DO__STATEMENT, newStatement, newStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoUpto getEndUp()
  {
    return endUp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEndUp(DoUpto newEndUp, NotificationChain msgs)
  {
    DoUpto oldEndUp = endUp;
    endUp = newEndUp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.DO__END_UP, oldEndUp, newEndUp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndUp(DoUpto newEndUp)
  {
    if (newEndUp != endUp)
    {
      NotificationChain msgs = null;
      if (endUp != null)
        msgs = ((InternalEObject)endUp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.DO__END_UP, null, msgs);
      if (newEndUp != null)
        msgs = ((InternalEObject)newEndUp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.DO__END_UP, null, msgs);
      msgs = basicSetEndUp(newEndUp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.DO__END_UP, newEndUp, newEndUp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoWatching getEndWatch()
  {
    return endWatch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEndWatch(DoWatching newEndWatch, NotificationChain msgs)
  {
    DoWatching oldEndWatch = endWatch;
    endWatch = newEndWatch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.DO__END_WATCH, oldEndWatch, newEndWatch);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndWatch(DoWatching newEndWatch)
  {
    if (newEndWatch != endWatch)
    {
      NotificationChain msgs = null;
      if (endWatch != null)
        msgs = ((InternalEObject)endWatch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.DO__END_WATCH, null, msgs);
      if (newEndWatch != null)
        msgs = ((InternalEObject)newEndWatch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.DO__END_WATCH, null, msgs);
      msgs = basicSetEndWatch(newEndWatch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.DO__END_WATCH, newEndWatch, newEndWatch));
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
      case EsterelPackage.DO__STATEMENT:
        return basicSetStatement(null, msgs);
      case EsterelPackage.DO__END_UP:
        return basicSetEndUp(null, msgs);
      case EsterelPackage.DO__END_WATCH:
        return basicSetEndWatch(null, msgs);
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
      case EsterelPackage.DO__STATEMENT:
        return getStatement();
      case EsterelPackage.DO__END_UP:
        return getEndUp();
      case EsterelPackage.DO__END_WATCH:
        return getEndWatch();
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
      case EsterelPackage.DO__STATEMENT:
        setStatement((Statement)newValue);
        return;
      case EsterelPackage.DO__END_UP:
        setEndUp((DoUpto)newValue);
        return;
      case EsterelPackage.DO__END_WATCH:
        setEndWatch((DoWatching)newValue);
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
      case EsterelPackage.DO__STATEMENT:
        setStatement((Statement)null);
        return;
      case EsterelPackage.DO__END_UP:
        setEndUp((DoUpto)null);
        return;
      case EsterelPackage.DO__END_WATCH:
        setEndWatch((DoWatching)null);
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
      case EsterelPackage.DO__STATEMENT:
        return statement != null;
      case EsterelPackage.DO__END_UP:
        return endUp != null;
      case EsterelPackage.DO__END_WATCH:
        return endWatch != null;
    }
    return super.eIsSet(featureID);
  }

} //DoImpl
