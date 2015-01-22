/**
 */
package de.cau.cs.kieler.scgprios.impl;

import de.cau.cs.kieler.scgprios.ControlFlow_P;
import de.cau.cs.kieler.scgprios.Fork_P;
import de.cau.cs.kieler.scgprios.Join_P;
import de.cau.cs.kieler.scgprios.ScgpriosPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fork P</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.Fork_PImpl#getJoin <em>Join</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scgprios.impl.Fork_PImpl#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Fork_PImpl extends Node_PImpl implements Fork_P {
    /**
     * The cached value of the '{@link #getJoin() <em>Join</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJoin()
     * @generated
     * @ordered
     */
    protected Join_P join;

    /**
     * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNext()
     * @generated
     * @ordered
     */
    protected EList<ControlFlow_P> next;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Fork_PImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScgpriosPackage.Literals.FORK_P;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Join_P getJoin() {
        if (join != null && join.eIsProxy()) {
            InternalEObject oldJoin = (InternalEObject)join;
            join = (Join_P)eResolveProxy(oldJoin);
            if (join != oldJoin) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgpriosPackage.FORK_P__JOIN, oldJoin, join));
            }
        }
        return join;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Join_P basicGetJoin() {
        return join;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetJoin(Join_P newJoin, NotificationChain msgs) {
        Join_P oldJoin = join;
        join = newJoin;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgpriosPackage.FORK_P__JOIN, oldJoin, newJoin);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setJoin(Join_P newJoin) {
        if (newJoin != join) {
            NotificationChain msgs = null;
            if (join != null)
                msgs = ((InternalEObject)join).eInverseRemove(this, ScgpriosPackage.JOIN_P__FORK, Join_P.class, msgs);
            if (newJoin != null)
                msgs = ((InternalEObject)newJoin).eInverseAdd(this, ScgpriosPackage.JOIN_P__FORK, Join_P.class, msgs);
            msgs = basicSetJoin(newJoin, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgpriosPackage.FORK_P__JOIN, newJoin, newJoin));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ControlFlow_P> getNext() {
        if (next == null) {
            next = new EObjectContainmentEList<ControlFlow_P>(ControlFlow_P.class, this, ScgpriosPackage.FORK_P__NEXT);
        }
        return next;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScgpriosPackage.FORK_P__JOIN:
                if (join != null)
                    msgs = ((InternalEObject)join).eInverseRemove(this, ScgpriosPackage.JOIN_P__FORK, Join_P.class, msgs);
                return basicSetJoin((Join_P)otherEnd, msgs);
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
            case ScgpriosPackage.FORK_P__JOIN:
                return basicSetJoin(null, msgs);
            case ScgpriosPackage.FORK_P__NEXT:
                return ((InternalEList<?>)getNext()).basicRemove(otherEnd, msgs);
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
            case ScgpriosPackage.FORK_P__JOIN:
                if (resolve) return getJoin();
                return basicGetJoin();
            case ScgpriosPackage.FORK_P__NEXT:
                return getNext();
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
            case ScgpriosPackage.FORK_P__JOIN:
                setJoin((Join_P)newValue);
                return;
            case ScgpriosPackage.FORK_P__NEXT:
                getNext().clear();
                getNext().addAll((Collection<? extends ControlFlow_P>)newValue);
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
            case ScgpriosPackage.FORK_P__JOIN:
                setJoin((Join_P)null);
                return;
            case ScgpriosPackage.FORK_P__NEXT:
                getNext().clear();
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
            case ScgpriosPackage.FORK_P__JOIN:
                return join != null;
            case ScgpriosPackage.FORK_P__NEXT:
                return next != null && !next.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //Fork_PImpl
