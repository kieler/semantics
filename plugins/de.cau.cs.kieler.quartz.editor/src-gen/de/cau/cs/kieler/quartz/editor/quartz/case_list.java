/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.quartz.editor.quartz;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>case list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.case_list#getExp <em>Exp</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.case_list#getStmt <em>Stmt</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.case_list#getT15 <em>T15</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getcase_list()
 * @model
 * @generated
 */
public interface case_list extends AtomicStmt
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.quartz.editor.quartz.dUtyExpr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference list.
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getcase_list_Exp()
   * @model containment="true"
   * @generated
   */
  EList<dUtyExpr> getExp();

  /**
   * Returns the value of the '<em><b>Stmt</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.quartz.editor.quartz.Stmt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stmt</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmt</em>' containment reference list.
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getcase_list_Stmt()
   * @model containment="true"
   * @generated
   */
  EList<Stmt> getStmt();

  /**
   * Returns the value of the '<em><b>T15</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T15</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T15</em>' containment reference.
   * @see #setT15(AtomicStmt)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getcase_list_T15()
   * @model containment="true"
   * @generated
   */
  AtomicStmt getT15();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.case_list#getT15 <em>T15</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T15</em>' containment reference.
   * @see #getT15()
   * @generated
   */
  void setT15(AtomicStmt value);

} // case_list
