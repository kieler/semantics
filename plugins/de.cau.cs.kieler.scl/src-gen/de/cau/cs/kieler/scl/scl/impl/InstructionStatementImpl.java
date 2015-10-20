/**
 */
package de.cau.cs.kieler.scl.scl.impl;

import de.cau.cs.kieler.scl.scl.Instruction;
import de.cau.cs.kieler.scl.scl.InstructionStatement;
import de.cau.cs.kieler.scl.scl.SclPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.scl.impl.InstructionStatementImpl#getInstruction <em>Instruction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstructionStatementImpl extends StatementImpl implements InstructionStatement
{
  /**
     * The cached value of the '{@link #getInstruction() <em>Instruction</em>}' containment reference.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @see #getInstruction()
     * @generated
     * @ordered
     */
  protected Instruction instruction;

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  protected InstructionStatementImpl()
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
        return SclPackage.Literals.INSTRUCTION_STATEMENT;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public Instruction getInstruction()
  {
        return instruction;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public NotificationChain basicSetInstruction(Instruction newInstruction, NotificationChain msgs)
  {
        Instruction oldInstruction = instruction;
        instruction = newInstruction;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.INSTRUCTION_STATEMENT__INSTRUCTION, oldInstruction, newInstruction);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  public void setInstruction(Instruction newInstruction)
  {
        if (newInstruction != instruction) {
            NotificationChain msgs = null;
            if (instruction != null)
                msgs = ((InternalEObject)instruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.INSTRUCTION_STATEMENT__INSTRUCTION, null, msgs);
            if (newInstruction != null)
                msgs = ((InternalEObject)newInstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.INSTRUCTION_STATEMENT__INSTRUCTION, null, msgs);
            msgs = basicSetInstruction(newInstruction, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.INSTRUCTION_STATEMENT__INSTRUCTION, newInstruction, newInstruction));
    }

  /**
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @generated
     */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
        switch (featureID) {
            case SclPackage.INSTRUCTION_STATEMENT__INSTRUCTION:
                return basicSetInstruction(null, msgs);
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
        switch (featureID) {
            case SclPackage.INSTRUCTION_STATEMENT__INSTRUCTION:
                return getInstruction();
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
        switch (featureID) {
            case SclPackage.INSTRUCTION_STATEMENT__INSTRUCTION:
                setInstruction((Instruction)newValue);
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
        switch (featureID) {
            case SclPackage.INSTRUCTION_STATEMENT__INSTRUCTION:
                setInstruction((Instruction)null);
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
        switch (featureID) {
            case SclPackage.INSTRUCTION_STATEMENT__INSTRUCTION:
                return instruction != null;
        }
        return super.eIsSet(featureID);
    }

} //InstructionStatementImpl
