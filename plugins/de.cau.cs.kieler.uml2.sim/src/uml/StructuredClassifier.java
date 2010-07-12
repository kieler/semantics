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
 * A representation of the model object '<em><b>Structured Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A structured classifier is an abstract metaclass that represents any classifier whose behavior can be fully or partly described by the collaboration of owned or referenced instances.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.StructuredClassifier#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link uml.StructuredClassifier#getPart <em>Part</em>}</li>
 *   <li>{@link uml.StructuredClassifier#getRole <em>Role</em>}</li>
 *   <li>{@link uml.StructuredClassifier#getOwnedConnector <em>Owned Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getStructuredClassifier()
 * @model abstract="true"
 * @generated
 */
public interface StructuredClassifier extends Classifier {
    /**
     * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
     * The list contents are of type {@link uml.Property}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * References the properties owned by the classifier.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Owned Attribute</em>' containment reference list.
     * @see uml.UmlPackage#getStructuredClassifier_OwnedAttribute()
     * @model containment="true"
     * @generated
     */
    EList<Property> getOwnedAttribute();

    /**
     * Returns the value of the '<em><b>Part</b></em>' reference list.
     * The list contents are of type {@link uml.Property}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * References the properties specifying instances that the classifier owns by composition. This association is derived, selecting those owned properties where isComposite is true.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Part</em>' reference list.
     * @see uml.UmlPackage#getStructuredClassifier_Part()
     * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    EList<Property> getPart();

    /**
     * Returns the value of the '<em><b>Role</b></em>' reference list.
     * The list contents are of type {@link uml.ConnectableElement}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * References the roles that instances may play in this classifier.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Role</em>' reference list.
     * @see uml.UmlPackage#getStructuredClassifier_Role()
     * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    EList<ConnectableElement> getRole();

    /**
     * Returns the value of the '<em><b>Owned Connector</b></em>' containment reference list.
     * The list contents are of type {@link uml.Connector}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * References the connectors owned by the classifier.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Owned Connector</em>' containment reference list.
     * @see uml.UmlPackage#getStructuredClassifier_OwnedConnector()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Connector> getOwnedConnector();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The multiplicities on connected elements must be consistent.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean multiplicities(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Creates a property with the specified name, type, lower bound, and upper bound as an owned attribute of this structured classifier.
     * @param name The name for the new attribute, or null.
     * @param type The type for the new attribute, or null.
     * @param lower The lower bound for the new attribute.
     * @param upper The upper bound for the new attribute.
     * <!-- end-model-doc -->
     * @model required="true" ordered="false" nameDataType="uml.String" nameOrdered="false" typeOrdered="false" lowerDataType="uml.Integer" lowerRequired="true" lowerOrdered="false" upperDataType="uml.UnlimitedNatural" upperRequired="true" upperOrdered="false"
     * @generated
     */
    Property createOwnedAttribute(String name, Type type, int lower, int upper);

} // StructuredClassifier
