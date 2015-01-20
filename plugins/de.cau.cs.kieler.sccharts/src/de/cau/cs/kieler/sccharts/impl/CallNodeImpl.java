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

import de.cau.cs.kieler.sccharts.CallNode;
import de.cau.cs.kieler.sccharts.DefineNode;
import de.cau.cs.kieler.sccharts.Node;
import de.cau.cs.kieler.sccharts.SCChartsPackage;

import de.cau.cs.kieler.sccharts.Scope;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.CallNodeImpl#getCallReference <em>Call Reference</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.CallNodeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.CallNodeImpl#getReferencedScope <em>Referenced Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallNodeImpl extends NodeImpl implements CallNode {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\n\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\n\nCopyright 2013 by\n+ Christian-Albrechts-University of Kiel\n  + Department of Computer Science\n    + Real-Time and Embedded Systems Group\n\nThis code is provided under the terms of the Eclipse Public License (EPL).\nSee the file epl-v10.html for the license text.";

    /**
     * The cached value of the '{@link #getCallReference() <em>Call Reference</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCallReference()
     * @generated
     * @ordered
     */
    protected DefineNode callReference;

    /**
     * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameters()
     * @generated
     * @ordered
     */
    protected EList<Expression> parameters;

    /**
     * The cached value of the '{@link #getReferencedScope() <em>Referenced Scope</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferencedScope()
     * @generated
     * @ordered
     */
    protected Scope referencedScope;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CallNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SCChartsPackage.Literals.CALL_NODE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefineNode getCallReference() {
        if (callReference != null && callReference.eIsProxy()) {
            InternalEObject oldCallReference = (InternalEObject)callReference;
            callReference = (DefineNode)eResolveProxy(oldCallReference);
            if (callReference != oldCallReference) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SCChartsPackage.CALL_NODE__CALL_REFERENCE, oldCallReference, callReference));
            }
        }
        return callReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefineNode basicGetCallReference() {
        return callReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCallReference(DefineNode newCallReference) {
        DefineNode oldCallReference = callReference;
        callReference = newCallReference;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.CALL_NODE__CALL_REFERENCE, oldCallReference, callReference));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Expression> getParameters() {
        if (parameters == null) {
            parameters = new EObjectContainmentEList<Expression>(Expression.class, this, SCChartsPackage.CALL_NODE__PARAMETERS);
        }
        return parameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Scope getReferencedScope() {
        if (referencedScope != null && referencedScope.eIsProxy()) {
            InternalEObject oldReferencedScope = (InternalEObject)referencedScope;
            referencedScope = (Scope)eResolveProxy(oldReferencedScope);
            if (referencedScope != oldReferencedScope) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SCChartsPackage.CALL_NODE__REFERENCED_SCOPE, oldReferencedScope, referencedScope));
            }
        }
        return referencedScope;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Scope basicGetReferencedScope() {
        return referencedScope;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReferencedScope(Scope newReferencedScope) {
        Scope oldReferencedScope = referencedScope;
        referencedScope = newReferencedScope;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.CALL_NODE__REFERENCED_SCOPE, oldReferencedScope, referencedScope));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SCChartsPackage.CALL_NODE__PARAMETERS:
                return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
            case SCChartsPackage.CALL_NODE__CALL_REFERENCE:
                if (resolve) return getCallReference();
                return basicGetCallReference();
            case SCChartsPackage.CALL_NODE__PARAMETERS:
                return getParameters();
            case SCChartsPackage.CALL_NODE__REFERENCED_SCOPE:
                if (resolve) return getReferencedScope();
                return basicGetReferencedScope();
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
            case SCChartsPackage.CALL_NODE__CALL_REFERENCE:
                setCallReference((DefineNode)newValue);
                return;
            case SCChartsPackage.CALL_NODE__PARAMETERS:
                getParameters().clear();
                getParameters().addAll((Collection<? extends Expression>)newValue);
                return;
            case SCChartsPackage.CALL_NODE__REFERENCED_SCOPE:
                setReferencedScope((Scope)newValue);
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
            case SCChartsPackage.CALL_NODE__CALL_REFERENCE:
                setCallReference((DefineNode)null);
                return;
            case SCChartsPackage.CALL_NODE__PARAMETERS:
                getParameters().clear();
                return;
            case SCChartsPackage.CALL_NODE__REFERENCED_SCOPE:
                setReferencedScope((Scope)null);
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
            case SCChartsPackage.CALL_NODE__CALL_REFERENCE:
                return callReference != null;
            case SCChartsPackage.CALL_NODE__PARAMETERS:
                return parameters != null && !parameters.isEmpty();
            case SCChartsPackage.CALL_NODE__REFERENCED_SCOPE:
                return referencedScope != null;
        }
        return super.eIsSet(featureID);
    }

} //CallNodeImpl
