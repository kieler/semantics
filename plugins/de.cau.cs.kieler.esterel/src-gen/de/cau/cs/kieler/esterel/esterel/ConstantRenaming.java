/**
 */
package de.cau.cs.kieler.esterel.esterel;

import de.cau.cs.kieler.core.kexpressions.ValuedObject;

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
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.ConstantRenaming#getNewValue <em>New Value</em>}</li>
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
   * @see #setNewName(ValuedObject)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getConstantRenaming_NewName()
   * @model
   * @generated
   */
  ValuedObject getNewName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.ConstantRenaming#getNewName <em>New Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Name</em>' reference.
   * @see #getNewName()
   * @generated
   */
  void setNewName(ValuedObject value);

  /**
   * Returns the value of the '<em><b>New Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Value</em>' attribute.
   * @see #setNewValue(String)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getConstantRenaming_NewValue()
   * @model
   * @generated
   */
  String getNewValue();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.ConstantRenaming#getNewValue <em>New Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Value</em>' attribute.
   * @see #getNewValue()
   * @generated
   */
  void setNewValue(String value);

  /**
   * Returns the value of the '<em><b>Old Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Old Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Old Name</em>' reference.
   * @see #setOldName(ValuedObject)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getConstantRenaming_OldName()
   * @model
   * @generated
   */
  ValuedObject getOldName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.ConstantRenaming#getOldName <em>Old Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Old Name</em>' reference.
   * @see #getOldName()
   * @generated
   */
  void setOldName(ValuedObject value);

} // ConstantRenaming
