/**
 */
package scg.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import scg.Fork;
import scg.Join;
import scg.Node;
import scg.ScgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link scg.impl.JoinImpl#getFork <em>Fork</em>}</li>
 *   <li>{@link scg.impl.JoinImpl#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JoinImpl extends NodeImpl implements Join {
    /**
     * The cached value of the '{@link #getFork() <em>Fork</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFork()
     * @generated
     * @ordered
     */
    protected Fork fork;

    /**
     * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNext()
     * @generated
     * @ordered
     */
    protected Node next;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected JoinImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScgPackage.Literals.JOIN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Fork getFork() {
        if (fork != null && fork.eIsProxy()) {
            InternalEObject oldFork = (InternalEObject)fork;
            fork = (Fork)eResolveProxy(oldFork);
            if (fork != oldFork) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgPackage.JOIN__FORK, oldFork, fork));
            }
        }
        return fork;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Fork basicGetFork() {
        return fork;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFork(Fork newFork, NotificationChain msgs) {
        Fork oldFork = fork;
        fork = newFork;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgPackage.JOIN__FORK, oldFork, newFork);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFork(Fork newFork) {
        if (newFork != fork) {
            NotificationChain msgs = null;
            if (fork != null)
                msgs = ((InternalEObject)fork).eInverseRemove(this, ScgPackage.FORK__JOIN, Fork.class, msgs);
            if (newFork != null)
                msgs = ((InternalEObject)newFork).eInverseAdd(this, ScgPackage.FORK__JOIN, Fork.class, msgs);
            msgs = basicSetFork(newFork, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.JOIN__FORK, newFork, newFork));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Node getNext() {
        if (next != null && next.eIsProxy()) {
            InternalEObject oldNext = (InternalEObject)next;
            next = (Node)eResolveProxy(oldNext);
            if (next != oldNext) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgPackage.JOIN__NEXT, oldNext, next));
            }
        }
        return next;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Node basicGetNext() {
        return next;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNext(Node newNext) {
        Node oldNext = next;
        next = newNext;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.JOIN__NEXT, oldNext, next));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScgPackage.JOIN__FORK:
                if (fork != null)
                    msgs = ((InternalEObject)fork).eInverseRemove(this, ScgPackage.FORK__JOIN, Fork.class, msgs);
                return basicSetFork((Fork)otherEnd, msgs);
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
            case ScgPackage.JOIN__FORK:
                return basicSetFork(null, msgs);
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
            case ScgPackage.JOIN__FORK:
                if (resolve) return getFork();
                return basicGetFork();
            case ScgPackage.JOIN__NEXT:
                if (resolve) return getNext();
                return basicGetNext();
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
            case ScgPackage.JOIN__FORK:
                setFork((Fork)newValue);
                return;
            case ScgPackage.JOIN__NEXT:
                setNext((Node)newValue);
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
            case ScgPackage.JOIN__FORK:
                setFork((Fork)null);
                return;
            case ScgPackage.JOIN__NEXT:
                setNext((Node)null);
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
            case ScgPackage.JOIN__FORK:
                return fork != null;
            case ScgPackage.JOIN__NEXT:
                return next != null;
        }
        return super.eIsSet(featureID);
    }

} //JoinImpl
