/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.editor.quartz.quartz;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seq Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.SeqStmt#getS <em>S</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage#getSeqStmt()
 * @model
 * @generated
 */
public interface SeqStmt extends EObject
{
  /**
   * Returns the value of the '<em><b>S</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.editor.quartz.quartz.AtomicStmt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S</em>' containment reference list.
   * @see de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage#getSeqStmt_S()
   * @model containment="true"
   * @generated
   */
  EList<AtomicStmt> getS();

} // SeqStmt
