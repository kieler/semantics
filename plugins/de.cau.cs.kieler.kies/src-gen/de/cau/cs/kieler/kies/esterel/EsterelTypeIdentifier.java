/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.kies.esterel;

import de.cau.cs.kieler.core.kexpressions.TypeIdentifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.EsterelTypeIdentifier#getFunc <em>Func</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getEsterelTypeIdentifier()
 * @model
 * @generated
 */
public interface EsterelTypeIdentifier extends TypeIdentifier
{
  /**
   * Returns the value of the '<em><b>Func</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Func</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func</em>' reference.
   * @see #setFunc(Function)
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getEsterelTypeIdentifier_Func()
   * @model
   * @generated
   */
  Function getFunc();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.EsterelTypeIdentifier#getFunc <em>Func</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Func</em>' reference.
   * @see #getFunc()
   * @generated
   */
  void setFunc(Function value);

} // EsterelTypeIdentifier
