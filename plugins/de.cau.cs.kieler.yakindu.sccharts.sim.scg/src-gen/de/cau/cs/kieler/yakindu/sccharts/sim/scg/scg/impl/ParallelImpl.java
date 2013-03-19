/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl;

import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Parallel;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.ScgPackage;

import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Instruction;
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
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ParallelImpl#getFirstThread <em>First Thread</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ParallelImpl#getSecondThread <em>Second Thread</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ParallelImpl#getFirstInstruction <em>First Instruction</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.ParallelImpl#getSecondInstruction <em>Second Instruction</em>}</li>
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
   * The cached value of the '{@link #getFirstInstruction() <em>First Instruction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstInstruction()
   * @generated
   * @ordered
   */
  protected de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Instruction firstInstruction;

  /**
   * The cached value of the '{@link #getSecondInstruction() <em>Second Instruction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondInstruction()
   * @generated
   * @ordered
   */
  protected de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Instruction secondInstruction;

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
    return ScgPackage.Literals.PARALLEL;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgPackage.PARALLEL__FIRST_THREAD, oldFirstThread, newFirstThread);
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
        msgs = ((InternalEObject)firstThread).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgPackage.PARALLEL__FIRST_THREAD, null, msgs);
      if (newFirstThread != null)
        msgs = ((InternalEObject)newFirstThread).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgPackage.PARALLEL__FIRST_THREAD, null, msgs);
      msgs = basicSetFirstThread(newFirstThread, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.PARALLEL__FIRST_THREAD, newFirstThread, newFirstThread));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgPackage.PARALLEL__SECOND_THREAD, oldSecondThread, newSecondThread);
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
        msgs = ((InternalEObject)secondThread).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgPackage.PARALLEL__SECOND_THREAD, null, msgs);
      if (newSecondThread != null)
        msgs = ((InternalEObject)newSecondThread).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgPackage.PARALLEL__SECOND_THREAD, null, msgs);
      msgs = basicSetSecondThread(newSecondThread, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.PARALLEL__SECOND_THREAD, newSecondThread, newSecondThread));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Instruction getFirstInstruction()
  {
    return firstInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFirstInstruction(de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Instruction newFirstInstruction, NotificationChain msgs)
  {
    de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Instruction oldFirstInstruction = firstInstruction;
    firstInstruction = newFirstInstruction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgPackage.PARALLEL__FIRST_INSTRUCTION, oldFirstInstruction, newFirstInstruction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstInstruction(de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Instruction newFirstInstruction)
  {
    if (newFirstInstruction != firstInstruction)
    {
      NotificationChain msgs = null;
      if (firstInstruction != null)
        msgs = ((InternalEObject)firstInstruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgPackage.PARALLEL__FIRST_INSTRUCTION, null, msgs);
      if (newFirstInstruction != null)
        msgs = ((InternalEObject)newFirstInstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgPackage.PARALLEL__FIRST_INSTRUCTION, null, msgs);
      msgs = basicSetFirstInstruction(newFirstInstruction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.PARALLEL__FIRST_INSTRUCTION, newFirstInstruction, newFirstInstruction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Instruction getSecondInstruction()
  {
    return secondInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSecondInstruction(de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Instruction newSecondInstruction, NotificationChain msgs)
  {
    de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Instruction oldSecondInstruction = secondInstruction;
    secondInstruction = newSecondInstruction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgPackage.PARALLEL__SECOND_INSTRUCTION, oldSecondInstruction, newSecondInstruction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecondInstruction(de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Instruction newSecondInstruction)
  {
    if (newSecondInstruction != secondInstruction)
    {
      NotificationChain msgs = null;
      if (secondInstruction != null)
        msgs = ((InternalEObject)secondInstruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgPackage.PARALLEL__SECOND_INSTRUCTION, null, msgs);
      if (newSecondInstruction != null)
        msgs = ((InternalEObject)newSecondInstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgPackage.PARALLEL__SECOND_INSTRUCTION, null, msgs);
      msgs = basicSetSecondInstruction(newSecondInstruction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.PARALLEL__SECOND_INSTRUCTION, newSecondInstruction, newSecondInstruction));
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
      case ScgPackage.PARALLEL__FIRST_THREAD:
        return basicSetFirstThread(null, msgs);
      case ScgPackage.PARALLEL__SECOND_THREAD:
        return basicSetSecondThread(null, msgs);
      case ScgPackage.PARALLEL__FIRST_INSTRUCTION:
        return basicSetFirstInstruction(null, msgs);
      case ScgPackage.PARALLEL__SECOND_INSTRUCTION:
        return basicSetSecondInstruction(null, msgs);
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
      case ScgPackage.PARALLEL__FIRST_THREAD:
        return getFirstThread();
      case ScgPackage.PARALLEL__SECOND_THREAD:
        return getSecondThread();
      case ScgPackage.PARALLEL__FIRST_INSTRUCTION:
        return getFirstInstruction();
      case ScgPackage.PARALLEL__SECOND_INSTRUCTION:
        return getSecondInstruction();
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
      case ScgPackage.PARALLEL__FIRST_THREAD:
        setFirstThread((Instruction)newValue);
        return;
      case ScgPackage.PARALLEL__SECOND_THREAD:
        setSecondThread((Instruction)newValue);
        return;
      case ScgPackage.PARALLEL__FIRST_INSTRUCTION:
        setFirstInstruction((de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Instruction)newValue);
        return;
      case ScgPackage.PARALLEL__SECOND_INSTRUCTION:
        setSecondInstruction((de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Instruction)newValue);
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
      case ScgPackage.PARALLEL__FIRST_THREAD:
        setFirstThread((Instruction)null);
        return;
      case ScgPackage.PARALLEL__SECOND_THREAD:
        setSecondThread((Instruction)null);
        return;
      case ScgPackage.PARALLEL__FIRST_INSTRUCTION:
        setFirstInstruction((de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Instruction)null);
        return;
      case ScgPackage.PARALLEL__SECOND_INSTRUCTION:
        setSecondInstruction((de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Instruction)null);
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
      case ScgPackage.PARALLEL__FIRST_THREAD:
        return firstThread != null;
      case ScgPackage.PARALLEL__SECOND_THREAD:
        return secondThread != null;
      case ScgPackage.PARALLEL__FIRST_INSTRUCTION:
        return firstInstruction != null;
      case ScgPackage.PARALLEL__SECOND_INSTRUCTION:
        return secondInstruction != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Parallel.class)
    {
      switch (derivedFeatureID)
      {
        case ScgPackage.PARALLEL__FIRST_THREAD: return SclPackage.PARALLEL__FIRST_THREAD;
        case ScgPackage.PARALLEL__SECOND_THREAD: return SclPackage.PARALLEL__SECOND_THREAD;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Parallel.class)
    {
      switch (baseFeatureID)
      {
        case SclPackage.PARALLEL__FIRST_THREAD: return ScgPackage.PARALLEL__FIRST_THREAD;
        case SclPackage.PARALLEL__SECOND_THREAD: return ScgPackage.PARALLEL__SECOND_THREAD;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //ParallelImpl
