/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.quartz.editor.quartz;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

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
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getStmt()
 * @model
 * @generated
 */
public interface Stmt extends EObject
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

} // Stmt
