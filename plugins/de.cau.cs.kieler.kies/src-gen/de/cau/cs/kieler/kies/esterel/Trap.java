/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.kies.esterel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.Trap#getTrapDeclList <em>Trap Decl List</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.Trap#getTrapHandler <em>Trap Handler</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.Trap#getOptEnd <em>Opt End</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getTrap()
 * @model
 * @generated
 */
public interface Trap extends StatementContainer, Statement
{
  /**
   * Returns the value of the '<em><b>Trap Decl List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trap Decl List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trap Decl List</em>' containment reference.
   * @see #setTrapDeclList(TrapDeclList)
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getTrap_TrapDeclList()
   * @model containment="true"
   * @generated
   */
  TrapDeclList getTrapDeclList();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.Trap#getTrapDeclList <em>Trap Decl List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trap Decl List</em>' containment reference.
   * @see #getTrapDeclList()
   * @generated
   */
  void setTrapDeclList(TrapDeclList value);

  /**
   * Returns the value of the '<em><b>Trap Handler</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.kies.esterel.TrapHandler}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trap Handler</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trap Handler</em>' containment reference list.
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getTrap_TrapHandler()
   * @model containment="true"
   * @generated
   */
  EList<TrapHandler> getTrapHandler();

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
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getTrap_OptEnd()
   * @model
   * @generated
   */
  String getOptEnd();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.Trap#getOptEnd <em>Opt End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opt End</em>' attribute.
   * @see #getOptEnd()
   * @generated
   */
  void setOptEnd(String value);

} // Trap
