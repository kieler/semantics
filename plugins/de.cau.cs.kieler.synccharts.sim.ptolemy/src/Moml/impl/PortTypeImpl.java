/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Moml.impl;

import Moml.ConfigureType;
import Moml.DocType;
import Moml.MomlPackage;
import Moml.PortType;
import Moml.PropertyType;
import Moml.RenameType;

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
 * An implementation of the model object '<em><b>Port Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Moml.impl.PortTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link Moml.impl.PortTypeImpl#getConfigure <em>Configure</em>}</li>
 *   <li>{@link Moml.impl.PortTypeImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link Moml.impl.PortTypeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link Moml.impl.PortTypeImpl#getRename <em>Rename</em>}</li>
 *   <li>{@link Moml.impl.PortTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link Moml.impl.PortTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortTypeImpl extends EObjectImpl implements PortType {
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
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MomlPackage.Literals.PORT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, MomlPackage.PORT_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigureType> getConfigure() {
		return getGroup().list(MomlPackage.Literals.PORT_TYPE__CONFIGURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocType> getDoc() {
		return getGroup().list(MomlPackage.Literals.PORT_TYPE__DOC);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyType> getProperty() {
		return getGroup().list(MomlPackage.Literals.PORT_TYPE__PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RenameType> getRename() {
		return getGroup().list(MomlPackage.Literals.PORT_TYPE__RENAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MomlPackage.PORT_TYPE__CLASS, oldClass, class_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MomlPackage.PORT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MomlPackage.PORT_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case MomlPackage.PORT_TYPE__CONFIGURE:
				return ((InternalEList<?>)getConfigure()).basicRemove(otherEnd, msgs);
			case MomlPackage.PORT_TYPE__DOC:
				return ((InternalEList<?>)getDoc()).basicRemove(otherEnd, msgs);
			case MomlPackage.PORT_TYPE__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case MomlPackage.PORT_TYPE__RENAME:
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
			case MomlPackage.PORT_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case MomlPackage.PORT_TYPE__CONFIGURE:
				return getConfigure();
			case MomlPackage.PORT_TYPE__DOC:
				return getDoc();
			case MomlPackage.PORT_TYPE__PROPERTY:
				return getProperty();
			case MomlPackage.PORT_TYPE__RENAME:
				return getRename();
			case MomlPackage.PORT_TYPE__CLASS:
				return getClass_();
			case MomlPackage.PORT_TYPE__NAME:
				return getName();
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
			case MomlPackage.PORT_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case MomlPackage.PORT_TYPE__CONFIGURE:
				getConfigure().clear();
				getConfigure().addAll((Collection<? extends ConfigureType>)newValue);
				return;
			case MomlPackage.PORT_TYPE__DOC:
				getDoc().clear();
				getDoc().addAll((Collection<? extends DocType>)newValue);
				return;
			case MomlPackage.PORT_TYPE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends PropertyType>)newValue);
				return;
			case MomlPackage.PORT_TYPE__RENAME:
				getRename().clear();
				getRename().addAll((Collection<? extends RenameType>)newValue);
				return;
			case MomlPackage.PORT_TYPE__CLASS:
				setClass((String)newValue);
				return;
			case MomlPackage.PORT_TYPE__NAME:
				setName((String)newValue);
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
			case MomlPackage.PORT_TYPE__GROUP:
				getGroup().clear();
				return;
			case MomlPackage.PORT_TYPE__CONFIGURE:
				getConfigure().clear();
				return;
			case MomlPackage.PORT_TYPE__DOC:
				getDoc().clear();
				return;
			case MomlPackage.PORT_TYPE__PROPERTY:
				getProperty().clear();
				return;
			case MomlPackage.PORT_TYPE__RENAME:
				getRename().clear();
				return;
			case MomlPackage.PORT_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case MomlPackage.PORT_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case MomlPackage.PORT_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case MomlPackage.PORT_TYPE__CONFIGURE:
				return !getConfigure().isEmpty();
			case MomlPackage.PORT_TYPE__DOC:
				return !getDoc().isEmpty();
			case MomlPackage.PORT_TYPE__PROPERTY:
				return !getProperty().isEmpty();
			case MomlPackage.PORT_TYPE__RENAME:
				return !getRename().isEmpty();
			case MomlPackage.PORT_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case MomlPackage.PORT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(", class: ");
		result.append(class_);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PortTypeImpl
