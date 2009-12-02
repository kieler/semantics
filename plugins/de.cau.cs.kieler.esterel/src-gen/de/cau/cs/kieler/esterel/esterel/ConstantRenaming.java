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
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.ConstantRenaming#getValue <em>Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.ConstantRenaming#getNewName <em>New Name</em>}</li>
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
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getConstantRenaming_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.ConstantRenaming#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

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
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getConstantRenaming_NewName()
   * @model
   * @generated
   */
  String getNewName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.ConstantRenaming#getNewName <em>New Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Name</em>' attribute.
   * @see #getNewName()
   * @generated
   */
  void setNewName(String value);

} // ConstantRenaming
