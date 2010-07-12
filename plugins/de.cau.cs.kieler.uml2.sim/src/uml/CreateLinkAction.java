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
 * A representation of the model object '<em><b>Create Link Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A create link action is a write link action for creating links.
 * <!-- end-model-doc -->
 *
 *
 * @see uml.UmlPackage#getCreateLinkAction()
 * @model
 * @generated
 */
public interface CreateLinkAction extends WriteLinkAction {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The association cannot be an abstract classifier.
     * self.association().isAbstract = #false
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean association_not_abstract(DiagnosticChain diagnostics, Map<Object, Object> context);

} // CreateLinkAction
