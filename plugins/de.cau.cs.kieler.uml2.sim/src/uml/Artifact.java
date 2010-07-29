/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An artifact is the specification of a physical piece of information that is used or produced by a software development process, or by deployment and operation of a system. Examples of artifacts include model files, source files, scripts, and binary executable files, a table in a database system, a development deliverable, or a word-processing document, a mail message.
 * An artifact is the source of a deployment to a node.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Artifact#getFileName <em>File Name</em>}</li>
 *   <li>{@link uml.Artifact#getNestedArtifact <em>Nested Artifact</em>}</li>
 *   <li>{@link uml.Artifact#getManifestation <em>Manifestation</em>}</li>
 *   <li>{@link uml.Artifact#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link uml.Artifact#getOwnedAttribute <em>Owned Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getArtifact()
 * @model
 * @generated
 */
public interface Artifact extends Classifier, DeployedArtifact {
	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A concrete name that is used to refer to the Artifact in a physical context. Example: file system name, universal resource locator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #isSetFileName()
	 * @see #unsetFileName()
	 * @see #setFileName(String)
	 * @see uml.UmlPackage#getArtifact_FileName()
	 * @model unsettable="true" dataType="uml.String" ordered="false"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link uml.Artifact#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #isSetFileName()
	 * @see #unsetFileName()
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Unsets the value of the '{@link uml.Artifact#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFileName()
	 * @see #getFileName()
	 * @see #setFileName(String)
	 * @generated
	 */
	void unsetFileName();

	/**
	 * Returns whether the value of the '{@link uml.Artifact#getFileName <em>File Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>File Name</em>' attribute is set.
	 * @see #unsetFileName()
	 * @see #getFileName()
	 * @see #setFileName(String)
	 * @generated
	 */
	boolean isSetFileName();

	/**
	 * Returns the value of the '<em><b>Nested Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link uml.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Artifacts that are defined (nested) within the Artifact.
	 * The association is a specialization of the ownedMember association from Namespace to NamedElement.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Artifact</em>' containment reference list.
	 * @see uml.UmlPackage#getArtifact_NestedArtifact()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Artifact> getNestedArtifact();

	/**
	 * Returns the value of the '<em><b>Manifestation</b></em>' containment reference list.
	 * The list contents are of type {@link uml.Manifestation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of model elements that are manifested in the Artifact. That is, these model elements are utilized in the construction (or generation) of the artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manifestation</em>' containment reference list.
	 * @see uml.UmlPackage#getArtifact_Manifestation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Manifestation> getManifestation();

	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link uml.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Operations defined for the Artifact. The association is a specialization of the ownedMember association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see uml.UmlPackage#getArtifact_OwnedOperation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOwnedOperation();

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link uml.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The attributes or association ends defined for the Artifact.
	 * The association is a specialization of the ownedMember association.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see uml.UmlPackage#getArtifact_OwnedAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getOwnedAttribute();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an operation with the specified name, parameter names, parameter types, and return type (or null) as an owned operation of this artifact.
	 * @param name The name for the new operation, or null.
	 * @param parameterNames The parameter names for  the new operation, or null.
	 * @param parameterTypes The parameter types for the new operation, or null.
	 * @param returnType The return type for the new operation, or null.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" nameDataType="uml.String" nameOrdered="false" parameterNamesDataType="uml.String" parameterNamesMany="true" parameterNamesOrdered="false" parameterTypesMany="true" parameterTypesOrdered="false" returnTypeOrdered="false"
	 * @generated
	 */
	Operation createOwnedOperation(String name, EList<String> parameterNames, EList<Type> parameterTypes, Type returnType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a property with the specified name, type, lower bound, and upper bound as an owned attribute of this artifact.
	 * @param name The name for the new attribute, or null.
	 * @param type The type for the new attribute, or null.
	 * @param lower The lower bound for the new attribute.
	 * @param upper The upper bound for the new attribute.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" nameDataType="uml.String" nameOrdered="false" typeOrdered="false" lowerDataType="uml.Integer" lowerRequired="true" lowerOrdered="false" upperDataType="uml.UnlimitedNatural" upperRequired="true" upperOrdered="false"
	 * @generated
	 */
	Property createOwnedAttribute(String name, Type type, int lower, int upper);

} // Artifact
