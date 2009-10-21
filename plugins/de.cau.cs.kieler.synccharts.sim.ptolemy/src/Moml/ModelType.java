/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Moml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Moml.ModelType#getGroup <em>Group</em>}</li>
 *   <li>{@link Moml.ModelType#getClass_ <em>Class</em>}</li>
 *   <li>{@link Moml.ModelType#getConfigure <em>Configure</em>}</li>
 *   <li>{@link Moml.ModelType#getDeleteEntity <em>Delete Entity</em>}</li>
 *   <li>{@link Moml.ModelType#getDeletePort <em>Delete Port</em>}</li>
 *   <li>{@link Moml.ModelType#getDeleteRelation <em>Delete Relation</em>}</li>
 *   <li>{@link Moml.ModelType#getDirector <em>Director</em>}</li>
 *   <li>{@link Moml.ModelType#getDoc <em>Doc</em>}</li>
 *   <li>{@link Moml.ModelType#getEntity <em>Entity</em>}</li>
 *   <li>{@link Moml.ModelType#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link Moml.ModelType#getImport <em>Import</em>}</li>
 *   <li>{@link Moml.ModelType#getInput <em>Input</em>}</li>
 *   <li>{@link Moml.ModelType#getLink <em>Link</em>}</li>
 *   <li>{@link Moml.ModelType#getProperty <em>Property</em>}</li>
 *   <li>{@link Moml.ModelType#getRelation <em>Relation</em>}</li>
 *   <li>{@link Moml.ModelType#getRename <em>Rename</em>}</li>
 *   <li>{@link Moml.ModelType#getRendition <em>Rendition</em>}</li>
 *   <li>{@link Moml.ModelType#getUnlink <em>Unlink</em>}</li>
 *   <li>{@link Moml.ModelType#getClass1 <em>Class1</em>}</li>
 *   <li>{@link Moml.ModelType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see Moml.MomlPackage#getModelType()
 * @model extendedMetaData="name='model_._type' kind='elementOnly'"
 * @generated
 */
public interface ModelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see Moml.MomlPackage#getModelType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link Moml.ClassType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see Moml.MomlPackage#getModelType_Class()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<ClassType> getClass_();

	/**
	 * Returns the value of the '<em><b>Configure</b></em>' containment reference list.
	 * The list contents are of type {@link Moml.ConfigureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configure</em>' containment reference list.
	 * @see Moml.MomlPackage#getModelType_Configure()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='configure' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<ConfigureType> getConfigure();

	/**
	 * Returns the value of the '<em><b>Delete Entity</b></em>' containment reference list.
	 * The list contents are of type {@link Moml.DeleteEntityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete Entity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Entity</em>' containment reference list.
	 * @see Moml.MomlPackage#getModelType_DeleteEntity()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='deleteEntity' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<DeleteEntityType> getDeleteEntity();

	/**
	 * Returns the value of the '<em><b>Delete Port</b></em>' containment reference list.
	 * The list contents are of type {@link Moml.DeletePortType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Port</em>' containment reference list.
	 * @see Moml.MomlPackage#getModelType_DeletePort()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='deletePort' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<DeletePortType> getDeletePort();

	/**
	 * Returns the value of the '<em><b>Delete Relation</b></em>' containment reference list.
	 * The list contents are of type {@link Moml.DeleteRelationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Relation</em>' containment reference list.
	 * @see Moml.MomlPackage#getModelType_DeleteRelation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='deleteRelation' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<DeleteRelationType> getDeleteRelation();

	/**
	 * Returns the value of the '<em><b>Director</b></em>' containment reference list.
	 * The list contents are of type {@link Moml.DirectorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Director</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Director</em>' containment reference list.
	 * @see Moml.MomlPackage#getModelType_Director()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='director' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<DirectorType> getDirector();

	/**
	 * Returns the value of the '<em><b>Doc</b></em>' containment reference list.
	 * The list contents are of type {@link Moml.DocType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc</em>' containment reference list.
	 * @see Moml.MomlPackage#getModelType_Doc()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='doc' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<DocType> getDoc();

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference list.
	 * The list contents are of type {@link Moml.EntityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference list.
	 * @see Moml.MomlPackage#getModelType_Entity()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='entity' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<EntityType> getEntity();

	/**
	 * Returns the value of the '<em><b>Group1</b></em>' containment reference list.
	 * The list contents are of type {@link Moml.GroupType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group1</em>' containment reference list.
	 * @see Moml.MomlPackage#getModelType_Group1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<GroupType> getGroup1();

	/**
	 * Returns the value of the '<em><b>Import</b></em>' containment reference list.
	 * The list contents are of type {@link Moml.ImportType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' containment reference list.
	 * @see Moml.MomlPackage#getModelType_Import()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='import' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<ImportType> getImport();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link Moml.InputType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see Moml.MomlPackage#getModelType_Input()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<InputType> getInput();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link Moml.LinkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see Moml.MomlPackage#getModelType_Link()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<LinkType> getLink();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link Moml.PropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see Moml.MomlPackage#getModelType_Property()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<PropertyType> getProperty();

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' containment reference list.
	 * The list contents are of type {@link Moml.RelationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' containment reference list.
	 * @see Moml.MomlPackage#getModelType_Relation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='relation' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<RelationType> getRelation();

	/**
	 * Returns the value of the '<em><b>Rename</b></em>' containment reference list.
	 * The list contents are of type {@link Moml.RenameType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rename</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rename</em>' containment reference list.
	 * @see Moml.MomlPackage#getModelType_Rename()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rename' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<RenameType> getRename();

	/**
	 * Returns the value of the '<em><b>Rendition</b></em>' containment reference list.
	 * The list contents are of type {@link Moml.RenditionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rendition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rendition</em>' containment reference list.
	 * @see Moml.MomlPackage#getModelType_Rendition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rendition' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<RenditionType> getRendition();

	/**
	 * Returns the value of the '<em><b>Unlink</b></em>' containment reference list.
	 * The list contents are of type {@link Moml.UnlinkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unlink</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unlink</em>' containment reference list.
	 * @see Moml.MomlPackage#getModelType_Unlink()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unlink' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<UnlinkType> getUnlink();

	/**
	 * Returns the value of the '<em><b>Class1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class1</em>' attribute.
	 * @see #setClass1(String)
	 * @see Moml.MomlPackage#getModelType_Class1()
	 * @model extendedMetaData="kind='attribute' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClass1();

	/**
	 * Sets the value of the '{@link Moml.ModelType#getClass1 <em>Class1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class1</em>' attribute.
	 * @see #getClass1()
	 * @generated
	 */
	void setClass1(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Moml.MomlPackage#getModelType_Name()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Moml.ModelType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ModelType
