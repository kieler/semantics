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
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.IfTest#getThen <em>Then</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.IfTest#getElseIf <em>Else If</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.IfTest#getElse <em>Else</em>}</li>
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
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(ThenPart)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getIfTest_Then()
   * @model containment="true"
   * @generated
   */
  ThenPart getThen();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.IfTest#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(ThenPart value);

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
   * Returns the value of the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else</em>' containment reference.
   * @see #setElse(ElsePart)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getIfTest_Else()
   * @model containment="true"
   * @generated
   */
  ElsePart getElse();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.IfTest#getElse <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else</em>' containment reference.
   * @see #getElse()
   * @generated
   */
  void setElse(ElsePart value);

} // IfTest
