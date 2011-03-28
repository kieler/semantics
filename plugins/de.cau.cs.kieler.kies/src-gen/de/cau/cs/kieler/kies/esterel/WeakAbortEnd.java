/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.kies.esterel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weak Abort End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.WeakAbortEnd#getOptEnd <em>Opt End</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getWeakAbortEnd()
 * @model
 * @generated
 */
public interface WeakAbortEnd extends EObject
{
  /**
   * Returns the value of the '<em><b>Opt End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opt End</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opt End</em>' containment reference.
   * @see #setOptEnd(WeakAbortEndAlt)
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getWeakAbortEnd_OptEnd()
   * @model containment="true"
   * @generated
   */
  WeakAbortEndAlt getOptEnd();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.WeakAbortEnd#getOptEnd <em>Opt End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opt End</em>' containment reference.
   * @see #getOptEnd()
   * @generated
   */
  void setOptEnd(WeakAbortEndAlt value);

} // WeakAbortEnd
