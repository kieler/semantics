/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delay Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.DelayExpr#getStatement <em>Statement</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.DelayExpr#getEnd <em>End</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.DelayExpr#getEvent <em>Event</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.DelayExpr#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getDelayExpr()
 * @model
 * @generated
 */
public interface DelayExpr extends AwaitInstance
{
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
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getDelayExpr_Statement()
   * @model containment="true"
   * @generated
   */
  Statement getStatement();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.DelayExpr#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(Statement value);

  /**
   * Returns the value of the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' attribute.
   * @see #setEnd(String)
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getDelayExpr_End()
   * @model
   * @generated
   */
  String getEnd();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.DelayExpr#getEnd <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' attribute.
   * @see #getEnd()
   * @generated
   */
  void setEnd(String value);

  /**
   * Returns the value of the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' containment reference.
   * @see #setEvent(DelayEvent)
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getDelayExpr_Event()
   * @model containment="true"
   * @generated
   */
  DelayEvent getEvent();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.DelayExpr#getEvent <em>Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' containment reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(DelayEvent value);

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
   * @see de.cau.cs.kieler.esterel.EsterelPackage#getDelayExpr_Expr()
   * @model containment="true"
   * @generated
   */
  DataExpr getExpr();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.DelayExpr#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(DataExpr value);

} // DelayExpr
