/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.kies.esterel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Signal Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.LocalSignalDecl#getSignalList <em>Signal List</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.LocalSignalDecl#getOptEnd <em>Opt End</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getLocalSignalDecl()
 * @model
 * @generated
 */
public interface LocalSignalDecl extends StatementContainer, Statement
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
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getLocalSignalDecl_SignalList()
   * @model containment="true"
   * @generated
   */
  LocalSignalList getSignalList();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.LocalSignalDecl#getSignalList <em>Signal List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signal List</em>' containment reference.
   * @see #getSignalList()
   * @generated
   */
  void setSignalList(LocalSignalList value);

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
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getLocalSignalDecl_OptEnd()
   * @model
   * @generated
   */
  String getOptEnd();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.LocalSignalDecl#getOptEnd <em>Opt End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opt End</em>' attribute.
   * @see #getOptEnd()
   * @generated
   */
  void setOptEnd(String value);

} // LocalSignalDecl
