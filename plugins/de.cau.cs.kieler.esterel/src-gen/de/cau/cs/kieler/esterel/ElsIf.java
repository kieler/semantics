/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Els If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.ElsIf#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.ElsIf#getThen <em>Then</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getElsIf()
 * @model
 * @generated
 */
public interface ElsIf extends EObject
{
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
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getElsIf_Expr()
   * @model containment="true"
   * @generated
   */
  DataExpr getExpr();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.ElsIf#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(DataExpr value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(ThenPart)
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getElsIf_Then()
   * @model containment="true"
   * @generated
   */
  ThenPart getThen();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.ElsIf#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(ThenPart value);

} // ElsIf
