/**
 */
package de.cau.cs.kieler.scgprios.impl;

import de.cau.cs.kieler.scgprios.ControlFlow_P;
import de.cau.cs.kieler.scgprios.Fork_P;
import de.cau.cs.kieler.scgprios.Join_P;
import de.cau.cs.kieler.scgprios.ScgpriosPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join P</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.Join_PImpl#getFork <em>Fork</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.Join_PImpl#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Join_PImpl extends Node_PImpl implements Join_P {
    /**
     * The cached value of the '{@link #getFork() <em>Fork</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFork()
     * @generated
     * @ordered
     */
    protected Fork_P fork;

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
    protected Join_PImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScgpriosPackage.Literals.JOIN_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Fork_P getFork() {
        if (fork != null && fork.eIsProxy()) {
            InternalEObject oldFork = (InternalEObject)fork;
            fork = (Fork_P)eResolveProxy(oldFork);
            if (fork != oldFork) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgpriosPackage.JOIN_P__FORK, oldFork, fork));
            }
        }
        return fork;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Fork_P basicGetFork() {
        return fork;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFork(Fork_P newFork, NotificationChain msgs) {
        Fork_P oldFork = fork;
        fork = newFork;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgpriosPackage.JOIN_P__FORK, oldFork, newFork);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFork(Fork_P newFork) {
        if (newFork != fork) {
            NotificationChain msgs = null;
            if (fork != null)
                msgs = ((InternalEObject)fork).eInverseRemove(this, ScgpriosPackage.FORK_P__JOIN, Fork_P.class, msgs);
            if (newFork != null)
                msgs = ((InternalEObject)newFork).eInverseAdd(this, ScgpriosPackage.FORK_P__JOIN, Fork_P.class, msgs);
            msgs = basicSetFork(newFork, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.JOIN_P__FORK, newFork, newFork));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgpriosPackage.JOIN_P__NEXT, oldNext, newNext);
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
                msgs = ((InternalEObject)next).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgpriosPackage.JOIN_P__NEXT, null, msgs);
            if (newNext != null)
                msgs = ((InternalEObject)newNext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgpriosPackage.JOIN_P__NEXT, null, msgs);
            msgs = basicSetNext(newNext, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.JOIN_P__NEXT, newNext, newNext));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScgpriosPackage.JOIN_P__FORK:
                if (fork != null)
                    msgs = ((InternalEObject)fork).eInverseRemove(this, ScgpriosPackage.FORK_P__JOIN, Fork_P.class, msgs);
                return basicSetFork((Fork_P)otherEnd, msgs);
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
            case ScgpriosPackage.JOIN_P__FORK:
                return basicSetFork(null, msgs);
            case ScgpriosPackage.JOIN_P__NEXT:
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
            case ScgpriosPackage.JOIN_P__FORK:
                if (resolve) return getFork();
                return basicGetFork();
            case ScgpriosPackage.JOIN_P__NEXT:
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
            case ScgpriosPackage.JOIN_P__FORK:
                setFork((Fork_P)newValue);
                return;
            case ScgpriosPackage.JOIN_P__NEXT:
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
            case ScgpriosPackage.JOIN_P__FORK:
                setFork((Fork_P)null);
                return;
            case ScgpriosPackage.JOIN_P__NEXT:
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
            case ScgpriosPackage.JOIN_P__FORK:
                return fork != null;
            case ScgpriosPackage.JOIN_P__NEXT:
                return next != null;
        }
        return super.eIsSet(featureID);
    }

} //Join_PImpl
