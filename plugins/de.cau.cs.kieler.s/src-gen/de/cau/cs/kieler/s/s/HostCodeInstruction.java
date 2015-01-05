/**
 */
package de.cau.cs.kieler.s.s;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Host Code Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.s.s.HostCodeInstruction#getHostCode <em>Host Code</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.s.s.SPackage#getHostCodeInstruction()
 * @model
 * @generated
 */
public interface HostCodeInstruction extends Instruction
{
  /**
   * Returns the value of the '<em><b>Host Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Host Code</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Host Code</em>' attribute.
   * @see #setHostCode(String)
   * @see de.cau.cs.kieler.s.s.SPackage#getHostCodeInstruction_HostCode()
   * @model
   * @generated
   */
  String getHostCode();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.s.s.HostCodeInstruction#getHostCode <em>Host Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Host Code</em>' attribute.
   * @see #getHostCode()
   * @generated
   */
  void setHostCode(String value);

} // HostCodeInstruction
