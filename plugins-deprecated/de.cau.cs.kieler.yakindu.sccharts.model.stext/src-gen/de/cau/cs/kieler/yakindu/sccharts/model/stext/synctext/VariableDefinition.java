/**
 */
package de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext;

import org.yakindu.sct.model.sgraph.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.VariableDefinition#isIsInput <em>Is Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.VariableDefinition#isIsOutput <em>Is Output</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.VariableDefinition#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.VariableDefinition#getVarCombineOperator <em>Var Combine Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SynctextPackage#getVariableDefinition()
 * @model
 * @generated
 */
public interface VariableDefinition extends Variable, org.yakindu.sct.model.stext.stext.VariableDefinition
{
  /**
   * Returns the value of the '<em><b>Is Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Input</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Input</em>' attribute.
   * @see #setIsInput(boolean)
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SynctextPackage#getVariableDefinition_IsInput()
   * @model
   * @generated
   */
  boolean isIsInput();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.VariableDefinition#isIsInput <em>Is Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Input</em>' attribute.
   * @see #isIsInput()
   * @generated
   */
  void setIsInput(boolean value);

  /**
   * Returns the value of the '<em><b>Is Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Output</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Output</em>' attribute.
   * @see #setIsOutput(boolean)
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SynctextPackage#getVariableDefinition_IsOutput()
   * @model
   * @generated
   */
  boolean isIsOutput();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.VariableDefinition#isIsOutput <em>Is Output</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Output</em>' attribute.
   * @see #isIsOutput()
   * @generated
   */
  void setIsOutput(boolean value);

  /**
   * Returns the value of the '<em><b>Is Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Static</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Static</em>' attribute.
   * @see #setIsStatic(boolean)
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SynctextPackage#getVariableDefinition_IsStatic()
   * @model
   * @generated
   */
  boolean isIsStatic();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.VariableDefinition#isIsStatic <em>Is Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Static</em>' attribute.
   * @see #isIsStatic()
   * @generated
   */
  void setIsStatic(boolean value);

  /**
   * Returns the value of the '<em><b>Var Combine Operator</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.CombineOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Combine Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Combine Operator</em>' attribute.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.CombineOperator
   * @see #setVarCombineOperator(CombineOperator)
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SynctextPackage#getVariableDefinition_VarCombineOperator()
   * @model
   * @generated
   */
  CombineOperator getVarCombineOperator();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.VariableDefinition#getVarCombineOperator <em>Var Combine Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Combine Operator</em>' attribute.
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.CombineOperator
   * @see #getVarCombineOperator()
   * @generated
   */
  void setVarCombineOperator(CombineOperator value);

} // VariableDefinition
