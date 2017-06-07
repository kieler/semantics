/**
 */
package de.cau.cs.kieler.esterel.esterel;

import de.cau.cs.kieler.annotations.Annotation;

import de.cau.cs.kieler.scl.scl.Statement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.IfTest#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.IfTest#getThenAnnotations <em>Then Annotations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.IfTest#getThenStatements <em>Then Statements</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.IfTest#getElseif <em>Elseif</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.IfTest#getElseAnnotations <em>Else Annotations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.IfTest#getElseStatements <em>Else Statements</em>}</li>
 * </ul>
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
   * Returns the value of the '<em><b>Then Annotations</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.annotations.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Annotations</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getIfTest_ThenAnnotations()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getThenAnnotations();

  /**
   * Returns the value of the '<em><b>Then Statements</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.scl.scl.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Statements</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getIfTest_ThenStatements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getThenStatements();

  /**
   * Returns the value of the '<em><b>Elseif</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.esterel.ElsIf}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elseif</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elseif</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getIfTest_Elseif()
   * @model containment="true"
   * @generated
   */
  EList<ElsIf> getElseif();

  /**
   * Returns the value of the '<em><b>Else Annotations</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.annotations.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Annotations</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getIfTest_ElseAnnotations()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getElseAnnotations();

  /**
   * Returns the value of the '<em><b>Else Statements</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.scl.scl.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Statements</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getIfTest_ElseStatements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getElseStatements();

} // IfTest
