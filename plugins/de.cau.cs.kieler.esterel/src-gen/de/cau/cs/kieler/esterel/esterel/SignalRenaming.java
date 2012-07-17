/**
 */
package de.cau.cs.kieler.esterel.esterel;

import de.cau.cs.kieler.core.kexpressions.ISignal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Renaming</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.SignalRenaming#getNewName <em>New Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.SignalRenaming#getOldName <em>Old Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getSignalRenaming()
 * @model
 * @generated
 */
public interface SignalRenaming extends EObject
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
   * @see #setNewName(ISignal)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getSignalRenaming_NewName()
   * @model
   * @generated
   */
  ISignal getNewName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.SignalRenaming#getNewName <em>New Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Name</em>' reference.
   * @see #getNewName()
   * @generated
   */
  void setNewName(ISignal value);

  /**
   * Returns the value of the '<em><b>Old Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Old Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Old Name</em>' reference.
   * @see #setOldName(ISignal)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getSignalRenaming_OldName()
   * @model
   * @generated
   */
  ISignal getOldName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.SignalRenaming#getOldName <em>Old Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Old Name</em>' reference.
   * @see #getOldName()
   * @generated
   */
  void setOldName(ISignal value);

} // SignalRenaming
