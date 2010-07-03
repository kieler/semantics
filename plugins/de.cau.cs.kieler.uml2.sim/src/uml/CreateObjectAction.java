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
 * A representation of the model object '<em><b>Create Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A create object action is an action that creates an object that conforms to a statically specified classifier and puts it on an output pin at runtime.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.CreateObjectAction#getClassifier <em>Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getCreateObjectAction()
 * @model
 * @generated
 */
public interface CreateObjectAction extends Action {
    /**
     * Returns the value of the '<em><b>Classifier</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Classifier to be instantiated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Classifier</em>' reference.
     * @see #setClassifier(Classifier)
     * @see uml.UmlPackage#getCreateObjectAction_Classifier()
     * @model required="true" ordered="false"
     * @generated
     */
    Classifier getClassifier();

    /**
     * Sets the value of the '{@link uml.CreateObjectAction#getClassifier <em>Classifier</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Classifier</em>' reference.
     * @see #getClassifier()
     * @generated
     */
    void setClassifier(Classifier value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The classifier cannot be abstract.
     * not (self.classifier.isAbstract = #true)
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean classifier_not_abstract(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The classifier cannot be an association class
     * not self.classifier.oclIsKindOf(AssociationClass)
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean classifier_not_association_class(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The type of the result pin must be the same as the classifier of the action.
     * self.result.type = self.classifier
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean same_type(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The multiplicity of the output pin is 1..1.
     * self.result.multiplicity.is(1,1)
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean multiplicity(DiagnosticChain diagnostics, Map<Object, Object> context);

} // CreateObjectAction
