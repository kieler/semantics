/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.Programm#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getProgramm()
 * @model
 * @generated
 */
public interface Programm extends EObject
{
  /**
   * Returns the value of the '<em><b>Module</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Module</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getProgramm_Module()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getModule();

} // Programm
