/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.esterel.kexpressions.impl;

import de.cau.cs.kieler.esterel.kexpressions.ChannelDescription;
import de.cau.cs.kieler.esterel.kexpressions.ISignal;
import de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ISignal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.kexpressions.impl.ISignalImpl#getChannelDescr <em>Channel Descr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ISignalImpl extends SignalImpl implements ISignal {
    /**
     * The cached value of the '{@link #getChannelDescr() <em>Channel Descr</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChannelDescr()
     * @generated
     * @ordered
     */
    protected ChannelDescription channelDescr;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ISignalImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KExpressionsPackage.Literals.ISIGNAL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChannelDescription getChannelDescr() {
        return channelDescr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChannelDescr(ChannelDescription newChannelDescr, NotificationChain msgs) {
        ChannelDescription oldChannelDescr = channelDescr;
        channelDescr = newChannelDescr;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KExpressionsPackage.ISIGNAL__CHANNEL_DESCR, oldChannelDescr, newChannelDescr);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChannelDescr(ChannelDescription newChannelDescr) {
        if (newChannelDescr != channelDescr) {
            NotificationChain msgs = null;
            if (channelDescr != null)
                msgs = ((InternalEObject)channelDescr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KExpressionsPackage.ISIGNAL__CHANNEL_DESCR, null, msgs);
            if (newChannelDescr != null)
                msgs = ((InternalEObject)newChannelDescr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KExpressionsPackage.ISIGNAL__CHANNEL_DESCR, null, msgs);
            msgs = basicSetChannelDescr(newChannelDescr, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.ISIGNAL__CHANNEL_DESCR, newChannelDescr, newChannelDescr));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case KExpressionsPackage.ISIGNAL__CHANNEL_DESCR:
                return basicSetChannelDescr(null, msgs);
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
            case KExpressionsPackage.ISIGNAL__CHANNEL_DESCR:
                return getChannelDescr();
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
            case KExpressionsPackage.ISIGNAL__CHANNEL_DESCR:
                setChannelDescr((ChannelDescription)newValue);
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
            case KExpressionsPackage.ISIGNAL__CHANNEL_DESCR:
                setChannelDescr((ChannelDescription)null);
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
            case KExpressionsPackage.ISIGNAL__CHANNEL_DESCR:
                return channelDescr != null;
        }
        return super.eIsSet(featureID);
    }

} //ISignalImpl
