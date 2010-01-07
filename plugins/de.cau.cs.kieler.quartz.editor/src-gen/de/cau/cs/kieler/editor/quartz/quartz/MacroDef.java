/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.editor.quartz.quartz;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Macro Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.MacroDef#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.MacroDef#getArgs <em>Args</em>}</li>
 *   <li>{@link de.cau.cs.kieler.editor.quartz.quartz.MacroDef#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage#getMacroDef()
 * @model
 * @generated
 */
public interface MacroDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(QName)
   * @see de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage#getMacroDef_Name()
   * @model containment="true"
   * @generated
   */
  QName getName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.editor.quartz.quartz.MacroDef#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(QName value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference.
   * @see #setArgs(QNameList)
   * @see de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage#getMacroDef_Args()
   * @model containment="true"
   * @generated
   */
  QNameList getArgs();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.editor.quartz.quartz.MacroDef#getArgs <em>Args</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Args</em>' containment reference.
   * @see #getArgs()
   * @generated
   */
  void setArgs(QNameList value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(UtyExpr)
   * @see de.cau.cs.kieler.editor.quartz.quartz.QuartzPackage#getMacroDef_Expr()
   * @model containment="true"
   * @generated
   */
  UtyExpr getExpr();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.editor.quartz.quartz.MacroDef#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(UtyExpr value);

} // MacroDef
