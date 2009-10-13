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
 * A representation of the model object '<em><b>tracelist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esi.tracelist#getTraces <em>Traces</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esi.EsiPackage#gettracelist()
 * @model
 * @generated
 */
public interface tracelist extends EObject
{
  /**
   * Returns the value of the '<em><b>Traces</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esi.trace}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Traces</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Traces</em>' containment reference list.
   * @see de.cau.cs.kieler.esi.EsiPackage#gettracelist_Traces()
   * @model containment="true"
   * @generated
   */
  EList<trace> getTraces();

} // tracelist
