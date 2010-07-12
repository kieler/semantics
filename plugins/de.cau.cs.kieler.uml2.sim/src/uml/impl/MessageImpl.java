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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Connector;
import uml.Interaction;
import uml.Message;
import uml.MessageEnd;
import uml.MessageKind;
import uml.MessageSort;
import uml.NamedElement;
import uml.UmlPackage;
import uml.ValueSpecification;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.MessageImpl#getMessageKind <em>Message Kind</em>}</li>
 *   <li>{@link uml.impl.MessageImpl#getMessageSort <em>Message Sort</em>}</li>
 *   <li>{@link uml.impl.MessageImpl#getReceiveEvent <em>Receive Event</em>}</li>
 *   <li>{@link uml.impl.MessageImpl#getSendEvent <em>Send Event</em>}</li>
 *   <li>{@link uml.impl.MessageImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link uml.impl.MessageImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link uml.impl.MessageImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link uml.impl.MessageImpl#getSignature <em>Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageImpl extends NamedElementImpl implements Message {
    /**
     * The default value of the '{@link #getMessageKind() <em>Message Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessageKind()
     * @generated
     * @ordered
     */
    protected static final MessageKind MESSAGE_KIND_EDEFAULT = MessageKind.UNKNOWN;

    /**
     * The default value of the '{@link #getMessageSort() <em>Message Sort</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessageSort()
     * @generated
     * @ordered
     */
    protected static final MessageSort MESSAGE_SORT_EDEFAULT = MessageSort.SYNCH_CALL;

    /**
     * The cached value of the '{@link #getMessageSort() <em>Message Sort</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessageSort()
     * @generated
     * @ordered
     */
    protected MessageSort messageSort = MESSAGE_SORT_EDEFAULT;

    /**
     * The cached value of the '{@link #getReceiveEvent() <em>Receive Event</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReceiveEvent()
     * @generated
     * @ordered
     */
    protected MessageEnd receiveEvent;

    /**
     * The cached value of the '{@link #getSendEvent() <em>Send Event</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSendEvent()
     * @generated
     * @ordered
     */
    protected MessageEnd sendEvent;

    /**
     * The cached value of the '{@link #getConnector() <em>Connector</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnector()
     * @generated
     * @ordered
     */
    protected Connector connector;

    /**
     * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArgument()
     * @generated
     * @ordered
     */
    protected EList<ValueSpecification> argument;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MessageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getMessage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageKind getMessageKind() {
        // TODO: implement this method to return the 'Message Kind' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageSort getMessageSort() {
        return messageSort;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMessageSort(MessageSort newMessageSort) {
        MessageSort oldMessageSort = messageSort;
        messageSort = newMessageSort == null ? MESSAGE_SORT_EDEFAULT : newMessageSort;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.MESSAGE__MESSAGE_SORT, oldMessageSort, messageSort));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageEnd getReceiveEvent() {
        if (receiveEvent != null && receiveEvent.eIsProxy()) {
            InternalEObject oldReceiveEvent = (InternalEObject)receiveEvent;
            receiveEvent = (MessageEnd)eResolveProxy(oldReceiveEvent);
            if (receiveEvent != oldReceiveEvent) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.MESSAGE__RECEIVE_EVENT, oldReceiveEvent, receiveEvent));
            }
        }
        return receiveEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageEnd basicGetReceiveEvent() {
        return receiveEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReceiveEvent(MessageEnd newReceiveEvent) {
        MessageEnd oldReceiveEvent = receiveEvent;
        receiveEvent = newReceiveEvent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.MESSAGE__RECEIVE_EVENT, oldReceiveEvent, receiveEvent));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageEnd getSendEvent() {
        if (sendEvent != null && sendEvent.eIsProxy()) {
            InternalEObject oldSendEvent = (InternalEObject)sendEvent;
            sendEvent = (MessageEnd)eResolveProxy(oldSendEvent);
            if (sendEvent != oldSendEvent) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.MESSAGE__SEND_EVENT, oldSendEvent, sendEvent));
            }
        }
        return sendEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageEnd basicGetSendEvent() {
        return sendEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSendEvent(MessageEnd newSendEvent) {
        MessageEnd oldSendEvent = sendEvent;
        sendEvent = newSendEvent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.MESSAGE__SEND_EVENT, oldSendEvent, sendEvent));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Connector getConnector() {
        if (connector != null && connector.eIsProxy()) {
            InternalEObject oldConnector = (InternalEObject)connector;
            connector = (Connector)eResolveProxy(oldConnector);
            if (connector != oldConnector) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.MESSAGE__CONNECTOR, oldConnector, connector));
            }
        }
        return connector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Connector basicGetConnector() {
        return connector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConnector(Connector newConnector) {
        Connector oldConnector = connector;
        connector = newConnector;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.MESSAGE__CONNECTOR, oldConnector, connector));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Interaction getInteraction() {
        if (eContainerFeatureID() != UmlPackage.MESSAGE__INTERACTION) return null;
        return (Interaction)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInteraction(Interaction newInteraction, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newInteraction, UmlPackage.MESSAGE__INTERACTION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInteraction(Interaction newInteraction) {
        if (newInteraction != eInternalContainer() || (eContainerFeatureID() != UmlPackage.MESSAGE__INTERACTION && newInteraction != null)) {
            if (EcoreUtil.isAncestor(this, newInteraction))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newInteraction != null)
                msgs = ((InternalEObject)newInteraction).eInverseAdd(this, UmlPackage.INTERACTION__MESSAGE, Interaction.class, msgs);
            msgs = basicSetInteraction(newInteraction, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.MESSAGE__INTERACTION, newInteraction, newInteraction));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ValueSpecification> getArgument() {
        if (argument == null) {
            argument = new EObjectContainmentEList<ValueSpecification>(ValueSpecification.class, this, UmlPackage.MESSAGE__ARGUMENT);
        }
        return argument;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NamedElement getSignature() {
        NamedElement signature = basicGetSignature();
        return signature != null && signature.eIsProxy() ? (NamedElement)eResolveProxy((InternalEObject)signature) : signature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NamedElement basicGetSignature() {
        // TODO: implement this method to return the 'Signature' reference
        // -> do not perform proxy resolution
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean sending_receiving_message_event(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.MESSAGE__SENDING_RECEIVING_MESSAGE_EVENT,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "sending_receiving_message_event", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean signature_refer_to(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.MESSAGE__SIGNATURE_REFER_TO,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "signature_refer_to", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean signature_is_operation(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.MESSAGE__SIGNATURE_IS_OPERATION,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "signature_is_operation", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean signature_is_signal(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.MESSAGE__SIGNATURE_IS_SIGNAL,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "signature_is_signal", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean arguments(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.MESSAGE__ARGUMENTS,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "arguments", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean cannot_cross_boundaries(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.MESSAGE__CANNOT_CROSS_BOUNDARIES,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "cannot_cross_boundaries", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean occurrence_specifications(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.MESSAGE__OCCURRENCE_SPECIFICATIONS,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "occurrence_specifications", EObjectValidator.getObjectLabel(this, context) }),
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
            case UmlPackage.MESSAGE__INTERACTION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetInteraction((Interaction)otherEnd, msgs);
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
            case UmlPackage.MESSAGE__INTERACTION:
                return basicSetInteraction(null, msgs);
            case UmlPackage.MESSAGE__ARGUMENT:
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
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case UmlPackage.MESSAGE__INTERACTION:
                return eInternalContainer().eInverseRemove(this, UmlPackage.INTERACTION__MESSAGE, Interaction.class, msgs);
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
            case UmlPackage.MESSAGE__MESSAGE_KIND:
                return getMessageKind();
            case UmlPackage.MESSAGE__MESSAGE_SORT:
                return getMessageSort();
            case UmlPackage.MESSAGE__RECEIVE_EVENT:
                if (resolve) return getReceiveEvent();
                return basicGetReceiveEvent();
            case UmlPackage.MESSAGE__SEND_EVENT:
                if (resolve) return getSendEvent();
                return basicGetSendEvent();
            case UmlPackage.MESSAGE__CONNECTOR:
                if (resolve) return getConnector();
                return basicGetConnector();
            case UmlPackage.MESSAGE__INTERACTION:
                return getInteraction();
            case UmlPackage.MESSAGE__ARGUMENT:
                return getArgument();
            case UmlPackage.MESSAGE__SIGNATURE:
                if (resolve) return getSignature();
                return basicGetSignature();
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
            case UmlPackage.MESSAGE__MESSAGE_SORT:
                setMessageSort((MessageSort)newValue);
                return;
            case UmlPackage.MESSAGE__RECEIVE_EVENT:
                setReceiveEvent((MessageEnd)newValue);
                return;
            case UmlPackage.MESSAGE__SEND_EVENT:
                setSendEvent((MessageEnd)newValue);
                return;
            case UmlPackage.MESSAGE__CONNECTOR:
                setConnector((Connector)newValue);
                return;
            case UmlPackage.MESSAGE__INTERACTION:
                setInteraction((Interaction)newValue);
                return;
            case UmlPackage.MESSAGE__ARGUMENT:
                getArgument().clear();
                getArgument().addAll((Collection<? extends ValueSpecification>)newValue);
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
            case UmlPackage.MESSAGE__MESSAGE_SORT:
                setMessageSort(MESSAGE_SORT_EDEFAULT);
                return;
            case UmlPackage.MESSAGE__RECEIVE_EVENT:
                setReceiveEvent((MessageEnd)null);
                return;
            case UmlPackage.MESSAGE__SEND_EVENT:
                setSendEvent((MessageEnd)null);
                return;
            case UmlPackage.MESSAGE__CONNECTOR:
                setConnector((Connector)null);
                return;
            case UmlPackage.MESSAGE__INTERACTION:
                setInteraction((Interaction)null);
                return;
            case UmlPackage.MESSAGE__ARGUMENT:
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
            case UmlPackage.MESSAGE__MESSAGE_KIND:
                return getMessageKind() != MESSAGE_KIND_EDEFAULT;
            case UmlPackage.MESSAGE__MESSAGE_SORT:
                return messageSort != MESSAGE_SORT_EDEFAULT;
            case UmlPackage.MESSAGE__RECEIVE_EVENT:
                return receiveEvent != null;
            case UmlPackage.MESSAGE__SEND_EVENT:
                return sendEvent != null;
            case UmlPackage.MESSAGE__CONNECTOR:
                return connector != null;
            case UmlPackage.MESSAGE__INTERACTION:
                return getInteraction() != null;
            case UmlPackage.MESSAGE__ARGUMENT:
                return argument != null && !argument.isEmpty();
            case UmlPackage.MESSAGE__SIGNATURE:
                return basicGetSignature() != null;
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
        result.append(" (messageSort: ");
        result.append(messageSort);
        result.append(')');
        return result.toString();
    }

} //MessageImpl
