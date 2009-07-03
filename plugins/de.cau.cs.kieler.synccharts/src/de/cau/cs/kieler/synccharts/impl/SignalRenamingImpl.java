/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts.impl;

import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.SignalRenaming;
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
 * An implementation of the model object '<em><b>Signal Renaming</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.SignalRenamingImpl#getOldSignal <em>Old Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.SignalRenamingImpl#getNewSignal <em>New Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.SignalRenamingImpl#getParentState <em>Parent State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignalRenamingImpl extends EObjectImpl implements SignalRenaming {
	/**
     * The cached value of the '{@link #getOldSignal() <em>Old Signal</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOldSignal()
     * @generated
     * @ordered
     */
	protected Signal oldSignal;

	/**
     * The cached value of the '{@link #getNewSignal() <em>New Signal</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getNewSignal()
     * @generated
     * @ordered
     */
	protected Signal newSignal;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SignalRenamingImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SyncchartsPackage.Literals.SIGNAL_RENAMING;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Signal getOldSignal() {
        if (oldSignal != null && oldSignal.eIsProxy()) {
            InternalEObject oldOldSignal = (InternalEObject)oldSignal;
            oldSignal = (Signal)eResolveProxy(oldOldSignal);
            if (oldSignal != oldOldSignal) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SyncchartsPackage.SIGNAL_RENAMING__OLD_SIGNAL, oldOldSignal, oldSignal));
            }
        }
        return oldSignal;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Signal basicGetOldSignal() {
        return oldSignal;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setOldSignal(Signal newOldSignal) {
        Signal oldOldSignal = oldSignal;
        oldSignal = newOldSignal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.SIGNAL_RENAMING__OLD_SIGNAL, oldOldSignal, oldSignal));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Signal getNewSignal() {
        if (newSignal != null && newSignal.eIsProxy()) {
            InternalEObject oldNewSignal = (InternalEObject)newSignal;
            newSignal = (Signal)eResolveProxy(oldNewSignal);
            if (newSignal != oldNewSignal) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SyncchartsPackage.SIGNAL_RENAMING__NEW_SIGNAL, oldNewSignal, newSignal));
            }
        }
        return newSignal;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Signal basicGetNewSignal() {
        return newSignal;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setNewSignal(Signal newNewSignal) {
        Signal oldNewSignal = newSignal;
        newSignal = newNewSignal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.SIGNAL_RENAMING__NEW_SIGNAL, oldNewSignal, newSignal));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public State getParentState() {
        if (eContainerFeatureID() != SyncchartsPackage.SIGNAL_RENAMING__PARENT_STATE) return null;
        return (State)eContainer();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetParentState(State newParentState, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentState, SyncchartsPackage.SIGNAL_RENAMING__PARENT_STATE, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setParentState(State newParentState) {
        if (newParentState != eInternalContainer() || (eContainerFeatureID() != SyncchartsPackage.SIGNAL_RENAMING__PARENT_STATE && newParentState != null)) {
            if (EcoreUtil.isAncestor(this, newParentState))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentState != null)
                msgs = ((InternalEObject)newParentState).eInverseAdd(this, SyncchartsPackage.STATE__SIGNAL_RENAMINGS, State.class, msgs);
            msgs = basicSetParentState(newParentState, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.SIGNAL_RENAMING__PARENT_STATE, newParentState, newParentState));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SyncchartsPackage.SIGNAL_RENAMING__PARENT_STATE:
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
            case SyncchartsPackage.SIGNAL_RENAMING__PARENT_STATE:
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
            case SyncchartsPackage.SIGNAL_RENAMING__PARENT_STATE:
                return eInternalContainer().eInverseRemove(this, SyncchartsPackage.STATE__SIGNAL_RENAMINGS, State.class, msgs);
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
            case SyncchartsPackage.SIGNAL_RENAMING__OLD_SIGNAL:
                if (resolve) return getOldSignal();
                return basicGetOldSignal();
            case SyncchartsPackage.SIGNAL_RENAMING__NEW_SIGNAL:
                if (resolve) return getNewSignal();
                return basicGetNewSignal();
            case SyncchartsPackage.SIGNAL_RENAMING__PARENT_STATE:
                return getParentState();
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
            case SyncchartsPackage.SIGNAL_RENAMING__OLD_SIGNAL:
                setOldSignal((Signal)newValue);
                return;
            case SyncchartsPackage.SIGNAL_RENAMING__NEW_SIGNAL:
                setNewSignal((Signal)newValue);
                return;
            case SyncchartsPackage.SIGNAL_RENAMING__PARENT_STATE:
                setParentState((State)newValue);
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
            case SyncchartsPackage.SIGNAL_RENAMING__OLD_SIGNAL:
                setOldSignal((Signal)null);
                return;
            case SyncchartsPackage.SIGNAL_RENAMING__NEW_SIGNAL:
                setNewSignal((Signal)null);
                return;
            case SyncchartsPackage.SIGNAL_RENAMING__PARENT_STATE:
                setParentState((State)null);
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
            case SyncchartsPackage.SIGNAL_RENAMING__OLD_SIGNAL:
                return oldSignal != null;
            case SyncchartsPackage.SIGNAL_RENAMING__NEW_SIGNAL:
                return newSignal != null;
            case SyncchartsPackage.SIGNAL_RENAMING__PARENT_STATE:
                return getParentState() != null;
        }
        return super.eIsSet(featureID);
    }

} //SignalRenamingImpl
