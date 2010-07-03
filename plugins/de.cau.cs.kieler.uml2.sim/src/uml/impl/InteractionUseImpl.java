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

import uml.Action;
import uml.Gate;
import uml.Interaction;
import uml.InteractionUse;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.InteractionUseImpl#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link uml.impl.InteractionUseImpl#getActualGate <em>Actual Gate</em>}</li>
 *   <li>{@link uml.impl.InteractionUseImpl#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionUseImpl extends InteractionFragmentImpl implements InteractionUse {
    /**
     * The cached value of the '{@link #getRefersTo() <em>Refers To</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersTo()
     * @generated
     * @ordered
     */
    protected Interaction refersTo;

    /**
     * The cached value of the '{@link #getActualGate() <em>Actual Gate</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActualGate()
     * @generated
     * @ordered
     */
    protected EList<Gate> actualGate;

    /**
     * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArgument()
     * @generated
     * @ordered
     */
    protected EList<Action> argument;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InteractionUseImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getInteractionUse();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Interaction getRefersTo() {
        if (refersTo != null && refersTo.eIsProxy()) {
            InternalEObject oldRefersTo = (InternalEObject)refersTo;
            refersTo = (Interaction)eResolveProxy(oldRefersTo);
            if (refersTo != oldRefersTo) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.INTERACTION_USE__REFERS_TO, oldRefersTo, refersTo));
            }
        }
        return refersTo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Interaction basicGetRefersTo() {
        return refersTo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRefersTo(Interaction newRefersTo) {
        Interaction oldRefersTo = refersTo;
        refersTo = newRefersTo;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INTERACTION_USE__REFERS_TO, oldRefersTo, refersTo));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Gate> getActualGate() {
        if (actualGate == null) {
            actualGate = new EObjectContainmentEList<Gate>(Gate.class, this, UmlPackage.INTERACTION_USE__ACTUAL_GATE);
        }
        return actualGate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Action> getArgument() {
        if (argument == null) {
            argument = new EObjectContainmentEList<Action>(Action.class, this, UmlPackage.INTERACTION_USE__ARGUMENT);
        }
        return argument;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean gates_match(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.INTERACTION_USE__GATES_MATCH,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "gates_match", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean all_lifelines(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.INTERACTION_USE__ALL_LIFELINES,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "all_lifelines", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean arguments_correspond_to_parameters(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.INTERACTION_USE__ARGUMENTS_CORRESPOND_TO_PARAMETERS,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "arguments_correspond_to_parameters", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean arguments_are_constants(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.INTERACTION_USE__ARGUMENTS_ARE_CONSTANTS,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "arguments_are_constants", EObjectValidator.getObjectLabel(this, context) }),
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
            case UmlPackage.INTERACTION_USE__ACTUAL_GATE:
                return ((InternalEList<?>)getActualGate()).basicRemove(otherEnd, msgs);
            case UmlPackage.INTERACTION_USE__ARGUMENT:
                return ((InternalEList<?>)getArgument()).basicRemove(otherEnd, msgs);
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
            case UmlPackage.INTERACTION_USE__REFERS_TO:
                if (resolve) return getRefersTo();
                return basicGetRefersTo();
            case UmlPackage.INTERACTION_USE__ACTUAL_GATE:
                return getActualGate();
            case UmlPackage.INTERACTION_USE__ARGUMENT:
                return getArgument();
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
            case UmlPackage.INTERACTION_USE__REFERS_TO:
                setRefersTo((Interaction)newValue);
                return;
            case UmlPackage.INTERACTION_USE__ACTUAL_GATE:
                getActualGate().clear();
                getActualGate().addAll((Collection<? extends Gate>)newValue);
                return;
            case UmlPackage.INTERACTION_USE__ARGUMENT:
                getArgument().clear();
                getArgument().addAll((Collection<? extends Action>)newValue);
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
            case UmlPackage.INTERACTION_USE__REFERS_TO:
                setRefersTo((Interaction)null);
                return;
            case UmlPackage.INTERACTION_USE__ACTUAL_GATE:
                getActualGate().clear();
                return;
            case UmlPackage.INTERACTION_USE__ARGUMENT:
                getArgument().clear();
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
            case UmlPackage.INTERACTION_USE__REFERS_TO:
                return refersTo != null;
            case UmlPackage.INTERACTION_USE__ACTUAL_GATE:
                return actualGate != null && !actualGate.isEmpty();
            case UmlPackage.INTERACTION_USE__ARGUMENT:
                return argument != null && !argument.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //InteractionUseImpl
