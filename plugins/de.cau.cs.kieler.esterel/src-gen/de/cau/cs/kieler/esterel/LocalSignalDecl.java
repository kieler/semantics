/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Signal Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.LocalSignalDecl#getSignalList <em>Signal List</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.LocalSignalDecl#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getLocalSignalDecl()
 * @model
 * @generated
 */
public interface LocalSignalDecl extends Statement
{
  /**
   * Returns the value of the '<em><b>Signal List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signal List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signal List</em>' containment reference.
   * @see #setSignalList(LocalSignalList)
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getLocalSignalDecl_SignalList()
   * @model containment="true"
   * @generated
   */
  LocalSignalList getSignalList();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.LocalSignalDecl#getSignalList <em>Signal List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signal List</em>' containment reference.
   * @see #getSignalList()
   * @generated
   */
  void setSignalList(LocalSignalList value);

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
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getLocalSignalDecl_Statement()
   * @model containment="true"
   * @generated
   */
  Statement getStatement();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.LocalSignalDecl#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(Statement value);

} // LocalSignalDecl
