/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml.GeneralOrdering;
import uml.OccurrenceSpecification;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Ordering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.GeneralOrderingImpl#getBefore <em>Before</em>}</li>
 *   <li>{@link uml.impl.GeneralOrderingImpl#getAfter <em>After</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralOrderingImpl extends NamedElementImpl implements GeneralOrdering {
    /**
     * The cached value of the '{@link #getBefore() <em>Before</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBefore()
     * @generated
     * @ordered
     */
    protected OccurrenceSpecification before;

    /**
     * The cached value of the '{@link #getAfter() <em>After</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAfter()
     * @generated
     * @ordered
     */
    protected OccurrenceSpecification after;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GeneralOrderingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getGeneralOrdering();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OccurrenceSpecification getBefore() {
        if (before != null && before.eIsProxy()) {
            InternalEObject oldBefore = (InternalEObject)before;
            before = (OccurrenceSpecification)eResolveProxy(oldBefore);
            if (before != oldBefore) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.GENERAL_ORDERING__BEFORE, oldBefore, before));
            }
        }
        return before;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OccurrenceSpecification basicGetBefore() {
        return before;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBefore(OccurrenceSpecification newBefore, NotificationChain msgs) {
        OccurrenceSpecification oldBefore = before;
        before = newBefore;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.GENERAL_ORDERING__BEFORE, oldBefore, newBefore);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBefore(OccurrenceSpecification newBefore) {
        if (newBefore != before) {
            NotificationChain msgs = null;
            if (before != null)
                msgs = ((InternalEObject)before).eInverseRemove(this, UmlPackage.OCCURRENCE_SPECIFICATION__TO_AFTER, OccurrenceSpecification.class, msgs);
            if (newBefore != null)
                msgs = ((InternalEObject)newBefore).eInverseAdd(this, UmlPackage.OCCURRENCE_SPECIFICATION__TO_AFTER, OccurrenceSpecification.class, msgs);
            msgs = basicSetBefore(newBefore, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.GENERAL_ORDERING__BEFORE, newBefore, newBefore));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OccurrenceSpecification getAfter() {
        if (after != null && after.eIsProxy()) {
            InternalEObject oldAfter = (InternalEObject)after;
            after = (OccurrenceSpecification)eResolveProxy(oldAfter);
            if (after != oldAfter) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.GENERAL_ORDERING__AFTER, oldAfter, after));
            }
        }
        return after;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OccurrenceSpecification basicGetAfter() {
        return after;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAfter(OccurrenceSpecification newAfter, NotificationChain msgs) {
        OccurrenceSpecification oldAfter = after;
        after = newAfter;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.GENERAL_ORDERING__AFTER, oldAfter, newAfter);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAfter(OccurrenceSpecification newAfter) {
        if (newAfter != after) {
            NotificationChain msgs = null;
            if (after != null)
                msgs = ((InternalEObject)after).eInverseRemove(this, UmlPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE, OccurrenceSpecification.class, msgs);
            if (newAfter != null)
                msgs = ((InternalEObject)newAfter).eInverseAdd(this, UmlPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE, OccurrenceSpecification.class, msgs);
            msgs = basicSetAfter(newAfter, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.GENERAL_ORDERING__AFTER, newAfter, newAfter));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.GENERAL_ORDERING__BEFORE:
                if (before != null)
                    msgs = ((InternalEObject)before).eInverseRemove(this, UmlPackage.OCCURRENCE_SPECIFICATION__TO_AFTER, OccurrenceSpecification.class, msgs);
                return basicSetBefore((OccurrenceSpecification)otherEnd, msgs);
            case UmlPackage.GENERAL_ORDERING__AFTER:
                if (after != null)
                    msgs = ((InternalEObject)after).eInverseRemove(this, UmlPackage.OCCURRENCE_SPECIFICATION__TO_BEFORE, OccurrenceSpecification.class, msgs);
                return basicSetAfter((OccurrenceSpecification)otherEnd, msgs);
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
            case UmlPackage.GENERAL_ORDERING__BEFORE:
                return basicSetBefore(null, msgs);
            case UmlPackage.GENERAL_ORDERING__AFTER:
                return basicSetAfter(null, msgs);
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
            case UmlPackage.GENERAL_ORDERING__BEFORE:
                if (resolve) return getBefore();
                return basicGetBefore();
            case UmlPackage.GENERAL_ORDERING__AFTER:
                if (resolve) return getAfter();
                return basicGetAfter();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case UmlPackage.GENERAL_ORDERING__BEFORE:
                setBefore((OccurrenceSpecification)newValue);
                return;
            case UmlPackage.GENERAL_ORDERING__AFTER:
                setAfter((OccurrenceSpecification)newValue);
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
            case UmlPackage.GENERAL_ORDERING__BEFORE:
                setBefore((OccurrenceSpecification)null);
                return;
            case UmlPackage.GENERAL_ORDERING__AFTER:
                setAfter((OccurrenceSpecification)null);
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
            case UmlPackage.GENERAL_ORDERING__BEFORE:
                return before != null;
            case UmlPackage.GENERAL_ORDERING__AFTER:
                return after != null;
        }
        return super.eIsSet(featureID);
    }

} //GeneralOrderingImpl
