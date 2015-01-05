/**
 */
package de.cau.cs.kieler.scl.scl;

import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.scl.Assignment#getValuedObject <em>Valued Object</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.scl.Assignment#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.scl.scl.SclPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Instruction
{
  /**
   * Returns the value of the '<em><b>Valued Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valued Object</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valued Object</em>' reference.
   * @see #setValuedObject(ValuedObject)
   * @see de.cau.cs.kieler.scl.scl.SclPackage#getAssignment_ValuedObject()
   * @model
   * @generated
   */
  ValuedObject getValuedObject();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.scl.scl.Assignment#getValuedObject <em>Valued Object</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valued Object</em>' reference.
   * @see #getValuedObject()
   * @generated
   */
  void setValuedObject(ValuedObject value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see de.cau.cs.kieler.scl.scl.SclPackage#getAssignment_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.scl.scl.Assignment#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // Assignment
