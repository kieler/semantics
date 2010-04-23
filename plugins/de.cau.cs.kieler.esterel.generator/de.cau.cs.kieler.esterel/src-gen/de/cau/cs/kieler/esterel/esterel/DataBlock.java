/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.esterel.esterel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.DataBlock#getDataExpr <em>Data Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getDataBlock()
 * @model
 * @generated
 */
public interface DataBlock extends DataUnaryExpr
{
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
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getDataBlock_DataExpr()
   * @model containment="true"
   * @generated
   */
  DataExpr getDataExpr();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.DataBlock#getDataExpr <em>Data Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Expr</em>' containment reference.
   * @see #getDataExpr()
   * @generated
   */
  void setDataExpr(DataExpr value);

} // DataBlock
