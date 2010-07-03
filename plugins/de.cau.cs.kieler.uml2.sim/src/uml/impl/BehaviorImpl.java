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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Behavior;
import uml.BehavioralFeature;
import uml.BehavioredClassifier;
import uml.Constraint;
import uml.Parameter;
import uml.ParameterSet;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.BehaviorImpl#isIsReentrant <em>Is Reentrant</em>}</li>
 *   <li>{@link uml.impl.BehaviorImpl#getRedefinedBehavior <em>Redefined Behavior</em>}</li>
 *   <li>{@link uml.impl.BehaviorImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link uml.impl.BehaviorImpl#getContext <em>Context</em>}</li>
 *   <li>{@link uml.impl.BehaviorImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link uml.impl.BehaviorImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link uml.impl.BehaviorImpl#getOwnedParameterSet <em>Owned Parameter Set</em>}</li>
 *   <li>{@link uml.impl.BehaviorImpl#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BehaviorImpl extends ClassImpl implements Behavior {
    /**
     * The default value of the '{@link #isIsReentrant() <em>Is Reentrant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsReentrant()
     * @generated
     * @ordered
     */
    protected static final boolean IS_REENTRANT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsReentrant() <em>Is Reentrant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsReentrant()
     * @generated
     * @ordered
     */
    protected boolean isReentrant = IS_REENTRANT_EDEFAULT;

    /**
     * The cached value of the '{@link #getRedefinedBehavior() <em>Redefined Behavior</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRedefinedBehavior()
     * @generated
     * @ordered
     */
    protected EList<Behavior> redefinedBehavior;

    /**
     * The cached value of the '{@link #getOwnedParameter() <em>Owned Parameter</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedParameter()
     * @generated
     * @ordered
     */
    protected EList<Parameter> ownedParameter;

    /**
     * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrecondition()
     * @generated
     * @ordered
     */
    protected EList<Constraint> precondition;

    /**
     * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPostcondition()
     * @generated
     * @ordered
     */
    protected EList<Constraint> postcondition;

    /**
     * The cached value of the '{@link #getOwnedParameterSet() <em>Owned Parameter Set</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedParameterSet()
     * @generated
     * @ordered
     */
    protected EList<ParameterSet> ownedParameterSet;

    /**
     * The cached value of the '{@link #getSpecification() <em>Specification</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecification()
     * @generated
     * @ordered
     */
    protected BehavioralFeature specification;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BehaviorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getBehavior();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsReentrant() {
        return isReentrant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsReentrant(boolean newIsReentrant) {
        boolean oldIsReentrant = isReentrant;
        isReentrant = newIsReentrant;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.BEHAVIOR__IS_REENTRANT, oldIsReentrant, isReentrant));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Behavior> getRedefinedBehavior() {
        if (redefinedBehavior == null) {
            redefinedBehavior = new EObjectResolvingEList<Behavior>(Behavior.class, this, UmlPackage.BEHAVIOR__REDEFINED_BEHAVIOR);
        }
        return redefinedBehavior;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Parameter> getOwnedParameter() {
        if (ownedParameter == null) {
            ownedParameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, UmlPackage.BEHAVIOR__OWNED_PARAMETER);
        }
        return ownedParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehavioredClassifier getContext() {
        BehavioredClassifier context = basicGetContext();
        return context != null && context.eIsProxy() ? (BehavioredClassifier)eResolveProxy((InternalEObject)context) : context;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehavioredClassifier basicGetContext() {
        // TODO: implement this method to return the 'Context' reference
        // -> do not perform proxy resolution
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Constraint> getPrecondition() {
        if (precondition == null) {
            precondition = new EObjectResolvingEList<Constraint>(Constraint.class, this, UmlPackage.BEHAVIOR__PRECONDITION);
        }
        return precondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Constraint> getPostcondition() {
        if (postcondition == null) {
            postcondition = new EObjectResolvingEList<Constraint>(Constraint.class, this, UmlPackage.BEHAVIOR__POSTCONDITION);
        }
        return postcondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ParameterSet> getOwnedParameterSet() {
        if (ownedParameterSet == null) {
            ownedParameterSet = new EObjectContainmentEList<ParameterSet>(ParameterSet.class, this, UmlPackage.BEHAVIOR__OWNED_PARAMETER_SET);
        }
        return ownedParameterSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehavioralFeature getSpecification() {
        if (specification != null && specification.eIsProxy()) {
            InternalEObject oldSpecification = (InternalEObject)specification;
            specification = (BehavioralFeature)eResolveProxy(oldSpecification);
            if (specification != oldSpecification) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.BEHAVIOR__SPECIFICATION, oldSpecification, specification));
            }
        }
        return specification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehavioralFeature basicGetSpecification() {
        return specification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSpecification(BehavioralFeature newSpecification, NotificationChain msgs) {
        BehavioralFeature oldSpecification = specification;
        specification = newSpecification;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.BEHAVIOR__SPECIFICATION, oldSpecification, newSpecification);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSpecification(BehavioralFeature newSpecification) {
        if (newSpecification != specification) {
            NotificationChain msgs = null;
            if (specification != null)
                msgs = ((InternalEObject)specification).eInverseRemove(this, UmlPackage.BEHAVIORAL_FEATURE__METHOD, BehavioralFeature.class, msgs);
            if (newSpecification != null)
                msgs = ((InternalEObject)newSpecification).eInverseAdd(this, UmlPackage.BEHAVIORAL_FEATURE__METHOD, BehavioralFeature.class, msgs);
            msgs = basicSetSpecification(newSpecification, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.BEHAVIOR__SPECIFICATION, newSpecification, newSpecification));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean parameters_match(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.BEHAVIOR__PARAMETERS_MATCH,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "parameters_match", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean feature_of_context_classifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.BEHAVIOR__FEATURE_OF_CONTEXT_CLASSIFIER,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "feature_of_context_classifier", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean must_realize(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.BEHAVIOR__MUST_REALIZE,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "must_realize", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean most_one_behaviour(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.BEHAVIOR__MOST_ONE_BEHAVIOUR,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "most_one_behaviour", EObjectValidator.getObjectLabel(this, context) }),
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
            case UmlPackage.BEHAVIOR__SPECIFICATION:
                if (specification != null)
                    msgs = ((InternalEObject)specification).eInverseRemove(this, UmlPackage.BEHAVIORAL_FEATURE__METHOD, BehavioralFeature.class, msgs);
                return basicSetSpecification((BehavioralFeature)otherEnd, msgs);
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
            case UmlPackage.BEHAVIOR__OWNED_PARAMETER:
                return ((InternalEList<?>)getOwnedParameter()).basicRemove(otherEnd, msgs);
            case UmlPackage.BEHAVIOR__OWNED_PARAMETER_SET:
                return ((InternalEList<?>)getOwnedParameterSet()).basicRemove(otherEnd, msgs);
            case UmlPackage.BEHAVIOR__SPECIFICATION:
                return basicSetSpecification(null, msgs);
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
            case UmlPackage.BEHAVIOR__IS_REENTRANT:
                return isIsReentrant();
            case UmlPackage.BEHAVIOR__REDEFINED_BEHAVIOR:
                return getRedefinedBehavior();
            case UmlPackage.BEHAVIOR__OWNED_PARAMETER:
                return getOwnedParameter();
            case UmlPackage.BEHAVIOR__CONTEXT:
                if (resolve) return getContext();
                return basicGetContext();
            case UmlPackage.BEHAVIOR__PRECONDITION:
                return getPrecondition();
            case UmlPackage.BEHAVIOR__POSTCONDITION:
                return getPostcondition();
            case UmlPackage.BEHAVIOR__OWNED_PARAMETER_SET:
                return getOwnedParameterSet();
            case UmlPackage.BEHAVIOR__SPECIFICATION:
                if (resolve) return getSpecification();
                return basicGetSpecification();
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
            case UmlPackage.BEHAVIOR__IS_REENTRANT:
                setIsReentrant((Boolean)newValue);
                return;
            case UmlPackage.BEHAVIOR__REDEFINED_BEHAVIOR:
                getRedefinedBehavior().clear();
                getRedefinedBehavior().addAll((Collection<? extends Behavior>)newValue);
                return;
            case UmlPackage.BEHAVIOR__OWNED_PARAMETER:
                getOwnedParameter().clear();
                getOwnedParameter().addAll((Collection<? extends Parameter>)newValue);
                return;
            case UmlPackage.BEHAVIOR__PRECONDITION:
                getPrecondition().clear();
                getPrecondition().addAll((Collection<? extends Constraint>)newValue);
                return;
            case UmlPackage.BEHAVIOR__POSTCONDITION:
                getPostcondition().clear();
                getPostcondition().addAll((Collection<? extends Constraint>)newValue);
                return;
            case UmlPackage.BEHAVIOR__OWNED_PARAMETER_SET:
                getOwnedParameterSet().clear();
                getOwnedParameterSet().addAll((Collection<? extends ParameterSet>)newValue);
                return;
            case UmlPackage.BEHAVIOR__SPECIFICATION:
                setSpecification((BehavioralFeature)newValue);
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
            case UmlPackage.BEHAVIOR__IS_REENTRANT:
                setIsReentrant(IS_REENTRANT_EDEFAULT);
                return;
            case UmlPackage.BEHAVIOR__REDEFINED_BEHAVIOR:
                getRedefinedBehavior().clear();
                return;
            case UmlPackage.BEHAVIOR__OWNED_PARAMETER:
                getOwnedParameter().clear();
                return;
            case UmlPackage.BEHAVIOR__PRECONDITION:
                getPrecondition().clear();
                return;
            case UmlPackage.BEHAVIOR__POSTCONDITION:
                getPostcondition().clear();
                return;
            case UmlPackage.BEHAVIOR__OWNED_PARAMETER_SET:
                getOwnedParameterSet().clear();
                return;
            case UmlPackage.BEHAVIOR__SPECIFICATION:
                setSpecification((BehavioralFeature)null);
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
            case UmlPackage.BEHAVIOR__IS_REENTRANT:
                return isReentrant != IS_REENTRANT_EDEFAULT;
            case UmlPackage.BEHAVIOR__REDEFINED_BEHAVIOR:
                return redefinedBehavior != null && !redefinedBehavior.isEmpty();
            case UmlPackage.BEHAVIOR__OWNED_PARAMETER:
                return ownedParameter != null && !ownedParameter.isEmpty();
            case UmlPackage.BEHAVIOR__CONTEXT:
                return basicGetContext() != null;
            case UmlPackage.BEHAVIOR__PRECONDITION:
                return precondition != null && !precondition.isEmpty();
            case UmlPackage.BEHAVIOR__POSTCONDITION:
                return postcondition != null && !postcondition.isEmpty();
            case UmlPackage.BEHAVIOR__OWNED_PARAMETER_SET:
                return ownedParameterSet != null && !ownedParameterSet.isEmpty();
            case UmlPackage.BEHAVIOR__SPECIFICATION:
                return specification != null;
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
        result.append(" (isReentrant: ");
        result.append(isReentrant);
        result.append(')');
        return result.toString();
    }

} //BehaviorImpl
