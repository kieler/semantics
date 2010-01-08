/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.quartz.editor.quartz;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.Stmt#getLeft <em>Left</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.Stmt#getRight <em>Right</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.Stmt#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.Stmt#getT03 <em>T03</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.Stmt#getT06 <em>T06</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.Stmt#getT16 <em>T16</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getStmt()
 * @model
 * @generated
 */
public interface Stmt extends AtomicStmt
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
   * @see #setLeft(SeqStmt)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getStmt_Left()
   * @model containment="true"
   * @generated
   */
  SeqStmt getLeft();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.Stmt#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(SeqStmt value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.quartz.editor.quartz.SeqStmt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference list.
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getStmt_Right()
   * @model containment="true"
   * @generated
   */
  EList<SeqStmt> getRight();

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(dUtyExprs)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getStmt_Expr()
   * @model containment="true"
   * @generated
   */
  dUtyExprs getExpr();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.Stmt#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(dUtyExprs value);

  /**
   * Returns the value of the '<em><b>T03</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T03</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T03</em>' containment reference.
   * @see #setT03(Stmt)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getStmt_T03()
   * @model containment="true"
   * @generated
   */
  Stmt getT03();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.Stmt#getT03 <em>T03</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T03</em>' containment reference.
   * @see #getT03()
   * @generated
   */
  void setT03(Stmt value);

  /**
   * Returns the value of the '<em><b>T06</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T06</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T06</em>' containment reference.
   * @see #setT06(dUtyExprs)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getStmt_T06()
   * @model containment="true"
   * @generated
   */
  dUtyExprs getT06();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.Stmt#getT06 <em>T06</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T06</em>' containment reference.
   * @see #getT06()
   * @generated
   */
  void setT06(dUtyExprs value);

  /**
   * Returns the value of the '<em><b>T16</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T16</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T16</em>' containment reference.
   * @see #setT16(Stmt)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getStmt_T16()
   * @model containment="true"
   * @generated
   */
  Stmt getT16();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.Stmt#getT16 <em>T16</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T16</em>' containment reference.
   * @see #getT16()
   * @generated
   */
  void setT16(Stmt value);

} // Stmt
