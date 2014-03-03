/**
 */
package de.cau.cs.kieler.s.s.impl;

import de.cau.cs.kieler.s.s.Abort;
import de.cau.cs.kieler.s.s.SPackage;
import de.cau.cs.kieler.s.s.State;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.s.s.impl.AbortImpl#getContinuation <em>Continuation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbortImpl extends InstructionImpl implements Abort
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbortImpl()
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
    return SPackage.Literals.ABORT;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SPackage.ABORT__CONTINUATION, oldContinuation, continuation));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SPackage.ABORT__CONTINUATION, oldContinuation, continuation));
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
      case SPackage.ABORT__CONTINUATION:
        if (resolve) return getContinuation();
        return basicGetContinuation();
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
      case SPackage.ABORT__CONTINUATION:
        setContinuation((State)newValue);
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
      case SPackage.ABORT__CONTINUATION:
        setContinuation((State)null);
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
      case SPackage.ABORT__CONTINUATION:
        return continuation != null;
    }
    return super.eIsSet(featureID);
  }

} //AbortImpl
