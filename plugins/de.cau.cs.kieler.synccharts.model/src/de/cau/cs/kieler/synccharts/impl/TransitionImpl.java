/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts.impl;

import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.TransitionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.TransitionImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.TransitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.TransitionImpl#getTargetState <em>Target State</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.TransitionImpl#getSourceState <em>Source State</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.TransitionImpl#isIsHistory <em>Is History</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends ActionImpl implements Transition {
    /**
     * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPriority()
     * @generated
     * @ordered
     */
    protected static final int PRIORITY_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPriority()
     * @generated
     * @ordered
     */
    protected int priority = PRIORITY_EDEFAULT;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final TransitionType TYPE_EDEFAULT = TransitionType.WEAKABORT;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected TransitionType type = TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getTargetState() <em>Target State</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetState()
     * @generated
     * @ordered
     */
    protected State targetState;

    /**
     * The default value of the '{@link #isIsHistory() <em>Is History</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsHistory()
     * @generated
     * @ordered
     */
    protected static final boolean IS_HISTORY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsHistory() <em>Is History</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsHistory()
     * @generated
     * @ordered
     */
    protected boolean isHistory = IS_HISTORY_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TransitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SyncchartsPackage.Literals.TRANSITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPriority() {
        return priority;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPriority(int newPriority) {
        int oldPriority = priority;
        priority = newPriority;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.TRANSITION__PRIORITY, oldPriority, priority));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransitionType getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(TransitionType newType) {
        TransitionType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.TRANSITION__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public State getTargetState() {
        if (targetState != null && targetState.eIsProxy()) {
            InternalEObject oldTargetState = (InternalEObject)targetState;
            targetState = (State)eResolveProxy(oldTargetState);
            if (targetState != oldTargetState) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SyncchartsPackage.TRANSITION__TARGET_STATE, oldTargetState, targetState));
            }
        }
        return targetState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public State basicGetTargetState() {
        return targetState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTargetState(State newTargetState) {
        State oldTargetState = targetState;
        targetState = newTargetState;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.TRANSITION__TARGET_STATE, oldTargetState, targetState));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public State getSourceState() {
        if (eContainerFeatureID() != SyncchartsPackage.TRANSITION__SOURCE_STATE) return null;
        return (State)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSourceState(State newSourceState, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newSourceState, SyncchartsPackage.TRANSITION__SOURCE_STATE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSourceState(State newSourceState) {
        if (newSourceState != eInternalContainer() || (eContainerFeatureID() != SyncchartsPackage.TRANSITION__SOURCE_STATE && newSourceState != null)) {
            if (EcoreUtil.isAncestor(this, newSourceState))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newSourceState != null)
                msgs = ((InternalEObject)newSourceState).eInverseAdd(this, SyncchartsPackage.STATE__OUTGOING_TRANSITIONS, State.class, msgs);
            msgs = basicSetSourceState(newSourceState, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.TRANSITION__SOURCE_STATE, newSourceState, newSourceState));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsHistory() {
        return isHistory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsHistory(boolean newIsHistory) {
        boolean oldIsHistory = isHistory;
        isHistory = newIsHistory;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.TRANSITION__IS_HISTORY, oldIsHistory, isHistory));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SyncchartsPackage.TRANSITION__SOURCE_STATE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetSourceState((State)otherEnd, msgs);
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
            case SyncchartsPackage.TRANSITION__SOURCE_STATE:
                return basicSetSourceState(null, msgs);
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
            case SyncchartsPackage.TRANSITION__SOURCE_STATE:
                return eInternalContainer().eInverseRemove(this, SyncchartsPackage.STATE__OUTGOING_TRANSITIONS, State.class, msgs);
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
            case SyncchartsPackage.TRANSITION__PRIORITY:
                return getPriority();
            case SyncchartsPackage.TRANSITION__TYPE:
                return getType();
            case SyncchartsPackage.TRANSITION__TARGET_STATE:
                if (resolve) return getTargetState();
                return basicGetTargetState();
            case SyncchartsPackage.TRANSITION__SOURCE_STATE:
                return getSourceState();
            case SyncchartsPackage.TRANSITION__IS_HISTORY:
                return isIsHistory();
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
            case SyncchartsPackage.TRANSITION__PRIORITY:
                setPriority((Integer)newValue);
                return;
            case SyncchartsPackage.TRANSITION__TYPE:
                setType((TransitionType)newValue);
                return;
            case SyncchartsPackage.TRANSITION__TARGET_STATE:
                setTargetState((State)newValue);
                return;
            case SyncchartsPackage.TRANSITION__SOURCE_STATE:
                setSourceState((State)newValue);
                return;
            case SyncchartsPackage.TRANSITION__IS_HISTORY:
                setIsHistory((Boolean)newValue);
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
            case SyncchartsPackage.TRANSITION__PRIORITY:
                setPriority(PRIORITY_EDEFAULT);
                return;
            case SyncchartsPackage.TRANSITION__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case SyncchartsPackage.TRANSITION__TARGET_STATE:
                setTargetState((State)null);
                return;
            case SyncchartsPackage.TRANSITION__SOURCE_STATE:
                setSourceState((State)null);
                return;
            case SyncchartsPackage.TRANSITION__IS_HISTORY:
                setIsHistory(IS_HISTORY_EDEFAULT);
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
            case SyncchartsPackage.TRANSITION__PRIORITY:
                return priority != PRIORITY_EDEFAULT;
            case SyncchartsPackage.TRANSITION__TYPE:
                return type != TYPE_EDEFAULT;
            case SyncchartsPackage.TRANSITION__TARGET_STATE:
                return targetState != null;
            case SyncchartsPackage.TRANSITION__SOURCE_STATE:
                return getSourceState() != null;
            case SyncchartsPackage.TRANSITION__IS_HISTORY:
                return isHistory != IS_HISTORY_EDEFAULT;
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
        result.append(" (priority: ");
        result.append(priority);
        result.append(", type: ");
        result.append(type);
        result.append(", isHistory: ");
        result.append(isHistory);
        result.append(')');
        return result.toString();
    }

} //TransitionImpl
