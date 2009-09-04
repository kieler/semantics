/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.kits_textonly;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getLabel <em>Label</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getBodyText <em>Body Text</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getEntryActions <em>Entry Actions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getInnerActions <em>Inner Actions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getExitActions <em>Exit Actions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getSuspensionTrigger <em>Suspension Trigger</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getSignals <em>Signals</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getRegions <em>Regions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Kits_textonlyPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject
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
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Kits_textonlyPackage#getState_IsInitial()
   * @model
   * @generated
   */
  boolean isIsInitial();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#isIsInitial <em>Is Initial</em>}' attribute.
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
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Kits_textonlyPackage#getState_IsFinal()
   * @model
   * @generated
   */
  boolean isIsFinal();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#isIsFinal <em>Is Final</em>}' attribute.
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
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Kits_textonlyPackage#getState_Type()
   * @model
   * @generated
   */
  StateType getType();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getType <em>Type</em>}' attribute.
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
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Kits_textonlyPackage#getState_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Kits_textonlyPackage#getState_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Body Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body Text</em>' attribute.
   * @see #setBodyText(String)
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Kits_textonlyPackage#getState_BodyText()
   * @model
   * @generated
   */
  String getBodyText();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getBodyText <em>Body Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body Text</em>' attribute.
   * @see #getBodyText()
   * @generated
   */
  void setBodyText(String value);

  /**
   * Returns the value of the '<em><b>Entry Actions</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entry Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entry Actions</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Kits_textonlyPackage#getState_EntryActions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getEntryActions();

  /**
   * Returns the value of the '<em><b>Inner Actions</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inner Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inner Actions</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Kits_textonlyPackage#getState_InnerActions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getInnerActions();

  /**
   * Returns the value of the '<em><b>Exit Actions</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exit Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exit Actions</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Kits_textonlyPackage#getState_ExitActions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getExitActions();

  /**
   * Returns the value of the '<em><b>Suspension Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Suspension Trigger</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Suspension Trigger</em>' containment reference.
   * @see #setSuspensionTrigger(Action)
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Kits_textonlyPackage#getState_SuspensionTrigger()
   * @model containment="true"
   * @generated
   */
  Action getSuspensionTrigger();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.State#getSuspensionTrigger <em>Suspension Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Suspension Trigger</em>' containment reference.
   * @see #getSuspensionTrigger()
   * @generated
   */
  void setSuspensionTrigger(Action value);

  /**
   * Returns the value of the '<em><b>Signals</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Signal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signals</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Kits_textonlyPackage#getState_Signals()
   * @model containment="true"
   * @generated
   */
  EList<Signal> getSignals();

  /**
   * Returns the value of the '<em><b>Regions</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.synccharts.dsl.kits_textonly.Region}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Regions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Regions</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.dsl.kits_textonly.Kits_textonlyPackage#getState_Regions()
   * @model containment="true"
   * @generated
   */
  EList<Region> getRegions();

} // State
