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
 * A representation of the model object '<em><b>Redefinable Template Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A redefinable template signature supports the addition of formal template parameters in a specialization of a template classifier.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.RedefinableTemplateSignature#getExtendedSignature <em>Extended Signature</em>}</li>
 *   <li>{@link uml.RedefinableTemplateSignature#getInheritedParameter <em>Inherited Parameter</em>}</li>
 *   <li>{@link uml.RedefinableTemplateSignature#getClassifier <em>Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getRedefinableTemplateSignature()
 * @model
 * @generated
 */
public interface RedefinableTemplateSignature extends RedefinableElement, TemplateSignature {
    /**
     * Returns the value of the '<em><b>Extended Signature</b></em>' reference list.
     * The list contents are of type {@link uml.RedefinableTemplateSignature}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The template signature that is extended by this template signature.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Extended Signature</em>' reference list.
     * @see uml.UmlPackage#getRedefinableTemplateSignature_ExtendedSignature()
     * @model ordered="false"
     * @generated
     */
    EList<RedefinableTemplateSignature> getExtendedSignature();

    /**
     * Returns the value of the '<em><b>Inherited Parameter</b></em>' reference list.
     * The list contents are of type {@link uml.TemplateParameter}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The formal template parameters of the extendedSignature.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Inherited Parameter</em>' reference list.
     * @see uml.UmlPackage#getRedefinableTemplateSignature_InheritedParameter()
     * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    EList<TemplateParameter> getInheritedParameter();

    /**
     * Returns the value of the '<em><b>Classifier</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The classifier that owns this template signature.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Classifier</em>' reference.
     * @see uml.UmlPackage#getRedefinableTemplateSignature_Classifier()
     * @model required="true" transient="true" changeable="false" volatile="true" ordered="false"
     * @generated
     */
    Classifier getClassifier();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The inherited parameters are the parameters of the extended template signature.
     * if extendedSignature->isEmpty() then Set{} else extendedSignature.parameter endif
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean inherited_parameters(DiagnosticChain diagnostics, Map<Object, Object> context);

} // RedefinableTemplateSignature
