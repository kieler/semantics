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
 * A representation of the model object '<em><b>Procedure Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.ProcedureDecl#getProcedure <em>Procedure</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getProcedureDecl()
 * @model
 * @generated
 */
public interface ProcedureDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Procedure</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.Procedure}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Procedure</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Procedure</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getProcedureDecl_Procedure()
   * @model containment="true"
   * @generated
   */
  EList<Procedure> getProcedure();

} // ProcedureDecl
