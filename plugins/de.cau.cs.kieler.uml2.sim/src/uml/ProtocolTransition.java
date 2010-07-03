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
 * A representation of the model object '<em><b>Protocol Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A protocol transition specifies a legal transition for an operation. Transitions of protocol state machines have the following information: a pre condition (guard), on trigger, and a post condition. Every protocol transition is associated to zero or one operation (referred BehavioralFeature) that belongs to the context classifier of the protocol state machine.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.ProtocolTransition#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link uml.ProtocolTransition#getReferred <em>Referred</em>}</li>
 *   <li>{@link uml.ProtocolTransition#getPreCondition <em>Pre Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getProtocolTransition()
 * @model
 * @generated
 */
public interface ProtocolTransition extends Transition {
    /**
     * Returns the value of the '<em><b>Post Condition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies the post condition of the transition which is the condition that should be obtained once the transition is triggered. This post condition is part of the post condition of the operation connected to the transition.
     * 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Post Condition</em>' reference.
     * @see #setPostCondition(Constraint)
     * @see uml.UmlPackage#getProtocolTransition_PostCondition()
     * @model ordered="false"
     * @generated
     */
    Constraint getPostCondition();

    /**
     * Sets the value of the '{@link uml.ProtocolTransition#getPostCondition <em>Post Condition</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Post Condition</em>' reference.
     * @see #getPostCondition()
     * @generated
     */
    void setPostCondition(Constraint value);

    /**
     * Returns the value of the '<em><b>Referred</b></em>' reference list.
     * The list contents are of type {@link uml.Operation}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This association refers to the associated operation. It is derived from the operation of the call trigger when applicable.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Referred</em>' reference list.
     * @see uml.UmlPackage#getProtocolTransition_Referred()
     * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    EList<Operation> getReferred();

    /**
     * Returns the value of the '<em><b>Pre Condition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies the precondition of the transition. It specifies the condition that should be verified before triggering the transition. This guard condition added to the source state will be evaluated as part of the precondition of the operation referred by the transition if any.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pre Condition</em>' reference.
     * @see #setPreCondition(Constraint)
     * @see uml.UmlPackage#getProtocolTransition_PreCondition()
     * @model ordered="false"
     * @generated
     */
    Constraint getPreCondition();

    /**
     * Sets the value of the '{@link uml.ProtocolTransition#getPreCondition <em>Pre Condition</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pre Condition</em>' reference.
     * @see #getPreCondition()
     * @generated
     */
    void setPreCondition(Constraint value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A protocol transition always belongs to a protocol state machine.
     * container.belongsToPSM()
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean belongs_to_psm(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A protocol transition never has associated actions.
     * effect->isEmpty()
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean associated_actions(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If a protocol transition refers to an operation (i. e. has a call trigger corresponding to an operation), then that operation should apply to the context classifier of the state machine of the protocol transition.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean refers_to_operation(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ProtocolTransition
