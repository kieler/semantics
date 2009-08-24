/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.synccharts.dsl.retypingSynccharts;

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
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getId <em>Id</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getLabel <em>Label</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getSignalRenamings <em>Signal Renamings</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getBodyText <em>Body Text</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getEntryActions <em>Entry Actions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getInnerActions <em>Inner Actions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getExitActions <em>Exit Actions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getSuspensionTrigger <em>Suspension Trigger</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getSignals <em>Signals</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getRegions <em>Regions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getState()
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
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getState_IsInitial()
   * @model
   * @generated
   */
  boolean isIsInitial();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#isIsInitial <em>Is Initial</em>}' attribute.
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
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getState_IsFinal()
   * @model
   * @generated
   */
  boolean isIsFinal();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#isIsFinal <em>Is Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Final</em>' attribute.
   * @see #isIsFinal()
   * @generated
   */
  void setIsFinal(boolean value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateType
   * @see #setType(StateType)
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getState_Type()
   * @model
   * @generated
   */
  StateType getType();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateType
   * @see #getType()
   * @generated
   */
  void setType(StateType value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getState_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

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
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getState_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Signal Renamings</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Renaming}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signal Renamings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signal Renamings</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getState_SignalRenamings()
   * @model containment="true"
   * @generated
   */
  EList<Renaming> getSignalRenamings();

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
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getState_BodyText()
   * @model
   * @generated
   */
  String getBodyText();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getBodyText <em>Body Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body Text</em>' attribute.
   * @see #getBodyText()
   * @generated
   */
  void setBodyText(String value);

  /**
   * Returns the value of the '<em><b>Entry Actions</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entry Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entry Actions</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getState_EntryActions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getEntryActions();

  /**
   * Returns the value of the '<em><b>Inner Actions</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inner Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inner Actions</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getState_InnerActions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getInnerActions();

  /**
   * Returns the value of the '<em><b>Exit Actions</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exit Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exit Actions</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getState_ExitActions()
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
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getState_SuspensionTrigger()
   * @model containment="true"
   * @generated
   */
  Action getSuspensionTrigger();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getSuspensionTrigger <em>Suspension Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Suspension Trigger</em>' containment reference.
   * @see #getSuspensionTrigger()
   * @generated
   */
  void setSuspensionTrigger(Action value);

  /**
   * Returns the value of the '<em><b>Signals</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Signal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signals</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getState_Signals()
   * @model containment="true"
   * @generated
   */
  EList<Signal> getSignals();

  /**
   * Returns the value of the '<em><b>Regions</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Region}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Regions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Regions</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getState_Regions()
   * @model containment="true"
   * @generated
   */
  EList<Region> getRegions();

  /**
   * Returns the value of the '<em><b>Outgoing Transitions</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outgoing Transitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outgoing Transitions</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getState_OutgoingTransitions()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getOutgoingTransitions();

} // State
