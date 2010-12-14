/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.kies.esterel;

import de.cau.cs.kieler.core.kexpressions.IVariable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.Statement#getVardecl <em>Vardecl</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Vardecl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vardecl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vardecl</em>' containment reference.
   * @see #setVardecl(IVariable)
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getStatement_Vardecl()
   * @model containment="true"
   * @generated
   */
  IVariable getVardecl();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.Statement#getVardecl <em>Vardecl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vardecl</em>' containment reference.
   * @see #getVardecl()
   * @generated
   */
  void setVardecl(IVariable value);

} // Statement
