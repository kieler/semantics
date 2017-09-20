/**
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.Constant;
import de.cau.cs.kieler.esterel.ConstantDeclaration;
import de.cau.cs.kieler.esterel.EsterelPackage;

import de.cau.cs.kieler.kexpressions.impl.DeclarationImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.ConstantDeclarationImpl#getConstants <em>Constants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstantDeclarationImpl extends DeclarationImpl implements ConstantDeclaration {
    /**
     * The cached value of the '{@link #getConstants() <em>Constants</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConstants()
     * @generated
     * @ordered
     */
    protected EList<Constant> constants;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConstantDeclarationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EsterelPackage.Literals.CONSTANT_DECLARATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Constant> getConstants() {
        if (constants == null) {
            constants = new EObjectContainmentEList<Constant>(Constant.class, this, EsterelPackage.CONSTANT_DECLARATION__CONSTANTS);
        }
        return constants;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EsterelPackage.CONSTANT_DECLARATION__CONSTANTS:
                return ((InternalEList<?>)getConstants()).basicRemove(otherEnd, msgs);
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
            case EsterelPackage.CONSTANT_DECLARATION__CONSTANTS:
                return getConstants();
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
            case EsterelPackage.CONSTANT_DECLARATION__CONSTANTS:
                getConstants().clear();
                getConstants().addAll((Collection<? extends Constant>)newValue);
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
            case EsterelPackage.CONSTANT_DECLARATION__CONSTANTS:
                getConstants().clear();
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
            case EsterelPackage.CONSTANT_DECLARATION__CONSTANTS:
                return constants != null && !constants.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ConstantDeclarationImpl
