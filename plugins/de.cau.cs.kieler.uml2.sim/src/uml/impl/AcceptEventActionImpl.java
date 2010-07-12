/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.AcceptEventAction;
import uml.OutputPin;
import uml.Trigger;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accept Event Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.AcceptEventActionImpl#isIsUnmarshall <em>Is Unmarshall</em>}</li>
 *   <li>{@link uml.impl.AcceptEventActionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link uml.impl.AcceptEventActionImpl#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AcceptEventActionImpl extends ActionImpl implements AcceptEventAction {
    /**
     * The default value of the '{@link #isIsUnmarshall() <em>Is Unmarshall</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsUnmarshall()
     * @generated
     * @ordered
     */
    protected static final boolean IS_UNMARSHALL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsUnmarshall() <em>Is Unmarshall</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsUnmarshall()
     * @generated
     * @ordered
     */
    protected boolean isUnmarshall = IS_UNMARSHALL_EDEFAULT;

    /**
     * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResult()
     * @generated
     * @ordered
     */
    protected EList<OutputPin> result;

    /**
     * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrigger()
     * @generated
     * @ordered
     */
    protected EList<Trigger> trigger;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AcceptEventActionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getAcceptEventAction();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsUnmarshall() {
        return isUnmarshall;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsUnmarshall(boolean newIsUnmarshall) {
        boolean oldIsUnmarshall = isUnmarshall;
        isUnmarshall = newIsUnmarshall;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACCEPT_EVENT_ACTION__IS_UNMARSHALL, oldIsUnmarshall, isUnmarshall));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<OutputPin> getResult() {
        if (result == null) {
            result = new EObjectContainmentEList<OutputPin>(OutputPin.class, this, UmlPackage.ACCEPT_EVENT_ACTION__RESULT);
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Trigger> getTrigger() {
        if (trigger == null) {
            trigger = new EObjectContainmentEList<Trigger>(Trigger.class, this, UmlPackage.ACCEPT_EVENT_ACTION__TRIGGER);
        }
        return trigger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean no_input_pins(DiagnosticChain diagnostics, Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics.add
                    (new BasicDiagnostic
                        (Diagnostic.ERROR,
                         UmlValidator.DIAGNOSTIC_SOURCE,
                         UmlValidator.ACCEPT_EVENT_ACTION__NO_INPUT_PINS,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "no_input_pins", EObjectValidator.getObjectLabel(this, context) }),
                         new Object [] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean no_output_pins(DiagnosticChain diagnostics, Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics.add
                    (new BasicDiagnostic
                        (Diagnostic.ERROR,
                         UmlValidator.DIAGNOSTIC_SOURCE,
                         UmlValidator.ACCEPT_EVENT_ACTION__NO_OUTPUT_PINS,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "no_output_pins", EObjectValidator.getObjectLabel(this, context) }),
                         new Object [] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean trigger_events(DiagnosticChain diagnostics, Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics.add
                    (new BasicDiagnostic
                        (Diagnostic.ERROR,
                         UmlValidator.DIAGNOSTIC_SOURCE,
                         UmlValidator.ACCEPT_EVENT_ACTION__TRIGGER_EVENTS,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "trigger_events", EObjectValidator.getObjectLabel(this, context) }),
                         new Object [] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean unmarshall_signal_events(DiagnosticChain diagnostics, Map<Object, Object> context) {
        // TODO: implement this method
        // -> specify the condition that violates the invariant
        // -> verify the details of the diagnostic, including severity and message
        // Ensure that you remove @generated or mark it @generated NOT
        if (false) {
            if (diagnostics != null) {
                diagnostics.add
                    (new BasicDiagnostic
                        (Diagnostic.ERROR,
                         UmlValidator.DIAGNOSTIC_SOURCE,
                         UmlValidator.ACCEPT_EVENT_ACTION__UNMARSHALL_SIGNAL_EVENTS,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "unmarshall_signal_events", EObjectValidator.getObjectLabel(this, context) }),
                         new Object [] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.ACCEPT_EVENT_ACTION__RESULT:
                return ((InternalEList<?>)getResult()).basicRemove(otherEnd, msgs);
            case UmlPackage.ACCEPT_EVENT_ACTION__TRIGGER:
                return ((InternalEList<?>)getTrigger()).basicRemove(otherEnd, msgs);
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
            case UmlPackage.ACCEPT_EVENT_ACTION__IS_UNMARSHALL:
                return isIsUnmarshall();
            case UmlPackage.ACCEPT_EVENT_ACTION__RESULT:
                return getResult();
            case UmlPackage.ACCEPT_EVENT_ACTION__TRIGGER:
                return getTrigger();
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
            case UmlPackage.ACCEPT_EVENT_ACTION__IS_UNMARSHALL:
                setIsUnmarshall((Boolean)newValue);
                return;
            case UmlPackage.ACCEPT_EVENT_ACTION__RESULT:
                getResult().clear();
                getResult().addAll((Collection<? extends OutputPin>)newValue);
                return;
            case UmlPackage.ACCEPT_EVENT_ACTION__TRIGGER:
                getTrigger().clear();
                getTrigger().addAll((Collection<? extends Trigger>)newValue);
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
            case UmlPackage.ACCEPT_EVENT_ACTION__IS_UNMARSHALL:
                setIsUnmarshall(IS_UNMARSHALL_EDEFAULT);
                return;
            case UmlPackage.ACCEPT_EVENT_ACTION__RESULT:
                getResult().clear();
                return;
            case UmlPackage.ACCEPT_EVENT_ACTION__TRIGGER:
                getTrigger().clear();
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
            case UmlPackage.ACCEPT_EVENT_ACTION__IS_UNMARSHALL:
                return isUnmarshall != IS_UNMARSHALL_EDEFAULT;
            case UmlPackage.ACCEPT_EVENT_ACTION__RESULT:
                return result != null && !result.isEmpty();
            case UmlPackage.ACCEPT_EVENT_ACTION__TRIGGER:
                return trigger != null && !trigger.isEmpty();
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
        result.append(" (isUnmarshall: ");
        result.append(isUnmarshall);
        result.append(')');
        return result.toString();
    }

} //AcceptEventActionImpl
