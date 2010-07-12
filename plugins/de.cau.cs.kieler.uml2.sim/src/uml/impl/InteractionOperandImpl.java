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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.GeneralOrdering;
import uml.Interaction;
import uml.InteractionConstraint;
import uml.InteractionFragment;
import uml.InteractionOperand;
import uml.Lifeline;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Operand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.InteractionOperandImpl#getCovered <em>Covered</em>}</li>
 *   <li>{@link uml.impl.InteractionOperandImpl#getGeneralOrdering <em>General Ordering</em>}</li>
 *   <li>{@link uml.impl.InteractionOperandImpl#getEnclosingInteraction <em>Enclosing Interaction</em>}</li>
 *   <li>{@link uml.impl.InteractionOperandImpl#getEnclosingOperand <em>Enclosing Operand</em>}</li>
 *   <li>{@link uml.impl.InteractionOperandImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link uml.impl.InteractionOperandImpl#getFragment <em>Fragment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionOperandImpl extends NamespaceImpl implements InteractionOperand {
    /**
     * The cached value of the '{@link #getCovered() <em>Covered</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCovered()
     * @generated
     * @ordered
     */
    protected EList<Lifeline> covered;

    /**
     * The cached value of the '{@link #getGeneralOrdering() <em>General Ordering</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeneralOrdering()
     * @generated
     * @ordered
     */
    protected EList<GeneralOrdering> generalOrdering;

    /**
     * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGuard()
     * @generated
     * @ordered
     */
    protected InteractionConstraint guard;

    /**
     * The cached value of the '{@link #getFragment() <em>Fragment</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFragment()
     * @generated
     * @ordered
     */
    protected EList<InteractionFragment> fragment;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InteractionOperandImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getInteractionOperand();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Lifeline> getCovered() {
        if (covered == null) {
            covered = new EObjectWithInverseResolvingEList.ManyInverse<Lifeline>(Lifeline.class, this, UmlPackage.INTERACTION_OPERAND__COVERED, UmlPackage.LIFELINE__COVERED_BY);
        }
        return covered;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<GeneralOrdering> getGeneralOrdering() {
        if (generalOrdering == null) {
            generalOrdering = new EObjectContainmentEList<GeneralOrdering>(GeneralOrdering.class, this, UmlPackage.INTERACTION_OPERAND__GENERAL_ORDERING);
        }
        return generalOrdering;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Interaction getEnclosingInteraction() {
        if (eContainerFeatureID() != UmlPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION) return null;
        return (Interaction)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEnclosingInteraction(Interaction newEnclosingInteraction, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newEnclosingInteraction, UmlPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEnclosingInteraction(Interaction newEnclosingInteraction) {
        if (newEnclosingInteraction != eInternalContainer() || (eContainerFeatureID() != UmlPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION && newEnclosingInteraction != null)) {
            if (EcoreUtil.isAncestor(this, newEnclosingInteraction))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newEnclosingInteraction != null)
                msgs = ((InternalEObject)newEnclosingInteraction).eInverseAdd(this, UmlPackage.INTERACTION__FRAGMENT, Interaction.class, msgs);
            msgs = basicSetEnclosingInteraction(newEnclosingInteraction, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION, newEnclosingInteraction, newEnclosingInteraction));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionOperand getEnclosingOperand() {
        if (eContainerFeatureID() != UmlPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND) return null;
        return (InteractionOperand)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEnclosingOperand(InteractionOperand newEnclosingOperand, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newEnclosingOperand, UmlPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEnclosingOperand(InteractionOperand newEnclosingOperand) {
        if (newEnclosingOperand != eInternalContainer() || (eContainerFeatureID() != UmlPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND && newEnclosingOperand != null)) {
            if (EcoreUtil.isAncestor(this, newEnclosingOperand))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newEnclosingOperand != null)
                msgs = ((InternalEObject)newEnclosingOperand).eInverseAdd(this, UmlPackage.INTERACTION_OPERAND__FRAGMENT, InteractionOperand.class, msgs);
            msgs = basicSetEnclosingOperand(newEnclosingOperand, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND, newEnclosingOperand, newEnclosingOperand));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionConstraint getGuard() {
        return guard;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGuard(InteractionConstraint newGuard, NotificationChain msgs) {
        InteractionConstraint oldGuard = guard;
        guard = newGuard;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.INTERACTION_OPERAND__GUARD, oldGuard, newGuard);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGuard(InteractionConstraint newGuard) {
        if (newGuard != guard) {
            NotificationChain msgs = null;
            if (guard != null)
                msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.INTERACTION_OPERAND__GUARD, null, msgs);
            if (newGuard != null)
                msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.INTERACTION_OPERAND__GUARD, null, msgs);
            msgs = basicSetGuard(newGuard, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INTERACTION_OPERAND__GUARD, newGuard, newGuard));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InteractionFragment> getFragment() {
        if (fragment == null) {
            fragment = new EObjectContainmentWithInverseEList<InteractionFragment>(InteractionFragment.class, this, UmlPackage.INTERACTION_OPERAND__FRAGMENT, UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND);
        }
        return fragment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean guard_directly_prior(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.INTERACTION_OPERAND__GUARD_DIRECTLY_PRIOR,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "guard_directly_prior", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean guard_contain_references(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.INTERACTION_OPERAND__GUARD_CONTAIN_REFERENCES,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "guard_contain_references", EObjectValidator.getObjectLabel(this, context) }),
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
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.INTERACTION_OPERAND__COVERED:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getCovered()).basicAdd(otherEnd, msgs);
            case UmlPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEnclosingInteraction((Interaction)otherEnd, msgs);
            case UmlPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEnclosingOperand((InteractionOperand)otherEnd, msgs);
            case UmlPackage.INTERACTION_OPERAND__FRAGMENT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getFragment()).basicAdd(otherEnd, msgs);
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
            case UmlPackage.INTERACTION_OPERAND__COVERED:
                return ((InternalEList<?>)getCovered()).basicRemove(otherEnd, msgs);
            case UmlPackage.INTERACTION_OPERAND__GENERAL_ORDERING:
                return ((InternalEList<?>)getGeneralOrdering()).basicRemove(otherEnd, msgs);
            case UmlPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION:
                return basicSetEnclosingInteraction(null, msgs);
            case UmlPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND:
                return basicSetEnclosingOperand(null, msgs);
            case UmlPackage.INTERACTION_OPERAND__GUARD:
                return basicSetGuard(null, msgs);
            case UmlPackage.INTERACTION_OPERAND__FRAGMENT:
                return ((InternalEList<?>)getFragment()).basicRemove(otherEnd, msgs);
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
            case UmlPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION:
                return eInternalContainer().eInverseRemove(this, UmlPackage.INTERACTION__FRAGMENT, Interaction.class, msgs);
            case UmlPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND:
                return eInternalContainer().eInverseRemove(this, UmlPackage.INTERACTION_OPERAND__FRAGMENT, InteractionOperand.class, msgs);
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
            case UmlPackage.INTERACTION_OPERAND__COVERED:
                return getCovered();
            case UmlPackage.INTERACTION_OPERAND__GENERAL_ORDERING:
                return getGeneralOrdering();
            case UmlPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION:
                return getEnclosingInteraction();
            case UmlPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND:
                return getEnclosingOperand();
            case UmlPackage.INTERACTION_OPERAND__GUARD:
                return getGuard();
            case UmlPackage.INTERACTION_OPERAND__FRAGMENT:
                return getFragment();
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
            case UmlPackage.INTERACTION_OPERAND__COVERED:
                getCovered().clear();
                getCovered().addAll((Collection<? extends Lifeline>)newValue);
                return;
            case UmlPackage.INTERACTION_OPERAND__GENERAL_ORDERING:
                getGeneralOrdering().clear();
                getGeneralOrdering().addAll((Collection<? extends GeneralOrdering>)newValue);
                return;
            case UmlPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION:
                setEnclosingInteraction((Interaction)newValue);
                return;
            case UmlPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND:
                setEnclosingOperand((InteractionOperand)newValue);
                return;
            case UmlPackage.INTERACTION_OPERAND__GUARD:
                setGuard((InteractionConstraint)newValue);
                return;
            case UmlPackage.INTERACTION_OPERAND__FRAGMENT:
                getFragment().clear();
                getFragment().addAll((Collection<? extends InteractionFragment>)newValue);
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
            case UmlPackage.INTERACTION_OPERAND__COVERED:
                getCovered().clear();
                return;
            case UmlPackage.INTERACTION_OPERAND__GENERAL_ORDERING:
                getGeneralOrdering().clear();
                return;
            case UmlPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION:
                setEnclosingInteraction((Interaction)null);
                return;
            case UmlPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND:
                setEnclosingOperand((InteractionOperand)null);
                return;
            case UmlPackage.INTERACTION_OPERAND__GUARD:
                setGuard((InteractionConstraint)null);
                return;
            case UmlPackage.INTERACTION_OPERAND__FRAGMENT:
                getFragment().clear();
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
            case UmlPackage.INTERACTION_OPERAND__COVERED:
                return covered != null && !covered.isEmpty();
            case UmlPackage.INTERACTION_OPERAND__GENERAL_ORDERING:
                return generalOrdering != null && !generalOrdering.isEmpty();
            case UmlPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION:
                return getEnclosingInteraction() != null;
            case UmlPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND:
                return getEnclosingOperand() != null;
            case UmlPackage.INTERACTION_OPERAND__GUARD:
                return guard != null;
            case UmlPackage.INTERACTION_OPERAND__FRAGMENT:
                return fragment != null && !fragment.isEmpty();
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
        if (baseClass == InteractionFragment.class) {
            switch (derivedFeatureID) {
                case UmlPackage.INTERACTION_OPERAND__COVERED: return UmlPackage.INTERACTION_FRAGMENT__COVERED;
                case UmlPackage.INTERACTION_OPERAND__GENERAL_ORDERING: return UmlPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING;
                case UmlPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION: return UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION;
                case UmlPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND: return UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND;
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
        if (baseClass == InteractionFragment.class) {
            switch (baseFeatureID) {
                case UmlPackage.INTERACTION_FRAGMENT__COVERED: return UmlPackage.INTERACTION_OPERAND__COVERED;
                case UmlPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING: return UmlPackage.INTERACTION_OPERAND__GENERAL_ORDERING;
                case UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION: return UmlPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION;
                case UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND: return UmlPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //InteractionOperandImpl
