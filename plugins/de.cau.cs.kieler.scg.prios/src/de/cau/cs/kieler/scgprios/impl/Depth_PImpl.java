/**
 */
package de.cau.cs.kieler.scgprios.impl;

import de.cau.cs.kieler.scgprios.ControlFlow_P;
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
 * An implementation of the model object '<em><b>Depth P</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.Depth_PImpl#getSurface <em>Surface</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.Depth_PImpl#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Depth_PImpl extends Node_PImpl implements Depth_P {
    /**
     * The cached value of the '{@link #getSurface() <em>Surface</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSurface()
     * @generated
     * @ordered
     */
    protected Surface_P surface;

    /**
     * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNext()
     * @generated
     * @ordered
     */
    protected ControlFlow_P next;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Depth_PImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScgpriosPackage.Literals.DEPTH_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Surface_P getSurface() {
        if (surface != null && surface.eIsProxy()) {
            InternalEObject oldSurface = (InternalEObject)surface;
            surface = (Surface_P)eResolveProxy(oldSurface);
            if (surface != oldSurface) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgpriosPackage.DEPTH_P__SURFACE, oldSurface, surface));
            }
        }
        return surface;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Surface_P basicGetSurface() {
        return surface;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSurface(Surface_P newSurface, NotificationChain msgs) {
        Surface_P oldSurface = surface;
        surface = newSurface;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgpriosPackage.DEPTH_P__SURFACE, oldSurface, newSurface);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSurface(Surface_P newSurface) {
        if (newSurface != surface) {
            NotificationChain msgs = null;
            if (surface != null)
                msgs = ((InternalEObject)surface).eInverseRemove(this, ScgpriosPackage.SURFACE_P__DEPTH, Surface_P.class, msgs);
            if (newSurface != null)
                msgs = ((InternalEObject)newSurface).eInverseAdd(this, ScgpriosPackage.SURFACE_P__DEPTH, Surface_P.class, msgs);
            msgs = basicSetSurface(newSurface, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.DEPTH_P__SURFACE, newSurface, newSurface));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ControlFlow_P getNext() {
        return next;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNext(ControlFlow_P newNext, NotificationChain msgs) {
        ControlFlow_P oldNext = next;
        next = newNext;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgpriosPackage.DEPTH_P__NEXT, oldNext, newNext);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNext(ControlFlow_P newNext) {
        if (newNext != next) {
            NotificationChain msgs = null;
            if (next != null)
                msgs = ((InternalEObject)next).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgpriosPackage.DEPTH_P__NEXT, null, msgs);
            if (newNext != null)
                msgs = ((InternalEObject)newNext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgpriosPackage.DEPTH_P__NEXT, null, msgs);
            msgs = basicSetNext(newNext, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.DEPTH_P__NEXT, newNext, newNext));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScgpriosPackage.DEPTH_P__SURFACE:
                if (surface != null)
                    msgs = ((InternalEObject)surface).eInverseRemove(this, ScgpriosPackage.SURFACE_P__DEPTH, Surface_P.class, msgs);
                return basicSetSurface((Surface_P)otherEnd, msgs);
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
            case ScgpriosPackage.DEPTH_P__SURFACE:
                return basicSetSurface(null, msgs);
            case ScgpriosPackage.DEPTH_P__NEXT:
                return basicSetNext(null, msgs);
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
            case ScgpriosPackage.DEPTH_P__SURFACE:
                if (resolve) return getSurface();
                return basicGetSurface();
            case ScgpriosPackage.DEPTH_P__NEXT:
                return getNext();
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
            case ScgpriosPackage.DEPTH_P__SURFACE:
                setSurface((Surface_P)newValue);
                return;
            case ScgpriosPackage.DEPTH_P__NEXT:
                setNext((ControlFlow_P)newValue);
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
            case ScgpriosPackage.DEPTH_P__SURFACE:
                setSurface((Surface_P)null);
                return;
            case ScgpriosPackage.DEPTH_P__NEXT:
                setNext((ControlFlow_P)null);
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
            case ScgpriosPackage.DEPTH_P__SURFACE:
                return surface != null;
            case ScgpriosPackage.DEPTH_P__NEXT:
                return next != null;
        }
        return super.eIsSet(featureID);
    }

} //Depth_PImpl
