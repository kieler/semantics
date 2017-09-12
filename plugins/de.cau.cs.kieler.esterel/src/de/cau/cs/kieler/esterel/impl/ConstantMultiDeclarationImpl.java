/**
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.annotations.impl.AnnotatableImpl;

import de.cau.cs.kieler.esterel.ConstantDeclaration;
import de.cau.cs.kieler.esterel.ConstantMultiDeclaration;
import de.cau.cs.kieler.esterel.EsterelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant Multi Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.ConstantMultiDeclarationImpl#getConstantDecalrations <em>Constant Decalrations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstantMultiDeclarationImpl extends AnnotatableImpl implements ConstantMultiDeclaration {
    /**
     * The cached value of the '{@link #getConstantDecalrations() <em>Constant Decalrations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConstantDecalrations()
     * @generated
     * @ordered
     */
    protected EList<ConstantDeclaration> constantDecalrations;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConstantMultiDeclarationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EsterelPackage.Literals.CONSTANT_MULTI_DECLARATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ConstantDeclaration> getConstantDecalrations() {
        if (constantDecalrations == null) {
            constantDecalrations = new EObjectContainmentEList<ConstantDeclaration>(ConstantDeclaration.class, this, EsterelPackage.CONSTANT_MULTI_DECLARATION__CONSTANT_DECALRATIONS);
        }
        return constantDecalrations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EsterelPackage.CONSTANT_MULTI_DECLARATION__CONSTANT_DECALRATIONS:
                return ((InternalEList<?>)getConstantDecalrations()).basicRemove(otherEnd, msgs);
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
            case EsterelPackage.CONSTANT_MULTI_DECLARATION__CONSTANT_DECALRATIONS:
                return getConstantDecalrations();
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
            case EsterelPackage.CONSTANT_MULTI_DECLARATION__CONSTANT_DECALRATIONS:
                getConstantDecalrations().clear();
                getConstantDecalrations().addAll((Collection<? extends ConstantDeclaration>)newValue);
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
            case EsterelPackage.CONSTANT_MULTI_DECLARATION__CONSTANT_DECALRATIONS:
                getConstantDecalrations().clear();
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
            case EsterelPackage.CONSTANT_MULTI_DECLARATION__CONSTANT_DECALRATIONS:
                return constantDecalrations != null && !constantDecalrations.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ConstantMultiDeclarationImpl
