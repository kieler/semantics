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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Classifier;
import uml.RedefinableElement;
import uml.Region;
import uml.State;
import uml.StateMachine;
import uml.Transition;
import uml.UmlPackage;
import uml.Vertex;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.RegionImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link uml.impl.RegionImpl#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link uml.impl.RegionImpl#getRedefinitionContext <em>Redefinition Context</em>}</li>
 *   <li>{@link uml.impl.RegionImpl#getSubvertex <em>Subvertex</em>}</li>
 *   <li>{@link uml.impl.RegionImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link uml.impl.RegionImpl#getState <em>State</em>}</li>
 *   <li>{@link uml.impl.RegionImpl#getExtendedRegion <em>Extended Region</em>}</li>
 *   <li>{@link uml.impl.RegionImpl#getStateMachine <em>State Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegionImpl extends NamespaceImpl implements Region {
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
     * The cached value of the '{@link #getSubvertex() <em>Subvertex</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubvertex()
     * @generated
     * @ordered
     */
    protected EList<Vertex> subvertex;

    /**
     * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransition()
     * @generated
     * @ordered
     */
    protected EList<Transition> transition;

    /**
     * The cached value of the '{@link #getExtendedRegion() <em>Extended Region</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtendedRegion()
     * @generated
     * @ordered
     */
    protected Region extendedRegion;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RegionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getRegion();
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.REGION__IS_LEAF, oldIsLeaf, isLeaf));
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
    public EList<Vertex> getSubvertex() {
        if (subvertex == null) {
            subvertex = new EObjectContainmentWithInverseEList<Vertex>(Vertex.class, this, UmlPackage.REGION__SUBVERTEX, UmlPackage.VERTEX__CONTAINER);
        }
        return subvertex;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Transition> getTransition() {
        if (transition == null) {
            transition = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this, UmlPackage.REGION__TRANSITION, UmlPackage.TRANSITION__CONTAINER);
        }
        return transition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public State getState() {
        if (eContainerFeatureID() != UmlPackage.REGION__STATE) return null;
        return (State)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetState(State newState, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newState, UmlPackage.REGION__STATE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setState(State newState) {
        if (newState != eInternalContainer() || (eContainerFeatureID() != UmlPackage.REGION__STATE && newState != null)) {
            if (EcoreUtil.isAncestor(this, newState))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newState != null)
                msgs = ((InternalEObject)newState).eInverseAdd(this, UmlPackage.STATE__REGION, State.class, msgs);
            msgs = basicSetState(newState, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.REGION__STATE, newState, newState));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Region getExtendedRegion() {
        if (extendedRegion != null && extendedRegion.eIsProxy()) {
            InternalEObject oldExtendedRegion = (InternalEObject)extendedRegion;
            extendedRegion = (Region)eResolveProxy(oldExtendedRegion);
            if (extendedRegion != oldExtendedRegion) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.REGION__EXTENDED_REGION, oldExtendedRegion, extendedRegion));
            }
        }
        return extendedRegion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Region basicGetExtendedRegion() {
        return extendedRegion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExtendedRegion(Region newExtendedRegion) {
        Region oldExtendedRegion = extendedRegion;
        extendedRegion = newExtendedRegion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.REGION__EXTENDED_REGION, oldExtendedRegion, extendedRegion));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StateMachine getStateMachine() {
        if (eContainerFeatureID() != UmlPackage.REGION__STATE_MACHINE) return null;
        return (StateMachine)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStateMachine(StateMachine newStateMachine, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newStateMachine, UmlPackage.REGION__STATE_MACHINE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStateMachine(StateMachine newStateMachine) {
        if (newStateMachine != eInternalContainer() || (eContainerFeatureID() != UmlPackage.REGION__STATE_MACHINE && newStateMachine != null)) {
            if (EcoreUtil.isAncestor(this, newStateMachine))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newStateMachine != null)
                msgs = ((InternalEObject)newStateMachine).eInverseAdd(this, UmlPackage.STATE_MACHINE__REGION, StateMachine.class, msgs);
            msgs = basicSetStateMachine(newStateMachine, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.REGION__STATE_MACHINE, newStateMachine, newStateMachine));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean initial_vertex(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.REGION__INITIAL_VERTEX,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "initial_vertex", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean deep_history_vertex(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.REGION__DEEP_HISTORY_VERTEX,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "deep_history_vertex", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean shallow_history_vertex(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.REGION__SHALLOW_HISTORY_VERTEX,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "shallow_history_vertex", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean owned(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.REGION__OWNED,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "owned", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean isRedefinitionContextValid(Region redefined) {
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
    public boolean belongsToPSM() {
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
            case UmlPackage.REGION__SUBVERTEX:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubvertex()).basicAdd(otherEnd, msgs);
            case UmlPackage.REGION__TRANSITION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransition()).basicAdd(otherEnd, msgs);
            case UmlPackage.REGION__STATE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetState((State)otherEnd, msgs);
            case UmlPackage.REGION__STATE_MACHINE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetStateMachine((StateMachine)otherEnd, msgs);
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
            case UmlPackage.REGION__SUBVERTEX:
                return ((InternalEList<?>)getSubvertex()).basicRemove(otherEnd, msgs);
            case UmlPackage.REGION__TRANSITION:
                return ((InternalEList<?>)getTransition()).basicRemove(otherEnd, msgs);
            case UmlPackage.REGION__STATE:
                return basicSetState(null, msgs);
            case UmlPackage.REGION__STATE_MACHINE:
                return basicSetStateMachine(null, msgs);
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
            case UmlPackage.REGION__STATE:
                return eInternalContainer().eInverseRemove(this, UmlPackage.STATE__REGION, State.class, msgs);
            case UmlPackage.REGION__STATE_MACHINE:
                return eInternalContainer().eInverseRemove(this, UmlPackage.STATE_MACHINE__REGION, StateMachine.class, msgs);
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
            case UmlPackage.REGION__IS_LEAF:
                return isIsLeaf();
            case UmlPackage.REGION__REDEFINED_ELEMENT:
                return getRedefinedElement();
            case UmlPackage.REGION__REDEFINITION_CONTEXT:
                return getRedefinitionContext();
            case UmlPackage.REGION__SUBVERTEX:
                return getSubvertex();
            case UmlPackage.REGION__TRANSITION:
                return getTransition();
            case UmlPackage.REGION__STATE:
                return getState();
            case UmlPackage.REGION__EXTENDED_REGION:
                if (resolve) return getExtendedRegion();
                return basicGetExtendedRegion();
            case UmlPackage.REGION__STATE_MACHINE:
                return getStateMachine();
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
            case UmlPackage.REGION__IS_LEAF:
                setIsLeaf((Boolean)newValue);
                return;
            case UmlPackage.REGION__SUBVERTEX:
                getSubvertex().clear();
                getSubvertex().addAll((Collection<? extends Vertex>)newValue);
                return;
            case UmlPackage.REGION__TRANSITION:
                getTransition().clear();
                getTransition().addAll((Collection<? extends Transition>)newValue);
                return;
            case UmlPackage.REGION__STATE:
                setState((State)newValue);
                return;
            case UmlPackage.REGION__EXTENDED_REGION:
                setExtendedRegion((Region)newValue);
                return;
            case UmlPackage.REGION__STATE_MACHINE:
                setStateMachine((StateMachine)newValue);
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
            case UmlPackage.REGION__IS_LEAF:
                setIsLeaf(IS_LEAF_EDEFAULT);
                return;
            case UmlPackage.REGION__SUBVERTEX:
                getSubvertex().clear();
                return;
            case UmlPackage.REGION__TRANSITION:
                getTransition().clear();
                return;
            case UmlPackage.REGION__STATE:
                setState((State)null);
                return;
            case UmlPackage.REGION__EXTENDED_REGION:
                setExtendedRegion((Region)null);
                return;
            case UmlPackage.REGION__STATE_MACHINE:
                setStateMachine((StateMachine)null);
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
            case UmlPackage.REGION__IS_LEAF:
                return isLeaf != IS_LEAF_EDEFAULT;
            case UmlPackage.REGION__REDEFINED_ELEMENT:
                return !getRedefinedElement().isEmpty();
            case UmlPackage.REGION__REDEFINITION_CONTEXT:
                return !getRedefinitionContext().isEmpty();
            case UmlPackage.REGION__SUBVERTEX:
                return subvertex != null && !subvertex.isEmpty();
            case UmlPackage.REGION__TRANSITION:
                return transition != null && !transition.isEmpty();
            case UmlPackage.REGION__STATE:
                return getState() != null;
            case UmlPackage.REGION__EXTENDED_REGION:
                return extendedRegion != null;
            case UmlPackage.REGION__STATE_MACHINE:
                return getStateMachine() != null;
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
                case UmlPackage.REGION__IS_LEAF: return UmlPackage.REDEFINABLE_ELEMENT__IS_LEAF;
                case UmlPackage.REGION__REDEFINED_ELEMENT: return UmlPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
                case UmlPackage.REGION__REDEFINITION_CONTEXT: return UmlPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
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
                case UmlPackage.REDEFINABLE_ELEMENT__IS_LEAF: return UmlPackage.REGION__IS_LEAF;
                case UmlPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT: return UmlPackage.REGION__REDEFINED_ELEMENT;
                case UmlPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT: return UmlPackage.REGION__REDEFINITION_CONTEXT;
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
        result.append(')');
        return result.toString();
    }

} //RegionImpl
