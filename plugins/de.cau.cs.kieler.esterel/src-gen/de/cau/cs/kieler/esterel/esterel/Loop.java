/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.esterel.esterel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Loop#getBody <em>Body</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Loop#getEnd1 <em>End1</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Loop#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends Statement
{
  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(LoopBody)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getLoop_Body()
   * @model containment="true"
   * @generated
   */
  LoopBody getBody();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Loop#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(LoopBody value);

  /**
   * Returns the value of the '<em><b>End1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End1</em>' containment reference.
   * @see #setEnd1(EndLoop)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getLoop_End1()
   * @model containment="true"
   * @generated
   */
  EndLoop getEnd1();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Loop#getEnd1 <em>End1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End1</em>' containment reference.
   * @see #getEnd1()
   * @generated
   */
  void setEnd1(EndLoop value);

  /**
   * Returns the value of the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' containment reference.
   * @see #setEnd(LoopEach)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getLoop_End()
   * @model containment="true"
   * @generated
   */
  LoopEach getEnd();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Loop#getEnd <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' containment reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(LoopEach value);

} // Loop
