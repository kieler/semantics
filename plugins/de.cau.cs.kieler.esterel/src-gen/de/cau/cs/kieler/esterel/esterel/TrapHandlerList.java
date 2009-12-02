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
 * A representation of the model object '<em><b>Trap Handler List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.TrapHandlerList#getTrapHandler <em>Trap Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getTrapHandlerList()
 * @model
 * @generated
 */
public interface TrapHandlerList extends EObject
{
  /**
   * Returns the value of the '<em><b>Trap Handler</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.esterel.TrapHandler}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trap Handler</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trap Handler</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getTrapHandlerList_TrapHandler()
   * @model containment="true"
   * @generated
   */
  EList<TrapHandler> getTrapHandler();

} // TrapHandlerList
