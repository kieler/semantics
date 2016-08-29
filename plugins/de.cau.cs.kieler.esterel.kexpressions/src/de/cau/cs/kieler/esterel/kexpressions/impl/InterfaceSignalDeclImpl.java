/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.esterel.kexpressions.impl;

import de.cau.cs.kieler.esterel.kexpressions.ISignal;
import de.cau.cs.kieler.esterel.kexpressions.InterfaceSignalDecl;
import de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Signal Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.kexpressions.impl.InterfaceSignalDeclImpl#getSignals <em>Signals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceSignalDeclImpl extends InterfaceDeclarationImpl implements InterfaceSignalDecl {
    /**
     * The cached value of the '{@link #getSignals() <em>Signals</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSignals()
     * @generated
     * @ordered
     */
    protected EList<ISignal> signals;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InterfaceSignalDeclImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KExpressionsPackage.Literals.INTERFACE_SIGNAL_DECL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ISignal> getSignals() {
        if (signals == null) {
            signals = new EObjectContainmentEList<ISignal>(ISignal.class, this, KExpressionsPackage.INTERFACE_SIGNAL_DECL__SIGNALS);
        }
        return signals;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case KExpressionsPackage.INTERFACE_SIGNAL_DECL__SIGNALS:
                return ((InternalEList<?>)getSignals()).basicRemove(otherEnd, msgs);
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
            case KExpressionsPackage.INTERFACE_SIGNAL_DECL__SIGNALS:
                return getSignals();
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
            case KExpressionsPackage.INTERFACE_SIGNAL_DECL__SIGNALS:
                getSignals().clear();
                getSignals().addAll((Collection<? extends ISignal>)newValue);
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
            case KExpressionsPackage.INTERFACE_SIGNAL_DECL__SIGNALS:
                getSignals().clear();
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
            case KExpressionsPackage.INTERFACE_SIGNAL_DECL__SIGNALS:
                return signals != null && !signals.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //InterfaceSignalDeclImpl
