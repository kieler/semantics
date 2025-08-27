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

import de.cau.cs.kieler.simplerailctrl.DIRECTION;
import de.cau.cs.kieler.simplerailctrl.POINT;
import de.cau.cs.kieler.simplerailctrl.SetPoint;
import de.cau.cs.kieler.simplerailctrl.SimplerailctrlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.impl.SetPointImpl#getPoint <em>Point</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simplerailctrl.impl.SetPointImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetPointImpl extends NodeImpl implements SetPoint {
    /**
     * The cached value of the '{@link #getPoint() <em>Point</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPoint()
     * @generated
     * @ordered
     */
    protected EList<POINT> point;

    /**
     * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirection()
     * @generated
     * @ordered
     */
    protected static final DIRECTION DIRECTION_EDEFAULT = DIRECTION.BRANCH;

    /**
     * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirection()
     * @generated
     * @ordered
     */
    protected DIRECTION direction = DIRECTION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SetPointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SimplerailctrlPackage.Literals.SET_POINT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<POINT> getPoint() {
        if (point == null) {
            point = new EDataTypeUniqueEList<POINT>(POINT.class, this, SimplerailctrlPackage.SET_POINT__POINT);
        }
        return point;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DIRECTION getDirection() {
        return direction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDirection(DIRECTION newDirection) {
        DIRECTION oldDirection = direction;
        direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SimplerailctrlPackage.SET_POINT__DIRECTION, oldDirection, direction));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SimplerailctrlPackage.SET_POINT__POINT:
                return getPoint();
            case SimplerailctrlPackage.SET_POINT__DIRECTION:
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
            case SimplerailctrlPackage.SET_POINT__POINT:
                getPoint().clear();
                getPoint().addAll((Collection<? extends POINT>)newValue);
                return;
            case SimplerailctrlPackage.SET_POINT__DIRECTION:
                setDirection((DIRECTION)newValue);
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
            case SimplerailctrlPackage.SET_POINT__POINT:
                getPoint().clear();
                return;
            case SimplerailctrlPackage.SET_POINT__DIRECTION:
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
            case SimplerailctrlPackage.SET_POINT__POINT:
                return point != null && !point.isEmpty();
            case SimplerailctrlPackage.SET_POINT__DIRECTION:
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
        result.append(" (point: ");
        result.append(point);
        result.append(", direction: ");
        result.append(direction);
        result.append(')');
        return result.toString();
    }

} //SetPointImpl
