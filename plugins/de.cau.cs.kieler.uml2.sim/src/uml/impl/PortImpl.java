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

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

import uml.Interface;
import uml.Port;
import uml.ProtocolStateMachine;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.PortImpl#isIsBehavior <em>Is Behavior</em>}</li>
 *   <li>{@link uml.impl.PortImpl#isIsService <em>Is Service</em>}</li>
 *   <li>{@link uml.impl.PortImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link uml.impl.PortImpl#getRedefinedPort <em>Redefined Port</em>}</li>
 *   <li>{@link uml.impl.PortImpl#getProvided <em>Provided</em>}</li>
 *   <li>{@link uml.impl.PortImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortImpl extends PropertyImpl implements Port {
    /**
     * The default value of the '{@link #isIsBehavior() <em>Is Behavior</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsBehavior()
     * @generated
     * @ordered
     */
    protected static final boolean IS_BEHAVIOR_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsBehavior() <em>Is Behavior</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsBehavior()
     * @generated
     * @ordered
     */
    protected boolean isBehavior = IS_BEHAVIOR_EDEFAULT;

    /**
     * The default value of the '{@link #isIsService() <em>Is Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsService()
     * @generated
     * @ordered
     */
    protected static final boolean IS_SERVICE_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isIsService() <em>Is Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsService()
     * @generated
     * @ordered
     */
    protected boolean isService = IS_SERVICE_EDEFAULT;

    /**
     * The cached value of the '{@link #getRedefinedPort() <em>Redefined Port</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRedefinedPort()
     * @generated
     * @ordered
     */
    protected EList<Port> redefinedPort;

    /**
     * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProtocol()
     * @generated
     * @ordered
     */
    protected ProtocolStateMachine protocol;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PortImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getPort();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsBehavior() {
        return isBehavior;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsBehavior(boolean newIsBehavior) {
        boolean oldIsBehavior = isBehavior;
        isBehavior = newIsBehavior;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PORT__IS_BEHAVIOR, oldIsBehavior, isBehavior));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsService() {
        return isService;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsService(boolean newIsService) {
        boolean oldIsService = isService;
        isService = newIsService;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PORT__IS_SERVICE, oldIsService, isService));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Interface> getRequired() {
        // TODO: implement this method to return the 'Required' reference list
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
    public EList<Port> getRedefinedPort() {
        if (redefinedPort == null) {
            redefinedPort = new EObjectResolvingEList<Port>(Port.class, this, UmlPackage.PORT__REDEFINED_PORT);
        }
        return redefinedPort;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Interface> getProvided() {
        // TODO: implement this method to return the 'Provided' reference list
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
    public ProtocolStateMachine getProtocol() {
        if (protocol != null && protocol.eIsProxy()) {
            InternalEObject oldProtocol = (InternalEObject)protocol;
            protocol = (ProtocolStateMachine)eResolveProxy(oldProtocol);
            if (protocol != oldProtocol) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.PORT__PROTOCOL, oldProtocol, protocol));
            }
        }
        return protocol;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProtocolStateMachine basicGetProtocol() {
        return protocol;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProtocol(ProtocolStateMachine newProtocol) {
        ProtocolStateMachine oldProtocol = protocol;
        protocol = newProtocol;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PORT__PROTOCOL, oldProtocol, protocol));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean required_interfaces(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.PORT__REQUIRED_INTERFACES,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "required_interfaces", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean port_aggregation(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.PORT__PORT_AGGREGATION,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "port_aggregation", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean port_destroyed(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.PORT__PORT_DESTROYED,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "port_destroyed", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean default_value(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.PORT__DEFAULT_VALUE,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "default_value", EObjectValidator.getObjectLabel(this, context) }),
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
    public EList<Interface> getProvideds() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Interface> getRequireds() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UmlPackage.PORT__IS_BEHAVIOR:
                return isIsBehavior();
            case UmlPackage.PORT__IS_SERVICE:
                return isIsService();
            case UmlPackage.PORT__REQUIRED:
                return getRequired();
            case UmlPackage.PORT__REDEFINED_PORT:
                return getRedefinedPort();
            case UmlPackage.PORT__PROVIDED:
                return getProvided();
            case UmlPackage.PORT__PROTOCOL:
                if (resolve) return getProtocol();
                return basicGetProtocol();
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
            case UmlPackage.PORT__IS_BEHAVIOR:
                setIsBehavior((Boolean)newValue);
                return;
            case UmlPackage.PORT__IS_SERVICE:
                setIsService((Boolean)newValue);
                return;
            case UmlPackage.PORT__REDEFINED_PORT:
                getRedefinedPort().clear();
                getRedefinedPort().addAll((Collection<? extends Port>)newValue);
                return;
            case UmlPackage.PORT__PROTOCOL:
                setProtocol((ProtocolStateMachine)newValue);
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
            case UmlPackage.PORT__IS_BEHAVIOR:
                setIsBehavior(IS_BEHAVIOR_EDEFAULT);
                return;
            case UmlPackage.PORT__IS_SERVICE:
                setIsService(IS_SERVICE_EDEFAULT);
                return;
            case UmlPackage.PORT__REDEFINED_PORT:
                getRedefinedPort().clear();
                return;
            case UmlPackage.PORT__PROTOCOL:
                setProtocol((ProtocolStateMachine)null);
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
            case UmlPackage.PORT__IS_BEHAVIOR:
                return isBehavior != IS_BEHAVIOR_EDEFAULT;
            case UmlPackage.PORT__IS_SERVICE:
                return isService != IS_SERVICE_EDEFAULT;
            case UmlPackage.PORT__REQUIRED:
                return !getRequired().isEmpty();
            case UmlPackage.PORT__REDEFINED_PORT:
                return redefinedPort != null && !redefinedPort.isEmpty();
            case UmlPackage.PORT__PROVIDED:
                return !getProvided().isEmpty();
            case UmlPackage.PORT__PROTOCOL:
                return protocol != null;
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
        result.append(" (isBehavior: ");
        result.append(isBehavior);
        result.append(", isService: ");
        result.append(isService);
        result.append(')');
        return result.toString();
    }

} //PortImpl
