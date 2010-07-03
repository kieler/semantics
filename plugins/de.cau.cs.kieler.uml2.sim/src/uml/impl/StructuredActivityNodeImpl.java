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

import uml.Activity;
import uml.ActivityEdge;
import uml.ActivityGroup;
import uml.ActivityNode;
import uml.Constraint;
import uml.ElementImport;
import uml.NamedElement;
import uml.Namespace;
import uml.PackageImport;
import uml.PackageableElement;
import uml.StructuredActivityNode;
import uml.UmlPackage;
import uml.Variable;
import uml.VisibilityKind;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#getElementImport <em>Element Import</em>}</li>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#getPackageImport <em>Package Import</em>}</li>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#getOwnedRule <em>Owned Rule</em>}</li>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#getMember <em>Member</em>}</li>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#getImportedMember <em>Imported Member</em>}</li>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#getSubgroup <em>Subgroup</em>}</li>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#getSuperGroup <em>Super Group</em>}</li>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#getInActivity <em>In Activity</em>}</li>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#getContainedEdge <em>Contained Edge</em>}</li>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#getContainedNode <em>Contained Node</em>}</li>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#isMustIsolate <em>Must Isolate</em>}</li>
 *   <li>{@link uml.impl.StructuredActivityNodeImpl#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuredActivityNodeImpl extends ActionImpl implements StructuredActivityNode {
    /**
     * The cached value of the '{@link #getElementImport() <em>Element Import</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElementImport()
     * @generated
     * @ordered
     */
    protected EList<ElementImport> elementImport;

    /**
     * The cached value of the '{@link #getPackageImport() <em>Package Import</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPackageImport()
     * @generated
     * @ordered
     */
    protected EList<PackageImport> packageImport;

    /**
     * The cached value of the '{@link #getOwnedRule() <em>Owned Rule</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedRule()
     * @generated
     * @ordered
     */
    protected EList<Constraint> ownedRule;

    /**
     * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariable()
     * @generated
     * @ordered
     */
    protected EList<Variable> variable;

    /**
     * The cached value of the '{@link #getEdge() <em>Edge</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEdge()
     * @generated
     * @ordered
     */
    protected EList<ActivityEdge> edge;

    /**
     * The default value of the '{@link #isMustIsolate() <em>Must Isolate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isMustIsolate()
     * @generated
     * @ordered
     */
    protected static final boolean MUST_ISOLATE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isMustIsolate() <em>Must Isolate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isMustIsolate()
     * @generated
     * @ordered
     */
    protected boolean mustIsolate = MUST_ISOLATE_EDEFAULT;

    /**
     * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNode()
     * @generated
     * @ordered
     */
    protected EList<ActivityNode> node;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StructuredActivityNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getStructuredActivityNode();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ElementImport> getElementImport() {
        if (elementImport == null) {
            elementImport = new EObjectContainmentWithInverseEList<ElementImport>(ElementImport.class, this, UmlPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT, UmlPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE);
        }
        return elementImport;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PackageImport> getPackageImport() {
        if (packageImport == null) {
            packageImport = new EObjectContainmentWithInverseEList<PackageImport>(PackageImport.class, this, UmlPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT, UmlPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE);
        }
        return packageImport;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Constraint> getOwnedRule() {
        if (ownedRule == null) {
            ownedRule = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this, UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE, UmlPackage.CONSTRAINT__CONTEXT);
        }
        return ownedRule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<NamedElement> getMember() {
        // TODO: implement this method to return the 'Member' reference list
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
    public EList<PackageableElement> getImportedMember() {
        // TODO: implement this method to return the 'Imported Member' reference list
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
    public EList<NamedElement> getOwnedMember() {
        // TODO: implement this method to return the 'Owned Member' reference list
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
        if (eContainerFeatureID() != UmlPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY) return null;
        return (Activity)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInActivity(Activity newInActivity, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newInActivity, UmlPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInActivity(Activity newInActivity) {
        if (newInActivity != eInternalContainer() || (eContainerFeatureID() != UmlPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY && newInActivity != null)) {
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY, newInActivity, newInActivity));
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
    public EList<Variable> getVariable() {
        if (variable == null) {
            variable = new EObjectContainmentWithInverseEList<Variable>(Variable.class, this, UmlPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE, UmlPackage.VARIABLE__SCOPE);
        }
        return variable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ActivityEdge> getEdge() {
        if (edge == null) {
            edge = new EObjectContainmentWithInverseEList<ActivityEdge>(ActivityEdge.class, this, UmlPackage.STRUCTURED_ACTIVITY_NODE__EDGE, UmlPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE);
        }
        return edge;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isMustIsolate() {
        return mustIsolate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMustIsolate(boolean newMustIsolate) {
        boolean oldMustIsolate = mustIsolate;
        mustIsolate = newMustIsolate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE, oldMustIsolate, mustIsolate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ActivityNode> getNode() {
        if (node == null) {
            node = new EObjectContainmentWithInverseEList<ActivityNode>(ActivityNode.class, this, UmlPackage.STRUCTURED_ACTIVITY_NODE__NODE, UmlPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE);
        }
        return node;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean edges(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.STRUCTURED_ACTIVITY_NODE__EDGES,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "edges", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean members_distinguishable(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.NAMESPACE__MEMBERS_DISTINGUISHABLE,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "members_distinguishable", EObjectValidator.getObjectLabel(this, context) }),
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
    public ElementImport createElementImport(PackageableElement element, VisibilityKind visibility) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PackageImport createPackageImport(uml.Package package_, VisibilityKind visibility) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PackageableElement> getImportedElements() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<uml.Package> getImportedPackages() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PackageableElement> getImportedMembers() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getNamesOfMember(NamedElement element) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean membersAreDistinguishable() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PackageableElement> importMembers(EList<PackageableElement> imps) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PackageableElement> excludeCollisions(EList<PackageableElement> imps) {
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
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getElementImport()).basicAdd(otherEnd, msgs);
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackageImport()).basicAdd(otherEnd, msgs);
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRule()).basicAdd(otherEnd, msgs);
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetInActivity((Activity)otherEnd, msgs);
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariable()).basicAdd(otherEnd, msgs);
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getEdge()).basicAdd(otherEnd, msgs);
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__NODE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getNode()).basicAdd(otherEnd, msgs);
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
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
                return ((InternalEList<?>)getElementImport()).basicRemove(otherEnd, msgs);
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
                return ((InternalEList<?>)getPackageImport()).basicRemove(otherEnd, msgs);
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
                return ((InternalEList<?>)getOwnedRule()).basicRemove(otherEnd, msgs);
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
                return basicSetInActivity(null, msgs);
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
                return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
                return ((InternalEList<?>)getEdge()).basicRemove(otherEnd, msgs);
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__NODE:
                return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
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
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
                return eInternalContainer().eInverseRemove(this, UmlPackage.ACTIVITY__GROUP, Activity.class, msgs);
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
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
                return getElementImport();
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
                return getPackageImport();
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
                return getOwnedRule();
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__MEMBER:
                return getMember();
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER:
                return getImportedMember();
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER:
                return getOwnedMember();
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP:
                return getSubgroup();
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP:
                if (resolve) return getSuperGroup();
                return basicGetSuperGroup();
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
                return getInActivity();
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
                return getContainedEdge();
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
                return getContainedNode();
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
                return getVariable();
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
                return getEdge();
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
                return isMustIsolate();
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__NODE:
                return getNode();
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
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
                getElementImport().clear();
                getElementImport().addAll((Collection<? extends ElementImport>)newValue);
                return;
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
                getPackageImport().clear();
                getPackageImport().addAll((Collection<? extends PackageImport>)newValue);
                return;
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
                getOwnedRule().clear();
                getOwnedRule().addAll((Collection<? extends Constraint>)newValue);
                return;
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
                setInActivity((Activity)newValue);
                return;
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
                getVariable().clear();
                getVariable().addAll((Collection<? extends Variable>)newValue);
                return;
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
                getEdge().clear();
                getEdge().addAll((Collection<? extends ActivityEdge>)newValue);
                return;
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
                setMustIsolate((Boolean)newValue);
                return;
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__NODE:
                getNode().clear();
                getNode().addAll((Collection<? extends ActivityNode>)newValue);
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
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
                getElementImport().clear();
                return;
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
                getPackageImport().clear();
                return;
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
                getOwnedRule().clear();
                return;
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
                setInActivity((Activity)null);
                return;
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
                getVariable().clear();
                return;
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
                getEdge().clear();
                return;
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
                setMustIsolate(MUST_ISOLATE_EDEFAULT);
                return;
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__NODE:
                getNode().clear();
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
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
                return elementImport != null && !elementImport.isEmpty();
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
                return packageImport != null && !packageImport.isEmpty();
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
                return ownedRule != null && !ownedRule.isEmpty();
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__MEMBER:
                return !getMember().isEmpty();
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER:
                return !getImportedMember().isEmpty();
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER:
                return !getOwnedMember().isEmpty();
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP:
                return !getSubgroup().isEmpty();
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP:
                return basicGetSuperGroup() != null;
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
                return getInActivity() != null;
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
                return !getContainedEdge().isEmpty();
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
                return !getContainedNode().isEmpty();
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
                return variable != null && !variable.isEmpty();
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
                return edge != null && !edge.isEmpty();
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
                return mustIsolate != MUST_ISOLATE_EDEFAULT;
            case UmlPackage.STRUCTURED_ACTIVITY_NODE__NODE:
                return node != null && !node.isEmpty();
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
        if (baseClass == Namespace.class) {
            switch (derivedFeatureID) {
                case UmlPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT: return UmlPackage.NAMESPACE__ELEMENT_IMPORT;
                case UmlPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT: return UmlPackage.NAMESPACE__PACKAGE_IMPORT;
                case UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE: return UmlPackage.NAMESPACE__OWNED_RULE;
                case UmlPackage.STRUCTURED_ACTIVITY_NODE__MEMBER: return UmlPackage.NAMESPACE__MEMBER;
                case UmlPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER: return UmlPackage.NAMESPACE__IMPORTED_MEMBER;
                case UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER: return UmlPackage.NAMESPACE__OWNED_MEMBER;
                default: return -1;
            }
        }
        if (baseClass == ActivityGroup.class) {
            switch (derivedFeatureID) {
                case UmlPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP: return UmlPackage.ACTIVITY_GROUP__SUBGROUP;
                case UmlPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP: return UmlPackage.ACTIVITY_GROUP__SUPER_GROUP;
                case UmlPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY: return UmlPackage.ACTIVITY_GROUP__IN_ACTIVITY;
                case UmlPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE: return UmlPackage.ACTIVITY_GROUP__CONTAINED_EDGE;
                case UmlPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE: return UmlPackage.ACTIVITY_GROUP__CONTAINED_NODE;
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
        if (baseClass == Namespace.class) {
            switch (baseFeatureID) {
                case UmlPackage.NAMESPACE__ELEMENT_IMPORT: return UmlPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT;
                case UmlPackage.NAMESPACE__PACKAGE_IMPORT: return UmlPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT;
                case UmlPackage.NAMESPACE__OWNED_RULE: return UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE;
                case UmlPackage.NAMESPACE__MEMBER: return UmlPackage.STRUCTURED_ACTIVITY_NODE__MEMBER;
                case UmlPackage.NAMESPACE__IMPORTED_MEMBER: return UmlPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER;
                case UmlPackage.NAMESPACE__OWNED_MEMBER: return UmlPackage.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER;
                default: return -1;
            }
        }
        if (baseClass == ActivityGroup.class) {
            switch (baseFeatureID) {
                case UmlPackage.ACTIVITY_GROUP__SUBGROUP: return UmlPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP;
                case UmlPackage.ACTIVITY_GROUP__SUPER_GROUP: return UmlPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP;
                case UmlPackage.ACTIVITY_GROUP__IN_ACTIVITY: return UmlPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY;
                case UmlPackage.ACTIVITY_GROUP__CONTAINED_EDGE: return UmlPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE;
                case UmlPackage.ACTIVITY_GROUP__CONTAINED_NODE: return UmlPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE;
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
        result.append(" (mustIsolate: ");
        result.append(mustIsolate);
        result.append(')');
        return result.toString();
    }

} //StructuredActivityNodeImpl
