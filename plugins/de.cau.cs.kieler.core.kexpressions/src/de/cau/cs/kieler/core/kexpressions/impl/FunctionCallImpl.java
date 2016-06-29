/**
 */
package de.cau.cs.kieler.core.kexpressions.impl;

import de.cau.cs.kieler.core.kexpressions.FunctionCall;
import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.impl.FunctionCallImpl#getFunctionName <em>Function Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionCallImpl extends CallImpl implements FunctionCall {
    /**
     * The default value of the '{@link #getFunctionName() <em>Function Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunctionName()
     * @generated
     * @ordered
     */
    protected static final String FUNCTION_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFunctionName() <em>Function Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunctionName()
     * @generated
     * @ordered
     */
    protected String functionName = FUNCTION_NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FunctionCallImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KExpressionsPackage.Literals.FUNCTION_CALL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFunctionName() {
        return functionName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFunctionName(String newFunctionName) {
        String oldFunctionName = functionName;
        functionName = newFunctionName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.FUNCTION_CALL__FUNCTION_NAME, oldFunctionName, functionName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case KExpressionsPackage.FUNCTION_CALL__FUNCTION_NAME:
                return getFunctionName();
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
            case KExpressionsPackage.FUNCTION_CALL__FUNCTION_NAME:
                setFunctionName((String)newValue);
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
            case KExpressionsPackage.FUNCTION_CALL__FUNCTION_NAME:
                setFunctionName(FUNCTION_NAME_EDEFAULT);
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
            case KExpressionsPackage.FUNCTION_CALL__FUNCTION_NAME:
                return FUNCTION_NAME_EDEFAULT == null ? functionName != null : !FUNCTION_NAME_EDEFAULT.equals(functionName);
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
        result.append(" (functionName: ");
        result.append(functionName);
        result.append(')');
        return result.toString();
    }

} //FunctionCallImpl
