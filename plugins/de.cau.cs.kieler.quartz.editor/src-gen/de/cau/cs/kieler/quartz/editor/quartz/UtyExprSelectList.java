/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.quartz.editor.quartz;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uty Expr Select List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.UtyExprSelectList#getTk <em>Tk</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getUtyExprSelectList()
 * @model
 * @generated
 */
public interface UtyExprSelectList extends EObject
{
  /**
   * Returns the value of the '<em><b>Tk</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tk</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tk</em>' containment reference.
   * @see #setTk(UtyExpr)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getUtyExprSelectList_Tk()
   * @model containment="true"
   * @generated
   */
  UtyExpr getTk();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.UtyExprSelectList#getTk <em>Tk</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tk</em>' containment reference.
   * @see #getTk()
   * @generated
   */
  void setTk(UtyExpr value);

} // UtyExprSelectList
