/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel.esterel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Parallel#getLeft <em>Left</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Parallel#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getParallel()
 * @model
 * @generated
 */
public interface Parallel extends Statement
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Statement)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getParallel_Left()
   * @model containment="true"
   * @generated
   */
  Statement getLeft();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Parallel#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Statement value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Statement)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getParallel_Right()
   * @model containment="true"
   * @generated
   */
  Statement getRight();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Parallel#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Statement value);

} // Parallel
