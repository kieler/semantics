/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.esterel.esterel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Do</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Do#getStatement <em>Statement</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Do#getEndUp <em>End Up</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Do#getEndWatch <em>End Watch</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getDo()
 * @model
 * @generated
 */
public interface Do extends Statement
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
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getDo_Statement()
   * @model containment="true"
   * @generated
   */
  Statement getStatement();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Do#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(Statement value);

  /**
   * Returns the value of the '<em><b>End Up</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End Up</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Up</em>' containment reference.
   * @see #setEndUp(DoUpto)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getDo_EndUp()
   * @model containment="true"
   * @generated
   */
  DoUpto getEndUp();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Do#getEndUp <em>End Up</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Up</em>' containment reference.
   * @see #getEndUp()
   * @generated
   */
  void setEndUp(DoUpto value);

  /**
   * Returns the value of the '<em><b>End Watch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End Watch</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Watch</em>' containment reference.
   * @see #setEndWatch(DoWatching)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getDo_EndWatch()
   * @model containment="true"
   * @generated
   */
  DoWatching getEndWatch();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Do#getEndWatch <em>End Watch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Watch</em>' containment reference.
   * @see #getEndWatch()
   * @generated
   */
  void setEndWatch(DoWatching value);

} // Do
