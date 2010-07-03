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
 * A representation of the model object '<em><b>Activity Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ActivityGroup is an abstract class for defining sets of nodes and edges in an activity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.ActivityGroup#getSubgroup <em>Subgroup</em>}</li>
 *   <li>{@link uml.ActivityGroup#getSuperGroup <em>Super Group</em>}</li>
 *   <li>{@link uml.ActivityGroup#getInActivity <em>In Activity</em>}</li>
 *   <li>{@link uml.ActivityGroup#getContainedEdge <em>Contained Edge</em>}</li>
 *   <li>{@link uml.ActivityGroup#getContainedNode <em>Contained Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getActivityGroup()
 * @model abstract="true"
 * @generated
 */
public interface ActivityGroup extends Element {
    /**
     * Returns the value of the '<em><b>Subgroup</b></em>' reference list.
     * The list contents are of type {@link uml.ActivityGroup}.
     * It is bidirectional and its opposite is '{@link uml.ActivityGroup#getSuperGroup <em>Super Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Groups immediately contained in the group.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Subgroup</em>' reference list.
     * @see uml.UmlPackage#getActivityGroup_Subgroup()
     * @see uml.ActivityGroup#getSuperGroup
     * @model opposite="superGroup" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    EList<ActivityGroup> getSubgroup();

    /**
     * Returns the value of the '<em><b>Super Group</b></em>' reference.
     * It is bidirectional and its opposite is '{@link uml.ActivityGroup#getSubgroup <em>Subgroup</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Group immediately containing the group.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Super Group</em>' reference.
     * @see uml.UmlPackage#getActivityGroup_SuperGroup()
     * @see uml.ActivityGroup#getSubgroup
     * @model opposite="subgroup" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    ActivityGroup getSuperGroup();

    /**
     * Returns the value of the '<em><b>In Activity</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link uml.Activity#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Activity containing the group.
     * <!-- end-model-doc -->
     * @return the value of the '<em>In Activity</em>' container reference.
     * @see #setInActivity(Activity)
     * @see uml.UmlPackage#getActivityGroup_InActivity()
     * @see uml.Activity#getGroup
     * @model opposite="group" transient="false" ordered="false"
     * @generated
     */
    Activity getInActivity();

    /**
     * Sets the value of the '{@link uml.ActivityGroup#getInActivity <em>In Activity</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>In Activity</em>' container reference.
     * @see #getInActivity()
     * @generated
     */
    void setInActivity(Activity value);

    /**
     * Returns the value of the '<em><b>Contained Edge</b></em>' reference list.
     * The list contents are of type {@link uml.ActivityEdge}.
     * It is bidirectional and its opposite is '{@link uml.ActivityEdge#getInGroup <em>In Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Edges immediately contained in the group.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Contained Edge</em>' reference list.
     * @see uml.UmlPackage#getActivityGroup_ContainedEdge()
     * @see uml.ActivityEdge#getInGroup
     * @model opposite="inGroup" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    EList<ActivityEdge> getContainedEdge();

    /**
     * Returns the value of the '<em><b>Contained Node</b></em>' reference list.
     * The list contents are of type {@link uml.ActivityNode}.
     * It is bidirectional and its opposite is '{@link uml.ActivityNode#getInGroup <em>In Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nodes immediately contained in the group.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Contained Node</em>' reference list.
     * @see uml.UmlPackage#getActivityGroup_ContainedNode()
     * @see uml.ActivityNode#getInGroup
     * @model opposite="inGroup" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    EList<ActivityNode> getContainedNode();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * All nodes and edges of the group must be in the same activity as the group.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean nodes_and_edges(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * No node or edge in a group may be contained by its subgroups or its containing groups, transitively.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean not_contained(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Groups may only be owned by activities or groups.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean group_owned(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ActivityGroup
