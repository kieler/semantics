/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.esterel.esterel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Trap#getTrapDeclList <em>Trap Decl List</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Trap#getStatement <em>Statement</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Trap#getTrapHandlerList <em>Trap Handler List</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getTrap()
 * @model
 * @generated
 */
public interface Trap extends Statement
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
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getTrap_TrapDeclList()
   * @model containment="true"
   * @generated
   */
  TrapDeclList getTrapDeclList();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Trap#getTrapDeclList <em>Trap Decl List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trap Decl List</em>' containment reference.
   * @see #getTrapDeclList()
   * @generated
   */
  void setTrapDeclList(TrapDeclList value);

  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference.
   * @see #setStatement(Statement)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getTrap_Statement()
   * @model containment="true"
   * @generated
   */
  Statement getStatement();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Trap#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(Statement value);

  /**
   * Returns the value of the '<em><b>Trap Handler List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trap Handler List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trap Handler List</em>' containment reference.
   * @see #setTrapHandlerList(TrapHandlerList)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getTrap_TrapHandlerList()
   * @model containment="true"
   * @generated
   */
  TrapHandlerList getTrapHandlerList();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Trap#getTrapHandlerList <em>Trap Handler List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trap Handler List</em>' containment reference.
   * @see #getTrapHandlerList()
   * @generated
   */
  void setTrapHandlerList(TrapHandlerList value);

} // Trap
