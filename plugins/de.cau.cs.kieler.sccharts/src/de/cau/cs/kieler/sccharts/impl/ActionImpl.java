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

import de.cau.cs.kieler.annotations.impl.AnnotatableImpl;
import de.cau.cs.kieler.kexpressions.Expression;
import de.cau.cs.kieler.kexpressions.keffects.Effect;
import de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage;
import de.cau.cs.kieler.kexpressions.keffects.Link;
import de.cau.cs.kieler.kexpressions.keffects.Linkable;
import de.cau.cs.kieler.sccharts.Action;
import de.cau.cs.kieler.sccharts.DelayType;
import de.cau.cs.kieler.sccharts.SCChartsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ActionImpl#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ActionImpl#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ActionImpl#getEffects <em>Effects</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ActionImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ActionImpl#getTriggerDelay <em>Trigger Delay</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ActionImpl#getTriggerProbability <em>Trigger Probability</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ActionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ActionImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ActionImpl#isNondeterministic <em>Nondeterministic</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActionImpl extends AnnotatableImpl implements Action {
    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\r\n\r\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\r\n\r\nCopyright 2013 by\r\n+ Kiel University\r\n  + Department of Computer Science\r\n    + Real-Time and Embedded Systems Group\r\n\r\nThis code is provided under the terms of the Eclipse Public License (EPL).\r\nSee the file epl-v10.html for the license text.";

				/**
     * The cached value of the '{@link #getOutgoingLinks() <em>Outgoing Links</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutgoingLinks()
     * @generated
     * @ordered
     */
    protected EList<Link> outgoingLinks;

    /**
     * The cached value of the '{@link #getIncomingLinks() <em>Incoming Links</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIncomingLinks()
     * @generated
     * @ordered
     */
    protected EList<Link> incomingLinks;

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
     * The default value of the '{@link #getTriggerDelay() <em>Trigger Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTriggerDelay()
     * @generated
     * @ordered
     */
    protected static final int TRIGGER_DELAY_EDEFAULT = 1;

    /**
     * The cached value of the '{@link #getTriggerDelay() <em>Trigger Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTriggerDelay()
     * @generated
     * @ordered
     */
    protected int triggerDelay = TRIGGER_DELAY_EDEFAULT;

    /**
     * The default value of the '{@link #getTriggerProbability() <em>Trigger Probability</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTriggerProbability()
     * @generated
     * @ordered
     */
    protected static final double TRIGGER_PROBABILITY_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getTriggerProbability() <em>Trigger Probability</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTriggerProbability()
     * @generated
     * @ordered
     */
    protected double triggerProbability = TRIGGER_PROBABILITY_EDEFAULT;

    /**
     * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected static final String LABEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected String label = LABEL_EDEFAULT;

    /**
     * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelay()
     * @generated
     * @ordered
     */
    protected static final DelayType DELAY_EDEFAULT = DelayType.UNDEFINED;

    /**
     * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelay()
     * @generated
     * @ordered
     */
    protected DelayType delay = DELAY_EDEFAULT;

    /**
     * The default value of the '{@link #isNondeterministic() <em>Nondeterministic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isNondeterministic()
     * @generated
     * @ordered
     */
    protected static final boolean NONDETERMINISTIC_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isNondeterministic() <em>Nondeterministic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isNondeterministic()
     * @generated
     * @ordered
     */
    protected boolean nondeterministic = NONDETERMINISTIC_EDEFAULT;

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
        return SCChartsPackage.Literals.ACTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Link> getOutgoingLinks() {
        if (outgoingLinks == null) {
            outgoingLinks = new EObjectContainmentEList<Link>(Link.class, this, SCChartsPackage.ACTION__OUTGOING_LINKS);
        }
        return outgoingLinks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Link> getIncomingLinks() {
        if (incomingLinks == null) {
            incomingLinks = new EObjectWithInverseResolvingEList<Link>(Link.class, this, SCChartsPackage.ACTION__INCOMING_LINKS, KEffectsPackage.LINK__TARGET);
        }
        return incomingLinks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Effect> getEffects() {
        if (effects == null) {
            effects = new EObjectContainmentEList<Effect>(Effect.class, this, SCChartsPackage.ACTION__EFFECTS);
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCChartsPackage.ACTION__TRIGGER, oldTrigger, newTrigger);
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
                msgs = ((InternalEObject)trigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SCChartsPackage.ACTION__TRIGGER, null, msgs);
            if (newTrigger != null)
                msgs = ((InternalEObject)newTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SCChartsPackage.ACTION__TRIGGER, null, msgs);
            msgs = basicSetTrigger(newTrigger, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.ACTION__TRIGGER, newTrigger, newTrigger));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getTriggerDelay() {
        return triggerDelay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTriggerDelay(int newTriggerDelay) {
        int oldTriggerDelay = triggerDelay;
        triggerDelay = newTriggerDelay;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.ACTION__TRIGGER_DELAY, oldTriggerDelay, triggerDelay));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public double getTriggerProbability() {
        return triggerProbability;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTriggerProbability(double newTriggerProbability) {
        double oldTriggerProbability = triggerProbability;
        triggerProbability = newTriggerProbability;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.ACTION__TRIGGER_PROBABILITY, oldTriggerProbability, triggerProbability));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DelayType getDelay() {
        return delay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDelay(DelayType newDelay) {
        DelayType oldDelay = delay;
        delay = newDelay == null ? DELAY_EDEFAULT : newDelay;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.ACTION__DELAY, oldDelay, delay));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isNondeterministic() {
        return nondeterministic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNondeterministic(boolean newNondeterministic) {
        boolean oldNondeterministic = nondeterministic;
        nondeterministic = newNondeterministic;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.ACTION__NONDETERMINISTIC, oldNondeterministic, nondeterministic));
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
            case SCChartsPackage.ACTION__INCOMING_LINKS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingLinks()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLabel() {
        return label;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLabel(String newLabel) {
        String oldLabel = label;
        label = newLabel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.ACTION__LABEL, oldLabel, label));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SCChartsPackage.ACTION__OUTGOING_LINKS:
                return ((InternalEList<?>)getOutgoingLinks()).basicRemove(otherEnd, msgs);
            case SCChartsPackage.ACTION__INCOMING_LINKS:
                return ((InternalEList<?>)getIncomingLinks()).basicRemove(otherEnd, msgs);
            case SCChartsPackage.ACTION__EFFECTS:
                return ((InternalEList<?>)getEffects()).basicRemove(otherEnd, msgs);
            case SCChartsPackage.ACTION__TRIGGER:
                return basicSetTrigger(null, msgs);
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
            case SCChartsPackage.ACTION__OUTGOING_LINKS:
                return getOutgoingLinks();
            case SCChartsPackage.ACTION__INCOMING_LINKS:
                return getIncomingLinks();
            case SCChartsPackage.ACTION__EFFECTS:
                return getEffects();
            case SCChartsPackage.ACTION__TRIGGER:
                return getTrigger();
            case SCChartsPackage.ACTION__TRIGGER_DELAY:
                return getTriggerDelay();
            case SCChartsPackage.ACTION__TRIGGER_PROBABILITY:
                return getTriggerProbability();
            case SCChartsPackage.ACTION__LABEL:
                return getLabel();
            case SCChartsPackage.ACTION__DELAY:
                return getDelay();
            case SCChartsPackage.ACTION__NONDETERMINISTIC:
                return isNondeterministic();
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
            case SCChartsPackage.ACTION__OUTGOING_LINKS:
                getOutgoingLinks().clear();
                getOutgoingLinks().addAll((Collection<? extends Link>)newValue);
                return;
            case SCChartsPackage.ACTION__INCOMING_LINKS:
                getIncomingLinks().clear();
                getIncomingLinks().addAll((Collection<? extends Link>)newValue);
                return;
            case SCChartsPackage.ACTION__EFFECTS:
                getEffects().clear();
                getEffects().addAll((Collection<? extends Effect>)newValue);
                return;
            case SCChartsPackage.ACTION__TRIGGER:
                setTrigger((Expression)newValue);
                return;
            case SCChartsPackage.ACTION__TRIGGER_DELAY:
                setTriggerDelay((Integer)newValue);
                return;
            case SCChartsPackage.ACTION__TRIGGER_PROBABILITY:
                setTriggerProbability((Double)newValue);
                return;
            case SCChartsPackage.ACTION__LABEL:
                setLabel((String)newValue);
                return;
            case SCChartsPackage.ACTION__DELAY:
                setDelay((DelayType)newValue);
                return;
            case SCChartsPackage.ACTION__NONDETERMINISTIC:
                setNondeterministic((Boolean)newValue);
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
            case SCChartsPackage.ACTION__OUTGOING_LINKS:
                getOutgoingLinks().clear();
                return;
            case SCChartsPackage.ACTION__INCOMING_LINKS:
                getIncomingLinks().clear();
                return;
            case SCChartsPackage.ACTION__EFFECTS:
                getEffects().clear();
                return;
            case SCChartsPackage.ACTION__TRIGGER:
                setTrigger((Expression)null);
                return;
            case SCChartsPackage.ACTION__TRIGGER_DELAY:
                setTriggerDelay(TRIGGER_DELAY_EDEFAULT);
                return;
            case SCChartsPackage.ACTION__TRIGGER_PROBABILITY:
                setTriggerProbability(TRIGGER_PROBABILITY_EDEFAULT);
                return;
            case SCChartsPackage.ACTION__LABEL:
                setLabel(LABEL_EDEFAULT);
                return;
            case SCChartsPackage.ACTION__DELAY:
                setDelay(DELAY_EDEFAULT);
                return;
            case SCChartsPackage.ACTION__NONDETERMINISTIC:
                setNondeterministic(NONDETERMINISTIC_EDEFAULT);
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
            case SCChartsPackage.ACTION__OUTGOING_LINKS:
                return outgoingLinks != null && !outgoingLinks.isEmpty();
            case SCChartsPackage.ACTION__INCOMING_LINKS:
                return incomingLinks != null && !incomingLinks.isEmpty();
            case SCChartsPackage.ACTION__EFFECTS:
                return effects != null && !effects.isEmpty();
            case SCChartsPackage.ACTION__TRIGGER:
                return trigger != null;
            case SCChartsPackage.ACTION__TRIGGER_DELAY:
                return triggerDelay != TRIGGER_DELAY_EDEFAULT;
            case SCChartsPackage.ACTION__TRIGGER_PROBABILITY:
                return triggerProbability != TRIGGER_PROBABILITY_EDEFAULT;
            case SCChartsPackage.ACTION__LABEL:
                return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
            case SCChartsPackage.ACTION__DELAY:
                return delay != DELAY_EDEFAULT;
            case SCChartsPackage.ACTION__NONDETERMINISTIC:
                return nondeterministic != NONDETERMINISTIC_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == Linkable.class) {
            switch (derivedFeatureID) {
                case SCChartsPackage.ACTION__OUTGOING_LINKS: return KEffectsPackage.LINKABLE__OUTGOING_LINKS;
                case SCChartsPackage.ACTION__INCOMING_LINKS: return KEffectsPackage.LINKABLE__INCOMING_LINKS;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == Linkable.class) {
            switch (baseFeatureID) {
                case KEffectsPackage.LINKABLE__OUTGOING_LINKS: return SCChartsPackage.ACTION__OUTGOING_LINKS;
                case KEffectsPackage.LINKABLE__INCOMING_LINKS: return SCChartsPackage.ACTION__INCOMING_LINKS;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
        result.append(" (triggerDelay: ");
        result.append(triggerDelay);
        result.append(", triggerProbability: ");
        result.append(triggerProbability);
        result.append(", label: ");
        result.append(label);
        result.append(", delay: ");
        result.append(delay);
        result.append(", nondeterministic: ");
        result.append(nondeterministic);
        result.append(')');
        return result.toString();
    }

} //ActionImpl
