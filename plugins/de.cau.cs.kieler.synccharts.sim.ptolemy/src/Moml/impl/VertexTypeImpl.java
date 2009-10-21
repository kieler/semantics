/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Moml.impl;

import Moml.ConfigureType;
import Moml.DocType;
import Moml.LocationType;
import Moml.MomlPackage;
import Moml.PropertyType;
import Moml.RenameType;
import Moml.VertexType;

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
 * An implementation of the model object '<em><b>Vertex Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Moml.impl.VertexTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link Moml.impl.VertexTypeImpl#getConfigure <em>Configure</em>}</li>
 *   <li>{@link Moml.impl.VertexTypeImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link Moml.impl.VertexTypeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link Moml.impl.VertexTypeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link Moml.impl.VertexTypeImpl#getRename <em>Rename</em>}</li>
 *   <li>{@link Moml.impl.VertexTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Moml.impl.VertexTypeImpl#getPathTo <em>Path To</em>}</li>
 *   <li>{@link Moml.impl.VertexTypeImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VertexTypeImpl extends EObjectImpl implements VertexType {
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
	 * The default value of the '{@link #getPathTo() <em>Path To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathTo()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathTo() <em>Path To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathTo()
	 * @generated
	 * @ordered
	 */
	protected String pathTo = PATH_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VertexTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MomlPackage.Literals.VERTEX_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, MomlPackage.VERTEX_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigureType> getConfigure() {
		return getGroup().list(MomlPackage.Literals.VERTEX_TYPE__CONFIGURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocType> getDoc() {
		return getGroup().list(MomlPackage.Literals.VERTEX_TYPE__DOC);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationType> getLocation() {
		return getGroup().list(MomlPackage.Literals.VERTEX_TYPE__LOCATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyType> getProperty() {
		return getGroup().list(MomlPackage.Literals.VERTEX_TYPE__PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RenameType> getRename() {
		return getGroup().list(MomlPackage.Literals.VERTEX_TYPE__RENAME);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MomlPackage.VERTEX_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPathTo() {
		return pathTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathTo(String newPathTo) {
		String oldPathTo = pathTo;
		pathTo = newPathTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MomlPackage.VERTEX_TYPE__PATH_TO, oldPathTo, pathTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MomlPackage.VERTEX_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MomlPackage.VERTEX_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case MomlPackage.VERTEX_TYPE__CONFIGURE:
				return ((InternalEList<?>)getConfigure()).basicRemove(otherEnd, msgs);
			case MomlPackage.VERTEX_TYPE__DOC:
				return ((InternalEList<?>)getDoc()).basicRemove(otherEnd, msgs);
			case MomlPackage.VERTEX_TYPE__LOCATION:
				return ((InternalEList<?>)getLocation()).basicRemove(otherEnd, msgs);
			case MomlPackage.VERTEX_TYPE__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case MomlPackage.VERTEX_TYPE__RENAME:
				return ((InternalEList<?>)getRename()).basicRemove(otherEnd, msgs);
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
			case MomlPackage.VERTEX_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case MomlPackage.VERTEX_TYPE__CONFIGURE:
				return getConfigure();
			case MomlPackage.VERTEX_TYPE__DOC:
				return getDoc();
			case MomlPackage.VERTEX_TYPE__LOCATION:
				return getLocation();
			case MomlPackage.VERTEX_TYPE__PROPERTY:
				return getProperty();
			case MomlPackage.VERTEX_TYPE__RENAME:
				return getRename();
			case MomlPackage.VERTEX_TYPE__NAME:
				return getName();
			case MomlPackage.VERTEX_TYPE__PATH_TO:
				return getPathTo();
			case MomlPackage.VERTEX_TYPE__VALUE:
				return getValue();
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
			case MomlPackage.VERTEX_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case MomlPackage.VERTEX_TYPE__CONFIGURE:
				getConfigure().clear();
				getConfigure().addAll((Collection<? extends ConfigureType>)newValue);
				return;
			case MomlPackage.VERTEX_TYPE__DOC:
				getDoc().clear();
				getDoc().addAll((Collection<? extends DocType>)newValue);
				return;
			case MomlPackage.VERTEX_TYPE__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends LocationType>)newValue);
				return;
			case MomlPackage.VERTEX_TYPE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends PropertyType>)newValue);
				return;
			case MomlPackage.VERTEX_TYPE__RENAME:
				getRename().clear();
				getRename().addAll((Collection<? extends RenameType>)newValue);
				return;
			case MomlPackage.VERTEX_TYPE__NAME:
				setName((String)newValue);
				return;
			case MomlPackage.VERTEX_TYPE__PATH_TO:
				setPathTo((String)newValue);
				return;
			case MomlPackage.VERTEX_TYPE__VALUE:
				setValue((String)newValue);
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
			case MomlPackage.VERTEX_TYPE__GROUP:
				getGroup().clear();
				return;
			case MomlPackage.VERTEX_TYPE__CONFIGURE:
				getConfigure().clear();
				return;
			case MomlPackage.VERTEX_TYPE__DOC:
				getDoc().clear();
				return;
			case MomlPackage.VERTEX_TYPE__LOCATION:
				getLocation().clear();
				return;
			case MomlPackage.VERTEX_TYPE__PROPERTY:
				getProperty().clear();
				return;
			case MomlPackage.VERTEX_TYPE__RENAME:
				getRename().clear();
				return;
			case MomlPackage.VERTEX_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MomlPackage.VERTEX_TYPE__PATH_TO:
				setPathTo(PATH_TO_EDEFAULT);
				return;
			case MomlPackage.VERTEX_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case MomlPackage.VERTEX_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case MomlPackage.VERTEX_TYPE__CONFIGURE:
				return !getConfigure().isEmpty();
			case MomlPackage.VERTEX_TYPE__DOC:
				return !getDoc().isEmpty();
			case MomlPackage.VERTEX_TYPE__LOCATION:
				return !getLocation().isEmpty();
			case MomlPackage.VERTEX_TYPE__PROPERTY:
				return !getProperty().isEmpty();
			case MomlPackage.VERTEX_TYPE__RENAME:
				return !getRename().isEmpty();
			case MomlPackage.VERTEX_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MomlPackage.VERTEX_TYPE__PATH_TO:
				return PATH_TO_EDEFAULT == null ? pathTo != null : !PATH_TO_EDEFAULT.equals(pathTo);
			case MomlPackage.VERTEX_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(", name: ");
		result.append(name);
		result.append(", pathTo: ");
		result.append(pathTo);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //VertexTypeImpl
