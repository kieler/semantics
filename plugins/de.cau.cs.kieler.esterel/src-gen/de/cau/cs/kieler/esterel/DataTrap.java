/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Trap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.DataTrap#getTrap <em>Trap</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getDataTrap()
 * @model
 * @generated
 */
public interface DataTrap extends DataUnaryExpr
{
  /**
   * Returns the value of the '<em><b>Trap</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trap</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trap</em>' reference.
   * @see #setTrap(TrapDecl)
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getDataTrap_Trap()
   * @model
   * @generated
   */
  TrapDecl getTrap();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.DataTrap#getTrap <em>Trap</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trap</em>' reference.
   * @see #getTrap()
   * @generated
   */
  void setTrap(TrapDecl value);

} // DataTrap
