/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esi.trace#getTicks <em>Ticks</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esi.EsiPackage#gettrace()
 * @model
 * @generated
 */
public interface trace extends EObject
{
  /**
   * Returns the value of the '<em><b>Ticks</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esi.tick}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ticks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ticks</em>' containment reference list.
   * @see de.cau.cs.kieler.esi.EsiPackage#gettrace_Ticks()
   * @model containment="true"
   * @generated
   */
  EList<tick> getTicks();

} // trace
