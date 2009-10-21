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
import Moml.DeleteRelationType;
import Moml.DirectorType;
import Moml.DocType;
import Moml.EntityType;
import Moml.GroupType;
import Moml.ImportType;
import Moml.InputType;
import Moml.LinkType;
import Moml.MomlPackage;
import Moml.PortType;
import Moml.PropertyType;
import Moml.RelationType;
import Moml.RenameType;
import Moml.RenditionType;
import Moml.UnlinkType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Moml.impl.EntityTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link Moml.impl.EntityTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link Moml.impl.EntityTypeImpl#getConfigure <em>Configure</em>}</li>
 *   <li>{@link Moml.impl.EntityTypeImpl#getDeleteEntity <em>Delete Entity</em>}</li>
 *   <li>{@link Moml.impl.EntityTypeImpl#getDeletePort <em>Delete Port</em>}</li>
 *   <li>{@link Moml.impl.EntityTypeImpl#getDeleteRelation <em>Delete Relation</em>}</li>
 *   <li>{@link Moml.impl.EntityTypeImpl#getDirector <em>Director</em>}</li>
 *   <li>{@link Moml.impl.EntityTypeImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link Moml.impl.EntityTypeImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link Moml.impl.EntityTypeImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link Moml.impl.EntityTypeImpl#getImport <em>Import</em>}</li>
 *   <li>{@link Moml.impl.EntityTypeImpl#getInput <em>Input</em>}</li>
 *   <li>{@link Moml.impl.EntityTypeImpl#getLink <em>Link</em>}</li>
 *   <li>{@link Moml.impl.EntityTypeImpl#getPort <em>Port</em>}</li>
 *   <li>{@link Moml.impl.EntityTypeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link Moml.impl.EntityTypeImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link Moml.impl.EntityTypeImpl#getRename <em>Rename</em>}</li>
 *   <li>{@link Moml.impl.EntityTypeImpl#getRendition <em>Rendition</em>}</li>
 *   <li>{@link Moml.impl.EntityTypeImpl#getUnlink <em>Unlink</em>}</li>
 *   <li>{@link Moml.impl.EntityTypeImpl#getClass1 <em>Class1</em>}</li>
 *   <li>{@link Moml.impl.EntityTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Moml.impl.EntityTypeImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityTypeImpl extends EObjectImpl implements EntityType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getClass1() <em>Class1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass1()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass1() <em>Class1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass1()
	 * @generated
	 * @ordered
	 */
	protected String class1 = CLASS1_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MomlPackage.Literals.ENTITY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, MomlPackage.ENTITY_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassType> getClass_() {
		return getGroup().list(MomlPackage.Literals.ENTITY_TYPE__CLASS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigureType> getConfigure() {
		return getGroup().list(MomlPackage.Literals.ENTITY_TYPE__CONFIGURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeleteEntityType> getDeleteEntity() {
		return getGroup().list(MomlPackage.Literals.ENTITY_TYPE__DELETE_ENTITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeletePortType> getDeletePort() {
		return getGroup().list(MomlPackage.Literals.ENTITY_TYPE__DELETE_PORT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeleteRelationType> getDeleteRelation() {
		return getGroup().list(MomlPackage.Literals.ENTITY_TYPE__DELETE_RELATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DirectorType> getDirector() {
		return getGroup().list(MomlPackage.Literals.ENTITY_TYPE__DIRECTOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocType> getDoc() {
		return getGroup().list(MomlPackage.Literals.ENTITY_TYPE__DOC);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getEntity() {
		return getGroup().list(MomlPackage.Literals.ENTITY_TYPE__ENTITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GroupType> getGroup1() {
		return getGroup().list(MomlPackage.Literals.ENTITY_TYPE__GROUP1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportType> getImport() {
		return getGroup().list(MomlPackage.Literals.ENTITY_TYPE__IMPORT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputType> getInput() {
		return getGroup().list(MomlPackage.Literals.ENTITY_TYPE__INPUT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkType> getLink() {
		return getGroup().list(MomlPackage.Literals.ENTITY_TYPE__LINK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortType> getPort() {
		return getGroup().list(MomlPackage.Literals.ENTITY_TYPE__PORT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyType> getProperty() {
		return getGroup().list(MomlPackage.Literals.ENTITY_TYPE__PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationType> getRelation() {
		return getGroup().list(MomlPackage.Literals.ENTITY_TYPE__RELATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RenameType> getRename() {
		return getGroup().list(MomlPackage.Literals.ENTITY_TYPE__RENAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RenditionType> getRendition() {
		return getGroup().list(MomlPackage.Literals.ENTITY_TYPE__RENDITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnlinkType> getUnlink() {
		return getGroup().list(MomlPackage.Literals.ENTITY_TYPE__UNLINK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass1() {
		return class1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass1(String newClass1) {
		String oldClass1 = class1;
		class1 = newClass1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MomlPackage.ENTITY_TYPE__CLASS1, oldClass1, class1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MomlPackage.ENTITY_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MomlPackage.ENTITY_TYPE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MomlPackage.ENTITY_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case MomlPackage.ENTITY_TYPE__CLASS:
				return ((InternalEList<?>)getClass_()).basicRemove(otherEnd, msgs);
			case MomlPackage.ENTITY_TYPE__CONFIGURE:
				return ((InternalEList<?>)getConfigure()).basicRemove(otherEnd, msgs);
			case MomlPackage.ENTITY_TYPE__DELETE_ENTITY:
				return ((InternalEList<?>)getDeleteEntity()).basicRemove(otherEnd, msgs);
			case MomlPackage.ENTITY_TYPE__DELETE_PORT:
				return ((InternalEList<?>)getDeletePort()).basicRemove(otherEnd, msgs);
			case MomlPackage.ENTITY_TYPE__DELETE_RELATION:
				return ((InternalEList<?>)getDeleteRelation()).basicRemove(otherEnd, msgs);
			case MomlPackage.ENTITY_TYPE__DIRECTOR:
				return ((InternalEList<?>)getDirector()).basicRemove(otherEnd, msgs);
			case MomlPackage.ENTITY_TYPE__DOC:
				return ((InternalEList<?>)getDoc()).basicRemove(otherEnd, msgs);
			case MomlPackage.ENTITY_TYPE__ENTITY:
				return ((InternalEList<?>)getEntity()).basicRemove(otherEnd, msgs);
			case MomlPackage.ENTITY_TYPE__GROUP1:
				return ((InternalEList<?>)getGroup1()).basicRemove(otherEnd, msgs);
			case MomlPackage.ENTITY_TYPE__IMPORT:
				return ((InternalEList<?>)getImport()).basicRemove(otherEnd, msgs);
			case MomlPackage.ENTITY_TYPE__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case MomlPackage.ENTITY_TYPE__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case MomlPackage.ENTITY_TYPE__PORT:
				return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
			case MomlPackage.ENTITY_TYPE__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case MomlPackage.ENTITY_TYPE__RELATION:
				return ((InternalEList<?>)getRelation()).basicRemove(otherEnd, msgs);
			case MomlPackage.ENTITY_TYPE__RENAME:
				return ((InternalEList<?>)getRename()).basicRemove(otherEnd, msgs);
			case MomlPackage.ENTITY_TYPE__RENDITION:
				return ((InternalEList<?>)getRendition()).basicRemove(otherEnd, msgs);
			case MomlPackage.ENTITY_TYPE__UNLINK:
				return ((InternalEList<?>)getUnlink()).basicRemove(otherEnd, msgs);
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
			case MomlPackage.ENTITY_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case MomlPackage.ENTITY_TYPE__CLASS:
				return getClass_();
			case MomlPackage.ENTITY_TYPE__CONFIGURE:
				return getConfigure();
			case MomlPackage.ENTITY_TYPE__DELETE_ENTITY:
				return getDeleteEntity();
			case MomlPackage.ENTITY_TYPE__DELETE_PORT:
				return getDeletePort();
			case MomlPackage.ENTITY_TYPE__DELETE_RELATION:
				return getDeleteRelation();
			case MomlPackage.ENTITY_TYPE__DIRECTOR:
				return getDirector();
			case MomlPackage.ENTITY_TYPE__DOC:
				return getDoc();
			case MomlPackage.ENTITY_TYPE__ENTITY:
				return getEntity();
			case MomlPackage.ENTITY_TYPE__GROUP1:
				return getGroup1();
			case MomlPackage.ENTITY_TYPE__IMPORT:
				return getImport();
			case MomlPackage.ENTITY_TYPE__INPUT:
				return getInput();
			case MomlPackage.ENTITY_TYPE__LINK:
				return getLink();
			case MomlPackage.ENTITY_TYPE__PORT:
				return getPort();
			case MomlPackage.ENTITY_TYPE__PROPERTY:
				return getProperty();
			case MomlPackage.ENTITY_TYPE__RELATION:
				return getRelation();
			case MomlPackage.ENTITY_TYPE__RENAME:
				return getRename();
			case MomlPackage.ENTITY_TYPE__RENDITION:
				return getRendition();
			case MomlPackage.ENTITY_TYPE__UNLINK:
				return getUnlink();
			case MomlPackage.ENTITY_TYPE__CLASS1:
				return getClass1();
			case MomlPackage.ENTITY_TYPE__NAME:
				return getName();
			case MomlPackage.ENTITY_TYPE__SOURCE:
				return getSource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MomlPackage.ENTITY_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case MomlPackage.ENTITY_TYPE__CLASS:
				getClass_().clear();
				getClass_().addAll((Collection<? extends ClassType>)newValue);
				return;
			case MomlPackage.ENTITY_TYPE__CONFIGURE:
				getConfigure().clear();
				getConfigure().addAll((Collection<? extends ConfigureType>)newValue);
				return;
			case MomlPackage.ENTITY_TYPE__DELETE_ENTITY:
				getDeleteEntity().clear();
				getDeleteEntity().addAll((Collection<? extends DeleteEntityType>)newValue);
				return;
			case MomlPackage.ENTITY_TYPE__DELETE_PORT:
				getDeletePort().clear();
				getDeletePort().addAll((Collection<? extends DeletePortType>)newValue);
				return;
			case MomlPackage.ENTITY_TYPE__DELETE_RELATION:
				getDeleteRelation().clear();
				getDeleteRelation().addAll((Collection<? extends DeleteRelationType>)newValue);
				return;
			case MomlPackage.ENTITY_TYPE__DIRECTOR:
				getDirector().clear();
				getDirector().addAll((Collection<? extends DirectorType>)newValue);
				return;
			case MomlPackage.ENTITY_TYPE__DOC:
				getDoc().clear();
				getDoc().addAll((Collection<? extends DocType>)newValue);
				return;
			case MomlPackage.ENTITY_TYPE__ENTITY:
				getEntity().clear();
				getEntity().addAll((Collection<? extends EntityType>)newValue);
				return;
			case MomlPackage.ENTITY_TYPE__GROUP1:
				getGroup1().clear();
				getGroup1().addAll((Collection<? extends GroupType>)newValue);
				return;
			case MomlPackage.ENTITY_TYPE__IMPORT:
				getImport().clear();
				getImport().addAll((Collection<? extends ImportType>)newValue);
				return;
			case MomlPackage.ENTITY_TYPE__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends InputType>)newValue);
				return;
			case MomlPackage.ENTITY_TYPE__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends LinkType>)newValue);
				return;
			case MomlPackage.ENTITY_TYPE__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends PortType>)newValue);
				return;
			case MomlPackage.ENTITY_TYPE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends PropertyType>)newValue);
				return;
			case MomlPackage.ENTITY_TYPE__RELATION:
				getRelation().clear();
				getRelation().addAll((Collection<? extends RelationType>)newValue);
				return;
			case MomlPackage.ENTITY_TYPE__RENAME:
				getRename().clear();
				getRename().addAll((Collection<? extends RenameType>)newValue);
				return;
			case MomlPackage.ENTITY_TYPE__RENDITION:
				getRendition().clear();
				getRendition().addAll((Collection<? extends RenditionType>)newValue);
				return;
			case MomlPackage.ENTITY_TYPE__UNLINK:
				getUnlink().clear();
				getUnlink().addAll((Collection<? extends UnlinkType>)newValue);
				return;
			case MomlPackage.ENTITY_TYPE__CLASS1:
				setClass1((String)newValue);
				return;
			case MomlPackage.ENTITY_TYPE__NAME:
				setName((String)newValue);
				return;
			case MomlPackage.ENTITY_TYPE__SOURCE:
				setSource((String)newValue);
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
			case MomlPackage.ENTITY_TYPE__GROUP:
				getGroup().clear();
				return;
			case MomlPackage.ENTITY_TYPE__CLASS:
				getClass_().clear();
				return;
			case MomlPackage.ENTITY_TYPE__CONFIGURE:
				getConfigure().clear();
				return;
			case MomlPackage.ENTITY_TYPE__DELETE_ENTITY:
				getDeleteEntity().clear();
				return;
			case MomlPackage.ENTITY_TYPE__DELETE_PORT:
				getDeletePort().clear();
				return;
			case MomlPackage.ENTITY_TYPE__DELETE_RELATION:
				getDeleteRelation().clear();
				return;
			case MomlPackage.ENTITY_TYPE__DIRECTOR:
				getDirector().clear();
				return;
			case MomlPackage.ENTITY_TYPE__DOC:
				getDoc().clear();
				return;
			case MomlPackage.ENTITY_TYPE__ENTITY:
				getEntity().clear();
				return;
			case MomlPackage.ENTITY_TYPE__GROUP1:
				getGroup1().clear();
				return;
			case MomlPackage.ENTITY_TYPE__IMPORT:
				getImport().clear();
				return;
			case MomlPackage.ENTITY_TYPE__INPUT:
				getInput().clear();
				return;
			case MomlPackage.ENTITY_TYPE__LINK:
				getLink().clear();
				return;
			case MomlPackage.ENTITY_TYPE__PORT:
				getPort().clear();
				return;
			case MomlPackage.ENTITY_TYPE__PROPERTY:
				getProperty().clear();
				return;
			case MomlPackage.ENTITY_TYPE__RELATION:
				getRelation().clear();
				return;
			case MomlPackage.ENTITY_TYPE__RENAME:
				getRename().clear();
				return;
			case MomlPackage.ENTITY_TYPE__RENDITION:
				getRendition().clear();
				return;
			case MomlPackage.ENTITY_TYPE__UNLINK:
				getUnlink().clear();
				return;
			case MomlPackage.ENTITY_TYPE__CLASS1:
				setClass1(CLASS1_EDEFAULT);
				return;
			case MomlPackage.ENTITY_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MomlPackage.ENTITY_TYPE__SOURCE:
				setSource(SOURCE_EDEFAULT);
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
			case MomlPackage.ENTITY_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case MomlPackage.ENTITY_TYPE__CLASS:
				return !getClass_().isEmpty();
			case MomlPackage.ENTITY_TYPE__CONFIGURE:
				return !getConfigure().isEmpty();
			case MomlPackage.ENTITY_TYPE__DELETE_ENTITY:
				return !getDeleteEntity().isEmpty();
			case MomlPackage.ENTITY_TYPE__DELETE_PORT:
				return !getDeletePort().isEmpty();
			case MomlPackage.ENTITY_TYPE__DELETE_RELATION:
				return !getDeleteRelation().isEmpty();
			case MomlPackage.ENTITY_TYPE__DIRECTOR:
				return !getDirector().isEmpty();
			case MomlPackage.ENTITY_TYPE__DOC:
				return !getDoc().isEmpty();
			case MomlPackage.ENTITY_TYPE__ENTITY:
				return !getEntity().isEmpty();
			case MomlPackage.ENTITY_TYPE__GROUP1:
				return !getGroup1().isEmpty();
			case MomlPackage.ENTITY_TYPE__IMPORT:
				return !getImport().isEmpty();
			case MomlPackage.ENTITY_TYPE__INPUT:
				return !getInput().isEmpty();
			case MomlPackage.ENTITY_TYPE__LINK:
				return !getLink().isEmpty();
			case MomlPackage.ENTITY_TYPE__PORT:
				return !getPort().isEmpty();
			case MomlPackage.ENTITY_TYPE__PROPERTY:
				return !getProperty().isEmpty();
			case MomlPackage.ENTITY_TYPE__RELATION:
				return !getRelation().isEmpty();
			case MomlPackage.ENTITY_TYPE__RENAME:
				return !getRename().isEmpty();
			case MomlPackage.ENTITY_TYPE__RENDITION:
				return !getRendition().isEmpty();
			case MomlPackage.ENTITY_TYPE__UNLINK:
				return !getUnlink().isEmpty();
			case MomlPackage.ENTITY_TYPE__CLASS1:
				return CLASS1_EDEFAULT == null ? class1 != null : !CLASS1_EDEFAULT.equals(class1);
			case MomlPackage.ENTITY_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MomlPackage.ENTITY_TYPE__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", class1: ");
		result.append(class1);
		result.append(", name: ");
		result.append(name);
		result.append(", source: ");
		result.append(source);
		result.append(')');
		return result.toString();
	}

} //EntityTypeImpl
