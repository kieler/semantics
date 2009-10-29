/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.DataExpr;
import de.cau.cs.kieler.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.Signal;
import de.cau.cs.kieler.esterel.Sustain;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sustain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.SustainImpl#getSignal <em>Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.SustainImpl#getTick <em>Tick</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.SustainImpl#getDataExpr <em>Data Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SustainImpl extends StatementImpl implements Sustain
{
  /**
   * The cached value of the '{@link #getSignal() <em>Signal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignal()
   * @generated
   * @ordered
   */
  protected Signal signal;

  /**
   * The default value of the '{@link #getTick() <em>Tick</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTick()
   * @generated
   * @ordered
   */
  protected static final String TICK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTick() <em>Tick</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTick()
   * @generated
   * @ordered
   */
  protected String tick = TICK_EDEFAULT;

  /**
   * The cached value of the '{@link #getDataExpr() <em>Data Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataExpr()
   * @generated
   * @ordered
   */
  protected DataExpr dataExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SustainImpl()
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
    return EsterelPackage.Literals.SUSTAIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signal getSignal()
  {
    if (signal != null && signal.eIsProxy())
    {
      InternalEObject oldSignal = (InternalEObject)signal;
      signal = (Signal)eResolveProxy(oldSignal);
      if (signal != oldSignal)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.SUSTAIN__SIGNAL, oldSignal, signal));
      }
    }
    return signal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signal basicGetSignal()
  {
    return signal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSignal(Signal newSignal)
  {
    Signal oldSignal = signal;
    signal = newSignal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.SUSTAIN__SIGNAL, oldSignal, signal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTick()
  {
    return tick;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTick(String newTick)
  {
    String oldTick = tick;
    tick = newTick;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.SUSTAIN__TICK, oldTick, tick));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataExpr getDataExpr()
  {
    return dataExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataExpr(DataExpr newDataExpr, NotificationChain msgs)
  {
    DataExpr oldDataExpr = dataExpr;
    dataExpr = newDataExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.SUSTAIN__DATA_EXPR, oldDataExpr, newDataExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataExpr(DataExpr newDataExpr)
  {
    if (newDataExpr != dataExpr)
    {
      NotificationChain msgs = null;
      if (dataExpr != null)
        msgs = ((InternalEObject)dataExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.SUSTAIN__DATA_EXPR, null, msgs);
      if (newDataExpr != null)
        msgs = ((InternalEObject)newDataExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.SUSTAIN__DATA_EXPR, null, msgs);
      msgs = basicSetDataExpr(newDataExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.SUSTAIN__DATA_EXPR, newDataExpr, newDataExpr));
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
      case EsterelPackage.SUSTAIN__DATA_EXPR:
        return basicSetDataExpr(null, msgs);
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
      case EsterelPackage.SUSTAIN__SIGNAL:
        if (resolve) return getSignal();
        return basicGetSignal();
      case EsterelPackage.SUSTAIN__TICK:
        return getTick();
      case EsterelPackage.SUSTAIN__DATA_EXPR:
        return getDataExpr();
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
      case EsterelPackage.SUSTAIN__SIGNAL:
        setSignal((Signal)newValue);
        return;
      case EsterelPackage.SUSTAIN__TICK:
        setTick((String)newValue);
        return;
      case EsterelPackage.SUSTAIN__DATA_EXPR:
        setDataExpr((DataExpr)newValue);
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
      case EsterelPackage.SUSTAIN__SIGNAL:
        setSignal((Signal)null);
        return;
      case EsterelPackage.SUSTAIN__TICK:
        setTick(TICK_EDEFAULT);
        return;
      case EsterelPackage.SUSTAIN__DATA_EXPR:
        setDataExpr((DataExpr)null);
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
      case EsterelPackage.SUSTAIN__SIGNAL:
        return signal != null;
      case EsterelPackage.SUSTAIN__TICK:
        return TICK_EDEFAULT == null ? tick != null : !TICK_EDEFAULT.equals(tick);
      case EsterelPackage.SUSTAIN__DATA_EXPR:
        return dataExpr != null;
    }
    return super.eIsSet(featureID);
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
    result.append(" (tick: ");
    result.append(tick);
    result.append(')');
    return result.toString();
  }

} //SustainImpl
