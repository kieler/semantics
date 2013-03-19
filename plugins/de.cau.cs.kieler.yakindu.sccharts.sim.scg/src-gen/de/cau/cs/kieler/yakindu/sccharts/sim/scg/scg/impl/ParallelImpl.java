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
   * The cached value of the '{@link #getFirstInstruction() <em>First Instruction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstInstruction()
   * @generated
   * @ordered
   */
  protected Instruction firstInstruction;

  /**
   * The cached value of the '{@link #getSecondInstruction() <em>Second Instruction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondInstruction()
   * @generated
   * @ordered
   */
  protected Instruction secondInstruction;

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
  public Instruction getFirstInstruction()
  {
    return firstInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFirstInstruction(Instruction newFirstInstruction, NotificationChain msgs)
  {
    Instruction oldFirstInstruction = firstInstruction;
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
  public void setFirstInstruction(Instruction newFirstInstruction)
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
  public Instruction getSecondInstruction()
  {
    return secondInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSecondInstruction(Instruction newSecondInstruction, NotificationChain msgs)
  {
    Instruction oldSecondInstruction = secondInstruction;
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
  public void setSecondInstruction(Instruction newSecondInstruction)
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
      case ScgPackage.PARALLEL__FIRST_INSTRUCTION:
        setFirstInstruction((Instruction)newValue);
        return;
      case ScgPackage.PARALLEL__SECOND_INSTRUCTION:
        setSecondInstruction((Instruction)newValue);
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
      case ScgPackage.PARALLEL__FIRST_INSTRUCTION:
        setFirstInstruction((Instruction)null);
        return;
      case ScgPackage.PARALLEL__SECOND_INSTRUCTION:
        setSecondInstruction((Instruction)null);
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
        case ScgPackage.PARALLEL__FIRST_INSTRUCTION: return SclPackage.PARALLEL__FIRST_INSTRUCTION;
        case ScgPackage.PARALLEL__SECOND_INSTRUCTION: return SclPackage.PARALLEL__SECOND_INSTRUCTION;
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
        case SclPackage.PARALLEL__FIRST_INSTRUCTION: return ScgPackage.PARALLEL__FIRST_INSTRUCTION;
        case SclPackage.PARALLEL__SECOND_INSTRUCTION: return ScgPackage.PARALLEL__SECOND_INSTRUCTION;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //ParallelImpl
