/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml.NamedElement;
import uml.TimeObservation;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.TimeObservationImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link uml.impl.TimeObservationImpl#isFirstEvent <em>First Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeObservationImpl extends ObservationImpl implements TimeObservation {
    /**
     * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEvent()
     * @generated
     * @ordered
     */
    protected NamedElement event;

    /**
     * The default value of the '{@link #isFirstEvent() <em>First Event</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFirstEvent()
     * @generated
     * @ordered
     */
    protected static final boolean FIRST_EVENT_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isFirstEvent() <em>First Event</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFirstEvent()
     * @generated
     * @ordered
     */
    protected boolean firstEvent = FIRST_EVENT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TimeObservationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getTimeObservation();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NamedElement getEvent() {
        if (event != null && event.eIsProxy()) {
            InternalEObject oldEvent = (InternalEObject)event;
            event = (NamedElement)eResolveProxy(oldEvent);
            if (event != oldEvent) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.TIME_OBSERVATION__EVENT, oldEvent, event));
            }
        }
        return event;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NamedElement basicGetEvent() {
        return event;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEvent(NamedElement newEvent) {
        NamedElement oldEvent = event;
        event = newEvent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TIME_OBSERVATION__EVENT, oldEvent, event));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isFirstEvent() {
        return firstEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFirstEvent(boolean newFirstEvent) {
        boolean oldFirstEvent = firstEvent;
        firstEvent = newFirstEvent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TIME_OBSERVATION__FIRST_EVENT, oldFirstEvent, firstEvent));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UmlPackage.TIME_OBSERVATION__EVENT:
                if (resolve) return getEvent();
                return basicGetEvent();
            case UmlPackage.TIME_OBSERVATION__FIRST_EVENT:
                return isFirstEvent();
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
            case UmlPackage.TIME_OBSERVATION__EVENT:
                setEvent((NamedElement)newValue);
                return;
            case UmlPackage.TIME_OBSERVATION__FIRST_EVENT:
                setFirstEvent((Boolean)newValue);
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
            case UmlPackage.TIME_OBSERVATION__EVENT:
                setEvent((NamedElement)null);
                return;
            case UmlPackage.TIME_OBSERVATION__FIRST_EVENT:
                setFirstEvent(FIRST_EVENT_EDEFAULT);
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
            case UmlPackage.TIME_OBSERVATION__EVENT:
                return event != null;
            case UmlPackage.TIME_OBSERVATION__FIRST_EVENT:
                return firstEvent != FIRST_EVENT_EDEFAULT;
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

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (firstEvent: ");
        result.append(firstEvent);
        result.append(')');
        return result.toString();
    }

} //TimeObservationImpl
