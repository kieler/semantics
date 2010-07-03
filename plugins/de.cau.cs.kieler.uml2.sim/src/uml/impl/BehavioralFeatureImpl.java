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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Behavior;
import uml.BehavioralFeature;
import uml.CallConcurrencyKind;
import uml.Classifier;
import uml.Feature;
import uml.Parameter;
import uml.ParameterSet;
import uml.RedefinableElement;
import uml.Type;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.BehavioralFeatureImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link uml.impl.BehavioralFeatureImpl#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link uml.impl.BehavioralFeatureImpl#getRedefinitionContext <em>Redefinition Context</em>}</li>
 *   <li>{@link uml.impl.BehavioralFeatureImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link uml.impl.BehavioralFeatureImpl#getFeaturingClassifier <em>Featuring Classifier</em>}</li>
 *   <li>{@link uml.impl.BehavioralFeatureImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link uml.impl.BehavioralFeatureImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link uml.impl.BehavioralFeatureImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link uml.impl.BehavioralFeatureImpl#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link uml.impl.BehavioralFeatureImpl#getRaisedException <em>Raised Exception</em>}</li>
 *   <li>{@link uml.impl.BehavioralFeatureImpl#getOwnedParameterSet <em>Owned Parameter Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BehavioralFeatureImpl extends NamespaceImpl implements BehavioralFeature {
    /**
     * The default value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsLeaf()
     * @generated
     * @ordered
     */
    protected static final boolean IS_LEAF_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsLeaf()
     * @generated
     * @ordered
     */
    protected boolean isLeaf = IS_LEAF_EDEFAULT;

    /**
     * The default value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsStatic()
     * @generated
     * @ordered
     */
    protected static final boolean IS_STATIC_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsStatic()
     * @generated
     * @ordered
     */
    protected boolean isStatic = IS_STATIC_EDEFAULT;

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
     * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsAbstract()
     * @generated
     * @ordered
     */
    protected static final boolean IS_ABSTRACT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsAbstract()
     * @generated
     * @ordered
     */
    protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

    /**
     * The cached value of the '{@link #getMethod() <em>Method</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMethod()
     * @generated
     * @ordered
     */
    protected EList<Behavior> method;

    /**
     * The default value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConcurrency()
     * @generated
     * @ordered
     */
    protected static final CallConcurrencyKind CONCURRENCY_EDEFAULT = CallConcurrencyKind.SEQUENTIAL;

    /**
     * The cached value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConcurrency()
     * @generated
     * @ordered
     */
    protected CallConcurrencyKind concurrency = CONCURRENCY_EDEFAULT;

    /**
     * The cached value of the '{@link #getRaisedException() <em>Raised Exception</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRaisedException()
     * @generated
     * @ordered
     */
    protected EList<Type> raisedException;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BehavioralFeatureImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getBehavioralFeature();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsLeaf() {
        return isLeaf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsLeaf(boolean newIsLeaf) {
        boolean oldIsLeaf = isLeaf;
        isLeaf = newIsLeaf;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.BEHAVIORAL_FEATURE__IS_LEAF, oldIsLeaf, isLeaf));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RedefinableElement> getRedefinedElement() {
        // TODO: implement this method to return the 'Redefined Element' reference list
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
    public EList<Classifier> getRedefinitionContext() {
        // TODO: implement this method to return the 'Redefinition Context' reference list
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
    public boolean isIsStatic() {
        return isStatic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsStatic(boolean newIsStatic) {
        boolean oldIsStatic = isStatic;
        isStatic = newIsStatic;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.BEHAVIORAL_FEATURE__IS_STATIC, oldIsStatic, isStatic));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Classifier> getFeaturingClassifier() {
        // TODO: implement this method to return the 'Featuring Classifier' reference list
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
    public EList<Parameter> getOwnedParameter() {
        if (ownedParameter == null) {
            ownedParameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, UmlPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER);
        }
        return ownedParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsAbstract() {
        return isAbstract;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsAbstract(boolean newIsAbstract) {
        boolean oldIsAbstract = isAbstract;
        isAbstract = newIsAbstract;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT, oldIsAbstract, isAbstract));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Behavior> getMethod() {
        if (method == null) {
            method = new EObjectWithInverseResolvingEList<Behavior>(Behavior.class, this, UmlPackage.BEHAVIORAL_FEATURE__METHOD, UmlPackage.BEHAVIOR__SPECIFICATION);
        }
        return method;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CallConcurrencyKind getConcurrency() {
        return concurrency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConcurrency(CallConcurrencyKind newConcurrency) {
        CallConcurrencyKind oldConcurrency = concurrency;
        concurrency = newConcurrency == null ? CONCURRENCY_EDEFAULT : newConcurrency;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.BEHAVIORAL_FEATURE__CONCURRENCY, oldConcurrency, concurrency));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Type> getRaisedException() {
        if (raisedException == null) {
            raisedException = new EObjectResolvingEList<Type>(Type.class, this, UmlPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION);
        }
        return raisedException;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ParameterSet> getOwnedParameterSet() {
        if (ownedParameterSet == null) {
            ownedParameterSet = new EObjectContainmentEList<ParameterSet>(ParameterSet.class, this, UmlPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET);
        }
        return ownedParameterSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Parameter createReturnResult(String name, Type type) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean redefinition_context_valid(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT_VALID,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "redefinition_context_valid", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean redefinition_consistent(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.REDEFINABLE_ELEMENT__REDEFINITION_CONSISTENT,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "redefinition_consistent", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean isConsistentWith(RedefinableElement redefinee) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isRedefinitionContextValid(RedefinableElement redefined) {
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
            case UmlPackage.BEHAVIORAL_FEATURE__METHOD:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethod()).basicAdd(otherEnd, msgs);
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
            case UmlPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER:
                return ((InternalEList<?>)getOwnedParameter()).basicRemove(otherEnd, msgs);
            case UmlPackage.BEHAVIORAL_FEATURE__METHOD:
                return ((InternalEList<?>)getMethod()).basicRemove(otherEnd, msgs);
            case UmlPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET:
                return ((InternalEList<?>)getOwnedParameterSet()).basicRemove(otherEnd, msgs);
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
            case UmlPackage.BEHAVIORAL_FEATURE__IS_LEAF:
                return isIsLeaf();
            case UmlPackage.BEHAVIORAL_FEATURE__REDEFINED_ELEMENT:
                return getRedefinedElement();
            case UmlPackage.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT:
                return getRedefinitionContext();
            case UmlPackage.BEHAVIORAL_FEATURE__IS_STATIC:
                return isIsStatic();
            case UmlPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER:
                return getFeaturingClassifier();
            case UmlPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER:
                return getOwnedParameter();
            case UmlPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT:
                return isIsAbstract();
            case UmlPackage.BEHAVIORAL_FEATURE__METHOD:
                return getMethod();
            case UmlPackage.BEHAVIORAL_FEATURE__CONCURRENCY:
                return getConcurrency();
            case UmlPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
                return getRaisedException();
            case UmlPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET:
                return getOwnedParameterSet();
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
            case UmlPackage.BEHAVIORAL_FEATURE__IS_LEAF:
                setIsLeaf((Boolean)newValue);
                return;
            case UmlPackage.BEHAVIORAL_FEATURE__IS_STATIC:
                setIsStatic((Boolean)newValue);
                return;
            case UmlPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER:
                getOwnedParameter().clear();
                getOwnedParameter().addAll((Collection<? extends Parameter>)newValue);
                return;
            case UmlPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT:
                setIsAbstract((Boolean)newValue);
                return;
            case UmlPackage.BEHAVIORAL_FEATURE__METHOD:
                getMethod().clear();
                getMethod().addAll((Collection<? extends Behavior>)newValue);
                return;
            case UmlPackage.BEHAVIORAL_FEATURE__CONCURRENCY:
                setConcurrency((CallConcurrencyKind)newValue);
                return;
            case UmlPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
                getRaisedException().clear();
                getRaisedException().addAll((Collection<? extends Type>)newValue);
                return;
            case UmlPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET:
                getOwnedParameterSet().clear();
                getOwnedParameterSet().addAll((Collection<? extends ParameterSet>)newValue);
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
            case UmlPackage.BEHAVIORAL_FEATURE__IS_LEAF:
                setIsLeaf(IS_LEAF_EDEFAULT);
                return;
            case UmlPackage.BEHAVIORAL_FEATURE__IS_STATIC:
                setIsStatic(IS_STATIC_EDEFAULT);
                return;
            case UmlPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER:
                getOwnedParameter().clear();
                return;
            case UmlPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT:
                setIsAbstract(IS_ABSTRACT_EDEFAULT);
                return;
            case UmlPackage.BEHAVIORAL_FEATURE__METHOD:
                getMethod().clear();
                return;
            case UmlPackage.BEHAVIORAL_FEATURE__CONCURRENCY:
                setConcurrency(CONCURRENCY_EDEFAULT);
                return;
            case UmlPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
                getRaisedException().clear();
                return;
            case UmlPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET:
                getOwnedParameterSet().clear();
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
            case UmlPackage.BEHAVIORAL_FEATURE__IS_LEAF:
                return isLeaf != IS_LEAF_EDEFAULT;
            case UmlPackage.BEHAVIORAL_FEATURE__REDEFINED_ELEMENT:
                return !getRedefinedElement().isEmpty();
            case UmlPackage.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT:
                return !getRedefinitionContext().isEmpty();
            case UmlPackage.BEHAVIORAL_FEATURE__IS_STATIC:
                return isStatic != IS_STATIC_EDEFAULT;
            case UmlPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER:
                return !getFeaturingClassifier().isEmpty();
            case UmlPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER:
                return ownedParameter != null && !ownedParameter.isEmpty();
            case UmlPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT:
                return isAbstract != IS_ABSTRACT_EDEFAULT;
            case UmlPackage.BEHAVIORAL_FEATURE__METHOD:
                return method != null && !method.isEmpty();
            case UmlPackage.BEHAVIORAL_FEATURE__CONCURRENCY:
                return concurrency != CONCURRENCY_EDEFAULT;
            case UmlPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
                return raisedException != null && !raisedException.isEmpty();
            case UmlPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET:
                return ownedParameterSet != null && !ownedParameterSet.isEmpty();
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
        if (baseClass == RedefinableElement.class) {
            switch (derivedFeatureID) {
                case UmlPackage.BEHAVIORAL_FEATURE__IS_LEAF: return UmlPackage.REDEFINABLE_ELEMENT__IS_LEAF;
                case UmlPackage.BEHAVIORAL_FEATURE__REDEFINED_ELEMENT: return UmlPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
                case UmlPackage.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT: return UmlPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
                default: return -1;
            }
        }
        if (baseClass == Feature.class) {
            switch (derivedFeatureID) {
                case UmlPackage.BEHAVIORAL_FEATURE__IS_STATIC: return UmlPackage.FEATURE__IS_STATIC;
                case UmlPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER: return UmlPackage.FEATURE__FEATURING_CLASSIFIER;
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
        if (baseClass == RedefinableElement.class) {
            switch (baseFeatureID) {
                case UmlPackage.REDEFINABLE_ELEMENT__IS_LEAF: return UmlPackage.BEHAVIORAL_FEATURE__IS_LEAF;
                case UmlPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT: return UmlPackage.BEHAVIORAL_FEATURE__REDEFINED_ELEMENT;
                case UmlPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT: return UmlPackage.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT;
                default: return -1;
            }
        }
        if (baseClass == Feature.class) {
            switch (baseFeatureID) {
                case UmlPackage.FEATURE__IS_STATIC: return UmlPackage.BEHAVIORAL_FEATURE__IS_STATIC;
                case UmlPackage.FEATURE__FEATURING_CLASSIFIER: return UmlPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER;
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
        result.append(" (isLeaf: ");
        result.append(isLeaf);
        result.append(", isStatic: ");
        result.append(isStatic);
        result.append(", isAbstract: ");
        result.append(isAbstract);
        result.append(", concurrency: ");
        result.append(concurrency);
        result.append(')');
        return result.toString();
    }

} //BehavioralFeatureImpl
