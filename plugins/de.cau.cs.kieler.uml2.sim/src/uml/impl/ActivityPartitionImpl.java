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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Activity;
import uml.ActivityEdge;
import uml.ActivityGroup;
import uml.ActivityNode;
import uml.ActivityPartition;
import uml.Element;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ActivityPartitionImpl#getSubgroup <em>Subgroup</em>}</li>
 *   <li>{@link uml.impl.ActivityPartitionImpl#getSuperGroup <em>Super Group</em>}</li>
 *   <li>{@link uml.impl.ActivityPartitionImpl#getInActivity <em>In Activity</em>}</li>
 *   <li>{@link uml.impl.ActivityPartitionImpl#getContainedEdge <em>Contained Edge</em>}</li>
 *   <li>{@link uml.impl.ActivityPartitionImpl#getContainedNode <em>Contained Node</em>}</li>
 *   <li>{@link uml.impl.ActivityPartitionImpl#isIsDimension <em>Is Dimension</em>}</li>
 *   <li>{@link uml.impl.ActivityPartitionImpl#isIsExternal <em>Is External</em>}</li>
 *   <li>{@link uml.impl.ActivityPartitionImpl#getNode <em>Node</em>}</li>
 *   <li>{@link uml.impl.ActivityPartitionImpl#getSubpartition <em>Subpartition</em>}</li>
 *   <li>{@link uml.impl.ActivityPartitionImpl#getSuperPartition <em>Super Partition</em>}</li>
 *   <li>{@link uml.impl.ActivityPartitionImpl#getRepresents <em>Represents</em>}</li>
 *   <li>{@link uml.impl.ActivityPartitionImpl#getEdge <em>Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityPartitionImpl extends NamedElementImpl implements ActivityPartition {
    /**
     * The default value of the '{@link #isIsDimension() <em>Is Dimension</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsDimension()
     * @generated
     * @ordered
     */
    protected static final boolean IS_DIMENSION_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsDimension() <em>Is Dimension</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsDimension()
     * @generated
     * @ordered
     */
    protected boolean isDimension = IS_DIMENSION_EDEFAULT;

    /**
     * The default value of the '{@link #isIsExternal() <em>Is External</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsExternal()
     * @generated
     * @ordered
     */
    protected static final boolean IS_EXTERNAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsExternal() <em>Is External</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsExternal()
     * @generated
     * @ordered
     */
    protected boolean isExternal = IS_EXTERNAL_EDEFAULT;

    /**
     * The cached value of the '{@link #getNode() <em>Node</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNode()
     * @generated
     * @ordered
     */
    protected EList<ActivityNode> node;

    /**
     * The cached value of the '{@link #getSubpartition() <em>Subpartition</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubpartition()
     * @generated
     * @ordered
     */
    protected EList<ActivityPartition> subpartition;

    /**
     * The cached value of the '{@link #getRepresents() <em>Represents</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRepresents()
     * @generated
     * @ordered
     */
    protected Element represents;

    /**
     * The cached value of the '{@link #getEdge() <em>Edge</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEdge()
     * @generated
     * @ordered
     */
    protected EList<ActivityEdge> edge;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActivityPartitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getActivityPartition();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ActivityGroup> getSubgroup() {
        // TODO: implement this method to return the 'Subgroup' reference list
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
    public ActivityGroup getSuperGroup() {
        ActivityGroup superGroup = basicGetSuperGroup();
        return superGroup != null && superGroup.eIsProxy() ? (ActivityGroup)eResolveProxy((InternalEObject)superGroup) : superGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityGroup basicGetSuperGroup() {
        // TODO: implement this method to return the 'Super Group' reference
        // -> do not perform proxy resolution
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Activity getInActivity() {
        if (eContainerFeatureID() != UmlPackage.ACTIVITY_PARTITION__IN_ACTIVITY) return null;
        return (Activity)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInActivity(Activity newInActivity, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newInActivity, UmlPackage.ACTIVITY_PARTITION__IN_ACTIVITY, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInActivity(Activity newInActivity) {
        if (newInActivity != eInternalContainer() || (eContainerFeatureID() != UmlPackage.ACTIVITY_PARTITION__IN_ACTIVITY && newInActivity != null)) {
            if (EcoreUtil.isAncestor(this, newInActivity))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newInActivity != null)
                msgs = ((InternalEObject)newInActivity).eInverseAdd(this, UmlPackage.ACTIVITY__GROUP, Activity.class, msgs);
            msgs = basicSetInActivity(newInActivity, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACTIVITY_PARTITION__IN_ACTIVITY, newInActivity, newInActivity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ActivityEdge> getContainedEdge() {
        // TODO: implement this method to return the 'Contained Edge' reference list
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
    public EList<ActivityNode> getContainedNode() {
        // TODO: implement this method to return the 'Contained Node' reference list
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
    public boolean isIsDimension() {
        return isDimension;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsDimension(boolean newIsDimension) {
        boolean oldIsDimension = isDimension;
        isDimension = newIsDimension;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACTIVITY_PARTITION__IS_DIMENSION, oldIsDimension, isDimension));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsExternal() {
        return isExternal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsExternal(boolean newIsExternal) {
        boolean oldIsExternal = isExternal;
        isExternal = newIsExternal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACTIVITY_PARTITION__IS_EXTERNAL, oldIsExternal, isExternal));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ActivityNode> getNode() {
        if (node == null) {
            node = new EObjectWithInverseResolvingEList.ManyInverse<ActivityNode>(ActivityNode.class, this, UmlPackage.ACTIVITY_PARTITION__NODE, UmlPackage.ACTIVITY_NODE__IN_PARTITION);
        }
        return node;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ActivityPartition> getSubpartition() {
        if (subpartition == null) {
            subpartition = new EObjectContainmentWithInverseEList<ActivityPartition>(ActivityPartition.class, this, UmlPackage.ACTIVITY_PARTITION__SUBPARTITION, UmlPackage.ACTIVITY_PARTITION__SUPER_PARTITION);
        }
        return subpartition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityPartition getSuperPartition() {
        if (eContainerFeatureID() != UmlPackage.ACTIVITY_PARTITION__SUPER_PARTITION) return null;
        return (ActivityPartition)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSuperPartition(ActivityPartition newSuperPartition, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newSuperPartition, UmlPackage.ACTIVITY_PARTITION__SUPER_PARTITION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSuperPartition(ActivityPartition newSuperPartition) {
        if (newSuperPartition != eInternalContainer() || (eContainerFeatureID() != UmlPackage.ACTIVITY_PARTITION__SUPER_PARTITION && newSuperPartition != null)) {
            if (EcoreUtil.isAncestor(this, newSuperPartition))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newSuperPartition != null)
                msgs = ((InternalEObject)newSuperPartition).eInverseAdd(this, UmlPackage.ACTIVITY_PARTITION__SUBPARTITION, ActivityPartition.class, msgs);
            msgs = basicSetSuperPartition(newSuperPartition, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACTIVITY_PARTITION__SUPER_PARTITION, newSuperPartition, newSuperPartition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Element getRepresents() {
        if (represents != null && represents.eIsProxy()) {
            InternalEObject oldRepresents = (InternalEObject)represents;
            represents = (Element)eResolveProxy(oldRepresents);
            if (represents != oldRepresents) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.ACTIVITY_PARTITION__REPRESENTS, oldRepresents, represents));
            }
        }
        return represents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Element basicGetRepresents() {
        return represents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRepresents(Element newRepresents) {
        Element oldRepresents = represents;
        represents = newRepresents;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACTIVITY_PARTITION__REPRESENTS, oldRepresents, represents));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ActivityEdge> getEdge() {
        if (edge == null) {
            edge = new EObjectWithInverseResolvingEList.ManyInverse<ActivityEdge>(ActivityEdge.class, this, UmlPackage.ACTIVITY_PARTITION__EDGE, UmlPackage.ACTIVITY_EDGE__IN_PARTITION);
        }
        return edge;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean dimension_not_contained(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.ACTIVITY_PARTITION__DIMENSION_NOT_CONTAINED,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "dimension_not_contained", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean represents_part(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.ACTIVITY_PARTITION__REPRESENTS_PART,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "represents_part", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean represents_classifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.ACTIVITY_PARTITION__REPRESENTS_CLASSIFIER,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "represents_classifier", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean represents_part_and_is_contained(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.ACTIVITY_PARTITION__REPRESENTS_PART_AND_IS_CONTAINED,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "represents_part_and_is_contained", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean nodes_and_edges(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.ACTIVITY_GROUP__NODES_AND_EDGES,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "nodes_and_edges", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean not_contained(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.ACTIVITY_GROUP__NOT_CONTAINED,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "not_contained", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean group_owned(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.ACTIVITY_GROUP__GROUP_OWNED,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "group_owned", EObjectValidator.getObjectLabel(this, context) }),
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
            case UmlPackage.ACTIVITY_PARTITION__IN_ACTIVITY:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetInActivity((Activity)otherEnd, msgs);
            case UmlPackage.ACTIVITY_PARTITION__NODE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getNode()).basicAdd(otherEnd, msgs);
            case UmlPackage.ACTIVITY_PARTITION__SUBPARTITION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubpartition()).basicAdd(otherEnd, msgs);
            case UmlPackage.ACTIVITY_PARTITION__SUPER_PARTITION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetSuperPartition((ActivityPartition)otherEnd, msgs);
            case UmlPackage.ACTIVITY_PARTITION__EDGE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getEdge()).basicAdd(otherEnd, msgs);
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
            case UmlPackage.ACTIVITY_PARTITION__IN_ACTIVITY:
                return basicSetInActivity(null, msgs);
            case UmlPackage.ACTIVITY_PARTITION__NODE:
                return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
            case UmlPackage.ACTIVITY_PARTITION__SUBPARTITION:
                return ((InternalEList<?>)getSubpartition()).basicRemove(otherEnd, msgs);
            case UmlPackage.ACTIVITY_PARTITION__SUPER_PARTITION:
                return basicSetSuperPartition(null, msgs);
            case UmlPackage.ACTIVITY_PARTITION__EDGE:
                return ((InternalEList<?>)getEdge()).basicRemove(otherEnd, msgs);
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
            case UmlPackage.ACTIVITY_PARTITION__IN_ACTIVITY:
                return eInternalContainer().eInverseRemove(this, UmlPackage.ACTIVITY__GROUP, Activity.class, msgs);
            case UmlPackage.ACTIVITY_PARTITION__SUPER_PARTITION:
                return eInternalContainer().eInverseRemove(this, UmlPackage.ACTIVITY_PARTITION__SUBPARTITION, ActivityPartition.class, msgs);
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
            case UmlPackage.ACTIVITY_PARTITION__SUBGROUP:
                return getSubgroup();
            case UmlPackage.ACTIVITY_PARTITION__SUPER_GROUP:
                if (resolve) return getSuperGroup();
                return basicGetSuperGroup();
            case UmlPackage.ACTIVITY_PARTITION__IN_ACTIVITY:
                return getInActivity();
            case UmlPackage.ACTIVITY_PARTITION__CONTAINED_EDGE:
                return getContainedEdge();
            case UmlPackage.ACTIVITY_PARTITION__CONTAINED_NODE:
                return getContainedNode();
            case UmlPackage.ACTIVITY_PARTITION__IS_DIMENSION:
                return isIsDimension();
            case UmlPackage.ACTIVITY_PARTITION__IS_EXTERNAL:
                return isIsExternal();
            case UmlPackage.ACTIVITY_PARTITION__NODE:
                return getNode();
            case UmlPackage.ACTIVITY_PARTITION__SUBPARTITION:
                return getSubpartition();
            case UmlPackage.ACTIVITY_PARTITION__SUPER_PARTITION:
                return getSuperPartition();
            case UmlPackage.ACTIVITY_PARTITION__REPRESENTS:
                if (resolve) return getRepresents();
                return basicGetRepresents();
            case UmlPackage.ACTIVITY_PARTITION__EDGE:
                return getEdge();
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
            case UmlPackage.ACTIVITY_PARTITION__IN_ACTIVITY:
                setInActivity((Activity)newValue);
                return;
            case UmlPackage.ACTIVITY_PARTITION__IS_DIMENSION:
                setIsDimension((Boolean)newValue);
                return;
            case UmlPackage.ACTIVITY_PARTITION__IS_EXTERNAL:
                setIsExternal((Boolean)newValue);
                return;
            case UmlPackage.ACTIVITY_PARTITION__NODE:
                getNode().clear();
                getNode().addAll((Collection<? extends ActivityNode>)newValue);
                return;
            case UmlPackage.ACTIVITY_PARTITION__SUBPARTITION:
                getSubpartition().clear();
                getSubpartition().addAll((Collection<? extends ActivityPartition>)newValue);
                return;
            case UmlPackage.ACTIVITY_PARTITION__SUPER_PARTITION:
                setSuperPartition((ActivityPartition)newValue);
                return;
            case UmlPackage.ACTIVITY_PARTITION__REPRESENTS:
                setRepresents((Element)newValue);
                return;
            case UmlPackage.ACTIVITY_PARTITION__EDGE:
                getEdge().clear();
                getEdge().addAll((Collection<? extends ActivityEdge>)newValue);
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
            case UmlPackage.ACTIVITY_PARTITION__IN_ACTIVITY:
                setInActivity((Activity)null);
                return;
            case UmlPackage.ACTIVITY_PARTITION__IS_DIMENSION:
                setIsDimension(IS_DIMENSION_EDEFAULT);
                return;
            case UmlPackage.ACTIVITY_PARTITION__IS_EXTERNAL:
                setIsExternal(IS_EXTERNAL_EDEFAULT);
                return;
            case UmlPackage.ACTIVITY_PARTITION__NODE:
                getNode().clear();
                return;
            case UmlPackage.ACTIVITY_PARTITION__SUBPARTITION:
                getSubpartition().clear();
                return;
            case UmlPackage.ACTIVITY_PARTITION__SUPER_PARTITION:
                setSuperPartition((ActivityPartition)null);
                return;
            case UmlPackage.ACTIVITY_PARTITION__REPRESENTS:
                setRepresents((Element)null);
                return;
            case UmlPackage.ACTIVITY_PARTITION__EDGE:
                getEdge().clear();
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
            case UmlPackage.ACTIVITY_PARTITION__SUBGROUP:
                return !getSubgroup().isEmpty();
            case UmlPackage.ACTIVITY_PARTITION__SUPER_GROUP:
                return basicGetSuperGroup() != null;
            case UmlPackage.ACTIVITY_PARTITION__IN_ACTIVITY:
                return getInActivity() != null;
            case UmlPackage.ACTIVITY_PARTITION__CONTAINED_EDGE:
                return !getContainedEdge().isEmpty();
            case UmlPackage.ACTIVITY_PARTITION__CONTAINED_NODE:
                return !getContainedNode().isEmpty();
            case UmlPackage.ACTIVITY_PARTITION__IS_DIMENSION:
                return isDimension != IS_DIMENSION_EDEFAULT;
            case UmlPackage.ACTIVITY_PARTITION__IS_EXTERNAL:
                return isExternal != IS_EXTERNAL_EDEFAULT;
            case UmlPackage.ACTIVITY_PARTITION__NODE:
                return node != null && !node.isEmpty();
            case UmlPackage.ACTIVITY_PARTITION__SUBPARTITION:
                return subpartition != null && !subpartition.isEmpty();
            case UmlPackage.ACTIVITY_PARTITION__SUPER_PARTITION:
                return getSuperPartition() != null;
            case UmlPackage.ACTIVITY_PARTITION__REPRESENTS:
                return represents != null;
            case UmlPackage.ACTIVITY_PARTITION__EDGE:
                return edge != null && !edge.isEmpty();
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
        if (baseClass == ActivityGroup.class) {
            switch (derivedFeatureID) {
                case UmlPackage.ACTIVITY_PARTITION__SUBGROUP: return UmlPackage.ACTIVITY_GROUP__SUBGROUP;
                case UmlPackage.ACTIVITY_PARTITION__SUPER_GROUP: return UmlPackage.ACTIVITY_GROUP__SUPER_GROUP;
                case UmlPackage.ACTIVITY_PARTITION__IN_ACTIVITY: return UmlPackage.ACTIVITY_GROUP__IN_ACTIVITY;
                case UmlPackage.ACTIVITY_PARTITION__CONTAINED_EDGE: return UmlPackage.ACTIVITY_GROUP__CONTAINED_EDGE;
                case UmlPackage.ACTIVITY_PARTITION__CONTAINED_NODE: return UmlPackage.ACTIVITY_GROUP__CONTAINED_NODE;
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
        if (baseClass == ActivityGroup.class) {
            switch (baseFeatureID) {
                case UmlPackage.ACTIVITY_GROUP__SUBGROUP: return UmlPackage.ACTIVITY_PARTITION__SUBGROUP;
                case UmlPackage.ACTIVITY_GROUP__SUPER_GROUP: return UmlPackage.ACTIVITY_PARTITION__SUPER_GROUP;
                case UmlPackage.ACTIVITY_GROUP__IN_ACTIVITY: return UmlPackage.ACTIVITY_PARTITION__IN_ACTIVITY;
                case UmlPackage.ACTIVITY_GROUP__CONTAINED_EDGE: return UmlPackage.ACTIVITY_PARTITION__CONTAINED_EDGE;
                case UmlPackage.ACTIVITY_GROUP__CONTAINED_NODE: return UmlPackage.ACTIVITY_PARTITION__CONTAINED_NODE;
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
        result.append(" (isDimension: ");
        result.append(isDimension);
        result.append(", isExternal: ");
        result.append(isExternal);
        result.append(')');
        return result.toString();
    }

} //ActivityPartitionImpl
