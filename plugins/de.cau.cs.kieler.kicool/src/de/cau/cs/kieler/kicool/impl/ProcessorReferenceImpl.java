/**
 */
package de.cau.cs.kieler.kicool.impl;

import de.cau.cs.kieler.kicool.IntermediateReference;
import de.cau.cs.kieler.kicool.KVPair;
import de.cau.cs.kieler.kicool.KiCoolPackage;
import de.cau.cs.kieler.kicool.ProcessorReference;

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
 * An implementation of the model object '<em><b>Processor Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.ProcessorReferenceImpl#getPresets <em>Presets</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.ProcessorReferenceImpl#getPostsets <em>Postsets</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kicool.impl.ProcessorReferenceImpl#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessorReferenceImpl extends ProcessorEntryImpl implements ProcessorReference {
    /**
     * The cached value of the '{@link #getPresets() <em>Presets</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPresets()
     * @generated
     * @ordered
     */
    protected EList<KVPair> presets;

    /**
     * The cached value of the '{@link #getPostsets() <em>Postsets</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPostsets()
     * @generated
     * @ordered
     */
    protected EList<KVPair> postsets;

    /**
     * The cached value of the '{@link #getMetric() <em>Metric</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMetric()
     * @generated
     * @ordered
     */
    protected IntermediateReference metric;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProcessorReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KiCoolPackage.Literals.PROCESSOR_REFERENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<KVPair> getPresets() {
        if (presets == null) {
            presets = new EObjectContainmentEList<KVPair>(KVPair.class, this, KiCoolPackage.PROCESSOR_REFERENCE__PRESETS);
        }
        return presets;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<KVPair> getPostsets() {
        if (postsets == null) {
            postsets = new EObjectContainmentEList<KVPair>(KVPair.class, this, KiCoolPackage.PROCESSOR_REFERENCE__POSTSETS);
        }
        return postsets;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IntermediateReference getMetric() {
        if (metric != null && metric.eIsProxy()) {
            InternalEObject oldMetric = (InternalEObject)metric;
            metric = (IntermediateReference)eResolveProxy(oldMetric);
            if (metric != oldMetric) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, KiCoolPackage.PROCESSOR_REFERENCE__METRIC, oldMetric, metric));
            }
        }
        return metric;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IntermediateReference basicGetMetric() {
        return metric;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMetric(IntermediateReference newMetric) {
        IntermediateReference oldMetric = metric;
        metric = newMetric;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KiCoolPackage.PROCESSOR_REFERENCE__METRIC, oldMetric, metric));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case KiCoolPackage.PROCESSOR_REFERENCE__PRESETS:
                return ((InternalEList<?>)getPresets()).basicRemove(otherEnd, msgs);
            case KiCoolPackage.PROCESSOR_REFERENCE__POSTSETS:
                return ((InternalEList<?>)getPostsets()).basicRemove(otherEnd, msgs);
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
            case KiCoolPackage.PROCESSOR_REFERENCE__PRESETS:
                return getPresets();
            case KiCoolPackage.PROCESSOR_REFERENCE__POSTSETS:
                return getPostsets();
            case KiCoolPackage.PROCESSOR_REFERENCE__METRIC:
                if (resolve) return getMetric();
                return basicGetMetric();
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
            case KiCoolPackage.PROCESSOR_REFERENCE__PRESETS:
                getPresets().clear();
                getPresets().addAll((Collection<? extends KVPair>)newValue);
                return;
            case KiCoolPackage.PROCESSOR_REFERENCE__POSTSETS:
                getPostsets().clear();
                getPostsets().addAll((Collection<? extends KVPair>)newValue);
                return;
            case KiCoolPackage.PROCESSOR_REFERENCE__METRIC:
                setMetric((IntermediateReference)newValue);
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
            case KiCoolPackage.PROCESSOR_REFERENCE__PRESETS:
                getPresets().clear();
                return;
            case KiCoolPackage.PROCESSOR_REFERENCE__POSTSETS:
                getPostsets().clear();
                return;
            case KiCoolPackage.PROCESSOR_REFERENCE__METRIC:
                setMetric((IntermediateReference)null);
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
            case KiCoolPackage.PROCESSOR_REFERENCE__PRESETS:
                return presets != null && !presets.isEmpty();
            case KiCoolPackage.PROCESSOR_REFERENCE__POSTSETS:
                return postsets != null && !postsets.isEmpty();
            case KiCoolPackage.PROCESSOR_REFERENCE__METRIC:
                return metric != null;
        }
        return super.eIsSet(featureID);
    }

} //ProcessorReferenceImpl
