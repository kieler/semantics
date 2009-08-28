/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.synccharts.dsl.retypingSynccharts;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getNewSourceState <em>New Source State</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getTargetState <em>Target State</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#isIsHistory <em>Is History</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends Action
{
  /**
   * Returns the value of the '<em><b>New Source State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Source State</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Source State</em>' containment reference.
   * @see #setNewSourceState(State)
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getTransition_NewSourceState()
   * @model containment="true"
   * @generated
   */
  State getNewSourceState();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getNewSourceState <em>New Source State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Source State</em>' containment reference.
   * @see #getNewSourceState()
   * @generated
   */
  void setNewSourceState(State value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.TransitionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.TransitionType
   * @see #setType(TransitionType)
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getTransition_Type()
   * @model
   * @generated
   */
  TransitionType getType();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.TransitionType
   * @see #getType()
   * @generated
   */
  void setType(TransitionType value);

  /**
   * Returns the value of the '<em><b>Target State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target State</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target State</em>' reference.
   * @see #setTargetState(State)
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getTransition_TargetState()
   * @model
   * @generated
   */
  State getTargetState();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getTargetState <em>Target State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target State</em>' reference.
   * @see #getTargetState()
   * @generated
   */
  void setTargetState(State value);

  /**
   * Returns the value of the '<em><b>Is History</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is History</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is History</em>' attribute.
   * @see #setIsHistory(boolean)
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getTransition_IsHistory()
   * @model
   * @generated
   */
  boolean isIsHistory();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#isIsHistory <em>Is History</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is History</em>' attribute.
   * @see #isIsHistory()
   * @generated
   */
  void setIsHistory(boolean value);

} // Transition
