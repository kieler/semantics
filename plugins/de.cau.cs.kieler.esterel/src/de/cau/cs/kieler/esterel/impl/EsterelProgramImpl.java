/**
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.annotations.impl.PragmatableImpl;

import de.cau.cs.kieler.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.EsterelProgram;

import de.cau.cs.kieler.kexpressions.ValuedObject;

import de.cau.cs.kieler.scl.Module;

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
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.EsterelProgramImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.EsterelProgramImpl#getTick <em>Tick</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EsterelProgramImpl extends PragmatableImpl implements EsterelProgram {
    /**
     * The cached value of the '{@link #getModules() <em>Modules</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModules()
     * @generated
     * @ordered
     */
    protected EList<Module> modules;

    /**
     * The cached value of the '{@link #getTick() <em>Tick</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTick()
     * @generated
     * @ordered
     */
    protected ValuedObject tick;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EsterelProgramImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EsterelPackage.Literals.ESTEREL_PROGRAM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Module> getModules() {
        if (modules == null) {
            modules = new EObjectContainmentEList<Module>(Module.class, this, EsterelPackage.ESTEREL_PROGRAM__MODULES);
        }
        return modules;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValuedObject getTick() {
        return tick;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTick(ValuedObject newTick, NotificationChain msgs) {
        ValuedObject oldTick = tick;
        tick = newTick;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.ESTEREL_PROGRAM__TICK, oldTick, newTick);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTick(ValuedObject newTick) {
        if (newTick != tick) {
            NotificationChain msgs = null;
            if (tick != null)
                msgs = ((InternalEObject)tick).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.ESTEREL_PROGRAM__TICK, null, msgs);
            if (newTick != null)
                msgs = ((InternalEObject)newTick).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.ESTEREL_PROGRAM__TICK, null, msgs);
            msgs = basicSetTick(newTick, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.ESTEREL_PROGRAM__TICK, newTick, newTick));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EsterelPackage.ESTEREL_PROGRAM__MODULES:
                return ((InternalEList<?>)getModules()).basicRemove(otherEnd, msgs);
            case EsterelPackage.ESTEREL_PROGRAM__TICK:
                return basicSetTick(null, msgs);
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
            case EsterelPackage.ESTEREL_PROGRAM__MODULES:
                return getModules();
            case EsterelPackage.ESTEREL_PROGRAM__TICK:
                return getTick();
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
            case EsterelPackage.ESTEREL_PROGRAM__MODULES:
                getModules().clear();
                getModules().addAll((Collection<? extends Module>)newValue);
                return;
            case EsterelPackage.ESTEREL_PROGRAM__TICK:
                setTick((ValuedObject)newValue);
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
            case EsterelPackage.ESTEREL_PROGRAM__MODULES:
                getModules().clear();
                return;
            case EsterelPackage.ESTEREL_PROGRAM__TICK:
                setTick((ValuedObject)null);
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
            case EsterelPackage.ESTEREL_PROGRAM__MODULES:
                return modules != null && !modules.isEmpty();
            case EsterelPackage.ESTEREL_PROGRAM__TICK:
                return tick != null;
        }
        return super.eIsSet(featureID);
    }

} //EsterelProgramImpl
