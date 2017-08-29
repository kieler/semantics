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
package de.cau.cs.kieler.sccharts.impl;

import de.cau.cs.kieler.kexpressions.Expression;
import de.cau.cs.kieler.kexpressions.ValuedObject;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.SCChartsPackage;
import de.cau.cs.kieler.sccharts.State;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.RegionImpl#getParentState <em>Parent State</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.RegionImpl#getCounterVariable <em>Counter Variable</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.RegionImpl#getForStart <em>For Start</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.RegionImpl#getForEnd <em>For End</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RegionImpl extends ScopeImpl implements Region {
    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\r\n\r\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\r\n\r\nCopyright 2013 by\r\n+ Kiel University\r\n  + Department of Computer Science\r\n    + Real-Time and Embedded Systems Group\r\n\r\nThis code is provided under the terms of the Eclipse Public License (EPL).\r\nSee the file epl-v10.html for the license text.";

				/**
     * The cached value of the '{@link #getCounterVariable() <em>Counter Variable</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCounterVariable()
     * @generated
     * @ordered
     */
    protected ValuedObject counterVariable;

                /**
     * The cached value of the '{@link #getForStart() <em>For Start</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getForStart()
     * @generated
     * @ordered
     */
    protected Expression forStart;
    /**
     * The cached value of the '{@link #getForEnd() <em>For End</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getForEnd()
     * @generated
     * @ordered
     */
    protected Expression forEnd;

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RegionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SCChartsPackage.Literals.REGION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public State getParentState() {
        if (eContainerFeatureID() != SCChartsPackage.REGION__PARENT_STATE) return null;
        return (State)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentState(State newParentState, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentState, SCChartsPackage.REGION__PARENT_STATE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentState(State newParentState) {
        if (newParentState != eInternalContainer() || (eContainerFeatureID() != SCChartsPackage.REGION__PARENT_STATE && newParentState != null)) {
            if (EcoreUtil.isAncestor(this, newParentState))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentState != null)
                msgs = ((InternalEObject)newParentState).eInverseAdd(this, SCChartsPackage.STATE__REGIONS, State.class, msgs);
            msgs = basicSetParentState(newParentState, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.REGION__PARENT_STATE, newParentState, newParentState));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValuedObject getCounterVariable() {
        return counterVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCounterVariable(ValuedObject newCounterVariable, NotificationChain msgs) {
        ValuedObject oldCounterVariable = counterVariable;
        counterVariable = newCounterVariable;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCChartsPackage.REGION__COUNTER_VARIABLE, oldCounterVariable, newCounterVariable);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCounterVariable(ValuedObject newCounterVariable) {
        if (newCounterVariable != counterVariable) {
            NotificationChain msgs = null;
            if (counterVariable != null)
                msgs = ((InternalEObject)counterVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SCChartsPackage.REGION__COUNTER_VARIABLE, null, msgs);
            if (newCounterVariable != null)
                msgs = ((InternalEObject)newCounterVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SCChartsPackage.REGION__COUNTER_VARIABLE, null, msgs);
            msgs = basicSetCounterVariable(newCounterVariable, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.REGION__COUNTER_VARIABLE, newCounterVariable, newCounterVariable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression getForStart() {
        return forStart;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetForStart(Expression newForStart, NotificationChain msgs) {
        Expression oldForStart = forStart;
        forStart = newForStart;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCChartsPackage.REGION__FOR_START, oldForStart, newForStart);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setForStart(Expression newForStart) {
        if (newForStart != forStart) {
            NotificationChain msgs = null;
            if (forStart != null)
                msgs = ((InternalEObject)forStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SCChartsPackage.REGION__FOR_START, null, msgs);
            if (newForStart != null)
                msgs = ((InternalEObject)newForStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SCChartsPackage.REGION__FOR_START, null, msgs);
            msgs = basicSetForStart(newForStart, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.REGION__FOR_START, newForStart, newForStart));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression getForEnd() {
        return forEnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetForEnd(Expression newForEnd, NotificationChain msgs) {
        Expression oldForEnd = forEnd;
        forEnd = newForEnd;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCChartsPackage.REGION__FOR_END, oldForEnd, newForEnd);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setForEnd(Expression newForEnd) {
        if (newForEnd != forEnd) {
            NotificationChain msgs = null;
            if (forEnd != null)
                msgs = ((InternalEObject)forEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SCChartsPackage.REGION__FOR_END, null, msgs);
            if (newForEnd != null)
                msgs = ((InternalEObject)newForEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SCChartsPackage.REGION__FOR_END, null, msgs);
            msgs = basicSetForEnd(newForEnd, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.REGION__FOR_END, newForEnd, newForEnd));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SCChartsPackage.REGION__PARENT_STATE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentState((State)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SCChartsPackage.REGION__PARENT_STATE:
                return basicSetParentState(null, msgs);
            case SCChartsPackage.REGION__COUNTER_VARIABLE:
                return basicSetCounterVariable(null, msgs);
            case SCChartsPackage.REGION__FOR_START:
                return basicSetForStart(null, msgs);
            case SCChartsPackage.REGION__FOR_END:
                return basicSetForEnd(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case SCChartsPackage.REGION__PARENT_STATE:
                return eInternalContainer().eInverseRemove(this, SCChartsPackage.STATE__REGIONS, State.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SCChartsPackage.REGION__PARENT_STATE:
                return getParentState();
            case SCChartsPackage.REGION__COUNTER_VARIABLE:
                return getCounterVariable();
            case SCChartsPackage.REGION__FOR_START:
                return getForStart();
            case SCChartsPackage.REGION__FOR_END:
                return getForEnd();
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
            case SCChartsPackage.REGION__PARENT_STATE:
                setParentState((State)newValue);
                return;
            case SCChartsPackage.REGION__COUNTER_VARIABLE:
                setCounterVariable((ValuedObject)newValue);
                return;
            case SCChartsPackage.REGION__FOR_START:
                setForStart((Expression)newValue);
                return;
            case SCChartsPackage.REGION__FOR_END:
                setForEnd((Expression)newValue);
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
            case SCChartsPackage.REGION__PARENT_STATE:
                setParentState((State)null);
                return;
            case SCChartsPackage.REGION__COUNTER_VARIABLE:
                setCounterVariable((ValuedObject)null);
                return;
            case SCChartsPackage.REGION__FOR_START:
                setForStart((Expression)null);
                return;
            case SCChartsPackage.REGION__FOR_END:
                setForEnd((Expression)null);
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
            case SCChartsPackage.REGION__PARENT_STATE:
                return getParentState() != null;
            case SCChartsPackage.REGION__COUNTER_VARIABLE:
                return counterVariable != null;
            case SCChartsPackage.REGION__FOR_START:
                return forStart != null;
            case SCChartsPackage.REGION__FOR_END:
                return forEnd != null;
        }
        return super.eIsSet(featureID);
    }

} //RegionImpl
