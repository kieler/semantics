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
 * A representation of the model object '<em><b>Constant Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.ConstantDecl#getConstant <em>Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getConstantDecl()
 * @model
 * @generated
 */
public interface ConstantDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Constant</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.esterel.OneTypeConstantDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getConstantDecl_Constant()
   * @model containment="true"
   * @generated
   */
  EList<OneTypeConstantDecl> getConstant();

} // ConstantDecl
