/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

import uml.DurationObservation;
import uml.NamedElement;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.DurationObservationImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link uml.impl.DurationObservationImpl#getFirstEvent <em>First Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DurationObservationImpl extends ObservationImpl implements DurationObservation {
    /**
     * The cached value of the '{@link #getEvent() <em>Event</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEvent()
     * @generated
     * @ordered
     */
    protected EList<NamedElement> event;

    /**
     * The cached value of the '{@link #getFirstEvent() <em>First Event</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFirstEvent()
     * @generated
     * @ordered
     */
    protected EList<Boolean> firstEvent;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DurationObservationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getDurationObservation();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<NamedElement> getEvent() {
        if (event == null) {
            event = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, UmlPackage.DURATION_OBSERVATION__EVENT);
        }
        return event;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Boolean> getFirstEvent() {
        if (firstEvent == null) {
            firstEvent = new EDataTypeUniqueEList<Boolean>(Boolean.class, this, UmlPackage.DURATION_OBSERVATION__FIRST_EVENT);
        }
        return firstEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean first_event_multiplicity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.DURATION_OBSERVATION__FIRST_EVENT_MULTIPLICITY,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "first_event_multiplicity", EObjectValidator.getObjectLabel(this, context) }),
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
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UmlPackage.DURATION_OBSERVATION__EVENT:
                return getEvent();
            case UmlPackage.DURATION_OBSERVATION__FIRST_EVENT:
                return getFirstEvent();
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
            case UmlPackage.DURATION_OBSERVATION__EVENT:
                getEvent().clear();
                getEvent().addAll((Collection<? extends NamedElement>)newValue);
                return;
            case UmlPackage.DURATION_OBSERVATION__FIRST_EVENT:
                getFirstEvent().clear();
                getFirstEvent().addAll((Collection<? extends Boolean>)newValue);
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
            case UmlPackage.DURATION_OBSERVATION__EVENT:
                getEvent().clear();
                return;
            case UmlPackage.DURATION_OBSERVATION__FIRST_EVENT:
                getFirstEvent().clear();
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
            case UmlPackage.DURATION_OBSERVATION__EVENT:
                return event != null && !event.isEmpty();
            case UmlPackage.DURATION_OBSERVATION__FIRST_EVENT:
                return firstEvent != null && !firstEvent.isEmpty();
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

} //DurationObservationImpl
