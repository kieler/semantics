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
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.Action#getEmissions <em>Emissions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Action#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Action#getParentStateEntryAction <em>Parent State Entry Action</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Action#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Action#getTriggersAndEffects <em>Triggers And Effects</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Action#getParentStateInnerAction <em>Parent State Inner Action</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Action#getParentStateExitAction <em>Parent State Exit Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
     * Returns the value of the '<em><b>Emissions</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.synccharts.Emission}.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Emission#getParentAction <em>Parent Action</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emissions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Emissions</em>' containment reference list.
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getAction_Emissions()
     * @see de.cau.cs.kieler.synccharts.Emission#getParentAction
     * @model opposite="parentAction" containment="true"
     * @generated
     */
	EList<Emission> getEmissions();

	/**
     * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Expression#getParentAction <em>Parent Action</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Trigger</em>' containment reference.
     * @see #setTrigger(Expression)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getAction_Trigger()
     * @see de.cau.cs.kieler.synccharts.Expression#getParentAction
     * @model opposite="parentAction" containment="true"
     * @generated
     */
	Expression getTrigger();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Action#getTrigger <em>Trigger</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Trigger</em>' containment reference.
     * @see #getTrigger()
     * @generated
     */
	void setTrigger(Expression value);

	/**
     * Returns the value of the '<em><b>Parent State Entry Action</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.State#getEntryActions <em>Entry Actions</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent State Entry Action</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Parent State Entry Action</em>' container reference.
     * @see #setParentStateEntryAction(State)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getAction_ParentStateEntryAction()
     * @see de.cau.cs.kieler.synccharts.State#getEntryActions
     * @model opposite="entryActions" required="true" transient="false"
     * @generated
     */
	State getParentStateEntryAction();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Action#getParentStateEntryAction <em>Parent State Entry Action</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent State Entry Action</em>' container reference.
     * @see #getParentStateEntryAction()
     * @generated
     */
	void setParentStateEntryAction(State value);

	/**
     * Returns the value of the '<em><b>Assignments</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.synccharts.Assignment}.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Assignment#getParentAction <em>Parent Action</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Assignments</em>' containment reference list.
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getAction_Assignments()
     * @see de.cau.cs.kieler.synccharts.Assignment#getParentAction
     * @model opposite="parentAction" containment="true"
     * @generated
     */
	EList<Assignment> getAssignments();

	/**
     * Returns the value of the '<em><b>Triggers And Effects</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers And Effects</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Triggers And Effects</em>' attribute.
     * @see #setTriggersAndEffects(String)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getAction_TriggersAndEffects()
     * @model required="true"
     * @generated
     */
	String getTriggersAndEffects();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Action#getTriggersAndEffects <em>Triggers And Effects</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Triggers And Effects</em>' attribute.
     * @see #getTriggersAndEffects()
     * @generated
     */
	void setTriggersAndEffects(String value);

	/**
     * Returns the value of the '<em><b>Parent State Inner Action</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.State#getInnerActions <em>Inner Actions</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent State Inner Action</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Parent State Inner Action</em>' container reference.
     * @see #setParentStateInnerAction(State)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getAction_ParentStateInnerAction()
     * @see de.cau.cs.kieler.synccharts.State#getInnerActions
     * @model opposite="innerActions" required="true" transient="false"
     * @generated
     */
	State getParentStateInnerAction();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Action#getParentStateInnerAction <em>Parent State Inner Action</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent State Inner Action</em>' container reference.
     * @see #getParentStateInnerAction()
     * @generated
     */
	void setParentStateInnerAction(State value);

	/**
     * Returns the value of the '<em><b>Parent State Exit Action</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.State#getExitActions <em>Exit Actions</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent State Exit Action</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Parent State Exit Action</em>' container reference.
     * @see #setParentStateExitAction(State)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getAction_ParentStateExitAction()
     * @see de.cau.cs.kieler.synccharts.State#getExitActions
     * @model opposite="exitActions" required="true" transient="false"
     * @generated
     */
	State getParentStateExitAction();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Action#getParentStateExitAction <em>Parent State Exit Action</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent State Exit Action</em>' container reference.
     * @see #getParentStateExitAction()
     * @generated
     */
	void setParentStateExitAction(State value);

} // Action
