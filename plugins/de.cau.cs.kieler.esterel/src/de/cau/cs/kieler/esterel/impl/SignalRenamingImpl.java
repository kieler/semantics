/**
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.Signal;
import de.cau.cs.kieler.esterel.SignalRenaming;

import de.cau.cs.kieler.kexpressions.ValuedObjectReference;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Renaming</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.SignalRenamingImpl#getNewName <em>New Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.SignalRenamingImpl#getOldName <em>Old Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignalRenamingImpl extends MinimalEObjectImpl.Container implements SignalRenaming {
    /**
     * The cached value of the '{@link #getNewName() <em>New Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNewName()
     * @generated
     * @ordered
     */
    protected ValuedObjectReference newName;

    /**
     * The cached value of the '{@link #getOldName() <em>Old Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOldName()
     * @generated
     * @ordered
     */
    protected ValuedObjectReference oldName;

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
        return EsterelPackage.Literals.SIGNAL_RENAMING;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValuedObjectReference getNewName() {
        return newName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNewName(ValuedObjectReference newNewName, NotificationChain msgs) {
        ValuedObjectReference oldNewName = newName;
        newName = newNewName;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.SIGNAL_RENAMING__NEW_NAME, oldNewName, newNewName);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNewName(ValuedObjectReference newNewName) {
        if (newNewName != newName) {
            NotificationChain msgs = null;
            if (newName != null)
                msgs = ((InternalEObject)newName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.SIGNAL_RENAMING__NEW_NAME, null, msgs);
            if (newNewName != null)
                msgs = ((InternalEObject)newNewName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.SIGNAL_RENAMING__NEW_NAME, null, msgs);
            msgs = basicSetNewName(newNewName, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.SIGNAL_RENAMING__NEW_NAME, newNewName, newNewName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValuedObjectReference getOldName() {
        return oldName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOldName(ValuedObjectReference newOldName, NotificationChain msgs) {
        ValuedObjectReference oldOldName = oldName;
        oldName = newOldName;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.SIGNAL_RENAMING__OLD_NAME, oldOldName, newOldName);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOldName(ValuedObjectReference newOldName) {
        if (newOldName != oldName) {
            NotificationChain msgs = null;
            if (oldName != null)
                msgs = ((InternalEObject)oldName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.SIGNAL_RENAMING__OLD_NAME, null, msgs);
            if (newOldName != null)
                msgs = ((InternalEObject)newOldName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.SIGNAL_RENAMING__OLD_NAME, null, msgs);
            msgs = basicSetOldName(newOldName, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.SIGNAL_RENAMING__OLD_NAME, newOldName, newOldName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EsterelPackage.SIGNAL_RENAMING__NEW_NAME:
                return basicSetNewName(null, msgs);
            case EsterelPackage.SIGNAL_RENAMING__OLD_NAME:
                return basicSetOldName(null, msgs);
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
            case EsterelPackage.SIGNAL_RENAMING__NEW_NAME:
                return getNewName();
            case EsterelPackage.SIGNAL_RENAMING__OLD_NAME:
                return getOldName();
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
            case EsterelPackage.SIGNAL_RENAMING__NEW_NAME:
                setNewName((ValuedObjectReference)newValue);
                return;
            case EsterelPackage.SIGNAL_RENAMING__OLD_NAME:
                setOldName((ValuedObjectReference)newValue);
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
            case EsterelPackage.SIGNAL_RENAMING__NEW_NAME:
                setNewName((ValuedObjectReference)null);
                return;
            case EsterelPackage.SIGNAL_RENAMING__OLD_NAME:
                setOldName((ValuedObjectReference)null);
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
            case EsterelPackage.SIGNAL_RENAMING__NEW_NAME:
                return newName != null;
            case EsterelPackage.SIGNAL_RENAMING__OLD_NAME:
                return oldName != null;
        }
        return super.eIsSet(featureID);
    }

} //SignalRenamingImpl
