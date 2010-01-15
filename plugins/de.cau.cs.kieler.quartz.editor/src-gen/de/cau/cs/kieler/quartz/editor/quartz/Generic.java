/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.quartz.editor.quartz;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.Generic#getT23 <em>T23</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.Generic#getT <em>T</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getGeneric()
 * @model
 * @generated
 */
public interface Generic extends UtyExpr
{
  /**
   * Returns the value of the '<em><b>T23</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T23</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T23</em>' containment reference.
   * @see #setT23(AtomicStmt)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getGeneric_T23()
   * @model containment="true"
   * @generated
   */
  AtomicStmt getT23();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.Generic#getT23 <em>T23</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T23</em>' containment reference.
   * @see #getT23()
   * @generated
   */
  void setT23(AtomicStmt value);

  /**
   * Returns the value of the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' containment reference.
   * @see #setT(AtomicStmt)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getGeneric_T()
   * @model containment="true"
   * @generated
   */
  AtomicStmt getT();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.Generic#getT <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T</em>' containment reference.
   * @see #getT()
   * @generated
   */
  void setT(AtomicStmt value);

} // Generic
