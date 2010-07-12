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
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A use case is the specification of a set of actions performed by a system, which yields an observable result that is, typically, of value for one or more actors or other stakeholders of the system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.UseCase#getInclude <em>Include</em>}</li>
 *   <li>{@link uml.UseCase#getExtend <em>Extend</em>}</li>
 *   <li>{@link uml.UseCase#getExtensionPoint <em>Extension Point</em>}</li>
 *   <li>{@link uml.UseCase#getSubject <em>Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getUseCase()
 * @model
 * @generated
 */
public interface UseCase extends BehavioredClassifier {
    /**
     * Returns the value of the '<em><b>Include</b></em>' containment reference list.
     * The list contents are of type {@link uml.Include}.
     * It is bidirectional and its opposite is '{@link uml.Include#getIncludingCase <em>Including Case</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * References the Include relationships owned by this use case.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Include</em>' containment reference list.
     * @see uml.UmlPackage#getUseCase_Include()
     * @see uml.Include#getIncludingCase
     * @model opposite="includingCase" containment="true" ordered="false"
     * @generated
     */
    EList<Include> getInclude();

    /**
     * Returns the value of the '<em><b>Extend</b></em>' containment reference list.
     * The list contents are of type {@link uml.Extend}.
     * It is bidirectional and its opposite is '{@link uml.Extend#getExtension <em>Extension</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * References the Extend relationships owned by this use case.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Extend</em>' containment reference list.
     * @see uml.UmlPackage#getUseCase_Extend()
     * @see uml.Extend#getExtension
     * @model opposite="extension" containment="true" ordered="false"
     * @generated
     */
    EList<Extend> getExtend();

    /**
     * Returns the value of the '<em><b>Extension Point</b></em>' containment reference list.
     * The list contents are of type {@link uml.ExtensionPoint}.
     * It is bidirectional and its opposite is '{@link uml.ExtensionPoint#getUseCase <em>Use Case</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * References the ExtensionPoints owned by the use case.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Extension Point</em>' containment reference list.
     * @see uml.UmlPackage#getUseCase_ExtensionPoint()
     * @see uml.ExtensionPoint#getUseCase
     * @model opposite="useCase" containment="true" ordered="false"
     * @generated
     */
    EList<ExtensionPoint> getExtensionPoint();

    /**
     * Returns the value of the '<em><b>Subject</b></em>' reference list.
     * The list contents are of type {@link uml.Classifier}.
     * It is bidirectional and its opposite is '{@link uml.Classifier#getUseCase <em>Use Case</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * References the subjects to which this use case applies. The subject or its parts realize all the use cases that apply to this subject. Use cases need not be attached to any specific subject, however. The subject may, but need not, own the use cases that apply to it.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Subject</em>' reference list.
     * @see uml.UmlPackage#getUseCase_Subject()
     * @see uml.Classifier#getUseCase
     * @model opposite="useCase" ordered="false"
     * @generated
     */
    EList<Classifier> getSubject();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A UseCase must have a name.
     * self.name -> notEmpty ()
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean must_have_name(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UseCases can only be involved in binary Associations.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean binary_associations(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UseCases can not have Associations to UseCases specifying the same subject.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean no_association_to_use_case(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A use case cannot include use cases that directly or indirectly include it.
     * not self.allIncludedUseCases()->includes(self)
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean cannot_include_self(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The query allIncludedUseCases() returns the transitive closure of all use cases (directly or indirectly) included by this use case.
     * result = self.include->union(self.include->collect(in | in.allIncludedUseCases()))
     * <!-- end-model-doc -->
     * @model ordered="false"
     * @generated
     */
    EList<UseCase> allIncludedUseCases();

} // UseCase
