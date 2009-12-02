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
 * A representation of the model object '<em><b>Els If Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.ElsIfPart#getElsif <em>Elsif</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getElsIfPart()
 * @model
 * @generated
 */
public interface ElsIfPart extends EObject
{
  /**
   * Returns the value of the '<em><b>Elsif</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.esterel.ElsIf}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elsif</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elsif</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getElsIfPart_Elsif()
   * @model containment="true"
   * @generated
   */
  EList<ElsIf> getElsif();

} // ElsIfPart
