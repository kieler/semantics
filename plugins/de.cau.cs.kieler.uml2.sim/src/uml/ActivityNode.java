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
 * A representation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ActivityNode is an abstract class for points in the flow of an activity connected by edges.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.ActivityNode#getInStructuredNode <em>In Structured Node</em>}</li>
 *   <li>{@link uml.ActivityNode#getActivity <em>Activity</em>}</li>
 *   <li>{@link uml.ActivityNode#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link uml.ActivityNode#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link uml.ActivityNode#getInPartition <em>In Partition</em>}</li>
 *   <li>{@link uml.ActivityNode#getInInterruptibleRegion <em>In Interruptible Region</em>}</li>
 *   <li>{@link uml.ActivityNode#getInGroup <em>In Group</em>}</li>
 *   <li>{@link uml.ActivityNode#getRedefinedNode <em>Redefined Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getActivityNode()
 * @model abstract="true"
 * @generated
 */
public interface ActivityNode extends RedefinableElement {
	/**
	 * Returns the value of the '<em><b>In Structured Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.StructuredActivityNode#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structured activity node containing the node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Structured Node</em>' container reference.
	 * @see #setInStructuredNode(StructuredActivityNode)
	 * @see uml.UmlPackage#getActivityNode_InStructuredNode()
	 * @see uml.StructuredActivityNode#getNode
	 * @model opposite="node" transient="false" ordered="false"
	 * @generated
	 */
	StructuredActivityNode getInStructuredNode();

	/**
	 * Sets the value of the '{@link uml.ActivityNode#getInStructuredNode <em>In Structured Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Structured Node</em>' container reference.
	 * @see #getInStructuredNode()
	 * @generated
	 */
	void setInStructuredNode(StructuredActivityNode value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.Activity#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activity containing the node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity</em>' container reference.
	 * @see #setActivity(Activity)
	 * @see uml.UmlPackage#getActivityNode_Activity()
	 * @see uml.Activity#getNode
	 * @model opposite="node" transient="false" ordered="false"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link uml.ActivityNode#getActivity <em>Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' container reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link uml.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link uml.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Edges that have the node as source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see uml.UmlPackage#getActivityNode_Outgoing()
	 * @see uml.ActivityEdge#getSource
	 * @model opposite="source" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link uml.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link uml.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Edges that have the node as target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see uml.UmlPackage#getActivityNode_Incoming()
	 * @see uml.ActivityEdge#getTarget
	 * @model opposite="target" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getIncoming();

	/**
	 * Returns the value of the '<em><b>In Partition</b></em>' reference list.
	 * The list contents are of type {@link uml.ActivityPartition}.
	 * It is bidirectional and its opposite is '{@link uml.ActivityPartition#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Partitions containing the node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Partition</em>' reference list.
	 * @see uml.UmlPackage#getActivityNode_InPartition()
	 * @see uml.ActivityPartition#getNode
	 * @model opposite="node" ordered="false"
	 * @generated
	 */
	EList<ActivityPartition> getInPartition();

	/**
	 * Returns the value of the '<em><b>In Interruptible Region</b></em>' reference list.
	 * The list contents are of type {@link uml.InterruptibleActivityRegion}.
	 * It is bidirectional and its opposite is '{@link uml.InterruptibleActivityRegion#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Interruptible regions containing the node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Interruptible Region</em>' reference list.
	 * @see uml.UmlPackage#getActivityNode_InInterruptibleRegion()
	 * @see uml.InterruptibleActivityRegion#getNode
	 * @model opposite="node" ordered="false"
	 * @generated
	 */
	EList<InterruptibleActivityRegion> getInInterruptibleRegion();

	/**
	 * Returns the value of the '<em><b>In Group</b></em>' reference list.
	 * The list contents are of type {@link uml.ActivityGroup}.
	 * It is bidirectional and its opposite is '{@link uml.ActivityGroup#getContainedNode <em>Contained Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Groups containing the node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Group</em>' reference list.
	 * @see uml.UmlPackage#getActivityNode_InGroup()
	 * @see uml.ActivityGroup#getContainedNode
	 * @model opposite="containedNode" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ActivityGroup> getInGroup();

	/**
	 * Returns the value of the '<em><b>Redefined Node</b></em>' reference list.
	 * The list contents are of type {@link uml.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inherited nodes replaced by this node in a specialization of the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Node</em>' reference list.
	 * @see uml.UmlPackage#getActivityNode_RedefinedNode()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ActivityNode> getRedefinedNode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activity nodes may be owned by at most one structured node.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean owned_structured_node(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activity nodes can only be owned by activities or groups.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean owned(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ActivityNode
