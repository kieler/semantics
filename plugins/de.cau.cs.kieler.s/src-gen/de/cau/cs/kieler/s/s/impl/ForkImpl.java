/**
 */
package de.cau.cs.kieler.s.s.impl;

import de.cau.cs.kieler.s.s.Fork;
import de.cau.cs.kieler.s.s.SPackage;
import de.cau.cs.kieler.s.s.State;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fork</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.s.s.impl.ForkImpl#getContinuation <em>Continuation</em>}</li>
 *   <li>{@link de.cau.cs.kieler.s.s.impl.ForkImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForkImpl extends InstructionImpl implements Fork
{
  /**
   * The cached value of the '{@link #getContinuation() <em>Continuation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContinuation()
   * @generated
   * @ordered
   */
  protected State continuation;

  /**
   * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected static final int PRIORITY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected int priority = PRIORITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForkImpl()
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
    return SPackage.Literals.FORK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getContinuation()
  {
    if (continuation != null && continuation.eIsProxy())
    {
      InternalEObject oldContinuation = (InternalEObject)continuation;
      continuation = (State)eResolveProxy(oldContinuation);
      if (continuation != oldContinuation)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SPackage.FORK__CONTINUATION, oldContinuation, continuation));
      }
    }
    return continuation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetContinuation()
  {
    return continuation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContinuation(State newContinuation)
  {
    State oldContinuation = continuation;
    continuation = newContinuation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPackage.FORK__CONTINUATION, oldContinuation, continuation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPriority()
  {
    return priority;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPriority(int newPriority)
  {
    int oldPriority = priority;
    priority = newPriority;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPackage.FORK__PRIORITY, oldPriority, priority));
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
      case SPackage.FORK__CONTINUATION:
        if (resolve) return getContinuation();
        return basicGetContinuation();
      case SPackage.FORK__PRIORITY:
        return getPriority();
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
      case SPackage.FORK__CONTINUATION:
        setContinuation((State)newValue);
        return;
      case SPackage.FORK__PRIORITY:
        setPriority((Integer)newValue);
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
      case SPackage.FORK__CONTINUATION:
        setContinuation((State)null);
        return;
      case SPackage.FORK__PRIORITY:
        setPriority(PRIORITY_EDEFAULT);
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
      case SPackage.FORK__CONTINUATION:
        return continuation != null;
      case SPackage.FORK__PRIORITY:
        return priority != PRIORITY_EDEFAULT;
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
    result.append(" (priority: ");
    result.append(priority);
    result.append(')');
    return result.toString();
  }

} //ForkImpl
