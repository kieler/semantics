/**
 */
package de.cau.cs.kieler.kexpressions.impl;

import de.cau.cs.kieler.annotations.NamedObject;

import de.cau.cs.kieler.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.kexpressions.ScheduleObjectReference;
import de.cau.cs.kieler.kexpressions.SpecialAccessExpression;
import de.cau.cs.kieler.kexpressions.ValuedObjectReference;

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
 * An implementation of the model object '<em><b>Special Access Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.SpecialAccessExpressionImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.SpecialAccessExpressionImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.SpecialAccessExpressionImpl#getSubReference <em>Sub Reference</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.SpecialAccessExpressionImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kexpressions.impl.SpecialAccessExpressionImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecialAccessExpressionImpl extends EObjectImpl implements SpecialAccessExpression {
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
     * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccess()
     * @generated
     * @ordered
     */
    protected static final String ACCESS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccess()
     * @generated
     * @ordered
     */
    protected String access = ACCESS_EDEFAULT;

    /**
     * The cached value of the '{@link #getSubReference() <em>Sub Reference</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubReference()
     * @generated
     * @ordered
     */
    protected ValuedObjectReference subReference;

    /**
     * The cached value of the '{@link #getContainer() <em>Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContainer()
     * @generated
     * @ordered
     */
    protected NamedObject container;

    /**
     * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected NamedObject target;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SpecialAccessExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KExpressionsPackage.Literals.SPECIAL_ACCESS_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ScheduleObjectReference> getSchedule() {
        if (schedule == null) {
            schedule = new EObjectContainmentEList<ScheduleObjectReference>(ScheduleObjectReference.class, this, KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__SCHEDULE);
        }
        return schedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAccess() {
        return access;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAccess(String newAccess) {
        String oldAccess = access;
        access = newAccess;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__ACCESS, oldAccess, access));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ValuedObjectReference getSubReference() {
        return subReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSubReference(ValuedObjectReference newSubReference, NotificationChain msgs) {
        ValuedObjectReference oldSubReference = subReference;
        subReference = newSubReference;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__SUB_REFERENCE, oldSubReference, newSubReference);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSubReference(ValuedObjectReference newSubReference) {
        if (newSubReference != subReference) {
            NotificationChain msgs = null;
            if (subReference != null)
                msgs = ((InternalEObject)subReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__SUB_REFERENCE, null, msgs);
            if (newSubReference != null)
                msgs = ((InternalEObject)newSubReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__SUB_REFERENCE, null, msgs);
            msgs = basicSetSubReference(newSubReference, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__SUB_REFERENCE, newSubReference, newSubReference));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NamedObject getContainer() {
        if (container != null && container.eIsProxy()) {
            InternalEObject oldContainer = (InternalEObject)container;
            container = (NamedObject)eResolveProxy(oldContainer);
            if (container != oldContainer) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__CONTAINER, oldContainer, container));
            }
        }
        return container;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NamedObject basicGetContainer() {
        return container;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setContainer(NamedObject newContainer) {
        NamedObject oldContainer = container;
        container = newContainer;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__CONTAINER, oldContainer, container));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NamedObject getTarget() {
        if (target != null && target.eIsProxy()) {
            InternalEObject oldTarget = (InternalEObject)target;
            target = (NamedObject)eResolveProxy(oldTarget);
            if (target != oldTarget) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__TARGET, oldTarget, target));
            }
        }
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NamedObject basicGetTarget() {
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTarget(NamedObject newTarget) {
        NamedObject oldTarget = target;
        target = newTarget;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__TARGET, oldTarget, target));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__SCHEDULE:
                return ((InternalEList<?>)getSchedule()).basicRemove(otherEnd, msgs);
            case KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__SUB_REFERENCE:
                return basicSetSubReference(null, msgs);
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
            case KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__SCHEDULE:
                return getSchedule();
            case KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__ACCESS:
                return getAccess();
            case KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__SUB_REFERENCE:
                return getSubReference();
            case KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__CONTAINER:
                if (resolve) return getContainer();
                return basicGetContainer();
            case KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__TARGET:
                if (resolve) return getTarget();
                return basicGetTarget();
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
            case KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__SCHEDULE:
                getSchedule().clear();
                getSchedule().addAll((Collection<? extends ScheduleObjectReference>)newValue);
                return;
            case KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__ACCESS:
                setAccess((String)newValue);
                return;
            case KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__SUB_REFERENCE:
                setSubReference((ValuedObjectReference)newValue);
                return;
            case KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__CONTAINER:
                setContainer((NamedObject)newValue);
                return;
            case KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__TARGET:
                setTarget((NamedObject)newValue);
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
            case KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__SCHEDULE:
                getSchedule().clear();
                return;
            case KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__ACCESS:
                setAccess(ACCESS_EDEFAULT);
                return;
            case KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__SUB_REFERENCE:
                setSubReference((ValuedObjectReference)null);
                return;
            case KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__CONTAINER:
                setContainer((NamedObject)null);
                return;
            case KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__TARGET:
                setTarget((NamedObject)null);
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
            case KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__SCHEDULE:
                return schedule != null && !schedule.isEmpty();
            case KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__ACCESS:
                return ACCESS_EDEFAULT == null ? access != null : !ACCESS_EDEFAULT.equals(access);
            case KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__SUB_REFERENCE:
                return subReference != null;
            case KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__CONTAINER:
                return container != null;
            case KExpressionsPackage.SPECIAL_ACCESS_EXPRESSION__TARGET:
                return target != null;
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
        result.append(" (access: ");
        result.append(access);
        result.append(')');
        return result.toString();
    }

} //SpecialAccessExpressionImpl
