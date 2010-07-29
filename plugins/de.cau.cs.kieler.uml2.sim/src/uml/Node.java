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
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A node is computational resource upon which artifacts may be deployed for execution.
 * Nodes can be interconnected through communication paths to define network structures.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Node#getNestedNode <em>Nested Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends uml.Class, DeploymentTarget {
	/**
	 * Returns the value of the '<em><b>Nested Node</b></em>' containment reference list.
	 * The list contents are of type {@link uml.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Nodes that are defined (nested) within the Node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Node</em>' containment reference list.
	 * @see uml.UmlPackage#getNode_NestedNode()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Node> getNestedNode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The internal structure of a Node (if defined) consists solely of parts of type Node.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean internal_structure(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a (binary) communication path between this node and the specified other node, with the specified navigabilities, aggregations, names, lower bounds, and upper bounds, and owned by this node's nearest package.
	 * @param end1IsNavigable The navigability for the first end of the new communication path.
	 * @param end1Aggregation The aggregation for the first end of the new communication path.
	 * @param end1Name The name for the first end of the new communication path.
	 * @param end1Lower The lower bound for the first end of the new communication path.
	 * @param end1Upper The upper bound for the first end of the new communication path.
	 * @param end1Node The type for the first end of the new communication path.
	 * @param end2IsNavigable The navigability for the second end of the new communication path.
	 * @param end2Aggregation The aggregation for the second end of the new communication path.
	 * @param end2Name The name for the second end of the new communication path.
	 * @param end2Lower The lower bound for the second end of the new communication path.
	 * @param end2Upper The upper bound for the second end of the new communication path.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" end1IsNavigableDataType="uml.Boolean" end1IsNavigableRequired="true" end1IsNavigableOrdered="false" end1AggregationRequired="true" end1AggregationOrdered="false" end1NameDataType="uml.String" end1NameRequired="true" end1NameOrdered="false" end1LowerDataType="uml.Integer" end1LowerRequired="true" end1LowerOrdered="false" end1UpperDataType="uml.UnlimitedNatural" end1UpperRequired="true" end1UpperOrdered="false" end1NodeRequired="true" end1NodeOrdered="false" end2IsNavigableDataType="uml.Boolean" end2IsNavigableRequired="true" end2IsNavigableOrdered="false" end2AggregationRequired="true" end2AggregationOrdered="false" end2NameDataType="uml.String" end2NameRequired="true" end2NameOrdered="false" end2LowerDataType="uml.Integer" end2LowerRequired="true" end2LowerOrdered="false" end2UpperDataType="uml.UnlimitedNatural" end2UpperRequired="true" end2UpperOrdered="false"
	 * @generated
	 */
	CommunicationPath createCommunicationPath(boolean end1IsNavigable, AggregationKind end1Aggregation, String end1Name, int end1Lower, int end1Upper, Node end1Node, boolean end2IsNavigable, AggregationKind end2Aggregation, String end2Name, int end2Lower, int end2Upper);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the communication paths in which this node is involved.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<CommunicationPath> getCommunicationPaths();

} // Node
