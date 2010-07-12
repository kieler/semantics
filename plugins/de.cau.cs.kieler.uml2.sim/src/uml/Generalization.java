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
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A generalization is a taxonomic relationship between a more general classifier and a more specific classifier. Each instance of the specific classifier is also an indirect instance of the general classifier. Thus, the specific classifier inherits the features of the more general classifier.
 * A generalization relates a specific classifier to a more general classifier, and is owned by the specific classifier.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Generalization#isIsSubstitutable <em>Is Substitutable</em>}</li>
 *   <li>{@link uml.Generalization#getGeneral <em>General</em>}</li>
 *   <li>{@link uml.Generalization#getGeneralizationSet <em>Generalization Set</em>}</li>
 *   <li>{@link uml.Generalization#getSpecific <em>Specific</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends DirectedRelationship {
    /**
     * Returns the value of the '<em><b>Is Substitutable</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates whether the specific classifier can be used wherever the general classifier can be used. If true, the execution traces of the specific classifier will be a superset of the execution traces of the general classifier.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Is Substitutable</em>' attribute.
     * @see #setIsSubstitutable(boolean)
     * @see uml.UmlPackage#getGeneralization_IsSubstitutable()
     * @model default="true" dataType="uml.Boolean" ordered="false"
     * @generated
     */
    boolean isIsSubstitutable();

    /**
     * Sets the value of the '{@link uml.Generalization#isIsSubstitutable <em>Is Substitutable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Substitutable</em>' attribute.
     * @see #isIsSubstitutable()
     * @generated
     */
    void setIsSubstitutable(boolean value);

    /**
     * Returns the value of the '<em><b>General</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * References the general classifier in the Generalization relationship.
     * <!-- end-model-doc -->
     * @return the value of the '<em>General</em>' reference.
     * @see #setGeneral(Classifier)
     * @see uml.UmlPackage#getGeneralization_General()
     * @model required="true" ordered="false"
     * @generated
     */
    Classifier getGeneral();

    /**
     * Sets the value of the '{@link uml.Generalization#getGeneral <em>General</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>General</em>' reference.
     * @see #getGeneral()
     * @generated
     */
    void setGeneral(Classifier value);

    /**
     * Returns the value of the '<em><b>Generalization Set</b></em>' reference list.
     * The list contents are of type {@link uml.GeneralizationSet}.
     * It is bidirectional and its opposite is '{@link uml.GeneralizationSet#getGeneralization <em>Generalization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Designates a set in which instances of Generalization is considered members.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Generalization Set</em>' reference list.
     * @see uml.UmlPackage#getGeneralization_GeneralizationSet()
     * @see uml.GeneralizationSet#getGeneralization
     * @model opposite="generalization" ordered="false"
     * @generated
     */
    EList<GeneralizationSet> getGeneralizationSet();

    /**
     * Returns the value of the '<em><b>Specific</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link uml.Classifier#getGeneralization <em>Generalization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * References the specializing classifier in the Generalization relationship.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Specific</em>' container reference.
     * @see #setSpecific(Classifier)
     * @see uml.UmlPackage#getGeneralization_Specific()
     * @see uml.Classifier#getGeneralization
     * @model opposite="generalization" required="true" transient="false" ordered="false"
     * @generated
     */
    Classifier getSpecific();

    /**
     * Sets the value of the '{@link uml.Generalization#getSpecific <em>Specific</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Specific</em>' container reference.
     * @see #getSpecific()
     * @generated
     */
    void setSpecific(Classifier value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Every Generalization associated with a given GeneralizationSet must have the same general Classifier. That is, all Generalizations for a particular GeneralizationSet must have the same superclass.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean generalization_same_classifier(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Generalization
