/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel.esterel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Run#getModule <em>Module</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Run#getList <em>List</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getRun()
 * @model
 * @generated
 */
public interface Run extends Statement
{
  /**
   * Returns the value of the '<em><b>Module</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Module</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module</em>' containment reference.
   * @see #setModule(ModuleRenaming)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getRun_Module()
   * @model containment="true"
   * @generated
   */
  ModuleRenaming getModule();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Run#getModule <em>Module</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Module</em>' containment reference.
   * @see #getModule()
   * @generated
   */
  void setModule(ModuleRenaming value);

  /**
   * Returns the value of the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' containment reference.
   * @see #setList(RenamingList)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getRun_List()
   * @model containment="true"
   * @generated
   */
  RenamingList getList();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Run#getList <em>List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List</em>' containment reference.
   * @see #getList()
   * @generated
   */
  void setList(RenamingList value);

} // Run
