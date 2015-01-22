/**
 */
package de.cau.cs.kieler.scgprios.impl;

import de.cau.cs.kieler.scgprios.ControlFlow_P;
import de.cau.cs.kieler.scgprios.Entry_P;
import de.cau.cs.kieler.scgprios.Exit_P;
import de.cau.cs.kieler.scgprios.ScgpriosPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry P</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.Entry_PImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.Entry_PImpl#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Entry_PImpl extends Node_PImpl implements Entry_P {
    /**
     * The cached value of the '{@link #getExit() <em>Exit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExit()
     * @generated
     * @ordered
     */
    protected Exit_P exit;

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
    protected Entry_PImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScgpriosPackage.Literals.ENTRY_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Exit_P getExit() {
        if (exit != null && exit.eIsProxy()) {
            InternalEObject oldExit = (InternalEObject)exit;
            exit = (Exit_P)eResolveProxy(oldExit);
            if (exit != oldExit) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgpriosPackage.ENTRY_P__EXIT, oldExit, exit));
            }
        }
        return exit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Exit_P basicGetExit() {
        return exit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExit(Exit_P newExit, NotificationChain msgs) {
        Exit_P oldExit = exit;
        exit = newExit;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgpriosPackage.ENTRY_P__EXIT, oldExit, newExit);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExit(Exit_P newExit) {
        if (newExit != exit) {
            NotificationChain msgs = null;
            if (exit != null)
                msgs = ((InternalEObject)exit).eInverseRemove(this, ScgpriosPackage.EXIT_P__ENTRY, Exit_P.class, msgs);
            if (newExit != null)
                msgs = ((InternalEObject)newExit).eInverseAdd(this, ScgpriosPackage.EXIT_P__ENTRY, Exit_P.class, msgs);
            msgs = basicSetExit(newExit, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.ENTRY_P__EXIT, newExit, newExit));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgpriosPackage.ENTRY_P__NEXT, oldNext, newNext);
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
                msgs = ((InternalEObject)next).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgpriosPackage.ENTRY_P__NEXT, null, msgs);
            if (newNext != null)
                msgs = ((InternalEObject)newNext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgpriosPackage.ENTRY_P__NEXT, null, msgs);
            msgs = basicSetNext(newNext, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.ENTRY_P__NEXT, newNext, newNext));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScgpriosPackage.ENTRY_P__EXIT:
                if (exit != null)
                    msgs = ((InternalEObject)exit).eInverseRemove(this, ScgpriosPackage.EXIT_P__ENTRY, Exit_P.class, msgs);
                return basicSetExit((Exit_P)otherEnd, msgs);
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
            case ScgpriosPackage.ENTRY_P__EXIT:
                return basicSetExit(null, msgs);
            case ScgpriosPackage.ENTRY_P__NEXT:
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
            case ScgpriosPackage.ENTRY_P__EXIT:
                if (resolve) return getExit();
                return basicGetExit();
            case ScgpriosPackage.ENTRY_P__NEXT:
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
            case ScgpriosPackage.ENTRY_P__EXIT:
                setExit((Exit_P)newValue);
                return;
            case ScgpriosPackage.ENTRY_P__NEXT:
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
            case ScgpriosPackage.ENTRY_P__EXIT:
                setExit((Exit_P)null);
                return;
            case ScgpriosPackage.ENTRY_P__NEXT:
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
            case ScgpriosPackage.ENTRY_P__EXIT:
                return exit != null;
            case ScgpriosPackage.ENTRY_P__NEXT:
                return next != null;
        }
        return super.eIsSet(featureID);
    }

} //Entry_PImpl
