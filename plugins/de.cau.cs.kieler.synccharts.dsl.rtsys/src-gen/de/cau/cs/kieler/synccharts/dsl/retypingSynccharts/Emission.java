/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.retypingSynccharts;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Emission#getSignal <em>Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Emission#getNewValue <em>New Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getEmission()
 * @model
 * @generated
 */
public interface Emission extends Effect
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
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getEmission_Signal()
   * @model
   * @generated
   */
  Signal getSignal();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Emission#getSignal <em>Signal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signal</em>' reference.
   * @see #getSignal()
   * @generated
   */
  void setSignal(Signal value);

  /**
   * Returns the value of the '<em><b>New Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Value</em>' containment reference.
   * @see #setNewValue(Expression)
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getEmission_NewValue()
   * @model containment="true"
   * @generated
   */
  Expression getNewValue();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Emission#getNewValue <em>New Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Value</em>' containment reference.
   * @see #getNewValue()
   * @generated
   */
  void setNewValue(Expression value);

} // Emission
