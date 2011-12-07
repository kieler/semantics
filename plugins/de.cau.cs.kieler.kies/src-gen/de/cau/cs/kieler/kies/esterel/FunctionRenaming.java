/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.kies.esterel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Renaming</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.FunctionRenaming#getNewName <em>New Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.FunctionRenaming#getNewFunc <em>New Func</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.FunctionRenaming#getOldName <em>Old Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getFunctionRenaming()
 * @model
 * @generated
 */
public interface FunctionRenaming extends EObject
{
  /**
   * Returns the value of the '<em><b>New Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Name</em>' reference.
   * @see #setNewName(Function)
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getFunctionRenaming_NewName()
   * @model
   * @generated
   */
  Function getNewName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.FunctionRenaming#getNewName <em>New Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Name</em>' reference.
   * @see #getNewName()
   * @generated
   */
  void setNewName(Function value);

  /**
   * Returns the value of the '<em><b>New Func</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Func</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Func</em>' attribute.
   * @see #setNewFunc(String)
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getFunctionRenaming_NewFunc()
   * @model
   * @generated
   */
  String getNewFunc();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.FunctionRenaming#getNewFunc <em>New Func</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Func</em>' attribute.
   * @see #getNewFunc()
   * @generated
   */
  void setNewFunc(String value);

  /**
   * Returns the value of the '<em><b>Old Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Old Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Old Name</em>' reference.
   * @see #setOldName(Function)
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getFunctionRenaming_OldName()
   * @model
   * @generated
   */
  Function getOldName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.FunctionRenaming#getOldName <em>Old Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Old Name</em>' reference.
   * @see #getOldName()
   * @generated
   */
  void setOldName(Function value);

} // FunctionRenaming
