/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.quartz.editor.quartz;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QName</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.QName#getT6 <em>T6</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.QName#getT5 <em>T5</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.QName#getT24 <em>T24</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.QName#getExprs <em>Exprs</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.QName#getT10 <em>T10</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getQName()
 * @model
 * @generated
 */
public interface QName extends InOutName, UtyExpr, Generic, NamedStmt
{
  /**
   * Returns the value of the '<em><b>T6</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T6</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T6</em>' containment reference.
   * @see #setT6(UtyExpr)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getQName_T6()
   * @model containment="true"
   * @generated
   */
  UtyExpr getT6();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.QName#getT6 <em>T6</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T6</em>' containment reference.
   * @see #getT6()
   * @generated
   */
  void setT6(UtyExpr value);

  /**
   * Returns the value of the '<em><b>T5</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T5</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T5</em>' containment reference.
   * @see #setT5(UtyExpr)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getQName_T5()
   * @model containment="true"
   * @generated
   */
  UtyExpr getT5();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.QName#getT5 <em>T5</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T5</em>' containment reference.
   * @see #getT5()
   * @generated
   */
  void setT5(UtyExpr value);

  /**
   * Returns the value of the '<em><b>T24</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T24</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T24</em>' containment reference.
   * @see #setT24(AtomicStmt)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getQName_T24()
   * @model containment="true"
   * @generated
   */
  AtomicStmt getT24();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.QName#getT24 <em>T24</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T24</em>' containment reference.
   * @see #getT24()
   * @generated
   */
  void setT24(AtomicStmt value);

  /**
   * Returns the value of the '<em><b>Exprs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exprs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exprs</em>' containment reference.
   * @see #setExprs(OptUtyExprList)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getQName_Exprs()
   * @model containment="true"
   * @generated
   */
  OptUtyExprList getExprs();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.QName#getExprs <em>Exprs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exprs</em>' containment reference.
   * @see #getExprs()
   * @generated
   */
  void setExprs(OptUtyExprList value);

  /**
   * Returns the value of the '<em><b>T10</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T10</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T10</em>' containment reference.
   * @see #setT10(AtomicStmt)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getQName_T10()
   * @model containment="true"
   * @generated
   */
  AtomicStmt getT10();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.QName#getT10 <em>T10</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T10</em>' containment reference.
   * @see #getT10()
   * @generated
   */
  void setT10(AtomicStmt value);

} // QName
