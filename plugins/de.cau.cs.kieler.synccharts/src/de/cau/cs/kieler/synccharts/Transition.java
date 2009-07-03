/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.Transition#getDelay <em>Delay</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Transition#isImmediate <em>Immediate</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Transition#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Transition#getTransitionKind <em>Transition Kind</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Transition#getTargetState <em>Target State</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Transition#getSourceState <em>Source State</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.Transition#isHistory <em>History</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends Action {
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
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getTransition_Delay()
     * @model
     * @generated
     */
	int getDelay();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Transition#getDelay <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delay</em>' attribute.
     * @see #getDelay()
     * @generated
     */
	void setDelay(int value);

	/**
     * Returns the value of the '<em><b>Immediate</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Immediate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Immediate</em>' attribute.
     * @see #setImmediate(boolean)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getTransition_Immediate()
     * @model required="true"
     * @generated
     */
	boolean isImmediate();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Transition#isImmediate <em>Immediate</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Immediate</em>' attribute.
     * @see #isImmediate()
     * @generated
     */
	void setImmediate(boolean value);

	/**
     * Returns the value of the '<em><b>Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Priority</em>' attribute.
     * @see #setPriority(int)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getTransition_Priority()
     * @model
     * @generated
     */
	int getPriority();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Transition#getPriority <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Priority</em>' attribute.
     * @see #getPriority()
     * @generated
     */
	void setPriority(int value);

	/**
     * Returns the value of the '<em><b>Transition Kind</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.synccharts.TransitionKind}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Transition Kind</em>' attribute.
     * @see de.cau.cs.kieler.synccharts.TransitionKind
     * @see #setTransitionKind(TransitionKind)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getTransition_TransitionKind()
     * @model required="true"
     * @generated
     */
	TransitionKind getTransitionKind();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Transition#getTransitionKind <em>Transition Kind</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transition Kind</em>' attribute.
     * @see de.cau.cs.kieler.synccharts.TransitionKind
     * @see #getTransitionKind()
     * @generated
     */
	void setTransitionKind(TransitionKind value);

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
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getTransition_TargetState()
     * @model required="true"
     * @generated
     */
	State getTargetState();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Transition#getTargetState <em>Target State</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target State</em>' reference.
     * @see #getTargetState()
     * @generated
     */
	void setTargetState(State value);

	/**
     * Returns the value of the '<em><b>Source State</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.synccharts.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source State</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Source State</em>' container reference.
     * @see #setSourceState(State)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getTransition_SourceState()
     * @see de.cau.cs.kieler.synccharts.State#getOutgoingTransitions
     * @model opposite="outgoingTransitions" required="true" transient="false"
     * @generated
     */
	State getSourceState();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Transition#getSourceState <em>Source State</em>}' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source State</em>' container reference.
     * @see #getSourceState()
     * @generated
     */
	void setSourceState(State value);

	/**
     * Returns the value of the '<em><b>History</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>History</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>History</em>' attribute.
     * @see #setHistory(boolean)
     * @see de.cau.cs.kieler.synccharts.SyncchartsPackage#getTransition_History()
     * @model
     * @generated
     */
	boolean isHistory();

	/**
     * Sets the value of the '{@link de.cau.cs.kieler.synccharts.Transition#isHistory <em>History</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>History</em>' attribute.
     * @see #isHistory()
     * @generated
     */
	void setHistory(boolean value);

} // Transition
