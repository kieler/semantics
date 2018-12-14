/**
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.TypeDefinition;
import de.cau.cs.kieler.esterel.TypeRenaming;

import de.cau.cs.kieler.kexpressions.ValueType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Renaming</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.TypeRenamingImpl#getNewName <em>New Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.TypeRenamingImpl#getNewType <em>New Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.TypeRenamingImpl#getOldName <em>Old Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeRenamingImpl extends MinimalEObjectImpl.Container implements TypeRenaming {
    /**
     * The cached value of the '{@link #getNewName() <em>New Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNewName()
     * @generated
     * @ordered
     */
    protected TypeDefinition newName;

    /**
     * The default value of the '{@link #getNewType() <em>New Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNewType()
     * @generated
     * @ordered
     */
    protected static final ValueType NEW_TYPE_EDEFAULT = ValueType.PURE;

    /**
     * The cached value of the '{@link #getNewType() <em>New Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNewType()
     * @generated
     * @ordered
     */
    protected ValueType newType = NEW_TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getOldName() <em>Old Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOldName()
     * @generated
     * @ordered
     */
    protected TypeDefinition oldName;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TypeRenamingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EsterelPackage.Literals.TYPE_RENAMING;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeDefinition getNewName() {
        if (newName != null && newName.eIsProxy()) {
            InternalEObject oldNewName = (InternalEObject)newName;
            newName = (TypeDefinition)eResolveProxy(oldNewName);
            if (newName != oldNewName) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.TYPE_RENAMING__NEW_NAME, oldNewName, newName));
            }
        }
        return newName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeDefinition basicGetNewName() {
        return newName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNewName(TypeDefinition newNewName) {
        TypeDefinition oldNewName = newName;
        newName = newNewName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.TYPE_RENAMING__NEW_NAME, oldNewName, newName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValueType getNewType() {
        return newType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNewType(ValueType newNewType) {
        ValueType oldNewType = newType;
        newType = newNewType == null ? NEW_TYPE_EDEFAULT : newNewType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.TYPE_RENAMING__NEW_TYPE, oldNewType, newType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeDefinition getOldName() {
        if (oldName != null && oldName.eIsProxy()) {
            InternalEObject oldOldName = (InternalEObject)oldName;
            oldName = (TypeDefinition)eResolveProxy(oldOldName);
            if (oldName != oldOldName) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.TYPE_RENAMING__OLD_NAME, oldOldName, oldName));
            }
        }
        return oldName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeDefinition basicGetOldName() {
        return oldName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOldName(TypeDefinition newOldName) {
        TypeDefinition oldOldName = oldName;
        oldName = newOldName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.TYPE_RENAMING__OLD_NAME, oldOldName, oldName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EsterelPackage.TYPE_RENAMING__NEW_NAME:
                if (resolve) return getNewName();
                return basicGetNewName();
            case EsterelPackage.TYPE_RENAMING__NEW_TYPE:
                return getNewType();
            case EsterelPackage.TYPE_RENAMING__OLD_NAME:
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
            case EsterelPackage.TYPE_RENAMING__NEW_NAME:
                setNewName((TypeDefinition)newValue);
                return;
            case EsterelPackage.TYPE_RENAMING__NEW_TYPE:
                setNewType((ValueType)newValue);
                return;
            case EsterelPackage.TYPE_RENAMING__OLD_NAME:
                setOldName((TypeDefinition)newValue);
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
            case EsterelPackage.TYPE_RENAMING__NEW_NAME:
                setNewName((TypeDefinition)null);
                return;
            case EsterelPackage.TYPE_RENAMING__NEW_TYPE:
                setNewType(NEW_TYPE_EDEFAULT);
                return;
            case EsterelPackage.TYPE_RENAMING__OLD_NAME:
                setOldName((TypeDefinition)null);
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
            case EsterelPackage.TYPE_RENAMING__NEW_NAME:
                return newName != null;
            case EsterelPackage.TYPE_RENAMING__NEW_TYPE:
                return newType != NEW_TYPE_EDEFAULT;
            case EsterelPackage.TYPE_RENAMING__OLD_NAME:
                return oldName != null;
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

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (newType: ");
        result.append(newType);
        result.append(')');
        return result.toString();
    }

} //TypeRenamingImpl
