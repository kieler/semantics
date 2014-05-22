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
package de.cau.cs.kieler.sccharts.impl;

import de.cau.cs.kieler.sccharts.For;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.SCChartsPackage;
import de.cau.cs.kieler.sccharts.State;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.RegionImpl#getStates <em>States</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.RegionImpl#getParentState <em>Parent State</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.RegionImpl#getFor <em>For</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegionImpl extends ScopeImpl implements Region {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
    protected EList<State> states;

    /**
	 * The cached value of the '{@link #getFor() <em>For</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFor()
	 * @generated
	 * @ordered
	 */
    protected For for_;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected RegionImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SCChartsPackage.Literals.REGION;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentWithInverseEList<State>(State.class, this, SCChartsPackage.REGION__STATES, SCChartsPackage.STATE__PARENT_REGION);
		}
		return states;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public State getParentState() {
		if (eContainerFeatureID() != SCChartsPackage.REGION__PARENT_STATE) return null;
		return (State)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetParentState(State newParentState, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentState, SCChartsPackage.REGION__PARENT_STATE, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setParentState(State newParentState) {
		if (newParentState != eInternalContainer() || (eContainerFeatureID() != SCChartsPackage.REGION__PARENT_STATE && newParentState != null)) {
			if (EcoreUtil.isAncestor(this, newParentState))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentState != null)
				msgs = ((InternalEObject)newParentState).eInverseAdd(this, SCChartsPackage.STATE__REGIONS, State.class, msgs);
			msgs = basicSetParentState(newParentState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.REGION__PARENT_STATE, newParentState, newParentState));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public For getFor() {
		return for_;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetFor(For newFor, NotificationChain msgs) {
		For oldFor = for_;
		for_ = newFor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCChartsPackage.REGION__FOR, oldFor, newFor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setFor(For newFor) {
		if (newFor != for_) {
			NotificationChain msgs = null;
			if (for_ != null)
				msgs = ((InternalEObject)for_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SCChartsPackage.REGION__FOR, null, msgs);
			if (newFor != null)
				msgs = ((InternalEObject)newFor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SCChartsPackage.REGION__FOR, null, msgs);
			msgs = basicSetFor(newFor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.REGION__FOR, newFor, newFor));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SCChartsPackage.REGION__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
			case SCChartsPackage.REGION__PARENT_STATE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentState((State)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SCChartsPackage.REGION__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case SCChartsPackage.REGION__PARENT_STATE:
				return basicSetParentState(null, msgs);
			case SCChartsPackage.REGION__FOR:
				return basicSetFor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SCChartsPackage.REGION__PARENT_STATE:
				return eInternalContainer().eInverseRemove(this, SCChartsPackage.STATE__REGIONS, State.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SCChartsPackage.REGION__STATES:
				return getStates();
			case SCChartsPackage.REGION__PARENT_STATE:
				return getParentState();
			case SCChartsPackage.REGION__FOR:
				return getFor();
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
			case SCChartsPackage.REGION__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case SCChartsPackage.REGION__PARENT_STATE:
				setParentState((State)newValue);
				return;
			case SCChartsPackage.REGION__FOR:
				setFor((For)newValue);
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
			case SCChartsPackage.REGION__STATES:
				getStates().clear();
				return;
			case SCChartsPackage.REGION__PARENT_STATE:
				setParentState((State)null);
				return;
			case SCChartsPackage.REGION__FOR:
				setFor((For)null);
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
			case SCChartsPackage.REGION__STATES:
				return states != null && !states.isEmpty();
			case SCChartsPackage.REGION__PARENT_STATE:
				return getParentState() != null;
			case SCChartsPackage.REGION__FOR:
				return for_ != null;
		}
		return super.eIsSet(featureID);
	}

} //RegionImpl
