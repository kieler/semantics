/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel.esterel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Repeat#isPositive <em>Positive</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Repeat#getDataExpr <em>Data Expr</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Repeat#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getRepeat()
 * @model
 * @generated
 */
public interface Repeat extends Statement
{
  /**
   * Returns the value of the '<em><b>Positive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Positive</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Positive</em>' attribute.
   * @see #setPositive(boolean)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getRepeat_Positive()
   * @model
   * @generated
   */
  boolean isPositive();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Repeat#isPositive <em>Positive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Positive</em>' attribute.
   * @see #isPositive()
   * @generated
   */
  void setPositive(boolean value);

  /**
   * Returns the value of the '<em><b>Data Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Expr</em>' containment reference.
   * @see #setDataExpr(DataExpr)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getRepeat_DataExpr()
   * @model containment="true"
   * @generated
   */
  DataExpr getDataExpr();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Repeat#getDataExpr <em>Data Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Expr</em>' containment reference.
   * @see #getDataExpr()
   * @generated
   */
  void setDataExpr(DataExpr value);

  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference.
   * @see #setStatement(Statement)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getRepeat_Statement()
   * @model containment="true"
   * @generated
   */
  Statement getStatement();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Repeat#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(Statement value);

} // Repeat
