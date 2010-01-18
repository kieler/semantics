/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel.esterel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.DataExpr#getLeft <em>Left</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.DataExpr#getOp <em>Op</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.DataExpr#getRight <em>Right</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.DataExpr#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getDataExpr()
 * @model
 * @generated
 */
public interface DataExpr extends EObject
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
   * @see #setLeft(DataUnaryExpr)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getDataExpr_Left()
   * @model containment="true"
   * @generated
   */
  DataUnaryExpr getLeft();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.DataExpr#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(DataUnaryExpr value);

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
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getDataExpr_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.DataExpr#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(DataExpr)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getDataExpr_Right()
   * @model containment="true"
   * @generated
   */
  DataExpr getRight();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.DataExpr#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(DataExpr value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(DataExpr)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getDataExpr_Expr()
   * @model containment="true"
   * @generated
   */
  DataExpr getExpr();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.DataExpr#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(DataExpr value);

} // DataExpr
