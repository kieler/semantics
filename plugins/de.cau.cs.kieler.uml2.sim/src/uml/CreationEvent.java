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
 * A representation of the model object '<em><b>Creation Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A creation event models the creation of an object.
 * <!-- end-model-doc -->
 *
 *
 * @see uml.UmlPackage#getCreationEvent()
 * @model
 * @generated
 */
public interface CreationEvent extends Event {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * No othet OccurrenceSpecification may appear above an OccurrenceSpecification which references a CreationEvent on a given Lifeline in an InteractionOperand.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean no_occurrence_above(DiagnosticChain diagnostics, Map<Object, Object> context);

} // CreationEvent
