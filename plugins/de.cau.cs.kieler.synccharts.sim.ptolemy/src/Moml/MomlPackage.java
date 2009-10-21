/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Moml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Moml.MomlFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface MomlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Moml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/de.cau.cs.kieler.sim.ptolemy/moml.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Moml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MomlPackage eINSTANCE = Moml.impl.MomlPackageImpl.init();

	/**
	 * The meta object id for the '{@link Moml.impl.AnyImpl <em>Any</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Moml.impl.AnyImpl
	 * @see Moml.impl.MomlPackageImpl#getAny()
	 * @generated
	 */
	int ANY = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__ANY = 1;

	/**
	 * The number of structural features of the '<em>Any</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Moml.impl.ClassTypeImpl <em>Class Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Moml.impl.ClassTypeImpl
	 * @see Moml.impl.MomlPackageImpl#getClassType()
	 * @generated
	 */
	int CLASS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Configure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__CONFIGURE = 2;

	/**
	 * The feature id for the '<em><b>Delete Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__DELETE_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Delete Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__DELETE_PORT = 4;

	/**
	 * The feature id for the '<em><b>Delete Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__DELETE_RELATION = 5;

	/**
	 * The feature id for the '<em><b>Director</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__DIRECTOR = 6;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__DOC = 7;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__ENTITY = 8;

	/**
	 * The feature id for the '<em><b>Group1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__GROUP1 = 9;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__IMPORT = 10;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__INPUT = 11;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__LINK = 12;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__PORT = 13;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__PROPERTY = 14;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__RELATION = 15;

	/**
	 * The feature id for the '<em><b>Rename</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__RENAME = 16;

	/**
	 * The feature id for the '<em><b>Rendition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__RENDITION = 17;

	/**
	 * The feature id for the '<em><b>Unlink</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__UNLINK = 18;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__EXTENDS = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__NAME = 20;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__SOURCE = 21;

	/**
	 * The number of structural features of the '<em>Class Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE_FEATURE_COUNT = 22;

	/**
	 * The meta object id for the '{@link Moml.impl.ConfigureTypeImpl <em>Configure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Moml.impl.ConfigureTypeImpl
	 * @see Moml.impl.MomlPackageImpl#getConfigureType()
	 * @generated
	 */
	int CONFIGURE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURE_TYPE__SOURCE = 1;

	/**
	 * The number of structural features of the '<em>Configure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Moml.impl.DeleteEntityTypeImpl <em>Delete Entity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Moml.impl.DeleteEntityTypeImpl
	 * @see Moml.impl.MomlPackageImpl#getDeleteEntityType()
	 * @generated
	 */
	int DELETE_ENTITY_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ENTITY_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Delete Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ENTITY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Moml.impl.DeletePortTypeImpl <em>Delete Port Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Moml.impl.DeletePortTypeImpl
	 * @see Moml.impl.MomlPackageImpl#getDeletePortType()
	 * @generated
	 */
	int DELETE_PORT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PORT_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Delete Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PORT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Moml.impl.DeletePropertyTypeImpl <em>Delete Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Moml.impl.DeletePropertyTypeImpl
	 * @see Moml.impl.MomlPackageImpl#getDeletePropertyType()
	 * @generated
	 */
	int DELETE_PROPERTY_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PROPERTY_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Delete Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PROPERTY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Moml.impl.DeleteRelationTypeImpl <em>Delete Relation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Moml.impl.DeleteRelationTypeImpl
	 * @see Moml.impl.MomlPackageImpl#getDeleteRelationType()
	 * @generated
	 */
	int DELETE_RELATION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_RELATION_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Delete Relation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_RELATION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Moml.impl.DirectorTypeImpl <em>Director Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Moml.impl.DirectorTypeImpl
	 * @see Moml.impl.MomlPackageImpl#getDirectorType()
	 * @generated
	 */
	int DIRECTOR_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTOR_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Configure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTOR_TYPE__CONFIGURE = 1;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTOR_TYPE__DOC = 2;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTOR_TYPE__PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTOR_TYPE__CLASS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTOR_TYPE__NAME = 5;

	/**
	 * The number of structural features of the '<em>Director Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTOR_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link Moml.impl.DocTypeImpl <em>Doc Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Moml.impl.DocTypeImpl
	 * @see Moml.impl.MomlPackageImpl#getDocType()
	 * @generated
	 */
	int DOC_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Doc Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Moml.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Moml.impl.DocumentRootImpl
	 * @see Moml.impl.MomlPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 9;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASS = 3;

	/**
	 * The feature id for the '<em><b>Configure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONFIGURE = 4;

	/**
	 * The feature id for the '<em><b>Delete Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DELETE_ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Delete Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DELETE_PORT = 6;

	/**
	 * The feature id for the '<em><b>Delete Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DELETE_PROPERTY = 7;

	/**
	 * The feature id for the '<em><b>Delete Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DELETE_RELATION = 8;

	/**
	 * The feature id for the '<em><b>Director</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIRECTOR = 9;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOC = 10;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENTITY = 11;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GROUP = 12;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMPORT = 13;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INPUT = 14;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINK = 15;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCATION = 16;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODEL = 17;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PORT = 18;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY = 19;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RELATION = 20;

	/**
	 * The feature id for the '<em><b>Rename</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RENAME = 21;

	/**
	 * The feature id for the '<em><b>Rendition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RENDITION = 22;

	/**
	 * The feature id for the '<em><b>Unlink</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNLINK = 23;

	/**
	 * The feature id for the '<em><b>Vertex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VERTEX = 24;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 25;

	/**
	 * The meta object id for the '{@link Moml.impl.EntityTypeImpl <em>Entity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Moml.impl.EntityTypeImpl
	 * @see Moml.impl.MomlPackageImpl#getEntityType()
	 * @generated
	 */
	int ENTITY_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Configure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__CONFIGURE = 2;

	/**
	 * The feature id for the '<em><b>Delete Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__DELETE_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Delete Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__DELETE_PORT = 4;

	/**
	 * The feature id for the '<em><b>Delete Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__DELETE_RELATION = 5;

	/**
	 * The feature id for the '<em><b>Director</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__DIRECTOR = 6;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__DOC = 7;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__ENTITY = 8;

	/**
	 * The feature id for the '<em><b>Group1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__GROUP1 = 9;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__IMPORT = 10;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__INPUT = 11;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__LINK = 12;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__PORT = 13;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__PROPERTY = 14;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__RELATION = 15;

	/**
	 * The feature id for the '<em><b>Rename</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__RENAME = 16;

	/**
	 * The feature id for the '<em><b>Rendition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__RENDITION = 17;

	/**
	 * The feature id for the '<em><b>Unlink</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__UNLINK = 18;

	/**
	 * The feature id for the '<em><b>Class1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__CLASS1 = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__NAME = 20;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__SOURCE = 21;

	/**
	 * The number of structural features of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_FEATURE_COUNT = 22;

	/**
	 * The meta object id for the '{@link Moml.impl.GroupTypeImpl <em>Group Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Moml.impl.GroupTypeImpl
	 * @see Moml.impl.MomlPackageImpl#getGroupType()
	 * @generated
	 */
	int GROUP_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__MIXED = ANY__MIXED;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__ANY = ANY__ANY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE__NAME = ANY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TYPE_FEATURE_COUNT = ANY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Moml.impl.ImportTypeImpl <em>Import Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Moml.impl.ImportTypeImpl
	 * @see Moml.impl.MomlPackageImpl#getImportType()
	 * @generated
	 */
	int IMPORT_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE__BASE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE__SOURCE = 1;

	/**
	 * The number of structural features of the '<em>Import Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Moml.impl.InputTypeImpl <em>Input Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Moml.impl.InputTypeImpl
	 * @see Moml.impl.MomlPackageImpl#getInputType()
	 * @generated
	 */
	int INPUT_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE__BASE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE__SOURCE = 1;

	/**
	 * The number of structural features of the '<em>Input Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Moml.impl.LinkTypeImpl <em>Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Moml.impl.LinkTypeImpl
	 * @see Moml.impl.MomlPackageImpl#getLinkType()
	 * @generated
	 */
	int LINK_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Insert At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__INSERT_AT = 0;

	/**
	 * The feature id for the '<em><b>Insert Inside At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__INSERT_INSIDE_AT = 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__PORT = 2;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__RELATION = 3;

	/**
	 * The feature id for the '<em><b>Relation1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__RELATION1 = 4;

	/**
	 * The feature id for the '<em><b>Relation2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__RELATION2 = 5;

	/**
	 * The feature id for the '<em><b>Vertex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__VERTEX = 6;

	/**
	 * The number of structural features of the '<em>Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link Moml.impl.LocationTypeImpl <em>Location Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Moml.impl.LocationTypeImpl
	 * @see Moml.impl.MomlPackageImpl#getLocationType()
	 * @generated
	 */
	int LOCATION_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Location Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Moml.impl.ModelTypeImpl <em>Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Moml.impl.ModelTypeImpl
	 * @see Moml.impl.MomlPackageImpl#getModelType()
	 * @generated
	 */
	int MODEL_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Configure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__CONFIGURE = 2;

	/**
	 * The feature id for the '<em><b>Delete Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__DELETE_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Delete Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__DELETE_PORT = 4;

	/**
	 * The feature id for the '<em><b>Delete Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__DELETE_RELATION = 5;

	/**
	 * The feature id for the '<em><b>Director</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__DIRECTOR = 6;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__DOC = 7;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__ENTITY = 8;

	/**
	 * The feature id for the '<em><b>Group1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__GROUP1 = 9;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__IMPORT = 10;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__INPUT = 11;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__LINK = 12;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__PROPERTY = 13;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__RELATION = 14;

	/**
	 * The feature id for the '<em><b>Rename</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__RENAME = 15;

	/**
	 * The feature id for the '<em><b>Rendition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__RENDITION = 16;

	/**
	 * The feature id for the '<em><b>Unlink</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__UNLINK = 17;

	/**
	 * The feature id for the '<em><b>Class1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__CLASS1 = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__NAME = 19;

	/**
	 * The number of structural features of the '<em>Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_FEATURE_COUNT = 20;

	/**
	 * The meta object id for the '{@link Moml.impl.PortTypeImpl <em>Port Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Moml.impl.PortTypeImpl
	 * @see Moml.impl.MomlPackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Configure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__CONFIGURE = 1;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__DOC = 2;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Rename</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__RENAME = 4;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__CLASS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__NAME = 6;

	/**
	 * The number of structural features of the '<em>Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link Moml.impl.PropertyTypeImpl <em>Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Moml.impl.PropertyTypeImpl
	 * @see Moml.impl.MomlPackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Configure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__CONFIGURE = 1;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__DOC = 2;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Rename</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__RENAME = 4;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__CLASS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__NAME = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__VALUE = 7;

	/**
	 * The number of structural features of the '<em>Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link Moml.impl.RelationTypeImpl <em>Relation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Moml.impl.RelationTypeImpl
	 * @see Moml.impl.MomlPackageImpl#getRelationType()
	 * @generated
	 */
	int RELATION_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Configure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE__CONFIGURE = 1;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE__DOC = 2;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE__PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Rename</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE__RENAME = 4;

	/**
	 * The feature id for the '<em><b>Vertex</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE__VERTEX = 5;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE__CLASS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE__NAME = 7;

	/**
	 * The number of structural features of the '<em>Relation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link Moml.impl.RenameTypeImpl <em>Rename Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Moml.impl.RenameTypeImpl
	 * @see Moml.impl.MomlPackageImpl#getRenameType()
	 * @generated
	 */
	int RENAME_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Rename Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Moml.impl.RenditionTypeImpl <em>Rendition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Moml.impl.RenditionTypeImpl
	 * @see Moml.impl.MomlPackageImpl#getRenditionType()
	 * @generated
	 */
	int RENDITION_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDITION_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Configure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDITION_TYPE__CONFIGURE = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDITION_TYPE__LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDITION_TYPE__PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDITION_TYPE__CLASS = 4;

	/**
	 * The number of structural features of the '<em>Rendition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDITION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link Moml.impl.UnlinkTypeImpl <em>Unlink Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Moml.impl.UnlinkTypeImpl
	 * @see Moml.impl.MomlPackageImpl#getUnlinkType()
	 * @generated
	 */
	int UNLINK_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLINK_TYPE__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Inside Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLINK_TYPE__INSIDE_INDEX = 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLINK_TYPE__PORT = 2;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLINK_TYPE__RELATION = 3;

	/**
	 * The feature id for the '<em><b>Relation1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLINK_TYPE__RELATION1 = 4;

	/**
	 * The feature id for the '<em><b>Relation2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLINK_TYPE__RELATION2 = 5;

	/**
	 * The number of structural features of the '<em>Unlink Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLINK_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link Moml.impl.VertexTypeImpl <em>Vertex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Moml.impl.VertexTypeImpl
	 * @see Moml.impl.MomlPackageImpl#getVertexType()
	 * @generated
	 */
	int VERTEX_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Configure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_TYPE__CONFIGURE = 1;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_TYPE__DOC = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_TYPE__LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_TYPE__PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Rename</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_TYPE__RENAME = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_TYPE__NAME = 6;

	/**
	 * The feature id for the '<em><b>Path To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_TYPE__PATH_TO = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_TYPE__VALUE = 8;

	/**
	 * The number of structural features of the '<em>Vertex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_TYPE_FEATURE_COUNT = 9;


	/**
	 * Returns the meta object for class '{@link Moml.Any <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any</em>'.
	 * @see Moml.Any
	 * @generated
	 */
	EClass getAny();

	/**
	 * Returns the meta object for the attribute list '{@link Moml.Any#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Moml.Any#getMixed()
	 * @see #getAny()
	 * @generated
	 */
	EAttribute getAny_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link Moml.Any#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see Moml.Any#getAny()
	 * @see #getAny()
	 * @generated
	 */
	EAttribute getAny_Any();

	/**
	 * Returns the meta object for class '{@link Moml.ClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Type</em>'.
	 * @see Moml.ClassType
	 * @generated
	 */
	EClass getClassType();

	/**
	 * Returns the meta object for the attribute list '{@link Moml.ClassType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see Moml.ClassType#getGroup()
	 * @see #getClassType()
	 * @generated
	 */
	EAttribute getClassType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ClassType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class</em>'.
	 * @see Moml.ClassType#getClass_()
	 * @see #getClassType()
	 * @generated
	 */
	EReference getClassType_Class();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ClassType#getConfigure <em>Configure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configure</em>'.
	 * @see Moml.ClassType#getConfigure()
	 * @see #getClassType()
	 * @generated
	 */
	EReference getClassType_Configure();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ClassType#getDeleteEntity <em>Delete Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delete Entity</em>'.
	 * @see Moml.ClassType#getDeleteEntity()
	 * @see #getClassType()
	 * @generated
	 */
	EReference getClassType_DeleteEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ClassType#getDeletePort <em>Delete Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delete Port</em>'.
	 * @see Moml.ClassType#getDeletePort()
	 * @see #getClassType()
	 * @generated
	 */
	EReference getClassType_DeletePort();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ClassType#getDeleteRelation <em>Delete Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delete Relation</em>'.
	 * @see Moml.ClassType#getDeleteRelation()
	 * @see #getClassType()
	 * @generated
	 */
	EReference getClassType_DeleteRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ClassType#getDirector <em>Director</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Director</em>'.
	 * @see Moml.ClassType#getDirector()
	 * @see #getClassType()
	 * @generated
	 */
	EReference getClassType_Director();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ClassType#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Doc</em>'.
	 * @see Moml.ClassType#getDoc()
	 * @see #getClassType()
	 * @generated
	 */
	EReference getClassType_Doc();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ClassType#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity</em>'.
	 * @see Moml.ClassType#getEntity()
	 * @see #getClassType()
	 * @generated
	 */
	EReference getClassType_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ClassType#getGroup1 <em>Group1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group1</em>'.
	 * @see Moml.ClassType#getGroup1()
	 * @see #getClassType()
	 * @generated
	 */
	EReference getClassType_Group1();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ClassType#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import</em>'.
	 * @see Moml.ClassType#getImport()
	 * @see #getClassType()
	 * @generated
	 */
	EReference getClassType_Import();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ClassType#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see Moml.ClassType#getInput()
	 * @see #getClassType()
	 * @generated
	 */
	EReference getClassType_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ClassType#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see Moml.ClassType#getLink()
	 * @see #getClassType()
	 * @generated
	 */
	EReference getClassType_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ClassType#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see Moml.ClassType#getPort()
	 * @see #getClassType()
	 * @generated
	 */
	EReference getClassType_Port();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ClassType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see Moml.ClassType#getProperty()
	 * @see #getClassType()
	 * @generated
	 */
	EReference getClassType_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ClassType#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation</em>'.
	 * @see Moml.ClassType#getRelation()
	 * @see #getClassType()
	 * @generated
	 */
	EReference getClassType_Relation();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ClassType#getRename <em>Rename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rename</em>'.
	 * @see Moml.ClassType#getRename()
	 * @see #getClassType()
	 * @generated
	 */
	EReference getClassType_Rename();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ClassType#getRendition <em>Rendition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rendition</em>'.
	 * @see Moml.ClassType#getRendition()
	 * @see #getClassType()
	 * @generated
	 */
	EReference getClassType_Rendition();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ClassType#getUnlink <em>Unlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unlink</em>'.
	 * @see Moml.ClassType#getUnlink()
	 * @see #getClassType()
	 * @generated
	 */
	EReference getClassType_Unlink();

	/**
	 * Returns the meta object for the attribute '{@link Moml.ClassType#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extends</em>'.
	 * @see Moml.ClassType#getExtends()
	 * @see #getClassType()
	 * @generated
	 */
	EAttribute getClassType_Extends();

	/**
	 * Returns the meta object for the attribute '{@link Moml.ClassType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Moml.ClassType#getName()
	 * @see #getClassType()
	 * @generated
	 */
	EAttribute getClassType_Name();

	/**
	 * Returns the meta object for the attribute '{@link Moml.ClassType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see Moml.ClassType#getSource()
	 * @see #getClassType()
	 * @generated
	 */
	EAttribute getClassType_Source();

	/**
	 * Returns the meta object for class '{@link Moml.ConfigureType <em>Configure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configure Type</em>'.
	 * @see Moml.ConfigureType
	 * @generated
	 */
	EClass getConfigureType();

	/**
	 * Returns the meta object for the attribute list '{@link Moml.ConfigureType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Moml.ConfigureType#getMixed()
	 * @see #getConfigureType()
	 * @generated
	 */
	EAttribute getConfigureType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link Moml.ConfigureType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see Moml.ConfigureType#getSource()
	 * @see #getConfigureType()
	 * @generated
	 */
	EAttribute getConfigureType_Source();

	/**
	 * Returns the meta object for class '{@link Moml.DeleteEntityType <em>Delete Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Entity Type</em>'.
	 * @see Moml.DeleteEntityType
	 * @generated
	 */
	EClass getDeleteEntityType();

	/**
	 * Returns the meta object for the attribute '{@link Moml.DeleteEntityType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Moml.DeleteEntityType#getName()
	 * @see #getDeleteEntityType()
	 * @generated
	 */
	EAttribute getDeleteEntityType_Name();

	/**
	 * Returns the meta object for class '{@link Moml.DeletePortType <em>Delete Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Port Type</em>'.
	 * @see Moml.DeletePortType
	 * @generated
	 */
	EClass getDeletePortType();

	/**
	 * Returns the meta object for the attribute '{@link Moml.DeletePortType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Moml.DeletePortType#getName()
	 * @see #getDeletePortType()
	 * @generated
	 */
	EAttribute getDeletePortType_Name();

	/**
	 * Returns the meta object for class '{@link Moml.DeletePropertyType <em>Delete Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Property Type</em>'.
	 * @see Moml.DeletePropertyType
	 * @generated
	 */
	EClass getDeletePropertyType();

	/**
	 * Returns the meta object for the attribute '{@link Moml.DeletePropertyType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Moml.DeletePropertyType#getName()
	 * @see #getDeletePropertyType()
	 * @generated
	 */
	EAttribute getDeletePropertyType_Name();

	/**
	 * Returns the meta object for class '{@link Moml.DeleteRelationType <em>Delete Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Relation Type</em>'.
	 * @see Moml.DeleteRelationType
	 * @generated
	 */
	EClass getDeleteRelationType();

	/**
	 * Returns the meta object for the attribute '{@link Moml.DeleteRelationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Moml.DeleteRelationType#getName()
	 * @see #getDeleteRelationType()
	 * @generated
	 */
	EAttribute getDeleteRelationType_Name();

	/**
	 * Returns the meta object for class '{@link Moml.DirectorType <em>Director Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Director Type</em>'.
	 * @see Moml.DirectorType
	 * @generated
	 */
	EClass getDirectorType();

	/**
	 * Returns the meta object for the attribute list '{@link Moml.DirectorType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see Moml.DirectorType#getGroup()
	 * @see #getDirectorType()
	 * @generated
	 */
	EAttribute getDirectorType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.DirectorType#getConfigure <em>Configure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configure</em>'.
	 * @see Moml.DirectorType#getConfigure()
	 * @see #getDirectorType()
	 * @generated
	 */
	EReference getDirectorType_Configure();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.DirectorType#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Doc</em>'.
	 * @see Moml.DirectorType#getDoc()
	 * @see #getDirectorType()
	 * @generated
	 */
	EReference getDirectorType_Doc();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.DirectorType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see Moml.DirectorType#getProperty()
	 * @see #getDirectorType()
	 * @generated
	 */
	EReference getDirectorType_Property();

	/**
	 * Returns the meta object for the attribute '{@link Moml.DirectorType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see Moml.DirectorType#getClass_()
	 * @see #getDirectorType()
	 * @generated
	 */
	EAttribute getDirectorType_Class();

	/**
	 * Returns the meta object for the attribute '{@link Moml.DirectorType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Moml.DirectorType#getName()
	 * @see #getDirectorType()
	 * @generated
	 */
	EAttribute getDirectorType_Name();

	/**
	 * Returns the meta object for class '{@link Moml.DocType <em>Doc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doc Type</em>'.
	 * @see Moml.DocType
	 * @generated
	 */
	EClass getDocType();

	/**
	 * Returns the meta object for the attribute list '{@link Moml.DocType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Moml.DocType#getMixed()
	 * @see #getDocType()
	 * @generated
	 */
	EAttribute getDocType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link Moml.DocType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Moml.DocType#getName()
	 * @see #getDocType()
	 * @generated
	 */
	EAttribute getDocType_Name();

	/**
	 * Returns the meta object for class '{@link Moml.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see Moml.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link Moml.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Moml.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link Moml.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see Moml.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link Moml.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see Moml.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link Moml.DocumentRoot#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Class</em>'.
	 * @see Moml.DocumentRoot#getClass_()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Class();

	/**
	 * Returns the meta object for the containment reference '{@link Moml.DocumentRoot#getConfigure <em>Configure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configure</em>'.
	 * @see Moml.DocumentRoot#getConfigure()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Configure();

	/**
	 * Returns the meta object for the containment reference '{@link Moml.DocumentRoot#getDeleteEntity <em>Delete Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delete Entity</em>'.
	 * @see Moml.DocumentRoot#getDeleteEntity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DeleteEntity();

	/**
	 * Returns the meta object for the containment reference '{@link Moml.DocumentRoot#getDeletePort <em>Delete Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delete Port</em>'.
	 * @see Moml.DocumentRoot#getDeletePort()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DeletePort();

	/**
	 * Returns the meta object for the containment reference '{@link Moml.DocumentRoot#getDeleteProperty <em>Delete Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delete Property</em>'.
	 * @see Moml.DocumentRoot#getDeleteProperty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DeleteProperty();

	/**
	 * Returns the meta object for the containment reference '{@link Moml.DocumentRoot#getDeleteRelation <em>Delete Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delete Relation</em>'.
	 * @see Moml.DocumentRoot#getDeleteRelation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DeleteRelation();

	/**
	 * Returns the meta object for the containment reference '{@link Moml.DocumentRoot#getDirector <em>Director</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Director</em>'.
	 * @see Moml.DocumentRoot#getDirector()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Director();

	/**
	 * Returns the meta object for the containment reference '{@link Moml.DocumentRoot#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doc</em>'.
	 * @see Moml.DocumentRoot#getDoc()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Doc();

	/**
	 * Returns the meta object for the containment reference '{@link Moml.DocumentRoot#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity</em>'.
	 * @see Moml.DocumentRoot#getEntity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Entity();

	/**
	 * Returns the meta object for the containment reference '{@link Moml.DocumentRoot#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group</em>'.
	 * @see Moml.DocumentRoot#getGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Group();

	/**
	 * Returns the meta object for the containment reference '{@link Moml.DocumentRoot#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Import</em>'.
	 * @see Moml.DocumentRoot#getImport()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Import();

	/**
	 * Returns the meta object for the containment reference '{@link Moml.DocumentRoot#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see Moml.DocumentRoot#getInput()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Input();

	/**
	 * Returns the meta object for the containment reference '{@link Moml.DocumentRoot#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link</em>'.
	 * @see Moml.DocumentRoot#getLink()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Link();

	/**
	 * Returns the meta object for the containment reference '{@link Moml.DocumentRoot#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see Moml.DocumentRoot#getLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Location();

	/**
	 * Returns the meta object for the containment reference '{@link Moml.DocumentRoot#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model</em>'.
	 * @see Moml.DocumentRoot#getModel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Model();

	/**
	 * Returns the meta object for the containment reference '{@link Moml.DocumentRoot#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Port</em>'.
	 * @see Moml.DocumentRoot#getPort()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Port();

	/**
	 * Returns the meta object for the containment reference '{@link Moml.DocumentRoot#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see Moml.DocumentRoot#getProperty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Property();

	/**
	 * Returns the meta object for the containment reference '{@link Moml.DocumentRoot#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relation</em>'.
	 * @see Moml.DocumentRoot#getRelation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Relation();

	/**
	 * Returns the meta object for the containment reference '{@link Moml.DocumentRoot#getRename <em>Rename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rename</em>'.
	 * @see Moml.DocumentRoot#getRename()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Rename();

	/**
	 * Returns the meta object for the containment reference '{@link Moml.DocumentRoot#getRendition <em>Rendition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rendition</em>'.
	 * @see Moml.DocumentRoot#getRendition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Rendition();

	/**
	 * Returns the meta object for the containment reference '{@link Moml.DocumentRoot#getUnlink <em>Unlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unlink</em>'.
	 * @see Moml.DocumentRoot#getUnlink()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Unlink();

	/**
	 * Returns the meta object for the containment reference '{@link Moml.DocumentRoot#getVertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vertex</em>'.
	 * @see Moml.DocumentRoot#getVertex()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Vertex();

	/**
	 * Returns the meta object for class '{@link Moml.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Type</em>'.
	 * @see Moml.EntityType
	 * @generated
	 */
	EClass getEntityType();

	/**
	 * Returns the meta object for the attribute list '{@link Moml.EntityType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see Moml.EntityType#getGroup()
	 * @see #getEntityType()
	 * @generated
	 */
	EAttribute getEntityType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.EntityType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class</em>'.
	 * @see Moml.EntityType#getClass_()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Class();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.EntityType#getConfigure <em>Configure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configure</em>'.
	 * @see Moml.EntityType#getConfigure()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Configure();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.EntityType#getDeleteEntity <em>Delete Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delete Entity</em>'.
	 * @see Moml.EntityType#getDeleteEntity()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_DeleteEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.EntityType#getDeletePort <em>Delete Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delete Port</em>'.
	 * @see Moml.EntityType#getDeletePort()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_DeletePort();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.EntityType#getDeleteRelation <em>Delete Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delete Relation</em>'.
	 * @see Moml.EntityType#getDeleteRelation()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_DeleteRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.EntityType#getDirector <em>Director</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Director</em>'.
	 * @see Moml.EntityType#getDirector()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Director();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.EntityType#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Doc</em>'.
	 * @see Moml.EntityType#getDoc()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Doc();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.EntityType#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity</em>'.
	 * @see Moml.EntityType#getEntity()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.EntityType#getGroup1 <em>Group1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group1</em>'.
	 * @see Moml.EntityType#getGroup1()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Group1();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.EntityType#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import</em>'.
	 * @see Moml.EntityType#getImport()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Import();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.EntityType#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see Moml.EntityType#getInput()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.EntityType#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see Moml.EntityType#getLink()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.EntityType#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see Moml.EntityType#getPort()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Port();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.EntityType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see Moml.EntityType#getProperty()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.EntityType#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation</em>'.
	 * @see Moml.EntityType#getRelation()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Relation();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.EntityType#getRename <em>Rename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rename</em>'.
	 * @see Moml.EntityType#getRename()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Rename();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.EntityType#getRendition <em>Rendition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rendition</em>'.
	 * @see Moml.EntityType#getRendition()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Rendition();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.EntityType#getUnlink <em>Unlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unlink</em>'.
	 * @see Moml.EntityType#getUnlink()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Unlink();

	/**
	 * Returns the meta object for the attribute '{@link Moml.EntityType#getClass1 <em>Class1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class1</em>'.
	 * @see Moml.EntityType#getClass1()
	 * @see #getEntityType()
	 * @generated
	 */
	EAttribute getEntityType_Class1();

	/**
	 * Returns the meta object for the attribute '{@link Moml.EntityType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Moml.EntityType#getName()
	 * @see #getEntityType()
	 * @generated
	 */
	EAttribute getEntityType_Name();

	/**
	 * Returns the meta object for the attribute '{@link Moml.EntityType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see Moml.EntityType#getSource()
	 * @see #getEntityType()
	 * @generated
	 */
	EAttribute getEntityType_Source();

	/**
	 * Returns the meta object for class '{@link Moml.GroupType <em>Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Type</em>'.
	 * @see Moml.GroupType
	 * @generated
	 */
	EClass getGroupType();

	/**
	 * Returns the meta object for the attribute '{@link Moml.GroupType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Moml.GroupType#getName()
	 * @see #getGroupType()
	 * @generated
	 */
	EAttribute getGroupType_Name();

	/**
	 * Returns the meta object for class '{@link Moml.ImportType <em>Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Type</em>'.
	 * @see Moml.ImportType
	 * @generated
	 */
	EClass getImportType();

	/**
	 * Returns the meta object for the attribute '{@link Moml.ImportType#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base</em>'.
	 * @see Moml.ImportType#getBase()
	 * @see #getImportType()
	 * @generated
	 */
	EAttribute getImportType_Base();

	/**
	 * Returns the meta object for the attribute '{@link Moml.ImportType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see Moml.ImportType#getSource()
	 * @see #getImportType()
	 * @generated
	 */
	EAttribute getImportType_Source();

	/**
	 * Returns the meta object for class '{@link Moml.InputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Type</em>'.
	 * @see Moml.InputType
	 * @generated
	 */
	EClass getInputType();

	/**
	 * Returns the meta object for the attribute '{@link Moml.InputType#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base</em>'.
	 * @see Moml.InputType#getBase()
	 * @see #getInputType()
	 * @generated
	 */
	EAttribute getInputType_Base();

	/**
	 * Returns the meta object for the attribute '{@link Moml.InputType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see Moml.InputType#getSource()
	 * @see #getInputType()
	 * @generated
	 */
	EAttribute getInputType_Source();

	/**
	 * Returns the meta object for class '{@link Moml.LinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Type</em>'.
	 * @see Moml.LinkType
	 * @generated
	 */
	EClass getLinkType();

	/**
	 * Returns the meta object for the attribute '{@link Moml.LinkType#getInsertAt <em>Insert At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert At</em>'.
	 * @see Moml.LinkType#getInsertAt()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_InsertAt();

	/**
	 * Returns the meta object for the attribute '{@link Moml.LinkType#getInsertInsideAt <em>Insert Inside At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert Inside At</em>'.
	 * @see Moml.LinkType#getInsertInsideAt()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_InsertInsideAt();

	/**
	 * Returns the meta object for the attribute '{@link Moml.LinkType#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see Moml.LinkType#getPort()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_Port();

	/**
	 * Returns the meta object for the attribute '{@link Moml.LinkType#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation</em>'.
	 * @see Moml.LinkType#getRelation()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_Relation();

	/**
	 * Returns the meta object for the attribute '{@link Moml.LinkType#getRelation1 <em>Relation1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation1</em>'.
	 * @see Moml.LinkType#getRelation1()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_Relation1();

	/**
	 * Returns the meta object for the attribute '{@link Moml.LinkType#getRelation2 <em>Relation2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation2</em>'.
	 * @see Moml.LinkType#getRelation2()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_Relation2();

	/**
	 * Returns the meta object for the attribute '{@link Moml.LinkType#getVertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertex</em>'.
	 * @see Moml.LinkType#getVertex()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_Vertex();

	/**
	 * Returns the meta object for class '{@link Moml.LocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Type</em>'.
	 * @see Moml.LocationType
	 * @generated
	 */
	EClass getLocationType();

	/**
	 * Returns the meta object for the attribute '{@link Moml.LocationType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Moml.LocationType#getValue()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_Value();

	/**
	 * Returns the meta object for class '{@link Moml.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Type</em>'.
	 * @see Moml.ModelType
	 * @generated
	 */
	EClass getModelType();

	/**
	 * Returns the meta object for the attribute list '{@link Moml.ModelType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see Moml.ModelType#getGroup()
	 * @see #getModelType()
	 * @generated
	 */
	EAttribute getModelType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ModelType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class</em>'.
	 * @see Moml.ModelType#getClass_()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Class();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ModelType#getConfigure <em>Configure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configure</em>'.
	 * @see Moml.ModelType#getConfigure()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Configure();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ModelType#getDeleteEntity <em>Delete Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delete Entity</em>'.
	 * @see Moml.ModelType#getDeleteEntity()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_DeleteEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ModelType#getDeletePort <em>Delete Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delete Port</em>'.
	 * @see Moml.ModelType#getDeletePort()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_DeletePort();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ModelType#getDeleteRelation <em>Delete Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delete Relation</em>'.
	 * @see Moml.ModelType#getDeleteRelation()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_DeleteRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ModelType#getDirector <em>Director</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Director</em>'.
	 * @see Moml.ModelType#getDirector()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Director();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ModelType#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Doc</em>'.
	 * @see Moml.ModelType#getDoc()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Doc();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ModelType#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity</em>'.
	 * @see Moml.ModelType#getEntity()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ModelType#getGroup1 <em>Group1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group1</em>'.
	 * @see Moml.ModelType#getGroup1()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Group1();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ModelType#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import</em>'.
	 * @see Moml.ModelType#getImport()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Import();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ModelType#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see Moml.ModelType#getInput()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ModelType#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see Moml.ModelType#getLink()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ModelType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see Moml.ModelType#getProperty()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ModelType#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation</em>'.
	 * @see Moml.ModelType#getRelation()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Relation();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ModelType#getRename <em>Rename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rename</em>'.
	 * @see Moml.ModelType#getRename()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Rename();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ModelType#getRendition <em>Rendition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rendition</em>'.
	 * @see Moml.ModelType#getRendition()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Rendition();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.ModelType#getUnlink <em>Unlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unlink</em>'.
	 * @see Moml.ModelType#getUnlink()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Unlink();

	/**
	 * Returns the meta object for the attribute '{@link Moml.ModelType#getClass1 <em>Class1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class1</em>'.
	 * @see Moml.ModelType#getClass1()
	 * @see #getModelType()
	 * @generated
	 */
	EAttribute getModelType_Class1();

	/**
	 * Returns the meta object for the attribute '{@link Moml.ModelType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Moml.ModelType#getName()
	 * @see #getModelType()
	 * @generated
	 */
	EAttribute getModelType_Name();

	/**
	 * Returns the meta object for class '{@link Moml.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Type</em>'.
	 * @see Moml.PortType
	 * @generated
	 */
	EClass getPortType();

	/**
	 * Returns the meta object for the attribute list '{@link Moml.PortType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see Moml.PortType#getGroup()
	 * @see #getPortType()
	 * @generated
	 */
	EAttribute getPortType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.PortType#getConfigure <em>Configure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configure</em>'.
	 * @see Moml.PortType#getConfigure()
	 * @see #getPortType()
	 * @generated
	 */
	EReference getPortType_Configure();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.PortType#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Doc</em>'.
	 * @see Moml.PortType#getDoc()
	 * @see #getPortType()
	 * @generated
	 */
	EReference getPortType_Doc();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.PortType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see Moml.PortType#getProperty()
	 * @see #getPortType()
	 * @generated
	 */
	EReference getPortType_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.PortType#getRename <em>Rename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rename</em>'.
	 * @see Moml.PortType#getRename()
	 * @see #getPortType()
	 * @generated
	 */
	EReference getPortType_Rename();

	/**
	 * Returns the meta object for the attribute '{@link Moml.PortType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see Moml.PortType#getClass_()
	 * @see #getPortType()
	 * @generated
	 */
	EAttribute getPortType_Class();

	/**
	 * Returns the meta object for the attribute '{@link Moml.PortType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Moml.PortType#getName()
	 * @see #getPortType()
	 * @generated
	 */
	EAttribute getPortType_Name();

	/**
	 * Returns the meta object for class '{@link Moml.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Type</em>'.
	 * @see Moml.PropertyType
	 * @generated
	 */
	EClass getPropertyType();

	/**
	 * Returns the meta object for the attribute list '{@link Moml.PropertyType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see Moml.PropertyType#getGroup()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.PropertyType#getConfigure <em>Configure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configure</em>'.
	 * @see Moml.PropertyType#getConfigure()
	 * @see #getPropertyType()
	 * @generated
	 */
	EReference getPropertyType_Configure();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.PropertyType#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Doc</em>'.
	 * @see Moml.PropertyType#getDoc()
	 * @see #getPropertyType()
	 * @generated
	 */
	EReference getPropertyType_Doc();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.PropertyType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see Moml.PropertyType#getProperty()
	 * @see #getPropertyType()
	 * @generated
	 */
	EReference getPropertyType_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.PropertyType#getRename <em>Rename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rename</em>'.
	 * @see Moml.PropertyType#getRename()
	 * @see #getPropertyType()
	 * @generated
	 */
	EReference getPropertyType_Rename();

	/**
	 * Returns the meta object for the attribute '{@link Moml.PropertyType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see Moml.PropertyType#getClass_()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Class();

	/**
	 * Returns the meta object for the attribute '{@link Moml.PropertyType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Moml.PropertyType#getName()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Name();

	/**
	 * Returns the meta object for the attribute '{@link Moml.PropertyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Moml.PropertyType#getValue()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Value();

	/**
	 * Returns the meta object for class '{@link Moml.RelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Type</em>'.
	 * @see Moml.RelationType
	 * @generated
	 */
	EClass getRelationType();

	/**
	 * Returns the meta object for the attribute list '{@link Moml.RelationType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see Moml.RelationType#getGroup()
	 * @see #getRelationType()
	 * @generated
	 */
	EAttribute getRelationType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.RelationType#getConfigure <em>Configure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configure</em>'.
	 * @see Moml.RelationType#getConfigure()
	 * @see #getRelationType()
	 * @generated
	 */
	EReference getRelationType_Configure();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.RelationType#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Doc</em>'.
	 * @see Moml.RelationType#getDoc()
	 * @see #getRelationType()
	 * @generated
	 */
	EReference getRelationType_Doc();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.RelationType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see Moml.RelationType#getProperty()
	 * @see #getRelationType()
	 * @generated
	 */
	EReference getRelationType_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.RelationType#getRename <em>Rename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rename</em>'.
	 * @see Moml.RelationType#getRename()
	 * @see #getRelationType()
	 * @generated
	 */
	EReference getRelationType_Rename();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.RelationType#getVertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vertex</em>'.
	 * @see Moml.RelationType#getVertex()
	 * @see #getRelationType()
	 * @generated
	 */
	EReference getRelationType_Vertex();

	/**
	 * Returns the meta object for the attribute '{@link Moml.RelationType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see Moml.RelationType#getClass_()
	 * @see #getRelationType()
	 * @generated
	 */
	EAttribute getRelationType_Class();

	/**
	 * Returns the meta object for the attribute '{@link Moml.RelationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Moml.RelationType#getName()
	 * @see #getRelationType()
	 * @generated
	 */
	EAttribute getRelationType_Name();

	/**
	 * Returns the meta object for class '{@link Moml.RenameType <em>Rename Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename Type</em>'.
	 * @see Moml.RenameType
	 * @generated
	 */
	EClass getRenameType();

	/**
	 * Returns the meta object for the attribute '{@link Moml.RenameType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Moml.RenameType#getName()
	 * @see #getRenameType()
	 * @generated
	 */
	EAttribute getRenameType_Name();

	/**
	 * Returns the meta object for class '{@link Moml.RenditionType <em>Rendition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rendition Type</em>'.
	 * @see Moml.RenditionType
	 * @generated
	 */
	EClass getRenditionType();

	/**
	 * Returns the meta object for the attribute list '{@link Moml.RenditionType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see Moml.RenditionType#getGroup()
	 * @see #getRenditionType()
	 * @generated
	 */
	EAttribute getRenditionType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.RenditionType#getConfigure <em>Configure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configure</em>'.
	 * @see Moml.RenditionType#getConfigure()
	 * @see #getRenditionType()
	 * @generated
	 */
	EReference getRenditionType_Configure();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.RenditionType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location</em>'.
	 * @see Moml.RenditionType#getLocation()
	 * @see #getRenditionType()
	 * @generated
	 */
	EReference getRenditionType_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.RenditionType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see Moml.RenditionType#getProperty()
	 * @see #getRenditionType()
	 * @generated
	 */
	EReference getRenditionType_Property();

	/**
	 * Returns the meta object for the attribute '{@link Moml.RenditionType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see Moml.RenditionType#getClass_()
	 * @see #getRenditionType()
	 * @generated
	 */
	EAttribute getRenditionType_Class();

	/**
	 * Returns the meta object for class '{@link Moml.UnlinkType <em>Unlink Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unlink Type</em>'.
	 * @see Moml.UnlinkType
	 * @generated
	 */
	EClass getUnlinkType();

	/**
	 * Returns the meta object for the attribute '{@link Moml.UnlinkType#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see Moml.UnlinkType#getIndex()
	 * @see #getUnlinkType()
	 * @generated
	 */
	EAttribute getUnlinkType_Index();

	/**
	 * Returns the meta object for the attribute '{@link Moml.UnlinkType#getInsideIndex <em>Inside Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inside Index</em>'.
	 * @see Moml.UnlinkType#getInsideIndex()
	 * @see #getUnlinkType()
	 * @generated
	 */
	EAttribute getUnlinkType_InsideIndex();

	/**
	 * Returns the meta object for the attribute '{@link Moml.UnlinkType#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see Moml.UnlinkType#getPort()
	 * @see #getUnlinkType()
	 * @generated
	 */
	EAttribute getUnlinkType_Port();

	/**
	 * Returns the meta object for the attribute '{@link Moml.UnlinkType#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation</em>'.
	 * @see Moml.UnlinkType#getRelation()
	 * @see #getUnlinkType()
	 * @generated
	 */
	EAttribute getUnlinkType_Relation();

	/**
	 * Returns the meta object for the attribute '{@link Moml.UnlinkType#getRelation1 <em>Relation1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation1</em>'.
	 * @see Moml.UnlinkType#getRelation1()
	 * @see #getUnlinkType()
	 * @generated
	 */
	EAttribute getUnlinkType_Relation1();

	/**
	 * Returns the meta object for the attribute '{@link Moml.UnlinkType#getRelation2 <em>Relation2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation2</em>'.
	 * @see Moml.UnlinkType#getRelation2()
	 * @see #getUnlinkType()
	 * @generated
	 */
	EAttribute getUnlinkType_Relation2();

	/**
	 * Returns the meta object for class '{@link Moml.VertexType <em>Vertex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex Type</em>'.
	 * @see Moml.VertexType
	 * @generated
	 */
	EClass getVertexType();

	/**
	 * Returns the meta object for the attribute list '{@link Moml.VertexType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see Moml.VertexType#getGroup()
	 * @see #getVertexType()
	 * @generated
	 */
	EAttribute getVertexType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.VertexType#getConfigure <em>Configure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configure</em>'.
	 * @see Moml.VertexType#getConfigure()
	 * @see #getVertexType()
	 * @generated
	 */
	EReference getVertexType_Configure();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.VertexType#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Doc</em>'.
	 * @see Moml.VertexType#getDoc()
	 * @see #getVertexType()
	 * @generated
	 */
	EReference getVertexType_Doc();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.VertexType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location</em>'.
	 * @see Moml.VertexType#getLocation()
	 * @see #getVertexType()
	 * @generated
	 */
	EReference getVertexType_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.VertexType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see Moml.VertexType#getProperty()
	 * @see #getVertexType()
	 * @generated
	 */
	EReference getVertexType_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link Moml.VertexType#getRename <em>Rename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rename</em>'.
	 * @see Moml.VertexType#getRename()
	 * @see #getVertexType()
	 * @generated
	 */
	EReference getVertexType_Rename();

	/**
	 * Returns the meta object for the attribute '{@link Moml.VertexType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Moml.VertexType#getName()
	 * @see #getVertexType()
	 * @generated
	 */
	EAttribute getVertexType_Name();

	/**
	 * Returns the meta object for the attribute '{@link Moml.VertexType#getPathTo <em>Path To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path To</em>'.
	 * @see Moml.VertexType#getPathTo()
	 * @see #getVertexType()
	 * @generated
	 */
	EAttribute getVertexType_PathTo();

	/**
	 * Returns the meta object for the attribute '{@link Moml.VertexType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Moml.VertexType#getValue()
	 * @see #getVertexType()
	 * @generated
	 */
	EAttribute getVertexType_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MomlFactory getMomlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Moml.impl.AnyImpl <em>Any</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Moml.impl.AnyImpl
		 * @see Moml.impl.MomlPackageImpl#getAny()
		 * @generated
		 */
		EClass ANY = eINSTANCE.getAny();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY__MIXED = eINSTANCE.getAny_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY__ANY = eINSTANCE.getAny_Any();

		/**
		 * The meta object literal for the '{@link Moml.impl.ClassTypeImpl <em>Class Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Moml.impl.ClassTypeImpl
		 * @see Moml.impl.MomlPackageImpl#getClassType()
		 * @generated
		 */
		EClass CLASS_TYPE = eINSTANCE.getClassType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_TYPE__GROUP = eINSTANCE.getClassType_Group();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_TYPE__CLASS = eINSTANCE.getClassType_Class();

		/**
		 * The meta object literal for the '<em><b>Configure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_TYPE__CONFIGURE = eINSTANCE.getClassType_Configure();

		/**
		 * The meta object literal for the '<em><b>Delete Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_TYPE__DELETE_ENTITY = eINSTANCE.getClassType_DeleteEntity();

		/**
		 * The meta object literal for the '<em><b>Delete Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_TYPE__DELETE_PORT = eINSTANCE.getClassType_DeletePort();

		/**
		 * The meta object literal for the '<em><b>Delete Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_TYPE__DELETE_RELATION = eINSTANCE.getClassType_DeleteRelation();

		/**
		 * The meta object literal for the '<em><b>Director</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_TYPE__DIRECTOR = eINSTANCE.getClassType_Director();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_TYPE__DOC = eINSTANCE.getClassType_Doc();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_TYPE__ENTITY = eINSTANCE.getClassType_Entity();

		/**
		 * The meta object literal for the '<em><b>Group1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_TYPE__GROUP1 = eINSTANCE.getClassType_Group1();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_TYPE__IMPORT = eINSTANCE.getClassType_Import();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_TYPE__INPUT = eINSTANCE.getClassType_Input();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_TYPE__LINK = eINSTANCE.getClassType_Link();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_TYPE__PORT = eINSTANCE.getClassType_Port();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_TYPE__PROPERTY = eINSTANCE.getClassType_Property();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_TYPE__RELATION = eINSTANCE.getClassType_Relation();

		/**
		 * The meta object literal for the '<em><b>Rename</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_TYPE__RENAME = eINSTANCE.getClassType_Rename();

		/**
		 * The meta object literal for the '<em><b>Rendition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_TYPE__RENDITION = eINSTANCE.getClassType_Rendition();

		/**
		 * The meta object literal for the '<em><b>Unlink</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_TYPE__UNLINK = eINSTANCE.getClassType_Unlink();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_TYPE__EXTENDS = eINSTANCE.getClassType_Extends();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_TYPE__NAME = eINSTANCE.getClassType_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_TYPE__SOURCE = eINSTANCE.getClassType_Source();

		/**
		 * The meta object literal for the '{@link Moml.impl.ConfigureTypeImpl <em>Configure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Moml.impl.ConfigureTypeImpl
		 * @see Moml.impl.MomlPackageImpl#getConfigureType()
		 * @generated
		 */
		EClass CONFIGURE_TYPE = eINSTANCE.getConfigureType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURE_TYPE__MIXED = eINSTANCE.getConfigureType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURE_TYPE__SOURCE = eINSTANCE.getConfigureType_Source();

		/**
		 * The meta object literal for the '{@link Moml.impl.DeleteEntityTypeImpl <em>Delete Entity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Moml.impl.DeleteEntityTypeImpl
		 * @see Moml.impl.MomlPackageImpl#getDeleteEntityType()
		 * @generated
		 */
		EClass DELETE_ENTITY_TYPE = eINSTANCE.getDeleteEntityType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_ENTITY_TYPE__NAME = eINSTANCE.getDeleteEntityType_Name();

		/**
		 * The meta object literal for the '{@link Moml.impl.DeletePortTypeImpl <em>Delete Port Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Moml.impl.DeletePortTypeImpl
		 * @see Moml.impl.MomlPackageImpl#getDeletePortType()
		 * @generated
		 */
		EClass DELETE_PORT_TYPE = eINSTANCE.getDeletePortType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_PORT_TYPE__NAME = eINSTANCE.getDeletePortType_Name();

		/**
		 * The meta object literal for the '{@link Moml.impl.DeletePropertyTypeImpl <em>Delete Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Moml.impl.DeletePropertyTypeImpl
		 * @see Moml.impl.MomlPackageImpl#getDeletePropertyType()
		 * @generated
		 */
		EClass DELETE_PROPERTY_TYPE = eINSTANCE.getDeletePropertyType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_PROPERTY_TYPE__NAME = eINSTANCE.getDeletePropertyType_Name();

		/**
		 * The meta object literal for the '{@link Moml.impl.DeleteRelationTypeImpl <em>Delete Relation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Moml.impl.DeleteRelationTypeImpl
		 * @see Moml.impl.MomlPackageImpl#getDeleteRelationType()
		 * @generated
		 */
		EClass DELETE_RELATION_TYPE = eINSTANCE.getDeleteRelationType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_RELATION_TYPE__NAME = eINSTANCE.getDeleteRelationType_Name();

		/**
		 * The meta object literal for the '{@link Moml.impl.DirectorTypeImpl <em>Director Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Moml.impl.DirectorTypeImpl
		 * @see Moml.impl.MomlPackageImpl#getDirectorType()
		 * @generated
		 */
		EClass DIRECTOR_TYPE = eINSTANCE.getDirectorType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTOR_TYPE__GROUP = eINSTANCE.getDirectorType_Group();

		/**
		 * The meta object literal for the '<em><b>Configure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTOR_TYPE__CONFIGURE = eINSTANCE.getDirectorType_Configure();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTOR_TYPE__DOC = eINSTANCE.getDirectorType_Doc();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTOR_TYPE__PROPERTY = eINSTANCE.getDirectorType_Property();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTOR_TYPE__CLASS = eINSTANCE.getDirectorType_Class();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTOR_TYPE__NAME = eINSTANCE.getDirectorType_Name();

		/**
		 * The meta object literal for the '{@link Moml.impl.DocTypeImpl <em>Doc Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Moml.impl.DocTypeImpl
		 * @see Moml.impl.MomlPackageImpl#getDocType()
		 * @generated
		 */
		EClass DOC_TYPE = eINSTANCE.getDocType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOC_TYPE__MIXED = eINSTANCE.getDocType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOC_TYPE__NAME = eINSTANCE.getDocType_Name();

		/**
		 * The meta object literal for the '{@link Moml.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Moml.impl.DocumentRootImpl
		 * @see Moml.impl.MomlPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLASS = eINSTANCE.getDocumentRoot_Class();

		/**
		 * The meta object literal for the '<em><b>Configure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONFIGURE = eINSTANCE.getDocumentRoot_Configure();

		/**
		 * The meta object literal for the '<em><b>Delete Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DELETE_ENTITY = eINSTANCE.getDocumentRoot_DeleteEntity();

		/**
		 * The meta object literal for the '<em><b>Delete Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DELETE_PORT = eINSTANCE.getDocumentRoot_DeletePort();

		/**
		 * The meta object literal for the '<em><b>Delete Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DELETE_PROPERTY = eINSTANCE.getDocumentRoot_DeleteProperty();

		/**
		 * The meta object literal for the '<em><b>Delete Relation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DELETE_RELATION = eINSTANCE.getDocumentRoot_DeleteRelation();

		/**
		 * The meta object literal for the '<em><b>Director</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DIRECTOR = eINSTANCE.getDocumentRoot_Director();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOC = eINSTANCE.getDocumentRoot_Doc();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENTITY = eINSTANCE.getDocumentRoot_Entity();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GROUP = eINSTANCE.getDocumentRoot_Group();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IMPORT = eINSTANCE.getDocumentRoot_Import();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INPUT = eINSTANCE.getDocumentRoot_Input();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LINK = eINSTANCE.getDocumentRoot_Link();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOCATION = eINSTANCE.getDocumentRoot_Location();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MODEL = eINSTANCE.getDocumentRoot_Model();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PORT = eINSTANCE.getDocumentRoot_Port();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY = eINSTANCE.getDocumentRoot_Property();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RELATION = eINSTANCE.getDocumentRoot_Relation();

		/**
		 * The meta object literal for the '<em><b>Rename</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RENAME = eINSTANCE.getDocumentRoot_Rename();

		/**
		 * The meta object literal for the '<em><b>Rendition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RENDITION = eINSTANCE.getDocumentRoot_Rendition();

		/**
		 * The meta object literal for the '<em><b>Unlink</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UNLINK = eINSTANCE.getDocumentRoot_Unlink();

		/**
		 * The meta object literal for the '<em><b>Vertex</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VERTEX = eINSTANCE.getDocumentRoot_Vertex();

		/**
		 * The meta object literal for the '{@link Moml.impl.EntityTypeImpl <em>Entity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Moml.impl.EntityTypeImpl
		 * @see Moml.impl.MomlPackageImpl#getEntityType()
		 * @generated
		 */
		EClass ENTITY_TYPE = eINSTANCE.getEntityType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_TYPE__GROUP = eINSTANCE.getEntityType_Group();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__CLASS = eINSTANCE.getEntityType_Class();

		/**
		 * The meta object literal for the '<em><b>Configure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__CONFIGURE = eINSTANCE.getEntityType_Configure();

		/**
		 * The meta object literal for the '<em><b>Delete Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__DELETE_ENTITY = eINSTANCE.getEntityType_DeleteEntity();

		/**
		 * The meta object literal for the '<em><b>Delete Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__DELETE_PORT = eINSTANCE.getEntityType_DeletePort();

		/**
		 * The meta object literal for the '<em><b>Delete Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__DELETE_RELATION = eINSTANCE.getEntityType_DeleteRelation();

		/**
		 * The meta object literal for the '<em><b>Director</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__DIRECTOR = eINSTANCE.getEntityType_Director();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__DOC = eINSTANCE.getEntityType_Doc();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__ENTITY = eINSTANCE.getEntityType_Entity();

		/**
		 * The meta object literal for the '<em><b>Group1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__GROUP1 = eINSTANCE.getEntityType_Group1();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__IMPORT = eINSTANCE.getEntityType_Import();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__INPUT = eINSTANCE.getEntityType_Input();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__LINK = eINSTANCE.getEntityType_Link();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__PORT = eINSTANCE.getEntityType_Port();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__PROPERTY = eINSTANCE.getEntityType_Property();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__RELATION = eINSTANCE.getEntityType_Relation();

		/**
		 * The meta object literal for the '<em><b>Rename</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__RENAME = eINSTANCE.getEntityType_Rename();

		/**
		 * The meta object literal for the '<em><b>Rendition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__RENDITION = eINSTANCE.getEntityType_Rendition();

		/**
		 * The meta object literal for the '<em><b>Unlink</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__UNLINK = eINSTANCE.getEntityType_Unlink();

		/**
		 * The meta object literal for the '<em><b>Class1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_TYPE__CLASS1 = eINSTANCE.getEntityType_Class1();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_TYPE__NAME = eINSTANCE.getEntityType_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_TYPE__SOURCE = eINSTANCE.getEntityType_Source();

		/**
		 * The meta object literal for the '{@link Moml.impl.GroupTypeImpl <em>Group Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Moml.impl.GroupTypeImpl
		 * @see Moml.impl.MomlPackageImpl#getGroupType()
		 * @generated
		 */
		EClass GROUP_TYPE = eINSTANCE.getGroupType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_TYPE__NAME = eINSTANCE.getGroupType_Name();

		/**
		 * The meta object literal for the '{@link Moml.impl.ImportTypeImpl <em>Import Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Moml.impl.ImportTypeImpl
		 * @see Moml.impl.MomlPackageImpl#getImportType()
		 * @generated
		 */
		EClass IMPORT_TYPE = eINSTANCE.getImportType();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_TYPE__BASE = eINSTANCE.getImportType_Base();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_TYPE__SOURCE = eINSTANCE.getImportType_Source();

		/**
		 * The meta object literal for the '{@link Moml.impl.InputTypeImpl <em>Input Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Moml.impl.InputTypeImpl
		 * @see Moml.impl.MomlPackageImpl#getInputType()
		 * @generated
		 */
		EClass INPUT_TYPE = eINSTANCE.getInputType();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_TYPE__BASE = eINSTANCE.getInputType_Base();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_TYPE__SOURCE = eINSTANCE.getInputType_Source();

		/**
		 * The meta object literal for the '{@link Moml.impl.LinkTypeImpl <em>Link Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Moml.impl.LinkTypeImpl
		 * @see Moml.impl.MomlPackageImpl#getLinkType()
		 * @generated
		 */
		EClass LINK_TYPE = eINSTANCE.getLinkType();

		/**
		 * The meta object literal for the '<em><b>Insert At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__INSERT_AT = eINSTANCE.getLinkType_InsertAt();

		/**
		 * The meta object literal for the '<em><b>Insert Inside At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__INSERT_INSIDE_AT = eINSTANCE.getLinkType_InsertInsideAt();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__PORT = eINSTANCE.getLinkType_Port();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__RELATION = eINSTANCE.getLinkType_Relation();

		/**
		 * The meta object literal for the '<em><b>Relation1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__RELATION1 = eINSTANCE.getLinkType_Relation1();

		/**
		 * The meta object literal for the '<em><b>Relation2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__RELATION2 = eINSTANCE.getLinkType_Relation2();

		/**
		 * The meta object literal for the '<em><b>Vertex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__VERTEX = eINSTANCE.getLinkType_Vertex();

		/**
		 * The meta object literal for the '{@link Moml.impl.LocationTypeImpl <em>Location Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Moml.impl.LocationTypeImpl
		 * @see Moml.impl.MomlPackageImpl#getLocationType()
		 * @generated
		 */
		EClass LOCATION_TYPE = eINSTANCE.getLocationType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TYPE__VALUE = eINSTANCE.getLocationType_Value();

		/**
		 * The meta object literal for the '{@link Moml.impl.ModelTypeImpl <em>Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Moml.impl.ModelTypeImpl
		 * @see Moml.impl.MomlPackageImpl#getModelType()
		 * @generated
		 */
		EClass MODEL_TYPE = eINSTANCE.getModelType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_TYPE__GROUP = eINSTANCE.getModelType_Group();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__CLASS = eINSTANCE.getModelType_Class();

		/**
		 * The meta object literal for the '<em><b>Configure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__CONFIGURE = eINSTANCE.getModelType_Configure();

		/**
		 * The meta object literal for the '<em><b>Delete Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__DELETE_ENTITY = eINSTANCE.getModelType_DeleteEntity();

		/**
		 * The meta object literal for the '<em><b>Delete Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__DELETE_PORT = eINSTANCE.getModelType_DeletePort();

		/**
		 * The meta object literal for the '<em><b>Delete Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__DELETE_RELATION = eINSTANCE.getModelType_DeleteRelation();

		/**
		 * The meta object literal for the '<em><b>Director</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__DIRECTOR = eINSTANCE.getModelType_Director();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__DOC = eINSTANCE.getModelType_Doc();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__ENTITY = eINSTANCE.getModelType_Entity();

		/**
		 * The meta object literal for the '<em><b>Group1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__GROUP1 = eINSTANCE.getModelType_Group1();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__IMPORT = eINSTANCE.getModelType_Import();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__INPUT = eINSTANCE.getModelType_Input();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__LINK = eINSTANCE.getModelType_Link();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__PROPERTY = eINSTANCE.getModelType_Property();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__RELATION = eINSTANCE.getModelType_Relation();

		/**
		 * The meta object literal for the '<em><b>Rename</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__RENAME = eINSTANCE.getModelType_Rename();

		/**
		 * The meta object literal for the '<em><b>Rendition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__RENDITION = eINSTANCE.getModelType_Rendition();

		/**
		 * The meta object literal for the '<em><b>Unlink</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__UNLINK = eINSTANCE.getModelType_Unlink();

		/**
		 * The meta object literal for the '<em><b>Class1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_TYPE__CLASS1 = eINSTANCE.getModelType_Class1();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_TYPE__NAME = eINSTANCE.getModelType_Name();

		/**
		 * The meta object literal for the '{@link Moml.impl.PortTypeImpl <em>Port Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Moml.impl.PortTypeImpl
		 * @see Moml.impl.MomlPackageImpl#getPortType()
		 * @generated
		 */
		EClass PORT_TYPE = eINSTANCE.getPortType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE__GROUP = eINSTANCE.getPortType_Group();

		/**
		 * The meta object literal for the '<em><b>Configure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_TYPE__CONFIGURE = eINSTANCE.getPortType_Configure();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_TYPE__DOC = eINSTANCE.getPortType_Doc();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_TYPE__PROPERTY = eINSTANCE.getPortType_Property();

		/**
		 * The meta object literal for the '<em><b>Rename</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_TYPE__RENAME = eINSTANCE.getPortType_Rename();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE__CLASS = eINSTANCE.getPortType_Class();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE__NAME = eINSTANCE.getPortType_Name();

		/**
		 * The meta object literal for the '{@link Moml.impl.PropertyTypeImpl <em>Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Moml.impl.PropertyTypeImpl
		 * @see Moml.impl.MomlPackageImpl#getPropertyType()
		 * @generated
		 */
		EClass PROPERTY_TYPE = eINSTANCE.getPropertyType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TYPE__GROUP = eINSTANCE.getPropertyType_Group();

		/**
		 * The meta object literal for the '<em><b>Configure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TYPE__CONFIGURE = eINSTANCE.getPropertyType_Configure();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TYPE__DOC = eINSTANCE.getPropertyType_Doc();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TYPE__PROPERTY = eINSTANCE.getPropertyType_Property();

		/**
		 * The meta object literal for the '<em><b>Rename</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TYPE__RENAME = eINSTANCE.getPropertyType_Rename();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TYPE__CLASS = eINSTANCE.getPropertyType_Class();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TYPE__NAME = eINSTANCE.getPropertyType_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TYPE__VALUE = eINSTANCE.getPropertyType_Value();

		/**
		 * The meta object literal for the '{@link Moml.impl.RelationTypeImpl <em>Relation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Moml.impl.RelationTypeImpl
		 * @see Moml.impl.MomlPackageImpl#getRelationType()
		 * @generated
		 */
		EClass RELATION_TYPE = eINSTANCE.getRelationType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_TYPE__GROUP = eINSTANCE.getRelationType_Group();

		/**
		 * The meta object literal for the '<em><b>Configure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_TYPE__CONFIGURE = eINSTANCE.getRelationType_Configure();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_TYPE__DOC = eINSTANCE.getRelationType_Doc();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_TYPE__PROPERTY = eINSTANCE.getRelationType_Property();

		/**
		 * The meta object literal for the '<em><b>Rename</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_TYPE__RENAME = eINSTANCE.getRelationType_Rename();

		/**
		 * The meta object literal for the '<em><b>Vertex</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_TYPE__VERTEX = eINSTANCE.getRelationType_Vertex();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_TYPE__CLASS = eINSTANCE.getRelationType_Class();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_TYPE__NAME = eINSTANCE.getRelationType_Name();

		/**
		 * The meta object literal for the '{@link Moml.impl.RenameTypeImpl <em>Rename Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Moml.impl.RenameTypeImpl
		 * @see Moml.impl.MomlPackageImpl#getRenameType()
		 * @generated
		 */
		EClass RENAME_TYPE = eINSTANCE.getRenameType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_TYPE__NAME = eINSTANCE.getRenameType_Name();

		/**
		 * The meta object literal for the '{@link Moml.impl.RenditionTypeImpl <em>Rendition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Moml.impl.RenditionTypeImpl
		 * @see Moml.impl.MomlPackageImpl#getRenditionType()
		 * @generated
		 */
		EClass RENDITION_TYPE = eINSTANCE.getRenditionType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENDITION_TYPE__GROUP = eINSTANCE.getRenditionType_Group();

		/**
		 * The meta object literal for the '<em><b>Configure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENDITION_TYPE__CONFIGURE = eINSTANCE.getRenditionType_Configure();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENDITION_TYPE__LOCATION = eINSTANCE.getRenditionType_Location();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENDITION_TYPE__PROPERTY = eINSTANCE.getRenditionType_Property();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENDITION_TYPE__CLASS = eINSTANCE.getRenditionType_Class();

		/**
		 * The meta object literal for the '{@link Moml.impl.UnlinkTypeImpl <em>Unlink Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Moml.impl.UnlinkTypeImpl
		 * @see Moml.impl.MomlPackageImpl#getUnlinkType()
		 * @generated
		 */
		EClass UNLINK_TYPE = eINSTANCE.getUnlinkType();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNLINK_TYPE__INDEX = eINSTANCE.getUnlinkType_Index();

		/**
		 * The meta object literal for the '<em><b>Inside Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNLINK_TYPE__INSIDE_INDEX = eINSTANCE.getUnlinkType_InsideIndex();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNLINK_TYPE__PORT = eINSTANCE.getUnlinkType_Port();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNLINK_TYPE__RELATION = eINSTANCE.getUnlinkType_Relation();

		/**
		 * The meta object literal for the '<em><b>Relation1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNLINK_TYPE__RELATION1 = eINSTANCE.getUnlinkType_Relation1();

		/**
		 * The meta object literal for the '<em><b>Relation2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNLINK_TYPE__RELATION2 = eINSTANCE.getUnlinkType_Relation2();

		/**
		 * The meta object literal for the '{@link Moml.impl.VertexTypeImpl <em>Vertex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Moml.impl.VertexTypeImpl
		 * @see Moml.impl.MomlPackageImpl#getVertexType()
		 * @generated
		 */
		EClass VERTEX_TYPE = eINSTANCE.getVertexType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTEX_TYPE__GROUP = eINSTANCE.getVertexType_Group();

		/**
		 * The meta object literal for the '<em><b>Configure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX_TYPE__CONFIGURE = eINSTANCE.getVertexType_Configure();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX_TYPE__DOC = eINSTANCE.getVertexType_Doc();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX_TYPE__LOCATION = eINSTANCE.getVertexType_Location();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX_TYPE__PROPERTY = eINSTANCE.getVertexType_Property();

		/**
		 * The meta object literal for the '<em><b>Rename</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX_TYPE__RENAME = eINSTANCE.getVertexType_Rename();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTEX_TYPE__NAME = eINSTANCE.getVertexType_Name();

		/**
		 * The meta object literal for the '<em><b>Path To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTEX_TYPE__PATH_TO = eINSTANCE.getVertexType_PathTo();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTEX_TYPE__VALUE = eINSTANCE.getVertexType_Value();

	}

} //MomlPackage
