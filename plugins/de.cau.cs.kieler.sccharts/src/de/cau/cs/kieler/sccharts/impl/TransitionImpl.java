/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.cau.cs.kieler.kexpressions.Expression;
import de.cau.cs.kieler.kexpressions.keffects.Effect;
import de.cau.cs.kieler.sccharts.DeferredType;
import de.cau.cs.kieler.sccharts.HistoryType;
import de.cau.cs.kieler.sccharts.PreemptionType;
import de.cau.cs.kieler.sccharts.SCChartsPackage;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.Transition;
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.TransitionImpl#getPreemption <em>Preemption</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.TransitionImpl#getHistory <em>History</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.TransitionImpl#getDeferred <em>Deferred</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.TransitionImpl#getTargetState <em>Target State</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.TransitionImpl#getSourceState <em>Source State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends ActionImpl implements Transition {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\r\n\r\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\r\n\r\nCopyright 2013 by\r\n+ Kiel University\r\n  + Department of Computer Science\r\n    + Real-Time and Embedded Systems Group\r\n\r\nThis code is provided under the terms of the Eclipse Public License (EPL).\r\nSee the file epl-v10.html for the license text.";

    /**
     * The default value of the '{@link #getPreemption() <em>Preemption</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreemption()
     * @generated
     * @ordered
     */
    protected static final PreemptionType PREEMPTION_EDEFAULT = PreemptionType.WEAK;

    /**
     * The cached value of the '{@link #getPreemption() <em>Preemption</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreemption()
     * @generated
     * @ordered
     */
    protected PreemptionType preemption = PREEMPTION_EDEFAULT;

    /**
     * The default value of the '{@link #getHistory() <em>History</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHistory()
     * @generated
     * @ordered
     */
    protected static final HistoryType HISTORY_EDEFAULT = HistoryType.RESET;

    /**
     * The cached value of the '{@link #getHistory() <em>History</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHistory()
     * @generated
     * @ordered
     */
    protected HistoryType history = HISTORY_EDEFAULT;

    /**
     * The default value of the '{@link #getDeferred() <em>Deferred</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeferred()
     * @generated
     * @ordered
     */
    protected static final DeferredType DEFERRED_EDEFAULT = DeferredType.NONE;

    /**
     * The cached value of the '{@link #getDeferred() <em>Deferred</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeferred()
     * @generated
     * @ordered
     */
    protected DeferredType deferred = DEFERRED_EDEFAULT;

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
        return SCChartsPackage.Literals.TRANSITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PreemptionType getPreemption() {
        return preemption;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPreemption(PreemptionType newPreemption) {
        PreemptionType oldPreemption = preemption;
        preemption = newPreemption == null ? PREEMPTION_EDEFAULT : newPreemption;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.TRANSITION__PREEMPTION, oldPreemption, preemption));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HistoryType getHistory() {
        return history;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHistory(HistoryType newHistory) {
        HistoryType oldHistory = history;
        history = newHistory == null ? HISTORY_EDEFAULT : newHistory;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.TRANSITION__HISTORY, oldHistory, history));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DeferredType getDeferred() {
        return deferred;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDeferred(DeferredType newDeferred) {
        DeferredType oldDeferred = deferred;
        deferred = newDeferred == null ? DEFERRED_EDEFAULT : newDeferred;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.TRANSITION__DEFERRED, oldDeferred, deferred));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public State getTargetState() {
        if (targetState != null && targetState.eIsProxy()) {
            InternalEObject oldTargetState = (InternalEObject)targetState;
            targetState = (State)eResolveProxy(oldTargetState);
            if (targetState != oldTargetState) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SCChartsPackage.TRANSITION__TARGET_STATE, oldTargetState, targetState));
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
    public NotificationChain basicSetTargetState(State newTargetState, NotificationChain msgs) {
        State oldTargetState = targetState;
        targetState = newTargetState;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCChartsPackage.TRANSITION__TARGET_STATE, oldTargetState, newTargetState);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTargetState(State newTargetState) {
        if (newTargetState != targetState) {
            NotificationChain msgs = null;
            if (targetState != null)
                msgs = ((InternalEObject)targetState).eInverseRemove(this, SCChartsPackage.STATE__INCOMING_TRANSITIONS, State.class, msgs);
            if (newTargetState != null)
                msgs = ((InternalEObject)newTargetState).eInverseAdd(this, SCChartsPackage.STATE__INCOMING_TRANSITIONS, State.class, msgs);
            msgs = basicSetTargetState(newTargetState, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.TRANSITION__TARGET_STATE, newTargetState, newTargetState));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public State getSourceState() {
        if (eContainerFeatureID() != SCChartsPackage.TRANSITION__SOURCE_STATE) return null;
        return (State)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSourceState(State newSourceState, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newSourceState, SCChartsPackage.TRANSITION__SOURCE_STATE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSourceState(State newSourceState) {
        if (newSourceState != eInternalContainer() || (eContainerFeatureID() != SCChartsPackage.TRANSITION__SOURCE_STATE && newSourceState != null)) {
            if (EcoreUtil.isAncestor(this, newSourceState))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newSourceState != null)
                msgs = ((InternalEObject)newSourceState).eInverseAdd(this, SCChartsPackage.STATE__OUTGOING_TRANSITIONS, State.class, msgs);
            msgs = basicSetSourceState(newSourceState, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.TRANSITION__SOURCE_STATE, newSourceState, newSourceState));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SCChartsPackage.TRANSITION__TARGET_STATE:
                if (targetState != null)
                    msgs = ((InternalEObject)targetState).eInverseRemove(this, SCChartsPackage.STATE__INCOMING_TRANSITIONS, State.class, msgs);
                return basicSetTargetState((State)otherEnd, msgs);
            case SCChartsPackage.TRANSITION__SOURCE_STATE:
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
            case SCChartsPackage.TRANSITION__TARGET_STATE:
                return basicSetTargetState(null, msgs);
            case SCChartsPackage.TRANSITION__SOURCE_STATE:
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
            case SCChartsPackage.TRANSITION__SOURCE_STATE:
                return eInternalContainer().eInverseRemove(this, SCChartsPackage.STATE__OUTGOING_TRANSITIONS, State.class, msgs);
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
            case SCChartsPackage.TRANSITION__PREEMPTION:
                return getPreemption();
            case SCChartsPackage.TRANSITION__HISTORY:
                return getHistory();
            case SCChartsPackage.TRANSITION__DEFERRED:
                return getDeferred();
            case SCChartsPackage.TRANSITION__TARGET_STATE:
                if (resolve) return getTargetState();
                return basicGetTargetState();
            case SCChartsPackage.TRANSITION__SOURCE_STATE:
                return getSourceState();
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
            case SCChartsPackage.TRANSITION__PREEMPTION:
                setPreemption((PreemptionType)newValue);
                return;
            case SCChartsPackage.TRANSITION__HISTORY:
                setHistory((HistoryType)newValue);
                return;
            case SCChartsPackage.TRANSITION__DEFERRED:
                setDeferred((DeferredType)newValue);
                return;
            case SCChartsPackage.TRANSITION__TARGET_STATE:
                setTargetState((State)newValue);
                return;
            case SCChartsPackage.TRANSITION__SOURCE_STATE:
                setSourceState((State)newValue);
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
            case SCChartsPackage.TRANSITION__PREEMPTION:
                setPreemption(PREEMPTION_EDEFAULT);
                return;
            case SCChartsPackage.TRANSITION__HISTORY:
                setHistory(HISTORY_EDEFAULT);
                return;
            case SCChartsPackage.TRANSITION__DEFERRED:
                setDeferred(DEFERRED_EDEFAULT);
                return;
            case SCChartsPackage.TRANSITION__TARGET_STATE:
                setTargetState((State)null);
                return;
            case SCChartsPackage.TRANSITION__SOURCE_STATE:
                setSourceState((State)null);
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
            case SCChartsPackage.TRANSITION__PREEMPTION:
                return preemption != PREEMPTION_EDEFAULT;
            case SCChartsPackage.TRANSITION__HISTORY:
                return history != HISTORY_EDEFAULT;
            case SCChartsPackage.TRANSITION__DEFERRED:
                return deferred != DEFERRED_EDEFAULT;
            case SCChartsPackage.TRANSITION__TARGET_STATE:
                return targetState != null;
            case SCChartsPackage.TRANSITION__SOURCE_STATE:
                return getSourceState() != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * User-defined toString method to ease debugging.
     * <!-- end-user-doc -->
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuilder result = new StringBuilder("TransitionImpl");
        result.append('@');
        result.append(Integer.toHexString(hashCode()));
        
        State sourceState = getSourceState();
        State targetState = getTargetState();
        Expression trigger = getTrigger();
        List<Effect> effects = getEffects();
        
        result.append(" ");
        if (sourceState != null) {
            result.append(sourceState.getName());
        } else {
            result.append("<null>");
        }
        
        result.append(" -> ");
        if (targetState != null) {
            result.append(targetState.getName());
        } else {
            result.append("<null>");
        }
        
        if (trigger != null) {
            result.append(" Trigger: ");
            result.append(serializer.serialize(trigger).toString());
        }
        
        if (effects != null && !effects.isEmpty()) {
            result.append(" Effects: ");
            for (Effect effect : effects) {
                result.append(serializer.serialize(effect).toString());
                result.append(" ");
            }
        }
        
        return result.toString();
    }

    private static SCChartsSerializeHRExtensions serializer = new SCChartsSerializeHRExtensions();

} //TransitionImpl
