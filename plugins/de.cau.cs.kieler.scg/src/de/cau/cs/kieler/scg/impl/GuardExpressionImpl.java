/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.impl;

import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;

import de.cau.cs.kieler.scg.GuardExpression;
import de.cau.cs.kieler.scg.ScgPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guard Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.impl.GuardExpressionImpl#getValuedObject <em>Valued Object</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.GuardExpressionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuardExpressionImpl extends MinimalEObjectImpl.Container implements GuardExpression {
    /**
     * The cached value of the '{@link #getValuedObject() <em>Valued Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValuedObject()
     * @generated
     * @ordered
     */
    protected ValuedObject valuedObject;

    /**
     * The cached value of the '{@link #getExpression() <em>Expression</em>}' reference.
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
    protected GuardExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScgPackage.Literals.GUARD_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValuedObject getValuedObject() {
        if (valuedObject != null && valuedObject.eIsProxy()) {
            InternalEObject oldValuedObject = (InternalEObject)valuedObject;
            valuedObject = (ValuedObject)eResolveProxy(oldValuedObject);
            if (valuedObject != oldValuedObject) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgPackage.GUARD_EXPRESSION__VALUED_OBJECT, oldValuedObject, valuedObject));
            }
        }
        return valuedObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValuedObject basicGetValuedObject() {
        return valuedObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValuedObject(ValuedObject newValuedObject) {
        ValuedObject oldValuedObject = valuedObject;
        valuedObject = newValuedObject;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.GUARD_EXPRESSION__VALUED_OBJECT, oldValuedObject, valuedObject));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression getExpression() {
        if (expression != null && expression.eIsProxy()) {
            InternalEObject oldExpression = (InternalEObject)expression;
            expression = (Expression)eResolveProxy(oldExpression);
            if (expression != oldExpression) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgPackage.GUARD_EXPRESSION__EXPRESSION, oldExpression, expression));
            }
        }
        return expression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression basicGetExpression() {
        return expression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExpression(Expression newExpression) {
        Expression oldExpression = expression;
        expression = newExpression;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.GUARD_EXPRESSION__EXPRESSION, oldExpression, expression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ScgPackage.GUARD_EXPRESSION__VALUED_OBJECT:
                if (resolve) return getValuedObject();
                return basicGetValuedObject();
            case ScgPackage.GUARD_EXPRESSION__EXPRESSION:
                if (resolve) return getExpression();
                return basicGetExpression();
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
            case ScgPackage.GUARD_EXPRESSION__VALUED_OBJECT:
                setValuedObject((ValuedObject)newValue);
                return;
            case ScgPackage.GUARD_EXPRESSION__EXPRESSION:
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
            case ScgPackage.GUARD_EXPRESSION__VALUED_OBJECT:
                setValuedObject((ValuedObject)null);
                return;
            case ScgPackage.GUARD_EXPRESSION__EXPRESSION:
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
            case ScgPackage.GUARD_EXPRESSION__VALUED_OBJECT:
                return valuedObject != null;
            case ScgPackage.GUARD_EXPRESSION__EXPRESSION:
                return expression != null;
        }
        return super.eIsSet(featureID);
    }

} //GuardExpressionImpl
