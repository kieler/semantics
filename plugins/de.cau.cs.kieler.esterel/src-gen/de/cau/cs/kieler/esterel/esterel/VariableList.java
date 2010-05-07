/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel.esterel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.VariableList#getVariable <em>Variable</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.VariableList#getLeft <em>Left</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getVariableList()
 * @model
 * @generated
 */
public interface VariableList extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.esterel.VariableSingle}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getVariableList_Variable()
   * @model containment="true"
   * @generated
   */
  EList<VariableSingle> getVariable();

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(VariableList)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getVariableList_Left()
   * @model containment="true"
   * @generated
   */
  VariableList getLeft();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.VariableList#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(VariableList value);

} // VariableList
