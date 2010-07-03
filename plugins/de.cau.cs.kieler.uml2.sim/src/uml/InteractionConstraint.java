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
 * A representation of the model object '<em><b>Interaction Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interaction constraint is a Boolean expression that guards an operand in a combined fragment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.InteractionConstraint#getMinint <em>Minint</em>}</li>
 *   <li>{@link uml.InteractionConstraint#getMaxint <em>Maxint</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getInteractionConstraint()
 * @model
 * @generated
 */
public interface InteractionConstraint extends Constraint {
    /**
     * Returns the value of the '<em><b>Minint</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The minimum number of iterations of a loop
     * <!-- end-model-doc -->
     * @return the value of the '<em>Minint</em>' containment reference.
     * @see #setMinint(ValueSpecification)
     * @see uml.UmlPackage#getInteractionConstraint_Minint()
     * @model containment="true" ordered="false"
     * @generated
     */
    ValueSpecification getMinint();

    /**
     * Sets the value of the '{@link uml.InteractionConstraint#getMinint <em>Minint</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Minint</em>' containment reference.
     * @see #getMinint()
     * @generated
     */
    void setMinint(ValueSpecification value);

    /**
     * Returns the value of the '<em><b>Maxint</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The maximum number of iterations of a loop
     * <!-- end-model-doc -->
     * @return the value of the '<em>Maxint</em>' containment reference.
     * @see #setMaxint(ValueSpecification)
     * @see uml.UmlPackage#getInteractionConstraint_Maxint()
     * @model containment="true" ordered="false"
     * @generated
     */
    ValueSpecification getMaxint();

    /**
     * Sets the value of the '{@link uml.InteractionConstraint#getMaxint <em>Maxint</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Maxint</em>' containment reference.
     * @see #getMaxint()
     * @generated
     */
    void setMaxint(ValueSpecification value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The dynamic variables that take part in the constraint must be owned by the ConnectableElement corresponding to the covered Lifeline.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean dynamic_variables(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The constraint may contain references to global data or write-once data.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean global_data(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minint/maxint can only be present if the InteractionConstraint is associated with the operand of a loop CombinedFragment.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean minint_maxint(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If minint is specified, then the expression must evaluate to a non-negative integer.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean minint_non_negative(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If maxint is specified, then the expression must evaluate to a positive integer.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean maxint_positive(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If maxint is specified, then minint must be specified and the evaluation of maxint must be >= the evaluation of minint
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean maxint_greater_equal_minint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // InteractionConstraint
