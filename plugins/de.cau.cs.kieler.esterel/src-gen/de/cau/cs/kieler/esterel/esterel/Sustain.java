/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.esterel.esterel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sustain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Sustain#getSignal <em>Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Sustain#getTick <em>Tick</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.Sustain#getDataExpr <em>Data Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getSustain()
 * @model
 * @generated
 */
public interface Sustain extends Statement
{
  /**
   * Returns the value of the '<em><b>Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signal</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signal</em>' reference.
   * @see #setSignal(Signal)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getSustain_Signal()
   * @model
   * @generated
   */
  Signal getSignal();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Sustain#getSignal <em>Signal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signal</em>' reference.
   * @see #getSignal()
   * @generated
   */
  void setSignal(Signal value);

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
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getSustain_Tick()
   * @model
   * @generated
   */
  String getTick();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Sustain#getTick <em>Tick</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tick</em>' attribute.
   * @see #getTick()
   * @generated
   */
  void setTick(String value);

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
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getSustain_DataExpr()
   * @model containment="true"
   * @generated
   */
  DataExpr getDataExpr();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.Sustain#getDataExpr <em>Data Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Expr</em>' containment reference.
   * @see #getDataExpr()
   * @generated
   */
  void setDataExpr(DataExpr value);

} // Sustain
