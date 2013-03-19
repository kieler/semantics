/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.impl;

import de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.Instruction;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.Parallel;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.SPackage;

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
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.impl.ParallelImpl#getFirstinstruction <em>Firstinstruction</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.impl.ParallelImpl#getSecondinstruction <em>Secondinstruction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParallelImpl extends InstructionImpl implements Parallel
{
  /**
   * The cached value of the '{@link #getFirstinstruction() <em>Firstinstruction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstinstruction()
   * @generated
   * @ordered
   */
  protected Instruction firstinstruction;

  /**
   * The cached value of the '{@link #getSecondinstruction() <em>Secondinstruction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondinstruction()
   * @generated
   * @ordered
   */
  protected Instruction secondinstruction;

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
    return SPackage.Literals.PARALLEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction getFirstinstruction()
  {
    return firstinstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFirstinstruction(Instruction newFirstinstruction, NotificationChain msgs)
  {
    Instruction oldFirstinstruction = firstinstruction;
    firstinstruction = newFirstinstruction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPackage.PARALLEL__FIRSTINSTRUCTION, oldFirstinstruction, newFirstinstruction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstinstruction(Instruction newFirstinstruction)
  {
    if (newFirstinstruction != firstinstruction)
    {
      NotificationChain msgs = null;
      if (firstinstruction != null)
        msgs = ((InternalEObject)firstinstruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPackage.PARALLEL__FIRSTINSTRUCTION, null, msgs);
      if (newFirstinstruction != null)
        msgs = ((InternalEObject)newFirstinstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPackage.PARALLEL__FIRSTINSTRUCTION, null, msgs);
      msgs = basicSetFirstinstruction(newFirstinstruction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPackage.PARALLEL__FIRSTINSTRUCTION, newFirstinstruction, newFirstinstruction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction getSecondinstruction()
  {
    return secondinstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSecondinstruction(Instruction newSecondinstruction, NotificationChain msgs)
  {
    Instruction oldSecondinstruction = secondinstruction;
    secondinstruction = newSecondinstruction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPackage.PARALLEL__SECONDINSTRUCTION, oldSecondinstruction, newSecondinstruction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecondinstruction(Instruction newSecondinstruction)
  {
    if (newSecondinstruction != secondinstruction)
    {
      NotificationChain msgs = null;
      if (secondinstruction != null)
        msgs = ((InternalEObject)secondinstruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPackage.PARALLEL__SECONDINSTRUCTION, null, msgs);
      if (newSecondinstruction != null)
        msgs = ((InternalEObject)newSecondinstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPackage.PARALLEL__SECONDINSTRUCTION, null, msgs);
      msgs = basicSetSecondinstruction(newSecondinstruction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPackage.PARALLEL__SECONDINSTRUCTION, newSecondinstruction, newSecondinstruction));
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
      case SPackage.PARALLEL__FIRSTINSTRUCTION:
        return basicSetFirstinstruction(null, msgs);
      case SPackage.PARALLEL__SECONDINSTRUCTION:
        return basicSetSecondinstruction(null, msgs);
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
      case SPackage.PARALLEL__FIRSTINSTRUCTION:
        return getFirstinstruction();
      case SPackage.PARALLEL__SECONDINSTRUCTION:
        return getSecondinstruction();
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
      case SPackage.PARALLEL__FIRSTINSTRUCTION:
        setFirstinstruction((Instruction)newValue);
        return;
      case SPackage.PARALLEL__SECONDINSTRUCTION:
        setSecondinstruction((Instruction)newValue);
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
      case SPackage.PARALLEL__FIRSTINSTRUCTION:
        setFirstinstruction((Instruction)null);
        return;
      case SPackage.PARALLEL__SECONDINSTRUCTION:
        setSecondinstruction((Instruction)null);
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
      case SPackage.PARALLEL__FIRSTINSTRUCTION:
        return firstinstruction != null;
      case SPackage.PARALLEL__SECONDINSTRUCTION:
        return secondinstruction != null;
    }
    return super.eIsSet(featureID);
  }

} //ParallelImpl
