/**
 */
package de.cau.cs.kieler.scl.scl;

import org.yakindu.base.types.Type;

import org.yakindu.sct.model.sgraph.Variable;

import org.yakindu.sct.model.stext.stext.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.scl.VariableDeclaration#isInput <em>Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.scl.VariableDeclaration#isOutput <em>Output</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.scl.VariableDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.scl.VariableDeclaration#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scl.scl.SclPackage#getVariableDeclaration()
 * @model
 * @generated
 */
public interface VariableDeclaration extends Variable
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
   * @see de.cau.cs.kieler.scl.scl.SclPackage#getVariableDeclaration_Input()
   * @model
   * @generated
   */
  boolean isInput();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.scl.scl.VariableDeclaration#isInput <em>Input</em>}' attribute.
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
   * @see de.cau.cs.kieler.scl.scl.SclPackage#getVariableDeclaration_Output()
   * @model
   * @generated
   */
  boolean isOutput();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.scl.scl.VariableDeclaration#isOutput <em>Output</em>}' attribute.
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
   * @see de.cau.cs.kieler.scl.scl.SclPackage#getVariableDeclaration_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.scl.scl.VariableDeclaration#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initial Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial Value</em>' containment reference.
   * @see #setInitialValue(Expression)
   * @see de.cau.cs.kieler.scl.scl.SclPackage#getVariableDeclaration_InitialValue()
   * @model containment="true"
   * @generated
   */
  Expression getInitialValue();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.scl.scl.VariableDeclaration#getInitialValue <em>Initial Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial Value</em>' containment reference.
   * @see #getInitialValue()
   * @generated
   */
  void setInitialValue(Expression value);

} // VariableDeclaration
