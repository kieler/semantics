/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.ChannelDescription#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.ChannelDescription#getDataExpr <em>Data Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getChannelDescription()
 * @model
 * @generated
 */
public interface ChannelDescription extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getChannelDescription_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.ChannelDescription#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

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
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getChannelDescription_DataExpr()
   * @model containment="true"
   * @generated
   */
  DataExpr getDataExpr();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.ChannelDescription#getDataExpr <em>Data Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Expr</em>' containment reference.
   * @see #getDataExpr()
   * @generated
   */
  void setDataExpr(DataExpr value);

} // ChannelDescription
