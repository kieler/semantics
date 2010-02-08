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

import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.Effect;
import de.cau.cs.kieler.synccharts.Expression;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ActionImpl#getEffects <em>Effects</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ActionImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ActionImpl#getTriggersAndEffects <em>Triggers And Effects</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ActionImpl#getParentStateEntryAction <em>Parent State Entry Action</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ActionImpl#getParentStateInnerAction <em>Parent State Inner Action</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ActionImpl#getParentStateExitAction <em>Parent State Exit Action</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ActionImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ActionImpl#isIsImmediate <em>Is Immediate</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ActionImpl#getParentStateSuspension <em>Parent State Suspension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends EObjectImpl implements Action {
	/**
     * The cached value of the '{@link #getEffects() <em>Effects</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEffects()
     * @generated
     * @ordered
     */
	protected EList<Effect> effects;

	/**
     * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTrigger()
     * @generated
     * @ordered
     */
	protected Expression trigger;

	/**
     * The default value of the '{@link #getTriggersAndEffects() <em>Triggers And Effects</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTriggersAndEffects()
     * @generated
     * @ordered
     */
	protected static final String TRIGGERS_AND_EFFECTS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getTriggersAndEffects() <em>Triggers And Effects</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTriggersAndEffects()
     * @generated
     * @ordered
     */
	protected String triggersAndEffects = TRIGGERS_AND_EFFECTS_EDEFAULT;

	/**
     * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDelay()
     * @generated
     * @ordered
     */
	protected static final int DELAY_EDEFAULT = 1;

	/**
     * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDelay()
     * @generated
     * @ordered
     */
	protected int delay = DELAY_EDEFAULT;

	/**
     * The default value of the '{@link #isIsImmediate() <em>Is Immediate</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isIsImmediate()
     * @generated
     * @ordered
     */
	protected static final boolean IS_IMMEDIATE_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isIsImmediate() <em>Is Immediate</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isIsImmediate()
     * @generated
     * @ordered
     */
	protected boolean isImmediate = IS_IMMEDIATE_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ActionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SyncchartsPackage.Literals.ACTION;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Effect> getEffects() {
        if (effects == null) {
            effects = new EObjectContainmentWithInverseEList<Effect>(Effect.class, this, SyncchartsPackage.ACTION__EFFECTS, SyncchartsPackage.EFFECT__PARENT_EACTION);
        }
        return effects;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Expression getTrigger() {
        return trigger;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetTrigger(Expression newTrigger, NotificationChain msgs) {
        Expression oldTrigger = trigger;
        trigger = newTrigger;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SyncchartsPackage.ACTION__TRIGGER, oldTrigger, newTrigger);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTrigger(Expression newTrigger) {
        if (newTrigger != trigger) {
            NotificationChain msgs = null;
            if (trigger != null)
                msgs = ((InternalEObject)trigger).eInverseRemove(this, SyncchartsPackage.EXPRESSION__PARENT_ACTION, Expression.class, msgs);
            if (newTrigger != null)
                msgs = ((InternalEObject)newTrigger).eInverseAdd(this, SyncchartsPackage.EXPRESSION__PARENT_ACTION, Expression.class, msgs);
            msgs = basicSetTrigger(newTrigger, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.ACTION__TRIGGER, newTrigger, newTrigger));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getTriggersAndEffects() {
        return triggersAndEffects;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTriggersAndEffects(String newTriggersAndEffects) {
        String oldTriggersAndEffects = triggersAndEffects;
        triggersAndEffects = newTriggersAndEffects;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.ACTION__TRIGGERS_AND_EFFECTS, oldTriggersAndEffects, triggersAndEffects));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public State getParentStateEntryAction() {
        if (eContainerFeatureID() != SyncchartsPackage.ACTION__PARENT_STATE_ENTRY_ACTION) return null;
        return (State)eContainer();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetParentStateEntryAction(State newParentStateEntryAction, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentStateEntryAction, SyncchartsPackage.ACTION__PARENT_STATE_ENTRY_ACTION, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setParentStateEntryAction(State newParentStateEntryAction) {
        if (newParentStateEntryAction != eInternalContainer() || (eContainerFeatureID() != SyncchartsPackage.ACTION__PARENT_STATE_ENTRY_ACTION && newParentStateEntryAction != null)) {
            if (EcoreUtil.isAncestor(this, newParentStateEntryAction))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentStateEntryAction != null)
                msgs = ((InternalEObject)newParentStateEntryAction).eInverseAdd(this, SyncchartsPackage.STATE__ENTRY_ACTIONS, State.class, msgs);
            msgs = basicSetParentStateEntryAction(newParentStateEntryAction, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.ACTION__PARENT_STATE_ENTRY_ACTION, newParentStateEntryAction, newParentStateEntryAction));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public State getParentStateInnerAction() {
        if (eContainerFeatureID() != SyncchartsPackage.ACTION__PARENT_STATE_INNER_ACTION) return null;
        return (State)eContainer();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetParentStateInnerAction(State newParentStateInnerAction, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentStateInnerAction, SyncchartsPackage.ACTION__PARENT_STATE_INNER_ACTION, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setParentStateInnerAction(State newParentStateInnerAction) {
        if (newParentStateInnerAction != eInternalContainer() || (eContainerFeatureID() != SyncchartsPackage.ACTION__PARENT_STATE_INNER_ACTION && newParentStateInnerAction != null)) {
            if (EcoreUtil.isAncestor(this, newParentStateInnerAction))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentStateInnerAction != null)
                msgs = ((InternalEObject)newParentStateInnerAction).eInverseAdd(this, SyncchartsPackage.STATE__INNER_ACTIONS, State.class, msgs);
            msgs = basicSetParentStateInnerAction(newParentStateInnerAction, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.ACTION__PARENT_STATE_INNER_ACTION, newParentStateInnerAction, newParentStateInnerAction));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public State getParentStateExitAction() {
        if (eContainerFeatureID() != SyncchartsPackage.ACTION__PARENT_STATE_EXIT_ACTION) return null;
        return (State)eContainer();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetParentStateExitAction(State newParentStateExitAction, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentStateExitAction, SyncchartsPackage.ACTION__PARENT_STATE_EXIT_ACTION, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setParentStateExitAction(State newParentStateExitAction) {
        if (newParentStateExitAction != eInternalContainer() || (eContainerFeatureID() != SyncchartsPackage.ACTION__PARENT_STATE_EXIT_ACTION && newParentStateExitAction != null)) {
            if (EcoreUtil.isAncestor(this, newParentStateExitAction))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentStateExitAction != null)
                msgs = ((InternalEObject)newParentStateExitAction).eInverseAdd(this, SyncchartsPackage.STATE__EXIT_ACTIONS, State.class, msgs);
            msgs = basicSetParentStateExitAction(newParentStateExitAction, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.ACTION__PARENT_STATE_EXIT_ACTION, newParentStateExitAction, newParentStateExitAction));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getDelay() {
        return delay;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDelay(int newDelay) {
        int oldDelay = delay;
        delay = newDelay;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.ACTION__DELAY, oldDelay, delay));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isIsImmediate() {
        return isImmediate;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setIsImmediate(boolean newIsImmediate) {
        boolean oldIsImmediate = isImmediate;
        isImmediate = newIsImmediate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.ACTION__IS_IMMEDIATE, oldIsImmediate, isImmediate));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public State getParentStateSuspension() {
        if (eContainerFeatureID() != SyncchartsPackage.ACTION__PARENT_STATE_SUSPENSION) return null;
        return (State)eContainer();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetParentStateSuspension(State newParentStateSuspension, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentStateSuspension, SyncchartsPackage.ACTION__PARENT_STATE_SUSPENSION, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setParentStateSuspension(State newParentStateSuspension) {
        if (newParentStateSuspension != eInternalContainer() || (eContainerFeatureID() != SyncchartsPackage.ACTION__PARENT_STATE_SUSPENSION && newParentStateSuspension != null)) {
            if (EcoreUtil.isAncestor(this, newParentStateSuspension))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentStateSuspension != null)
                msgs = ((InternalEObject)newParentStateSuspension).eInverseAdd(this, SyncchartsPackage.STATE__SUSPENSION_TRIGGER, State.class, msgs);
            msgs = basicSetParentStateSuspension(newParentStateSuspension, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.ACTION__PARENT_STATE_SUSPENSION, newParentStateSuspension, newParentStateSuspension));
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
            case SyncchartsPackage.ACTION__EFFECTS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getEffects()).basicAdd(otherEnd, msgs);
            case SyncchartsPackage.ACTION__TRIGGER:
                if (trigger != null)
                    msgs = ((InternalEObject)trigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SyncchartsPackage.ACTION__TRIGGER, null, msgs);
                return basicSetTrigger((Expression)otherEnd, msgs);
            case SyncchartsPackage.ACTION__PARENT_STATE_ENTRY_ACTION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentStateEntryAction((State)otherEnd, msgs);
            case SyncchartsPackage.ACTION__PARENT_STATE_INNER_ACTION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentStateInnerAction((State)otherEnd, msgs);
            case SyncchartsPackage.ACTION__PARENT_STATE_EXIT_ACTION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentStateExitAction((State)otherEnd, msgs);
            case SyncchartsPackage.ACTION__PARENT_STATE_SUSPENSION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentStateSuspension((State)otherEnd, msgs);
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
            case SyncchartsPackage.ACTION__EFFECTS:
                return ((InternalEList<?>)getEffects()).basicRemove(otherEnd, msgs);
            case SyncchartsPackage.ACTION__TRIGGER:
                return basicSetTrigger(null, msgs);
            case SyncchartsPackage.ACTION__PARENT_STATE_ENTRY_ACTION:
                return basicSetParentStateEntryAction(null, msgs);
            case SyncchartsPackage.ACTION__PARENT_STATE_INNER_ACTION:
                return basicSetParentStateInnerAction(null, msgs);
            case SyncchartsPackage.ACTION__PARENT_STATE_EXIT_ACTION:
                return basicSetParentStateExitAction(null, msgs);
            case SyncchartsPackage.ACTION__PARENT_STATE_SUSPENSION:
                return basicSetParentStateSuspension(null, msgs);
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
            case SyncchartsPackage.ACTION__PARENT_STATE_ENTRY_ACTION:
                return eInternalContainer().eInverseRemove(this, SyncchartsPackage.STATE__ENTRY_ACTIONS, State.class, msgs);
            case SyncchartsPackage.ACTION__PARENT_STATE_INNER_ACTION:
                return eInternalContainer().eInverseRemove(this, SyncchartsPackage.STATE__INNER_ACTIONS, State.class, msgs);
            case SyncchartsPackage.ACTION__PARENT_STATE_EXIT_ACTION:
                return eInternalContainer().eInverseRemove(this, SyncchartsPackage.STATE__EXIT_ACTIONS, State.class, msgs);
            case SyncchartsPackage.ACTION__PARENT_STATE_SUSPENSION:
                return eInternalContainer().eInverseRemove(this, SyncchartsPackage.STATE__SUSPENSION_TRIGGER, State.class, msgs);
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
            case SyncchartsPackage.ACTION__EFFECTS:
                return getEffects();
            case SyncchartsPackage.ACTION__TRIGGER:
                return getTrigger();
            case SyncchartsPackage.ACTION__TRIGGERS_AND_EFFECTS:
                return getTriggersAndEffects();
            case SyncchartsPackage.ACTION__PARENT_STATE_ENTRY_ACTION:
                return getParentStateEntryAction();
            case SyncchartsPackage.ACTION__PARENT_STATE_INNER_ACTION:
                return getParentStateInnerAction();
            case SyncchartsPackage.ACTION__PARENT_STATE_EXIT_ACTION:
                return getParentStateExitAction();
            case SyncchartsPackage.ACTION__DELAY:
                return getDelay();
            case SyncchartsPackage.ACTION__IS_IMMEDIATE:
                return isIsImmediate();
            case SyncchartsPackage.ACTION__PARENT_STATE_SUSPENSION:
                return getParentStateSuspension();
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
            case SyncchartsPackage.ACTION__EFFECTS:
                getEffects().clear();
                getEffects().addAll((Collection<? extends Effect>)newValue);
                return;
            case SyncchartsPackage.ACTION__TRIGGER:
                setTrigger((Expression)newValue);
                return;
            case SyncchartsPackage.ACTION__TRIGGERS_AND_EFFECTS:
                setTriggersAndEffects((String)newValue);
                return;
            case SyncchartsPackage.ACTION__PARENT_STATE_ENTRY_ACTION:
                setParentStateEntryAction((State)newValue);
                return;
            case SyncchartsPackage.ACTION__PARENT_STATE_INNER_ACTION:
                setParentStateInnerAction((State)newValue);
                return;
            case SyncchartsPackage.ACTION__PARENT_STATE_EXIT_ACTION:
                setParentStateExitAction((State)newValue);
                return;
            case SyncchartsPackage.ACTION__DELAY:
                setDelay((Integer)newValue);
                return;
            case SyncchartsPackage.ACTION__IS_IMMEDIATE:
                setIsImmediate((Boolean)newValue);
                return;
            case SyncchartsPackage.ACTION__PARENT_STATE_SUSPENSION:
                setParentStateSuspension((State)newValue);
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
            case SyncchartsPackage.ACTION__EFFECTS:
                getEffects().clear();
                return;
            case SyncchartsPackage.ACTION__TRIGGER:
                setTrigger((Expression)null);
                return;
            case SyncchartsPackage.ACTION__TRIGGERS_AND_EFFECTS:
                setTriggersAndEffects(TRIGGERS_AND_EFFECTS_EDEFAULT);
                return;
            case SyncchartsPackage.ACTION__PARENT_STATE_ENTRY_ACTION:
                setParentStateEntryAction((State)null);
                return;
            case SyncchartsPackage.ACTION__PARENT_STATE_INNER_ACTION:
                setParentStateInnerAction((State)null);
                return;
            case SyncchartsPackage.ACTION__PARENT_STATE_EXIT_ACTION:
                setParentStateExitAction((State)null);
                return;
            case SyncchartsPackage.ACTION__DELAY:
                setDelay(DELAY_EDEFAULT);
                return;
            case SyncchartsPackage.ACTION__IS_IMMEDIATE:
                setIsImmediate(IS_IMMEDIATE_EDEFAULT);
                return;
            case SyncchartsPackage.ACTION__PARENT_STATE_SUSPENSION:
                setParentStateSuspension((State)null);
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
            case SyncchartsPackage.ACTION__EFFECTS:
                return effects != null && !effects.isEmpty();
            case SyncchartsPackage.ACTION__TRIGGER:
                return trigger != null;
            case SyncchartsPackage.ACTION__TRIGGERS_AND_EFFECTS:
                return TRIGGERS_AND_EFFECTS_EDEFAULT == null ? triggersAndEffects != null : !TRIGGERS_AND_EFFECTS_EDEFAULT.equals(triggersAndEffects);
            case SyncchartsPackage.ACTION__PARENT_STATE_ENTRY_ACTION:
                return getParentStateEntryAction() != null;
            case SyncchartsPackage.ACTION__PARENT_STATE_INNER_ACTION:
                return getParentStateInnerAction() != null;
            case SyncchartsPackage.ACTION__PARENT_STATE_EXIT_ACTION:
                return getParentStateExitAction() != null;
            case SyncchartsPackage.ACTION__DELAY:
                return delay != DELAY_EDEFAULT;
            case SyncchartsPackage.ACTION__IS_IMMEDIATE:
                return isImmediate != IS_IMMEDIATE_EDEFAULT;
            case SyncchartsPackage.ACTION__PARENT_STATE_SUSPENSION:
                return getParentStateSuspension() != null;
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
        result.append(" (triggersAndEffects: ");
        result.append(triggersAndEffects);
        result.append(", delay: ");
        result.append(delay);
        result.append(", isImmediate: ");
        result.append(isImmediate);
        result.append(')');
        return result.toString();
    }

} //ActionImpl
