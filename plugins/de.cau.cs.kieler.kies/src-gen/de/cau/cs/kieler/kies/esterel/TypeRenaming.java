/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.kies.esterel;

import de.cau.cs.kieler.core.kexpressions.ValueType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Renaming</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.TypeRenaming#getNewName <em>New Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.TypeRenaming#getNewType <em>New Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.TypeRenaming#getOldName <em>Old Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getTypeRenaming()
 * @model
 * @generated
 */
public interface TypeRenaming extends EObject
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
   * @see #setNewName(Type)
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getTypeRenaming_NewName()
   * @model
   * @generated
   */
  Type getNewName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.TypeRenaming#getNewName <em>New Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Name</em>' reference.
   * @see #getNewName()
   * @generated
   */
  void setNewName(Type value);

  /**
   * Returns the value of the '<em><b>New Type</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.kieler.core.kexpressions.ValueType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Type</em>' attribute.
   * @see de.cau.cs.kieler.core.kexpressions.ValueType
   * @see #setNewType(ValueType)
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getTypeRenaming_NewType()
   * @model
   * @generated
   */
  ValueType getNewType();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.TypeRenaming#getNewType <em>New Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Type</em>' attribute.
   * @see de.cau.cs.kieler.core.kexpressions.ValueType
   * @see #getNewType()
   * @generated
   */
  void setNewType(ValueType value);

  /**
   * Returns the value of the '<em><b>Old Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Old Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Old Name</em>' reference.
   * @see #setOldName(Type)
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getTypeRenaming_OldName()
   * @model
   * @generated
   */
  Type getOldName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.TypeRenaming#getOldName <em>Old Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Old Name</em>' reference.
   * @see #getOldName()
   * @generated
   */
  void setOldName(Type value);

} // TypeRenaming
