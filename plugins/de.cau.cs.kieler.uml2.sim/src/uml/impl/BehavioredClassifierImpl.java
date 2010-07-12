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
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Behavior;
import uml.BehavioredClassifier;
import uml.Interface;
import uml.InterfaceRealization;
import uml.Trigger;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behaviored Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.BehavioredClassifierImpl#getOwnedBehavior <em>Owned Behavior</em>}</li>
 *   <li>{@link uml.impl.BehavioredClassifierImpl#getClassifierBehavior <em>Classifier Behavior</em>}</li>
 *   <li>{@link uml.impl.BehavioredClassifierImpl#getInterfaceRealization <em>Interface Realization</em>}</li>
 *   <li>{@link uml.impl.BehavioredClassifierImpl#getOwnedTrigger <em>Owned Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BehavioredClassifierImpl extends ClassifierImpl implements BehavioredClassifier {
    /**
     * The cached value of the '{@link #getOwnedBehavior() <em>Owned Behavior</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedBehavior()
     * @generated
     * @ordered
     */
    protected EList<Behavior> ownedBehavior;

    /**
     * The cached value of the '{@link #getClassifierBehavior() <em>Classifier Behavior</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClassifierBehavior()
     * @generated
     * @ordered
     */
    protected Behavior classifierBehavior;

    /**
     * The cached value of the '{@link #getInterfaceRealization() <em>Interface Realization</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterfaceRealization()
     * @generated
     * @ordered
     */
    protected EList<InterfaceRealization> interfaceRealization;

    /**
     * The cached value of the '{@link #getOwnedTrigger() <em>Owned Trigger</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedTrigger()
     * @generated
     * @ordered
     */
    protected EList<Trigger> ownedTrigger;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BehavioredClassifierImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getBehavioredClassifier();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Behavior> getOwnedBehavior() {
        if (ownedBehavior == null) {
            ownedBehavior = new EObjectContainmentEList<Behavior>(Behavior.class, this, UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR);
        }
        return ownedBehavior;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Behavior getClassifierBehavior() {
        if (classifierBehavior != null && classifierBehavior.eIsProxy()) {
            InternalEObject oldClassifierBehavior = (InternalEObject)classifierBehavior;
            classifierBehavior = (Behavior)eResolveProxy(oldClassifierBehavior);
            if (classifierBehavior != oldClassifierBehavior) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR, oldClassifierBehavior, classifierBehavior));
            }
        }
        return classifierBehavior;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Behavior basicGetClassifierBehavior() {
        return classifierBehavior;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setClassifierBehavior(Behavior newClassifierBehavior) {
        Behavior oldClassifierBehavior = classifierBehavior;
        classifierBehavior = newClassifierBehavior;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR, oldClassifierBehavior, classifierBehavior));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InterfaceRealization> getInterfaceRealization() {
        if (interfaceRealization == null) {
            interfaceRealization = new EObjectContainmentWithInverseEList<InterfaceRealization>(InterfaceRealization.class, this, UmlPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION, UmlPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER);
        }
        return interfaceRealization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Trigger> getOwnedTrigger() {
        if (ownedTrigger == null) {
            ownedTrigger = new EObjectContainmentEList<Trigger>(Trigger.class, this, UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER);
        }
        return ownedTrigger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean class_behavior(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.BEHAVIORED_CLASSIFIER__CLASS_BEHAVIOR,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "class_behavior", EObjectValidator.getObjectLabel(this, context) }),
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
    public EList<Interface> getImplementedInterfaces() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Interface> getAllImplementedInterfaces() {
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
            case UmlPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterfaceRealization()).basicAdd(otherEnd, msgs);
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
            case UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR:
                return ((InternalEList<?>)getOwnedBehavior()).basicRemove(otherEnd, msgs);
            case UmlPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION:
                return ((InternalEList<?>)getInterfaceRealization()).basicRemove(otherEnd, msgs);
            case UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER:
                return ((InternalEList<?>)getOwnedTrigger()).basicRemove(otherEnd, msgs);
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
            case UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR:
                return getOwnedBehavior();
            case UmlPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR:
                if (resolve) return getClassifierBehavior();
                return basicGetClassifierBehavior();
            case UmlPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION:
                return getInterfaceRealization();
            case UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER:
                return getOwnedTrigger();
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
            case UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR:
                getOwnedBehavior().clear();
                getOwnedBehavior().addAll((Collection<? extends Behavior>)newValue);
                return;
            case UmlPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR:
                setClassifierBehavior((Behavior)newValue);
                return;
            case UmlPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION:
                getInterfaceRealization().clear();
                getInterfaceRealization().addAll((Collection<? extends InterfaceRealization>)newValue);
                return;
            case UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER:
                getOwnedTrigger().clear();
                getOwnedTrigger().addAll((Collection<? extends Trigger>)newValue);
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
            case UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR:
                getOwnedBehavior().clear();
                return;
            case UmlPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR:
                setClassifierBehavior((Behavior)null);
                return;
            case UmlPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION:
                getInterfaceRealization().clear();
                return;
            case UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER:
                getOwnedTrigger().clear();
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
            case UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR:
                return ownedBehavior != null && !ownedBehavior.isEmpty();
            case UmlPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR:
                return classifierBehavior != null;
            case UmlPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION:
                return interfaceRealization != null && !interfaceRealization.isEmpty();
            case UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER:
                return ownedTrigger != null && !ownedTrigger.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //BehavioredClassifierImpl
