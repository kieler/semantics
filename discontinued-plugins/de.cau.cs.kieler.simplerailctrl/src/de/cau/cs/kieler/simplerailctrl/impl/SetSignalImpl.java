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

import de.cau.cs.kieler.simplerailctrl.POSITION;
import de.cau.cs.kieler.simplerailctrl.SIGNALCOLOR;
import de.cau.cs.kieler.simplerailctrl.SetSignal;
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
 * An implementation of the model object '<em><b>Set Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.impl.SetSignalImpl#getTrack <em>Track</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.impl.SetSignalImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.impl.SetSignalImpl#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetSignalImpl extends NodeImpl implements SetSignal {
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
     * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPosition()
     * @generated
     * @ordered
     */
    protected EList<POSITION> position;

    /**
     * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColor()
     * @generated
     * @ordered
     */
    protected static final SIGNALCOLOR COLOR_EDEFAULT = SIGNALCOLOR.RED;

    /**
     * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColor()
     * @generated
     * @ordered
     */
    protected SIGNALCOLOR color = COLOR_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SetSignalImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SimplerailctrlPackage.Literals.SET_SIGNAL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TRACK> getTrack() {
        if (track == null) {
            track = new EDataTypeUniqueEList<TRACK>(TRACK.class, this, SimplerailctrlPackage.SET_SIGNAL__TRACK);
        }
        return track;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<POSITION> getPosition() {
        if (position == null) {
            position = new EDataTypeUniqueEList<POSITION>(POSITION.class, this, SimplerailctrlPackage.SET_SIGNAL__POSITION);
        }
        return position;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SIGNALCOLOR getColor() {
        return color;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setColor(SIGNALCOLOR newColor) {
        SIGNALCOLOR oldColor = color;
        color = newColor == null ? COLOR_EDEFAULT : newColor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SimplerailctrlPackage.SET_SIGNAL__COLOR, oldColor, color));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SimplerailctrlPackage.SET_SIGNAL__TRACK:
                return getTrack();
            case SimplerailctrlPackage.SET_SIGNAL__POSITION:
                return getPosition();
            case SimplerailctrlPackage.SET_SIGNAL__COLOR:
                return getColor();
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
            case SimplerailctrlPackage.SET_SIGNAL__TRACK:
                getTrack().clear();
                getTrack().addAll((Collection<? extends TRACK>)newValue);
                return;
            case SimplerailctrlPackage.SET_SIGNAL__POSITION:
                getPosition().clear();
                getPosition().addAll((Collection<? extends POSITION>)newValue);
                return;
            case SimplerailctrlPackage.SET_SIGNAL__COLOR:
                setColor((SIGNALCOLOR)newValue);
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
            case SimplerailctrlPackage.SET_SIGNAL__TRACK:
                getTrack().clear();
                return;
            case SimplerailctrlPackage.SET_SIGNAL__POSITION:
                getPosition().clear();
                return;
            case SimplerailctrlPackage.SET_SIGNAL__COLOR:
                setColor(COLOR_EDEFAULT);
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
            case SimplerailctrlPackage.SET_SIGNAL__TRACK:
                return track != null && !track.isEmpty();
            case SimplerailctrlPackage.SET_SIGNAL__POSITION:
                return position != null && !position.isEmpty();
            case SimplerailctrlPackage.SET_SIGNAL__COLOR:
                return color != COLOR_EDEFAULT;
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
        result.append(", color: ");
        result.append(color);
        result.append(')');
        return result.toString();
    }

} //SetSignalImpl
