/**
 */
package scg.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import scg.Depth;
import scg.Node;
import scg.ScgPackage;
import scg.Surface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Depth</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link scg.impl.DepthImpl#getSurface <em>Surface</em>}</li>
 *   <li>{@link scg.impl.DepthImpl#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DepthImpl extends NodeImpl implements Depth {
    /**
     * The cached value of the '{@link #getSurface() <em>Surface</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSurface()
     * @generated
     * @ordered
     */
    protected Surface surface;

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
    protected DepthImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScgPackage.Literals.DEPTH;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Surface getSurface() {
        if (surface != null && surface.eIsProxy()) {
            InternalEObject oldSurface = (InternalEObject)surface;
            surface = (Surface)eResolveProxy(oldSurface);
            if (surface != oldSurface) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgPackage.DEPTH__SURFACE, oldSurface, surface));
            }
        }
        return surface;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Surface basicGetSurface() {
        return surface;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSurface(Surface newSurface, NotificationChain msgs) {
        Surface oldSurface = surface;
        surface = newSurface;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgPackage.DEPTH__SURFACE, oldSurface, newSurface);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSurface(Surface newSurface) {
        if (newSurface != surface) {
            NotificationChain msgs = null;
            if (surface != null)
                msgs = ((InternalEObject)surface).eInverseRemove(this, ScgPackage.SURFACE__DEPTH, Surface.class, msgs);
            if (newSurface != null)
                msgs = ((InternalEObject)newSurface).eInverseAdd(this, ScgPackage.SURFACE__DEPTH, Surface.class, msgs);
            msgs = basicSetSurface(newSurface, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.DEPTH__SURFACE, newSurface, newSurface));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgPackage.DEPTH__NEXT, oldNext, next));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.DEPTH__NEXT, oldNext, next));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScgPackage.DEPTH__SURFACE:
                if (surface != null)
                    msgs = ((InternalEObject)surface).eInverseRemove(this, ScgPackage.SURFACE__DEPTH, Surface.class, msgs);
                return basicSetSurface((Surface)otherEnd, msgs);
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
            case ScgPackage.DEPTH__SURFACE:
                return basicSetSurface(null, msgs);
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
            case ScgPackage.DEPTH__SURFACE:
                if (resolve) return getSurface();
                return basicGetSurface();
            case ScgPackage.DEPTH__NEXT:
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
            case ScgPackage.DEPTH__SURFACE:
                setSurface((Surface)newValue);
                return;
            case ScgPackage.DEPTH__NEXT:
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
            case ScgPackage.DEPTH__SURFACE:
                setSurface((Surface)null);
                return;
            case ScgPackage.DEPTH__NEXT:
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
            case ScgPackage.DEPTH__SURFACE:
                return surface != null;
            case ScgPackage.DEPTH__NEXT:
                return next != null;
        }
        return super.eIsSet(featureID);
    }

} //DepthImpl
