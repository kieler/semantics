/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.GeneralOrdering;
import uml.Interaction;
import uml.InteractionFragment;
import uml.InteractionOperand;
import uml.Lifeline;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.InteractionFragmentImpl#getCovered <em>Covered</em>}</li>
 *   <li>{@link uml.impl.InteractionFragmentImpl#getGeneralOrdering <em>General Ordering</em>}</li>
 *   <li>{@link uml.impl.InteractionFragmentImpl#getEnclosingInteraction <em>Enclosing Interaction</em>}</li>
 *   <li>{@link uml.impl.InteractionFragmentImpl#getEnclosingOperand <em>Enclosing Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InteractionFragmentImpl extends NamedElementImpl implements InteractionFragment {
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InteractionFragmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getInteractionFragment();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Lifeline> getCovered() {
        if (covered == null) {
            covered = new EObjectWithInverseResolvingEList.ManyInverse<Lifeline>(Lifeline.class, this, UmlPackage.INTERACTION_FRAGMENT__COVERED, UmlPackage.LIFELINE__COVERED_BY);
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
            generalOrdering = new EObjectContainmentEList<GeneralOrdering>(GeneralOrdering.class, this, UmlPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING);
        }
        return generalOrdering;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Interaction getEnclosingInteraction() {
        if (eContainerFeatureID() != UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION) return null;
        return (Interaction)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEnclosingInteraction(Interaction newEnclosingInteraction, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newEnclosingInteraction, UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEnclosingInteraction(Interaction newEnclosingInteraction) {
        if (newEnclosingInteraction != eInternalContainer() || (eContainerFeatureID() != UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION && newEnclosingInteraction != null)) {
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION, newEnclosingInteraction, newEnclosingInteraction));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionOperand getEnclosingOperand() {
        if (eContainerFeatureID() != UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND) return null;
        return (InteractionOperand)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEnclosingOperand(InteractionOperand newEnclosingOperand, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newEnclosingOperand, UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEnclosingOperand(InteractionOperand newEnclosingOperand) {
        if (newEnclosingOperand != eInternalContainer() || (eContainerFeatureID() != UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND && newEnclosingOperand != null)) {
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND, newEnclosingOperand, newEnclosingOperand));
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
            case UmlPackage.INTERACTION_FRAGMENT__COVERED:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getCovered()).basicAdd(otherEnd, msgs);
            case UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEnclosingInteraction((Interaction)otherEnd, msgs);
            case UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEnclosingOperand((InteractionOperand)otherEnd, msgs);
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
            case UmlPackage.INTERACTION_FRAGMENT__COVERED:
                return ((InternalEList<?>)getCovered()).basicRemove(otherEnd, msgs);
            case UmlPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING:
                return ((InternalEList<?>)getGeneralOrdering()).basicRemove(otherEnd, msgs);
            case UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION:
                return basicSetEnclosingInteraction(null, msgs);
            case UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND:
                return basicSetEnclosingOperand(null, msgs);
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
            case UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION:
                return eInternalContainer().eInverseRemove(this, UmlPackage.INTERACTION__FRAGMENT, Interaction.class, msgs);
            case UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND:
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
            case UmlPackage.INTERACTION_FRAGMENT__COVERED:
                return getCovered();
            case UmlPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING:
                return getGeneralOrdering();
            case UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION:
                return getEnclosingInteraction();
            case UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND:
                return getEnclosingOperand();
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
            case UmlPackage.INTERACTION_FRAGMENT__COVERED:
                getCovered().clear();
                getCovered().addAll((Collection<? extends Lifeline>)newValue);
                return;
            case UmlPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING:
                getGeneralOrdering().clear();
                getGeneralOrdering().addAll((Collection<? extends GeneralOrdering>)newValue);
                return;
            case UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION:
                setEnclosingInteraction((Interaction)newValue);
                return;
            case UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND:
                setEnclosingOperand((InteractionOperand)newValue);
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
            case UmlPackage.INTERACTION_FRAGMENT__COVERED:
                getCovered().clear();
                return;
            case UmlPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING:
                getGeneralOrdering().clear();
                return;
            case UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION:
                setEnclosingInteraction((Interaction)null);
                return;
            case UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND:
                setEnclosingOperand((InteractionOperand)null);
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
            case UmlPackage.INTERACTION_FRAGMENT__COVERED:
                return covered != null && !covered.isEmpty();
            case UmlPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING:
                return generalOrdering != null && !generalOrdering.isEmpty();
            case UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION:
                return getEnclosingInteraction() != null;
            case UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND:
                return getEnclosingOperand() != null;
        }
        return super.eIsSet(featureID);
    }

} //InteractionFragmentImpl
