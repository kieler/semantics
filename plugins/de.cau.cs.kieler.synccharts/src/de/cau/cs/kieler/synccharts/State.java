/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts;

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
 *   <li>{@link de.cau.cs.kieler.synccharts.State#getStateKind <em>State Kind</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.State#getStateFlag <em>State Flag</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.State#getSignals <em>Signals</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.State#getRegions <em>Regions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.State#getEntryActions <em>Entry Actions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.State#getInnerActions <em>Inner Actions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.State#getExitActions <em>Exit Actions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.State#getSignalRenamings <em>Signal Renamings</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.State#getSuspensionTrigger <em>Suspension Trigger</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.State#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.State#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.State#getParentRegion <em>Parent Region</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.State#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>State Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cau.cs.kieler.synccharts.StateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Kind</em>' attribute.
	 * @see de.cau.cs.kieler.synccharts.StateKind
	 * @see #setStateKind(StateKind)
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getState_StateKind()
	 * @model required="true"
	 * @generated
	 */
	StateKind getStateKind();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.State#getStateKind <em>State Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Kind</em>' attribute.
	 * @see de.cau.cs.kieler.synccharts.StateKind
	 * @see #getStateKind()
	 * @generated
	 */
	void setStateKind(StateKind value);

	/**
	 * Returns the value of the '<em><b>State Flag</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cau.cs.kieler.synccharts.StateFlag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Flag</em>' attribute.
	 * @see de.cau.cs.kieler.synccharts.StateFlag
	 * @see #setStateFlag(StateFlag)
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getState_StateFlag()
	 * @model required="true"
	 * @generated
	 */
	StateFlag getStateFlag();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.State#getStateFlag <em>State Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Flag</em>' attribute.
	 * @see de.cau.cs.kieler.synccharts.StateFlag
	 * @see #getStateFlag()
	 * @generated
	 */
	void setStateFlag(StateFlag value);

	/**
	 * Returns the value of the '<em><b>Signals</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.synccharts.Signal}.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Signal#getParentState <em>Parent State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signals</em>' containment reference list.
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getState_Signals()
	 * @see de.cau.cs.kieler.synccharts.Signal#getParentState
	 * @model opposite="parentState" containment="true"
	 * @generated
	 */
	EList<Signal> getSignals();

	/**
	 * Returns the value of the '<em><b>Regions</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.synccharts.Region}.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Region#getParentState <em>Parent State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regions</em>' containment reference list.
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getState_Regions()
	 * @see de.cau.cs.kieler.synccharts.Region#getParentState
	 * @model opposite="parentState" containment="true"
	 * @generated
	 */
	EList<Region> getRegions();

	/**
	 * Returns the value of the '<em><b>Entry Actions</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.synccharts.Action}.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Action#getParentStateEntryAction <em>Parent State Entry Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Actions</em>' containment reference list.
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getState_EntryActions()
	 * @see de.cau.cs.kieler.synccharts.Action#getParentStateEntryAction
	 * @model opposite="parentStateEntryAction" containment="true"
	 * @generated
	 */
	EList<Action> getEntryActions();

	/**
	 * Returns the value of the '<em><b>Inner Actions</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.synccharts.Action}.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Action#getParentStateInnerAction <em>Parent State Inner Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Actions</em>' containment reference list.
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getState_InnerActions()
	 * @see de.cau.cs.kieler.synccharts.Action#getParentStateInnerAction
	 * @model opposite="parentStateInnerAction" containment="true"
	 * @generated
	 */
	EList<Action> getInnerActions();

	/**
	 * Returns the value of the '<em><b>Exit Actions</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.synccharts.Action}.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Action#getParentStateExitAction <em>Parent State Exit Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Actions</em>' containment reference list.
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getState_ExitActions()
	 * @see de.cau.cs.kieler.synccharts.Action#getParentStateExitAction
	 * @model opposite="parentStateExitAction" containment="true"
	 * @generated
	 */
	EList<Action> getExitActions();

	/**
	 * Returns the value of the '<em><b>Signal Renamings</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.synccharts.SignalRenaming}.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.SignalRenaming#getParentState <em>Parent State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal Renamings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Renamings</em>' containment reference list.
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getState_SignalRenamings()
	 * @see de.cau.cs.kieler.synccharts.SignalRenaming#getParentState
	 * @model opposite="parentState" containment="true"
	 * @generated
	 */
	EList<SignalRenaming> getSignalRenamings();

	/**
	 * Returns the value of the '<em><b>Suspension Trigger</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.SuspensionTrigger#getParentState <em>Parent State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suspension Trigger</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suspension Trigger</em>' containment reference.
	 * @see #setSuspensionTrigger(SuspensionTrigger)
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getState_SuspensionTrigger()
	 * @see de.cau.cs.kieler.synccharts.SuspensionTrigger#getParentState
	 * @model opposite="parentState" containment="true"
	 * @generated
	 */
	SuspensionTrigger getSuspensionTrigger();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.State#getSuspensionTrigger <em>Suspension Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suspension Trigger</em>' containment reference.
	 * @see #getSuspensionTrigger()
	 * @generated
	 */
	void setSuspensionTrigger(SuspensionTrigger value);

	/**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.synccharts.Transition}.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Transition#getSourceState <em>Source State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' containment reference list.
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getState_OutgoingTransitions()
	 * @see de.cau.cs.kieler.synccharts.Transition#getSourceState
	 * @model opposite="sourceState" containment="true"
	 * @generated
	 */
	EList<Transition> getOutgoingTransitions();

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
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getState_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent Region</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Region#getInnerStates <em>Inner States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Region</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Region</em>' container reference.
	 * @see #setParentRegion(Region)
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getState_ParentRegion()
	 * @see de.cau.cs.kieler.synccharts.Region#getInnerStates
	 * @model opposite="innerStates" required="true" transient="false"
	 * @generated
	 */
	Region getParentRegion();

	/**
	 * Sets the value of the '{@link de.cau.cs.kieler.synccharts.State#getParentRegion <em>Parent Region</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Region</em>' container reference.
	 * @see #getParentRegion()
	 * @generated
	 */
	void setParentRegion(Region value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.synccharts.Variable}.
	 * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Variable#getParentState <em>Parent State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getState_Variables()
	 * @see de.cau.cs.kieler.synccharts.Variable#getParentState
	 * @model opposite="parentState" containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

} // State
