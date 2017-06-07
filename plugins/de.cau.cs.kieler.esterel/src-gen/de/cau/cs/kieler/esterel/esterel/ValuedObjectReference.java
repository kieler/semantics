/**
 */
package de.cau.cs.kieler.esterel.esterel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valued Object Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.ValuedObjectReference#getValuedObject <em>Valued Object</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getValuedObjectReference()
 * @model
 * @generated
 */
public interface ValuedObjectReference extends Expression
{
  /**
   * Returns the value of the '<em><b>Valued Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valued Object</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valued Object</em>' reference.
   * @see #setValuedObject(EObject)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getValuedObjectReference_ValuedObject()
   * @model
   * @generated
   */
  EObject getValuedObject();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.ValuedObjectReference#getValuedObject <em>Valued Object</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valued Object</em>' reference.
   * @see #getValuedObject()
   * @generated
   */
  void setValuedObject(EObject value);

} // ValuedObjectReference
