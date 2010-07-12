/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A sequence node is a structured activity node that executes its actions in order.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.SequenceNode#getExecutableNode <em>Executable Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getSequenceNode()
 * @model
 * @generated
 */
public interface SequenceNode extends StructuredActivityNode {
    /**
     * Returns the value of the '<em><b>Executable Node</b></em>' containment reference list.
     * The list contents are of type {@link uml.ExecutableNode}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * An ordered set of executable nodes.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Executable Node</em>' containment reference list.
     * @see uml.UmlPackage#getSequenceNode_ExecutableNode()
     * @model containment="true"
     * @generated
     */
    EList<ExecutableNode> getExecutableNode();

} // SequenceNode
