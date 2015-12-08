/**
 */
package de.cau.cs.kieler.circuit.impl;

import de.cau.cs.kieler.circuit.CircuitPackage;
import de.cau.cs.kieler.circuit.Link;
import de.cau.cs.kieler.circuit.Linkable;

import de.cau.cs.kieler.core.annotations.impl.NamedObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.circuit.impl.LinkImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.cau.cs.kieler.circuit.impl.LinkImpl#getTarger <em>Targer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkImpl extends NamedObjectImpl implements Link {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Linkable source;

	/**
	 * The cached value of the '{@link #getTarger() <em>Targer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarger()
	 * @generated
	 * @ordered
	 */
	protected Linkable targer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircuitPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Linkable getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Linkable)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CircuitPackage.LINK__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Linkable basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Linkable newSource, NotificationChain msgs) {
		Linkable oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CircuitPackage.LINK__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Linkable newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, CircuitPackage.LINKABLE__OUTGOING_LINKS, Linkable.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, CircuitPackage.LINKABLE__OUTGOING_LINKS, Linkable.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuitPackage.LINK__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Linkable getTarger() {
		if (targer != null && targer.eIsProxy()) {
			InternalEObject oldTarger = (InternalEObject)targer;
			targer = (Linkable)eResolveProxy(oldTarger);
			if (targer != oldTarger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CircuitPackage.LINK__TARGER, oldTarger, targer));
			}
		}
		return targer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Linkable basicGetTarger() {
		return targer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarger(Linkable newTarger, NotificationChain msgs) {
		Linkable oldTarger = targer;
		targer = newTarger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CircuitPackage.LINK__TARGER, oldTarger, newTarger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarger(Linkable newTarger) {
		if (newTarger != targer) {
			NotificationChain msgs = null;
			if (targer != null)
				msgs = ((InternalEObject)targer).eInverseRemove(this, CircuitPackage.LINKABLE__INCOMING_LINKS, Linkable.class, msgs);
			if (newTarger != null)
				msgs = ((InternalEObject)newTarger).eInverseAdd(this, CircuitPackage.LINKABLE__INCOMING_LINKS, Linkable.class, msgs);
			msgs = basicSetTarger(newTarger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuitPackage.LINK__TARGER, newTarger, newTarger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CircuitPackage.LINK__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, CircuitPackage.LINKABLE__OUTGOING_LINKS, Linkable.class, msgs);
				return basicSetSource((Linkable)otherEnd, msgs);
			case CircuitPackage.LINK__TARGER:
				if (targer != null)
					msgs = ((InternalEObject)targer).eInverseRemove(this, CircuitPackage.LINKABLE__INCOMING_LINKS, Linkable.class, msgs);
				return basicSetTarger((Linkable)otherEnd, msgs);
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
			case CircuitPackage.LINK__SOURCE:
				return basicSetSource(null, msgs);
			case CircuitPackage.LINK__TARGER:
				return basicSetTarger(null, msgs);
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
			case CircuitPackage.LINK__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case CircuitPackage.LINK__TARGER:
				if (resolve) return getTarger();
				return basicGetTarger();
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
			case CircuitPackage.LINK__SOURCE:
				setSource((Linkable)newValue);
				return;
			case CircuitPackage.LINK__TARGER:
				setTarger((Linkable)newValue);
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
			case CircuitPackage.LINK__SOURCE:
				setSource((Linkable)null);
				return;
			case CircuitPackage.LINK__TARGER:
				setTarger((Linkable)null);
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
			case CircuitPackage.LINK__SOURCE:
				return source != null;
			case CircuitPackage.LINK__TARGER:
				return targer != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkImpl
