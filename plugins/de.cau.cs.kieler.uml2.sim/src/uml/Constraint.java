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
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A constraint is a condition or restriction expressed in natural language text or in a machine readable language for the purpose of declaring some of the semantics of an element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Constraint#getConstrainedElement <em>Constrained Element</em>}</li>
 *   <li>{@link uml.Constraint#getSpecification <em>Specification</em>}</li>
 *   <li>{@link uml.Constraint#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends PackageableElement {
    /**
     * Returns the value of the '<em><b>Constrained Element</b></em>' reference list.
     * The list contents are of type {@link uml.Element}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The ordered set of Elements referenced by this Constraint.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Constrained Element</em>' reference list.
     * @see uml.UmlPackage#getConstraint_ConstrainedElement()
     * @model
     * @generated
     */
    EList<Element> getConstrainedElement();

    /**
     * Returns the value of the '<em><b>Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A condition that must be true when evaluated in order for the constraint to be satisfied.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Specification</em>' containment reference.
     * @see #setSpecification(ValueSpecification)
     * @see uml.UmlPackage#getConstraint_Specification()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    ValueSpecification getSpecification();

    /**
     * Sets the value of the '{@link uml.Constraint#getSpecification <em>Specification</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Specification</em>' containment reference.
     * @see #getSpecification()
     * @generated
     */
    void setSpecification(ValueSpecification value);

    /**
     * Returns the value of the '<em><b>Context</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link uml.Namespace#getOwnedRule <em>Owned Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies the namespace that owns the NamedElement.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Context</em>' container reference.
     * @see #setContext(Namespace)
     * @see uml.UmlPackage#getConstraint_Context()
     * @see uml.Namespace#getOwnedRule
     * @model opposite="ownedRule" transient="false" ordered="false"
     * @generated
     */
    Namespace getContext();

    /**
     * Sets the value of the '{@link uml.Constraint#getContext <em>Context</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Context</em>' container reference.
     * @see #getContext()
     * @generated
     */
    void setContext(Namespace value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A constraint cannot be applied to itself.
     * not constrainedElement->includes(self)
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean not_apply_to_self(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The value specification for a constraint must evaluate to a Boolean value.
     * self.specification().booleanValue().isOclKindOf(Boolean)
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean value_specification_boolean(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The value specification for a constraint must evaluate to a Boolean value.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean boolean_value(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Evaluating the value specification for a constraint must not have side effects.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean no_side_effects(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A constraint cannot be applied to itself.
     * not constrainedElement->includes(self)
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean not_applied_to_self(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Constraint
