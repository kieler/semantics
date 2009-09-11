/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Renaming</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.SignalRenaming#getOldName <em>Old Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.SignalRenaming#getNewName <em>New Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getSignalRenaming()
 * @model
 * @generated
 */
public interface SignalRenaming extends EObject
{
  /**
   * Returns the value of the '<em><b>Old Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Old Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Old Name</em>' reference.
   * @see #setOldName(Signal)
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getSignalRenaming_OldName()
   * @model
   * @generated
   */
  Signal getOldName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.SignalRenaming#getOldName <em>Old Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Old Name</em>' reference.
   * @see #getOldName()
   * @generated
   */
  void setOldName(Signal value);

  /**
   * Returns the value of the '<em><b>New Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Name</em>' attribute.
   * @see #setNewName(String)
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getSignalRenaming_NewName()
   * @model
   * @generated
   */
  String getNewName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.SignalRenaming#getNewName <em>New Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Name</em>' attribute.
   * @see #getNewName()
   * @generated
   */
  void setNewName(String value);

} // SignalRenaming
