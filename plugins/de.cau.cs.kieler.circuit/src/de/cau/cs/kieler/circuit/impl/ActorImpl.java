/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

/**
 */
package de.cau.cs.kieler.circuit.impl;

import de.cau.cs.kieler.circuit.Actor;
import de.cau.cs.kieler.circuit.CircuitPackage;
import de.cau.cs.kieler.circuit.Link;
import de.cau.cs.kieler.circuit.Port;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.circuit.impl.ActorImpl#getInnerActors <em>Inner Actors</em>}</li>
 *   <li>{@link de.cau.cs.kieler.circuit.impl.ActorImpl#getInnerLinks <em>Inner Links</em>}</li>
 *   <li>{@link de.cau.cs.kieler.circuit.impl.ActorImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.circuit.impl.ActorImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link de.cau.cs.kieler.circuit.impl.ActorImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorImpl extends LinkableImpl implements Actor {
	/**
     * The cached value of the '{@link #getInnerActors() <em>Inner Actors</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getInnerActors()
     * @generated
     * @ordered
     */
	protected EList<Actor> innerActors;

	/**
     * The cached value of the '{@link #getInnerLinks() <em>Inner Links</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getInnerLinks()
     * @generated
     * @ordered
     */
	protected EList<Link> innerLinks;

	/**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
	protected static final String TYPE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
	protected String type = TYPE_EDEFAULT;

	/**
     * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPorts()
     * @generated
     * @ordered
     */
	protected EList<Port> ports;

	/**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final int ID_EDEFAULT = -1;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected int id = ID_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ActorImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return CircuitPackage.Literals.ACTOR;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Actor> getInnerActors() {
        if (innerActors == null) {
            innerActors = new EObjectContainmentEList<Actor>(Actor.class, this, CircuitPackage.ACTOR__INNER_ACTORS);
        }
        return innerActors;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Link> getInnerLinks() {
        if (innerLinks == null) {
            innerLinks = new EObjectContainmentEList<Link>(Link.class, this, CircuitPackage.ACTOR__INNER_LINKS);
        }
        return innerLinks;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Port> getPorts() {
        if (ports == null) {
            ports = new EObjectContainmentEList<Port>(Port.class, this, CircuitPackage.ACTOR__PORTS);
        }
        return ports;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(int newId) {
        int oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CircuitPackage.ACTOR__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getType() {
        return type;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setType(String newType) {
        String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CircuitPackage.ACTOR__TYPE, oldType, type));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CircuitPackage.ACTOR__INNER_ACTORS:
                return ((InternalEList<?>)getInnerActors()).basicRemove(otherEnd, msgs);
            case CircuitPackage.ACTOR__INNER_LINKS:
                return ((InternalEList<?>)getInnerLinks()).basicRemove(otherEnd, msgs);
            case CircuitPackage.ACTOR__PORTS:
                return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
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
            case CircuitPackage.ACTOR__INNER_ACTORS:
                return getInnerActors();
            case CircuitPackage.ACTOR__INNER_LINKS:
                return getInnerLinks();
            case CircuitPackage.ACTOR__TYPE:
                return getType();
            case CircuitPackage.ACTOR__PORTS:
                return getPorts();
            case CircuitPackage.ACTOR__ID:
                return getId();
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
            case CircuitPackage.ACTOR__INNER_ACTORS:
                getInnerActors().clear();
                getInnerActors().addAll((Collection<? extends Actor>)newValue);
                return;
            case CircuitPackage.ACTOR__INNER_LINKS:
                getInnerLinks().clear();
                getInnerLinks().addAll((Collection<? extends Link>)newValue);
                return;
            case CircuitPackage.ACTOR__TYPE:
                setType((String)newValue);
                return;
            case CircuitPackage.ACTOR__PORTS:
                getPorts().clear();
                getPorts().addAll((Collection<? extends Port>)newValue);
                return;
            case CircuitPackage.ACTOR__ID:
                setId((Integer)newValue);
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
            case CircuitPackage.ACTOR__INNER_ACTORS:
                getInnerActors().clear();
                return;
            case CircuitPackage.ACTOR__INNER_LINKS:
                getInnerLinks().clear();
                return;
            case CircuitPackage.ACTOR__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case CircuitPackage.ACTOR__PORTS:
                getPorts().clear();
                return;
            case CircuitPackage.ACTOR__ID:
                setId(ID_EDEFAULT);
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
            case CircuitPackage.ACTOR__INNER_ACTORS:
                return innerActors != null && !innerActors.isEmpty();
            case CircuitPackage.ACTOR__INNER_LINKS:
                return innerLinks != null && !innerLinks.isEmpty();
            case CircuitPackage.ACTOR__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case CircuitPackage.ACTOR__PORTS:
                return ports != null && !ports.isEmpty();
            case CircuitPackage.ACTOR__ID:
                return id != ID_EDEFAULT;
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
        result.append(" (type: ");
        result.append(type);
        result.append(", id: ");
        result.append(id);
        result.append(')');
        return result.toString();
    }

} //ActorImpl
