/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.retypingSynccharts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getSourceStateName <em>Source State Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getTransitionType <em>Transition Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getTargetStateName <em>Target State Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getDeclaredTargetState <em>Declared Target State</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getTransitionLabel <em>Transition Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject
{
  /**
   * Returns the value of the '<em><b>Source State Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source State Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source State Name</em>' attribute.
   * @see #setSourceStateName(String)
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getTransition_SourceStateName()
   * @model
   * @generated
   */
  String getSourceStateName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getSourceStateName <em>Source State Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source State Name</em>' attribute.
   * @see #getSourceStateName()
   * @generated
   */
  void setSourceStateName(String value);

  /**
   * Returns the value of the '<em><b>Transition Type</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.TransitionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transition Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transition Type</em>' attribute.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.TransitionType
   * @see #setTransitionType(TransitionType)
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getTransition_TransitionType()
   * @model
   * @generated
   */
  TransitionType getTransitionType();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getTransitionType <em>Transition Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transition Type</em>' attribute.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.TransitionType
   * @see #getTransitionType()
   * @generated
   */
  void setTransitionType(TransitionType value);

  /**
   * Returns the value of the '<em><b>Target State Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target State Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target State Name</em>' attribute.
   * @see #setTargetStateName(String)
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getTransition_TargetStateName()
   * @model
   * @generated
   */
  String getTargetStateName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getTargetStateName <em>Target State Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target State Name</em>' attribute.
   * @see #getTargetStateName()
   * @generated
   */
  void setTargetStateName(String value);

  /**
   * Returns the value of the '<em><b>Declared Target State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declared Target State</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declared Target State</em>' containment reference.
   * @see #setDeclaredTargetState(State)
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getTransition_DeclaredTargetState()
   * @model containment="true"
   * @generated
   */
  State getDeclaredTargetState();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getDeclaredTargetState <em>Declared Target State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declared Target State</em>' containment reference.
   * @see #getDeclaredTargetState()
   * @generated
   */
  void setDeclaredTargetState(State value);

  /**
   * Returns the value of the '<em><b>Transition Label</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transition Label</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transition Label</em>' reference.
   * @see #setTransitionLabel(Action)
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getTransition_TransitionLabel()
   * @model
   * @generated
   */
  Action getTransitionLabel();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition#getTransitionLabel <em>Transition Label</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transition Label</em>' reference.
   * @see #getTransitionLabel()
   * @generated
   */
  void setTransitionLabel(Action value);

} // Transition
