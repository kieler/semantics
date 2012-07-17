/**
 */
package de.cau.cs.kieler.esterel.esterel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Renaming List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.RenamingList#getList <em>List</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getRenamingList()
 * @model
 * @generated
 */
public interface RenamingList extends EObject
{
  /**
   * Returns the value of the '<em><b>List</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.esterel.Renaming}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getRenamingList_List()
   * @model containment="true"
   * @generated
   */
  EList<Renaming> getList();

} // RenamingList
