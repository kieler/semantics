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
 * A representation of the model object '<em><b>Decision Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A decision node is a control node that chooses between outgoing flows.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.DecisionNode#getDecisionInput <em>Decision Input</em>}</li>
 *   <li>{@link uml.DecisionNode#getDecisionInputFlow <em>Decision Input Flow</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getDecisionNode()
 * @model
 * @generated
 */
public interface DecisionNode extends ControlNode {
    /**
     * Returns the value of the '<em><b>Decision Input</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Provides input to guard specifications on edges outgoing from the decision node.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Decision Input</em>' reference.
     * @see #setDecisionInput(Behavior)
     * @see uml.UmlPackage#getDecisionNode_DecisionInput()
     * @model ordered="false"
     * @generated
     */
    Behavior getDecisionInput();

    /**
     * Sets the value of the '{@link uml.DecisionNode#getDecisionInput <em>Decision Input</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Decision Input</em>' reference.
     * @see #getDecisionInput()
     * @generated
     */
    void setDecisionInput(Behavior value);

    /**
     * Returns the value of the '<em><b>Decision Input Flow</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * An additional edge incoming to the decision node that provides a decision input value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Decision Input Flow</em>' reference.
     * @see #setDecisionInputFlow(ObjectFlow)
     * @see uml.UmlPackage#getDecisionNode_DecisionInputFlow()
     * @model ordered="false"
     * @generated
     */
    ObjectFlow getDecisionInputFlow();

    /**
     * Sets the value of the '{@link uml.DecisionNode#getDecisionInputFlow <em>Decision Input Flow</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Decision Input Flow</em>' reference.
     * @see #getDecisionInputFlow()
     * @generated
     */
    void setDecisionInputFlow(ObjectFlow value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A decision node has one or two incoming edges and at least one outgoing edge.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean incoming_outgoing_edges(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The edges coming into and out of a decision node, other than the decision input flow (if any), must be either all object flows or all control flows.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean edges(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The decisionInputFlow of a decision node must be an incoming edge of the decision node.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean decision_input_flow_incoming(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A decision input behavior has no output parameters, no in-out parameters and one return parameter.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean parameters(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If the decision node has no decision input flow and an incoming control flow, then a decision input behavior has zero input parameters.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean zero_input_parameters(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If the decision node has no decision input flow and an incoming object flow, then a decision input behavior has one input parameter whose type is the same as or a supertype of the type of object tokens offered on the incoming edge.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean incoming_object_one_input_parameter(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If the decision node has a decision input flow and an incoming control flow, then a decision input behavior has one input parameter whose type is the same as or a supertype of the type of object tokens offered on the decision input flow.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean incoming_control_one_input_parameter(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If the decision node has a decision input flow and an second incoming object flow, then a decision input behavior has two input parameters, the first of which has a type that is the same as or a supertype of the type of the type of object tokens offered on the nondecision input flow and the second of which has a type that is the same as or a supertype of the type of object tokens offered on the decision input flow.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean two_input_parameters(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DecisionNode
