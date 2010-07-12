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

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.ConnectableElement;
import uml.Interaction;
import uml.InteractionFragment;
import uml.Lifeline;
import uml.PartDecomposition;
import uml.UmlPackage;
import uml.ValueSpecification;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lifeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.LifelineImpl#getRepresents <em>Represents</em>}</li>
 *   <li>{@link uml.impl.LifelineImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link uml.impl.LifelineImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link uml.impl.LifelineImpl#getDecomposedAs <em>Decomposed As</em>}</li>
 *   <li>{@link uml.impl.LifelineImpl#getCoveredBy <em>Covered By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LifelineImpl extends NamedElementImpl implements Lifeline {
    /**
     * The cached value of the '{@link #getRepresents() <em>Represents</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRepresents()
     * @generated
     * @ordered
     */
    protected ConnectableElement represents;

    /**
     * The cached value of the '{@link #getSelector() <em>Selector</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSelector()
     * @generated
     * @ordered
     */
    protected ValueSpecification selector;

    /**
     * The cached value of the '{@link #getDecomposedAs() <em>Decomposed As</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDecomposedAs()
     * @generated
     * @ordered
     */
    protected PartDecomposition decomposedAs;

    /**
     * The cached value of the '{@link #getCoveredBy() <em>Covered By</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoveredBy()
     * @generated
     * @ordered
     */
    protected EList<InteractionFragment> coveredBy;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LifelineImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getLifeline();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectableElement getRepresents() {
        if (represents != null && represents.eIsProxy()) {
            InternalEObject oldRepresents = (InternalEObject)represents;
            represents = (ConnectableElement)eResolveProxy(oldRepresents);
            if (represents != oldRepresents) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.LIFELINE__REPRESENTS, oldRepresents, represents));
            }
        }
        return represents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectableElement basicGetRepresents() {
        return represents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRepresents(ConnectableElement newRepresents) {
        ConnectableElement oldRepresents = represents;
        represents = newRepresents;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.LIFELINE__REPRESENTS, oldRepresents, represents));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Interaction getInteraction() {
        if (eContainerFeatureID() != UmlPackage.LIFELINE__INTERACTION) return null;
        return (Interaction)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInteraction(Interaction newInteraction, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newInteraction, UmlPackage.LIFELINE__INTERACTION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInteraction(Interaction newInteraction) {
        if (newInteraction != eInternalContainer() || (eContainerFeatureID() != UmlPackage.LIFELINE__INTERACTION && newInteraction != null)) {
            if (EcoreUtil.isAncestor(this, newInteraction))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newInteraction != null)
                msgs = ((InternalEObject)newInteraction).eInverseAdd(this, UmlPackage.INTERACTION__LIFELINE, Interaction.class, msgs);
            msgs = basicSetInteraction(newInteraction, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.LIFELINE__INTERACTION, newInteraction, newInteraction));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValueSpecification getSelector() {
        return selector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSelector(ValueSpecification newSelector, NotificationChain msgs) {
        ValueSpecification oldSelector = selector;
        selector = newSelector;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.LIFELINE__SELECTOR, oldSelector, newSelector);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSelector(ValueSpecification newSelector) {
        if (newSelector != selector) {
            NotificationChain msgs = null;
            if (selector != null)
                msgs = ((InternalEObject)selector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.LIFELINE__SELECTOR, null, msgs);
            if (newSelector != null)
                msgs = ((InternalEObject)newSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.LIFELINE__SELECTOR, null, msgs);
            msgs = basicSetSelector(newSelector, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.LIFELINE__SELECTOR, newSelector, newSelector));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PartDecomposition getDecomposedAs() {
        if (decomposedAs != null && decomposedAs.eIsProxy()) {
            InternalEObject oldDecomposedAs = (InternalEObject)decomposedAs;
            decomposedAs = (PartDecomposition)eResolveProxy(oldDecomposedAs);
            if (decomposedAs != oldDecomposedAs) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.LIFELINE__DECOMPOSED_AS, oldDecomposedAs, decomposedAs));
            }
        }
        return decomposedAs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PartDecomposition basicGetDecomposedAs() {
        return decomposedAs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDecomposedAs(PartDecomposition newDecomposedAs) {
        PartDecomposition oldDecomposedAs = decomposedAs;
        decomposedAs = newDecomposedAs;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.LIFELINE__DECOMPOSED_AS, oldDecomposedAs, decomposedAs));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InteractionFragment> getCoveredBy() {
        if (coveredBy == null) {
            coveredBy = new EObjectWithInverseResolvingEList.ManyInverse<InteractionFragment>(InteractionFragment.class, this, UmlPackage.LIFELINE__COVERED_BY, UmlPackage.INTERACTION_FRAGMENT__COVERED);
        }
        return coveredBy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean interaction_uses_share_lifeline(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.LIFELINE__INTERACTION_USES_SHARE_LIFELINE,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "interaction_uses_share_lifeline", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean selector_specified(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.LIFELINE__SELECTOR_SPECIFIED,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "selector_specified", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean same_classifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.LIFELINE__SAME_CLASSIFIER,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "same_classifier", EObjectValidator.getObjectLabel(this, context) }),
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
            case UmlPackage.LIFELINE__INTERACTION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetInteraction((Interaction)otherEnd, msgs);
            case UmlPackage.LIFELINE__COVERED_BY:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getCoveredBy()).basicAdd(otherEnd, msgs);
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
            case UmlPackage.LIFELINE__INTERACTION:
                return basicSetInteraction(null, msgs);
            case UmlPackage.LIFELINE__SELECTOR:
                return basicSetSelector(null, msgs);
            case UmlPackage.LIFELINE__COVERED_BY:
                return ((InternalEList<?>)getCoveredBy()).basicRemove(otherEnd, msgs);
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
            case UmlPackage.LIFELINE__INTERACTION:
                return eInternalContainer().eInverseRemove(this, UmlPackage.INTERACTION__LIFELINE, Interaction.class, msgs);
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
            case UmlPackage.LIFELINE__REPRESENTS:
                if (resolve) return getRepresents();
                return basicGetRepresents();
            case UmlPackage.LIFELINE__INTERACTION:
                return getInteraction();
            case UmlPackage.LIFELINE__SELECTOR:
                return getSelector();
            case UmlPackage.LIFELINE__DECOMPOSED_AS:
                if (resolve) return getDecomposedAs();
                return basicGetDecomposedAs();
            case UmlPackage.LIFELINE__COVERED_BY:
                return getCoveredBy();
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
            case UmlPackage.LIFELINE__REPRESENTS:
                setRepresents((ConnectableElement)newValue);
                return;
            case UmlPackage.LIFELINE__INTERACTION:
                setInteraction((Interaction)newValue);
                return;
            case UmlPackage.LIFELINE__SELECTOR:
                setSelector((ValueSpecification)newValue);
                return;
            case UmlPackage.LIFELINE__DECOMPOSED_AS:
                setDecomposedAs((PartDecomposition)newValue);
                return;
            case UmlPackage.LIFELINE__COVERED_BY:
                getCoveredBy().clear();
                getCoveredBy().addAll((Collection<? extends InteractionFragment>)newValue);
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
            case UmlPackage.LIFELINE__REPRESENTS:
                setRepresents((ConnectableElement)null);
                return;
            case UmlPackage.LIFELINE__INTERACTION:
                setInteraction((Interaction)null);
                return;
            case UmlPackage.LIFELINE__SELECTOR:
                setSelector((ValueSpecification)null);
                return;
            case UmlPackage.LIFELINE__DECOMPOSED_AS:
                setDecomposedAs((PartDecomposition)null);
                return;
            case UmlPackage.LIFELINE__COVERED_BY:
                getCoveredBy().clear();
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
            case UmlPackage.LIFELINE__REPRESENTS:
                return represents != null;
            case UmlPackage.LIFELINE__INTERACTION:
                return getInteraction() != null;
            case UmlPackage.LIFELINE__SELECTOR:
                return selector != null;
            case UmlPackage.LIFELINE__DECOMPOSED_AS:
                return decomposedAs != null;
            case UmlPackage.LIFELINE__COVERED_BY:
                return coveredBy != null && !coveredBy.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //LifelineImpl
