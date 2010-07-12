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
 * A representation of the model object '<em><b>Executable Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An executable node is an abstract class for activity nodes that may be executed. It is used as an attachment point for exception handlers.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.ExecutableNode#getHandler <em>Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getExecutableNode()
 * @model abstract="true"
 * @generated
 */
public interface ExecutableNode extends ActivityNode {
    /**
     * Returns the value of the '<em><b>Handler</b></em>' containment reference list.
     * The list contents are of type {@link uml.ExceptionHandler}.
     * It is bidirectional and its opposite is '{@link uml.ExceptionHandler#getProtectedNode <em>Protected Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A set of exception handlers that are examined if an uncaught exception propagates to the outer level of the executable node.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Handler</em>' containment reference list.
     * @see uml.UmlPackage#getExecutableNode_Handler()
     * @see uml.ExceptionHandler#getProtectedNode
     * @model opposite="protectedNode" containment="true" ordered="false"
     * @generated
     */
    EList<ExceptionHandler> getHandler();

} // ExecutableNode
