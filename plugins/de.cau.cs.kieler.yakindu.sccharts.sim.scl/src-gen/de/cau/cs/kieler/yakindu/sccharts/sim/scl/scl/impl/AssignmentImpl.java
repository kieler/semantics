/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl;

import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Assignment;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Instruction;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.yakindu.sct.model.stext.stext.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.AssignmentImpl#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.AssignmentImpl#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentImpl extends InstructionImpl implements Assignment
{
  /**
   * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignment()
   * @generated
   * @ordered
   */
  protected Expression assignment;

  /**
   * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependencies()
   * @generated
   * @ordered
   */
  protected EList<Instruction> dependencies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssignmentImpl()
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
    return SclPackage.Literals.ASSIGNMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getAssignment()
  {
    if (assignment != null && assignment.eIsProxy())
    {
      InternalEObject oldAssignment = (InternalEObject)assignment;
      assignment = (Expression)eResolveProxy(oldAssignment);
      if (assignment != oldAssignment)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SclPackage.ASSIGNMENT__ASSIGNMENT, oldAssignment, assignment));
      }
    }
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression basicGetAssignment()
  {
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignment(Expression newAssignment)
  {
    Expression oldAssignment = assignment;
    assignment = newAssignment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ASSIGNMENT__ASSIGNMENT, oldAssignment, assignment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Instruction> getDependencies()
  {
    if (dependencies == null)
    {
      dependencies = new EObjectResolvingEList<Instruction>(Instruction.class, this, SclPackage.ASSIGNMENT__DEPENDENCIES);
    }
    return dependencies;
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
      case SclPackage.ASSIGNMENT__ASSIGNMENT:
        if (resolve) return getAssignment();
        return basicGetAssignment();
      case SclPackage.ASSIGNMENT__DEPENDENCIES:
        return getDependencies();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SclPackage.ASSIGNMENT__ASSIGNMENT:
        setAssignment((Expression)newValue);
        return;
      case SclPackage.ASSIGNMENT__DEPENDENCIES:
        getDependencies().clear();
        getDependencies().addAll((Collection<? extends Instruction>)newValue);
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
      case SclPackage.ASSIGNMENT__ASSIGNMENT:
        setAssignment((Expression)null);
        return;
      case SclPackage.ASSIGNMENT__DEPENDENCIES:
        getDependencies().clear();
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
      case SclPackage.ASSIGNMENT__ASSIGNMENT:
        return assignment != null;
      case SclPackage.ASSIGNMENT__DEPENDENCIES:
        return dependencies != null && !dependencies.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AssignmentImpl
