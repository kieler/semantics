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
 * A representation of the model object '<em><b>Loop Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A loop node is a structured activity node that represents a loop with setup, test, and body sections.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.LoopNode#isIsTestedFirst <em>Is Tested First</em>}</li>
 *   <li>{@link uml.LoopNode#getBodyPart <em>Body Part</em>}</li>
 *   <li>{@link uml.LoopNode#getSetupPart <em>Setup Part</em>}</li>
 *   <li>{@link uml.LoopNode#getTest <em>Test</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getLoopNode()
 * @model
 * @generated
 */
public interface LoopNode extends StructuredActivityNode {
    /**
     * Returns the value of the '<em><b>Is Tested First</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If true, the test is performed before the first execution of the body.
     * If false, the body is executed once before the test is performed.
     * 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Is Tested First</em>' attribute.
     * @see #setIsTestedFirst(boolean)
     * @see uml.UmlPackage#getLoopNode_IsTestedFirst()
     * @model default="false" dataType="uml.Boolean" required="true" ordered="false"
     * @generated
     */
    boolean isIsTestedFirst();

    /**
     * Sets the value of the '{@link uml.LoopNode#isIsTestedFirst <em>Is Tested First</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Tested First</em>' attribute.
     * @see #isIsTestedFirst()
     * @generated
     */
    void setIsTestedFirst(boolean value);

    /**
     * Returns the value of the '<em><b>Body Part</b></em>' reference list.
     * The list contents are of type {@link uml.ExecutableNode}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The set of nodes and edges that perform the repetitive computations of the loop. The body section is executed as long as the test section produces a true value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Body Part</em>' reference list.
     * @see uml.UmlPackage#getLoopNode_BodyPart()
     * @model ordered="false"
     * @generated
     */
    EList<ExecutableNode> getBodyPart();

    /**
     * Returns the value of the '<em><b>Setup Part</b></em>' reference list.
     * The list contents are of type {@link uml.ExecutableNode}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The set of nodes and edges that initialize values or perform other setup computations for the loop.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Setup Part</em>' reference list.
     * @see uml.UmlPackage#getLoopNode_SetupPart()
     * @model ordered="false"
     * @generated
     */
    EList<ExecutableNode> getSetupPart();

    /**
     * Returns the value of the '<em><b>Test</b></em>' reference list.
     * The list contents are of type {@link uml.ExecutableNode}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The set of nodes, edges, and designated value that compute a Boolean value to determine if another execution of the body will be performed.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Test</em>' reference list.
     * @see uml.UmlPackage#getLoopNode_Test()
     * @model ordered="false"
     * @generated
     */
    EList<ExecutableNode> getTest();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Loop variable inputs must not have outgoing edges.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean input_edges(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The bodyOutput pins are output pins on actions in the body of the loop node.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean body_output_pins(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The result output pins have no incoming edges.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean result_no_incoming(DiagnosticChain diagnostics, Map<Object, Object> context);

} // LoopNode
