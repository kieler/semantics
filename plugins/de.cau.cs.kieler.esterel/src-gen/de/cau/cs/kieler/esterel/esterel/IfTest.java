/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel.esterel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.IfTest#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.IfTest#getThenPart <em>Then Part</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.IfTest#getElseIf <em>Else If</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.IfTest#getElsePart <em>Else Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getIfTest()
 * @model
 * @generated
 */
public interface IfTest extends Statement
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(DataExpr)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getIfTest_Expr()
   * @model containment="true"
   * @generated
   */
  DataExpr getExpr();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.IfTest#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(DataExpr value);

  /**
   * Returns the value of the '<em><b>Then Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Part</em>' containment reference.
   * @see #setThenPart(ThenPart)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getIfTest_ThenPart()
   * @model containment="true"
   * @generated
   */
  ThenPart getThenPart();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.IfTest#getThenPart <em>Then Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then Part</em>' containment reference.
   * @see #getThenPart()
   * @generated
   */
  void setThenPart(ThenPart value);

  /**
   * Returns the value of the '<em><b>Else If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else If</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else If</em>' containment reference.
   * @see #setElseIf(ElsIfPart)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getIfTest_ElseIf()
   * @model containment="true"
   * @generated
   */
  ElsIfPart getElseIf();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.IfTest#getElseIf <em>Else If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else If</em>' containment reference.
   * @see #getElseIf()
   * @generated
   */
  void setElseIf(ElsIfPart value);

  /**
   * Returns the value of the '<em><b>Else Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Part</em>' containment reference.
   * @see #setElsePart(ElsePart)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getIfTest_ElsePart()
   * @model containment="true"
   * @generated
   */
  ElsePart getElsePart();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.IfTest#getElsePart <em>Else Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Part</em>' containment reference.
   * @see #getElsePart()
   * @generated
   */
  void setElsePart(ElsePart value);

} // IfTest
