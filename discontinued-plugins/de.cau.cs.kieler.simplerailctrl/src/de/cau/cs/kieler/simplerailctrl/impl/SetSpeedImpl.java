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

import de.cau.cs.kieler.simplerailctrl.MOTORDIR;
import de.cau.cs.kieler.simplerailctrl.SetSpeed;
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
 * An implementation of the model object '<em><b>Set Speed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.impl.SetSpeedImpl#getTrack <em>Track</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.impl.SetSpeedImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.impl.SetSpeedImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetSpeedImpl extends NodeImpl implements SetSpeed {
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
     * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpeed()
     * @generated
     * @ordered
     */
    protected static final int SPEED_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpeed()
     * @generated
     * @ordered
     */
    protected int speed = SPEED_EDEFAULT;

    /**
     * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirection()
     * @generated
     * @ordered
     */
    protected static final MOTORDIR DIRECTION_EDEFAULT = MOTORDIR.FWD;

    /**
     * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirection()
     * @generated
     * @ordered
     */
    protected MOTORDIR direction = DIRECTION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SetSpeedImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SimplerailctrlPackage.Literals.SET_SPEED;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TRACK> getTrack() {
        if (track == null) {
            track = new EDataTypeUniqueEList<TRACK>(TRACK.class, this, SimplerailctrlPackage.SET_SPEED__TRACK);
        }
        return track;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSpeed(int newSpeed) {
        int oldSpeed = speed;
        speed = newSpeed;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SimplerailctrlPackage.SET_SPEED__SPEED, oldSpeed, speed));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MOTORDIR getDirection() {
        return direction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDirection(MOTORDIR newDirection) {
        MOTORDIR oldDirection = direction;
        direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SimplerailctrlPackage.SET_SPEED__DIRECTION, oldDirection, direction));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SimplerailctrlPackage.SET_SPEED__TRACK:
                return getTrack();
            case SimplerailctrlPackage.SET_SPEED__SPEED:
                return getSpeed();
            case SimplerailctrlPackage.SET_SPEED__DIRECTION:
                return getDirection();
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
            case SimplerailctrlPackage.SET_SPEED__TRACK:
                getTrack().clear();
                getTrack().addAll((Collection<? extends TRACK>)newValue);
                return;
            case SimplerailctrlPackage.SET_SPEED__SPEED:
                setSpeed((Integer)newValue);
                return;
            case SimplerailctrlPackage.SET_SPEED__DIRECTION:
                setDirection((MOTORDIR)newValue);
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
            case SimplerailctrlPackage.SET_SPEED__TRACK:
                getTrack().clear();
                return;
            case SimplerailctrlPackage.SET_SPEED__SPEED:
                setSpeed(SPEED_EDEFAULT);
                return;
            case SimplerailctrlPackage.SET_SPEED__DIRECTION:
                setDirection(DIRECTION_EDEFAULT);
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
            case SimplerailctrlPackage.SET_SPEED__TRACK:
                return track != null && !track.isEmpty();
            case SimplerailctrlPackage.SET_SPEED__SPEED:
                return speed != SPEED_EDEFAULT;
            case SimplerailctrlPackage.SET_SPEED__DIRECTION:
                return direction != DIRECTION_EDEFAULT;
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
        result.append(", speed: ");
        result.append(speed);
        result.append(", direction: ");
        result.append(direction);
        result.append(')');
        return result.toString();
    }

} //SetSpeedImpl
