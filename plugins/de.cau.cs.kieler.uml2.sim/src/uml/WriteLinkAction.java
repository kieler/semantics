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
 * A representation of the model object '<em><b>Write Link Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * WriteLinkAction is an abstract class for link actions that create and destroy links.
 * <!-- end-model-doc -->
 *
 *
 * @see uml.UmlPackage#getWriteLinkAction()
 * @model abstract="true"
 * @generated
 */
public interface WriteLinkAction extends LinkAction {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The visibility of at least one end must allow access to the class using the action.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean allow_access(DiagnosticChain diagnostics, Map<Object, Object> context);

} // WriteLinkAction
