/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Moml;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Moml.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link Moml.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link Moml.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link Moml.DocumentRoot#getClass_ <em>Class</em>}</li>
 *   <li>{@link Moml.DocumentRoot#getConfigure <em>Configure</em>}</li>
 *   <li>{@link Moml.DocumentRoot#getDeleteEntity <em>Delete Entity</em>}</li>
 *   <li>{@link Moml.DocumentRoot#getDeletePort <em>Delete Port</em>}</li>
 *   <li>{@link Moml.DocumentRoot#getDeleteProperty <em>Delete Property</em>}</li>
 *   <li>{@link Moml.DocumentRoot#getDeleteRelation <em>Delete Relation</em>}</li>
 *   <li>{@link Moml.DocumentRoot#getDirector <em>Director</em>}</li>
 *   <li>{@link Moml.DocumentRoot#getDoc <em>Doc</em>}</li>
 *   <li>{@link Moml.DocumentRoot#getEntity <em>Entity</em>}</li>
 *   <li>{@link Moml.DocumentRoot#getGroup <em>Group</em>}</li>
 *   <li>{@link Moml.DocumentRoot#getImport <em>Import</em>}</li>
 *   <li>{@link Moml.DocumentRoot#getInput <em>Input</em>}</li>
 *   <li>{@link Moml.DocumentRoot#getLink <em>Link</em>}</li>
 *   <li>{@link Moml.DocumentRoot#getLocation <em>Location</em>}</li>
 *   <li>{@link Moml.DocumentRoot#getModel <em>Model</em>}</li>
 *   <li>{@link Moml.DocumentRoot#getPort <em>Port</em>}</li>
 *   <li>{@link Moml.DocumentRoot#getProperty <em>Property</em>}</li>
 *   <li>{@link Moml.DocumentRoot#getRelation <em>Relation</em>}</li>
 *   <li>{@link Moml.DocumentRoot#getRename <em>Rename</em>}</li>
 *   <li>{@link Moml.DocumentRoot#getRendition <em>Rendition</em>}</li>
 *   <li>{@link Moml.DocumentRoot#getUnlink <em>Unlink</em>}</li>
 *   <li>{@link Moml.DocumentRoot#getVertex <em>Vertex</em>}</li>
 * </ul>
 * </p>
 *
 * @see Moml.MomlPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see Moml.MomlPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see Moml.MomlPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see Moml.MomlPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference.
	 * @see #setClass(ClassType)
	 * @see Moml.MomlPackage#getDocumentRoot_Class()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassType getClass_();

	/**
	 * Sets the value of the '{@link Moml.DocumentRoot#getClass_ <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' containment reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(ClassType value);

	/**
	 * Returns the value of the '<em><b>Configure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configure</em>' containment reference.
	 * @see #setConfigure(ConfigureType)
	 * @see Moml.MomlPackage#getDocumentRoot_Configure()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='configure' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfigureType getConfigure();

	/**
	 * Sets the value of the '{@link Moml.DocumentRoot#getConfigure <em>Configure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configure</em>' containment reference.
	 * @see #getConfigure()
	 * @generated
	 */
	void setConfigure(ConfigureType value);

	/**
	 * Returns the value of the '<em><b>Delete Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Entity</em>' containment reference.
	 * @see #setDeleteEntity(DeleteEntityType)
	 * @see Moml.MomlPackage#getDocumentRoot_DeleteEntity()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='deleteEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	DeleteEntityType getDeleteEntity();

	/**
	 * Sets the value of the '{@link Moml.DocumentRoot#getDeleteEntity <em>Delete Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Entity</em>' containment reference.
	 * @see #getDeleteEntity()
	 * @generated
	 */
	void setDeleteEntity(DeleteEntityType value);

	/**
	 * Returns the value of the '<em><b>Delete Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Port</em>' containment reference.
	 * @see #setDeletePort(DeletePortType)
	 * @see Moml.MomlPackage#getDocumentRoot_DeletePort()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='deletePort' namespace='##targetNamespace'"
	 * @generated
	 */
	DeletePortType getDeletePort();

	/**
	 * Sets the value of the '{@link Moml.DocumentRoot#getDeletePort <em>Delete Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Port</em>' containment reference.
	 * @see #getDeletePort()
	 * @generated
	 */
	void setDeletePort(DeletePortType value);

	/**
	 * Returns the value of the '<em><b>Delete Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Property</em>' containment reference.
	 * @see #setDeleteProperty(DeletePropertyType)
	 * @see Moml.MomlPackage#getDocumentRoot_DeleteProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='deleteProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	DeletePropertyType getDeleteProperty();

	/**
	 * Sets the value of the '{@link Moml.DocumentRoot#getDeleteProperty <em>Delete Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Property</em>' containment reference.
	 * @see #getDeleteProperty()
	 * @generated
	 */
	void setDeleteProperty(DeletePropertyType value);

	/**
	 * Returns the value of the '<em><b>Delete Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete Relation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Relation</em>' containment reference.
	 * @see #setDeleteRelation(DeleteRelationType)
	 * @see Moml.MomlPackage#getDocumentRoot_DeleteRelation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='deleteRelation' namespace='##targetNamespace'"
	 * @generated
	 */
	DeleteRelationType getDeleteRelation();

	/**
	 * Sets the value of the '{@link Moml.DocumentRoot#getDeleteRelation <em>Delete Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Relation</em>' containment reference.
	 * @see #getDeleteRelation()
	 * @generated
	 */
	void setDeleteRelation(DeleteRelationType value);

	/**
	 * Returns the value of the '<em><b>Director</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Director</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Director</em>' containment reference.
	 * @see #setDirector(DirectorType)
	 * @see Moml.MomlPackage#getDocumentRoot_Director()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='director' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectorType getDirector();

	/**
	 * Sets the value of the '{@link Moml.DocumentRoot#getDirector <em>Director</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Director</em>' containment reference.
	 * @see #getDirector()
	 * @generated
	 */
	void setDirector(DirectorType value);

	/**
	 * Returns the value of the '<em><b>Doc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doc</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc</em>' containment reference.
	 * @see #setDoc(DocType)
	 * @see Moml.MomlPackage#getDocumentRoot_Doc()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='doc' namespace='##targetNamespace'"
	 * @generated
	 */
	DocType getDoc();

	/**
	 * Sets the value of the '{@link Moml.DocumentRoot#getDoc <em>Doc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc</em>' containment reference.
	 * @see #getDoc()
	 * @generated
	 */
	void setDoc(DocType value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference.
	 * @see #setEntity(EntityType)
	 * @see Moml.MomlPackage#getDocumentRoot_Entity()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='entity' namespace='##targetNamespace'"
	 * @generated
	 */
	EntityType getEntity();

	/**
	 * Sets the value of the '{@link Moml.DocumentRoot#getEntity <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' containment reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(EntityType value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference.
	 * @see #setGroup(GroupType)
	 * @see Moml.MomlPackage#getDocumentRoot_Group()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 * @generated
	 */
	GroupType getGroup();

	/**
	 * Sets the value of the '{@link Moml.DocumentRoot#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(GroupType value);

	/**
	 * Returns the value of the '<em><b>Import</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' containment reference.
	 * @see #setImport(ImportType)
	 * @see Moml.MomlPackage#getDocumentRoot_Import()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='import' namespace='##targetNamespace'"
	 * @generated
	 */
	ImportType getImport();

	/**
	 * Sets the value of the '{@link Moml.DocumentRoot#getImport <em>Import</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import</em>' containment reference.
	 * @see #getImport()
	 * @generated
	 */
	void setImport(ImportType value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference.
	 * @see #setInput(InputType)
	 * @see Moml.MomlPackage#getDocumentRoot_Input()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace'"
	 * @generated
	 */
	InputType getInput();

	/**
	 * Sets the value of the '{@link Moml.DocumentRoot#getInput <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' containment reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(InputType value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference.
	 * @see #setLink(LinkType)
	 * @see Moml.MomlPackage#getDocumentRoot_Link()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 * @generated
	 */
	LinkType getLink();

	/**
	 * Sets the value of the '{@link Moml.DocumentRoot#getLink <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' containment reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(LinkType value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(LocationType)
	 * @see Moml.MomlPackage#getDocumentRoot_Location()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	LocationType getLocation();

	/**
	 * Sets the value of the '{@link Moml.DocumentRoot#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(LocationType value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference.
	 * @see #setModel(ModelType)
	 * @see Moml.MomlPackage#getDocumentRoot_Model()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='model' namespace='##targetNamespace'"
	 * @generated
	 */
	ModelType getModel();

	/**
	 * Sets the value of the '{@link Moml.DocumentRoot#getModel <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' containment reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(ModelType value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference.
	 * @see #setPort(PortType)
	 * @see Moml.MomlPackage#getDocumentRoot_Port()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='port' namespace='##targetNamespace'"
	 * @generated
	 */
	PortType getPort();

	/**
	 * Sets the value of the '{@link Moml.DocumentRoot#getPort <em>Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' containment reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(PortType value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference.
	 * @see #setProperty(PropertyType)
	 * @see Moml.MomlPackage#getDocumentRoot_Property()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyType getProperty();

	/**
	 * Sets the value of the '{@link Moml.DocumentRoot#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(PropertyType value);

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' containment reference.
	 * @see #setRelation(RelationType)
	 * @see Moml.MomlPackage#getDocumentRoot_Relation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='relation' namespace='##targetNamespace'"
	 * @generated
	 */
	RelationType getRelation();

	/**
	 * Sets the value of the '{@link Moml.DocumentRoot#getRelation <em>Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' containment reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(RelationType value);

	/**
	 * Returns the value of the '<em><b>Rename</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rename</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rename</em>' containment reference.
	 * @see #setRename(RenameType)
	 * @see Moml.MomlPackage#getDocumentRoot_Rename()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rename' namespace='##targetNamespace'"
	 * @generated
	 */
	RenameType getRename();

	/**
	 * Sets the value of the '{@link Moml.DocumentRoot#getRename <em>Rename</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rename</em>' containment reference.
	 * @see #getRename()
	 * @generated
	 */
	void setRename(RenameType value);

	/**
	 * Returns the value of the '<em><b>Rendition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rendition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rendition</em>' containment reference.
	 * @see #setRendition(RenditionType)
	 * @see Moml.MomlPackage#getDocumentRoot_Rendition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rendition' namespace='##targetNamespace'"
	 * @generated
	 */
	RenditionType getRendition();

	/**
	 * Sets the value of the '{@link Moml.DocumentRoot#getRendition <em>Rendition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rendition</em>' containment reference.
	 * @see #getRendition()
	 * @generated
	 */
	void setRendition(RenditionType value);

	/**
	 * Returns the value of the '<em><b>Unlink</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unlink</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unlink</em>' containment reference.
	 * @see #setUnlink(UnlinkType)
	 * @see Moml.MomlPackage#getDocumentRoot_Unlink()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unlink' namespace='##targetNamespace'"
	 * @generated
	 */
	UnlinkType getUnlink();

	/**
	 * Sets the value of the '{@link Moml.DocumentRoot#getUnlink <em>Unlink</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unlink</em>' containment reference.
	 * @see #getUnlink()
	 * @generated
	 */
	void setUnlink(UnlinkType value);

	/**
	 * Returns the value of the '<em><b>Vertex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertex</em>' containment reference.
	 * @see #setVertex(VertexType)
	 * @see Moml.MomlPackage#getDocumentRoot_Vertex()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='vertex' namespace='##targetNamespace'"
	 * @generated
	 */
	VertexType getVertex();

	/**
	 * Sets the value of the '{@link Moml.DocumentRoot#getVertex <em>Vertex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertex</em>' containment reference.
	 * @see #getVertex()
	 * @generated
	 */
	void setVertex(VertexType value);

} // DocumentRoot
