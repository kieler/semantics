/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.esterel.esterel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Renaming</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.ConstantRenaming#getNewName <em>New Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.ConstantRenaming#getOldName <em>Old Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getConstantRenaming()
 * @model
 * @generated
 */
public interface ConstantRenaming extends EObject
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
   * @see #setNewName(Constant)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getConstantRenaming_NewName()
   * @model
   * @generated
   */
  Constant getNewName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.ConstantRenaming#getNewName <em>New Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Name</em>' reference.
   * @see #getNewName()
   * @generated
   */
  void setNewName(Constant value);

  /**
   * Returns the value of the '<em><b>Old Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Old Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Old Name</em>' reference.
   * @see #setOldName(Constant)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getConstantRenaming_OldName()
   * @model
   * @generated
   */
  Constant getOldName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.ConstantRenaming#getOldName <em>Old Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Old Name</em>' reference.
   * @see #getOldName()
   * @generated
   */
  void setOldName(Constant value);

} // ConstantRenaming
