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
 * A representation of the model object '<em><b>State Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getEntryActions <em>Entry Actions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getInnerAction <em>Inner Action</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getExitActions <em>Exit Actions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getSuspensionTrigger <em>Suspension Trigger</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getSignals <em>Signals</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getNewStateID <em>New State ID</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getReferencedState <em>Referenced State</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getSignalRenamings <em>Signal Renamings</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getStateContent()
 * @model
 * @generated
 */
public interface StateContent extends EObject
{
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
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getStateContent_EntryActions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getEntryActions();

  /**
   * Returns the value of the '<em><b>Inner Action</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inner Action</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inner Action</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getStateContent_InnerAction()
   * @model containment="true"
   * @generated
   */
  EList<Action> getInnerAction();

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
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getStateContent_ExitActions()
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
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getStateContent_SuspensionTrigger()
   * @model containment="true"
   * @generated
   */
  Action getSuspensionTrigger();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getSuspensionTrigger <em>Suspension Trigger</em>}' containment reference.
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
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getStateContent_Signals()
   * @model containment="true"
   * @generated
   */
  EList<Signal> getSignals();

  /**
   * Returns the value of the '<em><b>New State ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New State ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New State ID</em>' attribute.
   * @see #setNewStateID(String)
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getStateContent_NewStateID()
   * @model
   * @generated
   */
  String getNewStateID();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getNewStateID <em>New State ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New State ID</em>' attribute.
   * @see #getNewStateID()
   * @generated
   */
  void setNewStateID(String value);

  /**
   * Returns the value of the '<em><b>Referenced State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referenced State</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referenced State</em>' attribute.
   * @see #setReferencedState(String)
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getStateContent_ReferencedState()
   * @model
   * @generated
   */
  String getReferencedState();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getReferencedState <em>Referenced State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Referenced State</em>' attribute.
   * @see #getReferencedState()
   * @generated
   */
  void setReferencedState(String value);

  /**
   * Returns the value of the '<em><b>Signal Renamings</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.SignalRenaming}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signal Renamings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signal Renamings</em>' containment reference list.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage#getStateContent_SignalRenamings()
   * @model containment="true"
   * @generated
   */
  EList<SignalRenaming> getSignalRenamings();

} // StateContent
