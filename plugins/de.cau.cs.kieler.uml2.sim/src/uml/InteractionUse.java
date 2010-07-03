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
 * A representation of the model object '<em><b>Interaction Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interaction use refers to an interaction. The interaction use is a shorthand for copying the contents of the referenced interaction where the interaction use is. To be accurate the copying must take into account substituting parameters with arguments and connect the formal gates with the actual ones.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.InteractionUse#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link uml.InteractionUse#getActualGate <em>Actual Gate</em>}</li>
 *   <li>{@link uml.InteractionUse#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getInteractionUse()
 * @model
 * @generated
 */
public interface InteractionUse extends InteractionFragment {
    /**
     * Returns the value of the '<em><b>Refers To</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Refers to the Interaction that defines its meaning
     * <!-- end-model-doc -->
     * @return the value of the '<em>Refers To</em>' reference.
     * @see #setRefersTo(Interaction)
     * @see uml.UmlPackage#getInteractionUse_RefersTo()
     * @model required="true" ordered="false"
     * @generated
     */
    Interaction getRefersTo();

    /**
     * Sets the value of the '{@link uml.InteractionUse#getRefersTo <em>Refers To</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To</em>' reference.
     * @see #getRefersTo()
     * @generated
     */
    void setRefersTo(Interaction value);

    /**
     * Returns the value of the '<em><b>Actual Gate</b></em>' containment reference list.
     * The list contents are of type {@link uml.Gate}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The actual gates of the InteractionUse
     * <!-- end-model-doc -->
     * @return the value of the '<em>Actual Gate</em>' containment reference list.
     * @see uml.UmlPackage#getInteractionUse_ActualGate()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Gate> getActualGate();

    /**
     * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
     * The list contents are of type {@link uml.Action}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The actual arguments of the Interaction
     * <!-- end-model-doc -->
     * @return the value of the '<em>Argument</em>' containment reference list.
     * @see uml.UmlPackage#getInteractionUse_Argument()
     * @model containment="true"
     * @generated
     */
    EList<Action> getArgument();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Actual Gates of the InteractionUse must match Formal Gates of the referred Interaction. Gates match when their names are equal.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean gates_match(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The InteractionUse must cover all Lifelines of the enclosing Interaction which appear within the referred Interaction.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean all_lifelines(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The arguments of the InteractionUse must correspond to parameters of the referred Interaction
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean arguments_correspond_to_parameters(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The arguments must only be constants, parameters of the enclosing Interaction or attributes of the classifier owning the enclosing Interaction.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean arguments_are_constants(DiagnosticChain diagnostics, Map<Object, Object> context);

} // InteractionUse
