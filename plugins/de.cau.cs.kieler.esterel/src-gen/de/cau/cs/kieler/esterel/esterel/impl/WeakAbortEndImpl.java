/**
 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.WeakAbortEnd;
import de.cau.cs.kieler.esterel.esterel.WeakAbortEndAlt;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weak Abort End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.WeakAbortEndImpl#getOptEnd <em>Opt End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WeakAbortEndImpl extends MinimalEObjectImpl.Container implements WeakAbortEnd
{
  /**
   * The cached value of the '{@link #getOptEnd() <em>Opt End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptEnd()
   * @generated
   * @ordered
   */
  protected WeakAbortEndAlt optEnd;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WeakAbortEndImpl()
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
    return EsterelPackage.Literals.WEAK_ABORT_END;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeakAbortEndAlt getOptEnd()
  {
    return optEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOptEnd(WeakAbortEndAlt newOptEnd, NotificationChain msgs)
  {
    WeakAbortEndAlt oldOptEnd = optEnd;
    optEnd = newOptEnd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.WEAK_ABORT_END__OPT_END, oldOptEnd, newOptEnd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptEnd(WeakAbortEndAlt newOptEnd)
  {
    if (newOptEnd != optEnd)
    {
      NotificationChain msgs = null;
      if (optEnd != null)
        msgs = ((InternalEObject)optEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.WEAK_ABORT_END__OPT_END, null, msgs);
      if (newOptEnd != null)
        msgs = ((InternalEObject)newOptEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.WEAK_ABORT_END__OPT_END, null, msgs);
      msgs = basicSetOptEnd(newOptEnd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.WEAK_ABORT_END__OPT_END, newOptEnd, newOptEnd));
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
      case EsterelPackage.WEAK_ABORT_END__OPT_END:
        return basicSetOptEnd(null, msgs);
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
      case EsterelPackage.WEAK_ABORT_END__OPT_END:
        return getOptEnd();
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
      case EsterelPackage.WEAK_ABORT_END__OPT_END:
        setOptEnd((WeakAbortEndAlt)newValue);
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
      case EsterelPackage.WEAK_ABORT_END__OPT_END:
        setOptEnd((WeakAbortEndAlt)null);
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
      case EsterelPackage.WEAK_ABORT_END__OPT_END:
        return optEnd != null;
    }
    return super.eIsSet(featureID);
  }

} //WeakAbortEndImpl
