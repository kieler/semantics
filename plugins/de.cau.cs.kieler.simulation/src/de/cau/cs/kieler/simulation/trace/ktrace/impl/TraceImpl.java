/**
 */
package de.cau.cs.kieler.simulation.trace.ktrace.impl;

import de.cau.cs.kieler.annotations.impl.PragmatableImpl;

import de.cau.cs.kieler.simulation.trace.ktrace.KTracePackage;
import de.cau.cs.kieler.simulation.trace.ktrace.Tick;
import de.cau.cs.kieler.simulation.trace.ktrace.Trace;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.simulation.trace.ktrace.impl.TraceImpl#getTicks <em>Ticks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraceImpl extends PragmatableImpl implements Trace {
    /**
     * The cached value of the '{@link #getTicks() <em>Ticks</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTicks()
     * @generated
     * @ordered
     */
    protected EList<Tick> ticks;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TraceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KTracePackage.Literals.TRACE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Tick> getTicks() {
        if (ticks == null) {
            ticks = new EObjectContainmentEList<Tick>(Tick.class, this, KTracePackage.TRACE__TICKS);
        }
        return ticks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case KTracePackage.TRACE__TICKS:
                return ((InternalEList<?>)getTicks()).basicRemove(otherEnd, msgs);
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
            case KTracePackage.TRACE__TICKS:
                return getTicks();
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
            case KTracePackage.TRACE__TICKS:
                getTicks().clear();
                getTicks().addAll((Collection<? extends Tick>)newValue);
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
            case KTracePackage.TRACE__TICKS:
                getTicks().clear();
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
            case KTracePackage.TRACE__TICKS:
                return ticks != null && !ticks.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //TraceImpl
