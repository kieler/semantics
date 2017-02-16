/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Transition represents a connection between two {@link State}s and the
 * shift from the source to the target State. In sccharts Transitions may
 * only be specified between States on the same Regions. Inter-level
 * Transitions are not allowed.
 * <p>
 * A Transition is an {@link Action} and therefore may contain a trigger condition
 * which guards the Transition and effects that get executed when the transition
 * is taken.
 * <p>
 * Transitions have an integer priority. If there are multiple outgoing 
 * transitions of a States and multiple triggers are evaluated to true, then
 * the transition with lowest priority is taken.
 * <p>
 * A history transition will enter its source state in its containing Regions at the states that
 * it has left them before. So it does not start at the initial states in all circumstances but
 * in the states that the source state was left in some earlier tick. Only when a State is entered
 * for the first time (i.e. there is no history) then it is always entered in its initial States.
 * <p>
 * A transition has a type {@link TransitionType}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.Transition#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.Transition#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.Transition#isDeferred <em>Deferred</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.Transition#getHistory <em>History</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.Transition#getTargetState <em>Target State</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.Transition#getSourceState <em>Source State</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends Action {
    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\r\n\r\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\r\n\r\nCopyright 2013 by\r\n+ Kiel University\r\n  + Department of Computer Science\r\n    + Real-Time and Embedded Systems Group\r\n\r\nThis code is provided under the terms of the Eclipse Public License (EPL).\r\nSee the file epl-v10.html for the license text.";

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
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getTransition_Priority()
     * @model transient="true"
     * @generated
     */
    int getPriority();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.Transition#getPriority <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Priority</em>' attribute.
     * @see #getPriority()
     * @generated
     */
    void setPriority(int value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.sccharts.TransitionType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see de.cau.cs.kieler.sccharts.TransitionType
     * @see #setType(TransitionType)
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getTransition_Type()
     * @model required="true"
     * @generated
     */
    TransitionType getType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.Transition#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see de.cau.cs.kieler.sccharts.TransitionType
     * @see #getType()
     * @generated
     */
    void setType(TransitionType value);

    /**
     * Returns the value of the '<em><b>Deferred</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Deferred</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Deferred</em>' attribute.
     * @see #setDeferred(boolean)
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getTransition_Deferred()
     * @model
     * @generated
     */
    boolean isDeferred();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.Transition#isDeferred <em>Deferred</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Deferred</em>' attribute.
     * @see #isDeferred()
     * @generated
     */
    void setDeferred(boolean value);

    /**
     * Returns the value of the '<em><b>History</b></em>' attribute.
     * The literals are from the enumeration {@link de.cau.cs.kieler.sccharts.HistoryType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>History</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>History</em>' attribute.
     * @see de.cau.cs.kieler.sccharts.HistoryType
     * @see #setHistory(HistoryType)
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getTransition_History()
     * @model
     * @generated
     */
    HistoryType getHistory();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.Transition#getHistory <em>History</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>History</em>' attribute.
     * @see de.cau.cs.kieler.sccharts.HistoryType
     * @see #getHistory()
     * @generated
     */
    void setHistory(HistoryType value);

    /**
     * Returns the value of the '<em><b>Target State</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.sccharts.State#getIncomingTransitions <em>Incoming Transitions</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target State</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target State</em>' reference.
     * @see #setTargetState(State)
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getTransition_TargetState()
     * @see de.cau.cs.kieler.sccharts.State#getIncomingTransitions
     * @model opposite="incomingTransitions" required="true"
     * @generated
     */
    State getTargetState();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.Transition#getTargetState <em>Target State</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target State</em>' reference.
     * @see #getTargetState()
     * @generated
     */
    void setTargetState(State value);

    /**
     * Returns the value of the '<em><b>Source State</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.cau.cs.kieler.sccharts.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source State</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source State</em>' container reference.
     * @see #setSourceState(State)
     * @see de.cau.cs.kieler.sccharts.SCChartsPackage#getTransition_SourceState()
     * @see de.cau.cs.kieler.sccharts.State#getOutgoingTransitions
     * @model opposite="outgoingTransitions" required="true" transient="false"
     * @generated
     */
    State getSourceState();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.sccharts.Transition#getSourceState <em>Source State</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source State</em>' container reference.
     * @see #getSourceState()
     * @generated
     */
    void setSourceState(State value);

} // Transition
