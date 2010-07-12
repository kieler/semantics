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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Classifier;
import uml.Interface;
import uml.Operation;
import uml.Property;
import uml.ProtocolStateMachine;
import uml.Reception;
import uml.Type;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.InterfaceImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link uml.impl.InterfaceImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link uml.impl.InterfaceImpl#getNestedClassifier <em>Nested Classifier</em>}</li>
 *   <li>{@link uml.impl.InterfaceImpl#getRedefinedInterface <em>Redefined Interface</em>}</li>
 *   <li>{@link uml.impl.InterfaceImpl#getOwnedReception <em>Owned Reception</em>}</li>
 *   <li>{@link uml.impl.InterfaceImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceImpl extends ClassifierImpl implements Interface {
    /**
     * The cached value of the '{@link #getOwnedAttribute() <em>Owned Attribute</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedAttribute()
     * @generated
     * @ordered
     */
    protected EList<Property> ownedAttribute;

    /**
     * The cached value of the '{@link #getOwnedOperation() <em>Owned Operation</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedOperation()
     * @generated
     * @ordered
     */
    protected EList<Operation> ownedOperation;

    /**
     * The cached value of the '{@link #getNestedClassifier() <em>Nested Classifier</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNestedClassifier()
     * @generated
     * @ordered
     */
    protected EList<Classifier> nestedClassifier;

    /**
     * The cached value of the '{@link #getRedefinedInterface() <em>Redefined Interface</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRedefinedInterface()
     * @generated
     * @ordered
     */
    protected EList<Interface> redefinedInterface;

    /**
     * The cached value of the '{@link #getOwnedReception() <em>Owned Reception</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedReception()
     * @generated
     * @ordered
     */
    protected EList<Reception> ownedReception;

    /**
     * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' containment reference.
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
    protected InterfaceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getInterface();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Property> getOwnedAttribute() {
        if (ownedAttribute == null) {
            ownedAttribute = new EObjectContainmentEList<Property>(Property.class, this, UmlPackage.INTERFACE__OWNED_ATTRIBUTE);
        }
        return ownedAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Operation> getOwnedOperation() {
        if (ownedOperation == null) {
            ownedOperation = new EObjectContainmentWithInverseEList<Operation>(Operation.class, this, UmlPackage.INTERFACE__OWNED_OPERATION, UmlPackage.OPERATION__INTERFACE);
        }
        return ownedOperation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Classifier> getNestedClassifier() {
        if (nestedClassifier == null) {
            nestedClassifier = new EObjectContainmentEList<Classifier>(Classifier.class, this, UmlPackage.INTERFACE__NESTED_CLASSIFIER);
        }
        return nestedClassifier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Interface> getRedefinedInterface() {
        if (redefinedInterface == null) {
            redefinedInterface = new EObjectResolvingEList<Interface>(Interface.class, this, UmlPackage.INTERFACE__REDEFINED_INTERFACE);
        }
        return redefinedInterface;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Reception> getOwnedReception() {
        if (ownedReception == null) {
            ownedReception = new EObjectContainmentEList<Reception>(Reception.class, this, UmlPackage.INTERFACE__OWNED_RECEPTION);
        }
        return ownedReception;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProtocolStateMachine getProtocol() {
        return protocol;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProtocol(ProtocolStateMachine newProtocol, NotificationChain msgs) {
        ProtocolStateMachine oldProtocol = protocol;
        protocol = newProtocol;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.INTERFACE__PROTOCOL, oldProtocol, newProtocol);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProtocol(ProtocolStateMachine newProtocol) {
        if (newProtocol != protocol) {
            NotificationChain msgs = null;
            if (protocol != null)
                msgs = ((InternalEObject)protocol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.INTERFACE__PROTOCOL, null, msgs);
            if (newProtocol != null)
                msgs = ((InternalEObject)newProtocol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.INTERFACE__PROTOCOL, null, msgs);
            msgs = basicSetProtocol(newProtocol, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INTERFACE__PROTOCOL, newProtocol, newProtocol));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean visibility(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.INTERFACE__VISIBILITY,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "visibility", EObjectValidator.getObjectLabel(this, context) }),
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
    public Operation createOwnedOperation(String name, EList<String> parameterNames, EList<Type> parameterTypes, Type returnType) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Property createOwnedAttribute(String name, Type type, int lower, int upper) {
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
            case UmlPackage.INTERFACE__OWNED_OPERATION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedOperation()).basicAdd(otherEnd, msgs);
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
            case UmlPackage.INTERFACE__OWNED_ATTRIBUTE:
                return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
            case UmlPackage.INTERFACE__OWNED_OPERATION:
                return ((InternalEList<?>)getOwnedOperation()).basicRemove(otherEnd, msgs);
            case UmlPackage.INTERFACE__NESTED_CLASSIFIER:
                return ((InternalEList<?>)getNestedClassifier()).basicRemove(otherEnd, msgs);
            case UmlPackage.INTERFACE__OWNED_RECEPTION:
                return ((InternalEList<?>)getOwnedReception()).basicRemove(otherEnd, msgs);
            case UmlPackage.INTERFACE__PROTOCOL:
                return basicSetProtocol(null, msgs);
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
            case UmlPackage.INTERFACE__OWNED_ATTRIBUTE:
                return getOwnedAttribute();
            case UmlPackage.INTERFACE__OWNED_OPERATION:
                return getOwnedOperation();
            case UmlPackage.INTERFACE__NESTED_CLASSIFIER:
                return getNestedClassifier();
            case UmlPackage.INTERFACE__REDEFINED_INTERFACE:
                return getRedefinedInterface();
            case UmlPackage.INTERFACE__OWNED_RECEPTION:
                return getOwnedReception();
            case UmlPackage.INTERFACE__PROTOCOL:
                return getProtocol();
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
            case UmlPackage.INTERFACE__OWNED_ATTRIBUTE:
                getOwnedAttribute().clear();
                getOwnedAttribute().addAll((Collection<? extends Property>)newValue);
                return;
            case UmlPackage.INTERFACE__OWNED_OPERATION:
                getOwnedOperation().clear();
                getOwnedOperation().addAll((Collection<? extends Operation>)newValue);
                return;
            case UmlPackage.INTERFACE__NESTED_CLASSIFIER:
                getNestedClassifier().clear();
                getNestedClassifier().addAll((Collection<? extends Classifier>)newValue);
                return;
            case UmlPackage.INTERFACE__REDEFINED_INTERFACE:
                getRedefinedInterface().clear();
                getRedefinedInterface().addAll((Collection<? extends Interface>)newValue);
                return;
            case UmlPackage.INTERFACE__OWNED_RECEPTION:
                getOwnedReception().clear();
                getOwnedReception().addAll((Collection<? extends Reception>)newValue);
                return;
            case UmlPackage.INTERFACE__PROTOCOL:
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
            case UmlPackage.INTERFACE__OWNED_ATTRIBUTE:
                getOwnedAttribute().clear();
                return;
            case UmlPackage.INTERFACE__OWNED_OPERATION:
                getOwnedOperation().clear();
                return;
            case UmlPackage.INTERFACE__NESTED_CLASSIFIER:
                getNestedClassifier().clear();
                return;
            case UmlPackage.INTERFACE__REDEFINED_INTERFACE:
                getRedefinedInterface().clear();
                return;
            case UmlPackage.INTERFACE__OWNED_RECEPTION:
                getOwnedReception().clear();
                return;
            case UmlPackage.INTERFACE__PROTOCOL:
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
            case UmlPackage.INTERFACE__OWNED_ATTRIBUTE:
                return ownedAttribute != null && !ownedAttribute.isEmpty();
            case UmlPackage.INTERFACE__OWNED_OPERATION:
                return ownedOperation != null && !ownedOperation.isEmpty();
            case UmlPackage.INTERFACE__NESTED_CLASSIFIER:
                return nestedClassifier != null && !nestedClassifier.isEmpty();
            case UmlPackage.INTERFACE__REDEFINED_INTERFACE:
                return redefinedInterface != null && !redefinedInterface.isEmpty();
            case UmlPackage.INTERFACE__OWNED_RECEPTION:
                return ownedReception != null && !ownedReception.isEmpty();
            case UmlPackage.INTERFACE__PROTOCOL:
                return protocol != null;
        }
        return super.eIsSet(featureID);
    }

} //InterfaceImpl
