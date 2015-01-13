/**
 */
package de.cau.cs.kieler.esterel.esterel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Goto#getTargetLabel <em>Target Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getGoto()
 * @model
 * @generated
 */
public interface Goto extends EObject
{
  /**
     * Returns the value of the '<em><b>Target Label</b></em>' attribute.
     * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
     * @return the value of the '<em>Target Label</em>' attribute.
     * @see #setTargetLabel(String)
     * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getGoto_TargetLabel()
     * @model
     * @generated
     */
  String getTargetLabel();

  /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Goto#getTargetLabel <em>Target Label</em>}' attribute.
     * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Label</em>' attribute.
     * @see #getTargetLabel()
     * @generated
     */
  void setTargetLabel(String value);

} // Goto
