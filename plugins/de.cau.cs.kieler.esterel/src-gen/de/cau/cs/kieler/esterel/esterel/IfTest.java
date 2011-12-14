/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.esterel.esterel;

import de.cau.cs.kieler.core.kexpressions.Expression;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.IfTest#getElsif <em>Elsif</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.IfTest#getElsePart <em>Else Part</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.IfTest#getOptEnd <em>Opt End</em>}</li>
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
   * @see #setExpr(Expression)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getIfTest_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.IfTest#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

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
   * Returns the value of the '<em><b>Elsif</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.esterel.ElsIf}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elsif</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elsif</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getIfTest_Elsif()
   * @model containment="true"
   * @generated
   */
  EList<ElsIf> getElsif();

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

  /**
   * Returns the value of the '<em><b>Opt End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opt End</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opt End</em>' attribute.
   * @see #setOptEnd(String)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getIfTest_OptEnd()
   * @model
   * @generated
   */
  String getOptEnd();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.IfTest#getOptEnd <em>Opt End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opt End</em>' attribute.
   * @see #getOptEnd()
   * @generated
   */
  void setOptEnd(String value);

} // IfTest
