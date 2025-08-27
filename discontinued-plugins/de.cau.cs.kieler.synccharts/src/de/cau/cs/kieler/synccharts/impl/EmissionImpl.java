/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.impl;

import de.cau.cs.kieler.esterel.kexpressions.Expression;
import de.cau.cs.kieler.esterel.kexpressions.Signal;

import de.cau.cs.kieler.synccharts.Emission;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.EmissionImpl#getSignal <em>Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.EmissionImpl#getNewValue <em>New Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmissionImpl extends EffectImpl implements Emission {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2009 by\n+ Kiel University\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
     * The cached value of the '{@link #getSignal() <em>Signal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSignal()
     * @generated
     * @ordered
     */
    protected Signal signal;

    /**
     * The cached value of the '{@link #getNewValue() <em>New Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNewValue()
     * @generated
     * @ordered
     */
    protected Expression newValue;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EmissionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SyncchartsPackage.Literals.EMISSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Signal getSignal() {
        if (signal != null && signal.eIsProxy()) {
            InternalEObject oldSignal = (InternalEObject)signal;
            signal = (Signal)eResolveProxy(oldSignal);
            if (signal != oldSignal) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SyncchartsPackage.EMISSION__SIGNAL, oldSignal, signal));
            }
        }
        return signal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Signal basicGetSignal() {
        return signal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSignal(Signal newSignal) {
        Signal oldSignal = signal;
        signal = newSignal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.EMISSION__SIGNAL, oldSignal, signal));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression getNewValue() {
        return newValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNewValue(Expression newNewValue, NotificationChain msgs) {
        Expression oldNewValue = newValue;
        newValue = newNewValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SyncchartsPackage.EMISSION__NEW_VALUE, oldNewValue, newNewValue);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNewValue(Expression newNewValue) {
        if (newNewValue != newValue) {
            NotificationChain msgs = null;
            if (newValue != null)
                msgs = ((InternalEObject)newValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SyncchartsPackage.EMISSION__NEW_VALUE, null, msgs);
            if (newNewValue != null)
                msgs = ((InternalEObject)newNewValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SyncchartsPackage.EMISSION__NEW_VALUE, null, msgs);
            msgs = basicSetNewValue(newNewValue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.EMISSION__NEW_VALUE, newNewValue, newNewValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SyncchartsPackage.EMISSION__NEW_VALUE:
                return basicSetNewValue(null, msgs);
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
            case SyncchartsPackage.EMISSION__SIGNAL:
                if (resolve) return getSignal();
                return basicGetSignal();
            case SyncchartsPackage.EMISSION__NEW_VALUE:
                return getNewValue();
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
            case SyncchartsPackage.EMISSION__SIGNAL:
                setSignal((Signal)newValue);
                return;
            case SyncchartsPackage.EMISSION__NEW_VALUE:
                setNewValue((Expression)newValue);
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
            case SyncchartsPackage.EMISSION__SIGNAL:
                setSignal((Signal)null);
                return;
            case SyncchartsPackage.EMISSION__NEW_VALUE:
                setNewValue((Expression)null);
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
            case SyncchartsPackage.EMISSION__SIGNAL:
                return signal != null;
            case SyncchartsPackage.EMISSION__NEW_VALUE:
                return newValue != null;
        }
        return super.eIsSet(featureID);
    }

} //EmissionImpl
