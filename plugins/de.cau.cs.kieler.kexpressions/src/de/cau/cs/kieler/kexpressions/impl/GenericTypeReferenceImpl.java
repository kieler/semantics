/**
 */
package de.cau.cs.kieler.kexpressions.impl;

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

import de.cau.cs.kieler.annotations.NamedObject;
import de.cau.cs.kieler.kexpressions.GenericTypeReference;
import de.cau.cs.kieler.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.kexpressions.Parameter;
import de.cau.cs.kieler.kexpressions.ScheduleObjectReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.GenericTypeReferenceImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.GenericTypeReferenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.GenericTypeReferenceImpl#getGenericParameters <em>Generic Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericTypeReferenceImpl extends EObjectImpl implements GenericTypeReference {
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
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected NamedObject type;

    /**
     * The cached value of the '{@link #getGenericParameters() <em>Generic Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenericParameters()
     * @generated
     * @ordered
     */
    protected EList<Parameter> genericParameters;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GenericTypeReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KExpressionsPackage.Literals.GENERIC_TYPE_REFERENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ScheduleObjectReference> getSchedule() {
        if (schedule == null) {
            schedule = new EObjectContainmentEList<ScheduleObjectReference>(ScheduleObjectReference.class, this, KExpressionsPackage.GENERIC_TYPE_REFERENCE__SCHEDULE);
        }
        return schedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NamedObject getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (NamedObject)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, KExpressionsPackage.GENERIC_TYPE_REFERENCE__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NamedObject basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType(NamedObject newType) {
        NamedObject oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.GENERIC_TYPE_REFERENCE__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Parameter> getGenericParameters() {
        if (genericParameters == null) {
            genericParameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, KExpressionsPackage.GENERIC_TYPE_REFERENCE__GENERIC_PARAMETERS);
        }
        return genericParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case KExpressionsPackage.GENERIC_TYPE_REFERENCE__SCHEDULE:
                return ((InternalEList<?>)getSchedule()).basicRemove(otherEnd, msgs);
            case KExpressionsPackage.GENERIC_TYPE_REFERENCE__GENERIC_PARAMETERS:
                return ((InternalEList<?>)getGenericParameters()).basicRemove(otherEnd, msgs);
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
            case KExpressionsPackage.GENERIC_TYPE_REFERENCE__SCHEDULE:
                return getSchedule();
            case KExpressionsPackage.GENERIC_TYPE_REFERENCE__TYPE:
                if (resolve) return getType();
                return basicGetType();
            case KExpressionsPackage.GENERIC_TYPE_REFERENCE__GENERIC_PARAMETERS:
                return getGenericParameters();
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
            case KExpressionsPackage.GENERIC_TYPE_REFERENCE__SCHEDULE:
                getSchedule().clear();
                getSchedule().addAll((Collection<? extends ScheduleObjectReference>)newValue);
                return;
            case KExpressionsPackage.GENERIC_TYPE_REFERENCE__TYPE:
                setType((NamedObject)newValue);
                return;
            case KExpressionsPackage.GENERIC_TYPE_REFERENCE__GENERIC_PARAMETERS:
                getGenericParameters().clear();
                getGenericParameters().addAll((Collection<? extends Parameter>)newValue);
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
            case KExpressionsPackage.GENERIC_TYPE_REFERENCE__SCHEDULE:
                getSchedule().clear();
                return;
            case KExpressionsPackage.GENERIC_TYPE_REFERENCE__TYPE:
                setType((NamedObject)null);
                return;
            case KExpressionsPackage.GENERIC_TYPE_REFERENCE__GENERIC_PARAMETERS:
                getGenericParameters().clear();
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
            case KExpressionsPackage.GENERIC_TYPE_REFERENCE__SCHEDULE:
                return schedule != null && !schedule.isEmpty();
            case KExpressionsPackage.GENERIC_TYPE_REFERENCE__TYPE:
                return type != null;
            case KExpressionsPackage.GENERIC_TYPE_REFERENCE__GENERIC_PARAMETERS:
                return genericParameters != null && !genericParameters.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //GenericTypeReferenceImpl
