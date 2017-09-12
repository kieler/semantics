/**
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.DelayExpr;
import de.cau.cs.kieler.esterel.EsterelPackage;

import de.cau.cs.kieler.kexpressions.Expression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delay Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.DelayExprImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.DelayExprImpl#isImmediate <em>Immediate</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.DelayExprImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DelayExprImpl extends MinimalEObjectImpl.Container implements DelayExpr {
    /**
     * The cached value of the '{@link #getDelay() <em>Delay</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelay()
     * @generated
     * @ordered
     */
    protected Expression delay;

    /**
     * The default value of the '{@link #isImmediate() <em>Immediate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isImmediate()
     * @generated
     * @ordered
     */
    protected static final boolean IMMEDIATE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isImmediate() <em>Immediate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isImmediate()
     * @generated
     * @ordered
     */
    protected boolean immediate = IMMEDIATE_EDEFAULT;

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
    protected DelayExprImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EsterelPackage.Literals.DELAY_EXPR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression getDelay() {
        return delay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDelay(Expression newDelay, NotificationChain msgs) {
        Expression oldDelay = delay;
        delay = newDelay;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.DELAY_EXPR__DELAY, oldDelay, newDelay);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDelay(Expression newDelay) {
        if (newDelay != delay) {
            NotificationChain msgs = null;
            if (delay != null)
                msgs = ((InternalEObject)delay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.DELAY_EXPR__DELAY, null, msgs);
            if (newDelay != null)
                msgs = ((InternalEObject)newDelay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.DELAY_EXPR__DELAY, null, msgs);
            msgs = basicSetDelay(newDelay, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.DELAY_EXPR__DELAY, newDelay, newDelay));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isImmediate() {
        return immediate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setImmediate(boolean newImmediate) {
        boolean oldImmediate = immediate;
        immediate = newImmediate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.DELAY_EXPR__IMMEDIATE, oldImmediate, immediate));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.DELAY_EXPR__EXPRESSION, oldExpression, newExpression);
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
                msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.DELAY_EXPR__EXPRESSION, null, msgs);
            if (newExpression != null)
                msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.DELAY_EXPR__EXPRESSION, null, msgs);
            msgs = basicSetExpression(newExpression, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.DELAY_EXPR__EXPRESSION, newExpression, newExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EsterelPackage.DELAY_EXPR__DELAY:
                return basicSetDelay(null, msgs);
            case EsterelPackage.DELAY_EXPR__EXPRESSION:
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
            case EsterelPackage.DELAY_EXPR__DELAY:
                return getDelay();
            case EsterelPackage.DELAY_EXPR__IMMEDIATE:
                return isImmediate();
            case EsterelPackage.DELAY_EXPR__EXPRESSION:
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
            case EsterelPackage.DELAY_EXPR__DELAY:
                setDelay((Expression)newValue);
                return;
            case EsterelPackage.DELAY_EXPR__IMMEDIATE:
                setImmediate((Boolean)newValue);
                return;
            case EsterelPackage.DELAY_EXPR__EXPRESSION:
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
            case EsterelPackage.DELAY_EXPR__DELAY:
                setDelay((Expression)null);
                return;
            case EsterelPackage.DELAY_EXPR__IMMEDIATE:
                setImmediate(IMMEDIATE_EDEFAULT);
                return;
            case EsterelPackage.DELAY_EXPR__EXPRESSION:
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
            case EsterelPackage.DELAY_EXPR__DELAY:
                return delay != null;
            case EsterelPackage.DELAY_EXPR__IMMEDIATE:
                return immediate != IMMEDIATE_EDEFAULT;
            case EsterelPackage.DELAY_EXPR__EXPRESSION:
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
        result.append(" (immediate: ");
        result.append(immediate);
        result.append(')');
        return result.toString();
    }

} //DelayExprImpl
