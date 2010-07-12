/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Namespace;
import uml.Pseudostate;
import uml.Region;
import uml.State;
import uml.StateMachine;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.StateMachineImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link uml.impl.StateMachineImpl#getSubmachineState <em>Submachine State</em>}</li>
 *   <li>{@link uml.impl.StateMachineImpl#getConnectionPoint <em>Connection Point</em>}</li>
 *   <li>{@link uml.impl.StateMachineImpl#getExtendedStateMachine <em>Extended State Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateMachineImpl extends BehaviorImpl implements StateMachine {
    /**
     * The cached value of the '{@link #getRegion() <em>Region</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegion()
     * @generated
     * @ordered
     */
    protected EList<Region> region;

    /**
     * The cached value of the '{@link #getSubmachineState() <em>Submachine State</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubmachineState()
     * @generated
     * @ordered
     */
    protected EList<State> submachineState;

    /**
     * The cached value of the '{@link #getConnectionPoint() <em>Connection Point</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionPoint()
     * @generated
     * @ordered
     */
    protected EList<Pseudostate> connectionPoint;

    /**
     * The cached value of the '{@link #getExtendedStateMachine() <em>Extended State Machine</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtendedStateMachine()
     * @generated
     * @ordered
     */
    protected EList<StateMachine> extendedStateMachine;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StateMachineImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getStateMachine();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Region> getRegion() {
        if (region == null) {
            region = new EObjectContainmentWithInverseEList<Region>(Region.class, this, UmlPackage.STATE_MACHINE__REGION, UmlPackage.REGION__STATE_MACHINE);
        }
        return region;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<State> getSubmachineState() {
        if (submachineState == null) {
            submachineState = new EObjectWithInverseResolvingEList<State>(State.class, this, UmlPackage.STATE_MACHINE__SUBMACHINE_STATE, UmlPackage.STATE__SUBMACHINE);
        }
        return submachineState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Pseudostate> getConnectionPoint() {
        if (connectionPoint == null) {
            connectionPoint = new EObjectContainmentWithInverseEList<Pseudostate>(Pseudostate.class, this, UmlPackage.STATE_MACHINE__CONNECTION_POINT, UmlPackage.PSEUDOSTATE__STATE_MACHINE);
        }
        return connectionPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<StateMachine> getExtendedStateMachine() {
        if (extendedStateMachine == null) {
            extendedStateMachine = new EObjectResolvingEList<StateMachine>(StateMachine.class, this, UmlPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE);
        }
        return extendedStateMachine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean classifier_context(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.STATE_MACHINE__CLASSIFIER_CONTEXT,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "classifier_context", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean context_classifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.STATE_MACHINE__CONTEXT_CLASSIFIER,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "context_classifier", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean connection_points(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.STATE_MACHINE__CONNECTION_POINTS,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "connection_points", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean method(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.STATE_MACHINE__METHOD,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "method", EObjectValidator.getObjectLabel(this, context) }),
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
    public Namespace LCA(State s1, State s2) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean ancestor(State s1, State s2) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isRedefinitionContextValid(StateMachine redefined) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
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
            case UmlPackage.STATE_MACHINE__REGION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getRegion()).basicAdd(otherEnd, msgs);
            case UmlPackage.STATE_MACHINE__SUBMACHINE_STATE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubmachineState()).basicAdd(otherEnd, msgs);
            case UmlPackage.STATE_MACHINE__CONNECTION_POINT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectionPoint()).basicAdd(otherEnd, msgs);
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
            case UmlPackage.STATE_MACHINE__REGION:
                return ((InternalEList<?>)getRegion()).basicRemove(otherEnd, msgs);
            case UmlPackage.STATE_MACHINE__SUBMACHINE_STATE:
                return ((InternalEList<?>)getSubmachineState()).basicRemove(otherEnd, msgs);
            case UmlPackage.STATE_MACHINE__CONNECTION_POINT:
                return ((InternalEList<?>)getConnectionPoint()).basicRemove(otherEnd, msgs);
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
            case UmlPackage.STATE_MACHINE__REGION:
                return getRegion();
            case UmlPackage.STATE_MACHINE__SUBMACHINE_STATE:
                return getSubmachineState();
            case UmlPackage.STATE_MACHINE__CONNECTION_POINT:
                return getConnectionPoint();
            case UmlPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE:
                return getExtendedStateMachine();
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
            case UmlPackage.STATE_MACHINE__REGION:
                getRegion().clear();
                getRegion().addAll((Collection<? extends Region>)newValue);
                return;
            case UmlPackage.STATE_MACHINE__SUBMACHINE_STATE:
                getSubmachineState().clear();
                getSubmachineState().addAll((Collection<? extends State>)newValue);
                return;
            case UmlPackage.STATE_MACHINE__CONNECTION_POINT:
                getConnectionPoint().clear();
                getConnectionPoint().addAll((Collection<? extends Pseudostate>)newValue);
                return;
            case UmlPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE:
                getExtendedStateMachine().clear();
                getExtendedStateMachine().addAll((Collection<? extends StateMachine>)newValue);
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
            case UmlPackage.STATE_MACHINE__REGION:
                getRegion().clear();
                return;
            case UmlPackage.STATE_MACHINE__SUBMACHINE_STATE:
                getSubmachineState().clear();
                return;
            case UmlPackage.STATE_MACHINE__CONNECTION_POINT:
                getConnectionPoint().clear();
                return;
            case UmlPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE:
                getExtendedStateMachine().clear();
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
            case UmlPackage.STATE_MACHINE__REGION:
                return region != null && !region.isEmpty();
            case UmlPackage.STATE_MACHINE__SUBMACHINE_STATE:
                return submachineState != null && !submachineState.isEmpty();
            case UmlPackage.STATE_MACHINE__CONNECTION_POINT:
                return connectionPoint != null && !connectionPoint.isEmpty();
            case UmlPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE:
                return extendedStateMachine != null && !extendedStateMachine.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //StateMachineImpl
