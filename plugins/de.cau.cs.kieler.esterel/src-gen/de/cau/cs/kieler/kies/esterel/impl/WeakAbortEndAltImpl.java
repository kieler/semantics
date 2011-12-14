/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.kies.esterel.impl;

import de.cau.cs.kieler.kies.esterel.EsterelPackage;
import de.cau.cs.kieler.kies.esterel.WeakAbortEndAlt;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weak Abort End Alt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.impl.WeakAbortEndAltImpl#getEnd <em>End</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.impl.WeakAbortEndAltImpl#getEndA <em>End A</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WeakAbortEndAltImpl extends MinimalEObjectImpl.Container implements WeakAbortEndAlt
{
  /**
   * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected static final String END_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected String end = END_EDEFAULT;

  /**
   * The default value of the '{@link #getEndA() <em>End A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndA()
   * @generated
   * @ordered
   */
  protected static final String END_A_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEndA() <em>End A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndA()
   * @generated
   * @ordered
   */
  protected String endA = END_A_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WeakAbortEndAltImpl()
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
    return EsterelPackage.Literals.WEAK_ABORT_END_ALT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEnd()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnd(String newEnd)
  {
    String oldEnd = end;
    end = newEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.WEAK_ABORT_END_ALT__END, oldEnd, end));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEndA()
  {
    return endA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndA(String newEndA)
  {
    String oldEndA = endA;
    endA = newEndA;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.WEAK_ABORT_END_ALT__END_A, oldEndA, endA));
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
      case EsterelPackage.WEAK_ABORT_END_ALT__END:
        return getEnd();
      case EsterelPackage.WEAK_ABORT_END_ALT__END_A:
        return getEndA();
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
      case EsterelPackage.WEAK_ABORT_END_ALT__END:
        setEnd((String)newValue);
        return;
      case EsterelPackage.WEAK_ABORT_END_ALT__END_A:
        setEndA((String)newValue);
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
      case EsterelPackage.WEAK_ABORT_END_ALT__END:
        setEnd(END_EDEFAULT);
        return;
      case EsterelPackage.WEAK_ABORT_END_ALT__END_A:
        setEndA(END_A_EDEFAULT);
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
      case EsterelPackage.WEAK_ABORT_END_ALT__END:
        return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
      case EsterelPackage.WEAK_ABORT_END_ALT__END_A:
        return END_A_EDEFAULT == null ? endA != null : !END_A_EDEFAULT.equals(endA);
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
    result.append(" (end: ");
    result.append(end);
    result.append(", endA: ");
    result.append(endA);
    result.append(')');
    return result.toString();
  }

} //WeakAbortEndAltImpl
