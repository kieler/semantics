/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl;

import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Instruction;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SCLExpression;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.yakindu.sct.model.stext.stext.impl.ExpressionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SCL Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SCLExpressionImpl#getSecondInstructions <em>Second Instructions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.SCLExpressionImpl#getAssignment <em>Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SCLExpressionImpl extends ExpressionImpl implements SCLExpression
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
   * The default value of the '{@link #getAssignment() <em>Assignment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignment()
   * @generated
   * @ordered
   */
  protected static final String ASSIGNMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignment()
   * @generated
   * @ordered
   */
  protected String assignment = ASSIGNMENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SCLExpressionImpl()
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
    return SclPackage.Literals.SCL_EXPRESSION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SCL_EXPRESSION__SECOND_INSTRUCTIONS, oldSecondInstructions, newSecondInstructions);
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
        msgs = ((InternalEObject)secondInstructions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SCL_EXPRESSION__SECOND_INSTRUCTIONS, null, msgs);
      if (newSecondInstructions != null)
        msgs = ((InternalEObject)newSecondInstructions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.SCL_EXPRESSION__SECOND_INSTRUCTIONS, null, msgs);
      msgs = basicSetSecondInstructions(newSecondInstructions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SCL_EXPRESSION__SECOND_INSTRUCTIONS, newSecondInstructions, newSecondInstructions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAssignment()
  {
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignment(String newAssignment)
  {
    String oldAssignment = assignment;
    assignment = newAssignment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SCL_EXPRESSION__ASSIGNMENT, oldAssignment, assignment));
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
      case SclPackage.SCL_EXPRESSION__SECOND_INSTRUCTIONS:
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
      case SclPackage.SCL_EXPRESSION__SECOND_INSTRUCTIONS:
        return getSecondInstructions();
      case SclPackage.SCL_EXPRESSION__ASSIGNMENT:
        return getAssignment();
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
      case SclPackage.SCL_EXPRESSION__SECOND_INSTRUCTIONS:
        setSecondInstructions((Instruction)newValue);
        return;
      case SclPackage.SCL_EXPRESSION__ASSIGNMENT:
        setAssignment((String)newValue);
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
      case SclPackage.SCL_EXPRESSION__SECOND_INSTRUCTIONS:
        setSecondInstructions((Instruction)null);
        return;
      case SclPackage.SCL_EXPRESSION__ASSIGNMENT:
        setAssignment(ASSIGNMENT_EDEFAULT);
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
      case SclPackage.SCL_EXPRESSION__SECOND_INSTRUCTIONS:
        return secondInstructions != null;
      case SclPackage.SCL_EXPRESSION__ASSIGNMENT:
        return ASSIGNMENT_EDEFAULT == null ? assignment != null : !ASSIGNMENT_EDEFAULT.equals(assignment);
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
    if (baseClass == Instruction.class)
    {
      switch (derivedFeatureID)
      {
        case SclPackage.SCL_EXPRESSION__SECOND_INSTRUCTIONS: return SclPackage.INSTRUCTION__SECOND_INSTRUCTIONS;
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
    if (baseClass == Instruction.class)
    {
      switch (baseFeatureID)
      {
        case SclPackage.INSTRUCTION__SECOND_INSTRUCTIONS: return SclPackage.SCL_EXPRESSION__SECOND_INSTRUCTIONS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (assignment: ");
    result.append(assignment);
    result.append(')');
    return result.toString();
  }

} //SCLExpressionImpl
