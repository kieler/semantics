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
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts.impl;

import de.cau.cs.kieler.synccharts.Renaming;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Renaming</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.RenamingImpl#getParentState <em>Parent State</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.RenamingImpl#getOldID <em>Old ID</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.RenamingImpl#getNewID <em>New ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RenamingImpl extends EObjectImpl implements Renaming {
	/**
     * The default value of the '{@link #getOldID() <em>Old ID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOldID()
     * @generated
     * @ordered
     */
	protected static final String OLD_ID_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getOldID() <em>Old ID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOldID()
     * @generated
     * @ordered
     */
	protected String oldID = OLD_ID_EDEFAULT;

	/**
     * The default value of the '{@link #getNewID() <em>New ID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getNewID()
     * @generated
     * @ordered
     */
	protected static final String NEW_ID_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getNewID() <em>New ID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getNewID()
     * @generated
     * @ordered
     */
	protected String newID = NEW_ID_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected RenamingImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SyncchartsPackage.Literals.RENAMING;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public State getParentState() {
        if (eContainerFeatureID() != SyncchartsPackage.RENAMING__PARENT_STATE) return null;
        return (State)eContainer();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetParentState(State newParentState, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentState, SyncchartsPackage.RENAMING__PARENT_STATE, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setParentState(State newParentState) {
        if (newParentState != eInternalContainer() || (eContainerFeatureID() != SyncchartsPackage.RENAMING__PARENT_STATE && newParentState != null)) {
            if (EcoreUtil.isAncestor(this, newParentState))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentState != null)
                msgs = ((InternalEObject)newParentState).eInverseAdd(this, SyncchartsPackage.STATE__RENAMINGS, State.class, msgs);
            msgs = basicSetParentState(newParentState, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.RENAMING__PARENT_STATE, newParentState, newParentState));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getOldID() {
        return oldID;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setOldID(String newOldID) {
        String oldOldID = oldID;
        oldID = newOldID;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.RENAMING__OLD_ID, oldOldID, oldID));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getNewID() {
        return newID;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setNewID(String newNewID) {
        String oldNewID = newID;
        newID = newNewID;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.RENAMING__NEW_ID, oldNewID, newID));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SyncchartsPackage.RENAMING__PARENT_STATE:
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
            case SyncchartsPackage.RENAMING__PARENT_STATE:
                return basicSetParentState(null, msgs);
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
            case SyncchartsPackage.RENAMING__PARENT_STATE:
                return eInternalContainer().eInverseRemove(this, SyncchartsPackage.STATE__RENAMINGS, State.class, msgs);
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
            case SyncchartsPackage.RENAMING__PARENT_STATE:
                return getParentState();
            case SyncchartsPackage.RENAMING__OLD_ID:
                return getOldID();
            case SyncchartsPackage.RENAMING__NEW_ID:
                return getNewID();
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
            case SyncchartsPackage.RENAMING__PARENT_STATE:
                setParentState((State)newValue);
                return;
            case SyncchartsPackage.RENAMING__OLD_ID:
                setOldID((String)newValue);
                return;
            case SyncchartsPackage.RENAMING__NEW_ID:
                setNewID((String)newValue);
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
            case SyncchartsPackage.RENAMING__PARENT_STATE:
                setParentState((State)null);
                return;
            case SyncchartsPackage.RENAMING__OLD_ID:
                setOldID(OLD_ID_EDEFAULT);
                return;
            case SyncchartsPackage.RENAMING__NEW_ID:
                setNewID(NEW_ID_EDEFAULT);
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
            case SyncchartsPackage.RENAMING__PARENT_STATE:
                return getParentState() != null;
            case SyncchartsPackage.RENAMING__OLD_ID:
                return OLD_ID_EDEFAULT == null ? oldID != null : !OLD_ID_EDEFAULT.equals(oldID);
            case SyncchartsPackage.RENAMING__NEW_ID:
                return NEW_ID_EDEFAULT == null ? newID != null : !NEW_ID_EDEFAULT.equals(newID);
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
        result.append(" (oldID: ");
        result.append(oldID);
        result.append(", newID: ");
        result.append(newID);
        result.append(')');
        return result.toString();
    }

} //RenamingImpl
