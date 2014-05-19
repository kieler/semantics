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

import de.cau.cs.kieler.core.kexpressions.Expression;

import de.cau.cs.kieler.core.kexpressions.ValuedObject;
import de.cau.cs.kieler.sccharts.For;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.SCChartsPackage;
import de.cau.cs.kieler.sccharts.Scope;

import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
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
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ForImpl#getParentState <em>Parent State</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ForImpl#getFrom <em>From</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ForImpl#getTo <em>To</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.ForImpl#getEReference0 <em>EReference0</em>}</li>
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
     * The cached value of the '{@link #getBodyScope() <em>Body Scope</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBodyScope()
     * @generated
     * @ordered
     */
    protected Scope bodyScope;

    /**
     * The cached value of the '{@link #getParentState() <em>Parent State</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParentState()
     * @generated
     * @ordered
     */
    protected Region parentState;

    /**
     * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFrom()
     * @generated
     * @ordered
     */
    protected Expression from;

    /**
     * The cached value of the '{@link #getTo() <em>To</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTo()
     * @generated
     * @ordered
     */
    protected Expression to;

    /**
     * The cached value of the '{@link #getEReference0() <em>EReference0</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEReference0()
     * @generated
     * @ordered
     */
    protected Region eReference0;

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
        return bodyScope;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBodyScope(Scope newBodyScope, NotificationChain msgs) {
        Scope oldBodyScope = bodyScope;
        bodyScope = newBodyScope;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCChartsPackage.FOR__BODY_SCOPE, oldBodyScope, newBodyScope);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBodyScope(Scope newBodyScope) {
        if (newBodyScope != bodyScope) {
            NotificationChain msgs = null;
            if (bodyScope != null)
                msgs = ((InternalEObject)bodyScope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SCChartsPackage.FOR__BODY_SCOPE, null, msgs);
            if (newBodyScope != null)
                msgs = ((InternalEObject)newBodyScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SCChartsPackage.FOR__BODY_SCOPE, null, msgs);
            msgs = basicSetBodyScope(newBodyScope, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.FOR__BODY_SCOPE, newBodyScope, newBodyScope));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Region getParentState() {
        if (parentState != null && parentState.eIsProxy()) {
            InternalEObject oldParentState = (InternalEObject)parentState;
            parentState = (Region)eResolveProxy(oldParentState);
            if (parentState != oldParentState) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SCChartsPackage.FOR__PARENT_STATE, oldParentState, parentState));
            }
        }
        return parentState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Region basicGetParentState() {
        return parentState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentState(Region newParentState) {
        Region oldParentState = parentState;
        parentState = newParentState;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.FOR__PARENT_STATE, oldParentState, parentState));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression getFrom() {
        if (from != null && from.eIsProxy()) {
            InternalEObject oldFrom = (InternalEObject)from;
            from = (Expression)eResolveProxy(oldFrom);
            if (from != oldFrom) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SCChartsPackage.FOR__FROM, oldFrom, from));
            }
        }
        return from;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression basicGetFrom() {
        return from;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFrom(Expression newFrom) {
        Expression oldFrom = from;
        from = newFrom;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.FOR__FROM, oldFrom, from));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression getTo() {
        if (to != null && to.eIsProxy()) {
            InternalEObject oldTo = (InternalEObject)to;
            to = (Expression)eResolveProxy(oldTo);
            if (to != oldTo) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SCChartsPackage.FOR__TO, oldTo, to));
            }
        }
        return to;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression basicGetTo() {
        return to;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTo(Expression newTo) {
        Expression oldTo = to;
        to = newTo;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.FOR__TO, oldTo, to));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Region getEReference0() {
        if (eReference0 != null && eReference0.eIsProxy()) {
            InternalEObject oldEReference0 = (InternalEObject)eReference0;
            eReference0 = (Region)eResolveProxy(oldEReference0);
            if (eReference0 != oldEReference0) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SCChartsPackage.FOR__EREFERENCE0, oldEReference0, eReference0));
            }
        }
        return eReference0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Region basicGetEReference0() {
        return eReference0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEReference0(Region newEReference0) {
        Region oldEReference0 = eReference0;
        eReference0 = newEReference0;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.FOR__EREFERENCE0, oldEReference0, eReference0));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SCChartsPackage.FOR__BODY_SCOPE:
                return basicSetBodyScope(null, msgs);
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
            case SCChartsPackage.FOR__LOOP_VARIABLE:
                if (resolve) return getLoopVariable();
                return basicGetLoopVariable();
            case SCChartsPackage.FOR__BODY_SCOPE:
                return getBodyScope();
            case SCChartsPackage.FOR__PARENT_STATE:
                if (resolve) return getParentState();
                return basicGetParentState();
            case SCChartsPackage.FOR__FROM:
                if (resolve) return getFrom();
                return basicGetFrom();
            case SCChartsPackage.FOR__TO:
                if (resolve) return getTo();
                return basicGetTo();
            case SCChartsPackage.FOR__EREFERENCE0:
                if (resolve) return getEReference0();
                return basicGetEReference0();
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
            case SCChartsPackage.FOR__PARENT_STATE:
                setParentState((Region)newValue);
                return;
            case SCChartsPackage.FOR__FROM:
                setFrom((Expression)newValue);
                return;
            case SCChartsPackage.FOR__TO:
                setTo((Expression)newValue);
                return;
            case SCChartsPackage.FOR__EREFERENCE0:
                setEReference0((Region)newValue);
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
            case SCChartsPackage.FOR__PARENT_STATE:
                setParentState((Region)null);
                return;
            case SCChartsPackage.FOR__FROM:
                setFrom((Expression)null);
                return;
            case SCChartsPackage.FOR__TO:
                setTo((Expression)null);
                return;
            case SCChartsPackage.FOR__EREFERENCE0:
                setEReference0((Region)null);
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
            case SCChartsPackage.FOR__PARENT_STATE:
                return parentState != null;
            case SCChartsPackage.FOR__FROM:
                return from != null;
            case SCChartsPackage.FOR__TO:
                return to != null;
            case SCChartsPackage.FOR__EREFERENCE0:
                return eReference0 != null;
        }
        return super.eIsSet(featureID);
    }

} //ForImpl
