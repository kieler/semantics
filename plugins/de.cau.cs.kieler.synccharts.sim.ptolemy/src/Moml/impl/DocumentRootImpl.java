/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Moml.impl;

import Moml.ClassType;
import Moml.ConfigureType;
import Moml.DeleteEntityType;
import Moml.DeletePortType;
import Moml.DeletePropertyType;
import Moml.DeleteRelationType;
import Moml.DirectorType;
import Moml.DocType;
import Moml.DocumentRoot;
import Moml.EntityType;
import Moml.GroupType;
import Moml.ImportType;
import Moml.InputType;
import Moml.LinkType;
import Moml.LocationType;
import Moml.ModelType;
import Moml.MomlPackage;
import Moml.PortType;
import Moml.PropertyType;
import Moml.RelationType;
import Moml.RenameType;
import Moml.RenditionType;
import Moml.UnlinkType;
import Moml.VertexType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Moml.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link Moml.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link Moml.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link Moml.impl.DocumentRootImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link Moml.impl.DocumentRootImpl#getConfigure <em>Configure</em>}</li>
 *   <li>{@link Moml.impl.DocumentRootImpl#getDeleteEntity <em>Delete Entity</em>}</li>
 *   <li>{@link Moml.impl.DocumentRootImpl#getDeletePort <em>Delete Port</em>}</li>
 *   <li>{@link Moml.impl.DocumentRootImpl#getDeleteProperty <em>Delete Property</em>}</li>
 *   <li>{@link Moml.impl.DocumentRootImpl#getDeleteRelation <em>Delete Relation</em>}</li>
 *   <li>{@link Moml.impl.DocumentRootImpl#getDirector <em>Director</em>}</li>
 *   <li>{@link Moml.impl.DocumentRootImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link Moml.impl.DocumentRootImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link Moml.impl.DocumentRootImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link Moml.impl.DocumentRootImpl#getImport <em>Import</em>}</li>
 *   <li>{@link Moml.impl.DocumentRootImpl#getInput <em>Input</em>}</li>
 *   <li>{@link Moml.impl.DocumentRootImpl#getLink <em>Link</em>}</li>
 *   <li>{@link Moml.impl.DocumentRootImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link Moml.impl.DocumentRootImpl#getModel <em>Model</em>}</li>
 *   <li>{@link Moml.impl.DocumentRootImpl#getPort <em>Port</em>}</li>
 *   <li>{@link Moml.impl.DocumentRootImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link Moml.impl.DocumentRootImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link Moml.impl.DocumentRootImpl#getRename <em>Rename</em>}</li>
 *   <li>{@link Moml.impl.DocumentRootImpl#getRendition <em>Rendition</em>}</li>
 *   <li>{@link Moml.impl.DocumentRootImpl#getUnlink <em>Unlink</em>}</li>
 *   <li>{@link Moml.impl.DocumentRootImpl#getVertex <em>Vertex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MomlPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, MomlPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, MomlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, MomlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType getClass_() {
		return (ClassType)getMixed().get(MomlPackage.Literals.DOCUMENT_ROOT__CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(ClassType newClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MomlPackage.Literals.DOCUMENT_ROOT__CLASS, newClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(ClassType newClass) {
		((FeatureMap.Internal)getMixed()).set(MomlPackage.Literals.DOCUMENT_ROOT__CLASS, newClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigureType getConfigure() {
		return (ConfigureType)getMixed().get(MomlPackage.Literals.DOCUMENT_ROOT__CONFIGURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigure(ConfigureType newConfigure, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MomlPackage.Literals.DOCUMENT_ROOT__CONFIGURE, newConfigure, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigure(ConfigureType newConfigure) {
		((FeatureMap.Internal)getMixed()).set(MomlPackage.Literals.DOCUMENT_ROOT__CONFIGURE, newConfigure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteEntityType getDeleteEntity() {
		return (DeleteEntityType)getMixed().get(MomlPackage.Literals.DOCUMENT_ROOT__DELETE_ENTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeleteEntity(DeleteEntityType newDeleteEntity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MomlPackage.Literals.DOCUMENT_ROOT__DELETE_ENTITY, newDeleteEntity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteEntity(DeleteEntityType newDeleteEntity) {
		((FeatureMap.Internal)getMixed()).set(MomlPackage.Literals.DOCUMENT_ROOT__DELETE_ENTITY, newDeleteEntity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeletePortType getDeletePort() {
		return (DeletePortType)getMixed().get(MomlPackage.Literals.DOCUMENT_ROOT__DELETE_PORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeletePort(DeletePortType newDeletePort, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MomlPackage.Literals.DOCUMENT_ROOT__DELETE_PORT, newDeletePort, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeletePort(DeletePortType newDeletePort) {
		((FeatureMap.Internal)getMixed()).set(MomlPackage.Literals.DOCUMENT_ROOT__DELETE_PORT, newDeletePort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeletePropertyType getDeleteProperty() {
		return (DeletePropertyType)getMixed().get(MomlPackage.Literals.DOCUMENT_ROOT__DELETE_PROPERTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeleteProperty(DeletePropertyType newDeleteProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MomlPackage.Literals.DOCUMENT_ROOT__DELETE_PROPERTY, newDeleteProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteProperty(DeletePropertyType newDeleteProperty) {
		((FeatureMap.Internal)getMixed()).set(MomlPackage.Literals.DOCUMENT_ROOT__DELETE_PROPERTY, newDeleteProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteRelationType getDeleteRelation() {
		return (DeleteRelationType)getMixed().get(MomlPackage.Literals.DOCUMENT_ROOT__DELETE_RELATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeleteRelation(DeleteRelationType newDeleteRelation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MomlPackage.Literals.DOCUMENT_ROOT__DELETE_RELATION, newDeleteRelation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteRelation(DeleteRelationType newDeleteRelation) {
		((FeatureMap.Internal)getMixed()).set(MomlPackage.Literals.DOCUMENT_ROOT__DELETE_RELATION, newDeleteRelation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectorType getDirector() {
		return (DirectorType)getMixed().get(MomlPackage.Literals.DOCUMENT_ROOT__DIRECTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirector(DirectorType newDirector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MomlPackage.Literals.DOCUMENT_ROOT__DIRECTOR, newDirector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirector(DirectorType newDirector) {
		((FeatureMap.Internal)getMixed()).set(MomlPackage.Literals.DOCUMENT_ROOT__DIRECTOR, newDirector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocType getDoc() {
		return (DocType)getMixed().get(MomlPackage.Literals.DOCUMENT_ROOT__DOC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoc(DocType newDoc, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MomlPackage.Literals.DOCUMENT_ROOT__DOC, newDoc, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoc(DocType newDoc) {
		((FeatureMap.Internal)getMixed()).set(MomlPackage.Literals.DOCUMENT_ROOT__DOC, newDoc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType getEntity() {
		return (EntityType)getMixed().get(MomlPackage.Literals.DOCUMENT_ROOT__ENTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity(EntityType newEntity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MomlPackage.Literals.DOCUMENT_ROOT__ENTITY, newEntity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(EntityType newEntity) {
		((FeatureMap.Internal)getMixed()).set(MomlPackage.Literals.DOCUMENT_ROOT__ENTITY, newEntity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupType getGroup() {
		return (GroupType)getMixed().get(MomlPackage.Literals.DOCUMENT_ROOT__GROUP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(GroupType newGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MomlPackage.Literals.DOCUMENT_ROOT__GROUP, newGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(GroupType newGroup) {
		((FeatureMap.Internal)getMixed()).set(MomlPackage.Literals.DOCUMENT_ROOT__GROUP, newGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportType getImport() {
		return (ImportType)getMixed().get(MomlPackage.Literals.DOCUMENT_ROOT__IMPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImport(ImportType newImport, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MomlPackage.Literals.DOCUMENT_ROOT__IMPORT, newImport, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImport(ImportType newImport) {
		((FeatureMap.Internal)getMixed()).set(MomlPackage.Literals.DOCUMENT_ROOT__IMPORT, newImport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputType getInput() {
		return (InputType)getMixed().get(MomlPackage.Literals.DOCUMENT_ROOT__INPUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput(InputType newInput, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MomlPackage.Literals.DOCUMENT_ROOT__INPUT, newInput, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(InputType newInput) {
		((FeatureMap.Internal)getMixed()).set(MomlPackage.Literals.DOCUMENT_ROOT__INPUT, newInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType getLink() {
		return (LinkType)getMixed().get(MomlPackage.Literals.DOCUMENT_ROOT__LINK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLink(LinkType newLink, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MomlPackage.Literals.DOCUMENT_ROOT__LINK, newLink, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(LinkType newLink) {
		((FeatureMap.Internal)getMixed()).set(MomlPackage.Literals.DOCUMENT_ROOT__LINK, newLink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType getLocation() {
		return (LocationType)getMixed().get(MomlPackage.Literals.DOCUMENT_ROOT__LOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(LocationType newLocation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MomlPackage.Literals.DOCUMENT_ROOT__LOCATION, newLocation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(LocationType newLocation) {
		((FeatureMap.Internal)getMixed()).set(MomlPackage.Literals.DOCUMENT_ROOT__LOCATION, newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelType getModel() {
		return (ModelType)getMixed().get(MomlPackage.Literals.DOCUMENT_ROOT__MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(ModelType newModel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MomlPackage.Literals.DOCUMENT_ROOT__MODEL, newModel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(ModelType newModel) {
		((FeatureMap.Internal)getMixed()).set(MomlPackage.Literals.DOCUMENT_ROOT__MODEL, newModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType getPort() {
		return (PortType)getMixed().get(MomlPackage.Literals.DOCUMENT_ROOT__PORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort(PortType newPort, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MomlPackage.Literals.DOCUMENT_ROOT__PORT, newPort, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(PortType newPort) {
		((FeatureMap.Internal)getMixed()).set(MomlPackage.Literals.DOCUMENT_ROOT__PORT, newPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType getProperty() {
		return (PropertyType)getMixed().get(MomlPackage.Literals.DOCUMENT_ROOT__PROPERTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(PropertyType newProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MomlPackage.Literals.DOCUMENT_ROOT__PROPERTY, newProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(PropertyType newProperty) {
		((FeatureMap.Internal)getMixed()).set(MomlPackage.Literals.DOCUMENT_ROOT__PROPERTY, newProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationType getRelation() {
		return (RelationType)getMixed().get(MomlPackage.Literals.DOCUMENT_ROOT__RELATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelation(RelationType newRelation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MomlPackage.Literals.DOCUMENT_ROOT__RELATION, newRelation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelation(RelationType newRelation) {
		((FeatureMap.Internal)getMixed()).set(MomlPackage.Literals.DOCUMENT_ROOT__RELATION, newRelation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenameType getRename() {
		return (RenameType)getMixed().get(MomlPackage.Literals.DOCUMENT_ROOT__RENAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRename(RenameType newRename, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MomlPackage.Literals.DOCUMENT_ROOT__RENAME, newRename, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRename(RenameType newRename) {
		((FeatureMap.Internal)getMixed()).set(MomlPackage.Literals.DOCUMENT_ROOT__RENAME, newRename);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenditionType getRendition() {
		return (RenditionType)getMixed().get(MomlPackage.Literals.DOCUMENT_ROOT__RENDITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRendition(RenditionType newRendition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MomlPackage.Literals.DOCUMENT_ROOT__RENDITION, newRendition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRendition(RenditionType newRendition) {
		((FeatureMap.Internal)getMixed()).set(MomlPackage.Literals.DOCUMENT_ROOT__RENDITION, newRendition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnlinkType getUnlink() {
		return (UnlinkType)getMixed().get(MomlPackage.Literals.DOCUMENT_ROOT__UNLINK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnlink(UnlinkType newUnlink, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MomlPackage.Literals.DOCUMENT_ROOT__UNLINK, newUnlink, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnlink(UnlinkType newUnlink) {
		((FeatureMap.Internal)getMixed()).set(MomlPackage.Literals.DOCUMENT_ROOT__UNLINK, newUnlink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VertexType getVertex() {
		return (VertexType)getMixed().get(MomlPackage.Literals.DOCUMENT_ROOT__VERTEX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVertex(VertexType newVertex, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MomlPackage.Literals.DOCUMENT_ROOT__VERTEX, newVertex, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVertex(VertexType newVertex) {
		((FeatureMap.Internal)getMixed()).set(MomlPackage.Literals.DOCUMENT_ROOT__VERTEX, newVertex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MomlPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case MomlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case MomlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case MomlPackage.DOCUMENT_ROOT__CLASS:
				return basicSetClass(null, msgs);
			case MomlPackage.DOCUMENT_ROOT__CONFIGURE:
				return basicSetConfigure(null, msgs);
			case MomlPackage.DOCUMENT_ROOT__DELETE_ENTITY:
				return basicSetDeleteEntity(null, msgs);
			case MomlPackage.DOCUMENT_ROOT__DELETE_PORT:
				return basicSetDeletePort(null, msgs);
			case MomlPackage.DOCUMENT_ROOT__DELETE_PROPERTY:
				return basicSetDeleteProperty(null, msgs);
			case MomlPackage.DOCUMENT_ROOT__DELETE_RELATION:
				return basicSetDeleteRelation(null, msgs);
			case MomlPackage.DOCUMENT_ROOT__DIRECTOR:
				return basicSetDirector(null, msgs);
			case MomlPackage.DOCUMENT_ROOT__DOC:
				return basicSetDoc(null, msgs);
			case MomlPackage.DOCUMENT_ROOT__ENTITY:
				return basicSetEntity(null, msgs);
			case MomlPackage.DOCUMENT_ROOT__GROUP:
				return basicSetGroup(null, msgs);
			case MomlPackage.DOCUMENT_ROOT__IMPORT:
				return basicSetImport(null, msgs);
			case MomlPackage.DOCUMENT_ROOT__INPUT:
				return basicSetInput(null, msgs);
			case MomlPackage.DOCUMENT_ROOT__LINK:
				return basicSetLink(null, msgs);
			case MomlPackage.DOCUMENT_ROOT__LOCATION:
				return basicSetLocation(null, msgs);
			case MomlPackage.DOCUMENT_ROOT__MODEL:
				return basicSetModel(null, msgs);
			case MomlPackage.DOCUMENT_ROOT__PORT:
				return basicSetPort(null, msgs);
			case MomlPackage.DOCUMENT_ROOT__PROPERTY:
				return basicSetProperty(null, msgs);
			case MomlPackage.DOCUMENT_ROOT__RELATION:
				return basicSetRelation(null, msgs);
			case MomlPackage.DOCUMENT_ROOT__RENAME:
				return basicSetRename(null, msgs);
			case MomlPackage.DOCUMENT_ROOT__RENDITION:
				return basicSetRendition(null, msgs);
			case MomlPackage.DOCUMENT_ROOT__UNLINK:
				return basicSetUnlink(null, msgs);
			case MomlPackage.DOCUMENT_ROOT__VERTEX:
				return basicSetVertex(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MomlPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case MomlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case MomlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case MomlPackage.DOCUMENT_ROOT__CLASS:
				return getClass_();
			case MomlPackage.DOCUMENT_ROOT__CONFIGURE:
				return getConfigure();
			case MomlPackage.DOCUMENT_ROOT__DELETE_ENTITY:
				return getDeleteEntity();
			case MomlPackage.DOCUMENT_ROOT__DELETE_PORT:
				return getDeletePort();
			case MomlPackage.DOCUMENT_ROOT__DELETE_PROPERTY:
				return getDeleteProperty();
			case MomlPackage.DOCUMENT_ROOT__DELETE_RELATION:
				return getDeleteRelation();
			case MomlPackage.DOCUMENT_ROOT__DIRECTOR:
				return getDirector();
			case MomlPackage.DOCUMENT_ROOT__DOC:
				return getDoc();
			case MomlPackage.DOCUMENT_ROOT__ENTITY:
				return getEntity();
			case MomlPackage.DOCUMENT_ROOT__GROUP:
				return getGroup();
			case MomlPackage.DOCUMENT_ROOT__IMPORT:
				return getImport();
			case MomlPackage.DOCUMENT_ROOT__INPUT:
				return getInput();
			case MomlPackage.DOCUMENT_ROOT__LINK:
				return getLink();
			case MomlPackage.DOCUMENT_ROOT__LOCATION:
				return getLocation();
			case MomlPackage.DOCUMENT_ROOT__MODEL:
				return getModel();
			case MomlPackage.DOCUMENT_ROOT__PORT:
				return getPort();
			case MomlPackage.DOCUMENT_ROOT__PROPERTY:
				return getProperty();
			case MomlPackage.DOCUMENT_ROOT__RELATION:
				return getRelation();
			case MomlPackage.DOCUMENT_ROOT__RENAME:
				return getRename();
			case MomlPackage.DOCUMENT_ROOT__RENDITION:
				return getRendition();
			case MomlPackage.DOCUMENT_ROOT__UNLINK:
				return getUnlink();
			case MomlPackage.DOCUMENT_ROOT__VERTEX:
				return getVertex();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MomlPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case MomlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case MomlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case MomlPackage.DOCUMENT_ROOT__CLASS:
				setClass((ClassType)newValue);
				return;
			case MomlPackage.DOCUMENT_ROOT__CONFIGURE:
				setConfigure((ConfigureType)newValue);
				return;
			case MomlPackage.DOCUMENT_ROOT__DELETE_ENTITY:
				setDeleteEntity((DeleteEntityType)newValue);
				return;
			case MomlPackage.DOCUMENT_ROOT__DELETE_PORT:
				setDeletePort((DeletePortType)newValue);
				return;
			case MomlPackage.DOCUMENT_ROOT__DELETE_PROPERTY:
				setDeleteProperty((DeletePropertyType)newValue);
				return;
			case MomlPackage.DOCUMENT_ROOT__DELETE_RELATION:
				setDeleteRelation((DeleteRelationType)newValue);
				return;
			case MomlPackage.DOCUMENT_ROOT__DIRECTOR:
				setDirector((DirectorType)newValue);
				return;
			case MomlPackage.DOCUMENT_ROOT__DOC:
				setDoc((DocType)newValue);
				return;
			case MomlPackage.DOCUMENT_ROOT__ENTITY:
				setEntity((EntityType)newValue);
				return;
			case MomlPackage.DOCUMENT_ROOT__GROUP:
				setGroup((GroupType)newValue);
				return;
			case MomlPackage.DOCUMENT_ROOT__IMPORT:
				setImport((ImportType)newValue);
				return;
			case MomlPackage.DOCUMENT_ROOT__INPUT:
				setInput((InputType)newValue);
				return;
			case MomlPackage.DOCUMENT_ROOT__LINK:
				setLink((LinkType)newValue);
				return;
			case MomlPackage.DOCUMENT_ROOT__LOCATION:
				setLocation((LocationType)newValue);
				return;
			case MomlPackage.DOCUMENT_ROOT__MODEL:
				setModel((ModelType)newValue);
				return;
			case MomlPackage.DOCUMENT_ROOT__PORT:
				setPort((PortType)newValue);
				return;
			case MomlPackage.DOCUMENT_ROOT__PROPERTY:
				setProperty((PropertyType)newValue);
				return;
			case MomlPackage.DOCUMENT_ROOT__RELATION:
				setRelation((RelationType)newValue);
				return;
			case MomlPackage.DOCUMENT_ROOT__RENAME:
				setRename((RenameType)newValue);
				return;
			case MomlPackage.DOCUMENT_ROOT__RENDITION:
				setRendition((RenditionType)newValue);
				return;
			case MomlPackage.DOCUMENT_ROOT__UNLINK:
				setUnlink((UnlinkType)newValue);
				return;
			case MomlPackage.DOCUMENT_ROOT__VERTEX:
				setVertex((VertexType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MomlPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case MomlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case MomlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case MomlPackage.DOCUMENT_ROOT__CLASS:
				setClass((ClassType)null);
				return;
			case MomlPackage.DOCUMENT_ROOT__CONFIGURE:
				setConfigure((ConfigureType)null);
				return;
			case MomlPackage.DOCUMENT_ROOT__DELETE_ENTITY:
				setDeleteEntity((DeleteEntityType)null);
				return;
			case MomlPackage.DOCUMENT_ROOT__DELETE_PORT:
				setDeletePort((DeletePortType)null);
				return;
			case MomlPackage.DOCUMENT_ROOT__DELETE_PROPERTY:
				setDeleteProperty((DeletePropertyType)null);
				return;
			case MomlPackage.DOCUMENT_ROOT__DELETE_RELATION:
				setDeleteRelation((DeleteRelationType)null);
				return;
			case MomlPackage.DOCUMENT_ROOT__DIRECTOR:
				setDirector((DirectorType)null);
				return;
			case MomlPackage.DOCUMENT_ROOT__DOC:
				setDoc((DocType)null);
				return;
			case MomlPackage.DOCUMENT_ROOT__ENTITY:
				setEntity((EntityType)null);
				return;
			case MomlPackage.DOCUMENT_ROOT__GROUP:
				setGroup((GroupType)null);
				return;
			case MomlPackage.DOCUMENT_ROOT__IMPORT:
				setImport((ImportType)null);
				return;
			case MomlPackage.DOCUMENT_ROOT__INPUT:
				setInput((InputType)null);
				return;
			case MomlPackage.DOCUMENT_ROOT__LINK:
				setLink((LinkType)null);
				return;
			case MomlPackage.DOCUMENT_ROOT__LOCATION:
				setLocation((LocationType)null);
				return;
			case MomlPackage.DOCUMENT_ROOT__MODEL:
				setModel((ModelType)null);
				return;
			case MomlPackage.DOCUMENT_ROOT__PORT:
				setPort((PortType)null);
				return;
			case MomlPackage.DOCUMENT_ROOT__PROPERTY:
				setProperty((PropertyType)null);
				return;
			case MomlPackage.DOCUMENT_ROOT__RELATION:
				setRelation((RelationType)null);
				return;
			case MomlPackage.DOCUMENT_ROOT__RENAME:
				setRename((RenameType)null);
				return;
			case MomlPackage.DOCUMENT_ROOT__RENDITION:
				setRendition((RenditionType)null);
				return;
			case MomlPackage.DOCUMENT_ROOT__UNLINK:
				setUnlink((UnlinkType)null);
				return;
			case MomlPackage.DOCUMENT_ROOT__VERTEX:
				setVertex((VertexType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MomlPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case MomlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case MomlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case MomlPackage.DOCUMENT_ROOT__CLASS:
				return getClass_() != null;
			case MomlPackage.DOCUMENT_ROOT__CONFIGURE:
				return getConfigure() != null;
			case MomlPackage.DOCUMENT_ROOT__DELETE_ENTITY:
				return getDeleteEntity() != null;
			case MomlPackage.DOCUMENT_ROOT__DELETE_PORT:
				return getDeletePort() != null;
			case MomlPackage.DOCUMENT_ROOT__DELETE_PROPERTY:
				return getDeleteProperty() != null;
			case MomlPackage.DOCUMENT_ROOT__DELETE_RELATION:
				return getDeleteRelation() != null;
			case MomlPackage.DOCUMENT_ROOT__DIRECTOR:
				return getDirector() != null;
			case MomlPackage.DOCUMENT_ROOT__DOC:
				return getDoc() != null;
			case MomlPackage.DOCUMENT_ROOT__ENTITY:
				return getEntity() != null;
			case MomlPackage.DOCUMENT_ROOT__GROUP:
				return getGroup() != null;
			case MomlPackage.DOCUMENT_ROOT__IMPORT:
				return getImport() != null;
			case MomlPackage.DOCUMENT_ROOT__INPUT:
				return getInput() != null;
			case MomlPackage.DOCUMENT_ROOT__LINK:
				return getLink() != null;
			case MomlPackage.DOCUMENT_ROOT__LOCATION:
				return getLocation() != null;
			case MomlPackage.DOCUMENT_ROOT__MODEL:
				return getModel() != null;
			case MomlPackage.DOCUMENT_ROOT__PORT:
				return getPort() != null;
			case MomlPackage.DOCUMENT_ROOT__PROPERTY:
				return getProperty() != null;
			case MomlPackage.DOCUMENT_ROOT__RELATION:
				return getRelation() != null;
			case MomlPackage.DOCUMENT_ROOT__RENAME:
				return getRename() != null;
			case MomlPackage.DOCUMENT_ROOT__RENDITION:
				return getRendition() != null;
			case MomlPackage.DOCUMENT_ROOT__UNLINK:
				return getUnlink() != null;
			case MomlPackage.DOCUMENT_ROOT__VERTEX:
				return getVertex() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
