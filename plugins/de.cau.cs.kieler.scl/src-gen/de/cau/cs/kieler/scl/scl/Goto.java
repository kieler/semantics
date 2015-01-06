/**
 */
package de.cau.cs.kieler.scl.scl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.scl.Goto#getTargetLabel <em>Target Label</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.scl.scl.SclPackage#getGoto()
 * @model
 * @generated
 */
public interface Goto extends Instruction
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
   * @see de.cau.cs.kieler.scl.scl.SclPackage#getGoto_TargetLabel()
   * @model
   * @generated
   */
  String getTargetLabel();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.scl.scl.Goto#getTargetLabel <em>Target Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Label</em>' attribute.
   * @see #getTargetLabel()
   * @generated
   */
  void setTargetLabel(String value);

} // Goto
