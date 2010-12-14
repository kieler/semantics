/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.synccharts.text.interfaces.interfaces;

import de.cau.cs.kieler.core.kexpressions.Signal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.text.interfaces.interfaces.Signals#getSignals <em>Signals</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.InterfacesPackage#getSignals()
 * @model
 * @generated
 */
public interface Signals extends EObject
{
  /**
   * Returns the value of the '<em><b>Signals</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.Signal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signals</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.text.interfaces.interfaces.InterfacesPackage#getSignals_Signals()
   * @model containment="true"
   * @generated
   */
  EList<Signal> getSignals();

} // Signals
