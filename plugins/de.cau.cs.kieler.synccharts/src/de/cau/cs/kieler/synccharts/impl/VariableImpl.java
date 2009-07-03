/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts.impl;

import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.ValuedObject;
import de.cau.cs.kieler.synccharts.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.VariableImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.VariableImpl#getParentState <em>Parent State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends ValuedObjectImpl implements Variable {
	/**
     * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
	protected EObject value;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected VariableImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SyncchartsPackage.Literals.VARIABLE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EObject getValue() {
        return value;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetValue(EObject newValue, NotificationChain msgs) {
        EObject oldValue = value;
        value = newValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SyncchartsPackage.VARIABLE__VALUE, oldValue, newValue);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setValue(EObject newValue) {
        if (newValue != value) {
            NotificationChain msgs = null;
            if (value != null)
                msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SyncchartsPackage.VARIABLE__VALUE, null, msgs);
            if (newValue != null)
                msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SyncchartsPackage.VARIABLE__VALUE, null, msgs);
            msgs = basicSetValue(newValue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.VARIABLE__VALUE, newValue, newValue));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public State getParentState() {
        if (eContainerFeatureID() != SyncchartsPackage.VARIABLE__PARENT_STATE) return null;
        return (State)eContainer();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetParentState(State newParentState, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentState, SyncchartsPackage.VARIABLE__PARENT_STATE, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setParentState(State newParentState) {
        if (newParentState != eInternalContainer() || (eContainerFeatureID() != SyncchartsPackage.VARIABLE__PARENT_STATE && newParentState != null)) {
            if (EcoreUtil.isAncestor(this, newParentState))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentState != null)
                msgs = ((InternalEObject)newParentState).eInverseAdd(this, SyncchartsPackage.STATE__VARIABLES, State.class, msgs);
            msgs = basicSetParentState(newParentState, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.VARIABLE__PARENT_STATE, newParentState, newParentState));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SyncchartsPackage.VARIABLE__PARENT_STATE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentState((State)otherEnd, msgs);
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
            case SyncchartsPackage.VARIABLE__VALUE:
                return basicSetValue(null, msgs);
            case SyncchartsPackage.VARIABLE__PARENT_STATE:
                return basicSetParentState(null, msgs);
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
            case SyncchartsPackage.VARIABLE__PARENT_STATE:
                return eInternalContainer().eInverseRemove(this, SyncchartsPackage.STATE__VARIABLES, State.class, msgs);
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
            case SyncchartsPackage.VARIABLE__VALUE:
                return getValue();
            case SyncchartsPackage.VARIABLE__PARENT_STATE:
                return getParentState();
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
            case SyncchartsPackage.VARIABLE__VALUE:
                setValue((EObject)newValue);
                return;
            case SyncchartsPackage.VARIABLE__PARENT_STATE:
                setParentState((State)newValue);
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
            case SyncchartsPackage.VARIABLE__VALUE:
                setValue((EObject)null);
                return;
            case SyncchartsPackage.VARIABLE__PARENT_STATE:
                setParentState((State)null);
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
            case SyncchartsPackage.VARIABLE__VALUE:
                return value != null;
            case SyncchartsPackage.VARIABLE__PARENT_STATE:
                return getParentState() != null;
        }
        return super.eIsSet(featureID);
    }

} //VariableImpl
