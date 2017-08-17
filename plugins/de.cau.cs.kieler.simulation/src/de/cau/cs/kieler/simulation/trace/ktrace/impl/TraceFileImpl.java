/**
 */
package de.cau.cs.kieler.simulation.trace.ktrace.impl;

import de.cau.cs.kieler.annotations.impl.PragmatableImpl;

import de.cau.cs.kieler.kexpressions.ValuedObject;

import de.cau.cs.kieler.simulation.trace.ktrace.KTracePackage;
import de.cau.cs.kieler.simulation.trace.ktrace.Trace;
import de.cau.cs.kieler.simulation.trace.ktrace.TraceFile;

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
 * An implementation of the model object '<em><b>Trace File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.simulation.trace.ktrace.impl.TraceFileImpl#getTraces <em>Traces</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simulation.trace.ktrace.impl.TraceFileImpl#getAggregatedValuedObjects <em>Aggregated Valued Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraceFileImpl extends PragmatableImpl implements TraceFile {
    /**
     * The cached value of the '{@link #getTraces() <em>Traces</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTraces()
     * @generated
     * @ordered
     */
    protected EList<Trace> traces;

    /**
     * The cached value of the '{@link #getAggregatedValuedObjects() <em>Aggregated Valued Objects</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAggregatedValuedObjects()
     * @generated
     * @ordered
     */
    protected EList<ValuedObject> aggregatedValuedObjects;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TraceFileImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KTracePackage.Literals.TRACE_FILE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Trace> getTraces() {
        if (traces == null) {
            traces = new EObjectContainmentEList<Trace>(Trace.class, this, KTracePackage.TRACE_FILE__TRACES);
        }
        return traces;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ValuedObject> getAggregatedValuedObjects() {
        if (aggregatedValuedObjects == null) {
            aggregatedValuedObjects = new EObjectContainmentEList<ValuedObject>(ValuedObject.class, this, KTracePackage.TRACE_FILE__AGGREGATED_VALUED_OBJECTS);
        }
        return aggregatedValuedObjects;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case KTracePackage.TRACE_FILE__TRACES:
                return ((InternalEList<?>)getTraces()).basicRemove(otherEnd, msgs);
            case KTracePackage.TRACE_FILE__AGGREGATED_VALUED_OBJECTS:
                return ((InternalEList<?>)getAggregatedValuedObjects()).basicRemove(otherEnd, msgs);
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
            case KTracePackage.TRACE_FILE__TRACES:
                return getTraces();
            case KTracePackage.TRACE_FILE__AGGREGATED_VALUED_OBJECTS:
                return getAggregatedValuedObjects();
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
            case KTracePackage.TRACE_FILE__TRACES:
                getTraces().clear();
                getTraces().addAll((Collection<? extends Trace>)newValue);
                return;
            case KTracePackage.TRACE_FILE__AGGREGATED_VALUED_OBJECTS:
                getAggregatedValuedObjects().clear();
                getAggregatedValuedObjects().addAll((Collection<? extends ValuedObject>)newValue);
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
            case KTracePackage.TRACE_FILE__TRACES:
                getTraces().clear();
                return;
            case KTracePackage.TRACE_FILE__AGGREGATED_VALUED_OBJECTS:
                getAggregatedValuedObjects().clear();
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
            case KTracePackage.TRACE_FILE__TRACES:
                return traces != null && !traces.isEmpty();
            case KTracePackage.TRACE_FILE__AGGREGATED_VALUED_OBJECTS:
                return aggregatedValuedObjects != null && !aggregatedValuedObjects.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //TraceFileImpl
