/**
 */
package de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext;

import org.yakindu.base.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.OperationDefinition#getFunctionType <em>Function Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.OperationDefinition#getParamType <em>Param Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SynctextPackage#getOperationDefinition()
 * @model
 * @generated
 */
public interface OperationDefinition extends org.yakindu.sct.model.stext.stext.OperationDefinition
{
  /**
   * Returns the value of the '<em><b>Function Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Type</em>' reference.
   * @see #setFunctionType(Type)
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SynctextPackage#getOperationDefinition_FunctionType()
   * @model
   * @generated
   */
  Type getFunctionType();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.OperationDefinition#getFunctionType <em>Function Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Type</em>' reference.
   * @see #getFunctionType()
   * @generated
   */
  void setFunctionType(Type value);

  /**
   * Returns the value of the '<em><b>Param Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param Type</em>' reference.
   * @see #setParamType(Type)
   * @see de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SynctextPackage#getOperationDefinition_ParamType()
   * @model
   * @generated
   */
  Type getParamType();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.OperationDefinition#getParamType <em>Param Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param Type</em>' reference.
   * @see #getParamType()
   * @generated
   */
  void setParamType(Type value);

} // OperationDefinition
