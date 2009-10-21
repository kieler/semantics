/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Moml.impl;

import Moml.LinkType;
import Moml.MomlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Moml.impl.LinkTypeImpl#getInsertAt <em>Insert At</em>}</li>
 *   <li>{@link Moml.impl.LinkTypeImpl#getInsertInsideAt <em>Insert Inside At</em>}</li>
 *   <li>{@link Moml.impl.LinkTypeImpl#getPort <em>Port</em>}</li>
 *   <li>{@link Moml.impl.LinkTypeImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link Moml.impl.LinkTypeImpl#getRelation1 <em>Relation1</em>}</li>
 *   <li>{@link Moml.impl.LinkTypeImpl#getRelation2 <em>Relation2</em>}</li>
 *   <li>{@link Moml.impl.LinkTypeImpl#getVertex <em>Vertex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkTypeImpl extends EObjectImpl implements LinkType {
	/**
	 * The default value of the '{@link #getInsertAt() <em>Insert At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertAt()
	 * @generated
	 * @ordered
	 */
	protected static final String INSERT_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInsertAt() <em>Insert At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertAt()
	 * @generated
	 * @ordered
	 */
	protected String insertAt = INSERT_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInsertInsideAt() <em>Insert Inside At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertInsideAt()
	 * @generated
	 * @ordered
	 */
	protected static final String INSERT_INSIDE_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInsertInsideAt() <em>Insert Inside At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertInsideAt()
	 * @generated
	 * @ordered
	 */
	protected String insertInsideAt = INSERT_INSIDE_AT_EDEFAULT;

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
	 * The default value of the '{@link #getVertex() <em>Vertex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertex()
	 * @generated
	 * @ordered
	 */
	protected static final String VERTEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVertex() <em>Vertex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertex()
	 * @generated
	 * @ordered
	 */
	protected String vertex = VERTEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MomlPackage.Literals.LINK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInsertAt() {
		return insertAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertAt(String newInsertAt) {
		String oldInsertAt = insertAt;
		insertAt = newInsertAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MomlPackage.LINK_TYPE__INSERT_AT, oldInsertAt, insertAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInsertInsideAt() {
		return insertInsideAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertInsideAt(String newInsertInsideAt) {
		String oldInsertInsideAt = insertInsideAt;
		insertInsideAt = newInsertInsideAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MomlPackage.LINK_TYPE__INSERT_INSIDE_AT, oldInsertInsideAt, insertInsideAt));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MomlPackage.LINK_TYPE__PORT, oldPort, port));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MomlPackage.LINK_TYPE__RELATION, oldRelation, relation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MomlPackage.LINK_TYPE__RELATION1, oldRelation1, relation1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MomlPackage.LINK_TYPE__RELATION2, oldRelation2, relation2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVertex() {
		return vertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVertex(String newVertex) {
		String oldVertex = vertex;
		vertex = newVertex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MomlPackage.LINK_TYPE__VERTEX, oldVertex, vertex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MomlPackage.LINK_TYPE__INSERT_AT:
				return getInsertAt();
			case MomlPackage.LINK_TYPE__INSERT_INSIDE_AT:
				return getInsertInsideAt();
			case MomlPackage.LINK_TYPE__PORT:
				return getPort();
			case MomlPackage.LINK_TYPE__RELATION:
				return getRelation();
			case MomlPackage.LINK_TYPE__RELATION1:
				return getRelation1();
			case MomlPackage.LINK_TYPE__RELATION2:
				return getRelation2();
			case MomlPackage.LINK_TYPE__VERTEX:
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
			case MomlPackage.LINK_TYPE__INSERT_AT:
				setInsertAt((String)newValue);
				return;
			case MomlPackage.LINK_TYPE__INSERT_INSIDE_AT:
				setInsertInsideAt((String)newValue);
				return;
			case MomlPackage.LINK_TYPE__PORT:
				setPort((String)newValue);
				return;
			case MomlPackage.LINK_TYPE__RELATION:
				setRelation((String)newValue);
				return;
			case MomlPackage.LINK_TYPE__RELATION1:
				setRelation1((String)newValue);
				return;
			case MomlPackage.LINK_TYPE__RELATION2:
				setRelation2((String)newValue);
				return;
			case MomlPackage.LINK_TYPE__VERTEX:
				setVertex((String)newValue);
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
			case MomlPackage.LINK_TYPE__INSERT_AT:
				setInsertAt(INSERT_AT_EDEFAULT);
				return;
			case MomlPackage.LINK_TYPE__INSERT_INSIDE_AT:
				setInsertInsideAt(INSERT_INSIDE_AT_EDEFAULT);
				return;
			case MomlPackage.LINK_TYPE__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case MomlPackage.LINK_TYPE__RELATION:
				setRelation(RELATION_EDEFAULT);
				return;
			case MomlPackage.LINK_TYPE__RELATION1:
				setRelation1(RELATION1_EDEFAULT);
				return;
			case MomlPackage.LINK_TYPE__RELATION2:
				setRelation2(RELATION2_EDEFAULT);
				return;
			case MomlPackage.LINK_TYPE__VERTEX:
				setVertex(VERTEX_EDEFAULT);
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
			case MomlPackage.LINK_TYPE__INSERT_AT:
				return INSERT_AT_EDEFAULT == null ? insertAt != null : !INSERT_AT_EDEFAULT.equals(insertAt);
			case MomlPackage.LINK_TYPE__INSERT_INSIDE_AT:
				return INSERT_INSIDE_AT_EDEFAULT == null ? insertInsideAt != null : !INSERT_INSIDE_AT_EDEFAULT.equals(insertInsideAt);
			case MomlPackage.LINK_TYPE__PORT:
				return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
			case MomlPackage.LINK_TYPE__RELATION:
				return RELATION_EDEFAULT == null ? relation != null : !RELATION_EDEFAULT.equals(relation);
			case MomlPackage.LINK_TYPE__RELATION1:
				return RELATION1_EDEFAULT == null ? relation1 != null : !RELATION1_EDEFAULT.equals(relation1);
			case MomlPackage.LINK_TYPE__RELATION2:
				return RELATION2_EDEFAULT == null ? relation2 != null : !RELATION2_EDEFAULT.equals(relation2);
			case MomlPackage.LINK_TYPE__VERTEX:
				return VERTEX_EDEFAULT == null ? vertex != null : !VERTEX_EDEFAULT.equals(vertex);
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
		result.append(" (insertAt: ");
		result.append(insertAt);
		result.append(", insertInsideAt: ");
		result.append(insertInsideAt);
		result.append(", port: ");
		result.append(port);
		result.append(", relation: ");
		result.append(relation);
		result.append(", relation1: ");
		result.append(relation1);
		result.append(", relation2: ");
		result.append(relation2);
		result.append(", vertex: ");
		result.append(vertex);
		result.append(')');
		return result.toString();
	}

} //LinkTypeImpl
