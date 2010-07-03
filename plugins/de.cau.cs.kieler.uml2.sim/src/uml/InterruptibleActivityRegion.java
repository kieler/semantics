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
 * A representation of the model object '<em><b>Interruptible Activity Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interruptible activity region is an activity group that supports termination of tokens flowing in the portions of an activity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.InterruptibleActivityRegion#getNode <em>Node</em>}</li>
 *   <li>{@link uml.InterruptibleActivityRegion#getInterruptingEdge <em>Interrupting Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getInterruptibleActivityRegion()
 * @model
 * @generated
 */
public interface InterruptibleActivityRegion extends ActivityGroup {
    /**
     * Returns the value of the '<em><b>Node</b></em>' reference list.
     * The list contents are of type {@link uml.ActivityNode}.
     * It is bidirectional and its opposite is '{@link uml.ActivityNode#getInInterruptibleRegion <em>In Interruptible Region</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nodes immediately contained in the group.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Node</em>' reference list.
     * @see uml.UmlPackage#getInterruptibleActivityRegion_Node()
     * @see uml.ActivityNode#getInInterruptibleRegion
     * @model opposite="inInterruptibleRegion" ordered="false"
     * @generated
     */
    EList<ActivityNode> getNode();

    /**
     * Returns the value of the '<em><b>Interrupting Edge</b></em>' reference list.
     * The list contents are of type {@link uml.ActivityEdge}.
     * It is bidirectional and its opposite is '{@link uml.ActivityEdge#getInterrupts <em>Interrupts</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The edges leaving the region that will abort other tokens flowing in the region.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Interrupting Edge</em>' reference list.
     * @see uml.UmlPackage#getInterruptibleActivityRegion_InterruptingEdge()
     * @see uml.ActivityEdge#getInterrupts
     * @model opposite="interrupts" ordered="false"
     * @generated
     */
    EList<ActivityEdge> getInterruptingEdge();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Interrupting edges of a region must have their source node in the region and their target node outside the region in the same activity containing the region.
     * 
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean interrupting_edges(DiagnosticChain diagnostics, Map<Object, Object> context);

} // InterruptibleActivityRegion
