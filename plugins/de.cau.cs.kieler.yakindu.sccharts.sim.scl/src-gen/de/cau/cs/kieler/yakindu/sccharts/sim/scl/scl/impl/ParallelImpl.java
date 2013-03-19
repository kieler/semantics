/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl;

import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Instruction;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Parallel;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parallel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.ParallelImpl#getFirstThread <em>First Thread</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.ParallelImpl#getSecondThread <em>Second Thread</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParallelImpl extends InstructionImpl implements Parallel
{
  /**
   * The cached value of the '{@link #getFirstThread() <em>First Thread</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstThread()
   * @generated
   * @ordered
   */
  protected Instruction firstThread;

  /**
   * The cached value of the '{@link #getSecondThread() <em>Second Thread</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondThread()
   * @generated
   * @ordered
   */
  protected Instruction secondThread;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParallelImpl()
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
    return SclPackage.Literals.PARALLEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction getFirstThread()
  {
    return firstThread;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFirstThread(Instruction newFirstThread, NotificationChain msgs)
  {
    Instruction oldFirstThread = firstThread;
    firstThread = newFirstThread;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.PARALLEL__FIRST_THREAD, oldFirstThread, newFirstThread);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstThread(Instruction newFirstThread)
  {
    if (newFirstThread != firstThread)
    {
      NotificationChain msgs = null;
      if (firstThread != null)
        msgs = ((InternalEObject)firstThread).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.PARALLEL__FIRST_THREAD, null, msgs);
      if (newFirstThread != null)
        msgs = ((InternalEObject)newFirstThread).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.PARALLEL__FIRST_THREAD, null, msgs);
      msgs = basicSetFirstThread(newFirstThread, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.PARALLEL__FIRST_THREAD, newFirstThread, newFirstThread));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction getSecondThread()
  {
    return secondThread;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSecondThread(Instruction newSecondThread, NotificationChain msgs)
  {
    Instruction oldSecondThread = secondThread;
    secondThread = newSecondThread;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.PARALLEL__SECOND_THREAD, oldSecondThread, newSecondThread);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecondThread(Instruction newSecondThread)
  {
    if (newSecondThread != secondThread)
    {
      NotificationChain msgs = null;
      if (secondThread != null)
        msgs = ((InternalEObject)secondThread).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.PARALLEL__SECOND_THREAD, null, msgs);
      if (newSecondThread != null)
        msgs = ((InternalEObject)newSecondThread).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.PARALLEL__SECOND_THREAD, null, msgs);
      msgs = basicSetSecondThread(newSecondThread, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.PARALLEL__SECOND_THREAD, newSecondThread, newSecondThread));
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
      case SclPackage.PARALLEL__FIRST_THREAD:
        return basicSetFirstThread(null, msgs);
      case SclPackage.PARALLEL__SECOND_THREAD:
        return basicSetSecondThread(null, msgs);
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
      case SclPackage.PARALLEL__FIRST_THREAD:
        return getFirstThread();
      case SclPackage.PARALLEL__SECOND_THREAD:
        return getSecondThread();
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
      case SclPackage.PARALLEL__FIRST_THREAD:
        setFirstThread((Instruction)newValue);
        return;
      case SclPackage.PARALLEL__SECOND_THREAD:
        setSecondThread((Instruction)newValue);
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
      case SclPackage.PARALLEL__FIRST_THREAD:
        setFirstThread((Instruction)null);
        return;
      case SclPackage.PARALLEL__SECOND_THREAD:
        setSecondThread((Instruction)null);
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
      case SclPackage.PARALLEL__FIRST_THREAD:
        return firstThread != null;
      case SclPackage.PARALLEL__SECOND_THREAD:
        return secondThread != null;
    }
    return super.eIsSet(featureID);
  }

} //ParallelImpl
