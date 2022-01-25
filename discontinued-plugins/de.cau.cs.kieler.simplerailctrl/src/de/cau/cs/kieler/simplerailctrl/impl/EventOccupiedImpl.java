/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.simplerailctrl.impl;

import de.cau.cs.kieler.simplerailctrl.CONDITION;
import de.cau.cs.kieler.simplerailctrl.CONJUNCTION;
import de.cau.cs.kieler.simplerailctrl.EventOccupied;
import de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage;
import de.cau.cs.kieler.simplerailctrl.TRACK;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Occupied</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.impl.EventOccupiedImpl#getTrack <em>Track</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.impl.EventOccupiedImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.impl.EventOccupiedImpl#getConjunction <em>Conjunction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventOccupiedImpl extends TransitionImpl implements EventOccupied {
    /**
     * The cached value of the '{@link #getTrack() <em>Track</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrack()
     * @generated
     * @ordered
     */
    protected EList<TRACK> track;

    /**
     * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCondition()
     * @generated
     * @ordered
     */
    protected static final CONDITION CONDITION_EDEFAULT = CONDITION.IF;

    /**
     * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCondition()
     * @generated
     * @ordered
     */
    protected CONDITION condition = CONDITION_EDEFAULT;

    /**
     * The default value of the '{@link #getConjunction() <em>Conjunction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConjunction()
     * @generated
     * @ordered
     */
    protected static final CONJUNCTION CONJUNCTION_EDEFAULT = CONJUNCTION.AND;

    /**
     * The cached value of the '{@link #getConjunction() <em>Conjunction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConjunction()
     * @generated
     * @ordered
     */
    protected CONJUNCTION conjunction = CONJUNCTION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EventOccupiedImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SimplerailctrlPackage.Literals.EVENT_OCCUPIED;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TRACK> getTrack() {
        if (track == null) {
            track = new EDataTypeUniqueEList<TRACK>(TRACK.class, this, SimplerailctrlPackage.EVENT_OCCUPIED__TRACK);
        }
        return track;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CONDITION getCondition() {
        return condition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCondition(CONDITION newCondition) {
        CONDITION oldCondition = condition;
        condition = newCondition == null ? CONDITION_EDEFAULT : newCondition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SimplerailctrlPackage.EVENT_OCCUPIED__CONDITION, oldCondition, condition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CONJUNCTION getConjunction() {
        return conjunction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConjunction(CONJUNCTION newConjunction) {
        CONJUNCTION oldConjunction = conjunction;
        conjunction = newConjunction == null ? CONJUNCTION_EDEFAULT : newConjunction;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SimplerailctrlPackage.EVENT_OCCUPIED__CONJUNCTION, oldConjunction, conjunction));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SimplerailctrlPackage.EVENT_OCCUPIED__TRACK:
                return getTrack();
            case SimplerailctrlPackage.EVENT_OCCUPIED__CONDITION:
                return getCondition();
            case SimplerailctrlPackage.EVENT_OCCUPIED__CONJUNCTION:
                return getConjunction();
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
            case SimplerailctrlPackage.EVENT_OCCUPIED__TRACK:
                getTrack().clear();
                getTrack().addAll((Collection<? extends TRACK>)newValue);
                return;
            case SimplerailctrlPackage.EVENT_OCCUPIED__CONDITION:
                setCondition((CONDITION)newValue);
                return;
            case SimplerailctrlPackage.EVENT_OCCUPIED__CONJUNCTION:
                setConjunction((CONJUNCTION)newValue);
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
            case SimplerailctrlPackage.EVENT_OCCUPIED__TRACK:
                getTrack().clear();
                return;
            case SimplerailctrlPackage.EVENT_OCCUPIED__CONDITION:
                setCondition(CONDITION_EDEFAULT);
                return;
            case SimplerailctrlPackage.EVENT_OCCUPIED__CONJUNCTION:
                setConjunction(CONJUNCTION_EDEFAULT);
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
            case SimplerailctrlPackage.EVENT_OCCUPIED__TRACK:
                return track != null && !track.isEmpty();
            case SimplerailctrlPackage.EVENT_OCCUPIED__CONDITION:
                return condition != CONDITION_EDEFAULT;
            case SimplerailctrlPackage.EVENT_OCCUPIED__CONJUNCTION:
                return conjunction != CONJUNCTION_EDEFAULT;
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
        result.append(" (track: ");
        result.append(track);
        result.append(", condition: ");
        result.append(condition);
        result.append(", conjunction: ");
        result.append(conjunction);
        result.append(')');
        return result.toString();
    }

} //EventOccupiedImpl
