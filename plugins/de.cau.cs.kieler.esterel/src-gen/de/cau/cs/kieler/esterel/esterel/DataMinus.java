/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel.esterel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Minus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.DataMinus#getPre <em>Pre</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.DataMinus#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getDataMinus()
 * @model
 * @generated
 */
public interface DataMinus extends DataEquation
{
  /**
   * Returns the value of the '<em><b>Pre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pre</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pre</em>' attribute.
   * @see #setPre(String)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getDataMinus_Pre()
   * @model
   * @generated
   */
  String getPre();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.DataMinus#getPre <em>Pre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pre</em>' attribute.
   * @see #getPre()
   * @generated
   */
  void setPre(String value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(DataUnaryExpr)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getDataMinus_Expr()
   * @model containment="true"
   * @generated
   */
  DataUnaryExpr getExpr();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.DataMinus#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(DataUnaryExpr value);

} // DataMinus
