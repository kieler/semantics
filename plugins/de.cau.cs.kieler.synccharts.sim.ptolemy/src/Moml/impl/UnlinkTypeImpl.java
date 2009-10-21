/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Moml.impl;

import Moml.MomlPackage;
import Moml.UnlinkType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unlink Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Moml.impl.UnlinkTypeImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link Moml.impl.UnlinkTypeImpl#getInsideIndex <em>Inside Index</em>}</li>
 *   <li>{@link Moml.impl.UnlinkTypeImpl#getPort <em>Port</em>}</li>
 *   <li>{@link Moml.impl.UnlinkTypeImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link Moml.impl.UnlinkTypeImpl#getRelation1 <em>Relation1</em>}</li>
 *   <li>{@link Moml.impl.UnlinkTypeImpl#getRelation2 <em>Relation2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnlinkTypeImpl extends EObjectImpl implements UnlinkType {
	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final String INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected String index = INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getInsideIndex() <em>Inside Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsideIndex()
	 * @generated
	 * @ordered
	 */
	protected static final String INSIDE_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInsideIndex() <em>Inside Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsideIndex()
	 * @generated
	 * @ordered
	 */
	protected String insideIndex = INSIDE_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected String port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelation() <em>Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelation() <em>Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation()
	 * @generated
	 * @ordered
	 */
	protected String relation = RELATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelation1() <em>Relation1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation1()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelation1() <em>Relation1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation1()
	 * @generated
	 * @ordered
	 */
	protected String relation1 = RELATION1_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelation2() <em>Relation2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation2()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATION2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelation2() <em>Relation2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation2()
	 * @generated
	 * @ordered
	 */
	protected String relation2 = RELATION2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnlinkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MomlPackage.Literals.UNLINK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(String newIndex) {
		String oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MomlPackage.UNLINK_TYPE__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInsideIndex() {
		return insideIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsideIndex(String newInsideIndex) {
		String oldInsideIndex = insideIndex;
		insideIndex = newInsideIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MomlPackage.UNLINK_TYPE__INSIDE_INDEX, oldInsideIndex, insideIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(String newPort) {
		String oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MomlPackage.UNLINK_TYPE__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelation() {
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelation(String newRelation) {
		String oldRelation = relation;
		relation = newRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MomlPackage.UNLINK_TYPE__RELATION, oldRelation, relation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelation1() {
		return relation1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelation1(String newRelation1) {
		String oldRelation1 = relation1;
		relation1 = newRelation1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MomlPackage.UNLINK_TYPE__RELATION1, oldRelation1, relation1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelation2() {
		return relation2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelation2(String newRelation2) {
		String oldRelation2 = relation2;
		relation2 = newRelation2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MomlPackage.UNLINK_TYPE__RELATION2, oldRelation2, relation2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MomlPackage.UNLINK_TYPE__INDEX:
				return getIndex();
			case MomlPackage.UNLINK_TYPE__INSIDE_INDEX:
				return getInsideIndex();
			case MomlPackage.UNLINK_TYPE__PORT:
				return getPort();
			case MomlPackage.UNLINK_TYPE__RELATION:
				return getRelation();
			case MomlPackage.UNLINK_TYPE__RELATION1:
				return getRelation1();
			case MomlPackage.UNLINK_TYPE__RELATION2:
				return getRelation2();
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
			case MomlPackage.UNLINK_TYPE__INDEX:
				setIndex((String)newValue);
				return;
			case MomlPackage.UNLINK_TYPE__INSIDE_INDEX:
				setInsideIndex((String)newValue);
				return;
			case MomlPackage.UNLINK_TYPE__PORT:
				setPort((String)newValue);
				return;
			case MomlPackage.UNLINK_TYPE__RELATION:
				setRelation((String)newValue);
				return;
			case MomlPackage.UNLINK_TYPE__RELATION1:
				setRelation1((String)newValue);
				return;
			case MomlPackage.UNLINK_TYPE__RELATION2:
				setRelation2((String)newValue);
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
			case MomlPackage.UNLINK_TYPE__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case MomlPackage.UNLINK_TYPE__INSIDE_INDEX:
				setInsideIndex(INSIDE_INDEX_EDEFAULT);
				return;
			case MomlPackage.UNLINK_TYPE__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case MomlPackage.UNLINK_TYPE__RELATION:
				setRelation(RELATION_EDEFAULT);
				return;
			case MomlPackage.UNLINK_TYPE__RELATION1:
				setRelation1(RELATION1_EDEFAULT);
				return;
			case MomlPackage.UNLINK_TYPE__RELATION2:
				setRelation2(RELATION2_EDEFAULT);
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
			case MomlPackage.UNLINK_TYPE__INDEX:
				return INDEX_EDEFAULT == null ? index != null : !INDEX_EDEFAULT.equals(index);
			case MomlPackage.UNLINK_TYPE__INSIDE_INDEX:
				return INSIDE_INDEX_EDEFAULT == null ? insideIndex != null : !INSIDE_INDEX_EDEFAULT.equals(insideIndex);
			case MomlPackage.UNLINK_TYPE__PORT:
				return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
			case MomlPackage.UNLINK_TYPE__RELATION:
				return RELATION_EDEFAULT == null ? relation != null : !RELATION_EDEFAULT.equals(relation);
			case MomlPackage.UNLINK_TYPE__RELATION1:
				return RELATION1_EDEFAULT == null ? relation1 != null : !RELATION1_EDEFAULT.equals(relation1);
			case MomlPackage.UNLINK_TYPE__RELATION2:
				return RELATION2_EDEFAULT == null ? relation2 != null : !RELATION2_EDEFAULT.equals(relation2);
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
		result.append(" (index: ");
		result.append(index);
		result.append(", insideIndex: ");
		result.append(insideIndex);
		result.append(", port: ");
		result.append(port);
		result.append(", relation: ");
		result.append(relation);
		result.append(", relation1: ");
		result.append(relation1);
		result.append(", relation2: ");
		result.append(relation2);
		result.append(')');
		return result.toString();
	}

} //UnlinkTypeImpl
