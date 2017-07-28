/**
 */
package de.cau.cs.kieler.esterel.esterel;

import de.cau.cs.kieler.esterel.kexpressions.ISignal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Un Emit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.UnEmit#getSignal <em>Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.UnEmit#getTick <em>Tick</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getUnEmit()
 * @model
 * @generated
 */
public interface UnEmit extends Statement
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
   * @see #setSignal(ISignal)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getUnEmit_Signal()
   * @model
   * @generated
   */
  ISignal getSignal();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.UnEmit#getSignal <em>Signal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signal</em>' reference.
   * @see #getSignal()
   * @generated
   */
  void setSignal(ISignal value);

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
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getUnEmit_Tick()
   * @model
   * @generated
   */
  String getTick();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.UnEmit#getTick <em>Tick</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tick</em>' attribute.
   * @see #getTick()
   * @generated
   */
  void setTick(String value);

} // UnEmit
