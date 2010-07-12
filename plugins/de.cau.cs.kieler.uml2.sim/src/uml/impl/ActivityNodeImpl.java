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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Activity;
import uml.ActivityEdge;
import uml.ActivityGroup;
import uml.ActivityNode;
import uml.ActivityPartition;
import uml.InterruptibleActivityRegion;
import uml.StructuredActivityNode;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ActivityNodeImpl#getInStructuredNode <em>In Structured Node</em>}</li>
 *   <li>{@link uml.impl.ActivityNodeImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link uml.impl.ActivityNodeImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link uml.impl.ActivityNodeImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link uml.impl.ActivityNodeImpl#getInPartition <em>In Partition</em>}</li>
 *   <li>{@link uml.impl.ActivityNodeImpl#getInInterruptibleRegion <em>In Interruptible Region</em>}</li>
 *   <li>{@link uml.impl.ActivityNodeImpl#getInGroup <em>In Group</em>}</li>
 *   <li>{@link uml.impl.ActivityNodeImpl#getRedefinedNode <em>Redefined Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActivityNodeImpl extends RedefinableElementImpl implements ActivityNode {
    /**
     * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutgoing()
     * @generated
     * @ordered
     */
    protected EList<ActivityEdge> outgoing;

    /**
     * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIncoming()
     * @generated
     * @ordered
     */
    protected EList<ActivityEdge> incoming;

    /**
     * The cached value of the '{@link #getInPartition() <em>In Partition</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInPartition()
     * @generated
     * @ordered
     */
    protected EList<ActivityPartition> inPartition;

    /**
     * The cached value of the '{@link #getInInterruptibleRegion() <em>In Interruptible Region</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInInterruptibleRegion()
     * @generated
     * @ordered
     */
    protected EList<InterruptibleActivityRegion> inInterruptibleRegion;

    /**
     * The cached value of the '{@link #getRedefinedNode() <em>Redefined Node</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRedefinedNode()
     * @generated
     * @ordered
     */
    protected EList<ActivityNode> redefinedNode;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActivityNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getActivityNode();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StructuredActivityNode getInStructuredNode() {
        if (eContainerFeatureID() != UmlPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE) return null;
        return (StructuredActivityNode)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInStructuredNode(StructuredActivityNode newInStructuredNode, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newInStructuredNode, UmlPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInStructuredNode(StructuredActivityNode newInStructuredNode) {
        if (newInStructuredNode != eInternalContainer() || (eContainerFeatureID() != UmlPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE && newInStructuredNode != null)) {
            if (EcoreUtil.isAncestor(this, newInStructuredNode))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newInStructuredNode != null)
                msgs = ((InternalEObject)newInStructuredNode).eInverseAdd(this, UmlPackage.STRUCTURED_ACTIVITY_NODE__NODE, StructuredActivityNode.class, msgs);
            msgs = basicSetInStructuredNode(newInStructuredNode, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE, newInStructuredNode, newInStructuredNode));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Activity getActivity() {
        if (eContainerFeatureID() != UmlPackage.ACTIVITY_NODE__ACTIVITY) return null;
        return (Activity)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetActivity(Activity newActivity, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newActivity, UmlPackage.ACTIVITY_NODE__ACTIVITY, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setActivity(Activity newActivity) {
        if (newActivity != eInternalContainer() || (eContainerFeatureID() != UmlPackage.ACTIVITY_NODE__ACTIVITY && newActivity != null)) {
            if (EcoreUtil.isAncestor(this, newActivity))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newActivity != null)
                msgs = ((InternalEObject)newActivity).eInverseAdd(this, UmlPackage.ACTIVITY__NODE, Activity.class, msgs);
            msgs = basicSetActivity(newActivity, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACTIVITY_NODE__ACTIVITY, newActivity, newActivity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ActivityEdge> getOutgoing() {
        if (outgoing == null) {
            outgoing = new EObjectWithInverseResolvingEList<ActivityEdge>(ActivityEdge.class, this, UmlPackage.ACTIVITY_NODE__OUTGOING, UmlPackage.ACTIVITY_EDGE__SOURCE);
        }
        return outgoing;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ActivityEdge> getIncoming() {
        if (incoming == null) {
            incoming = new EObjectWithInverseResolvingEList<ActivityEdge>(ActivityEdge.class, this, UmlPackage.ACTIVITY_NODE__INCOMING, UmlPackage.ACTIVITY_EDGE__TARGET);
        }
        return incoming;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ActivityPartition> getInPartition() {
        if (inPartition == null) {
            inPartition = new EObjectWithInverseResolvingEList.ManyInverse<ActivityPartition>(ActivityPartition.class, this, UmlPackage.ACTIVITY_NODE__IN_PARTITION, UmlPackage.ACTIVITY_PARTITION__NODE);
        }
        return inPartition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InterruptibleActivityRegion> getInInterruptibleRegion() {
        if (inInterruptibleRegion == null) {
            inInterruptibleRegion = new EObjectWithInverseResolvingEList.ManyInverse<InterruptibleActivityRegion>(InterruptibleActivityRegion.class, this, UmlPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION, UmlPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE);
        }
        return inInterruptibleRegion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ActivityGroup> getInGroup() {
        // TODO: implement this method to return the 'In Group' reference list
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
    public EList<ActivityNode> getRedefinedNode() {
        if (redefinedNode == null) {
            redefinedNode = new EObjectResolvingEList<ActivityNode>(ActivityNode.class, this, UmlPackage.ACTIVITY_NODE__REDEFINED_NODE);
        }
        return redefinedNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean owned_structured_node(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.ACTIVITY_NODE__OWNED_STRUCTURED_NODE,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "owned_structured_node", EObjectValidator.getObjectLabel(this, context) }),
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
                         UmlValidator.ACTIVITY_NODE__OWNED,
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
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetInStructuredNode((StructuredActivityNode)otherEnd, msgs);
            case UmlPackage.ACTIVITY_NODE__ACTIVITY:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetActivity((Activity)otherEnd, msgs);
            case UmlPackage.ACTIVITY_NODE__OUTGOING:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
            case UmlPackage.ACTIVITY_NODE__INCOMING:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
            case UmlPackage.ACTIVITY_NODE__IN_PARTITION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInPartition()).basicAdd(otherEnd, msgs);
            case UmlPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInInterruptibleRegion()).basicAdd(otherEnd, msgs);
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
            case UmlPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE:
                return basicSetInStructuredNode(null, msgs);
            case UmlPackage.ACTIVITY_NODE__ACTIVITY:
                return basicSetActivity(null, msgs);
            case UmlPackage.ACTIVITY_NODE__OUTGOING:
                return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
            case UmlPackage.ACTIVITY_NODE__INCOMING:
                return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
            case UmlPackage.ACTIVITY_NODE__IN_PARTITION:
                return ((InternalEList<?>)getInPartition()).basicRemove(otherEnd, msgs);
            case UmlPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
                return ((InternalEList<?>)getInInterruptibleRegion()).basicRemove(otherEnd, msgs);
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
            case UmlPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE:
                return eInternalContainer().eInverseRemove(this, UmlPackage.STRUCTURED_ACTIVITY_NODE__NODE, StructuredActivityNode.class, msgs);
            case UmlPackage.ACTIVITY_NODE__ACTIVITY:
                return eInternalContainer().eInverseRemove(this, UmlPackage.ACTIVITY__NODE, Activity.class, msgs);
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
            case UmlPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE:
                return getInStructuredNode();
            case UmlPackage.ACTIVITY_NODE__ACTIVITY:
                return getActivity();
            case UmlPackage.ACTIVITY_NODE__OUTGOING:
                return getOutgoing();
            case UmlPackage.ACTIVITY_NODE__INCOMING:
                return getIncoming();
            case UmlPackage.ACTIVITY_NODE__IN_PARTITION:
                return getInPartition();
            case UmlPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
                return getInInterruptibleRegion();
            case UmlPackage.ACTIVITY_NODE__IN_GROUP:
                return getInGroup();
            case UmlPackage.ACTIVITY_NODE__REDEFINED_NODE:
                return getRedefinedNode();
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
            case UmlPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE:
                setInStructuredNode((StructuredActivityNode)newValue);
                return;
            case UmlPackage.ACTIVITY_NODE__ACTIVITY:
                setActivity((Activity)newValue);
                return;
            case UmlPackage.ACTIVITY_NODE__OUTGOING:
                getOutgoing().clear();
                getOutgoing().addAll((Collection<? extends ActivityEdge>)newValue);
                return;
            case UmlPackage.ACTIVITY_NODE__INCOMING:
                getIncoming().clear();
                getIncoming().addAll((Collection<? extends ActivityEdge>)newValue);
                return;
            case UmlPackage.ACTIVITY_NODE__IN_PARTITION:
                getInPartition().clear();
                getInPartition().addAll((Collection<? extends ActivityPartition>)newValue);
                return;
            case UmlPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
                getInInterruptibleRegion().clear();
                getInInterruptibleRegion().addAll((Collection<? extends InterruptibleActivityRegion>)newValue);
                return;
            case UmlPackage.ACTIVITY_NODE__REDEFINED_NODE:
                getRedefinedNode().clear();
                getRedefinedNode().addAll((Collection<? extends ActivityNode>)newValue);
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
            case UmlPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE:
                setInStructuredNode((StructuredActivityNode)null);
                return;
            case UmlPackage.ACTIVITY_NODE__ACTIVITY:
                setActivity((Activity)null);
                return;
            case UmlPackage.ACTIVITY_NODE__OUTGOING:
                getOutgoing().clear();
                return;
            case UmlPackage.ACTIVITY_NODE__INCOMING:
                getIncoming().clear();
                return;
            case UmlPackage.ACTIVITY_NODE__IN_PARTITION:
                getInPartition().clear();
                return;
            case UmlPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
                getInInterruptibleRegion().clear();
                return;
            case UmlPackage.ACTIVITY_NODE__REDEFINED_NODE:
                getRedefinedNode().clear();
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
            case UmlPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE:
                return getInStructuredNode() != null;
            case UmlPackage.ACTIVITY_NODE__ACTIVITY:
                return getActivity() != null;
            case UmlPackage.ACTIVITY_NODE__OUTGOING:
                return outgoing != null && !outgoing.isEmpty();
            case UmlPackage.ACTIVITY_NODE__INCOMING:
                return incoming != null && !incoming.isEmpty();
            case UmlPackage.ACTIVITY_NODE__IN_PARTITION:
                return inPartition != null && !inPartition.isEmpty();
            case UmlPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
                return inInterruptibleRegion != null && !inInterruptibleRegion.isEmpty();
            case UmlPackage.ACTIVITY_NODE__IN_GROUP:
                return !getInGroup().isEmpty();
            case UmlPackage.ACTIVITY_NODE__REDEFINED_NODE:
                return redefinedNode != null && !redefinedNode.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ActivityNodeImpl
