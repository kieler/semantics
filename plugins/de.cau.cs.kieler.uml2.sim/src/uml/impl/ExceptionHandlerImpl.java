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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;

import uml.Classifier;
import uml.ExceptionHandler;
import uml.ExecutableNode;
import uml.ObjectNode;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exception Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ExceptionHandlerImpl#getHandlerBody <em>Handler Body</em>}</li>
 *   <li>{@link uml.impl.ExceptionHandlerImpl#getExceptionInput <em>Exception Input</em>}</li>
 *   <li>{@link uml.impl.ExceptionHandlerImpl#getExceptionType <em>Exception Type</em>}</li>
 *   <li>{@link uml.impl.ExceptionHandlerImpl#getProtectedNode <em>Protected Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExceptionHandlerImpl extends ElementImpl implements ExceptionHandler {
    /**
     * The cached value of the '{@link #getHandlerBody() <em>Handler Body</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHandlerBody()
     * @generated
     * @ordered
     */
    protected ExecutableNode handlerBody;

    /**
     * The cached value of the '{@link #getExceptionInput() <em>Exception Input</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExceptionInput()
     * @generated
     * @ordered
     */
    protected ObjectNode exceptionInput;

    /**
     * The cached value of the '{@link #getExceptionType() <em>Exception Type</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExceptionType()
     * @generated
     * @ordered
     */
    protected EList<Classifier> exceptionType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExceptionHandlerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getExceptionHandler();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutableNode getHandlerBody() {
        if (handlerBody != null && handlerBody.eIsProxy()) {
            InternalEObject oldHandlerBody = (InternalEObject)handlerBody;
            handlerBody = (ExecutableNode)eResolveProxy(oldHandlerBody);
            if (handlerBody != oldHandlerBody) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.EXCEPTION_HANDLER__HANDLER_BODY, oldHandlerBody, handlerBody));
            }
        }
        return handlerBody;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutableNode basicGetHandlerBody() {
        return handlerBody;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHandlerBody(ExecutableNode newHandlerBody) {
        ExecutableNode oldHandlerBody = handlerBody;
        handlerBody = newHandlerBody;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.EXCEPTION_HANDLER__HANDLER_BODY, oldHandlerBody, handlerBody));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectNode getExceptionInput() {
        if (exceptionInput != null && exceptionInput.eIsProxy()) {
            InternalEObject oldExceptionInput = (InternalEObject)exceptionInput;
            exceptionInput = (ObjectNode)eResolveProxy(oldExceptionInput);
            if (exceptionInput != oldExceptionInput) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT, oldExceptionInput, exceptionInput));
            }
        }
        return exceptionInput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectNode basicGetExceptionInput() {
        return exceptionInput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExceptionInput(ObjectNode newExceptionInput) {
        ObjectNode oldExceptionInput = exceptionInput;
        exceptionInput = newExceptionInput;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT, oldExceptionInput, exceptionInput));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Classifier> getExceptionType() {
        if (exceptionType == null) {
            exceptionType = new EObjectResolvingEList<Classifier>(Classifier.class, this, UmlPackage.EXCEPTION_HANDLER__EXCEPTION_TYPE);
        }
        return exceptionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutableNode getProtectedNode() {
        if (eContainerFeatureID() != UmlPackage.EXCEPTION_HANDLER__PROTECTED_NODE) return null;
        return (ExecutableNode)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProtectedNode(ExecutableNode newProtectedNode, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newProtectedNode, UmlPackage.EXCEPTION_HANDLER__PROTECTED_NODE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProtectedNode(ExecutableNode newProtectedNode) {
        if (newProtectedNode != eInternalContainer() || (eContainerFeatureID() != UmlPackage.EXCEPTION_HANDLER__PROTECTED_NODE && newProtectedNode != null)) {
            if (EcoreUtil.isAncestor(this, newProtectedNode))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newProtectedNode != null)
                msgs = ((InternalEObject)newProtectedNode).eInverseAdd(this, UmlPackage.EXECUTABLE_NODE__HANDLER, ExecutableNode.class, msgs);
            msgs = basicSetProtectedNode(newProtectedNode, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.EXCEPTION_HANDLER__PROTECTED_NODE, newProtectedNode, newProtectedNode));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean exception_body(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.EXCEPTION_HANDLER__EXCEPTION_BODY,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "exception_body", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean result_pins(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.EXCEPTION_HANDLER__RESULT_PINS,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "result_pins", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean one_input(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.EXCEPTION_HANDLER__ONE_INPUT,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "one_input", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean edge_source_target(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.EXCEPTION_HANDLER__EDGE_SOURCE_TARGET,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "edge_source_target", EObjectValidator.getObjectLabel(this, context) }),
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
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.EXCEPTION_HANDLER__PROTECTED_NODE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetProtectedNode((ExecutableNode)otherEnd, msgs);
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
            case UmlPackage.EXCEPTION_HANDLER__PROTECTED_NODE:
                return basicSetProtectedNode(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case UmlPackage.EXCEPTION_HANDLER__PROTECTED_NODE:
                return eInternalContainer().eInverseRemove(this, UmlPackage.EXECUTABLE_NODE__HANDLER, ExecutableNode.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UmlPackage.EXCEPTION_HANDLER__HANDLER_BODY:
                if (resolve) return getHandlerBody();
                return basicGetHandlerBody();
            case UmlPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT:
                if (resolve) return getExceptionInput();
                return basicGetExceptionInput();
            case UmlPackage.EXCEPTION_HANDLER__EXCEPTION_TYPE:
                return getExceptionType();
            case UmlPackage.EXCEPTION_HANDLER__PROTECTED_NODE:
                return getProtectedNode();
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
            case UmlPackage.EXCEPTION_HANDLER__HANDLER_BODY:
                setHandlerBody((ExecutableNode)newValue);
                return;
            case UmlPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT:
                setExceptionInput((ObjectNode)newValue);
                return;
            case UmlPackage.EXCEPTION_HANDLER__EXCEPTION_TYPE:
                getExceptionType().clear();
                getExceptionType().addAll((Collection<? extends Classifier>)newValue);
                return;
            case UmlPackage.EXCEPTION_HANDLER__PROTECTED_NODE:
                setProtectedNode((ExecutableNode)newValue);
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
            case UmlPackage.EXCEPTION_HANDLER__HANDLER_BODY:
                setHandlerBody((ExecutableNode)null);
                return;
            case UmlPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT:
                setExceptionInput((ObjectNode)null);
                return;
            case UmlPackage.EXCEPTION_HANDLER__EXCEPTION_TYPE:
                getExceptionType().clear();
                return;
            case UmlPackage.EXCEPTION_HANDLER__PROTECTED_NODE:
                setProtectedNode((ExecutableNode)null);
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
            case UmlPackage.EXCEPTION_HANDLER__HANDLER_BODY:
                return handlerBody != null;
            case UmlPackage.EXCEPTION_HANDLER__EXCEPTION_INPUT:
                return exceptionInput != null;
            case UmlPackage.EXCEPTION_HANDLER__EXCEPTION_TYPE:
                return exceptionType != null && !exceptionType.isEmpty();
            case UmlPackage.EXCEPTION_HANDLER__PROTECTED_NODE:
                return getProtectedNode() != null;
        }
        return super.eIsSet(featureID);
    }

} //ExceptionHandlerImpl
