/**
 */
package de.cau.cs.kieler.kexpressions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import de.cau.cs.kieler.kexpressions.Expression;
import de.cau.cs.kieler.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.kexpressions.Parameter;
import de.cau.cs.kieler.kexpressions.ValuedObject;
import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.ParameterImpl#isCallByReference <em>Call By Reference</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.ParameterImpl#isPureOutput <em>Pure Output</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.ParameterImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.ParameterImpl#getExplicitBinding <em>Explicit Binding</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.ParameterImpl#getExplicitBindingIndices <em>Explicit Binding Indices</em>}</li>
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
     * The cached value of the '{@link #getExplicitBinding() <em>Explicit Binding</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExplicitBinding()
     * @generated
     * @ordered
     */
    protected ValuedObject explicitBinding;

    /**
     * The cached value of the '{@link #getExplicitBindingIndices() <em>Explicit Binding Indices</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExplicitBindingIndices()
     * @generated
     * @ordered
     */
    protected EList<Expression> explicitBindingIndices;

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
    public ValuedObject getExplicitBinding() {
        if (explicitBinding != null && explicitBinding.eIsProxy()) {
            InternalEObject oldExplicitBinding = (InternalEObject)explicitBinding;
            explicitBinding = (ValuedObject)eResolveProxy(oldExplicitBinding);
            if (explicitBinding != oldExplicitBinding) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, KExpressionsPackage.PARAMETER__EXPLICIT_BINDING, oldExplicitBinding, explicitBinding));
            }
        }
        return explicitBinding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValuedObject basicGetExplicitBinding() {
        return explicitBinding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExplicitBinding(ValuedObject newExplicitBinding) {
        ValuedObject oldExplicitBinding = explicitBinding;
        explicitBinding = newExplicitBinding;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.PARAMETER__EXPLICIT_BINDING, oldExplicitBinding, explicitBinding));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Expression> getExplicitBindingIndices() {
        if (explicitBindingIndices == null) {
            explicitBindingIndices = new EObjectContainmentEList<Expression>(Expression.class, this, KExpressionsPackage.PARAMETER__EXPLICIT_BINDING_INDICES);
        }
        return explicitBindingIndices;
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
            case KExpressionsPackage.PARAMETER__EXPLICIT_BINDING_INDICES:
                return ((InternalEList<?>)getExplicitBindingIndices()).basicRemove(otherEnd, msgs);
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
            case KExpressionsPackage.PARAMETER__EXPLICIT_BINDING:
                if (resolve) return getExplicitBinding();
                return basicGetExplicitBinding();
            case KExpressionsPackage.PARAMETER__EXPLICIT_BINDING_INDICES:
                return getExplicitBindingIndices();
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
            case KExpressionsPackage.PARAMETER__CALL_BY_REFERENCE:
                setCallByReference((Boolean)newValue);
                return;
            case KExpressionsPackage.PARAMETER__PURE_OUTPUT:
                setPureOutput((Boolean)newValue);
                return;
            case KExpressionsPackage.PARAMETER__EXPRESSION:
                setExpression((Expression)newValue);
                return;
            case KExpressionsPackage.PARAMETER__EXPLICIT_BINDING:
                setExplicitBinding((ValuedObject)newValue);
                return;
            case KExpressionsPackage.PARAMETER__EXPLICIT_BINDING_INDICES:
                getExplicitBindingIndices().clear();
                getExplicitBindingIndices().addAll((Collection<? extends Expression>)newValue);
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
            case KExpressionsPackage.PARAMETER__EXPLICIT_BINDING:
                setExplicitBinding((ValuedObject)null);
                return;
            case KExpressionsPackage.PARAMETER__EXPLICIT_BINDING_INDICES:
                getExplicitBindingIndices().clear();
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
            case KExpressionsPackage.PARAMETER__EXPLICIT_BINDING:
                return explicitBinding != null;
            case KExpressionsPackage.PARAMETER__EXPLICIT_BINDING_INDICES:
                return explicitBindingIndices != null && !explicitBindingIndices.isEmpty();
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
