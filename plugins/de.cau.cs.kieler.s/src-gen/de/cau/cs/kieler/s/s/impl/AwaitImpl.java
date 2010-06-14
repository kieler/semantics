/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.s.s.impl;

import de.cau.cs.kieler.s.s.Await;
import de.cau.cs.kieler.s.s.SPackage;
import de.cau.cs.kieler.s.s.SignalReference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Await</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.s.s.impl.AwaitImpl#getSignal <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AwaitImpl extends InstructionImpl implements Await
{
  /**
   * The cached value of the '{@link #getSignal() <em>Signal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignal()
   * @generated
   * @ordered
   */
  protected SignalReference signal;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AwaitImpl()
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
    return SPackage.Literals.AWAIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignalReference getSignal()
  {
    return signal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSignal(SignalReference newSignal, NotificationChain msgs)
  {
    SignalReference oldSignal = signal;
    signal = newSignal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPackage.AWAIT__SIGNAL, oldSignal, newSignal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSignal(SignalReference newSignal)
  {
    if (newSignal != signal)
    {
      NotificationChain msgs = null;
      if (signal != null)
        msgs = ((InternalEObject)signal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPackage.AWAIT__SIGNAL, null, msgs);
      if (newSignal != null)
        msgs = ((InternalEObject)newSignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPackage.AWAIT__SIGNAL, null, msgs);
      msgs = basicSetSignal(newSignal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPackage.AWAIT__SIGNAL, newSignal, newSignal));
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
      case SPackage.AWAIT__SIGNAL:
        return basicSetSignal(null, msgs);
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
      case SPackage.AWAIT__SIGNAL:
        return getSignal();
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
      case SPackage.AWAIT__SIGNAL:
        setSignal((SignalReference)newValue);
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
      case SPackage.AWAIT__SIGNAL:
        setSignal((SignalReference)null);
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
      case SPackage.AWAIT__SIGNAL:
        return signal != null;
    }
    return super.eIsSet(featureID);
  }

} //AwaitImpl
