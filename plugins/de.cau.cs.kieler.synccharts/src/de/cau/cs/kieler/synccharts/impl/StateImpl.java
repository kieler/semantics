/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.impl;

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.StateType;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.StateImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.StateImpl#getRegions <em>Regions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.StateImpl#getParentRegion <em>Parent Region</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.StateImpl#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.StateImpl#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.StateImpl#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.StateImpl#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends ScopeImpl implements State {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2009 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
    protected static final StateType TYPE_EDEFAULT = StateType.NORMAL;

    /**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
    protected StateType type = TYPE_EDEFAULT;

    /**
	 * The cached value of the '{@link #getRegions() <em>Regions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRegions()
	 * @generated
	 * @ordered
	 */
    protected EList<Region> regions;

    /**
	 * The default value of the '{@link #isIsInitial() <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isIsInitial()
	 * @generated
	 * @ordered
	 */
    protected static final boolean IS_INITIAL_EDEFAULT = false;

    /**
	 * The cached value of the '{@link #isIsInitial() <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isIsInitial()
	 * @generated
	 * @ordered
	 */
    protected boolean isInitial = IS_INITIAL_EDEFAULT;

    /**
	 * The default value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isIsFinal()
	 * @generated
	 * @ordered
	 */
    protected static final boolean IS_FINAL_EDEFAULT = false;

    /**
	 * The cached value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isIsFinal()
	 * @generated
	 * @ordered
	 */
    protected boolean isFinal = IS_FINAL_EDEFAULT;

    /**
	 * The cached value of the '{@link #getOutgoingTransitions() <em>Outgoing Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getOutgoingTransitions()
	 * @generated
	 * @ordered
	 */
    protected EList<Transition> outgoingTransitions;

    /**
	 * The cached value of the '{@link #getIncomingTransitions() <em>Incoming Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIncomingTransitions()
	 * @generated
	 * @ordered
	 */
    protected EList<Transition> incomingTransitions;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected StateImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SyncchartsPackage.Literals.STATE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public StateType getType() {
		return type;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setType(StateType newType) {
		StateType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.STATE__TYPE, oldType, type));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Region> getRegions() {
		if (regions == null) {
			regions = new EObjectContainmentWithInverseEList<Region>(Region.class, this, SyncchartsPackage.STATE__REGIONS, SyncchartsPackage.REGION__PARENT_STATE);
		}
		return regions;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Region getParentRegion() {
		if (eContainerFeatureID() != SyncchartsPackage.STATE__PARENT_REGION) return null;
		return (Region)eContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetParentRegion(Region newParentRegion, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentRegion, SyncchartsPackage.STATE__PARENT_REGION, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setParentRegion(Region newParentRegion) {
		if (newParentRegion != eInternalContainer() || (eContainerFeatureID() != SyncchartsPackage.STATE__PARENT_REGION && newParentRegion != null)) {
			if (EcoreUtil.isAncestor(this, newParentRegion))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentRegion != null)
				msgs = ((InternalEObject)newParentRegion).eInverseAdd(this, SyncchartsPackage.REGION__STATES, Region.class, msgs);
			msgs = basicSetParentRegion(newParentRegion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.STATE__PARENT_REGION, newParentRegion, newParentRegion));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isIsInitial() {
		return isInitial;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setIsInitial(boolean newIsInitial) {
		boolean oldIsInitial = isInitial;
		isInitial = newIsInitial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.STATE__IS_INITIAL, oldIsInitial, isInitial));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isIsFinal() {
		return isFinal;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setIsFinal(boolean newIsFinal) {
		boolean oldIsFinal = isFinal;
		isFinal = newIsFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.STATE__IS_FINAL, oldIsFinal, isFinal));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Transition> getOutgoingTransitions() {
		if (outgoingTransitions == null) {
			outgoingTransitions = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this, SyncchartsPackage.STATE__OUTGOING_TRANSITIONS, SyncchartsPackage.TRANSITION__SOURCE_STATE);
		}
		return outgoingTransitions;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Transition> getIncomingTransitions() {
		if (incomingTransitions == null) {
			incomingTransitions = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, SyncchartsPackage.STATE__INCOMING_TRANSITIONS, SyncchartsPackage.TRANSITION__TARGET_STATE);
		}
		return incomingTransitions;
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
			case SyncchartsPackage.STATE__REGIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRegions()).basicAdd(otherEnd, msgs);
			case SyncchartsPackage.STATE__PARENT_REGION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentRegion((Region)otherEnd, msgs);
			case SyncchartsPackage.STATE__OUTGOING_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingTransitions()).basicAdd(otherEnd, msgs);
			case SyncchartsPackage.STATE__INCOMING_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingTransitions()).basicAdd(otherEnd, msgs);
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
			case SyncchartsPackage.STATE__REGIONS:
				return ((InternalEList<?>)getRegions()).basicRemove(otherEnd, msgs);
			case SyncchartsPackage.STATE__PARENT_REGION:
				return basicSetParentRegion(null, msgs);
			case SyncchartsPackage.STATE__OUTGOING_TRANSITIONS:
				return ((InternalEList<?>)getOutgoingTransitions()).basicRemove(otherEnd, msgs);
			case SyncchartsPackage.STATE__INCOMING_TRANSITIONS:
				return ((InternalEList<?>)getIncomingTransitions()).basicRemove(otherEnd, msgs);
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
			case SyncchartsPackage.STATE__PARENT_REGION:
				return eInternalContainer().eInverseRemove(this, SyncchartsPackage.REGION__STATES, Region.class, msgs);
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
			case SyncchartsPackage.STATE__TYPE:
				return getType();
			case SyncchartsPackage.STATE__REGIONS:
				return getRegions();
			case SyncchartsPackage.STATE__PARENT_REGION:
				return getParentRegion();
			case SyncchartsPackage.STATE__IS_INITIAL:
				return isIsInitial();
			case SyncchartsPackage.STATE__IS_FINAL:
				return isIsFinal();
			case SyncchartsPackage.STATE__OUTGOING_TRANSITIONS:
				return getOutgoingTransitions();
			case SyncchartsPackage.STATE__INCOMING_TRANSITIONS:
				return getIncomingTransitions();
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
			case SyncchartsPackage.STATE__TYPE:
				setType((StateType)newValue);
				return;
			case SyncchartsPackage.STATE__REGIONS:
				getRegions().clear();
				getRegions().addAll((Collection<? extends Region>)newValue);
				return;
			case SyncchartsPackage.STATE__PARENT_REGION:
				setParentRegion((Region)newValue);
				return;
			case SyncchartsPackage.STATE__IS_INITIAL:
				setIsInitial((Boolean)newValue);
				return;
			case SyncchartsPackage.STATE__IS_FINAL:
				setIsFinal((Boolean)newValue);
				return;
			case SyncchartsPackage.STATE__OUTGOING_TRANSITIONS:
				getOutgoingTransitions().clear();
				getOutgoingTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case SyncchartsPackage.STATE__INCOMING_TRANSITIONS:
				getIncomingTransitions().clear();
				getIncomingTransitions().addAll((Collection<? extends Transition>)newValue);
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
			case SyncchartsPackage.STATE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SyncchartsPackage.STATE__REGIONS:
				getRegions().clear();
				return;
			case SyncchartsPackage.STATE__PARENT_REGION:
				setParentRegion((Region)null);
				return;
			case SyncchartsPackage.STATE__IS_INITIAL:
				setIsInitial(IS_INITIAL_EDEFAULT);
				return;
			case SyncchartsPackage.STATE__IS_FINAL:
				setIsFinal(IS_FINAL_EDEFAULT);
				return;
			case SyncchartsPackage.STATE__OUTGOING_TRANSITIONS:
				getOutgoingTransitions().clear();
				return;
			case SyncchartsPackage.STATE__INCOMING_TRANSITIONS:
				getIncomingTransitions().clear();
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
			case SyncchartsPackage.STATE__TYPE:
				return type != TYPE_EDEFAULT;
			case SyncchartsPackage.STATE__REGIONS:
				return regions != null && !regions.isEmpty();
			case SyncchartsPackage.STATE__PARENT_REGION:
				return getParentRegion() != null;
			case SyncchartsPackage.STATE__IS_INITIAL:
				return isInitial != IS_INITIAL_EDEFAULT;
			case SyncchartsPackage.STATE__IS_FINAL:
				return isFinal != IS_FINAL_EDEFAULT;
			case SyncchartsPackage.STATE__OUTGOING_TRANSITIONS:
				return outgoingTransitions != null && !outgoingTransitions.isEmpty();
			case SyncchartsPackage.STATE__INCOMING_TRANSITIONS:
				return incomingTransitions != null && !incomingTransitions.isEmpty();
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
		result.append(", isInitial: ");
		result.append(isInitial);
		result.append(", isFinal: ");
		result.append(isFinal);
		result.append(')');
		return result.toString();
	}

} //StateImpl
