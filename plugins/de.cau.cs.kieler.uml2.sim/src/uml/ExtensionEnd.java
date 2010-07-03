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
 * A representation of the model object '<em><b>Extension End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An extension end is used to tie an extension to a stereotype when extending a metaclass.
 * The default multiplicity of an extension end is 0..1.
 * <!-- end-model-doc -->
 *
 *
 * @see uml.UmlPackage#getExtensionEnd()
 * @model
 * @generated
 */
public interface ExtensionEnd extends Property {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The multiplicity of ExtensionEnd is 0..1 or 1.
     * (self->lowerBound() = 0 or self->lowerBound() = 1) and self->upperBound() = 1
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean multiplicity(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The aggregation of an ExtensionEnd is composite.
     * self.aggregation = #composite
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean aggregation(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ExtensionEnd
