/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.esterel.esterel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weak Abort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.WeakAbort#getStatement <em>Statement</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.WeakAbort#getWeakAbortBody <em>Weak Abort Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getWeakAbort()
 * @model
 * @generated
 */
public interface WeakAbort extends Statement
{
  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference.
   * @see #setStatement(Statement)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getWeakAbort_Statement()
   * @model containment="true"
   * @generated
   */
  Statement getStatement();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.WeakAbort#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(Statement value);

  /**
   * Returns the value of the '<em><b>Weak Abort Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Weak Abort Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Weak Abort Body</em>' containment reference.
   * @see #setWeakAbortBody(WeakAbortBody)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getWeakAbort_WeakAbortBody()
   * @model containment="true"
   * @generated
   */
  WeakAbortBody getWeakAbortBody();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.WeakAbort#getWeakAbortBody <em>Weak Abort Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Weak Abort Body</em>' containment reference.
   * @see #getWeakAbortBody()
   * @generated
   */
  void setWeakAbortBody(WeakAbortBody value);

} // WeakAbort
