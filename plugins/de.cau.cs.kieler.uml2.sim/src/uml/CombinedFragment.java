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
 * A representation of the model object '<em><b>Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A combined fragment defines an expression of interaction fragments. A combined fragment is defined by an interaction operator and corresponding interaction operands. Through the use of combined fragments the user will be able to describe a number of traces in a compact and concise manner.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.CombinedFragment#getInteractionOperator <em>Interaction Operator</em>}</li>
 *   <li>{@link uml.CombinedFragment#getOperand <em>Operand</em>}</li>
 *   <li>{@link uml.CombinedFragment#getCfragmentGate <em>Cfragment Gate</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getCombinedFragment()
 * @model
 * @generated
 */
public interface CombinedFragment extends InteractionFragment {
    /**
     * Returns the value of the '<em><b>Interaction Operator</b></em>' attribute.
     * The default value is <code>"seq"</code>.
     * The literals are from the enumeration {@link uml.InteractionOperatorKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies the operation which defines the semantics of this combination of InteractionFragments.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Interaction Operator</em>' attribute.
     * @see uml.InteractionOperatorKind
     * @see #setInteractionOperator(InteractionOperatorKind)
     * @see uml.UmlPackage#getCombinedFragment_InteractionOperator()
     * @model default="seq" required="true" ordered="false"
     * @generated
     */
    InteractionOperatorKind getInteractionOperator();

    /**
     * Sets the value of the '{@link uml.CombinedFragment#getInteractionOperator <em>Interaction Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interaction Operator</em>' attribute.
     * @see uml.InteractionOperatorKind
     * @see #getInteractionOperator()
     * @generated
     */
    void setInteractionOperator(InteractionOperatorKind value);

    /**
     * Returns the value of the '<em><b>Operand</b></em>' containment reference list.
     * The list contents are of type {@link uml.InteractionOperand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The set of operands of the combined fragment.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Operand</em>' containment reference list.
     * @see uml.UmlPackage#getCombinedFragment_Operand()
     * @model containment="true" required="true"
     * @generated
     */
    EList<InteractionOperand> getOperand();

    /**
     * Returns the value of the '<em><b>Cfragment Gate</b></em>' containment reference list.
     * The list contents are of type {@link uml.Gate}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies the gates that form the interface between this CombinedFragment and its surroundings
     * <!-- end-model-doc -->
     * @return the value of the '<em>Cfragment Gate</em>' containment reference list.
     * @see uml.UmlPackage#getCombinedFragment_CfragmentGate()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Gate> getCfragmentGate();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If the interactionOperator is opt, loop, break, or neg there must be exactly one operand
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean opt_loop_break_neg(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The InteractionConstraint with minint and maxint only apply when attached to an InteractionOperand where the interactionOperator is loop.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean minint_and_maxint(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If the interactionOperator is break, the corresponding InteractionOperand must cover all Lifelines within the enclosing InteractionFragment.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean break_(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The interaction operators 'consider' and 'ignore' can only be used for the CombineIgnoreFragment subtype of CombinedFragment
     * ((interactionOperator = #consider) or (interactionOperator = #ignore)) implies oclsisTypeOf(CombineIgnoreFragment)
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean consider_and_ignore(DiagnosticChain diagnostics, Map<Object, Object> context);

} // CombinedFragment
