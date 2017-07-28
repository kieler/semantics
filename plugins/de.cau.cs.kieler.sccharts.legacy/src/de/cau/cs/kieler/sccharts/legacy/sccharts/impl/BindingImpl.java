/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.legacy.sccharts.impl;

import de.cau.cs.kieler.sccharts.legacy.annotations.impl.AnnotatableImpl;

import de.cau.cs.kieler.sccharts.legacy.kexpressions.Expression;
import de.cau.cs.kieler.sccharts.legacy.kexpressions.Value;
import de.cau.cs.kieler.sccharts.legacy.kexpressions.ValuedObject;

import de.cau.cs.kieler.sccharts.legacy.sccharts.Binding;
import de.cau.cs.kieler.sccharts.legacy.sccharts.SCChartsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.legacy.sccharts.impl.BindingImpl#getFormal <em>Formal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.legacy.sccharts.impl.BindingImpl#getActual <em>Actual</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.legacy.sccharts.impl.BindingImpl#getIndices <em>Indices</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.legacy.sccharts.impl.BindingImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingImpl extends AnnotatableImpl implements Binding {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Kiel University\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
     * The cached value of the '{@link #getFormal() <em>Formal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFormal()
     * @generated
     * @ordered
     */
    protected ValuedObject formal;

    /**
     * The cached value of the '{@link #getActual() <em>Actual</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActual()
     * @generated
     * @ordered
     */
    protected ValuedObject actual;

    /**
     * The cached value of the '{@link #getIndices() <em>Indices</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIndices()
     * @generated
     * @ordered
     */
    protected EList<Expression> indices;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected Value value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BindingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SCChartsPackage.Literals.BINDING;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValuedObject getFormal() {
        if (formal != null && formal.eIsProxy()) {
            InternalEObject oldFormal = (InternalEObject)formal;
            formal = (ValuedObject)eResolveProxy(oldFormal);
            if (formal != oldFormal) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SCChartsPackage.BINDING__FORMAL, oldFormal, formal));
            }
        }
        return formal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValuedObject basicGetFormal() {
        return formal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFormal(ValuedObject newFormal) {
        ValuedObject oldFormal = formal;
        formal = newFormal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.BINDING__FORMAL, oldFormal, formal));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValuedObject getActual() {
        if (actual != null && actual.eIsProxy()) {
            InternalEObject oldActual = (InternalEObject)actual;
            actual = (ValuedObject)eResolveProxy(oldActual);
            if (actual != oldActual) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SCChartsPackage.BINDING__ACTUAL, oldActual, actual));
            }
        }
        return actual;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValuedObject basicGetActual() {
        return actual;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setActual(ValuedObject newActual) {
        ValuedObject oldActual = actual;
        actual = newActual;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.BINDING__ACTUAL, oldActual, actual));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Expression> getIndices() {
        if (indices == null) {
            indices = new EObjectContainmentEList<Expression>(Expression.class, this, SCChartsPackage.BINDING__INDICES);
        }
        return indices;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Value getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetValue(Value newValue, NotificationChain msgs) {
        Value oldValue = value;
        value = newValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCChartsPackage.BINDING__VALUE, oldValue, newValue);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(Value newValue) {
        if (newValue != value) {
            NotificationChain msgs = null;
            if (value != null)
                msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SCChartsPackage.BINDING__VALUE, null, msgs);
            if (newValue != null)
                msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SCChartsPackage.BINDING__VALUE, null, msgs);
            msgs = basicSetValue(newValue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.BINDING__VALUE, newValue, newValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SCChartsPackage.BINDING__INDICES:
                return ((InternalEList<?>)getIndices()).basicRemove(otherEnd, msgs);
            case SCChartsPackage.BINDING__VALUE:
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
            case SCChartsPackage.BINDING__FORMAL:
                if (resolve) return getFormal();
                return basicGetFormal();
            case SCChartsPackage.BINDING__ACTUAL:
                if (resolve) return getActual();
                return basicGetActual();
            case SCChartsPackage.BINDING__INDICES:
                return getIndices();
            case SCChartsPackage.BINDING__VALUE:
                return getValue();
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
            case SCChartsPackage.BINDING__FORMAL:
                setFormal((ValuedObject)newValue);
                return;
            case SCChartsPackage.BINDING__ACTUAL:
                setActual((ValuedObject)newValue);
                return;
            case SCChartsPackage.BINDING__INDICES:
                getIndices().clear();
                getIndices().addAll((Collection<? extends Expression>)newValue);
                return;
            case SCChartsPackage.BINDING__VALUE:
                setValue((Value)newValue);
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
            case SCChartsPackage.BINDING__FORMAL:
                setFormal((ValuedObject)null);
                return;
            case SCChartsPackage.BINDING__ACTUAL:
                setActual((ValuedObject)null);
                return;
            case SCChartsPackage.BINDING__INDICES:
                getIndices().clear();
                return;
            case SCChartsPackage.BINDING__VALUE:
                setValue((Value)null);
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
            case SCChartsPackage.BINDING__FORMAL:
                return formal != null;
            case SCChartsPackage.BINDING__ACTUAL:
                return actual != null;
            case SCChartsPackage.BINDING__INDICES:
                return indices != null && !indices.isEmpty();
            case SCChartsPackage.BINDING__VALUE:
                return value != null;
        }
        return super.eIsSet(featureID);
    }

} //BindingImpl
