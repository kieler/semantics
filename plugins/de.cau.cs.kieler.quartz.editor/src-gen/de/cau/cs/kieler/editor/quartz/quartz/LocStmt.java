/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.editor.quartz.quartz;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loc Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.LocStmt#getLocals <em>Locals</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.LocStmt#getStmt <em>Stmt</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage#getLocStmt()
 * @model
 * @generated
 */
public interface LocStmt extends AtomicStmt
{
  /**
   * Returns the value of the '<em><b>Locals</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.editor.quartz.quartz.InterfaceList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Locals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Locals</em>' containment reference list.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage#getLocStmt_Locals()
   * @model containment="true"
   * @generated
   */
  EList<InterfaceList> getLocals();

  /**
   * Returns the value of the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmt</em>' containment reference.
   * @see #setStmt(SeqStmt)
   * @see de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage#getLocStmt_Stmt()
   * @model containment="true"
   * @generated
   */
  SeqStmt getStmt();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.editor.quartz.quartz.LocStmt#getStmt <em>Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stmt</em>' containment reference.
   * @see #getStmt()
   * @generated
   */
  void setStmt(SeqStmt value);

} // LocStmt
