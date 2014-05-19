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
package de.cau.cs.kieler.sccharts.impl;

import de.cau.cs.kieler.core.kexpressions.ValuedObject;

import de.cau.cs.kieler.sccharts.For;
import de.cau.cs.kieler.sccharts.SCChartsPackage;
import de.cau.cs.kieler.sccharts.Scope;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ForImpl#getLoopVariable <em>Loop Variable</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ForImpl#getBodyScope <em>Body Scope</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ForImpl#getParentScope <em>Parent Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForImpl extends EObjectImpl implements For {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
     * The cached value of the '{@link #getLoopVariable() <em>Loop Variable</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoopVariable()
     * @generated
     * @ordered
     */
    protected ValuedObject loopVariable;

    /**
     * The cached value of the '{@link #getBodyScope() <em>Body Scope</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBodyScope()
     * @generated
     * @ordered
     */
    protected Scope bodyScope;

    /**
     * The cached value of the '{@link #getParentScope() <em>Parent Scope</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParentScope()
     * @generated
     * @ordered
     */
    protected Scope parentScope;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ForImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SCChartsPackage.Literals.FOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValuedObject getLoopVariable() {
        if (loopVariable != null && loopVariable.eIsProxy()) {
            InternalEObject oldLoopVariable = (InternalEObject)loopVariable;
            loopVariable = (ValuedObject)eResolveProxy(oldLoopVariable);
            if (loopVariable != oldLoopVariable) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SCChartsPackage.FOR__LOOP_VARIABLE, oldLoopVariable, loopVariable));
            }
        }
        return loopVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValuedObject basicGetLoopVariable() {
        return loopVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLoopVariable(ValuedObject newLoopVariable) {
        ValuedObject oldLoopVariable = loopVariable;
        loopVariable = newLoopVariable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.FOR__LOOP_VARIABLE, oldLoopVariable, loopVariable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Scope getBodyScope() {
        if (bodyScope != null && bodyScope.eIsProxy()) {
            InternalEObject oldBodyScope = (InternalEObject)bodyScope;
            bodyScope = (Scope)eResolveProxy(oldBodyScope);
            if (bodyScope != oldBodyScope) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SCChartsPackage.FOR__BODY_SCOPE, oldBodyScope, bodyScope));
            }
        }
        return bodyScope;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Scope basicGetBodyScope() {
        return bodyScope;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBodyScope(Scope newBodyScope) {
        Scope oldBodyScope = bodyScope;
        bodyScope = newBodyScope;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.FOR__BODY_SCOPE, oldBodyScope, bodyScope));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Scope getParentScope() {
        if (parentScope != null && parentScope.eIsProxy()) {
            InternalEObject oldParentScope = (InternalEObject)parentScope;
            parentScope = (Scope)eResolveProxy(oldParentScope);
            if (parentScope != oldParentScope) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SCChartsPackage.FOR__PARENT_SCOPE, oldParentScope, parentScope));
            }
        }
        return parentScope;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Scope basicGetParentScope() {
        return parentScope;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentScope(Scope newParentScope) {
        Scope oldParentScope = parentScope;
        parentScope = newParentScope;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.FOR__PARENT_SCOPE, oldParentScope, parentScope));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SCChartsPackage.FOR__LOOP_VARIABLE:
                if (resolve) return getLoopVariable();
                return basicGetLoopVariable();
            case SCChartsPackage.FOR__BODY_SCOPE:
                if (resolve) return getBodyScope();
                return basicGetBodyScope();
            case SCChartsPackage.FOR__PARENT_SCOPE:
                if (resolve) return getParentScope();
                return basicGetParentScope();
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
            case SCChartsPackage.FOR__LOOP_VARIABLE:
                setLoopVariable((ValuedObject)newValue);
                return;
            case SCChartsPackage.FOR__BODY_SCOPE:
                setBodyScope((Scope)newValue);
                return;
            case SCChartsPackage.FOR__PARENT_SCOPE:
                setParentScope((Scope)newValue);
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
            case SCChartsPackage.FOR__LOOP_VARIABLE:
                setLoopVariable((ValuedObject)null);
                return;
            case SCChartsPackage.FOR__BODY_SCOPE:
                setBodyScope((Scope)null);
                return;
            case SCChartsPackage.FOR__PARENT_SCOPE:
                setParentScope((Scope)null);
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
            case SCChartsPackage.FOR__LOOP_VARIABLE:
                return loopVariable != null;
            case SCChartsPackage.FOR__BODY_SCOPE:
                return bodyScope != null;
            case SCChartsPackage.FOR__PARENT_SCOPE:
                return parentScope != null;
        }
        return super.eIsSet(featureID);
    }

} //ForImpl
