/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.impl;

import de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.Instruction;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.SPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.impl.InstructionImpl#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.impl.InstructionImpl#getSecondinstructions <em>Secondinstructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstructionImpl extends MinimalEObjectImpl.Container implements Instruction
{
  /**
   * The cached value of the '{@link #getInstruction() <em>Instruction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstruction()
   * @generated
   * @ordered
   */
  protected EObject instruction;

  /**
   * The cached value of the '{@link #getSecondinstructions() <em>Secondinstructions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondinstructions()
   * @generated
   * @ordered
   */
  protected Instruction secondinstructions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstructionImpl()
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
    return SPackage.Literals.INSTRUCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getInstruction()
  {
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInstruction(EObject newInstruction, NotificationChain msgs)
  {
    EObject oldInstruction = instruction;
    instruction = newInstruction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPackage.INSTRUCTION__INSTRUCTION, oldInstruction, newInstruction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstruction(EObject newInstruction)
  {
    if (newInstruction != instruction)
    {
      NotificationChain msgs = null;
      if (instruction != null)
        msgs = ((InternalEObject)instruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPackage.INSTRUCTION__INSTRUCTION, null, msgs);
      if (newInstruction != null)
        msgs = ((InternalEObject)newInstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPackage.INSTRUCTION__INSTRUCTION, null, msgs);
      msgs = basicSetInstruction(newInstruction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPackage.INSTRUCTION__INSTRUCTION, newInstruction, newInstruction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction getSecondinstructions()
  {
    return secondinstructions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSecondinstructions(Instruction newSecondinstructions, NotificationChain msgs)
  {
    Instruction oldSecondinstructions = secondinstructions;
    secondinstructions = newSecondinstructions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPackage.INSTRUCTION__SECONDINSTRUCTIONS, oldSecondinstructions, newSecondinstructions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecondinstructions(Instruction newSecondinstructions)
  {
    if (newSecondinstructions != secondinstructions)
    {
      NotificationChain msgs = null;
      if (secondinstructions != null)
        msgs = ((InternalEObject)secondinstructions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPackage.INSTRUCTION__SECONDINSTRUCTIONS, null, msgs);
      if (newSecondinstructions != null)
        msgs = ((InternalEObject)newSecondinstructions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPackage.INSTRUCTION__SECONDINSTRUCTIONS, null, msgs);
      msgs = basicSetSecondinstructions(newSecondinstructions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPackage.INSTRUCTION__SECONDINSTRUCTIONS, newSecondinstructions, newSecondinstructions));
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
      case SPackage.INSTRUCTION__INSTRUCTION:
        return basicSetInstruction(null, msgs);
      case SPackage.INSTRUCTION__SECONDINSTRUCTIONS:
        return basicSetSecondinstructions(null, msgs);
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
      case SPackage.INSTRUCTION__INSTRUCTION:
        return getInstruction();
      case SPackage.INSTRUCTION__SECONDINSTRUCTIONS:
        return getSecondinstructions();
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
      case SPackage.INSTRUCTION__INSTRUCTION:
        setInstruction((EObject)newValue);
        return;
      case SPackage.INSTRUCTION__SECONDINSTRUCTIONS:
        setSecondinstructions((Instruction)newValue);
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
      case SPackage.INSTRUCTION__INSTRUCTION:
        setInstruction((EObject)null);
        return;
      case SPackage.INSTRUCTION__SECONDINSTRUCTIONS:
        setSecondinstructions((Instruction)null);
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
      case SPackage.INSTRUCTION__INSTRUCTION:
        return instruction != null;
      case SPackage.INSTRUCTION__SECONDINSTRUCTIONS:
        return secondinstructions != null;
    }
    return super.eIsSet(featureID);
  }

} //InstructionImpl
