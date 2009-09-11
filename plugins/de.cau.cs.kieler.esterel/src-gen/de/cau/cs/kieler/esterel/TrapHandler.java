/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trap Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.TrapHandler#getTrapExpr <em>Trap Expr</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.TrapHandler#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getTrapHandler()
 * @model
 * @generated
 */
public interface TrapHandler extends EObject
{
  /**
   * Returns the value of the '<em><b>Trap Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trap Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trap Expr</em>' containment reference.
   * @see #setTrapExpr(TrapExpr)
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getTrapHandler_TrapExpr()
   * @model containment="true"
   * @generated
   */
  TrapExpr getTrapExpr();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.TrapHandler#getTrapExpr <em>Trap Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trap Expr</em>' containment reference.
   * @see #getTrapExpr()
   * @generated
   */
  void setTrapExpr(TrapExpr value);

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
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getTrapHandler_Statement()
   * @model containment="true"
   * @generated
   */
  Statement getStatement();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.TrapHandler#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(Statement value);

} // TrapHandler
