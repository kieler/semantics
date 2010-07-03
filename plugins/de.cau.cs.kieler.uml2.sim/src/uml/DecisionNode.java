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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A decision node has one incoming edge.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean one_incoming_edge(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A decision input behavior has zero or one input parameter and one output parameter. Any input parameter must be the same as or a supertype of the type of object tokens coming along the incoming edge. The behavior cannot have side effects.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean input_parameter(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The edges coming into and out of a decision node must be either all object flows or all control flows.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean edges(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DecisionNode
