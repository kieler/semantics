/**
 */
package de.cau.cs.kieler.scl.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.scl.VariableDefinition#isInput <em>Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.scl.VariableDefinition#isOutput <em>Output</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.scl.VariableDefinition#isStatic <em>Static</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scl.scl.SclPackage#getVariableDefinition()
 * @model
 * @generated
 */
public interface VariableDefinition extends org.yakindu.sct.model.stext.stext.VariableDefinition
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
   * @see de.cau.cs.kieler.scl.scl.SclPackage#getVariableDefinition_Input()
   * @model
   * @generated
   */
  boolean isInput();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.scl.scl.VariableDefinition#isInput <em>Input</em>}' attribute.
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
   * @see de.cau.cs.kieler.scl.scl.SclPackage#getVariableDefinition_Output()
   * @model
   * @generated
   */
  boolean isOutput();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.scl.scl.VariableDefinition#isOutput <em>Output</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output</em>' attribute.
   * @see #isOutput()
   * @generated
   */
  void setOutput(boolean value);

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
   * @see de.cau.cs.kieler.scl.scl.SclPackage#getVariableDefinition_Static()
   * @model
   * @generated
   */
  boolean isStatic();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.scl.scl.VariableDefinition#isStatic <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Static</em>' attribute.
   * @see #isStatic()
   * @generated
   */
  void setStatic(boolean value);

} // VariableDefinition
