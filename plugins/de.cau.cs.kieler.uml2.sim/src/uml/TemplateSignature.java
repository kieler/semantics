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
 * A representation of the model object '<em><b>Template Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A template signature bundles the set of formal template parameters for a templated element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.TemplateSignature#getParameter <em>Parameter</em>}</li>
 *   <li>{@link uml.TemplateSignature#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link uml.TemplateSignature#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getTemplateSignature()
 * @model
 * @generated
 */
public interface TemplateSignature extends Element {
    /**
     * Returns the value of the '<em><b>Parameter</b></em>' reference list.
     * The list contents are of type {@link uml.TemplateParameter}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The ordered set of all formal template parameters for this template signature.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Parameter</em>' reference list.
     * @see uml.UmlPackage#getTemplateSignature_Parameter()
     * @model required="true"
     * @generated
     */
    EList<TemplateParameter> getParameter();

    /**
     * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
     * The list contents are of type {@link uml.TemplateParameter}.
     * It is bidirectional and its opposite is '{@link uml.TemplateParameter#getSignature <em>Signature</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The formal template parameters that are owned by this template signature.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Owned Parameter</em>' containment reference list.
     * @see uml.UmlPackage#getTemplateSignature_OwnedParameter()
     * @see uml.TemplateParameter#getSignature
     * @model opposite="signature" containment="true"
     * @generated
     */
    EList<TemplateParameter> getOwnedParameter();

    /**
     * Returns the value of the '<em><b>Template</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link uml.TemplateableElement#getOwnedTemplateSignature <em>Owned Template Signature</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The element that owns this template signature.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Template</em>' container reference.
     * @see #setTemplate(TemplateableElement)
     * @see uml.UmlPackage#getTemplateSignature_Template()
     * @see uml.TemplateableElement#getOwnedTemplateSignature
     * @model opposite="ownedTemplateSignature" required="true" transient="false" ordered="false"
     * @generated
     */
    TemplateableElement getTemplate();

    /**
     * Sets the value of the '{@link uml.TemplateSignature#getTemplate <em>Template</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Template</em>' container reference.
     * @see #getTemplate()
     * @generated
     */
    void setTemplate(TemplateableElement value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Parameters must own the elements they parameter or those elements must be owned by the element being templated.
     * templatedElement.ownedElement->includesAll(parameter.parameteredElement - parameter.ownedParameteredElement)
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean own_elements(DiagnosticChain diagnostics, Map<Object, Object> context);

} // TemplateSignature
