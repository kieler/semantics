/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.esterel.esterel;

import de.cau.cs.kieler.core.kexpressions.Expression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delay Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.DelayEvent#getTick <em>Tick</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.DelayEvent#getExpr <em>Expr</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.DelayEvent#getFB <em>FB</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.DelayEvent#getEB <em>EB</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getDelayEvent()
 * @model
 * @generated
 */
public interface DelayEvent extends EObject
{
  /**
   * Returns the value of the '<em><b>Tick</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tick</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tick</em>' attribute.
   * @see #setTick(String)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getDelayEvent_Tick()
   * @model
   * @generated
   */
  String getTick();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.DelayEvent#getTick <em>Tick</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tick</em>' attribute.
   * @see #getTick()
   * @generated
   */
  void setTick(String value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expression)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getDelayEvent_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.DelayEvent#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

  /**
   * Returns the value of the '<em><b>FB</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>FB</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>FB</em>' attribute.
   * @see #setFB(String)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getDelayEvent_FB()
   * @model
   * @generated
   */
  String getFB();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.DelayEvent#getFB <em>FB</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>FB</em>' attribute.
   * @see #getFB()
   * @generated
   */
  void setFB(String value);

  /**
   * Returns the value of the '<em><b>EB</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EB</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EB</em>' attribute.
   * @see #setEB(String)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getDelayEvent_EB()
   * @model
   * @generated
   */
  String getEB();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.DelayEvent#getEB <em>EB</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>EB</em>' attribute.
   * @see #getEB()
   * @generated
   */
  void setEB(String value);

} // DelayEvent
