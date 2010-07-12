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

import uml.Behavior;
import uml.Classifier;
import uml.Constraint;
import uml.RedefinableElement;
import uml.Region;
import uml.StateMachine;
import uml.Transition;
import uml.TransitionKind;
import uml.Trigger;
import uml.UmlPackage;
import uml.Vertex;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.TransitionImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link uml.impl.TransitionImpl#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link uml.impl.TransitionImpl#getRedefinitionContext <em>Redefinition Context</em>}</li>
 *   <li>{@link uml.impl.TransitionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link uml.impl.TransitionImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link uml.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link uml.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link uml.impl.TransitionImpl#getRedefinedTransition <em>Redefined Transition</em>}</li>
 *   <li>{@link uml.impl.TransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link uml.impl.TransitionImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link uml.impl.TransitionImpl#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends NamespaceImpl implements Transition {
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
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final TransitionKind KIND_EDEFAULT = TransitionKind.EXTERNAL;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected TransitionKind kind = KIND_EDEFAULT;

    /**
     * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected Vertex source;

    /**
     * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected Vertex target;

    /**
     * The cached value of the '{@link #getRedefinedTransition() <em>Redefined Transition</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRedefinedTransition()
     * @generated
     * @ordered
     */
    protected Transition redefinedTransition;

    /**
     * The cached value of the '{@link #getGuard() <em>Guard</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGuard()
     * @generated
     * @ordered
     */
    protected Constraint guard;

    /**
     * The cached value of the '{@link #getEffect() <em>Effect</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEffect()
     * @generated
     * @ordered
     */
    protected Behavior effect;

    /**
     * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrigger()
     * @generated
     * @ordered
     */
    protected EList<Trigger> trigger;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TransitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getTransition();
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TRANSITION__IS_LEAF, oldIsLeaf, isLeaf));
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
    public TransitionKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKind(TransitionKind newKind) {
        TransitionKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TRANSITION__KIND, oldKind, kind));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Region getContainer() {
        if (eContainerFeatureID() != UmlPackage.TRANSITION__CONTAINER) return null;
        return (Region)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContainer(Region newContainer, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newContainer, UmlPackage.TRANSITION__CONTAINER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContainer(Region newContainer) {
        if (newContainer != eInternalContainer() || (eContainerFeatureID() != UmlPackage.TRANSITION__CONTAINER && newContainer != null)) {
            if (EcoreUtil.isAncestor(this, newContainer))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newContainer != null)
                msgs = ((InternalEObject)newContainer).eInverseAdd(this, UmlPackage.REGION__TRANSITION, Region.class, msgs);
            msgs = basicSetContainer(newContainer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TRANSITION__CONTAINER, newContainer, newContainer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Vertex getSource() {
        if (source != null && source.eIsProxy()) {
            InternalEObject oldSource = (InternalEObject)source;
            source = (Vertex)eResolveProxy(oldSource);
            if (source != oldSource) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.TRANSITION__SOURCE, oldSource, source));
            }
        }
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Vertex basicGetSource() {
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSource(Vertex newSource) {
        Vertex oldSource = source;
        source = newSource;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TRANSITION__SOURCE, oldSource, source));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Vertex getTarget() {
        if (target != null && target.eIsProxy()) {
            InternalEObject oldTarget = (InternalEObject)target;
            target = (Vertex)eResolveProxy(oldTarget);
            if (target != oldTarget) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.TRANSITION__TARGET, oldTarget, target));
            }
        }
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Vertex basicGetTarget() {
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTarget(Vertex newTarget) {
        Vertex oldTarget = target;
        target = newTarget;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TRANSITION__TARGET, oldTarget, target));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Transition getRedefinedTransition() {
        if (redefinedTransition != null && redefinedTransition.eIsProxy()) {
            InternalEObject oldRedefinedTransition = (InternalEObject)redefinedTransition;
            redefinedTransition = (Transition)eResolveProxy(oldRedefinedTransition);
            if (redefinedTransition != oldRedefinedTransition) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.TRANSITION__REDEFINED_TRANSITION, oldRedefinedTransition, redefinedTransition));
            }
        }
        return redefinedTransition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Transition basicGetRedefinedTransition() {
        return redefinedTransition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRedefinedTransition(Transition newRedefinedTransition) {
        Transition oldRedefinedTransition = redefinedTransition;
        redefinedTransition = newRedefinedTransition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TRANSITION__REDEFINED_TRANSITION, oldRedefinedTransition, redefinedTransition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Constraint getGuard() {
        if (guard != null && guard.eIsProxy()) {
            InternalEObject oldGuard = (InternalEObject)guard;
            guard = (Constraint)eResolveProxy(oldGuard);
            if (guard != oldGuard) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.TRANSITION__GUARD, oldGuard, guard));
            }
        }
        return guard;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Constraint basicGetGuard() {
        return guard;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGuard(Constraint newGuard) {
        Constraint oldGuard = guard;
        guard = newGuard;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TRANSITION__GUARD, oldGuard, guard));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Behavior getEffect() {
        return effect;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEffect(Behavior newEffect, NotificationChain msgs) {
        Behavior oldEffect = effect;
        effect = newEffect;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.TRANSITION__EFFECT, oldEffect, newEffect);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEffect(Behavior newEffect) {
        if (newEffect != effect) {
            NotificationChain msgs = null;
            if (effect != null)
                msgs = ((InternalEObject)effect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.TRANSITION__EFFECT, null, msgs);
            if (newEffect != null)
                msgs = ((InternalEObject)newEffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.TRANSITION__EFFECT, null, msgs);
            msgs = basicSetEffect(newEffect, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TRANSITION__EFFECT, newEffect, newEffect));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Trigger> getTrigger() {
        if (trigger == null) {
            trigger = new EObjectContainmentEList<Trigger>(Trigger.class, this, UmlPackage.TRANSITION__TRIGGER);
        }
        return trigger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean fork_segment_guards(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.TRANSITION__FORK_SEGMENT_GUARDS,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "fork_segment_guards", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean join_segment_guards(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.TRANSITION__JOIN_SEGMENT_GUARDS,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "join_segment_guards", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean fork_segment_state(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.TRANSITION__FORK_SEGMENT_STATE,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "fork_segment_state", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean join_segment_state(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.TRANSITION__JOIN_SEGMENT_STATE,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "join_segment_state", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean outgoing_pseudostates(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.TRANSITION__OUTGOING_PSEUDOSTATES,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "outgoing_pseudostates", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean initial_transition(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.TRANSITION__INITIAL_TRANSITION,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "initial_transition", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean signatures_compatible(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.TRANSITION__SIGNATURES_COMPATIBLE,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "signatures_compatible", EObjectValidator.getObjectLabel(this, context) }),
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
    public Classifier redefinitionContext() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StateMachine containingStateMachine() {
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
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.TRANSITION__CONTAINER:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetContainer((Region)otherEnd, msgs);
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
            case UmlPackage.TRANSITION__CONTAINER:
                return basicSetContainer(null, msgs);
            case UmlPackage.TRANSITION__EFFECT:
                return basicSetEffect(null, msgs);
            case UmlPackage.TRANSITION__TRIGGER:
                return ((InternalEList<?>)getTrigger()).basicRemove(otherEnd, msgs);
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
            case UmlPackage.TRANSITION__CONTAINER:
                return eInternalContainer().eInverseRemove(this, UmlPackage.REGION__TRANSITION, Region.class, msgs);
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
            case UmlPackage.TRANSITION__IS_LEAF:
                return isIsLeaf();
            case UmlPackage.TRANSITION__REDEFINED_ELEMENT:
                return getRedefinedElement();
            case UmlPackage.TRANSITION__REDEFINITION_CONTEXT:
                return getRedefinitionContext();
            case UmlPackage.TRANSITION__KIND:
                return getKind();
            case UmlPackage.TRANSITION__CONTAINER:
                return getContainer();
            case UmlPackage.TRANSITION__SOURCE:
                if (resolve) return getSource();
                return basicGetSource();
            case UmlPackage.TRANSITION__TARGET:
                if (resolve) return getTarget();
                return basicGetTarget();
            case UmlPackage.TRANSITION__REDEFINED_TRANSITION:
                if (resolve) return getRedefinedTransition();
                return basicGetRedefinedTransition();
            case UmlPackage.TRANSITION__GUARD:
                if (resolve) return getGuard();
                return basicGetGuard();
            case UmlPackage.TRANSITION__EFFECT:
                return getEffect();
            case UmlPackage.TRANSITION__TRIGGER:
                return getTrigger();
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
            case UmlPackage.TRANSITION__IS_LEAF:
                setIsLeaf((Boolean)newValue);
                return;
            case UmlPackage.TRANSITION__KIND:
                setKind((TransitionKind)newValue);
                return;
            case UmlPackage.TRANSITION__CONTAINER:
                setContainer((Region)newValue);
                return;
            case UmlPackage.TRANSITION__SOURCE:
                setSource((Vertex)newValue);
                return;
            case UmlPackage.TRANSITION__TARGET:
                setTarget((Vertex)newValue);
                return;
            case UmlPackage.TRANSITION__REDEFINED_TRANSITION:
                setRedefinedTransition((Transition)newValue);
                return;
            case UmlPackage.TRANSITION__GUARD:
                setGuard((Constraint)newValue);
                return;
            case UmlPackage.TRANSITION__EFFECT:
                setEffect((Behavior)newValue);
                return;
            case UmlPackage.TRANSITION__TRIGGER:
                getTrigger().clear();
                getTrigger().addAll((Collection<? extends Trigger>)newValue);
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
            case UmlPackage.TRANSITION__IS_LEAF:
                setIsLeaf(IS_LEAF_EDEFAULT);
                return;
            case UmlPackage.TRANSITION__KIND:
                setKind(KIND_EDEFAULT);
                return;
            case UmlPackage.TRANSITION__CONTAINER:
                setContainer((Region)null);
                return;
            case UmlPackage.TRANSITION__SOURCE:
                setSource((Vertex)null);
                return;
            case UmlPackage.TRANSITION__TARGET:
                setTarget((Vertex)null);
                return;
            case UmlPackage.TRANSITION__REDEFINED_TRANSITION:
                setRedefinedTransition((Transition)null);
                return;
            case UmlPackage.TRANSITION__GUARD:
                setGuard((Constraint)null);
                return;
            case UmlPackage.TRANSITION__EFFECT:
                setEffect((Behavior)null);
                return;
            case UmlPackage.TRANSITION__TRIGGER:
                getTrigger().clear();
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
            case UmlPackage.TRANSITION__IS_LEAF:
                return isLeaf != IS_LEAF_EDEFAULT;
            case UmlPackage.TRANSITION__REDEFINED_ELEMENT:
                return !getRedefinedElement().isEmpty();
            case UmlPackage.TRANSITION__REDEFINITION_CONTEXT:
                return !getRedefinitionContext().isEmpty();
            case UmlPackage.TRANSITION__KIND:
                return kind != KIND_EDEFAULT;
            case UmlPackage.TRANSITION__CONTAINER:
                return getContainer() != null;
            case UmlPackage.TRANSITION__SOURCE:
                return source != null;
            case UmlPackage.TRANSITION__TARGET:
                return target != null;
            case UmlPackage.TRANSITION__REDEFINED_TRANSITION:
                return redefinedTransition != null;
            case UmlPackage.TRANSITION__GUARD:
                return guard != null;
            case UmlPackage.TRANSITION__EFFECT:
                return effect != null;
            case UmlPackage.TRANSITION__TRIGGER:
                return trigger != null && !trigger.isEmpty();
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
                case UmlPackage.TRANSITION__IS_LEAF: return UmlPackage.REDEFINABLE_ELEMENT__IS_LEAF;
                case UmlPackage.TRANSITION__REDEFINED_ELEMENT: return UmlPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
                case UmlPackage.TRANSITION__REDEFINITION_CONTEXT: return UmlPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
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
                case UmlPackage.REDEFINABLE_ELEMENT__IS_LEAF: return UmlPackage.TRANSITION__IS_LEAF;
                case UmlPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT: return UmlPackage.TRANSITION__REDEFINED_ELEMENT;
                case UmlPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT: return UmlPackage.TRANSITION__REDEFINITION_CONTEXT;
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
        result.append(", kind: ");
        result.append(kind);
        result.append(')');
        return result.toString();
    }

} //TransitionImpl
