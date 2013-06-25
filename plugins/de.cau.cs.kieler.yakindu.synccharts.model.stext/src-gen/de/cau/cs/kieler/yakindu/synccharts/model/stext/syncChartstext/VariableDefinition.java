/**
 */
package de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext;

import org.yakindu.sct.model.stext.stext.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.VariableDefinition#isStatic <em>Static</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.VariableDefinition#getVarInitialValue <em>Var Initial Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.SyncChartstextPackage#getVariableDefinition()
 * @model
 * @generated
 */
public interface VariableDefinition extends de.cau.cs.kieler.yakindu.model.stext.synctext.VariableDefinition
{
  /**
   * Returns the value of the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Static</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Static</em>' attribute.
   * @see #setStatic(boolean)
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.SyncChartstextPackage#getVariableDefinition_Static()
   * @model
   * @generated
   */
  boolean isStatic();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.VariableDefinition#isStatic <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Static</em>' attribute.
   * @see #isStatic()
   * @generated
   */
  void setStatic(boolean value);

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
   * @see de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.SyncChartstextPackage#getVariableDefinition_VarInitialValue()
   * @model containment="true"
   * @generated
   */
  Expression getVarInitialValue();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.VariableDefinition#getVarInitialValue <em>Var Initial Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Initial Value</em>' containment reference.
   * @see #getVarInitialValue()
   * @generated
   */
  void setVarInitialValue(Expression value);

} // VariableDefinition
