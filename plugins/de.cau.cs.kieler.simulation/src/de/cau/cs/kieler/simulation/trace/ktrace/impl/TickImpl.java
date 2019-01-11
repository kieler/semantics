/**
 */
package de.cau.cs.kieler.simulation.trace.ktrace.impl;

import de.cau.cs.kieler.annotations.AnnotationsPackage;
import de.cau.cs.kieler.annotations.Nameable;
import de.cau.cs.kieler.annotations.NamedObject;
import de.cau.cs.kieler.annotations.impl.AnnotatableImpl;

import de.cau.cs.kieler.kexpressions.keffects.Effect;

import de.cau.cs.kieler.simulation.trace.ktrace.KTracePackage;
import de.cau.cs.kieler.simulation.trace.ktrace.Tick;

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
 * An implementation of the model object '<em><b>Tick</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.simulation.trace.ktrace.impl.TickImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simulation.trace.ktrace.impl.TickImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simulation.trace.ktrace.impl.TickImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simulation.trace.ktrace.impl.TickImpl#getGoto <em>Goto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TickImpl extends AnnotatableImpl implements Tick {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

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
     * The cached value of the '{@link #getGoto() <em>Goto</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGoto()
     * @generated
     * @ordered
     */
    protected Tick goto_;

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
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KTracePackage.TICK__NAME, oldName, name));
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
    public Tick getGoto() {
        if (goto_ != null && goto_.eIsProxy()) {
            InternalEObject oldGoto = (InternalEObject)goto_;
            goto_ = (Tick)eResolveProxy(oldGoto);
            if (goto_ != oldGoto) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, KTracePackage.TICK__GOTO, oldGoto, goto_));
            }
        }
        return goto_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Tick basicGetGoto() {
        return goto_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGoto(Tick newGoto) {
        Tick oldGoto = goto_;
        goto_ = newGoto;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KTracePackage.TICK__GOTO, oldGoto, goto_));
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
            case KTracePackage.TICK__NAME:
                return getName();
            case KTracePackage.TICK__INPUTS:
                return getInputs();
            case KTracePackage.TICK__OUTPUTS:
                return getOutputs();
            case KTracePackage.TICK__GOTO:
                if (resolve) return getGoto();
                return basicGetGoto();
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
            case KTracePackage.TICK__NAME:
                setName((String)newValue);
                return;
            case KTracePackage.TICK__INPUTS:
                getInputs().clear();
                getInputs().addAll((Collection<? extends Effect>)newValue);
                return;
            case KTracePackage.TICK__OUTPUTS:
                getOutputs().clear();
                getOutputs().addAll((Collection<? extends Effect>)newValue);
                return;
            case KTracePackage.TICK__GOTO:
                setGoto((Tick)newValue);
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
            case KTracePackage.TICK__NAME:
                setName(NAME_EDEFAULT);
                return;
            case KTracePackage.TICK__INPUTS:
                getInputs().clear();
                return;
            case KTracePackage.TICK__OUTPUTS:
                getOutputs().clear();
                return;
            case KTracePackage.TICK__GOTO:
                setGoto((Tick)null);
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
            case KTracePackage.TICK__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case KTracePackage.TICK__INPUTS:
                return inputs != null && !inputs.isEmpty();
            case KTracePackage.TICK__OUTPUTS:
                return outputs != null && !outputs.isEmpty();
            case KTracePackage.TICK__GOTO:
                return goto_ != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == Nameable.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == NamedObject.class) {
            switch (derivedFeatureID) {
                case KTracePackage.TICK__NAME: return AnnotationsPackage.NAMED_OBJECT__NAME;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == Nameable.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == NamedObject.class) {
            switch (baseFeatureID) {
                case AnnotationsPackage.NAMED_OBJECT__NAME: return KTracePackage.TICK__NAME;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //TickImpl
