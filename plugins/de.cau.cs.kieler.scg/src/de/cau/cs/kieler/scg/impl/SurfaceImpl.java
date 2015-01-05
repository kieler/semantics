/**
 */
package de.cau.cs.kieler.scg.impl;

import de.cau.cs.kieler.scg.Depth;
import de.cau.cs.kieler.scg.ScgPackage;
import de.cau.cs.kieler.scg.Surface;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Surface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.impl.SurfaceImpl#getDepth <em>Depth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SurfaceImpl extends NodeImpl implements Surface {
    /**
	 * The cached value of the '{@link #getDepth() <em>Depth</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
    protected Depth depth;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected SurfaceImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ScgPackage.Literals.SURFACE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Depth getDepth() {
		if (depth != null && depth.eIsProxy()) {
			InternalEObject oldDepth = (InternalEObject)depth;
			depth = (Depth)eResolveProxy(oldDepth);
			if (depth != oldDepth) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgPackage.SURFACE__DEPTH, oldDepth, depth));
			}
		}
		return depth;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Depth basicGetDepth() {
		return depth;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDepth(Depth newDepth, NotificationChain msgs) {
		Depth oldDepth = depth;
		depth = newDepth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScgPackage.SURFACE__DEPTH, oldDepth, newDepth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDepth(Depth newDepth) {
		if (newDepth != depth) {
			NotificationChain msgs = null;
			if (depth != null)
				msgs = ((InternalEObject)depth).eInverseRemove(this, ScgPackage.DEPTH__SURFACE, Depth.class, msgs);
			if (newDepth != null)
				msgs = ((InternalEObject)newDepth).eInverseAdd(this, ScgPackage.DEPTH__SURFACE, Depth.class, msgs);
			msgs = basicSetDepth(newDepth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.SURFACE__DEPTH, newDepth, newDepth));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScgPackage.SURFACE__DEPTH:
				if (depth != null)
					msgs = ((InternalEObject)depth).eInverseRemove(this, ScgPackage.DEPTH__SURFACE, Depth.class, msgs);
				return basicSetDepth((Depth)otherEnd, msgs);
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
			case ScgPackage.SURFACE__DEPTH:
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
			case ScgPackage.SURFACE__DEPTH:
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
			case ScgPackage.SURFACE__DEPTH:
				setDepth((Depth)newValue);
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
			case ScgPackage.SURFACE__DEPTH:
				setDepth((Depth)null);
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
			case ScgPackage.SURFACE__DEPTH:
				return depth != null;
		}
		return super.eIsSet(featureID);
	}

} //SurfaceImpl
