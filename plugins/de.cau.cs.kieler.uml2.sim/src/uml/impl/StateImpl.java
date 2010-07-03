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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Behavior;
import uml.Classifier;
import uml.ConnectionPointReference;
import uml.Constraint;
import uml.Pseudostate;
import uml.RedefinableElement;
import uml.Region;
import uml.State;
import uml.StateMachine;
import uml.Transition;
import uml.Trigger;
import uml.UmlPackage;
import uml.Vertex;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.StateImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link uml.impl.StateImpl#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link uml.impl.StateImpl#getRedefinitionContext <em>Redefinition Context</em>}</li>
 *   <li>{@link uml.impl.StateImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link uml.impl.StateImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link uml.impl.StateImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link uml.impl.StateImpl#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link uml.impl.StateImpl#isIsOrthogonal <em>Is Orthogonal</em>}</li>
 *   <li>{@link uml.impl.StateImpl#isIsSimple <em>Is Simple</em>}</li>
 *   <li>{@link uml.impl.StateImpl#isIsSubmachineState <em>Is Submachine State</em>}</li>
 *   <li>{@link uml.impl.StateImpl#getSubmachine <em>Submachine</em>}</li>
 *   <li>{@link uml.impl.StateImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link uml.impl.StateImpl#getConnectionPoint <em>Connection Point</em>}</li>
 *   <li>{@link uml.impl.StateImpl#getRedefinedState <em>Redefined State</em>}</li>
 *   <li>{@link uml.impl.StateImpl#getStateInvariant <em>State Invariant</em>}</li>
 *   <li>{@link uml.impl.StateImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link uml.impl.StateImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link uml.impl.StateImpl#getDoActivity <em>Do Activity</em>}</li>
 *   <li>{@link uml.impl.StateImpl#getDeferrableTrigger <em>Deferrable Trigger</em>}</li>
 *   <li>{@link uml.impl.StateImpl#getRegion <em>Region</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends NamespaceImpl implements State {
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
     * The default value of the '{@link #isIsComposite() <em>Is Composite</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsComposite()
     * @generated
     * @ordered
     */
    protected static final boolean IS_COMPOSITE_EDEFAULT = false;

    /**
     * The default value of the '{@link #isIsOrthogonal() <em>Is Orthogonal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsOrthogonal()
     * @generated
     * @ordered
     */
    protected static final boolean IS_ORTHOGONAL_EDEFAULT = false;

    /**
     * The default value of the '{@link #isIsSimple() <em>Is Simple</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsSimple()
     * @generated
     * @ordered
     */
    protected static final boolean IS_SIMPLE_EDEFAULT = true;

    /**
     * The default value of the '{@link #isIsSubmachineState() <em>Is Submachine State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsSubmachineState()
     * @generated
     * @ordered
     */
    protected static final boolean IS_SUBMACHINE_STATE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #getSubmachine() <em>Submachine</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubmachine()
     * @generated
     * @ordered
     */
    protected StateMachine submachine;

    /**
     * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnection()
     * @generated
     * @ordered
     */
    protected EList<ConnectionPointReference> connection;

    /**
     * The cached value of the '{@link #getConnectionPoint() <em>Connection Point</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionPoint()
     * @generated
     * @ordered
     */
    protected EList<Pseudostate> connectionPoint;

    /**
     * The cached value of the '{@link #getRedefinedState() <em>Redefined State</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRedefinedState()
     * @generated
     * @ordered
     */
    protected State redefinedState;

    /**
     * The cached value of the '{@link #getStateInvariant() <em>State Invariant</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStateInvariant()
     * @generated
     * @ordered
     */
    protected Constraint stateInvariant;

    /**
     * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntry()
     * @generated
     * @ordered
     */
    protected Behavior entry;

    /**
     * The cached value of the '{@link #getExit() <em>Exit</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExit()
     * @generated
     * @ordered
     */
    protected Behavior exit;

    /**
     * The cached value of the '{@link #getDoActivity() <em>Do Activity</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDoActivity()
     * @generated
     * @ordered
     */
    protected Behavior doActivity;

    /**
     * The cached value of the '{@link #getDeferrableTrigger() <em>Deferrable Trigger</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeferrableTrigger()
     * @generated
     * @ordered
     */
    protected EList<Trigger> deferrableTrigger;

    /**
     * The cached value of the '{@link #getRegion() <em>Region</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegion()
     * @generated
     * @ordered
     */
    protected EList<Region> region;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getState();
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.STATE__IS_LEAF, oldIsLeaf, isLeaf));
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
    public EList<Transition> getIncoming() {
        // TODO: implement this method to return the 'Incoming' reference list
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
    public EList<Transition> getOutgoing() {
        // TODO: implement this method to return the 'Outgoing' reference list
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
    public Region getContainer() {
        if (eContainerFeatureID() != UmlPackage.STATE__CONTAINER) return null;
        return (Region)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContainer(Region newContainer, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newContainer, UmlPackage.STATE__CONTAINER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContainer(Region newContainer) {
        if (newContainer != eInternalContainer() || (eContainerFeatureID() != UmlPackage.STATE__CONTAINER && newContainer != null)) {
            if (EcoreUtil.isAncestor(this, newContainer))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newContainer != null)
                msgs = ((InternalEObject)newContainer).eInverseAdd(this, UmlPackage.REGION__SUBVERTEX, Region.class, msgs);
            msgs = basicSetContainer(newContainer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.STATE__CONTAINER, newContainer, newContainer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsComposite() {
        // TODO: implement this method to return the 'Is Composite' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsOrthogonal() {
        // TODO: implement this method to return the 'Is Orthogonal' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsSimple() {
        // TODO: implement this method to return the 'Is Simple' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsSubmachineState() {
        // TODO: implement this method to return the 'Is Submachine State' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StateMachine getSubmachine() {
        if (submachine != null && submachine.eIsProxy()) {
            InternalEObject oldSubmachine = (InternalEObject)submachine;
            submachine = (StateMachine)eResolveProxy(oldSubmachine);
            if (submachine != oldSubmachine) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.STATE__SUBMACHINE, oldSubmachine, submachine));
            }
        }
        return submachine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StateMachine basicGetSubmachine() {
        return submachine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSubmachine(StateMachine newSubmachine, NotificationChain msgs) {
        StateMachine oldSubmachine = submachine;
        submachine = newSubmachine;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.STATE__SUBMACHINE, oldSubmachine, newSubmachine);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSubmachine(StateMachine newSubmachine) {
        if (newSubmachine != submachine) {
            NotificationChain msgs = null;
            if (submachine != null)
                msgs = ((InternalEObject)submachine).eInverseRemove(this, UmlPackage.STATE_MACHINE__SUBMACHINE_STATE, StateMachine.class, msgs);
            if (newSubmachine != null)
                msgs = ((InternalEObject)newSubmachine).eInverseAdd(this, UmlPackage.STATE_MACHINE__SUBMACHINE_STATE, StateMachine.class, msgs);
            msgs = basicSetSubmachine(newSubmachine, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.STATE__SUBMACHINE, newSubmachine, newSubmachine));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ConnectionPointReference> getConnection() {
        if (connection == null) {
            connection = new EObjectContainmentWithInverseEList<ConnectionPointReference>(ConnectionPointReference.class, this, UmlPackage.STATE__CONNECTION, UmlPackage.CONNECTION_POINT_REFERENCE__STATE);
        }
        return connection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Pseudostate> getConnectionPoint() {
        if (connectionPoint == null) {
            connectionPoint = new EObjectContainmentWithInverseEList<Pseudostate>(Pseudostate.class, this, UmlPackage.STATE__CONNECTION_POINT, UmlPackage.PSEUDOSTATE__STATE);
        }
        return connectionPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public State getRedefinedState() {
        if (redefinedState != null && redefinedState.eIsProxy()) {
            InternalEObject oldRedefinedState = (InternalEObject)redefinedState;
            redefinedState = (State)eResolveProxy(oldRedefinedState);
            if (redefinedState != oldRedefinedState) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.STATE__REDEFINED_STATE, oldRedefinedState, redefinedState));
            }
        }
        return redefinedState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public State basicGetRedefinedState() {
        return redefinedState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRedefinedState(State newRedefinedState) {
        State oldRedefinedState = redefinedState;
        redefinedState = newRedefinedState;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.STATE__REDEFINED_STATE, oldRedefinedState, redefinedState));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Constraint getStateInvariant() {
        return stateInvariant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStateInvariant(Constraint newStateInvariant, NotificationChain msgs) {
        Constraint oldStateInvariant = stateInvariant;
        stateInvariant = newStateInvariant;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.STATE__STATE_INVARIANT, oldStateInvariant, newStateInvariant);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStateInvariant(Constraint newStateInvariant) {
        if (newStateInvariant != stateInvariant) {
            NotificationChain msgs = null;
            if (stateInvariant != null)
                msgs = ((InternalEObject)stateInvariant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.STATE__STATE_INVARIANT, null, msgs);
            if (newStateInvariant != null)
                msgs = ((InternalEObject)newStateInvariant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.STATE__STATE_INVARIANT, null, msgs);
            msgs = basicSetStateInvariant(newStateInvariant, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.STATE__STATE_INVARIANT, newStateInvariant, newStateInvariant));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Behavior getEntry() {
        return entry;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEntry(Behavior newEntry, NotificationChain msgs) {
        Behavior oldEntry = entry;
        entry = newEntry;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.STATE__ENTRY, oldEntry, newEntry);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEntry(Behavior newEntry) {
        if (newEntry != entry) {
            NotificationChain msgs = null;
            if (entry != null)
                msgs = ((InternalEObject)entry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.STATE__ENTRY, null, msgs);
            if (newEntry != null)
                msgs = ((InternalEObject)newEntry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.STATE__ENTRY, null, msgs);
            msgs = basicSetEntry(newEntry, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.STATE__ENTRY, newEntry, newEntry));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Behavior getExit() {
        return exit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExit(Behavior newExit, NotificationChain msgs) {
        Behavior oldExit = exit;
        exit = newExit;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.STATE__EXIT, oldExit, newExit);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExit(Behavior newExit) {
        if (newExit != exit) {
            NotificationChain msgs = null;
            if (exit != null)
                msgs = ((InternalEObject)exit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.STATE__EXIT, null, msgs);
            if (newExit != null)
                msgs = ((InternalEObject)newExit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.STATE__EXIT, null, msgs);
            msgs = basicSetExit(newExit, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.STATE__EXIT, newExit, newExit));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Behavior getDoActivity() {
        return doActivity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDoActivity(Behavior newDoActivity, NotificationChain msgs) {
        Behavior oldDoActivity = doActivity;
        doActivity = newDoActivity;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.STATE__DO_ACTIVITY, oldDoActivity, newDoActivity);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDoActivity(Behavior newDoActivity) {
        if (newDoActivity != doActivity) {
            NotificationChain msgs = null;
            if (doActivity != null)
                msgs = ((InternalEObject)doActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.STATE__DO_ACTIVITY, null, msgs);
            if (newDoActivity != null)
                msgs = ((InternalEObject)newDoActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.STATE__DO_ACTIVITY, null, msgs);
            msgs = basicSetDoActivity(newDoActivity, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.STATE__DO_ACTIVITY, newDoActivity, newDoActivity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Trigger> getDeferrableTrigger() {
        if (deferrableTrigger == null) {
            deferrableTrigger = new EObjectContainmentEList<Trigger>(Trigger.class, this, UmlPackage.STATE__DEFERRABLE_TRIGGER);
        }
        return deferrableTrigger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Region> getRegion() {
        if (region == null) {
            region = new EObjectContainmentWithInverseEList<Region>(Region.class, this, UmlPackage.STATE__REGION, UmlPackage.REGION__STATE);
        }
        return region;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean submachine_states(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.STATE__SUBMACHINE_STATES,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "submachine_states", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean destinations_or_sources_of_transitions(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.STATE__DESTINATIONS_OR_SOURCES_OF_TRANSITIONS,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "destinations_or_sources_of_transitions", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean submachine_or_regions(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.STATE__SUBMACHINE_OR_REGIONS,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "submachine_or_regions", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean composite_states(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.STATE__COMPOSITE_STATES,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "composite_states", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean entry_or_exit(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.STATE__ENTRY_OR_EXIT,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "entry_or_exit", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean isSimple() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isComposite() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isOrthogonal() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSubmachineState() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
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
    public boolean isRedefinitionContextValid(State redefined) {
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
    public EList<Transition> getIncomings() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Transition> getOutgoings() {
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
            case UmlPackage.STATE__CONTAINER:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetContainer((Region)otherEnd, msgs);
            case UmlPackage.STATE__SUBMACHINE:
                if (submachine != null)
                    msgs = ((InternalEObject)submachine).eInverseRemove(this, UmlPackage.STATE_MACHINE__SUBMACHINE_STATE, StateMachine.class, msgs);
                return basicSetSubmachine((StateMachine)otherEnd, msgs);
            case UmlPackage.STATE__CONNECTION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnection()).basicAdd(otherEnd, msgs);
            case UmlPackage.STATE__CONNECTION_POINT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectionPoint()).basicAdd(otherEnd, msgs);
            case UmlPackage.STATE__REGION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getRegion()).basicAdd(otherEnd, msgs);
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
            case UmlPackage.STATE__CONTAINER:
                return basicSetContainer(null, msgs);
            case UmlPackage.STATE__SUBMACHINE:
                return basicSetSubmachine(null, msgs);
            case UmlPackage.STATE__CONNECTION:
                return ((InternalEList<?>)getConnection()).basicRemove(otherEnd, msgs);
            case UmlPackage.STATE__CONNECTION_POINT:
                return ((InternalEList<?>)getConnectionPoint()).basicRemove(otherEnd, msgs);
            case UmlPackage.STATE__STATE_INVARIANT:
                return basicSetStateInvariant(null, msgs);
            case UmlPackage.STATE__ENTRY:
                return basicSetEntry(null, msgs);
            case UmlPackage.STATE__EXIT:
                return basicSetExit(null, msgs);
            case UmlPackage.STATE__DO_ACTIVITY:
                return basicSetDoActivity(null, msgs);
            case UmlPackage.STATE__DEFERRABLE_TRIGGER:
                return ((InternalEList<?>)getDeferrableTrigger()).basicRemove(otherEnd, msgs);
            case UmlPackage.STATE__REGION:
                return ((InternalEList<?>)getRegion()).basicRemove(otherEnd, msgs);
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
            case UmlPackage.STATE__CONTAINER:
                return eInternalContainer().eInverseRemove(this, UmlPackage.REGION__SUBVERTEX, Region.class, msgs);
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
            case UmlPackage.STATE__IS_LEAF:
                return isIsLeaf();
            case UmlPackage.STATE__REDEFINED_ELEMENT:
                return getRedefinedElement();
            case UmlPackage.STATE__REDEFINITION_CONTEXT:
                return getRedefinitionContext();
            case UmlPackage.STATE__INCOMING:
                return getIncoming();
            case UmlPackage.STATE__OUTGOING:
                return getOutgoing();
            case UmlPackage.STATE__CONTAINER:
                return getContainer();
            case UmlPackage.STATE__IS_COMPOSITE:
                return isIsComposite();
            case UmlPackage.STATE__IS_ORTHOGONAL:
                return isIsOrthogonal();
            case UmlPackage.STATE__IS_SIMPLE:
                return isIsSimple();
            case UmlPackage.STATE__IS_SUBMACHINE_STATE:
                return isIsSubmachineState();
            case UmlPackage.STATE__SUBMACHINE:
                if (resolve) return getSubmachine();
                return basicGetSubmachine();
            case UmlPackage.STATE__CONNECTION:
                return getConnection();
            case UmlPackage.STATE__CONNECTION_POINT:
                return getConnectionPoint();
            case UmlPackage.STATE__REDEFINED_STATE:
                if (resolve) return getRedefinedState();
                return basicGetRedefinedState();
            case UmlPackage.STATE__STATE_INVARIANT:
                return getStateInvariant();
            case UmlPackage.STATE__ENTRY:
                return getEntry();
            case UmlPackage.STATE__EXIT:
                return getExit();
            case UmlPackage.STATE__DO_ACTIVITY:
                return getDoActivity();
            case UmlPackage.STATE__DEFERRABLE_TRIGGER:
                return getDeferrableTrigger();
            case UmlPackage.STATE__REGION:
                return getRegion();
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
            case UmlPackage.STATE__IS_LEAF:
                setIsLeaf((Boolean)newValue);
                return;
            case UmlPackage.STATE__INCOMING:
                getIncoming().clear();
                getIncoming().addAll((Collection<? extends Transition>)newValue);
                return;
            case UmlPackage.STATE__OUTGOING:
                getOutgoing().clear();
                getOutgoing().addAll((Collection<? extends Transition>)newValue);
                return;
            case UmlPackage.STATE__CONTAINER:
                setContainer((Region)newValue);
                return;
            case UmlPackage.STATE__SUBMACHINE:
                setSubmachine((StateMachine)newValue);
                return;
            case UmlPackage.STATE__CONNECTION:
                getConnection().clear();
                getConnection().addAll((Collection<? extends ConnectionPointReference>)newValue);
                return;
            case UmlPackage.STATE__CONNECTION_POINT:
                getConnectionPoint().clear();
                getConnectionPoint().addAll((Collection<? extends Pseudostate>)newValue);
                return;
            case UmlPackage.STATE__REDEFINED_STATE:
                setRedefinedState((State)newValue);
                return;
            case UmlPackage.STATE__STATE_INVARIANT:
                setStateInvariant((Constraint)newValue);
                return;
            case UmlPackage.STATE__ENTRY:
                setEntry((Behavior)newValue);
                return;
            case UmlPackage.STATE__EXIT:
                setExit((Behavior)newValue);
                return;
            case UmlPackage.STATE__DO_ACTIVITY:
                setDoActivity((Behavior)newValue);
                return;
            case UmlPackage.STATE__DEFERRABLE_TRIGGER:
                getDeferrableTrigger().clear();
                getDeferrableTrigger().addAll((Collection<? extends Trigger>)newValue);
                return;
            case UmlPackage.STATE__REGION:
                getRegion().clear();
                getRegion().addAll((Collection<? extends Region>)newValue);
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
            case UmlPackage.STATE__IS_LEAF:
                setIsLeaf(IS_LEAF_EDEFAULT);
                return;
            case UmlPackage.STATE__INCOMING:
                getIncoming().clear();
                return;
            case UmlPackage.STATE__OUTGOING:
                getOutgoing().clear();
                return;
            case UmlPackage.STATE__CONTAINER:
                setContainer((Region)null);
                return;
            case UmlPackage.STATE__SUBMACHINE:
                setSubmachine((StateMachine)null);
                return;
            case UmlPackage.STATE__CONNECTION:
                getConnection().clear();
                return;
            case UmlPackage.STATE__CONNECTION_POINT:
                getConnectionPoint().clear();
                return;
            case UmlPackage.STATE__REDEFINED_STATE:
                setRedefinedState((State)null);
                return;
            case UmlPackage.STATE__STATE_INVARIANT:
                setStateInvariant((Constraint)null);
                return;
            case UmlPackage.STATE__ENTRY:
                setEntry((Behavior)null);
                return;
            case UmlPackage.STATE__EXIT:
                setExit((Behavior)null);
                return;
            case UmlPackage.STATE__DO_ACTIVITY:
                setDoActivity((Behavior)null);
                return;
            case UmlPackage.STATE__DEFERRABLE_TRIGGER:
                getDeferrableTrigger().clear();
                return;
            case UmlPackage.STATE__REGION:
                getRegion().clear();
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
            case UmlPackage.STATE__IS_LEAF:
                return isLeaf != IS_LEAF_EDEFAULT;
            case UmlPackage.STATE__REDEFINED_ELEMENT:
                return !getRedefinedElement().isEmpty();
            case UmlPackage.STATE__REDEFINITION_CONTEXT:
                return !getRedefinitionContext().isEmpty();
            case UmlPackage.STATE__INCOMING:
                return !getIncoming().isEmpty();
            case UmlPackage.STATE__OUTGOING:
                return !getOutgoing().isEmpty();
            case UmlPackage.STATE__CONTAINER:
                return getContainer() != null;
            case UmlPackage.STATE__IS_COMPOSITE:
                return isIsComposite() != IS_COMPOSITE_EDEFAULT;
            case UmlPackage.STATE__IS_ORTHOGONAL:
                return isIsOrthogonal() != IS_ORTHOGONAL_EDEFAULT;
            case UmlPackage.STATE__IS_SIMPLE:
                return isIsSimple() != IS_SIMPLE_EDEFAULT;
            case UmlPackage.STATE__IS_SUBMACHINE_STATE:
                return isIsSubmachineState() != IS_SUBMACHINE_STATE_EDEFAULT;
            case UmlPackage.STATE__SUBMACHINE:
                return submachine != null;
            case UmlPackage.STATE__CONNECTION:
                return connection != null && !connection.isEmpty();
            case UmlPackage.STATE__CONNECTION_POINT:
                return connectionPoint != null && !connectionPoint.isEmpty();
            case UmlPackage.STATE__REDEFINED_STATE:
                return redefinedState != null;
            case UmlPackage.STATE__STATE_INVARIANT:
                return stateInvariant != null;
            case UmlPackage.STATE__ENTRY:
                return entry != null;
            case UmlPackage.STATE__EXIT:
                return exit != null;
            case UmlPackage.STATE__DO_ACTIVITY:
                return doActivity != null;
            case UmlPackage.STATE__DEFERRABLE_TRIGGER:
                return deferrableTrigger != null && !deferrableTrigger.isEmpty();
            case UmlPackage.STATE__REGION:
                return region != null && !region.isEmpty();
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
                case UmlPackage.STATE__IS_LEAF: return UmlPackage.REDEFINABLE_ELEMENT__IS_LEAF;
                case UmlPackage.STATE__REDEFINED_ELEMENT: return UmlPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
                case UmlPackage.STATE__REDEFINITION_CONTEXT: return UmlPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
                default: return -1;
            }
        }
        if (baseClass == Vertex.class) {
            switch (derivedFeatureID) {
                case UmlPackage.STATE__INCOMING: return UmlPackage.VERTEX__INCOMING;
                case UmlPackage.STATE__OUTGOING: return UmlPackage.VERTEX__OUTGOING;
                case UmlPackage.STATE__CONTAINER: return UmlPackage.VERTEX__CONTAINER;
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
                case UmlPackage.REDEFINABLE_ELEMENT__IS_LEAF: return UmlPackage.STATE__IS_LEAF;
                case UmlPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT: return UmlPackage.STATE__REDEFINED_ELEMENT;
                case UmlPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT: return UmlPackage.STATE__REDEFINITION_CONTEXT;
                default: return -1;
            }
        }
        if (baseClass == Vertex.class) {
            switch (baseFeatureID) {
                case UmlPackage.VERTEX__INCOMING: return UmlPackage.STATE__INCOMING;
                case UmlPackage.VERTEX__OUTGOING: return UmlPackage.STATE__OUTGOING;
                case UmlPackage.VERTEX__CONTAINER: return UmlPackage.STATE__CONTAINER;
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

} //StateImpl
