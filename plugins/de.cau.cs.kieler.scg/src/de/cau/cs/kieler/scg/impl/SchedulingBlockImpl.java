/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.impl;

import de.cau.cs.kieler.core.kexpressions.ValuedObject;
import de.cau.cs.kieler.scg.Dependency;
import de.cau.cs.kieler.scg.Node;
import de.cau.cs.kieler.scg.ScgPackage;
import de.cau.cs.kieler.scg.SchedulingBlock;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduling Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.impl.SchedulingBlockImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.SchedulingBlockImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.SchedulingBlockImpl#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchedulingBlockImpl extends MinimalEObjectImpl.Container implements SchedulingBlock {
    /**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
    protected EList<Node> nodes;

    /**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
    protected EList<Dependency> dependencies;

    /**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
    protected ValuedObject guard;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected SchedulingBlockImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ScgPackage.Literals.SCHEDULING_BLOCK;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectResolvingEList<Node>(Node.class, this, ScgPackage.SCHEDULING_BLOCK__NODES);
		}
		return nodes;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Dependency> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectResolvingEList<Dependency>(Dependency.class, this, ScgPackage.SCHEDULING_BLOCK__DEPENDENCIES);
		}
		return dependencies;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ValuedObject getGuard() {
		return guard;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetGuard(ValuedObject newGuard, NotificationChain msgs) {
		ValuedObject oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgPackage.SCHEDULING_BLOCK__GUARD, oldGuard, newGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setGuard(ValuedObject newGuard) {
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgPackage.SCHEDULING_BLOCK__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgPackage.SCHEDULING_BLOCK__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.SCHEDULING_BLOCK__GUARD, newGuard, newGuard));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScgPackage.SCHEDULING_BLOCK__GUARD:
				return basicSetGuard(null, msgs);
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
			case ScgPackage.SCHEDULING_BLOCK__NODES:
				return getNodes();
			case ScgPackage.SCHEDULING_BLOCK__DEPENDENCIES:
				return getDependencies();
			case ScgPackage.SCHEDULING_BLOCK__GUARD:
				return getGuard();
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
			case ScgPackage.SCHEDULING_BLOCK__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case ScgPackage.SCHEDULING_BLOCK__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends Dependency>)newValue);
				return;
			case ScgPackage.SCHEDULING_BLOCK__GUARD:
				setGuard((ValuedObject)newValue);
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
			case ScgPackage.SCHEDULING_BLOCK__NODES:
				getNodes().clear();
				return;
			case ScgPackage.SCHEDULING_BLOCK__DEPENDENCIES:
				getDependencies().clear();
				return;
			case ScgPackage.SCHEDULING_BLOCK__GUARD:
				setGuard((ValuedObject)null);
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
			case ScgPackage.SCHEDULING_BLOCK__NODES:
				return nodes != null && !nodes.isEmpty();
			case ScgPackage.SCHEDULING_BLOCK__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case ScgPackage.SCHEDULING_BLOCK__GUARD:
				return guard != null;
		}
		return super.eIsSet(featureID);
	}

} //SchedulingBlockImpl
