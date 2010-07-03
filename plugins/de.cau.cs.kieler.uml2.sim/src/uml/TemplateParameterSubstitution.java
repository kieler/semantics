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
 * A representation of the model object '<em><b>Template Parameter Substitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A template parameter substitution relates the actual parameter(s) to a formal template parameter as part of a template binding.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.TemplateParameterSubstitution#getFormal <em>Formal</em>}</li>
 *   <li>{@link uml.TemplateParameterSubstitution#getActual <em>Actual</em>}</li>
 *   <li>{@link uml.TemplateParameterSubstitution#getOwnedActual <em>Owned Actual</em>}</li>
 *   <li>{@link uml.TemplateParameterSubstitution#getTemplateBinding <em>Template Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getTemplateParameterSubstitution()
 * @model
 * @generated
 */
public interface TemplateParameterSubstitution extends Element {
    /**
     * Returns the value of the '<em><b>Formal</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The formal template parameter that is associated with this substitution.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Formal</em>' reference.
     * @see #setFormal(TemplateParameter)
     * @see uml.UmlPackage#getTemplateParameterSubstitution_Formal()
     * @model required="true" ordered="false"
     * @generated
     */
    TemplateParameter getFormal();

    /**
     * Sets the value of the '{@link uml.TemplateParameterSubstitution#getFormal <em>Formal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Formal</em>' reference.
     * @see #getFormal()
     * @generated
     */
    void setFormal(TemplateParameter value);

    /**
     * Returns the value of the '<em><b>Actual</b></em>' reference list.
     * The list contents are of type {@link uml.ParameterableElement}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The elements that are the actual parameters for this substitution.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Actual</em>' reference list.
     * @see uml.UmlPackage#getTemplateParameterSubstitution_Actual()
     * @model required="true" ordered="false"
     * @generated
     */
    EList<ParameterableElement> getActual();

    /**
     * Returns the value of the '<em><b>Owned Actual</b></em>' containment reference list.
     * The list contents are of type {@link uml.ParameterableElement}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The actual parameters that are owned by this substitution.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Owned Actual</em>' containment reference list.
     * @see uml.UmlPackage#getTemplateParameterSubstitution_OwnedActual()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<ParameterableElement> getOwnedActual();

    /**
     * Returns the value of the '<em><b>Template Binding</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link uml.TemplateBinding#getParameterSubstitution <em>Parameter Substitution</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The optional bindings from this element to templates.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Template Binding</em>' container reference.
     * @see #setTemplateBinding(TemplateBinding)
     * @see uml.UmlPackage#getTemplateParameterSubstitution_TemplateBinding()
     * @see uml.TemplateBinding#getParameterSubstitution
     * @model opposite="parameterSubstitution" required="true" transient="false" ordered="false"
     * @generated
     */
    TemplateBinding getTemplateBinding();

    /**
     * Sets the value of the '{@link uml.TemplateParameterSubstitution#getTemplateBinding <em>Template Binding</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Template Binding</em>' container reference.
     * @see #getTemplateBinding()
     * @generated
     */
    void setTemplateBinding(TemplateBinding value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The actual parameter must be compatible with the formal template parameter, e.g. the actual parameter for a class template parameter must be a class.
     * actual->forAll(a | a.isCompatibleWith(formal.parameteredElement))
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean must_be_compatible(DiagnosticChain diagnostics, Map<Object, Object> context);

} // TemplateParameterSubstitution
