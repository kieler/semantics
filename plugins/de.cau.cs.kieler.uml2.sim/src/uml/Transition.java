/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A transition is a directed relationship between a source vertex and a target vertex. It may be part of a compound transition, which takes the state machine from one state configuration to another, representing the complete response of the state machine to an occurrence of an event of a particular type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Transition#getKind <em>Kind</em>}</li>
 *   <li>{@link uml.Transition#getContainer <em>Container</em>}</li>
 *   <li>{@link uml.Transition#getRedefinedTransition <em>Redefined Transition</em>}</li>
 *   <li>{@link uml.Transition#getGuard <em>Guard</em>}</li>
 *   <li>{@link uml.Transition#getEffect <em>Effect</em>}</li>
 *   <li>{@link uml.Transition#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link uml.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link uml.Transition#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends Namespace, RedefinableElement {
    /**
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The default value is <code>"external"</code>.
     * The literals are from the enumeration {@link uml.TransitionKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates  the precise type of the transition.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see uml.TransitionKind
     * @see #setKind(TransitionKind)
     * @see uml.UmlPackage#getTransition_Kind()
     * @model default="external" required="true" ordered="false"
     * @generated
     */
    TransitionKind getKind();

    /**
     * Sets the value of the '{@link uml.Transition#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see uml.TransitionKind
     * @see #getKind()
     * @generated
     */
    void setKind(TransitionKind value);

    /**
     * Returns the value of the '<em><b>Container</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link uml.Region#getTransition <em>Transition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Designates the region that owns this transition.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Container</em>' container reference.
     * @see #setContainer(Region)
     * @see uml.UmlPackage#getTransition_Container()
     * @see uml.Region#getTransition
     * @model opposite="transition" required="true" transient="false" ordered="false"
     * @generated
     */
    Region getContainer();

    /**
     * Sets the value of the '{@link uml.Transition#getContainer <em>Container</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Container</em>' container reference.
     * @see #getContainer()
     * @generated
     */
    void setContainer(Region value);

    /**
     * Returns the value of the '<em><b>Redefined Transition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The transition that is redefined by this transition.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Redefined Transition</em>' reference.
     * @see #setRedefinedTransition(Transition)
     * @see uml.UmlPackage#getTransition_RedefinedTransition()
     * @model ordered="false"
     * @generated
     */
    Transition getRedefinedTransition();

    /**
     * Sets the value of the '{@link uml.Transition#getRedefinedTransition <em>Redefined Transition</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Redefined Transition</em>' reference.
     * @see #getRedefinedTransition()
     * @generated
     */
    void setRedefinedTransition(Transition value);

    /**
     * Returns the value of the '<em><b>Guard</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A guard is a constraint that provides a fine-grained control over the firing of the transition. The guard is evaluated when an event occurrence is dispatched by the state machine. If the guard is true at that time, the transition may be enabled, otherwise, it is disabled. Guards should be pure expressions without side effects. Guard expressions with side effects are ill formed.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Guard</em>' reference.
     * @see #setGuard(Constraint)
     * @see uml.UmlPackage#getTransition_Guard()
     * @model ordered="false"
     * @generated
     */
    Constraint getGuard();

    /**
     * Sets the value of the '{@link uml.Transition#getGuard <em>Guard</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Guard</em>' reference.
     * @see #getGuard()
     * @generated
     */
    void setGuard(Constraint value);

    /**
     * Returns the value of the '<em><b>Effect</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies an optional behavior to be performed when the transition fires.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Effect</em>' containment reference.
     * @see #setEffect(Behavior)
     * @see uml.UmlPackage#getTransition_Effect()
     * @model containment="true" ordered="false"
     * @generated
     */
    Behavior getEffect();

    /**
     * Sets the value of the '{@link uml.Transition#getEffect <em>Effect</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Effect</em>' containment reference.
     * @see #getEffect()
     * @generated
     */
    void setEffect(Behavior value);

    /**
     * Returns the value of the '<em><b>Trigger</b></em>' containment reference list.
     * The list contents are of type {@link uml.Trigger}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies the triggers that may fire the transition.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Trigger</em>' containment reference list.
     * @see uml.UmlPackage#getTransition_Trigger()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Trigger> getTrigger();

    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Designates the target vertex that is reached when the transition is taken.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(Vertex)
     * @see uml.UmlPackage#getTransition_Target()
     * @model required="true" ordered="false"
     * @generated
     */
    Vertex getTarget();

    /**
     * Sets the value of the '{@link uml.Transition#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(Vertex value);

    /**
     * Returns the value of the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Designates the originating vertex (state or pseudostate) of the transition.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Source</em>' reference.
     * @see #setSource(Vertex)
     * @see uml.UmlPackage#getTransition_Source()
     * @model required="true" ordered="false"
     * @generated
     */
    Vertex getSource();

    /**
     * Sets the value of the '{@link uml.Transition#getSource <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' reference.
     * @see #getSource()
     * @generated
     */
    void setSource(Vertex value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A fork segment must not have guards or triggers.
     * (source.oclIsKindOf(Pseudostate) and source.kind = #fork) implies (guard->isEmpty() and trigger->isEmpty())
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean fork_segment_guards(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A join segment must not have guards or triggers.
     * (target.oclIsKindOf(Pseudostate) and target.kind = #join) implies (guard->isEmpty() and trigger->isEmpty())
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean join_segment_guards(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A fork segment must always target a state.
     * (source.oclIsKindOf(Pseudostate) and source.kind = #fork) implies (target.oclIsKindOf(State))
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean fork_segment_state(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A join segment must always originate from a state.
     * (target.oclIsKindOf(Pseudostate) and target.kind = #join) implies (source.oclIsKindOf(State))
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean join_segment_state(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Transitions outgoing pseudostates may not have a trigger.
     * source.oclIsKindOf(Pseudostate) and
     * ((source.kind <> #junction) and (source.kind <> #join) and (source.kind <> #initial)) implies trigger->isEmpty()
     * 
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean outgoing_pseudostates(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * An initial transition at the topmost level (region of a statemachine) either has no trigger or it has a trigger with the stereotype <<create>>.
     * self.source.oclIsKindOf(Pseudostate) implies
     * (self.source.oclAsType(Pseudostate).kind = #initial) implies
     * (self.source.container = self.stateMachine.top) implies
     * ((self.trigger->isEmpty) or
     * (self.trigger.stereotype.name = 'create'))
     * 
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean initial_transition(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * In case of more than one trigger, the signatures of these must be compatible in case the parameters of the signal are assigned to local variables/attributes.
     * 
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean signatures_compatible(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The redefinition context of a transition is the nearest containing statemachine.
     * result = let sm = containingStateMachine() in
     * if sm.context->isEmpty() or sm.general->notEmpty() then
     * sm
     * else
     * sm.context
     * endif
     * <!-- end-model-doc -->
     * @model required="true" ordered="false"
     * @generated
     */
    Classifier redefinitionContext();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The query containingStateMachine() returns the state machine that contains the transition either directly or transitively.
     * result = container.containingStateMachine()
     * <!-- end-model-doc -->
     * @model required="true" ordered="false"
     * @generated
     */
    StateMachine containingStateMachine();

} // Transition
