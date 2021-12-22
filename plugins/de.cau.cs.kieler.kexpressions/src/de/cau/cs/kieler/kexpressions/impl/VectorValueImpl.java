/**
 */
package de.cau.cs.kieler.kexpressions.impl;

import de.cau.cs.kieler.kexpressions.Expression;
import de.cau.cs.kieler.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.kexpressions.ScheduleObjectReference;
import de.cau.cs.kieler.kexpressions.VectorValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vector Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.VectorValueImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.VectorValueImpl#getValues <em>Values</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.VectorValueImpl#isRange <em>Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VectorValueImpl extends EObjectImpl implements VectorValue {
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
     * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValues()
     * @generated
     * @ordered
     */
    protected EList<Expression> values;

    /**
     * The default value of the '{@link #isRange() <em>Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRange()
     * @generated
     * @ordered
     */
    protected static final boolean RANGE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isRange() <em>Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRange()
     * @generated
     * @ordered
     */
    protected boolean range = RANGE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VectorValueImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KExpressionsPackage.Literals.VECTOR_VALUE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ScheduleObjectReference> getSchedule() {
        if (schedule == null) {
            schedule = new EObjectContainmentEList<ScheduleObjectReference>(ScheduleObjectReference.class, this, KExpressionsPackage.VECTOR_VALUE__SCHEDULE);
        }
        return schedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Expression> getValues() {
        if (values == null) {
            values = new EObjectContainmentEList<Expression>(Expression.class, this, KExpressionsPackage.VECTOR_VALUE__VALUES);
        }
        return values;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isRange() {
        return range;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRange(boolean newRange) {
        boolean oldRange = range;
        range = newRange;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.VECTOR_VALUE__RANGE, oldRange, range));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case KExpressionsPackage.VECTOR_VALUE__SCHEDULE:
                return ((InternalEList<?>)getSchedule()).basicRemove(otherEnd, msgs);
            case KExpressionsPackage.VECTOR_VALUE__VALUES:
                return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
            case KExpressionsPackage.VECTOR_VALUE__SCHEDULE:
                return getSchedule();
            case KExpressionsPackage.VECTOR_VALUE__VALUES:
                return getValues();
            case KExpressionsPackage.VECTOR_VALUE__RANGE:
                return isRange();
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
            case KExpressionsPackage.VECTOR_VALUE__SCHEDULE:
                getSchedule().clear();
                getSchedule().addAll((Collection<? extends ScheduleObjectReference>)newValue);
                return;
            case KExpressionsPackage.VECTOR_VALUE__VALUES:
                getValues().clear();
                getValues().addAll((Collection<? extends Expression>)newValue);
                return;
            case KExpressionsPackage.VECTOR_VALUE__RANGE:
                setRange((Boolean)newValue);
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
            case KExpressionsPackage.VECTOR_VALUE__SCHEDULE:
                getSchedule().clear();
                return;
            case KExpressionsPackage.VECTOR_VALUE__VALUES:
                getValues().clear();
                return;
            case KExpressionsPackage.VECTOR_VALUE__RANGE:
                setRange(RANGE_EDEFAULT);
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
            case KExpressionsPackage.VECTOR_VALUE__SCHEDULE:
                return schedule != null && !schedule.isEmpty();
            case KExpressionsPackage.VECTOR_VALUE__VALUES:
                return values != null && !values.isEmpty();
            case KExpressionsPackage.VECTOR_VALUE__RANGE:
                return range != RANGE_EDEFAULT;
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

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (range: ");
        result.append(range);
        result.append(')');
        return result.toString();
    }

} //VectorValueImpl
