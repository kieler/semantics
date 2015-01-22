/**
 */
package de.cau.cs.kieler.scgprios.impl;

import de.cau.cs.kieler.scgprios.Depth_P;
import de.cau.cs.kieler.scgprios.ScgpriosPackage;
import de.cau.cs.kieler.scgprios.Surface_P;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Surface P</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.Surface_PImpl#getDepth <em>Depth</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Surface_PImpl extends Node_PImpl implements Surface_P {
    /**
     * The cached value of the '{@link #getDepth() <em>Depth</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDepth()
     * @generated
     * @ordered
     */
    protected Depth_P depth;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Surface_PImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScgpriosPackage.Literals.SURFACE_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Depth_P getDepth() {
        if (depth != null && depth.eIsProxy()) {
            InternalEObject oldDepth = (InternalEObject)depth;
            depth = (Depth_P)eResolveProxy(oldDepth);
            if (depth != oldDepth) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgpriosPackage.SURFACE_P__DEPTH, oldDepth, depth));
            }
        }
        return depth;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Depth_P basicGetDepth() {
        return depth;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDepth(Depth_P newDepth, NotificationChain msgs) {
        Depth_P oldDepth = depth;
        depth = newDepth;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgpriosPackage.SURFACE_P__DEPTH, oldDepth, newDepth);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDepth(Depth_P newDepth) {
        if (newDepth != depth) {
            NotificationChain msgs = null;
            if (depth != null)
                msgs = ((InternalEObject)depth).eInverseRemove(this, ScgpriosPackage.DEPTH_P__SURFACE, Depth_P.class, msgs);
            if (newDepth != null)
                msgs = ((InternalEObject)newDepth).eInverseAdd(this, ScgpriosPackage.DEPTH_P__SURFACE, Depth_P.class, msgs);
            msgs = basicSetDepth(newDepth, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.SURFACE_P__DEPTH, newDepth, newDepth));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScgpriosPackage.SURFACE_P__DEPTH:
                if (depth != null)
                    msgs = ((InternalEObject)depth).eInverseRemove(this, ScgpriosPackage.DEPTH_P__SURFACE, Depth_P.class, msgs);
                return basicSetDepth((Depth_P)otherEnd, msgs);
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
            case ScgpriosPackage.SURFACE_P__DEPTH:
                return basicSetDepth(null, msgs);
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
            case ScgpriosPackage.SURFACE_P__DEPTH:
                if (resolve) return getDepth();
                return basicGetDepth();
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
            case ScgpriosPackage.SURFACE_P__DEPTH:
                setDepth((Depth_P)newValue);
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
            case ScgpriosPackage.SURFACE_P__DEPTH:
                setDepth((Depth_P)null);
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
            case ScgpriosPackage.SURFACE_P__DEPTH:
                return depth != null;
        }
        return super.eIsSet(featureID);
    }

} //Surface_PImpl
