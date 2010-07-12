/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import uml.ProtocolConformance;
import uml.ProtocolStateMachine;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol Conformance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ProtocolConformanceImpl#getGeneralMachine <em>General Machine</em>}</li>
 *   <li>{@link uml.impl.ProtocolConformanceImpl#getSpecificMachine <em>Specific Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolConformanceImpl extends DirectedRelationshipImpl implements ProtocolConformance {
    /**
     * The cached value of the '{@link #getGeneralMachine() <em>General Machine</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeneralMachine()
     * @generated
     * @ordered
     */
    protected ProtocolStateMachine generalMachine;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProtocolConformanceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getProtocolConformance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProtocolStateMachine getGeneralMachine() {
        if (generalMachine != null && generalMachine.eIsProxy()) {
            InternalEObject oldGeneralMachine = (InternalEObject)generalMachine;
            generalMachine = (ProtocolStateMachine)eResolveProxy(oldGeneralMachine);
            if (generalMachine != oldGeneralMachine) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE, oldGeneralMachine, generalMachine));
            }
        }
        return generalMachine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProtocolStateMachine basicGetGeneralMachine() {
        return generalMachine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGeneralMachine(ProtocolStateMachine newGeneralMachine) {
        ProtocolStateMachine oldGeneralMachine = generalMachine;
        generalMachine = newGeneralMachine;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE, oldGeneralMachine, generalMachine));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProtocolStateMachine getSpecificMachine() {
        if (eContainerFeatureID() != UmlPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE) return null;
        return (ProtocolStateMachine)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSpecificMachine(ProtocolStateMachine newSpecificMachine, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newSpecificMachine, UmlPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSpecificMachine(ProtocolStateMachine newSpecificMachine) {
        if (newSpecificMachine != eInternalContainer() || (eContainerFeatureID() != UmlPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE && newSpecificMachine != null)) {
            if (EcoreUtil.isAncestor(this, newSpecificMachine))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newSpecificMachine != null)
                msgs = ((InternalEObject)newSpecificMachine).eInverseAdd(this, UmlPackage.PROTOCOL_STATE_MACHINE__CONFORMANCE, ProtocolStateMachine.class, msgs);
            msgs = basicSetSpecificMachine(newSpecificMachine, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE, newSpecificMachine, newSpecificMachine));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetSpecificMachine((ProtocolStateMachine)otherEnd, msgs);
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
            case UmlPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE:
                return basicSetSpecificMachine(null, msgs);
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
            case UmlPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE:
                return eInternalContainer().eInverseRemove(this, UmlPackage.PROTOCOL_STATE_MACHINE__CONFORMANCE, ProtocolStateMachine.class, msgs);
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
            case UmlPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE:
                if (resolve) return getGeneralMachine();
                return basicGetGeneralMachine();
            case UmlPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE:
                return getSpecificMachine();
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
            case UmlPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE:
                setGeneralMachine((ProtocolStateMachine)newValue);
                return;
            case UmlPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE:
                setSpecificMachine((ProtocolStateMachine)newValue);
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
            case UmlPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE:
                setGeneralMachine((ProtocolStateMachine)null);
                return;
            case UmlPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE:
                setSpecificMachine((ProtocolStateMachine)null);
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
            case UmlPackage.PROTOCOL_CONFORMANCE__GENERAL_MACHINE:
                return generalMachine != null;
            case UmlPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE:
                return getSpecificMachine() != null;
        }
        return super.eIsSet(featureID);
    }

} //ProtocolConformanceImpl
