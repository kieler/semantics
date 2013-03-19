/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl;

import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Instruction;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Program;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.yakindu.sct.model.stext.stext.VariableDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.ProgramImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.ProgramImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.impl.ProgramImpl#getInstruction <em>Instruction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<VariableDefinition> variables;

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
  protected ProgramImpl()
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
    return SclPackage.Literals.PROGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.PROGRAM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VariableDefinition> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectContainmentEList<VariableDefinition>(VariableDefinition.class, this, SclPackage.PROGRAM__VARIABLES);
    }
    return variables;
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
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.PROGRAM__INSTRUCTION, oldInstruction, newInstruction);
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
    if (newInstruction != instruction)
    {
      NotificationChain msgs = null;
      if (instruction != null)
        msgs = ((InternalEObject)instruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.PROGRAM__INSTRUCTION, null, msgs);
      if (newInstruction != null)
        msgs = ((InternalEObject)newInstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SclPackage.PROGRAM__INSTRUCTION, null, msgs);
      msgs = basicSetInstruction(newInstruction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.PROGRAM__INSTRUCTION, newInstruction, newInstruction));
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
      case SclPackage.PROGRAM__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
      case SclPackage.PROGRAM__INSTRUCTION:
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
    switch (featureID)
    {
      case SclPackage.PROGRAM__NAME:
        return getName();
      case SclPackage.PROGRAM__VARIABLES:
        return getVariables();
      case SclPackage.PROGRAM__INSTRUCTION:
        return getInstruction();
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
      case SclPackage.PROGRAM__NAME:
        setName((String)newValue);
        return;
      case SclPackage.PROGRAM__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends VariableDefinition>)newValue);
        return;
      case SclPackage.PROGRAM__INSTRUCTION:
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
    switch (featureID)
    {
      case SclPackage.PROGRAM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SclPackage.PROGRAM__VARIABLES:
        getVariables().clear();
        return;
      case SclPackage.PROGRAM__INSTRUCTION:
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
    switch (featureID)
    {
      case SclPackage.PROGRAM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SclPackage.PROGRAM__VARIABLES:
        return variables != null && !variables.isEmpty();
      case SclPackage.PROGRAM__INSTRUCTION:
        return instruction != null;
    }
    return super.eIsSet(featureID);
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ProgramImpl
