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
 *   <li>{@link de.cau.cs.kieler.synccharts.Action#getEffects <em>Effects</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Action#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Action#getTriggersAndEffects <em>Triggers And Effects</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Action#getParentStateEntryAction <em>Parent State Entry Action</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Action#getParentStateInnerAction <em>Parent State Inner Action</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Action#getParentStateExitAction <em>Parent State Exit Action</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Action#getDelay <em>Delay</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Action#isIsImmediate <em>Is Immediate</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Action#getParentStateSuspension <em>Parent State Suspension</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
    /**
     * Returns the value of the '<em><b>Effects</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.synccharts.Effect}.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.Effect#getParentEAction <em>Parent EAction</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Effects</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Effects</em>' containment reference list.
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getAction_Effects()
     * @see de.cau.cs.kieler.synccharts.Effect#getParentEAction
     * @model opposite="parentEAction" containment="true"
     * @generated
     */
    EList<Effect> getEffects();

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

    /**
     * Returns the value of the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delay</em>' attribute.
     * @see #setDelay(int)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getAction_Delay()
     * @model
     * @generated
     */
    int getDelay();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Action#getDelay <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delay</em>' attribute.
     * @see #getDelay()
     * @generated
     */
    void setDelay(int value);

    /**
     * Returns the value of the '<em><b>Is Immediate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Immediate</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Immediate</em>' attribute.
     * @see #setIsImmediate(boolean)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getAction_IsImmediate()
     * @model
     * @generated
     */
    boolean isIsImmediate();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Action#isIsImmediate <em>Is Immediate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Immediate</em>' attribute.
     * @see #isIsImmediate()
     * @generated
     */
    void setIsImmediate(boolean value);

    /**
     * Returns the value of the '<em><b>Parent State Suspension</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.State#getSuspensionTrigger <em>Suspension Trigger</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent State Suspension</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent State Suspension</em>' container reference.
     * @see #setParentStateSuspension(State)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getAction_ParentStateSuspension()
     * @see de.cau.cs.kieler.synccharts.State#getSuspensionTrigger
     * @model opposite="suspensionTrigger" required="true" transient="false"
     * @generated
     */
    State getParentStateSuspension();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Action#getParentStateSuspension <em>Parent State Suspension</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent State Suspension</em>' container reference.
     * @see #getParentStateSuspension()
     * @generated
     */
    void setParentStateSuspension(State value);

} // Action
