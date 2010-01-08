/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.quartz.editor.quartz;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uty Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.UtyExpr#getOp <em>Op</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.UtyExpr#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.UtyExpr#getT7 <em>T7</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.UtyExpr#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.UtyExpr#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.UtyExpr#getT2 <em>T2</em>}</li>
 *   <li>{@link de.cau.cs.kieler.quartz.editor.quartz.UtyExpr#getT4 <em>T4</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getUtyExpr()
 * @model
 * @generated
 */
public interface UtyExpr extends UtyAction, dUtyExpr
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getUtyExpr_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.UtyExpr#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

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
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getUtyExpr_Expr()
   * @model containment="true"
   * @generated
   */
  dUtyExprs getExpr();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.UtyExpr#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(dUtyExprs value);

  /**
   * Returns the value of the '<em><b>T7</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T7</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T7</em>' containment reference.
   * @see #setT7(UtyExpr)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getUtyExpr_T7()
   * @model containment="true"
   * @generated
   */
  UtyExpr getT7();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.UtyExpr#getT7 <em>T7</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T7</em>' containment reference.
   * @see #getT7()
   * @generated
   */
  void setT7(UtyExpr value);

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
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getUtyExpr_Name()
   * @model containment="true"
   * @generated
   */
  QName getName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.UtyExpr#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(QName value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(QType)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getUtyExpr_Type()
   * @model containment="true"
   * @generated
   */
  QType getType();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.UtyExpr#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(QType value);

  /**
   * Returns the value of the '<em><b>T2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T2</em>' containment reference.
   * @see #setT2(UtyExpr)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getUtyExpr_T2()
   * @model containment="true"
   * @generated
   */
  UtyExpr getT2();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.UtyExpr#getT2 <em>T2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T2</em>' containment reference.
   * @see #getT2()
   * @generated
   */
  void setT2(UtyExpr value);

  /**
   * Returns the value of the '<em><b>T4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T4</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T4</em>' containment reference.
   * @see #setT4(UtyExpr)
   * @see de.cau.cs.kieler.quartz.editor.quartz.QuartzPackage#getUtyExpr_T4()
   * @model containment="true"
   * @generated
   */
  UtyExpr getT4();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.quartz.editor.quartz.UtyExpr#getT4 <em>T4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T4</em>' containment reference.
   * @see #getT4()
   * @generated
   */
  void setT4(UtyExpr value);

} // UtyExpr
