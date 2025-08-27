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

import de.cau.cs.kieler.simplerailctrl.EventContact;
import de.cau.cs.kieler.simplerailctrl.POSITION;
import de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage;
import de.cau.cs.kieler.simplerailctrl.TRACK;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Contact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.impl.EventContactImpl#getTrack <em>Track</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.impl.EventContactImpl#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventContactImpl extends TransitionImpl implements EventContact {
    /**
     * The default value of the '{@link #getTrack() <em>Track</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrack()
     * @generated
     * @ordered
     */
    protected static final TRACK TRACK_EDEFAULT = TRACK.IC_JCT_0;

    /**
     * The cached value of the '{@link #getTrack() <em>Track</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrack()
     * @generated
     * @ordered
     */
    protected TRACK track = TRACK_EDEFAULT;

    /**
     * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPosition()
     * @generated
     * @ordered
     */
    protected static final POSITION POSITION_EDEFAULT = POSITION.FIRST;

    /**
     * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPosition()
     * @generated
     * @ordered
     */
    protected POSITION position = POSITION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EventContactImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SimplerailctrlPackage.Literals.EVENT_CONTACT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TRACK getTrack() {
        return track;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTrack(TRACK newTrack) {
        TRACK oldTrack = track;
        track = newTrack == null ? TRACK_EDEFAULT : newTrack;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SimplerailctrlPackage.EVENT_CONTACT__TRACK, oldTrack, track));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public POSITION getPosition() {
        return position;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPosition(POSITION newPosition) {
        POSITION oldPosition = position;
        position = newPosition == null ? POSITION_EDEFAULT : newPosition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SimplerailctrlPackage.EVENT_CONTACT__POSITION, oldPosition, position));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SimplerailctrlPackage.EVENT_CONTACT__TRACK:
                return getTrack();
            case SimplerailctrlPackage.EVENT_CONTACT__POSITION:
                return getPosition();
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
            case SimplerailctrlPackage.EVENT_CONTACT__TRACK:
                setTrack((TRACK)newValue);
                return;
            case SimplerailctrlPackage.EVENT_CONTACT__POSITION:
                setPosition((POSITION)newValue);
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
            case SimplerailctrlPackage.EVENT_CONTACT__TRACK:
                setTrack(TRACK_EDEFAULT);
                return;
            case SimplerailctrlPackage.EVENT_CONTACT__POSITION:
                setPosition(POSITION_EDEFAULT);
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
            case SimplerailctrlPackage.EVENT_CONTACT__TRACK:
                return track != TRACK_EDEFAULT;
            case SimplerailctrlPackage.EVENT_CONTACT__POSITION:
                return position != POSITION_EDEFAULT;
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
        result.append(", position: ");
        result.append(position);
        result.append(')');
        return result.toString();
    }

} //EventContactImpl
