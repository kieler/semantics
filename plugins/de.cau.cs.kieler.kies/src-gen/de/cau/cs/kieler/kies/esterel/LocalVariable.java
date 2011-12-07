/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.kies.esterel;

import de.cau.cs.kieler.core.kexpressions.InterfaceVariableDecl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.LocalVariable#getVar <em>Var</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.LocalVariable#getOptEnd <em>Opt End</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getLocalVariable()
 * @model
 * @generated
 */
public interface LocalVariable extends StatementContainer, Statement
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference.
   * @see #setVar(InterfaceVariableDecl)
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getLocalVariable_Var()
   * @model containment="true"
   * @generated
   */
  InterfaceVariableDecl getVar();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.LocalVariable#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(InterfaceVariableDecl value);

  /**
   * Returns the value of the '<em><b>Opt End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opt End</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opt End</em>' attribute.
   * @see #setOptEnd(String)
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getLocalVariable_OptEnd()
   * @model
   * @generated
   */
  String getOptEnd();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.LocalVariable#getOptEnd <em>Opt End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opt End</em>' attribute.
   * @see #getOptEnd()
   * @generated
   */
  void setOptEnd(String value);

} // LocalVariable
