/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl;

import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Instruction;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.InstructionImpl#getSecondInstructions <em>Second Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstructionImpl extends MinimalEObjectImpl.Container implements Instruction
{
  /**
   * The cached value of the '{@link #getSecondInstructions() <em>Second Instructions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondInstructions()
   * @generated
   * @ordered
   */
  protected Instruction secondInstructions;

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
    return SclPackage.Literals.INSTRUCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction getSecondInstructions()
  {
    return secondInstructions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSecondInstructions(Instruction newSecondInstructions, NotificationChain msgs)
  {
    Instruction oldSecondInstructions = secondInstructions;
    secondInstructions = newSecondInstructions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.INSTRUCTION__SECOND_INSTRUCTIONS, oldSecondInstructions, newSecondInstructions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecondInstructions(Instruction newSecondInstructions)
  {
    if (newSecondInstructions != secondInstructions)
    {
      NotificationChain msgs = null;
      if (secondInstructions != null)
        msgs = ((InternalEObject)secondInstructions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.INSTRUCTION__SECOND_INSTRUCTIONS, null, msgs);
      if (newSecondInstructions != null)
        msgs = ((InternalEObject)newSecondInstructions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.INSTRUCTION__SECOND_INSTRUCTIONS, null, msgs);
      msgs = basicSetSecondInstructions(newSecondInstructions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.INSTRUCTION__SECOND_INSTRUCTIONS, newSecondInstructions, newSecondInstructions));
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
      case SclPackage.INSTRUCTION__SECOND_INSTRUCTIONS:
        return basicSetSecondInstructions(null, msgs);
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
      case SclPackage.INSTRUCTION__SECOND_INSTRUCTIONS:
        return getSecondInstructions();
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
      case SclPackage.INSTRUCTION__SECOND_INSTRUCTIONS:
        setSecondInstructions((Instruction)newValue);
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
      case SclPackage.INSTRUCTION__SECOND_INSTRUCTIONS:
        setSecondInstructions((Instruction)null);
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
      case SclPackage.INSTRUCTION__SECOND_INSTRUCTIONS:
        return secondInstructions != null;
    }
    return super.eIsSet(featureID);
  }

} //InstructionImpl
