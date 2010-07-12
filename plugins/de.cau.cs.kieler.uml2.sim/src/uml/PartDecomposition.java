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
 * A representation of the model object '<em><b>Part Decomposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A part decomposition is a description of the internal interactions of one lifeline relative to an interaction.
 * <!-- end-model-doc -->
 *
 *
 * @see uml.UmlPackage#getPartDecomposition()
 * @model
 * @generated
 */
public interface PartDecomposition extends InteractionUse {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * PartDecompositions apply only to Parts that are Parts of Internal Structures not to Parts of Collaborations.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean parts_of_internal_structures(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Assume that within Interaction X, Lifeline L is of class C and decomposed to D. Within X there is a sequence of constructs along L (such constructs are CombinedFragments, InteractionUse and (plain) OccurrenceSpecifications). Then a corresponding sequence of constructs must appear within D, matched one-to-one in the same order.
     * 
     * i) CombinedFragment covering L are matched with an extra-global CombinedFragment in D
     * ii) An InteractionUse covering L are matched with a global (i.e. covering all Lifelines) InteractionUse in D.
     * iii) A plain OccurrenceSpecification on L is considered an actualGate that must be matched by a formalGate of D
     * 
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean assume(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Assume that within Interaction X, Lifeline L is of class C and decomposed to D. Assume also that there is within X an
     * InteractionUse (say) U that covers L. According to the constraint above U will have a counterpart CU within D. Within the Interaction referenced by U, L should also be decomposed, and the decomposition should reference CU. (This rule is called commutativity of decomposition)
     * 
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean commutativity_of_decomposition(DiagnosticChain diagnostics, Map<Object, Object> context);

} // PartDecomposition
