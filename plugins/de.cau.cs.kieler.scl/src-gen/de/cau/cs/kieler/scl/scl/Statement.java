/**
 */
package de.cau.cs.kieler.scl.scl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.scl.Statement#getLabel <em>Label</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.scl.Statement#getInstruction <em>Instruction</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scl.scl.SclPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see de.cau.cs.kieler.scl.scl.SclPackage#getStatement_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.scl.scl.Statement#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Instruction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instruction</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instruction</em>' containment reference.
   * @see #setInstruction(EObject)
   * @see de.cau.cs.kieler.scl.scl.SclPackage#getStatement_Instruction()
   * @model containment="true"
   * @generated
   */
  EObject getInstruction();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.scl.scl.Statement#getInstruction <em>Instruction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instruction</em>' containment reference.
   * @see #getInstruction()
   * @generated
   */
  void setInstruction(EObject value);

} // Statement
