/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A parameterable element is an element that can be exposed as a formal template parameter for a template, or specified as an actual parameter in a binding of a template.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.ParameterableElement#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link uml.ParameterableElement#getTemplateParameter <em>Template Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getParameterableElement()
 * @model abstract="true"
 * @generated
 */
public interface ParameterableElement extends Element {
    /**
     * Returns the value of the '<em><b>Owning Template Parameter</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link uml.TemplateParameter#getOwnedParameteredElement <em>Owned Parametered Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The formal template parameter that owns this element.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Owning Template Parameter</em>' container reference.
     * @see #setOwningTemplateParameter(TemplateParameter)
     * @see uml.UmlPackage#getParameterableElement_OwningTemplateParameter()
     * @see uml.TemplateParameter#getOwnedParameteredElement
     * @model opposite="ownedParameteredElement" transient="false" ordered="false"
     * @generated
     */
    TemplateParameter getOwningTemplateParameter();

    /**
     * Sets the value of the '{@link uml.ParameterableElement#getOwningTemplateParameter <em>Owning Template Parameter</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Owning Template Parameter</em>' container reference.
     * @see #getOwningTemplateParameter()
     * @generated
     */
    void setOwningTemplateParameter(TemplateParameter value);

    /**
     * Returns the value of the '<em><b>Template Parameter</b></em>' reference.
     * It is bidirectional and its opposite is '{@link uml.TemplateParameter#getParameteredElement <em>Parametered Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The template parameter that exposes this element as a formal parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Template Parameter</em>' reference.
     * @see #setTemplateParameter(TemplateParameter)
     * @see uml.UmlPackage#getParameterableElement_TemplateParameter()
     * @see uml.TemplateParameter#getParameteredElement
     * @model opposite="parameteredElement" ordered="false"
     * @generated
     */
    TemplateParameter getTemplateParameter();

    /**
     * Sets the value of the '{@link uml.ParameterableElement#getTemplateParameter <em>Template Parameter</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Template Parameter</em>' reference.
     * @see #getTemplateParameter()
     * @generated
     */
    void setTemplateParameter(TemplateParameter value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The query isCompatibleWith() determines if this parameterable element is compatible with the specified parameterable element. By default parameterable element P is compatible with parameterable element Q if the kind of P is the same or a subtype as the kind of Q. Subclasses should override this operation to specify different compatibility constraints.
     * result = p->oclIsKindOf(self.oclType)
     * <!-- end-model-doc -->
     * @model dataType="uml.Boolean" required="true" ordered="false" pRequired="true" pOrdered="false"
     * @generated
     */
    boolean isCompatibleWith(ParameterableElement p);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The query isTemplateParameter() determines if this parameterable element is exposed as a formal template parameter.
     * result = templateParameter->notEmpty()
     * <!-- end-model-doc -->
     * @model kind="operation" dataType="uml.Boolean" required="true" ordered="false"
     * @generated
     */
    boolean isTemplateParameter();

} // ParameterableElement
