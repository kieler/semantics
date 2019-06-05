/**
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.Procedure;
import de.cau.cs.kieler.esterel.TypeIdentifier;

import de.cau.cs.kieler.kexpressions.impl.ValuedObjectImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.ProcedureImpl#getReferenceArguments <em>Reference Arguments</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.ProcedureImpl#getValueArguments <em>Value Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcedureImpl extends ValuedObjectImpl implements Procedure {
    /**
     * The cached value of the '{@link #getReferenceArguments() <em>Reference Arguments</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferenceArguments()
     * @generated
     * @ordered
     */
    protected EList<TypeIdentifier> referenceArguments;

    /**
     * The cached value of the '{@link #getValueArguments() <em>Value Arguments</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValueArguments()
     * @generated
     * @ordered
     */
    protected EList<TypeIdentifier> valueArguments;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProcedureImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EsterelPackage.Literals.PROCEDURE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<TypeIdentifier> getReferenceArguments() {
        if (referenceArguments == null) {
            referenceArguments = new EObjectContainmentEList<TypeIdentifier>(TypeIdentifier.class, this, EsterelPackage.PROCEDURE__REFERENCE_ARGUMENTS);
        }
        return referenceArguments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<TypeIdentifier> getValueArguments() {
        if (valueArguments == null) {
            valueArguments = new EObjectContainmentEList<TypeIdentifier>(TypeIdentifier.class, this, EsterelPackage.PROCEDURE__VALUE_ARGUMENTS);
        }
        return valueArguments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EsterelPackage.PROCEDURE__REFERENCE_ARGUMENTS:
                return ((InternalEList<?>)getReferenceArguments()).basicRemove(otherEnd, msgs);
            case EsterelPackage.PROCEDURE__VALUE_ARGUMENTS:
                return ((InternalEList<?>)getValueArguments()).basicRemove(otherEnd, msgs);
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
            case EsterelPackage.PROCEDURE__REFERENCE_ARGUMENTS:
                return getReferenceArguments();
            case EsterelPackage.PROCEDURE__VALUE_ARGUMENTS:
                return getValueArguments();
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
            case EsterelPackage.PROCEDURE__REFERENCE_ARGUMENTS:
                getReferenceArguments().clear();
                getReferenceArguments().addAll((Collection<? extends TypeIdentifier>)newValue);
                return;
            case EsterelPackage.PROCEDURE__VALUE_ARGUMENTS:
                getValueArguments().clear();
                getValueArguments().addAll((Collection<? extends TypeIdentifier>)newValue);
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
            case EsterelPackage.PROCEDURE__REFERENCE_ARGUMENTS:
                getReferenceArguments().clear();
                return;
            case EsterelPackage.PROCEDURE__VALUE_ARGUMENTS:
                getValueArguments().clear();
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
            case EsterelPackage.PROCEDURE__REFERENCE_ARGUMENTS:
                return referenceArguments != null && !referenceArguments.isEmpty();
            case EsterelPackage.PROCEDURE__VALUE_ARGUMENTS:
                return valueArguments != null && !valueArguments.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ProcedureImpl
