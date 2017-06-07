/**
 */
package de.cau.cs.kieler.esterel.scest.scest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SC Est Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.scest.scest.SCEstProgram#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.scest.scest.ScestPackage#getSCEstProgram()
 * @model
 * @generated
 */
public interface SCEstProgram extends EObject
{
  /**
   * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.scest.scest.SCEstModule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modules</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.scest.scest.ScestPackage#getSCEstProgram_Modules()
   * @model containment="true"
   * @generated
   */
  EList<SCEstModule> getModules();

} // SCEstProgram
