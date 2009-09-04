/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.kits_textonly;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.TransitionState#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.TransitionState#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.TransitionState#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.TransitionState#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Kits_textonlyPackage#getTransitionState()
 * @model
 * @generated
 */
public interface TransitionState extends EObject
{
  /**
   * Returns the value of the '<em><b>Is Initial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Initial</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Initial</em>' attribute.
   * @see #setIsInitial(boolean)
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Kits_textonlyPackage#getTransitionState_IsInitial()
   * @model
   * @generated
   */
  boolean isIsInitial();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.TransitionState#isIsInitial <em>Is Initial</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Initial</em>' attribute.
   * @see #isIsInitial()
   * @generated
   */
  void setIsInitial(boolean value);

  /**
   * Returns the value of the '<em><b>Is Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Final</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Final</em>' attribute.
   * @see #setIsFinal(boolean)
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Kits_textonlyPackage#getTransitionState_IsFinal()
   * @model
   * @generated
   */
  boolean isIsFinal();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.TransitionState#isIsFinal <em>Is Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Final</em>' attribute.
   * @see #isIsFinal()
   * @generated
   */
  void setIsFinal(boolean value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.StateType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.StateType
   * @see #setType(StateType)
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Kits_textonlyPackage#getTransitionState_Type()
   * @model
   * @generated
   */
  StateType getType();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.TransitionState#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.StateType
   * @see #getType()
   * @generated
   */
  void setType(StateType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Kits_textonlyPackage#getTransitionState_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.TransitionState#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // TransitionState
