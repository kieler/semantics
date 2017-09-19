/**
 */
package de.cau.cs.kieler.simulation.trace.ktrace.impl;

import de.cau.cs.kieler.annotations.impl.AnnotatableImpl;

import de.cau.cs.kieler.kexpressions.keffects.Effect;

import de.cau.cs.kieler.simulation.trace.ktrace.KTracePackage;
import de.cau.cs.kieler.simulation.trace.ktrace.Tick;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tick</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.simulation.trace.ktrace.impl.TickImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simulation.trace.ktrace.impl.TickImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TickImpl extends AnnotatableImpl implements Tick {
    /**
     * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputs()
     * @generated
     * @ordered
     */
    protected EList<Effect> inputs;

    /**
     * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputs()
     * @generated
     * @ordered
     */
    protected EList<Effect> outputs;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TickImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KTracePackage.Literals.TICK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Effect> getInputs() {
        if (inputs == null) {
            inputs = new EObjectContainmentEList<Effect>(Effect.class, this, KTracePackage.TICK__INPUTS);
        }
        return inputs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Effect> getOutputs() {
        if (outputs == null) {
            outputs = new EObjectContainmentEList<Effect>(Effect.class, this, KTracePackage.TICK__OUTPUTS);
        }
        return outputs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case KTracePackage.TICK__INPUTS:
                return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
            case KTracePackage.TICK__OUTPUTS:
                return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
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
            case KTracePackage.TICK__INPUTS:
                return getInputs();
            case KTracePackage.TICK__OUTPUTS:
                return getOutputs();
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
            case KTracePackage.TICK__INPUTS:
                getInputs().clear();
                getInputs().addAll((Collection<? extends Effect>)newValue);
                return;
            case KTracePackage.TICK__OUTPUTS:
                getOutputs().clear();
                getOutputs().addAll((Collection<? extends Effect>)newValue);
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
            case KTracePackage.TICK__INPUTS:
                getInputs().clear();
                return;
            case KTracePackage.TICK__OUTPUTS:
                getOutputs().clear();
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
            case KTracePackage.TICK__INPUTS:
                return inputs != null && !inputs.isEmpty();
            case KTracePackage.TICK__OUTPUTS:
                return outputs != null && !outputs.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //TickImpl
