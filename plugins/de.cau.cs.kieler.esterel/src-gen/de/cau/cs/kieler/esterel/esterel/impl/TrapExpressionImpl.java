/**
 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.ISignal;
import de.cau.cs.kieler.esterel.esterel.TrapExpression;

import de.cau.cs.kieler.kexpressions.ScheduleObjectReference;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trap Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.TrapExpressionImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.TrapExpressionImpl#getTrap <em>Trap</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrapExpressionImpl extends MinimalEObjectImpl.Container implements TrapExpression {
    /**
     * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSchedule()
     * @generated
     * @ordered
     */
    protected EList<ScheduleObjectReference> schedule;

    /**
     * The cached value of the '{@link #getTrap() <em>Trap</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrap()
     * @generated
     * @ordered
     */
    protected ISignal trap;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TrapExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EsterelPackage.Literals.TRAP_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ScheduleObjectReference> getSchedule() {
        if (schedule == null) {
            schedule = new EObjectContainmentEList<ScheduleObjectReference>(ScheduleObjectReference.class, this, EsterelPackage.TRAP_EXPRESSION__SCHEDULE);
        }
        return schedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISignal getTrap() {
        if (trap != null && trap.eIsProxy()) {
            InternalEObject oldTrap = (InternalEObject)trap;
            trap = (ISignal)eResolveProxy(oldTrap);
            if (trap != oldTrap) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.TRAP_EXPRESSION__TRAP, oldTrap, trap));
            }
        }
        return trap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISignal basicGetTrap() {
        return trap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTrap(ISignal newTrap) {
        ISignal oldTrap = trap;
        trap = newTrap;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.TRAP_EXPRESSION__TRAP, oldTrap, trap));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EsterelPackage.TRAP_EXPRESSION__SCHEDULE:
                return ((InternalEList<?>)getSchedule()).basicRemove(otherEnd, msgs);
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
            case EsterelPackage.TRAP_EXPRESSION__SCHEDULE:
                return getSchedule();
            case EsterelPackage.TRAP_EXPRESSION__TRAP:
                if (resolve) return getTrap();
                return basicGetTrap();
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
            case EsterelPackage.TRAP_EXPRESSION__SCHEDULE:
                getSchedule().clear();
                getSchedule().addAll((Collection<? extends ScheduleObjectReference>)newValue);
                return;
            case EsterelPackage.TRAP_EXPRESSION__TRAP:
                setTrap((ISignal)newValue);
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
            case EsterelPackage.TRAP_EXPRESSION__SCHEDULE:
                getSchedule().clear();
                return;
            case EsterelPackage.TRAP_EXPRESSION__TRAP:
                setTrap((ISignal)null);
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
            case EsterelPackage.TRAP_EXPRESSION__SCHEDULE:
                return schedule != null && !schedule.isEmpty();
            case EsterelPackage.TRAP_EXPRESSION__TRAP:
                return trap != null;
        }
        return super.eIsSet(featureID);
    }

} //TrapExpressionImpl
