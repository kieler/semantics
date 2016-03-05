/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.esterel.kexpressions.impl;

import de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.esterel.kexpressions.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.kexpressions.impl.VariableImpl#isConst <em>Const</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends ValuedObjectImpl implements Variable {
    /**
     * The default value of the '{@link #isConst() <em>Const</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isConst()
     * @generated
     * @ordered
     */
    protected static final boolean CONST_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isConst() <em>Const</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isConst()
     * @generated
     * @ordered
     */
    protected boolean const_ = CONST_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VariableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KExpressionsPackage.Literals.VARIABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isConst() {
        return const_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConst(boolean newConst) {
        boolean oldConst = const_;
        const_ = newConst;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.VARIABLE__CONST, oldConst, const_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case KExpressionsPackage.VARIABLE__CONST:
                return isConst();
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
            case KExpressionsPackage.VARIABLE__CONST:
                setConst((Boolean)newValue);
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
            case KExpressionsPackage.VARIABLE__CONST:
                setConst(CONST_EDEFAULT);
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
            case KExpressionsPackage.VARIABLE__CONST:
                return const_ != CONST_EDEFAULT;
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

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (const: ");
        result.append(const_);
        result.append(')');
        return result.toString();
    }

} //VariableImpl
