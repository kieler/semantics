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
 * A representation of the model object '<em><b>Trap Decl List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.TrapDeclList#getTrapDecl <em>Trap Decl</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getTrapDeclList()
 * @model
 * @generated
 */
public interface TrapDeclList extends EObject
{
  /**
   * Returns the value of the '<em><b>Trap Decl</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.esterel.TrapDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trap Decl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trap Decl</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getTrapDeclList_TrapDecl()
   * @model containment="true"
   * @generated
   */
  EList<TrapDecl> getTrapDecl();

} // TrapDeclList
