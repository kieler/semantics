/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.LocalSignal#getSignal <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getLocalSignal()
 * @model
 * @generated
 */
public interface LocalSignal extends LocalSignalList
{
  /**
   * Returns the value of the '<em><b>Signal</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.Signal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signal</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signal</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getLocalSignal_Signal()
   * @model containment="true"
   * @generated
   */
  EList<Signal> getSignal();

} // LocalSignal
