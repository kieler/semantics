/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts.impl;

import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.Emission;
import de.cau.cs.kieler.synccharts.Expression;
import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.EmissionImpl#getNewValue <em>New Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.EmissionImpl#getSignal <em>Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.EmissionImpl#getParentAction <em>Parent Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmissionImpl extends EObjectImpl implements Emission {
	/**
     * The cached value of the '{@link #getNewValue() <em>New Value</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getNewValue()
     * @generated
     * @ordered
     */
	protected Expression newValue;

	/**
     * The cached value of the '{@link #getSignal() <em>Signal</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSignal()
     * @generated
     * @ordered
     */
	protected Signal signal;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected EmissionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SyncchartsPackage.Literals.EMISSION;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Expression getNewValue() {
        return newValue;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetNewValue(Expression newNewValue, NotificationChain msgs) {
        Expression oldNewValue = newValue;
        newValue = newNewValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SyncchartsPackage.EMISSION__NEW_VALUE, oldNewValue, newNewValue);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setNewValue(Expression newNewValue) {
        if (newNewValue != newValue) {
            NotificationChain msgs = null;
            if (newValue != null)
                msgs = ((InternalEObject)newValue).eInverseRemove(this, SyncchartsPackage.EXPRESSION__PARENT_EMISSON, Expression.class, msgs);
            if (newNewValue != null)
                msgs = ((InternalEObject)newNewValue).eInverseAdd(this, SyncchartsPackage.EXPRESSION__PARENT_EMISSON, Expression.class, msgs);
            msgs = basicSetNewValue(newNewValue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.EMISSION__NEW_VALUE, newNewValue, newNewValue));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Signal getSignal() {
        if (signal != null && signal.eIsProxy()) {
            InternalEObject oldSignal = (InternalEObject)signal;
            signal = (Signal)eResolveProxy(oldSignal);
            if (signal != oldSignal) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SyncchartsPackage.EMISSION__SIGNAL, oldSignal, signal));
            }
        }
        return signal;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Signal basicGetSignal() {
        return signal;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSignal(Signal newSignal) {
        Signal oldSignal = signal;
        signal = newSignal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.EMISSION__SIGNAL, oldSignal, signal));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Action getParentAction() {
        if (eContainerFeatureID() != SyncchartsPackage.EMISSION__PARENT_ACTION) return null;
        return (Action)eContainer();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetParentAction(Action newParentAction, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentAction, SyncchartsPackage.EMISSION__PARENT_ACTION, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setParentAction(Action newParentAction) {
        if (newParentAction != eInternalContainer() || (eContainerFeatureID() != SyncchartsPackage.EMISSION__PARENT_ACTION && newParentAction != null)) {
            if (EcoreUtil.isAncestor(this, newParentAction))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentAction != null)
                msgs = ((InternalEObject)newParentAction).eInverseAdd(this, SyncchartsPackage.ACTION__EMISSIONS, Action.class, msgs);
            msgs = basicSetParentAction(newParentAction, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.EMISSION__PARENT_ACTION, newParentAction, newParentAction));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SyncchartsPackage.EMISSION__NEW_VALUE:
                if (newValue != null)
                    msgs = ((InternalEObject)newValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SyncchartsPackage.EMISSION__NEW_VALUE, null, msgs);
                return basicSetNewValue((Expression)otherEnd, msgs);
            case SyncchartsPackage.EMISSION__PARENT_ACTION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentAction((Action)otherEnd, msgs);
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
            case SyncchartsPackage.EMISSION__NEW_VALUE:
                return basicSetNewValue(null, msgs);
            case SyncchartsPackage.EMISSION__PARENT_ACTION:
                return basicSetParentAction(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case SyncchartsPackage.EMISSION__PARENT_ACTION:
                return eInternalContainer().eInverseRemove(this, SyncchartsPackage.ACTION__EMISSIONS, Action.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SyncchartsPackage.EMISSION__NEW_VALUE:
                return getNewValue();
            case SyncchartsPackage.EMISSION__SIGNAL:
                if (resolve) return getSignal();
                return basicGetSignal();
            case SyncchartsPackage.EMISSION__PARENT_ACTION:
                return getParentAction();
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
            case SyncchartsPackage.EMISSION__NEW_VALUE:
                setNewValue((Expression)newValue);
                return;
            case SyncchartsPackage.EMISSION__SIGNAL:
                setSignal((Signal)newValue);
                return;
            case SyncchartsPackage.EMISSION__PARENT_ACTION:
                setParentAction((Action)newValue);
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
            case SyncchartsPackage.EMISSION__NEW_VALUE:
                setNewValue((Expression)null);
                return;
            case SyncchartsPackage.EMISSION__SIGNAL:
                setSignal((Signal)null);
                return;
            case SyncchartsPackage.EMISSION__PARENT_ACTION:
                setParentAction((Action)null);
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
            case SyncchartsPackage.EMISSION__NEW_VALUE:
                return newValue != null;
            case SyncchartsPackage.EMISSION__SIGNAL:
                return signal != null;
            case SyncchartsPackage.EMISSION__PARENT_ACTION:
                return getParentAction() != null;
        }
        return super.eIsSet(featureID);
    }

} //EmissionImpl
