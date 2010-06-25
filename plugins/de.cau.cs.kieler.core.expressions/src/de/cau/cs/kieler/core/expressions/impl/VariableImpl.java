/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.expressions.impl;

import de.cau.cs.kieler.core.expressions.ExpressionsPackage;
import de.cau.cs.kieler.core.expressions.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.expressions.impl.VariableImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.expressions.impl.VariableImpl#isConst <em>Const</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends ValuedObjectImpl implements Variable {
    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected EObject value;

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
        return ExpressionsPackage.Literals.VARIABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetValue(EObject newValue, NotificationChain msgs) {
        EObject oldValue = value;
        value = newValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.VARIABLE__VALUE, oldValue, newValue);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(EObject newValue) {
        if (newValue != value) {
            NotificationChain msgs = null;
            if (value != null)
                msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.VARIABLE__VALUE, null, msgs);
            if (newValue != null)
                msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.VARIABLE__VALUE, null, msgs);
            msgs = basicSetValue(newValue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.VARIABLE__VALUE, newValue, newValue));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.VARIABLE__CONST, oldConst, const_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ExpressionsPackage.VARIABLE__VALUE:
                return basicSetValue(null, msgs);
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
            case ExpressionsPackage.VARIABLE__VALUE:
                return getValue();
            case ExpressionsPackage.VARIABLE__CONST:
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
            case ExpressionsPackage.VARIABLE__VALUE:
                setValue((EObject)newValue);
                return;
            case ExpressionsPackage.VARIABLE__CONST:
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
            case ExpressionsPackage.VARIABLE__VALUE:
                setValue((EObject)null);
                return;
            case ExpressionsPackage.VARIABLE__CONST:
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
            case ExpressionsPackage.VARIABLE__VALUE:
                return value != null;
            case ExpressionsPackage.VARIABLE__CONST:
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
