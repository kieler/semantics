/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Event;
import uml.GeneralOrdering;
import uml.OccurrenceSpecification;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Occurrence Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.OccurrenceSpecificationImpl#getToBefore <em>To Before</em>}</li>
 *   <li>{@link uml.impl.OccurrenceSpecificationImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link uml.impl.OccurrenceSpecificationImpl#getToAfter <em>To After</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OccurrenceSpecificationImpl extends InteractionFragmentImpl implements OccurrenceSpecification {
    /**
     * The cached value of the '{@link #getToBefore() <em>To Before</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToBefore()
     * @generated
     * @ordered
     */
    protected EList<GeneralOrdering> toBefore;

    /**
     * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEvent()
     * @generated
     * @ordered
     */
    protected Event event;

    /**
     * The cached value of the '{@link #getToAfter() <em>To After</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToAfter()
     * @generated
     * @ordered
     */
    protected EList<GeneralOrdering> toAfter;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OccurrenceSpecificationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getOccurrenceSpecification();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<GeneralOrdering> getToBefore() {
        if (toBefore == null) {
            toBefore = new EObjectWithInverseResolvingEList<GeneralOrdering>(GeneralOrdering.class, this, UmlPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE, UmlPackage.GENERAL_ORDERING__AFTER);
        }
        return toBefore;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Event getEvent() {
        if (event != null && event.eIsProxy()) {
            InternalEObject oldEvent = (InternalEObject)event;
            event = (Event)eResolveProxy(oldEvent);
            if (event != oldEvent) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.OCCURRENCE_SPECIFICATION__EVENT, oldEvent, event));
            }
        }
        return event;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Event basicGetEvent() {
        return event;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEvent(Event newEvent) {
        Event oldEvent = event;
        event = newEvent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OCCURRENCE_SPECIFICATION__EVENT, oldEvent, event));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<GeneralOrdering> getToAfter() {
        if (toAfter == null) {
            toAfter = new EObjectWithInverseResolvingEList<GeneralOrdering>(GeneralOrdering.class, this, UmlPackage.OCCURRENCE_SPECIFICATION__TO_AFTER, UmlPackage.GENERAL_ORDERING__BEFORE);
        }
        return toAfter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getToBefore()).basicAdd(otherEnd, msgs);
            case UmlPackage.OCCURRENCE_SPECIFICATION__TO_AFTER:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getToAfter()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE:
                return ((InternalEList<?>)getToBefore()).basicRemove(otherEnd, msgs);
            case UmlPackage.OCCURRENCE_SPECIFICATION__TO_AFTER:
                return ((InternalEList<?>)getToAfter()).basicRemove(otherEnd, msgs);
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
            case UmlPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE:
                return getToBefore();
            case UmlPackage.OCCURRENCE_SPECIFICATION__EVENT:
                if (resolve) return getEvent();
                return basicGetEvent();
            case UmlPackage.OCCURRENCE_SPECIFICATION__TO_AFTER:
                return getToAfter();
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
            case UmlPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE:
                getToBefore().clear();
                getToBefore().addAll((Collection<? extends GeneralOrdering>)newValue);
                return;
            case UmlPackage.OCCURRENCE_SPECIFICATION__EVENT:
                setEvent((Event)newValue);
                return;
            case UmlPackage.OCCURRENCE_SPECIFICATION__TO_AFTER:
                getToAfter().clear();
                getToAfter().addAll((Collection<? extends GeneralOrdering>)newValue);
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
            case UmlPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE:
                getToBefore().clear();
                return;
            case UmlPackage.OCCURRENCE_SPECIFICATION__EVENT:
                setEvent((Event)null);
                return;
            case UmlPackage.OCCURRENCE_SPECIFICATION__TO_AFTER:
                getToAfter().clear();
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
            case UmlPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE:
                return toBefore != null && !toBefore.isEmpty();
            case UmlPackage.OCCURRENCE_SPECIFICATION__EVENT:
                return event != null;
            case UmlPackage.OCCURRENCE_SPECIFICATION__TO_AFTER:
                return toAfter != null && !toAfter.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //OccurrenceSpecificationImpl
