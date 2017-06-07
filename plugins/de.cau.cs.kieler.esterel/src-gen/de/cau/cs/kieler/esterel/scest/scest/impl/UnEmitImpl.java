/**
 */
package de.cau.cs.kieler.esterel.scest.scest.impl;

import de.cau.cs.kieler.esterel.esterel.ISignal;
import de.cau.cs.kieler.esterel.esterel.ValuedObject;

import de.cau.cs.kieler.esterel.scest.scest.ScestPackage;
import de.cau.cs.kieler.esterel.scest.scest.UnEmit;

import de.cau.cs.kieler.scl.scl.impl.StatementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Un Emit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.scest.scest.impl.UnEmitImpl#getSignal <em>Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.scest.scest.impl.UnEmitImpl#getTick <em>Tick</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnEmitImpl extends StatementImpl implements UnEmit
{
  /**
   * The cached value of the '{@link #getSignal() <em>Signal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignal()
   * @generated
   * @ordered
   */
  protected ISignal signal;

  /**
   * The cached value of the '{@link #getTick() <em>Tick</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTick()
   * @generated
   * @ordered
   */
  protected ValuedObject tick;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnEmitImpl()
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
    return ScestPackage.Literals.UN_EMIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ISignal getSignal()
  {
    if (signal != null && signal.eIsProxy())
    {
      InternalEObject oldSignal = (InternalEObject)signal;
      signal = (ISignal)eResolveProxy(oldSignal);
      if (signal != oldSignal)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScestPackage.UN_EMIT__SIGNAL, oldSignal, signal));
      }
    }
    return signal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ISignal basicGetSignal()
  {
    return signal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSignal(ISignal newSignal)
  {
    ISignal oldSignal = signal;
    signal = newSignal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScestPackage.UN_EMIT__SIGNAL, oldSignal, signal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValuedObject getTick()
  {
    return tick;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTick(ValuedObject newTick, NotificationChain msgs)
  {
    ValuedObject oldTick = tick;
    tick = newTick;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScestPackage.UN_EMIT__TICK, oldTick, newTick);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTick(ValuedObject newTick)
  {
    if (newTick != tick)
    {
      NotificationChain msgs = null;
      if (tick != null)
        msgs = ((InternalEObject)tick).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScestPackage.UN_EMIT__TICK, null, msgs);
      if (newTick != null)
        msgs = ((InternalEObject)newTick).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScestPackage.UN_EMIT__TICK, null, msgs);
      msgs = basicSetTick(newTick, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScestPackage.UN_EMIT__TICK, newTick, newTick));
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
      case ScestPackage.UN_EMIT__TICK:
        return basicSetTick(null, msgs);
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
      case ScestPackage.UN_EMIT__SIGNAL:
        if (resolve) return getSignal();
        return basicGetSignal();
      case ScestPackage.UN_EMIT__TICK:
        return getTick();
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
      case ScestPackage.UN_EMIT__SIGNAL:
        setSignal((ISignal)newValue);
        return;
      case ScestPackage.UN_EMIT__TICK:
        setTick((ValuedObject)newValue);
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
      case ScestPackage.UN_EMIT__SIGNAL:
        setSignal((ISignal)null);
        return;
      case ScestPackage.UN_EMIT__TICK:
        setTick((ValuedObject)null);
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
      case ScestPackage.UN_EMIT__SIGNAL:
        return signal != null;
      case ScestPackage.UN_EMIT__TICK:
        return tick != null;
    }
    return super.eIsSet(featureID);
  }

} //UnEmitImpl
