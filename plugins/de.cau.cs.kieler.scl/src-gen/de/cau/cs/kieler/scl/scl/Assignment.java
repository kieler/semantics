/**
 */
package de.cau.cs.kieler.scl.scl;

import org.eclipse.emf.ecore.EObject;

import org.yakindu.sct.model.stext.stext.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.scl.Assignment#getAssignment <em>Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scl.scl.SclPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends EObject
{
  /**
   * Returns the value of the '<em><b>Assignment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignment</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignment</em>' containment reference.
   * @see #setAssignment(Expression)
   * @see de.cau.cs.kieler.scl.scl.SclPackage#getAssignment_Assignment()
   * @model containment="true"
   * @generated
   */
  Expression getAssignment();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.scl.scl.Assignment#getAssignment <em>Assignment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignment</em>' containment reference.
   * @see #getAssignment()
   * @generated
   */
  void setAssignment(Expression value);

} // Assignment
