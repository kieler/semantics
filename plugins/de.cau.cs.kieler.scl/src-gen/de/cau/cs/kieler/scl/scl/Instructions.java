/**
 */
package de.cau.cs.kieler.scl.scl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instructions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.scl.Instructions#getList <em>List</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scl.scl.Instructions#getProgram <em>Program</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.scl.scl.SclPackage#getInstructions()
 * @model
 * @generated
 */
public interface Instructions extends EObject
{
  /**
   * Returns the value of the '<em><b>List</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' containment reference list.
   * @see de.cau.cs.kieler.scl.scl.SclPackage#getInstructions_List()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getList();

  /**
   * Returns the value of the '<em><b>Program</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Program</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Program</em>' reference.
   * @see #setProgram(Program)
   * @see de.cau.cs.kieler.scl.scl.SclPackage#getInstructions_Program()
   * @model
   * @generated
   */
  Program getProgram();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.scl.scl.Instructions#getProgram <em>Program</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Program</em>' reference.
   * @see #getProgram()
   * @generated
   */
  void setProgram(Program value);

} // Instructions
