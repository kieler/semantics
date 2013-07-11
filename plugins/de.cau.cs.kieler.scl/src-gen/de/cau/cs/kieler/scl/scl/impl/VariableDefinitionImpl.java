/**
 */
package de.cau.cs.kieler.scl.scl.impl;

import de.cau.cs.kieler.scl.scl.SclPackage;
import de.cau.cs.kieler.scl.scl.VariableDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.scl.impl.VariableDefinitionImpl#isInput <em>Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.scl.impl.VariableDefinitionImpl#isOutput <em>Output</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.scl.impl.VariableDefinitionImpl#isStatic <em>Static</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDefinitionImpl extends org.yakindu.sct.model.stext.stext.impl.VariableDefinitionImpl implements VariableDefinition
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
   * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStatic()
   * @generated
   * @ordered
   */
  protected static final boolean STATIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStatic()
   * @generated
   * @ordered
   */
  protected boolean static_ = STATIC_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableDefinitionImpl()
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
    return SclPackage.Literals.VARIABLE_DEFINITION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.VARIABLE_DEFINITION__INPUT, oldInput, input));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.VARIABLE_DEFINITION__OUTPUT, oldOutput, output));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStatic()
  {
    return static_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatic(boolean newStatic)
  {
    boolean oldStatic = static_;
    static_ = newStatic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.VARIABLE_DEFINITION__STATIC, oldStatic, static_));
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
      case SclPackage.VARIABLE_DEFINITION__INPUT:
        return isInput();
      case SclPackage.VARIABLE_DEFINITION__OUTPUT:
        return isOutput();
      case SclPackage.VARIABLE_DEFINITION__STATIC:
        return isStatic();
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
      case SclPackage.VARIABLE_DEFINITION__INPUT:
        setInput((Boolean)newValue);
        return;
      case SclPackage.VARIABLE_DEFINITION__OUTPUT:
        setOutput((Boolean)newValue);
        return;
      case SclPackage.VARIABLE_DEFINITION__STATIC:
        setStatic((Boolean)newValue);
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
      case SclPackage.VARIABLE_DEFINITION__INPUT:
        setInput(INPUT_EDEFAULT);
        return;
      case SclPackage.VARIABLE_DEFINITION__OUTPUT:
        setOutput(OUTPUT_EDEFAULT);
        return;
      case SclPackage.VARIABLE_DEFINITION__STATIC:
        setStatic(STATIC_EDEFAULT);
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
      case SclPackage.VARIABLE_DEFINITION__INPUT:
        return input != INPUT_EDEFAULT;
      case SclPackage.VARIABLE_DEFINITION__OUTPUT:
        return output != OUTPUT_EDEFAULT;
      case SclPackage.VARIABLE_DEFINITION__STATIC:
        return static_ != STATIC_EDEFAULT;
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
    result.append(" (input: ");
    result.append(input);
    result.append(", output: ");
    result.append(output);
    result.append(", static: ");
    result.append(static_);
    result.append(')');
    return result.toString();
  }

} //VariableDefinitionImpl
