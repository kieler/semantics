/**
 */
package de.cau.cs.kieler.yakindu.model.stext.synctext;

import org.yakindu.base.types.Type;

import org.yakindu.sct.model.stext.stext.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.stext.synctext.EventDefinition#isInput <em>Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.stext.synctext.EventDefinition#isOutput <em>Output</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.stext.synctext.EventDefinition#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.stext.synctext.EventDefinition#getVarInitialValue <em>Var Initial Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.model.stext.synctext.EventDefinition#getVarCombineOperator <em>Var Combine Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.yakindu.model.stext.synctext.SynctextPackage#getEventDefinition()
 * @model
 * @generated
 */
public interface EventDefinition extends SignalDefinition
{
  /**
   * Returns the value of the '<em><b>Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' attribute.
   * @see #setInput(boolean)
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.SynctextPackage#getEventDefinition_Input()
   * @model
   * @generated
   */
  boolean isInput();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.EventDefinition#isInput <em>Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' attribute.
   * @see #isInput()
   * @generated
   */
  void setInput(boolean value);

  /**
   * Returns the value of the '<em><b>Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output</em>' attribute.
   * @see #setOutput(boolean)
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.SynctextPackage#getEventDefinition_Output()
   * @model
   * @generated
   */
  boolean isOutput();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.EventDefinition#isOutput <em>Output</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output</em>' attribute.
   * @see #isOutput()
   * @generated
   */
  void setOutput(boolean value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Type)
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.SynctextPackage#getEventDefinition_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.EventDefinition#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Var Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Initial Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Initial Value</em>' containment reference.
   * @see #setVarInitialValue(Expression)
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.SynctextPackage#getEventDefinition_VarInitialValue()
   * @model containment="true"
   * @generated
   */
  Expression getVarInitialValue();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.EventDefinition#getVarInitialValue <em>Var Initial Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Initial Value</em>' containment reference.
   * @see #getVarInitialValue()
   * @generated
   */
  void setVarInitialValue(Expression value);

  /**
   * Returns the value of the '<em><b>Var Combine Operator</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.kieler.yakindu.model.stext.synctext.CombineOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Combine Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Combine Operator</em>' attribute.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.CombineOperator
   * @see #setVarCombineOperator(CombineOperator)
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.SynctextPackage#getEventDefinition_VarCombineOperator()
   * @model
   * @generated
   */
  CombineOperator getVarCombineOperator();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.model.stext.synctext.EventDefinition#getVarCombineOperator <em>Var Combine Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Combine Operator</em>' attribute.
   * @see de.cau.cs.kieler.yakindu.model.stext.synctext.CombineOperator
   * @see #getVarCombineOperator()
   * @generated
   */
  void setVarCombineOperator(CombineOperator value);

} // EventDefinition
