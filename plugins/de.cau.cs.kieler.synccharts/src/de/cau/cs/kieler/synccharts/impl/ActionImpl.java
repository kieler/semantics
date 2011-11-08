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

import de.cau.cs.kieler.core.annotations.impl.AnnotatableImpl;

import de.cau.cs.kieler.core.kexpressions.Expression;

import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.Effect;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;

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
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ActionImpl#getEffects <em>Effects</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ActionImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ActionImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ActionImpl#isIsImmediate <em>Is Immediate</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.ActionImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends AnnotatableImpl implements Action {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2009 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

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
			effects = new EObjectContainmentEList<Effect>(Effect.class, this, SyncchartsPackage.ACTION__EFFECTS);
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
				msgs = ((InternalEObject)trigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SyncchartsPackage.ACTION__TRIGGER, null, msgs);
			if (newTrigger != null)
				msgs = ((InternalEObject)newTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SyncchartsPackage.ACTION__TRIGGER, null, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.ACTION__LABEL, oldLabel, label));
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
			case SyncchartsPackage.ACTION__EFFECTS:
				return getEffects();
			case SyncchartsPackage.ACTION__TRIGGER:
				return getTrigger();
			case SyncchartsPackage.ACTION__DELAY:
				return getDelay();
			case SyncchartsPackage.ACTION__IS_IMMEDIATE:
				return isIsImmediate();
			case SyncchartsPackage.ACTION__LABEL:
				return getLabel();
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
			case SyncchartsPackage.ACTION__DELAY:
				setDelay((Integer)newValue);
				return;
			case SyncchartsPackage.ACTION__IS_IMMEDIATE:
				setIsImmediate((Boolean)newValue);
				return;
			case SyncchartsPackage.ACTION__LABEL:
				setLabel((String)newValue);
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
			case SyncchartsPackage.ACTION__DELAY:
				setDelay(DELAY_EDEFAULT);
				return;
			case SyncchartsPackage.ACTION__IS_IMMEDIATE:
				setIsImmediate(IS_IMMEDIATE_EDEFAULT);
				return;
			case SyncchartsPackage.ACTION__LABEL:
				setLabel(LABEL_EDEFAULT);
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
			case SyncchartsPackage.ACTION__DELAY:
				return delay != DELAY_EDEFAULT;
			case SyncchartsPackage.ACTION__IS_IMMEDIATE:
				return isImmediate != IS_IMMEDIATE_EDEFAULT;
			case SyncchartsPackage.ACTION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
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
		result.append(" (delay: ");
		result.append(delay);
		result.append(", isImmediate: ");
		result.append(isImmediate);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
