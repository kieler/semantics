/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uml.Constraint;
import uml.Operation;
import uml.ProtocolTransition;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ProtocolTransitionImpl#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link uml.impl.ProtocolTransitionImpl#getReferred <em>Referred</em>}</li>
 *   <li>{@link uml.impl.ProtocolTransitionImpl#getPreCondition <em>Pre Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolTransitionImpl extends TransitionImpl implements ProtocolTransition {
    /**
     * The cached value of the '{@link #getPostCondition() <em>Post Condition</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPostCondition()
     * @generated
     * @ordered
     */
    protected Constraint postCondition;

    /**
     * The cached value of the '{@link #getPreCondition() <em>Pre Condition</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreCondition()
     * @generated
     * @ordered
     */
    protected Constraint preCondition;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProtocolTransitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getProtocolTransition();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Constraint getPostCondition() {
        if (postCondition != null && postCondition.eIsProxy()) {
            InternalEObject oldPostCondition = (InternalEObject)postCondition;
            postCondition = (Constraint)eResolveProxy(oldPostCondition);
            if (postCondition != oldPostCondition) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.PROTOCOL_TRANSITION__POST_CONDITION, oldPostCondition, postCondition));
            }
        }
        return postCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Constraint basicGetPostCondition() {
        return postCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPostCondition(Constraint newPostCondition) {
        Constraint oldPostCondition = postCondition;
        postCondition = newPostCondition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROTOCOL_TRANSITION__POST_CONDITION, oldPostCondition, postCondition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Operation> getReferred() {
        // TODO: implement this method to return the 'Referred' reference list
        // Ensure that you remove @generated or mark it @generated NOT
        // The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
        // so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Constraint getPreCondition() {
        if (preCondition != null && preCondition.eIsProxy()) {
            InternalEObject oldPreCondition = (InternalEObject)preCondition;
            preCondition = (Constraint)eResolveProxy(oldPreCondition);
            if (preCondition != oldPreCondition) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.PROTOCOL_TRANSITION__PRE_CONDITION, oldPreCondition, preCondition));
            }
        }
        return preCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Constraint basicGetPreCondition() {
        return preCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPreCondition(Constraint newPreCondition) {
        Constraint oldPreCondition = preCondition;
        preCondition = newPreCondition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROTOCOL_TRANSITION__PRE_CONDITION, oldPreCondition, preCondition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean belongs_to_psm(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.PROTOCOL_TRANSITION__BELONGS_TO_PSM,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "belongs_to_psm", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean associated_actions(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.PROTOCOL_TRANSITION__ASSOCIATED_ACTIONS,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "associated_actions", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean refers_to_operation(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.PROTOCOL_TRANSITION__REFERS_TO_OPERATION,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "refers_to_operation", EObjectValidator.getObjectLabel(this, context) }),
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
            case UmlPackage.PROTOCOL_TRANSITION__POST_CONDITION:
                if (resolve) return getPostCondition();
                return basicGetPostCondition();
            case UmlPackage.PROTOCOL_TRANSITION__REFERRED:
                return getReferred();
            case UmlPackage.PROTOCOL_TRANSITION__PRE_CONDITION:
                if (resolve) return getPreCondition();
                return basicGetPreCondition();
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
            case UmlPackage.PROTOCOL_TRANSITION__POST_CONDITION:
                setPostCondition((Constraint)newValue);
                return;
            case UmlPackage.PROTOCOL_TRANSITION__PRE_CONDITION:
                setPreCondition((Constraint)newValue);
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
            case UmlPackage.PROTOCOL_TRANSITION__POST_CONDITION:
                setPostCondition((Constraint)null);
                return;
            case UmlPackage.PROTOCOL_TRANSITION__PRE_CONDITION:
                setPreCondition((Constraint)null);
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
            case UmlPackage.PROTOCOL_TRANSITION__POST_CONDITION:
                return postCondition != null;
            case UmlPackage.PROTOCOL_TRANSITION__REFERRED:
                return !getReferred().isEmpty();
            case UmlPackage.PROTOCOL_TRANSITION__PRE_CONDITION:
                return preCondition != null;
        }
        return super.eIsSet(featureID);
    }

} //ProtocolTransitionImpl
