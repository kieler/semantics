/**
 */
package de.cau.cs.kieler.simulation.kisim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.simulation.kisim.Execution#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.simulation.kisim.KisimPackage#getExecution()
 * @model
 * @generated
 */
public interface Execution extends EObject
{
  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.simulation.kisim.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see de.cau.cs.kieler.simulation.kisim.KisimPackage#getExecution_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActions();

} // Execution
