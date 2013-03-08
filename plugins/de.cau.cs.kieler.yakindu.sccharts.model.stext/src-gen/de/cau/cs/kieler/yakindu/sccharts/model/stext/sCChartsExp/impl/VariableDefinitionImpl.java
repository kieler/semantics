/**
 */
package de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.impl;

import de.cau.cs.kieler.yakindu.model.stext.synctext.CombineOperator;

import de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.SCChartsExpPackage;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.VariableDefinition;

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
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.impl.VariableDefinitionImpl#isIsInput <em>Is Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.impl.VariableDefinitionImpl#isIsOutput <em>Is Output</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.impl.VariableDefinitionImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.impl.VariableDefinitionImpl#getVarCombineOperator <em>Var Combine Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDefinitionImpl extends de.cau.cs.kieler.yakindu.model.stext.synctext.impl.VariableDefinitionImpl implements VariableDefinition
{
  /**
   * The default value of the '{@link #isIsInput() <em>Is Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsInput()
   * @generated
   * @ordered
   */
  protected static final boolean IS_INPUT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsInput() <em>Is Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsInput()
   * @generated
   * @ordered
   */
  protected boolean isInput = IS_INPUT_EDEFAULT;

  /**
   * The default value of the '{@link #isIsOutput() <em>Is Output</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsOutput()
   * @generated
   * @ordered
   */
  protected static final boolean IS_OUTPUT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsOutput() <em>Is Output</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsOutput()
   * @generated
   * @ordered
   */
  protected boolean isOutput = IS_OUTPUT_EDEFAULT;

  /**
   * The default value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsStatic()
   * @generated
   * @ordered
   */
  protected static final boolean IS_STATIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsStatic()
   * @generated
   * @ordered
   */
  protected boolean isStatic = IS_STATIC_EDEFAULT;

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
    return SCChartsExpPackage.Literals.VARIABLE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsInput()
  {
    return isInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsInput(boolean newIsInput)
  {
    boolean oldIsInput = isInput;
    isInput = newIsInput;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SCChartsExpPackage.VARIABLE_DEFINITION__IS_INPUT, oldIsInput, isInput));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsOutput()
  {
    return isOutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsOutput(boolean newIsOutput)
  {
    boolean oldIsOutput = isOutput;
    isOutput = newIsOutput;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SCChartsExpPackage.VARIABLE_DEFINITION__IS_OUTPUT, oldIsOutput, isOutput));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsStatic()
  {
    return isStatic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsStatic(boolean newIsStatic)
  {
    boolean oldIsStatic = isStatic;
    isStatic = newIsStatic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SCChartsExpPackage.VARIABLE_DEFINITION__IS_STATIC, oldIsStatic, isStatic));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SCChartsExpPackage.VARIABLE_DEFINITION__VAR_COMBINE_OPERATOR, oldVarCombineOperator, varCombineOperator));
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
      case SCChartsExpPackage.VARIABLE_DEFINITION__IS_INPUT:
        return isIsInput();
      case SCChartsExpPackage.VARIABLE_DEFINITION__IS_OUTPUT:
        return isIsOutput();
      case SCChartsExpPackage.VARIABLE_DEFINITION__IS_STATIC:
        return isIsStatic();
      case SCChartsExpPackage.VARIABLE_DEFINITION__VAR_COMBINE_OPERATOR:
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
      case SCChartsExpPackage.VARIABLE_DEFINITION__IS_INPUT:
        setIsInput((Boolean)newValue);
        return;
      case SCChartsExpPackage.VARIABLE_DEFINITION__IS_OUTPUT:
        setIsOutput((Boolean)newValue);
        return;
      case SCChartsExpPackage.VARIABLE_DEFINITION__IS_STATIC:
        setIsStatic((Boolean)newValue);
        return;
      case SCChartsExpPackage.VARIABLE_DEFINITION__VAR_COMBINE_OPERATOR:
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
      case SCChartsExpPackage.VARIABLE_DEFINITION__IS_INPUT:
        setIsInput(IS_INPUT_EDEFAULT);
        return;
      case SCChartsExpPackage.VARIABLE_DEFINITION__IS_OUTPUT:
        setIsOutput(IS_OUTPUT_EDEFAULT);
        return;
      case SCChartsExpPackage.VARIABLE_DEFINITION__IS_STATIC:
        setIsStatic(IS_STATIC_EDEFAULT);
        return;
      case SCChartsExpPackage.VARIABLE_DEFINITION__VAR_COMBINE_OPERATOR:
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
      case SCChartsExpPackage.VARIABLE_DEFINITION__IS_INPUT:
        return isInput != IS_INPUT_EDEFAULT;
      case SCChartsExpPackage.VARIABLE_DEFINITION__IS_OUTPUT:
        return isOutput != IS_OUTPUT_EDEFAULT;
      case SCChartsExpPackage.VARIABLE_DEFINITION__IS_STATIC:
        return isStatic != IS_STATIC_EDEFAULT;
      case SCChartsExpPackage.VARIABLE_DEFINITION__VAR_COMBINE_OPERATOR:
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
    result.append(" (isInput: ");
    result.append(isInput);
    result.append(", isOutput: ");
    result.append(isOutput);
    result.append(", isStatic: ");
    result.append(isStatic);
    result.append(", varCombineOperator: ");
    result.append(varCombineOperator);
    result.append(')');
    return result.toString();
  }

} //VariableDefinitionImpl
