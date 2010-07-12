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
import uml.Classifier;
import uml.Extension;
import uml.Interface;
import uml.InterfaceRealization;
import uml.Operation;
import uml.Reception;
import uml.Trigger;
import uml.Type;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ClassImpl#getOwnedBehavior <em>Owned Behavior</em>}</li>
 *   <li>{@link uml.impl.ClassImpl#getClassifierBehavior <em>Classifier Behavior</em>}</li>
 *   <li>{@link uml.impl.ClassImpl#getInterfaceRealization <em>Interface Realization</em>}</li>
 *   <li>{@link uml.impl.ClassImpl#getOwnedTrigger <em>Owned Trigger</em>}</li>
 *   <li>{@link uml.impl.ClassImpl#getNestedClassifier <em>Nested Classifier</em>}</li>
 *   <li>{@link uml.impl.ClassImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link uml.impl.ClassImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link uml.impl.ClassImpl#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link uml.impl.ClassImpl#getOwnedReception <em>Owned Reception</em>}</li>
 *   <li>{@link uml.impl.ClassImpl#getExtension <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends EncapsulatedClassifierImpl implements uml.Class {
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
     * The cached value of the '{@link #getNestedClassifier() <em>Nested Classifier</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNestedClassifier()
     * @generated
     * @ordered
     */
    protected EList<Classifier> nestedClassifier;

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
     * The default value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsActive()
     * @generated
     * @ordered
     */
    protected static final boolean IS_ACTIVE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsActive()
     * @generated
     * @ordered
     */
    protected boolean isActive = IS_ACTIVE_EDEFAULT;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ClassImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getClass_();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Behavior> getOwnedBehavior() {
        if (ownedBehavior == null) {
            ownedBehavior = new EObjectContainmentEList<Behavior>(Behavior.class, this, UmlPackage.CLASS__OWNED_BEHAVIOR);
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.CLASS__CLASSIFIER_BEHAVIOR, oldClassifierBehavior, classifierBehavior));
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CLASS__CLASSIFIER_BEHAVIOR, oldClassifierBehavior, classifierBehavior));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InterfaceRealization> getInterfaceRealization() {
        if (interfaceRealization == null) {
            interfaceRealization = new EObjectContainmentWithInverseEList<InterfaceRealization>(InterfaceRealization.class, this, UmlPackage.CLASS__INTERFACE_REALIZATION, UmlPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER);
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
            ownedTrigger = new EObjectContainmentEList<Trigger>(Trigger.class, this, UmlPackage.CLASS__OWNED_TRIGGER);
        }
        return ownedTrigger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Classifier> getNestedClassifier() {
        if (nestedClassifier == null) {
            nestedClassifier = new EObjectContainmentEList<Classifier>(Classifier.class, this, UmlPackage.CLASS__NESTED_CLASSIFIER);
        }
        return nestedClassifier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Operation> getOwnedOperation() {
        if (ownedOperation == null) {
            ownedOperation = new EObjectContainmentWithInverseEList<Operation>(Operation.class, this, UmlPackage.CLASS__OWNED_OPERATION, UmlPackage.OPERATION__CLASS);
        }
        return ownedOperation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<uml.Class> getSuperClass() {
        // TODO: implement this method to return the 'Super Class' reference list
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
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsActive(boolean newIsActive) {
        boolean oldIsActive = isActive;
        isActive = newIsActive;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CLASS__IS_ACTIVE, oldIsActive, isActive));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Reception> getOwnedReception() {
        if (ownedReception == null) {
            ownedReception = new EObjectContainmentEList<Reception>(Reception.class, this, UmlPackage.CLASS__OWNED_RECEPTION);
        }
        return ownedReception;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Extension> getExtension() {
        // TODO: implement this method to return the 'Extension' reference list
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
    public boolean passive_class(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.CLASS__PASSIVE_CLASS,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "passive_class", EObjectValidator.getObjectLabel(this, context) }),
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
    public EList<Extension> getExtensions() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
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
    public boolean isMetaclass() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
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
            case UmlPackage.CLASS__INTERFACE_REALIZATION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterfaceRealization()).basicAdd(otherEnd, msgs);
            case UmlPackage.CLASS__OWNED_OPERATION:
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
            case UmlPackage.CLASS__OWNED_BEHAVIOR:
                return ((InternalEList<?>)getOwnedBehavior()).basicRemove(otherEnd, msgs);
            case UmlPackage.CLASS__INTERFACE_REALIZATION:
                return ((InternalEList<?>)getInterfaceRealization()).basicRemove(otherEnd, msgs);
            case UmlPackage.CLASS__OWNED_TRIGGER:
                return ((InternalEList<?>)getOwnedTrigger()).basicRemove(otherEnd, msgs);
            case UmlPackage.CLASS__NESTED_CLASSIFIER:
                return ((InternalEList<?>)getNestedClassifier()).basicRemove(otherEnd, msgs);
            case UmlPackage.CLASS__OWNED_OPERATION:
                return ((InternalEList<?>)getOwnedOperation()).basicRemove(otherEnd, msgs);
            case UmlPackage.CLASS__OWNED_RECEPTION:
                return ((InternalEList<?>)getOwnedReception()).basicRemove(otherEnd, msgs);
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
            case UmlPackage.CLASS__OWNED_BEHAVIOR:
                return getOwnedBehavior();
            case UmlPackage.CLASS__CLASSIFIER_BEHAVIOR:
                if (resolve) return getClassifierBehavior();
                return basicGetClassifierBehavior();
            case UmlPackage.CLASS__INTERFACE_REALIZATION:
                return getInterfaceRealization();
            case UmlPackage.CLASS__OWNED_TRIGGER:
                return getOwnedTrigger();
            case UmlPackage.CLASS__NESTED_CLASSIFIER:
                return getNestedClassifier();
            case UmlPackage.CLASS__OWNED_OPERATION:
                return getOwnedOperation();
            case UmlPackage.CLASS__SUPER_CLASS:
                return getSuperClass();
            case UmlPackage.CLASS__IS_ACTIVE:
                return isIsActive();
            case UmlPackage.CLASS__OWNED_RECEPTION:
                return getOwnedReception();
            case UmlPackage.CLASS__EXTENSION:
                return getExtension();
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
            case UmlPackage.CLASS__OWNED_BEHAVIOR:
                getOwnedBehavior().clear();
                getOwnedBehavior().addAll((Collection<? extends Behavior>)newValue);
                return;
            case UmlPackage.CLASS__CLASSIFIER_BEHAVIOR:
                setClassifierBehavior((Behavior)newValue);
                return;
            case UmlPackage.CLASS__INTERFACE_REALIZATION:
                getInterfaceRealization().clear();
                getInterfaceRealization().addAll((Collection<? extends InterfaceRealization>)newValue);
                return;
            case UmlPackage.CLASS__OWNED_TRIGGER:
                getOwnedTrigger().clear();
                getOwnedTrigger().addAll((Collection<? extends Trigger>)newValue);
                return;
            case UmlPackage.CLASS__NESTED_CLASSIFIER:
                getNestedClassifier().clear();
                getNestedClassifier().addAll((Collection<? extends Classifier>)newValue);
                return;
            case UmlPackage.CLASS__OWNED_OPERATION:
                getOwnedOperation().clear();
                getOwnedOperation().addAll((Collection<? extends Operation>)newValue);
                return;
            case UmlPackage.CLASS__SUPER_CLASS:
                getSuperClass().clear();
                getSuperClass().addAll((Collection<? extends uml.Class>)newValue);
                return;
            case UmlPackage.CLASS__IS_ACTIVE:
                setIsActive((Boolean)newValue);
                return;
            case UmlPackage.CLASS__OWNED_RECEPTION:
                getOwnedReception().clear();
                getOwnedReception().addAll((Collection<? extends Reception>)newValue);
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
            case UmlPackage.CLASS__OWNED_BEHAVIOR:
                getOwnedBehavior().clear();
                return;
            case UmlPackage.CLASS__CLASSIFIER_BEHAVIOR:
                setClassifierBehavior((Behavior)null);
                return;
            case UmlPackage.CLASS__INTERFACE_REALIZATION:
                getInterfaceRealization().clear();
                return;
            case UmlPackage.CLASS__OWNED_TRIGGER:
                getOwnedTrigger().clear();
                return;
            case UmlPackage.CLASS__NESTED_CLASSIFIER:
                getNestedClassifier().clear();
                return;
            case UmlPackage.CLASS__OWNED_OPERATION:
                getOwnedOperation().clear();
                return;
            case UmlPackage.CLASS__SUPER_CLASS:
                getSuperClass().clear();
                return;
            case UmlPackage.CLASS__IS_ACTIVE:
                setIsActive(IS_ACTIVE_EDEFAULT);
                return;
            case UmlPackage.CLASS__OWNED_RECEPTION:
                getOwnedReception().clear();
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
            case UmlPackage.CLASS__OWNED_BEHAVIOR:
                return ownedBehavior != null && !ownedBehavior.isEmpty();
            case UmlPackage.CLASS__CLASSIFIER_BEHAVIOR:
                return classifierBehavior != null;
            case UmlPackage.CLASS__INTERFACE_REALIZATION:
                return interfaceRealization != null && !interfaceRealization.isEmpty();
            case UmlPackage.CLASS__OWNED_TRIGGER:
                return ownedTrigger != null && !ownedTrigger.isEmpty();
            case UmlPackage.CLASS__NESTED_CLASSIFIER:
                return nestedClassifier != null && !nestedClassifier.isEmpty();
            case UmlPackage.CLASS__OWNED_OPERATION:
                return ownedOperation != null && !ownedOperation.isEmpty();
            case UmlPackage.CLASS__SUPER_CLASS:
                return !getSuperClass().isEmpty();
            case UmlPackage.CLASS__IS_ACTIVE:
                return isActive != IS_ACTIVE_EDEFAULT;
            case UmlPackage.CLASS__OWNED_RECEPTION:
                return ownedReception != null && !ownedReception.isEmpty();
            case UmlPackage.CLASS__EXTENSION:
                return !getExtension().isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == BehavioredClassifier.class) {
            switch (derivedFeatureID) {
                case UmlPackage.CLASS__OWNED_BEHAVIOR: return UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR;
                case UmlPackage.CLASS__CLASSIFIER_BEHAVIOR: return UmlPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR;
                case UmlPackage.CLASS__INTERFACE_REALIZATION: return UmlPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION;
                case UmlPackage.CLASS__OWNED_TRIGGER: return UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == BehavioredClassifier.class) {
            switch (baseFeatureID) {
                case UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR: return UmlPackage.CLASS__OWNED_BEHAVIOR;
                case UmlPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR: return UmlPackage.CLASS__CLASSIFIER_BEHAVIOR;
                case UmlPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION: return UmlPackage.CLASS__INTERFACE_REALIZATION;
                case UmlPackage.BEHAVIORED_CLASSIFIER__OWNED_TRIGGER: return UmlPackage.CLASS__OWNED_TRIGGER;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
        result.append(" (isActive: ");
        result.append(isActive);
        result.append(')');
        return result.toString();
    }

} //ClassImpl
