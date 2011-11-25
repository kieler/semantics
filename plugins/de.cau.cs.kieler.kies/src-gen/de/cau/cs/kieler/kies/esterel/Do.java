/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.kies.esterel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Do</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.Do#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getDo()
 * @model
 * @generated
 */
public interface Do extends StatementContainer, Statement
{
  /**
   * Returns the value of the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' containment reference.
   * @see #setEnd(EObject)
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getDo_End()
   * @model containment="true"
   * @generated
   */
  EObject getEnd();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.Do#getEnd <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' containment reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(EObject value);

} // Do
