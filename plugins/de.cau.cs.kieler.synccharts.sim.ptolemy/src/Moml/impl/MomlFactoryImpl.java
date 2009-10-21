/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Moml.impl;

import Moml.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MomlFactoryImpl extends EFactoryImpl implements MomlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MomlFactory init() {
		try {
			MomlFactory theMomlFactory = (MomlFactory)EPackage.Registry.INSTANCE.getEFactory("platform:/resource/de.cau.cs.kieler.sim.ptolemy/moml.xsd"); 
			if (theMomlFactory != null) {
				return theMomlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MomlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MomlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MomlPackage.ANY: return createAny();
			case MomlPackage.CLASS_TYPE: return createClassType();
			case MomlPackage.CONFIGURE_TYPE: return createConfigureType();
			case MomlPackage.DELETE_ENTITY_TYPE: return createDeleteEntityType();
			case MomlPackage.DELETE_PORT_TYPE: return createDeletePortType();
			case MomlPackage.DELETE_PROPERTY_TYPE: return createDeletePropertyType();
			case MomlPackage.DELETE_RELATION_TYPE: return createDeleteRelationType();
			case MomlPackage.DIRECTOR_TYPE: return createDirectorType();
			case MomlPackage.DOC_TYPE: return createDocType();
			case MomlPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case MomlPackage.ENTITY_TYPE: return createEntityType();
			case MomlPackage.GROUP_TYPE: return createGroupType();
			case MomlPackage.IMPORT_TYPE: return createImportType();
			case MomlPackage.INPUT_TYPE: return createInputType();
			case MomlPackage.LINK_TYPE: return createLinkType();
			case MomlPackage.LOCATION_TYPE: return createLocationType();
			case MomlPackage.MODEL_TYPE: return createModelType();
			case MomlPackage.PORT_TYPE: return createPortType();
			case MomlPackage.PROPERTY_TYPE: return createPropertyType();
			case MomlPackage.RELATION_TYPE: return createRelationType();
			case MomlPackage.RENAME_TYPE: return createRenameType();
			case MomlPackage.RENDITION_TYPE: return createRenditionType();
			case MomlPackage.UNLINK_TYPE: return createUnlinkType();
			case MomlPackage.VERTEX_TYPE: return createVertexType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Any createAny() {
		AnyImpl any = new AnyImpl();
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType createClassType() {
		ClassTypeImpl classType = new ClassTypeImpl();
		return classType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigureType createConfigureType() {
		ConfigureTypeImpl configureType = new ConfigureTypeImpl();
		return configureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteEntityType createDeleteEntityType() {
		DeleteEntityTypeImpl deleteEntityType = new DeleteEntityTypeImpl();
		return deleteEntityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeletePortType createDeletePortType() {
		DeletePortTypeImpl deletePortType = new DeletePortTypeImpl();
		return deletePortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeletePropertyType createDeletePropertyType() {
		DeletePropertyTypeImpl deletePropertyType = new DeletePropertyTypeImpl();
		return deletePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteRelationType createDeleteRelationType() {
		DeleteRelationTypeImpl deleteRelationType = new DeleteRelationTypeImpl();
		return deleteRelationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectorType createDirectorType() {
		DirectorTypeImpl directorType = new DirectorTypeImpl();
		return directorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocType createDocType() {
		DocTypeImpl docType = new DocTypeImpl();
		return docType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType createEntityType() {
		EntityTypeImpl entityType = new EntityTypeImpl();
		return entityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupType createGroupType() {
		GroupTypeImpl groupType = new GroupTypeImpl();
		return groupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportType createImportType() {
		ImportTypeImpl importType = new ImportTypeImpl();
		return importType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputType createInputType() {
		InputTypeImpl inputType = new InputTypeImpl();
		return inputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType createLinkType() {
		LinkTypeImpl linkType = new LinkTypeImpl();
		return linkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType createLocationType() {
		LocationTypeImpl locationType = new LocationTypeImpl();
		return locationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelType createModelType() {
		ModelTypeImpl modelType = new ModelTypeImpl();
		return modelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType createPortType() {
		PortTypeImpl portType = new PortTypeImpl();
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType createPropertyType() {
		PropertyTypeImpl propertyType = new PropertyTypeImpl();
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationType createRelationType() {
		RelationTypeImpl relationType = new RelationTypeImpl();
		return relationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenameType createRenameType() {
		RenameTypeImpl renameType = new RenameTypeImpl();
		return renameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenditionType createRenditionType() {
		RenditionTypeImpl renditionType = new RenditionTypeImpl();
		return renditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnlinkType createUnlinkType() {
		UnlinkTypeImpl unlinkType = new UnlinkTypeImpl();
		return unlinkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VertexType createVertexType() {
		VertexTypeImpl vertexType = new VertexTypeImpl();
		return vertexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MomlPackage getMomlPackage() {
		return (MomlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MomlPackage getPackage() {
		return MomlPackage.eINSTANCE;
	}

} //MomlFactoryImpl
