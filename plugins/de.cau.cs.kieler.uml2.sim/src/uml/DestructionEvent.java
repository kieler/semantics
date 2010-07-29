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
 * A representation of the model object '<em><b>Destruction Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A destruction event models the destruction of an object.
 * <!-- end-model-doc -->
 *
 *
 * @see uml.UmlPackage#getDestructionEvent()
 * @model
 * @generated
 */
public interface DestructionEvent extends Event {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No other OccurrenceSpecifications may appear below an OccurrenceSpecification which references a DestructionEvent on a given Lifeline in an InteractionOperand.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean no_occurrence_specifications_below(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DestructionEvent
