/**
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.ModuleRenaming;

import de.cau.cs.kieler.scl.Module;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Renaming</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.ModuleRenamingImpl#getModule <em>Module</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.ModuleRenamingImpl#getNewName <em>New Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleRenamingImpl extends MinimalEObjectImpl.Container implements ModuleRenaming {
    /**
     * The cached value of the '{@link #getModule() <em>Module</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModule()
     * @generated
     * @ordered
     */
    protected de.cau.cs.kieler.scl.Module module;

    /**
     * The default value of the '{@link #getNewName() <em>New Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNewName()
     * @generated
     * @ordered
     */
    protected static final String NEW_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNewName() <em>New Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNewName()
     * @generated
     * @ordered
     */
    protected String newName = NEW_NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModuleRenamingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EsterelPackage.Literals.MODULE_RENAMING;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public de.cau.cs.kieler.scl.Module getModule() {
        if (module != null && module.eIsProxy()) {
            InternalEObject oldModule = (InternalEObject)module;
            module = (de.cau.cs.kieler.scl.Module)eResolveProxy(oldModule);
            if (module != oldModule) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.MODULE_RENAMING__MODULE, oldModule, module));
            }
        }
        return module;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public de.cau.cs.kieler.scl.Module basicGetModule() {
        return module;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModule(de.cau.cs.kieler.scl.Module newModule) {
        de.cau.cs.kieler.scl.Module oldModule = module;
        module = newModule;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.MODULE_RENAMING__MODULE, oldModule, module));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNewName() {
        return newName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNewName(String newNewName) {
        String oldNewName = newName;
        newName = newNewName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.MODULE_RENAMING__NEW_NAME, oldNewName, newName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EsterelPackage.MODULE_RENAMING__MODULE:
                if (resolve) return getModule();
                return basicGetModule();
            case EsterelPackage.MODULE_RENAMING__NEW_NAME:
                return getNewName();
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
            case EsterelPackage.MODULE_RENAMING__MODULE:
                setModule((de.cau.cs.kieler.scl.Module)newValue);
                return;
            case EsterelPackage.MODULE_RENAMING__NEW_NAME:
                setNewName((String)newValue);
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
            case EsterelPackage.MODULE_RENAMING__MODULE:
                setModule((de.cau.cs.kieler.scl.Module)null);
                return;
            case EsterelPackage.MODULE_RENAMING__NEW_NAME:
                setNewName(NEW_NAME_EDEFAULT);
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
            case EsterelPackage.MODULE_RENAMING__MODULE:
                return module != null;
            case EsterelPackage.MODULE_RENAMING__NEW_NAME:
                return NEW_NAME_EDEFAULT == null ? newName != null : !NEW_NAME_EDEFAULT.equals(newName);
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
        result.append(" (newName: ");
        result.append(newName);
        result.append(')');
        return result.toString();
    }

} //ModuleRenamingImpl
