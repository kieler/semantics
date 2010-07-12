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
 * A representation of the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A structured activity node is an executable activity node that may have an expansion into subordinate nodes as an activity group. The subordinate nodes must belong to only one structured activity node, although they may be nested.
 * Because of the concurrent nature of the execution of actions within and across activities, it can be difficult to guarantee the consistent access and modification of object memory. In order to avoid race conditions or other concurrency-related problems, it is sometimes necessary to isolate the effects of a group of actions from the effects of actions outside the group. This may be indicated by setting the mustIsolate attribute to true on a structured activity node. If a structured activity node is "isolated," then any object used by an action within the node cannot be accessed by any action outside the node until the structured activity node as a whole completes. Any concurrent actions that would result in accessing such objects are required to have their execution deferred until the completion of the node.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.StructuredActivityNode#getVariable <em>Variable</em>}</li>
 *   <li>{@link uml.StructuredActivityNode#getEdge <em>Edge</em>}</li>
 *   <li>{@link uml.StructuredActivityNode#isMustIsolate <em>Must Isolate</em>}</li>
 *   <li>{@link uml.StructuredActivityNode#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getStructuredActivityNode()
 * @model
 * @generated
 */
public interface StructuredActivityNode extends Action, Namespace, ActivityGroup {
    /**
     * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
     * The list contents are of type {@link uml.Variable}.
     * It is bidirectional and its opposite is '{@link uml.Variable#getScope <em>Scope</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A variable defined in the scope of the structured activity node. It has no value and may not be accessed
     * <!-- end-model-doc -->
     * @return the value of the '<em>Variable</em>' containment reference list.
     * @see uml.UmlPackage#getStructuredActivityNode_Variable()
     * @see uml.Variable#getScope
     * @model opposite="scope" containment="true" ordered="false"
     * @generated
     */
    EList<Variable> getVariable();

    /**
     * Returns the value of the '<em><b>Edge</b></em>' containment reference list.
     * The list contents are of type {@link uml.ActivityEdge}.
     * It is bidirectional and its opposite is '{@link uml.ActivityEdge#getInStructuredNode <em>In Structured Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Edges immediately contained in the structured node.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Edge</em>' containment reference list.
     * @see uml.UmlPackage#getStructuredActivityNode_Edge()
     * @see uml.ActivityEdge#getInStructuredNode
     * @model opposite="inStructuredNode" containment="true" ordered="false"
     * @generated
     */
    EList<ActivityEdge> getEdge();

    /**
     * Returns the value of the '<em><b>Must Isolate</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If true, then the actions in the node execute in isolation from actions outside the node.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Must Isolate</em>' attribute.
     * @see #setMustIsolate(boolean)
     * @see uml.UmlPackage#getStructuredActivityNode_MustIsolate()
     * @model default="false" dataType="uml.Boolean" required="true" ordered="false"
     * @generated
     */
    boolean isMustIsolate();

    /**
     * Sets the value of the '{@link uml.StructuredActivityNode#isMustIsolate <em>Must Isolate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Must Isolate</em>' attribute.
     * @see #isMustIsolate()
     * @generated
     */
    void setMustIsolate(boolean value);

    /**
     * Returns the value of the '<em><b>Node</b></em>' containment reference list.
     * The list contents are of type {@link uml.ActivityNode}.
     * It is bidirectional and its opposite is '{@link uml.ActivityNode#getInStructuredNode <em>In Structured Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nodes immediately contained in the group.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Node</em>' containment reference list.
     * @see uml.UmlPackage#getStructuredActivityNode_Node()
     * @see uml.ActivityNode#getInStructuredNode
     * @model opposite="inStructuredNode" containment="true" ordered="false"
     * @generated
     */
    EList<ActivityNode> getNode();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The edges owned by a structured node must have source and target nodes in the structured node, and vice versa.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean edges(DiagnosticChain diagnostics, Map<Object, Object> context);

} // StructuredActivityNode
