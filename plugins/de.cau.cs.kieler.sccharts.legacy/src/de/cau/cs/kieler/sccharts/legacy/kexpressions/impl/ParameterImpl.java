/**
 */
package de.cau.cs.kieler.sccharts.legacy.kexpressions.impl;

import de.cau.cs.kieler.sccharts.legacy.kexpressions.Expression;
import de.cau.cs.kieler.sccharts.legacy.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.sccharts.legacy.kexpressions.Parameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.legacy.kexpressions.impl.ParameterImpl#isCallByReference <em>Call By Reference</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.legacy.kexpressions.impl.ParameterImpl#isPureOutput <em>Pure Output</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.legacy.kexpressions.impl.ParameterImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends EObjectImpl implements Parameter {
    /**
     * The default value of the '{@link #isCallByReference() <em>Call By Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCallByReference()
     * @generated
     * @ordered
     */
    protected static final boolean CALL_BY_REFERENCE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isCallByReference() <em>Call By Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCallByReference()
     * @generated
     * @ordered
     */
    protected boolean callByReference = CALL_BY_REFERENCE_EDEFAULT;

    /**
     * The default value of the '{@link #isPureOutput() <em>Pure Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isPureOutput()
     * @generated
     * @ordered
     */
    protected static final boolean PURE_OUTPUT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isPureOutput() <em>Pure Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isPureOutput()
     * @generated
     * @ordered
     */
    protected boolean pureOutput = PURE_OUTPUT_EDEFAULT;

    /**
     * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpression()
     * @generated
     * @ordered
     */
    protected Expression expression;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KExpressionsPackage.Literals.PARAMETER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isCallByReference() {
        return callByReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCallByReference(boolean newCallByReference) {
        boolean oldCallByReference = callByReference;
        callByReference = newCallByReference;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.PARAMETER__CALL_BY_REFERENCE, oldCallByReference, callByReference));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isPureOutput() {
        return pureOutput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPureOutput(boolean newPureOutput) {
        boolean oldPureOutput = pureOutput;
        pureOutput = newPureOutput;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.PARAMETER__PURE_OUTPUT, oldPureOutput, pureOutput));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression getExpression() {
        return expression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
        Expression oldExpression = expression;
        expression = newExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KExpressionsPackage.PARAMETER__EXPRESSION, oldExpression, newExpression);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExpression(Expression newExpression) {
        if (newExpression != expression) {
            NotificationChain msgs = null;
            if (expression != null)
                msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KExpressionsPackage.PARAMETER__EXPRESSION, null, msgs);
            if (newExpression != null)
                msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KExpressionsPackage.PARAMETER__EXPRESSION, null, msgs);
            msgs = basicSetExpression(newExpression, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.PARAMETER__EXPRESSION, newExpression, newExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case KExpressionsPackage.PARAMETER__EXPRESSION:
                return basicSetExpression(null, msgs);
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
            case KExpressionsPackage.PARAMETER__CALL_BY_REFERENCE:
                return isCallByReference();
            case KExpressionsPackage.PARAMETER__PURE_OUTPUT:
                return isPureOutput();
            case KExpressionsPackage.PARAMETER__EXPRESSION:
                return getExpression();
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
            case KExpressionsPackage.PARAMETER__CALL_BY_REFERENCE:
                setCallByReference((Boolean)newValue);
                return;
            case KExpressionsPackage.PARAMETER__PURE_OUTPUT:
                setPureOutput((Boolean)newValue);
                return;
            case KExpressionsPackage.PARAMETER__EXPRESSION:
                setExpression((Expression)newValue);
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
            case KExpressionsPackage.PARAMETER__CALL_BY_REFERENCE:
                setCallByReference(CALL_BY_REFERENCE_EDEFAULT);
                return;
            case KExpressionsPackage.PARAMETER__PURE_OUTPUT:
                setPureOutput(PURE_OUTPUT_EDEFAULT);
                return;
            case KExpressionsPackage.PARAMETER__EXPRESSION:
                setExpression((Expression)null);
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
            case KExpressionsPackage.PARAMETER__CALL_BY_REFERENCE:
                return callByReference != CALL_BY_REFERENCE_EDEFAULT;
            case KExpressionsPackage.PARAMETER__PURE_OUTPUT:
                return pureOutput != PURE_OUTPUT_EDEFAULT;
            case KExpressionsPackage.PARAMETER__EXPRESSION:
                return expression != null;
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
        result.append(" (callByReference: ");
        result.append(callByReference);
        result.append(", pureOutput: ");
        result.append(pureOutput);
        result.append(')');
        return result.toString();
    }

} //ParameterImpl
