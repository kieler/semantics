/**
 */
package de.cau.cs.kieler.yakindu.model.stext.synctext.impl;

import de.cau.cs.kieler.yakindu.model.stext.synctext.CombineOperator;
import de.cau.cs.kieler.yakindu.model.stext.synctext.EventDefinition;
import de.cau.cs.kieler.yakindu.model.stext.synctext.SynctextPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.yakindu.base.types.Type;

import org.yakindu.sct.model.stext.stext.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.EventDefinitionImpl#isInput <em>Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.EventDefinitionImpl#isOutput <em>Output</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.EventDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.EventDefinitionImpl#getVarInitialValue <em>Var Initial Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.stext.synctext.impl.EventDefinitionImpl#getVarCombineOperator <em>Var Combine Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventDefinitionImpl extends SignalDefinitionImpl implements EventDefinition
{
  /**
   * The default value of the '{@link #isInput() <em>Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInput()
   * @generated
   * @ordered
   */
  protected static final boolean INPUT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInput() <em>Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInput()
   * @generated
   * @ordered
   */
  protected boolean input = INPUT_EDEFAULT;

  /**
   * The default value of the '{@link #isOutput() <em>Output</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOutput()
   * @generated
   * @ordered
   */
  protected static final boolean OUTPUT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOutput() <em>Output</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOutput()
   * @generated
   * @ordered
   */
  protected boolean output = OUTPUT_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The cached value of the '{@link #getVarInitialValue() <em>Var Initial Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarInitialValue()
   * @generated
   * @ordered
   */
  protected Expression varInitialValue;

  /**
   * The default value of the '{@link #getVarCombineOperator() <em>Var Combine Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarCombineOperator()
   * @generated
   * @ordered
   */
  protected static final CombineOperator VAR_COMBINE_OPERATOR_EDEFAULT = CombineOperator.NONE;

  /**
   * The cached value of the '{@link #getVarCombineOperator() <em>Var Combine Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarCombineOperator()
   * @generated
   * @ordered
   */
  protected CombineOperator varCombineOperator = VAR_COMBINE_OPERATOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventDefinitionImpl()
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
    return SynctextPackage.Literals.EVENT_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInput()
  {
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInput(boolean newInput)
  {
    boolean oldInput = input;
    input = newInput;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SynctextPackage.EVENT_DEFINITION__INPUT, oldInput, input));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOutput()
  {
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutput(boolean newOutput)
  {
    boolean oldOutput = output;
    output = newOutput;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SynctextPackage.EVENT_DEFINITION__OUTPUT, oldOutput, output));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (Type)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SynctextPackage.EVENT_DEFINITION__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SynctextPackage.EVENT_DEFINITION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getVarInitialValue()
  {
    return varInitialValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVarInitialValue(Expression newVarInitialValue, NotificationChain msgs)
  {
    Expression oldVarInitialValue = varInitialValue;
    varInitialValue = newVarInitialValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SynctextPackage.EVENT_DEFINITION__VAR_INITIAL_VALUE, oldVarInitialValue, newVarInitialValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarInitialValue(Expression newVarInitialValue)
  {
    if (newVarInitialValue != varInitialValue)
    {
      NotificationChain msgs = null;
      if (varInitialValue != null)
        msgs = ((InternalEObject)varInitialValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SynctextPackage.EVENT_DEFINITION__VAR_INITIAL_VALUE, null, msgs);
      if (newVarInitialValue != null)
        msgs = ((InternalEObject)newVarInitialValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SynctextPackage.EVENT_DEFINITION__VAR_INITIAL_VALUE, null, msgs);
      msgs = basicSetVarInitialValue(newVarInitialValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SynctextPackage.EVENT_DEFINITION__VAR_INITIAL_VALUE, newVarInitialValue, newVarInitialValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CombineOperator getVarCombineOperator()
  {
    return varCombineOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarCombineOperator(CombineOperator newVarCombineOperator)
  {
    CombineOperator oldVarCombineOperator = varCombineOperator;
    varCombineOperator = newVarCombineOperator == null ? VAR_COMBINE_OPERATOR_EDEFAULT : newVarCombineOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SynctextPackage.EVENT_DEFINITION__VAR_COMBINE_OPERATOR, oldVarCombineOperator, varCombineOperator));
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
      case SynctextPackage.EVENT_DEFINITION__VAR_INITIAL_VALUE:
        return basicSetVarInitialValue(null, msgs);
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
      case SynctextPackage.EVENT_DEFINITION__INPUT:
        return isInput();
      case SynctextPackage.EVENT_DEFINITION__OUTPUT:
        return isOutput();
      case SynctextPackage.EVENT_DEFINITION__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case SynctextPackage.EVENT_DEFINITION__VAR_INITIAL_VALUE:
        return getVarInitialValue();
      case SynctextPackage.EVENT_DEFINITION__VAR_COMBINE_OPERATOR:
        return getVarCombineOperator();
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
      case SynctextPackage.EVENT_DEFINITION__INPUT:
        setInput((Boolean)newValue);
        return;
      case SynctextPackage.EVENT_DEFINITION__OUTPUT:
        setOutput((Boolean)newValue);
        return;
      case SynctextPackage.EVENT_DEFINITION__TYPE:
        setType((Type)newValue);
        return;
      case SynctextPackage.EVENT_DEFINITION__VAR_INITIAL_VALUE:
        setVarInitialValue((Expression)newValue);
        return;
      case SynctextPackage.EVENT_DEFINITION__VAR_COMBINE_OPERATOR:
        setVarCombineOperator((CombineOperator)newValue);
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
      case SynctextPackage.EVENT_DEFINITION__INPUT:
        setInput(INPUT_EDEFAULT);
        return;
      case SynctextPackage.EVENT_DEFINITION__OUTPUT:
        setOutput(OUTPUT_EDEFAULT);
        return;
      case SynctextPackage.EVENT_DEFINITION__TYPE:
        setType((Type)null);
        return;
      case SynctextPackage.EVENT_DEFINITION__VAR_INITIAL_VALUE:
        setVarInitialValue((Expression)null);
        return;
      case SynctextPackage.EVENT_DEFINITION__VAR_COMBINE_OPERATOR:
        setVarCombineOperator(VAR_COMBINE_OPERATOR_EDEFAULT);
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
      case SynctextPackage.EVENT_DEFINITION__INPUT:
        return input != INPUT_EDEFAULT;
      case SynctextPackage.EVENT_DEFINITION__OUTPUT:
        return output != OUTPUT_EDEFAULT;
      case SynctextPackage.EVENT_DEFINITION__TYPE:
        return type != null;
      case SynctextPackage.EVENT_DEFINITION__VAR_INITIAL_VALUE:
        return varInitialValue != null;
      case SynctextPackage.EVENT_DEFINITION__VAR_COMBINE_OPERATOR:
        return varCombineOperator != VAR_COMBINE_OPERATOR_EDEFAULT;
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
    result.append(" (Input: ");
    result.append(input);
    result.append(", Output: ");
    result.append(output);
    result.append(", varCombineOperator: ");
    result.append(varCombineOperator);
    result.append(')');
    return result.toString();
  }

} //EventDefinitionImpl
