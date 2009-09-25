/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts.impl;

import de.cau.cs.kieler.synccharts.CombineOperator;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.SignalImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.SignalImpl#getParentState <em>Parent State</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.SignalImpl#isIsInput <em>Is Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.SignalImpl#isIsOutput <em>Is Output</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.SignalImpl#getCombineOperator <em>Combine Operator</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.SignalImpl#getHostCombineOperator <em>Host Combine Operator</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.impl.SignalImpl#getParentRegion <em>Parent Region</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignalImpl extends ValuedObjectImpl implements Signal {
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
     * The default value of the '{@link #isIsInput() <em>Is Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsInput()
     * @generated
     * @ordered
     */
    protected static final boolean IS_INPUT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsInput() <em>Is Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsInput()
     * @generated
     * @ordered
     */
    protected boolean isInput = IS_INPUT_EDEFAULT;

    /**
     * The default value of the '{@link #isIsOutput() <em>Is Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsOutput()
     * @generated
     * @ordered
     */
    protected static final boolean IS_OUTPUT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsOutput() <em>Is Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsOutput()
     * @generated
     * @ordered
     */
    protected boolean isOutput = IS_OUTPUT_EDEFAULT;

    /**
     * The default value of the '{@link #getCombineOperator() <em>Combine Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCombineOperator()
     * @generated
     * @ordered
     */
    protected static final CombineOperator COMBINE_OPERATOR_EDEFAULT = CombineOperator.NONE;

    /**
     * The cached value of the '{@link #getCombineOperator() <em>Combine Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCombineOperator()
     * @generated
     * @ordered
     */
    protected CombineOperator combineOperator = COMBINE_OPERATOR_EDEFAULT;

    /**
     * The default value of the '{@link #getHostCombineOperator() <em>Host Combine Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHostCombineOperator()
     * @generated
     * @ordered
     */
    protected static final String HOST_COMBINE_OPERATOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHostCombineOperator() <em>Host Combine Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHostCombineOperator()
     * @generated
     * @ordered
     */
    protected String hostCombineOperator = HOST_COMBINE_OPERATOR_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SignalImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SyncchartsPackage.Literals.SIGNAL;
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SyncchartsPackage.SIGNAL__VALUE, oldValue, newValue);
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
                msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SyncchartsPackage.SIGNAL__VALUE, null, msgs);
            if (newValue != null)
                msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SyncchartsPackage.SIGNAL__VALUE, null, msgs);
            msgs = basicSetValue(newValue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.SIGNAL__VALUE, newValue, newValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public State getParentState() {
        if (eContainerFeatureID() != SyncchartsPackage.SIGNAL__PARENT_STATE) return null;
        return (State)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentState(State newParentState, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentState, SyncchartsPackage.SIGNAL__PARENT_STATE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentState(State newParentState) {
        if (newParentState != eInternalContainer() || (eContainerFeatureID() != SyncchartsPackage.SIGNAL__PARENT_STATE && newParentState != null)) {
            if (EcoreUtil.isAncestor(this, newParentState))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentState != null)
                msgs = ((InternalEObject)newParentState).eInverseAdd(this, SyncchartsPackage.STATE__SIGNALS, State.class, msgs);
            msgs = basicSetParentState(newParentState, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.SIGNAL__PARENT_STATE, newParentState, newParentState));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsInput() {
        return isInput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsInput(boolean newIsInput) {
        boolean oldIsInput = isInput;
        isInput = newIsInput;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.SIGNAL__IS_INPUT, oldIsInput, isInput));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsOutput() {
        return isOutput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsOutput(boolean newIsOutput) {
        boolean oldIsOutput = isOutput;
        isOutput = newIsOutput;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.SIGNAL__IS_OUTPUT, oldIsOutput, isOutput));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CombineOperator getCombineOperator() {
        return combineOperator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCombineOperator(CombineOperator newCombineOperator) {
        CombineOperator oldCombineOperator = combineOperator;
        combineOperator = newCombineOperator == null ? COMBINE_OPERATOR_EDEFAULT : newCombineOperator;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.SIGNAL__COMBINE_OPERATOR, oldCombineOperator, combineOperator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getHostCombineOperator() {
        return hostCombineOperator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHostCombineOperator(String newHostCombineOperator) {
        String oldHostCombineOperator = hostCombineOperator;
        hostCombineOperator = newHostCombineOperator;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.SIGNAL__HOST_COMBINE_OPERATOR, oldHostCombineOperator, hostCombineOperator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Region getParentRegion() {
        if (eContainerFeatureID() != SyncchartsPackage.SIGNAL__PARENT_REGION) return null;
        return (Region)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentRegion(Region newParentRegion, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentRegion, SyncchartsPackage.SIGNAL__PARENT_REGION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentRegion(Region newParentRegion) {
        if (newParentRegion != eInternalContainer() || (eContainerFeatureID() != SyncchartsPackage.SIGNAL__PARENT_REGION && newParentRegion != null)) {
            if (EcoreUtil.isAncestor(this, newParentRegion))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentRegion != null)
                msgs = ((InternalEObject)newParentRegion).eInverseAdd(this, SyncchartsPackage.REGION__SIGNALS, Region.class, msgs);
            msgs = basicSetParentRegion(newParentRegion, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SyncchartsPackage.SIGNAL__PARENT_REGION, newParentRegion, newParentRegion));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SyncchartsPackage.SIGNAL__PARENT_STATE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentState((State)otherEnd, msgs);
            case SyncchartsPackage.SIGNAL__PARENT_REGION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentRegion((Region)otherEnd, msgs);
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
            case SyncchartsPackage.SIGNAL__VALUE:
                return basicSetValue(null, msgs);
            case SyncchartsPackage.SIGNAL__PARENT_STATE:
                return basicSetParentState(null, msgs);
            case SyncchartsPackage.SIGNAL__PARENT_REGION:
                return basicSetParentRegion(null, msgs);
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
            case SyncchartsPackage.SIGNAL__PARENT_STATE:
                return eInternalContainer().eInverseRemove(this, SyncchartsPackage.STATE__SIGNALS, State.class, msgs);
            case SyncchartsPackage.SIGNAL__PARENT_REGION:
                return eInternalContainer().eInverseRemove(this, SyncchartsPackage.REGION__SIGNALS, Region.class, msgs);
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
            case SyncchartsPackage.SIGNAL__VALUE:
                return getValue();
            case SyncchartsPackage.SIGNAL__PARENT_STATE:
                return getParentState();
            case SyncchartsPackage.SIGNAL__IS_INPUT:
                return isIsInput();
            case SyncchartsPackage.SIGNAL__IS_OUTPUT:
                return isIsOutput();
            case SyncchartsPackage.SIGNAL__COMBINE_OPERATOR:
                return getCombineOperator();
            case SyncchartsPackage.SIGNAL__HOST_COMBINE_OPERATOR:
                return getHostCombineOperator();
            case SyncchartsPackage.SIGNAL__PARENT_REGION:
                return getParentRegion();
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
            case SyncchartsPackage.SIGNAL__VALUE:
                setValue((EObject)newValue);
                return;
            case SyncchartsPackage.SIGNAL__PARENT_STATE:
                setParentState((State)newValue);
                return;
            case SyncchartsPackage.SIGNAL__IS_INPUT:
                setIsInput((Boolean)newValue);
                return;
            case SyncchartsPackage.SIGNAL__IS_OUTPUT:
                setIsOutput((Boolean)newValue);
                return;
            case SyncchartsPackage.SIGNAL__COMBINE_OPERATOR:
                setCombineOperator((CombineOperator)newValue);
                return;
            case SyncchartsPackage.SIGNAL__HOST_COMBINE_OPERATOR:
                setHostCombineOperator((String)newValue);
                return;
            case SyncchartsPackage.SIGNAL__PARENT_REGION:
                setParentRegion((Region)newValue);
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
            case SyncchartsPackage.SIGNAL__VALUE:
                setValue((EObject)null);
                return;
            case SyncchartsPackage.SIGNAL__PARENT_STATE:
                setParentState((State)null);
                return;
            case SyncchartsPackage.SIGNAL__IS_INPUT:
                setIsInput(IS_INPUT_EDEFAULT);
                return;
            case SyncchartsPackage.SIGNAL__IS_OUTPUT:
                setIsOutput(IS_OUTPUT_EDEFAULT);
                return;
            case SyncchartsPackage.SIGNAL__COMBINE_OPERATOR:
                setCombineOperator(COMBINE_OPERATOR_EDEFAULT);
                return;
            case SyncchartsPackage.SIGNAL__HOST_COMBINE_OPERATOR:
                setHostCombineOperator(HOST_COMBINE_OPERATOR_EDEFAULT);
                return;
            case SyncchartsPackage.SIGNAL__PARENT_REGION:
                setParentRegion((Region)null);
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
            case SyncchartsPackage.SIGNAL__VALUE:
                return value != null;
            case SyncchartsPackage.SIGNAL__PARENT_STATE:
                return getParentState() != null;
            case SyncchartsPackage.SIGNAL__IS_INPUT:
                return isInput != IS_INPUT_EDEFAULT;
            case SyncchartsPackage.SIGNAL__IS_OUTPUT:
                return isOutput != IS_OUTPUT_EDEFAULT;
            case SyncchartsPackage.SIGNAL__COMBINE_OPERATOR:
                return combineOperator != COMBINE_OPERATOR_EDEFAULT;
            case SyncchartsPackage.SIGNAL__HOST_COMBINE_OPERATOR:
                return HOST_COMBINE_OPERATOR_EDEFAULT == null ? hostCombineOperator != null : !HOST_COMBINE_OPERATOR_EDEFAULT.equals(hostCombineOperator);
            case SyncchartsPackage.SIGNAL__PARENT_REGION:
                return getParentRegion() != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (isInput: ");
        result.append(isInput);
        result.append(", isOutput: ");
        result.append(isOutput);
        result.append(", combineOperator: ");
        result.append(combineOperator);
        result.append(", hostCombineOperator: ");
        result.append(hostCombineOperator);
        result.append(')');
        return result.toString();
    }

} //SignalImpl
