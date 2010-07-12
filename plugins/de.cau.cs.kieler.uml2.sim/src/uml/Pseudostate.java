/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudostate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A pseudostate is an abstraction that encompasses different types of transient vertices in the state machine graph.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Pseudostate#getKind <em>Kind</em>}</li>
 *   <li>{@link uml.Pseudostate#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link uml.Pseudostate#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getPseudostate()
 * @model
 * @generated
 */
public interface Pseudostate extends Vertex {
    /**
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The default value is <code>"initial"</code>.
     * The literals are from the enumeration {@link uml.PseudostateKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Determines the precise type of the Pseudostate and can be one of: entryPoint, exitPoint, initial, deepHistory, shallowHistory, join, fork, junction, terminate or choice.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see uml.PseudostateKind
     * @see #setKind(PseudostateKind)
     * @see uml.UmlPackage#getPseudostate_Kind()
     * @model default="initial" required="true" ordered="false"
     * @generated
     */
    PseudostateKind getKind();

    /**
     * Sets the value of the '{@link uml.Pseudostate#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see uml.PseudostateKind
     * @see #getKind()
     * @generated
     */
    void setKind(PseudostateKind value);

    /**
     * Returns the value of the '<em><b>State Machine</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link uml.StateMachine#getConnectionPoint <em>Connection Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The StateMachine in which this Pseudostate is defined. This only applies to Pseudostates of the kind entryPoint or exitPoint.
     * <!-- end-model-doc -->
     * @return the value of the '<em>State Machine</em>' container reference.
     * @see #setStateMachine(StateMachine)
     * @see uml.UmlPackage#getPseudostate_StateMachine()
     * @see uml.StateMachine#getConnectionPoint
     * @model opposite="connectionPoint" transient="false" ordered="false"
     * @generated
     */
    StateMachine getStateMachine();

    /**
     * Sets the value of the '{@link uml.Pseudostate#getStateMachine <em>State Machine</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>State Machine</em>' container reference.
     * @see #getStateMachine()
     * @generated
     */
    void setStateMachine(StateMachine value);

    /**
     * Returns the value of the '<em><b>State</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link uml.State#getConnectionPoint <em>Connection Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The State that owns this pseudostate and in which it appears.
     * <!-- end-model-doc -->
     * @return the value of the '<em>State</em>' container reference.
     * @see #setState(State)
     * @see uml.UmlPackage#getPseudostate_State()
     * @see uml.State#getConnectionPoint
     * @model opposite="connectionPoint" transient="false" ordered="false"
     * @generated
     */
    State getState();

    /**
     * Sets the value of the '{@link uml.Pseudostate#getState <em>State</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>State</em>' container reference.
     * @see #getState()
     * @generated
     */
    void setState(State value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * An initial vertex can have at most one outgoing transition.
     * (self.kind = #initial) implies (self.outgoing->size <= 1)
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean initial_vertex(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * History vertices can have at most one outgoing transition.
     * ((self.kind = #deepHistory) or (self.kind = #shallowHistory)) implies
     * (self.outgoing->size <= 1)
     * 
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean history_vertices(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * In a complete statemachine, a join vertex must have at least two incoming transitions and exactly one outgoing transition.
     * (self.kind = #join) implies
     * ((self.outgoing->size = 1) and (self.incoming->size >= 2))
     * 
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean join_vertex(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * All transitions incoming a join vertex must originate in different regions of an orthogonal state.
     * (self.kind = #join) implies
     *   self.incoming->forAll (t1, t2 | t1<>t2 implies
     *     (self.stateMachine.LCA(t1.source, t2.source).container.isOrthogonal))
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean transitions_incoming(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * In a complete statemachine, a fork vertex must have at least two outgoing transitions and exactly one incoming transition.
     * (self.kind = #fork) implies
     * ((self.incoming->size = 1) and (self.outgoing->size >= 2))
     * 
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean fork_vertex(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * All transitions outgoing a fork vertex must target states in different regions of an orthogonal state.
     * (self.kind = #fork) implies
     *   self.outgoing->forAll (t1, t2 | t1<>t2 implies
     *     (self.stateMachine.LCA(t1.target, t2.target).container.isOrthogonal))
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean transitions_outgoing(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * In a complete statemachine, a junction vertex must have at least one incoming and one outgoing transition.
     * (self.kind = #junction) implies
     * ((self.incoming->size >= 1) and (self.outgoing->size >= 1))
     * 
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean junction_vertex(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * In a complete statemachine, a choice vertex must have at least one incoming and one outgoing transition.
     * (self.kind = #choice) implies
     * ((self.incoming->size >= 1) and (self.outgoing->size >= 1))
     * 
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean choice_vertex(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The outgoing transition from and initial vertex may have a behavior, but not a trigger or a guard.
     * (self.kind = #initial) implies (self.outgoing.guard->isEmpty()
     *   and self.outgoing.trigger->isEmpty())
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean outgoing_from_initial(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Pseudostate
