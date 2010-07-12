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
 * A representation of the model object '<em><b>Template Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A template binding represents a relationship between a templateable element and a template. A template binding specifies the substitutions of actual parameters for the formal parameters of the template.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.TemplateBinding#getSignature <em>Signature</em>}</li>
 *   <li>{@link uml.TemplateBinding#getParameterSubstitution <em>Parameter Substitution</em>}</li>
 *   <li>{@link uml.TemplateBinding#getBoundElement <em>Bound Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getTemplateBinding()
 * @model
 * @generated
 */
public interface TemplateBinding extends DirectedRelationship {
    /**
     * Returns the value of the '<em><b>Signature</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The template signature for the template that is the target of the binding.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Signature</em>' reference.
     * @see #setSignature(TemplateSignature)
     * @see uml.UmlPackage#getTemplateBinding_Signature()
     * @model required="true" ordered="false"
     * @generated
     */
    TemplateSignature getSignature();

    /**
     * Sets the value of the '{@link uml.TemplateBinding#getSignature <em>Signature</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Signature</em>' reference.
     * @see #getSignature()
     * @generated
     */
    void setSignature(TemplateSignature value);

    /**
     * Returns the value of the '<em><b>Parameter Substitution</b></em>' containment reference list.
     * The list contents are of type {@link uml.TemplateParameterSubstitution}.
     * It is bidirectional and its opposite is '{@link uml.TemplateParameterSubstitution#getTemplateBinding <em>Template Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The parameter substitutions owned by this template binding.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Parameter Substitution</em>' containment reference list.
     * @see uml.UmlPackage#getTemplateBinding_ParameterSubstitution()
     * @see uml.TemplateParameterSubstitution#getTemplateBinding
     * @model opposite="templateBinding" containment="true" ordered="false"
     * @generated
     */
    EList<TemplateParameterSubstitution> getParameterSubstitution();

    /**
     * Returns the value of the '<em><b>Bound Element</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link uml.TemplateableElement#getTemplateBinding <em>Template Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The element that is bound by this binding.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bound Element</em>' container reference.
     * @see #setBoundElement(TemplateableElement)
     * @see uml.UmlPackage#getTemplateBinding_BoundElement()
     * @see uml.TemplateableElement#getTemplateBinding
     * @model opposite="templateBinding" required="true" transient="false" ordered="false"
     * @generated
     */
    TemplateableElement getBoundElement();

    /**
     * Sets the value of the '{@link uml.TemplateBinding#getBoundElement <em>Bound Element</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bound Element</em>' container reference.
     * @see #getBoundElement()
     * @generated
     */
    void setBoundElement(TemplateableElement value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Each parameter substitution must refer to a formal template parameter of the target template signature.
     * parameterSubstitution->forAll(b | template.parameter->includes(b.formal))
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean parameter_substitution_formal(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A binding contains at most one parameter substitution for each formal template parameter of the target template signature.
     * template.parameter->forAll(p | parameterSubstitution->select(b | b.formal = p)->size() <= 1)
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean one_parameter_substitution(DiagnosticChain diagnostics, Map<Object, Object> context);

} // TemplateBinding
