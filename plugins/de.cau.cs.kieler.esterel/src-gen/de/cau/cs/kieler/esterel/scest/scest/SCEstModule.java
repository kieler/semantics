/**
 */
package de.cau.cs.kieler.esterel.scest.scest;

import de.cau.cs.kieler.esterel.esterel.Module;

import de.cau.cs.kieler.kexpressions.Declaration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SC Est Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.scest.scest.SCEstModule#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.scest.scest.ScestPackage#getSCEstModule()
 * @model
 * @generated
 */
public interface SCEstModule extends Module
{
  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.kexpressions.Declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.scest.scest.ScestPackage#getSCEstModule_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<Declaration> getDeclarations();

} // SCEstModule
