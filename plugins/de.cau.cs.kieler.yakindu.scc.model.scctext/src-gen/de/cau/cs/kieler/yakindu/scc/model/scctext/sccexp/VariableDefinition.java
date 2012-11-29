/**
 */
package de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp;

import org.yakindu.sct.model.stext.stext.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.VariableDefinition#getDirection <em>Direction</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.VariableDefinition#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.VariableDefinition#getVarInitialValue <em>Var Initial Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.VariableDefinition#getVarCombineOperator <em>Var Combine Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.SccexpPackage#getVariableDefinition()
 * @model
 * @generated
 */
public interface VariableDefinition extends org.yakindu.sct.model.stext.stext.VariableDefinition
{
  /**
   * Returns the value of the '<em><b>Direction</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.VarDirection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Direction</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Direction</em>' attribute.
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.VarDirection
   * @see #setDirection(VarDirection)
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.SccexpPackage#getVariableDefinition_Direction()
   * @model
   * @generated
   */
  VarDirection getDirection();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.VariableDefinition#getDirection <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Direction</em>' attribute.
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.VarDirection
   * @see #getDirection()
   * @generated
   */
  void setDirection(VarDirection value);

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
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.SccexpPackage#getVariableDefinition_IsStatic()
   * @model
   * @generated
   */
  boolean isIsStatic();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.VariableDefinition#isIsStatic <em>Is Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Static</em>' attribute.
   * @see #isIsStatic()
   * @generated
   */
  void setIsStatic(boolean value);

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
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.SccexpPackage#getVariableDefinition_VarInitialValue()
   * @model containment="true"
   * @generated
   */
  Expression getVarInitialValue();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.VariableDefinition#getVarInitialValue <em>Var Initial Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Initial Value</em>' containment reference.
   * @see #getVarInitialValue()
   * @generated
   */
  void setVarInitialValue(Expression value);

  /**
   * Returns the value of the '<em><b>Var Combine Operator</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.CombineOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Combine Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Combine Operator</em>' attribute.
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.CombineOperator
   * @see #setVarCombineOperator(CombineOperator)
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.SccexpPackage#getVariableDefinition_VarCombineOperator()
   * @model
   * @generated
   */
  CombineOperator getVarCombineOperator();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.VariableDefinition#getVarCombineOperator <em>Var Combine Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Combine Operator</em>' attribute.
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.CombineOperator
   * @see #getVarCombineOperator()
   * @generated
   */
  void setVarCombineOperator(CombineOperator value);

} // VariableDefinition
