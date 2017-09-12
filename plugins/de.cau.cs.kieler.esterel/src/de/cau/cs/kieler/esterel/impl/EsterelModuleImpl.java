/**
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.EsterelDeclaration;
import de.cau.cs.kieler.esterel.EsterelModule;
import de.cau.cs.kieler.esterel.EsterelPackage;

import de.cau.cs.kieler.scl.impl.ModuleImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.EsterelModuleImpl#getEsterelDeclarations <em>Esterel Declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EsterelModuleImpl extends ModuleImpl implements EsterelModule {
    /**
     * The cached value of the '{@link #getEsterelDeclarations() <em>Esterel Declarations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEsterelDeclarations()
     * @generated
     * @ordered
     */
    protected EList<EsterelDeclaration> esterelDeclarations;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EsterelModuleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EsterelPackage.Literals.ESTEREL_MODULE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EsterelDeclaration> getEsterelDeclarations() {
        if (esterelDeclarations == null) {
            esterelDeclarations = new EObjectContainmentEList<EsterelDeclaration>(EsterelDeclaration.class, this, EsterelPackage.ESTEREL_MODULE__ESTEREL_DECLARATIONS);
        }
        return esterelDeclarations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EsterelPackage.ESTEREL_MODULE__ESTEREL_DECLARATIONS:
                return ((InternalEList<?>)getEsterelDeclarations()).basicRemove(otherEnd, msgs);
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
            case EsterelPackage.ESTEREL_MODULE__ESTEREL_DECLARATIONS:
                return getEsterelDeclarations();
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
            case EsterelPackage.ESTEREL_MODULE__ESTEREL_DECLARATIONS:
                getEsterelDeclarations().clear();
                getEsterelDeclarations().addAll((Collection<? extends EsterelDeclaration>)newValue);
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
            case EsterelPackage.ESTEREL_MODULE__ESTEREL_DECLARATIONS:
                getEsterelDeclarations().clear();
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
            case EsterelPackage.ESTEREL_MODULE__ESTEREL_DECLARATIONS:
                return esterelDeclarations != null && !esterelDeclarations.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //EsterelModuleImpl
