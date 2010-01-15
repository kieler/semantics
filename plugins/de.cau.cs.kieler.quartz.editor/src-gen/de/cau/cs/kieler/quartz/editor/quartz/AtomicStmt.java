/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.quartz.editor.quartz;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.AtomicStmt#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.AtomicStmt#getT03 <em>T03</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.AtomicStmt#getT16 <em>T16</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.AtomicStmt#getT06 <em>T06</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getAtomicStmt()
 * @model
 * @generated
 */
public interface AtomicStmt extends EObject
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
   * @see #setExpr(dUtyExprs)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getAtomicStmt_Expr()
   * @model containment="true"
   * @generated
   */
  dUtyExprs getExpr();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.AtomicStmt#getExpr <em>Expr</em>}' containment reference.
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
   * @see #setT03(AtomicStmt)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getAtomicStmt_T03()
   * @model containment="true"
   * @generated
   */
  AtomicStmt getT03();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.AtomicStmt#getT03 <em>T03</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T03</em>' containment reference.
   * @see #getT03()
   * @generated
   */
  void setT03(AtomicStmt value);

  /**
   * Returns the value of the '<em><b>T16</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T16</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T16</em>' containment reference.
   * @see #setT16(AtomicStmt)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getAtomicStmt_T16()
   * @model containment="true"
   * @generated
   */
  AtomicStmt getT16();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.AtomicStmt#getT16 <em>T16</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T16</em>' containment reference.
   * @see #getT16()
   * @generated
   */
  void setT16(AtomicStmt value);

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
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getAtomicStmt_T06()
   * @model containment="true"
   * @generated
   */
  dUtyExprs getT06();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.AtomicStmt#getT06 <em>T06</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T06</em>' containment reference.
   * @see #getT06()
   * @generated
   */
  void setT06(dUtyExprs value);

} // AtomicStmt
