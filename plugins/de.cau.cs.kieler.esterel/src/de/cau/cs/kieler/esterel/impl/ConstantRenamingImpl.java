/**
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.Constant;
import de.cau.cs.kieler.esterel.ConstantRenaming;
import de.cau.cs.kieler.esterel.EsterelPackage;

import de.cau.cs.kieler.kexpressions.Expression;
import de.cau.cs.kieler.kexpressions.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant Renaming</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.ConstantRenamingImpl#getNewName <em>New Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.ConstantRenamingImpl#getNewValue <em>New Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.ConstantRenamingImpl#getOldName <em>Old Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstantRenamingImpl extends MinimalEObjectImpl.Container implements ConstantRenaming {
    /**
     * The cached value of the '{@link #getNewName() <em>New Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNewName()
     * @generated
     * @ordered
     */
    protected Constant newName;

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
     * The cached value of the '{@link #getOldName() <em>Old Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOldName()
     * @generated
     * @ordered
     */
    protected Constant oldName;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConstantRenamingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EsterelPackage.Literals.CONSTANT_RENAMING;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Constant getNewName() {
        if (newName != null && newName.eIsProxy()) {
            InternalEObject oldNewName = (InternalEObject)newName;
            newName = (Constant)eResolveProxy(oldNewName);
            if (newName != oldNewName) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.CONSTANT_RENAMING__NEW_NAME, oldNewName, newName));
            }
        }
        return newName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Constant basicGetNewName() {
        return newName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNewName(Constant newNewName) {
        Constant oldNewName = newName;
        newName = newNewName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.CONSTANT_RENAMING__NEW_NAME, oldNewName, newName));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.CONSTANT_RENAMING__NEW_VALUE, oldNewValue, newNewValue);
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
                msgs = ((InternalEObject)newValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.CONSTANT_RENAMING__NEW_VALUE, null, msgs);
            if (newNewValue != null)
                msgs = ((InternalEObject)newNewValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.CONSTANT_RENAMING__NEW_VALUE, null, msgs);
            msgs = basicSetNewValue(newNewValue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.CONSTANT_RENAMING__NEW_VALUE, newNewValue, newNewValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Constant getOldName() {
        if (oldName != null && oldName.eIsProxy()) {
            InternalEObject oldOldName = (InternalEObject)oldName;
            oldName = (Constant)eResolveProxy(oldOldName);
            if (oldName != oldOldName) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.CONSTANT_RENAMING__OLD_NAME, oldOldName, oldName));
            }
        }
        return oldName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Constant basicGetOldName() {
        return oldName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOldName(Constant newOldName) {
        Constant oldOldName = oldName;
        oldName = newOldName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.CONSTANT_RENAMING__OLD_NAME, oldOldName, oldName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EsterelPackage.CONSTANT_RENAMING__NEW_VALUE:
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
            case EsterelPackage.CONSTANT_RENAMING__NEW_NAME:
                if (resolve) return getNewName();
                return basicGetNewName();
            case EsterelPackage.CONSTANT_RENAMING__NEW_VALUE:
                return getNewValue();
            case EsterelPackage.CONSTANT_RENAMING__OLD_NAME:
                if (resolve) return getOldName();
                return basicGetOldName();
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
            case EsterelPackage.CONSTANT_RENAMING__NEW_NAME:
                setNewName((Constant)newValue);
                return;
            case EsterelPackage.CONSTANT_RENAMING__NEW_VALUE:
                setNewValue((Expression)newValue);
                return;
            case EsterelPackage.CONSTANT_RENAMING__OLD_NAME:
                setOldName((Constant)newValue);
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
            case EsterelPackage.CONSTANT_RENAMING__NEW_NAME:
                setNewName((Constant)null);
                return;
            case EsterelPackage.CONSTANT_RENAMING__NEW_VALUE:
                setNewValue((Expression)null);
                return;
            case EsterelPackage.CONSTANT_RENAMING__OLD_NAME:
                setOldName((Constant)null);
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
            case EsterelPackage.CONSTANT_RENAMING__NEW_NAME:
                return newName != null;
            case EsterelPackage.CONSTANT_RENAMING__NEW_VALUE:
                return newValue != null;
            case EsterelPackage.CONSTANT_RENAMING__OLD_NAME:
                return oldName != null;
        }
        return super.eIsSet(featureID);
    }

} //ConstantRenamingImpl
