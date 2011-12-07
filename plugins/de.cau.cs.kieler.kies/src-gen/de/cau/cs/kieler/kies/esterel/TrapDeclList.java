/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.kies.esterel;

import de.cau.cs.kieler.core.kexpressions.ISignal;

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
 *   <li>{@link de.cau.cs.kieler.kies.esterel.TrapDeclList#getTrapDecls <em>Trap Decls</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getTrapDeclList()
 * @model
 * @generated
 */
public interface TrapDeclList extends EObject
{
  /**
   * Returns the value of the '<em><b>Trap Decls</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.ISignal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trap Decls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trap Decls</em>' containment reference list.
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getTrapDeclList_TrapDecls()
   * @model containment="true"
   * @generated
   */
  EList<ISignal> getTrapDecls();

} // TrapDeclList
