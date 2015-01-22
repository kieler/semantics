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
 * An implementation of the model object '<em><b>Exit P</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.Exit_PImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.Exit_PImpl#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Exit_PImpl extends Node_PImpl implements Exit_P {
    /**
     * The cached value of the '{@link #getEntry() <em>Entry</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntry()
     * @generated
     * @ordered
     */
    protected Entry_P entry;

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
    protected Exit_PImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScgpriosPackage.Literals.EXIT_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Entry_P getEntry() {
        if (entry != null && entry.eIsProxy()) {
            InternalEObject oldEntry = (InternalEObject)entry;
            entry = (Entry_P)eResolveProxy(oldEntry);
            if (entry != oldEntry) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgpriosPackage.EXIT_P__ENTRY, oldEntry, entry));
            }
        }
        return entry;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Entry_P basicGetEntry() {
        return entry;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEntry(Entry_P newEntry, NotificationChain msgs) {
        Entry_P oldEntry = entry;
        entry = newEntry;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgpriosPackage.EXIT_P__ENTRY, oldEntry, newEntry);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEntry(Entry_P newEntry) {
        if (newEntry != entry) {
            NotificationChain msgs = null;
            if (entry != null)
                msgs = ((InternalEObject)entry).eInverseRemove(this, ScgpriosPackage.ENTRY_P__EXIT, Entry_P.class, msgs);
            if (newEntry != null)
                msgs = ((InternalEObject)newEntry).eInverseAdd(this, ScgpriosPackage.ENTRY_P__EXIT, Entry_P.class, msgs);
            msgs = basicSetEntry(newEntry, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.EXIT_P__ENTRY, newEntry, newEntry));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgpriosPackage.EXIT_P__NEXT, oldNext, newNext);
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
                msgs = ((InternalEObject)next).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScgpriosPackage.EXIT_P__NEXT, null, msgs);
            if (newNext != null)
                msgs = ((InternalEObject)newNext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScgpriosPackage.EXIT_P__NEXT, null, msgs);
            msgs = basicSetNext(newNext, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.EXIT_P__NEXT, newNext, newNext));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScgpriosPackage.EXIT_P__ENTRY:
                if (entry != null)
                    msgs = ((InternalEObject)entry).eInverseRemove(this, ScgpriosPackage.ENTRY_P__EXIT, Entry_P.class, msgs);
                return basicSetEntry((Entry_P)otherEnd, msgs);
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
            case ScgpriosPackage.EXIT_P__ENTRY:
                return basicSetEntry(null, msgs);
            case ScgpriosPackage.EXIT_P__NEXT:
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
            case ScgpriosPackage.EXIT_P__ENTRY:
                if (resolve) return getEntry();
                return basicGetEntry();
            case ScgpriosPackage.EXIT_P__NEXT:
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
            case ScgpriosPackage.EXIT_P__ENTRY:
                setEntry((Entry_P)newValue);
                return;
            case ScgpriosPackage.EXIT_P__NEXT:
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
            case ScgpriosPackage.EXIT_P__ENTRY:
                setEntry((Entry_P)null);
                return;
            case ScgpriosPackage.EXIT_P__NEXT:
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
            case ScgpriosPackage.EXIT_P__ENTRY:
                return entry != null;
            case ScgpriosPackage.EXIT_P__NEXT:
                return next != null;
        }
        return super.eIsSet(featureID);
    }

} //Exit_PImpl
