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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Action;
import uml.Gate;
import uml.GeneralOrdering;
import uml.Interaction;
import uml.InteractionFragment;
import uml.InteractionOperand;
import uml.Lifeline;
import uml.Message;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.InteractionImpl#getCovered <em>Covered</em>}</li>
 *   <li>{@link uml.impl.InteractionImpl#getGeneralOrdering <em>General Ordering</em>}</li>
 *   <li>{@link uml.impl.InteractionImpl#getEnclosingInteraction <em>Enclosing Interaction</em>}</li>
 *   <li>{@link uml.impl.InteractionImpl#getEnclosingOperand <em>Enclosing Operand</em>}</li>
 *   <li>{@link uml.impl.InteractionImpl#getLifeline <em>Lifeline</em>}</li>
 *   <li>{@link uml.impl.InteractionImpl#getFragment <em>Fragment</em>}</li>
 *   <li>{@link uml.impl.InteractionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link uml.impl.InteractionImpl#getFormalGate <em>Formal Gate</em>}</li>
 *   <li>{@link uml.impl.InteractionImpl#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionImpl extends BehaviorImpl implements Interaction {
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
     * The cached value of the '{@link #getLifeline() <em>Lifeline</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLifeline()
     * @generated
     * @ordered
     */
    protected EList<Lifeline> lifeline;

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
     * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAction()
     * @generated
     * @ordered
     */
    protected EList<Action> action;

    /**
     * The cached value of the '{@link #getFormalGate() <em>Formal Gate</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFormalGate()
     * @generated
     * @ordered
     */
    protected EList<Gate> formalGate;

    /**
     * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessage()
     * @generated
     * @ordered
     */
    protected EList<Message> message;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InteractionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getInteraction();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Lifeline> getCovered() {
        if (covered == null) {
            covered = new EObjectWithInverseResolvingEList.ManyInverse<Lifeline>(Lifeline.class, this, UmlPackage.INTERACTION__COVERED, UmlPackage.LIFELINE__COVERED_BY);
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
            generalOrdering = new EObjectContainmentEList<GeneralOrdering>(GeneralOrdering.class, this, UmlPackage.INTERACTION__GENERAL_ORDERING);
        }
        return generalOrdering;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Interaction getEnclosingInteraction() {
        if (eContainerFeatureID() != UmlPackage.INTERACTION__ENCLOSING_INTERACTION) return null;
        return (Interaction)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEnclosingInteraction(Interaction newEnclosingInteraction, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newEnclosingInteraction, UmlPackage.INTERACTION__ENCLOSING_INTERACTION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEnclosingInteraction(Interaction newEnclosingInteraction) {
        if (newEnclosingInteraction != eInternalContainer() || (eContainerFeatureID() != UmlPackage.INTERACTION__ENCLOSING_INTERACTION && newEnclosingInteraction != null)) {
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INTERACTION__ENCLOSING_INTERACTION, newEnclosingInteraction, newEnclosingInteraction));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionOperand getEnclosingOperand() {
        if (eContainerFeatureID() != UmlPackage.INTERACTION__ENCLOSING_OPERAND) return null;
        return (InteractionOperand)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEnclosingOperand(InteractionOperand newEnclosingOperand, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newEnclosingOperand, UmlPackage.INTERACTION__ENCLOSING_OPERAND, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEnclosingOperand(InteractionOperand newEnclosingOperand) {
        if (newEnclosingOperand != eInternalContainer() || (eContainerFeatureID() != UmlPackage.INTERACTION__ENCLOSING_OPERAND && newEnclosingOperand != null)) {
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.INTERACTION__ENCLOSING_OPERAND, newEnclosingOperand, newEnclosingOperand));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Lifeline> getLifeline() {
        if (lifeline == null) {
            lifeline = new EObjectContainmentWithInverseEList<Lifeline>(Lifeline.class, this, UmlPackage.INTERACTION__LIFELINE, UmlPackage.LIFELINE__INTERACTION);
        }
        return lifeline;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InteractionFragment> getFragment() {
        if (fragment == null) {
            fragment = new EObjectContainmentWithInverseEList<InteractionFragment>(InteractionFragment.class, this, UmlPackage.INTERACTION__FRAGMENT, UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION);
        }
        return fragment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Action> getAction() {
        if (action == null) {
            action = new EObjectContainmentEList<Action>(Action.class, this, UmlPackage.INTERACTION__ACTION);
        }
        return action;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Gate> getFormalGate() {
        if (formalGate == null) {
            formalGate = new EObjectContainmentEList<Gate>(Gate.class, this, UmlPackage.INTERACTION__FORMAL_GATE);
        }
        return formalGate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Message> getMessage() {
        if (message == null) {
            message = new EObjectContainmentWithInverseEList<Message>(Message.class, this, UmlPackage.INTERACTION__MESSAGE, UmlPackage.MESSAGE__INTERACTION);
        }
        return message;
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
            case UmlPackage.INTERACTION__COVERED:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getCovered()).basicAdd(otherEnd, msgs);
            case UmlPackage.INTERACTION__ENCLOSING_INTERACTION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEnclosingInteraction((Interaction)otherEnd, msgs);
            case UmlPackage.INTERACTION__ENCLOSING_OPERAND:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEnclosingOperand((InteractionOperand)otherEnd, msgs);
            case UmlPackage.INTERACTION__LIFELINE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getLifeline()).basicAdd(otherEnd, msgs);
            case UmlPackage.INTERACTION__FRAGMENT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getFragment()).basicAdd(otherEnd, msgs);
            case UmlPackage.INTERACTION__MESSAGE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getMessage()).basicAdd(otherEnd, msgs);
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
            case UmlPackage.INTERACTION__COVERED:
                return ((InternalEList<?>)getCovered()).basicRemove(otherEnd, msgs);
            case UmlPackage.INTERACTION__GENERAL_ORDERING:
                return ((InternalEList<?>)getGeneralOrdering()).basicRemove(otherEnd, msgs);
            case UmlPackage.INTERACTION__ENCLOSING_INTERACTION:
                return basicSetEnclosingInteraction(null, msgs);
            case UmlPackage.INTERACTION__ENCLOSING_OPERAND:
                return basicSetEnclosingOperand(null, msgs);
            case UmlPackage.INTERACTION__LIFELINE:
                return ((InternalEList<?>)getLifeline()).basicRemove(otherEnd, msgs);
            case UmlPackage.INTERACTION__FRAGMENT:
                return ((InternalEList<?>)getFragment()).basicRemove(otherEnd, msgs);
            case UmlPackage.INTERACTION__ACTION:
                return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
            case UmlPackage.INTERACTION__FORMAL_GATE:
                return ((InternalEList<?>)getFormalGate()).basicRemove(otherEnd, msgs);
            case UmlPackage.INTERACTION__MESSAGE:
                return ((InternalEList<?>)getMessage()).basicRemove(otherEnd, msgs);
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
            case UmlPackage.INTERACTION__ENCLOSING_INTERACTION:
                return eInternalContainer().eInverseRemove(this, UmlPackage.INTERACTION__FRAGMENT, Interaction.class, msgs);
            case UmlPackage.INTERACTION__ENCLOSING_OPERAND:
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
            case UmlPackage.INTERACTION__COVERED:
                return getCovered();
            case UmlPackage.INTERACTION__GENERAL_ORDERING:
                return getGeneralOrdering();
            case UmlPackage.INTERACTION__ENCLOSING_INTERACTION:
                return getEnclosingInteraction();
            case UmlPackage.INTERACTION__ENCLOSING_OPERAND:
                return getEnclosingOperand();
            case UmlPackage.INTERACTION__LIFELINE:
                return getLifeline();
            case UmlPackage.INTERACTION__FRAGMENT:
                return getFragment();
            case UmlPackage.INTERACTION__ACTION:
                return getAction();
            case UmlPackage.INTERACTION__FORMAL_GATE:
                return getFormalGate();
            case UmlPackage.INTERACTION__MESSAGE:
                return getMessage();
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
            case UmlPackage.INTERACTION__COVERED:
                getCovered().clear();
                getCovered().addAll((Collection<? extends Lifeline>)newValue);
                return;
            case UmlPackage.INTERACTION__GENERAL_ORDERING:
                getGeneralOrdering().clear();
                getGeneralOrdering().addAll((Collection<? extends GeneralOrdering>)newValue);
                return;
            case UmlPackage.INTERACTION__ENCLOSING_INTERACTION:
                setEnclosingInteraction((Interaction)newValue);
                return;
            case UmlPackage.INTERACTION__ENCLOSING_OPERAND:
                setEnclosingOperand((InteractionOperand)newValue);
                return;
            case UmlPackage.INTERACTION__LIFELINE:
                getLifeline().clear();
                getLifeline().addAll((Collection<? extends Lifeline>)newValue);
                return;
            case UmlPackage.INTERACTION__FRAGMENT:
                getFragment().clear();
                getFragment().addAll((Collection<? extends InteractionFragment>)newValue);
                return;
            case UmlPackage.INTERACTION__ACTION:
                getAction().clear();
                getAction().addAll((Collection<? extends Action>)newValue);
                return;
            case UmlPackage.INTERACTION__FORMAL_GATE:
                getFormalGate().clear();
                getFormalGate().addAll((Collection<? extends Gate>)newValue);
                return;
            case UmlPackage.INTERACTION__MESSAGE:
                getMessage().clear();
                getMessage().addAll((Collection<? extends Message>)newValue);
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
            case UmlPackage.INTERACTION__COVERED:
                getCovered().clear();
                return;
            case UmlPackage.INTERACTION__GENERAL_ORDERING:
                getGeneralOrdering().clear();
                return;
            case UmlPackage.INTERACTION__ENCLOSING_INTERACTION:
                setEnclosingInteraction((Interaction)null);
                return;
            case UmlPackage.INTERACTION__ENCLOSING_OPERAND:
                setEnclosingOperand((InteractionOperand)null);
                return;
            case UmlPackage.INTERACTION__LIFELINE:
                getLifeline().clear();
                return;
            case UmlPackage.INTERACTION__FRAGMENT:
                getFragment().clear();
                return;
            case UmlPackage.INTERACTION__ACTION:
                getAction().clear();
                return;
            case UmlPackage.INTERACTION__FORMAL_GATE:
                getFormalGate().clear();
                return;
            case UmlPackage.INTERACTION__MESSAGE:
                getMessage().clear();
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
            case UmlPackage.INTERACTION__COVERED:
                return covered != null && !covered.isEmpty();
            case UmlPackage.INTERACTION__GENERAL_ORDERING:
                return generalOrdering != null && !generalOrdering.isEmpty();
            case UmlPackage.INTERACTION__ENCLOSING_INTERACTION:
                return getEnclosingInteraction() != null;
            case UmlPackage.INTERACTION__ENCLOSING_OPERAND:
                return getEnclosingOperand() != null;
            case UmlPackage.INTERACTION__LIFELINE:
                return lifeline != null && !lifeline.isEmpty();
            case UmlPackage.INTERACTION__FRAGMENT:
                return fragment != null && !fragment.isEmpty();
            case UmlPackage.INTERACTION__ACTION:
                return action != null && !action.isEmpty();
            case UmlPackage.INTERACTION__FORMAL_GATE:
                return formalGate != null && !formalGate.isEmpty();
            case UmlPackage.INTERACTION__MESSAGE:
                return message != null && !message.isEmpty();
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
                case UmlPackage.INTERACTION__COVERED: return UmlPackage.INTERACTION_FRAGMENT__COVERED;
                case UmlPackage.INTERACTION__GENERAL_ORDERING: return UmlPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING;
                case UmlPackage.INTERACTION__ENCLOSING_INTERACTION: return UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION;
                case UmlPackage.INTERACTION__ENCLOSING_OPERAND: return UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND;
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
                case UmlPackage.INTERACTION_FRAGMENT__COVERED: return UmlPackage.INTERACTION__COVERED;
                case UmlPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING: return UmlPackage.INTERACTION__GENERAL_ORDERING;
                case UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION: return UmlPackage.INTERACTION__ENCLOSING_INTERACTION;
                case UmlPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND: return UmlPackage.INTERACTION__ENCLOSING_OPERAND;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //InteractionImpl
