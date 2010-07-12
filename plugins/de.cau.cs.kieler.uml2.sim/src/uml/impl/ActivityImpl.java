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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Activity;
import uml.ActivityEdge;
import uml.ActivityGroup;
import uml.ActivityNode;
import uml.ActivityPartition;
import uml.StructuredActivityNode;
import uml.UmlPackage;
import uml.Variable;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ActivityImpl#getStructuredNode <em>Structured Node</em>}</li>
 *   <li>{@link uml.impl.ActivityImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link uml.impl.ActivityImpl#getNode <em>Node</em>}</li>
 *   <li>{@link uml.impl.ActivityImpl#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link uml.impl.ActivityImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link uml.impl.ActivityImpl#getPartition <em>Partition</em>}</li>
 *   <li>{@link uml.impl.ActivityImpl#isIsSingleExecution <em>Is Single Execution</em>}</li>
 *   <li>{@link uml.impl.ActivityImpl#getGroup <em>Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends BehaviorImpl implements Activity {
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
     * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNode()
     * @generated
     * @ordered
     */
    protected EList<ActivityNode> node;

    /**
     * The default value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsReadOnly()
     * @generated
     * @ordered
     */
    protected static final boolean IS_READ_ONLY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsReadOnly()
     * @generated
     * @ordered
     */
    protected boolean isReadOnly = IS_READ_ONLY_EDEFAULT;

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
     * The cached value of the '{@link #getPartition() <em>Partition</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPartition()
     * @generated
     * @ordered
     */
    protected EList<ActivityPartition> partition;

    /**
     * The default value of the '{@link #isIsSingleExecution() <em>Is Single Execution</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsSingleExecution()
     * @generated
     * @ordered
     */
    protected static final boolean IS_SINGLE_EXECUTION_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsSingleExecution() <em>Is Single Execution</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsSingleExecution()
     * @generated
     * @ordered
     */
    protected boolean isSingleExecution = IS_SINGLE_EXECUTION_EDEFAULT;

    /**
     * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroup()
     * @generated
     * @ordered
     */
    protected EList<ActivityGroup> group;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActivityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getActivity();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<StructuredActivityNode> getStructuredNode() {
        // TODO: implement this method to return the 'Structured Node' reference list
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
            variable = new EObjectContainmentWithInverseEList<Variable>(Variable.class, this, UmlPackage.ACTIVITY__VARIABLE, UmlPackage.VARIABLE__ACTIVITY_SCOPE);
        }
        return variable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ActivityNode> getNode() {
        if (node == null) {
            node = new EObjectContainmentWithInverseEList<ActivityNode>(ActivityNode.class, this, UmlPackage.ACTIVITY__NODE, UmlPackage.ACTIVITY_NODE__ACTIVITY);
        }
        return node;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsReadOnly() {
        return isReadOnly;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsReadOnly(boolean newIsReadOnly) {
        boolean oldIsReadOnly = isReadOnly;
        isReadOnly = newIsReadOnly;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACTIVITY__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ActivityEdge> getEdge() {
        if (edge == null) {
            edge = new EObjectContainmentWithInverseEList<ActivityEdge>(ActivityEdge.class, this, UmlPackage.ACTIVITY__EDGE, UmlPackage.ACTIVITY_EDGE__ACTIVITY);
        }
        return edge;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ActivityPartition> getPartition() {
        if (partition == null) {
            partition = new EObjectResolvingEList<ActivityPartition>(ActivityPartition.class, this, UmlPackage.ACTIVITY__PARTITION);
        }
        return partition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsSingleExecution() {
        return isSingleExecution;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsSingleExecution(boolean newIsSingleExecution) {
        boolean oldIsSingleExecution = isSingleExecution;
        isSingleExecution = newIsSingleExecution;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ACTIVITY__IS_SINGLE_EXECUTION, oldIsSingleExecution, isSingleExecution));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ActivityGroup> getGroup() {
        if (group == null) {
            group = new EObjectContainmentWithInverseEList<ActivityGroup>(ActivityGroup.class, this, UmlPackage.ACTIVITY__GROUP, UmlPackage.ACTIVITY_GROUP__IN_ACTIVITY);
        }
        return group;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean no_supergroups(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.ACTIVITY__NO_SUPERGROUPS,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "no_supergroups", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean activity_parameter_node(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.ACTIVITY__ACTIVITY_PARAMETER_NODE,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "activity_parameter_node", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean autonomous(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.ACTIVITY__AUTONOMOUS,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "autonomous", EObjectValidator.getObjectLabel(this, context) }),
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
            case UmlPackage.ACTIVITY__VARIABLE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariable()).basicAdd(otherEnd, msgs);
            case UmlPackage.ACTIVITY__NODE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getNode()).basicAdd(otherEnd, msgs);
            case UmlPackage.ACTIVITY__EDGE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getEdge()).basicAdd(otherEnd, msgs);
            case UmlPackage.ACTIVITY__GROUP:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroup()).basicAdd(otherEnd, msgs);
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
            case UmlPackage.ACTIVITY__VARIABLE:
                return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
            case UmlPackage.ACTIVITY__NODE:
                return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
            case UmlPackage.ACTIVITY__EDGE:
                return ((InternalEList<?>)getEdge()).basicRemove(otherEnd, msgs);
            case UmlPackage.ACTIVITY__GROUP:
                return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UmlPackage.ACTIVITY__STRUCTURED_NODE:
                return getStructuredNode();
            case UmlPackage.ACTIVITY__VARIABLE:
                return getVariable();
            case UmlPackage.ACTIVITY__NODE:
                return getNode();
            case UmlPackage.ACTIVITY__IS_READ_ONLY:
                return isIsReadOnly();
            case UmlPackage.ACTIVITY__EDGE:
                return getEdge();
            case UmlPackage.ACTIVITY__PARTITION:
                return getPartition();
            case UmlPackage.ACTIVITY__IS_SINGLE_EXECUTION:
                return isIsSingleExecution();
            case UmlPackage.ACTIVITY__GROUP:
                return getGroup();
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
            case UmlPackage.ACTIVITY__VARIABLE:
                getVariable().clear();
                getVariable().addAll((Collection<? extends Variable>)newValue);
                return;
            case UmlPackage.ACTIVITY__NODE:
                getNode().clear();
                getNode().addAll((Collection<? extends ActivityNode>)newValue);
                return;
            case UmlPackage.ACTIVITY__IS_READ_ONLY:
                setIsReadOnly((Boolean)newValue);
                return;
            case UmlPackage.ACTIVITY__EDGE:
                getEdge().clear();
                getEdge().addAll((Collection<? extends ActivityEdge>)newValue);
                return;
            case UmlPackage.ACTIVITY__PARTITION:
                getPartition().clear();
                getPartition().addAll((Collection<? extends ActivityPartition>)newValue);
                return;
            case UmlPackage.ACTIVITY__IS_SINGLE_EXECUTION:
                setIsSingleExecution((Boolean)newValue);
                return;
            case UmlPackage.ACTIVITY__GROUP:
                getGroup().clear();
                getGroup().addAll((Collection<? extends ActivityGroup>)newValue);
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
            case UmlPackage.ACTIVITY__VARIABLE:
                getVariable().clear();
                return;
            case UmlPackage.ACTIVITY__NODE:
                getNode().clear();
                return;
            case UmlPackage.ACTIVITY__IS_READ_ONLY:
                setIsReadOnly(IS_READ_ONLY_EDEFAULT);
                return;
            case UmlPackage.ACTIVITY__EDGE:
                getEdge().clear();
                return;
            case UmlPackage.ACTIVITY__PARTITION:
                getPartition().clear();
                return;
            case UmlPackage.ACTIVITY__IS_SINGLE_EXECUTION:
                setIsSingleExecution(IS_SINGLE_EXECUTION_EDEFAULT);
                return;
            case UmlPackage.ACTIVITY__GROUP:
                getGroup().clear();
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
            case UmlPackage.ACTIVITY__STRUCTURED_NODE:
                return !getStructuredNode().isEmpty();
            case UmlPackage.ACTIVITY__VARIABLE:
                return variable != null && !variable.isEmpty();
            case UmlPackage.ACTIVITY__NODE:
                return node != null && !node.isEmpty();
            case UmlPackage.ACTIVITY__IS_READ_ONLY:
                return isReadOnly != IS_READ_ONLY_EDEFAULT;
            case UmlPackage.ACTIVITY__EDGE:
                return edge != null && !edge.isEmpty();
            case UmlPackage.ACTIVITY__PARTITION:
                return partition != null && !partition.isEmpty();
            case UmlPackage.ACTIVITY__IS_SINGLE_EXECUTION:
                return isSingleExecution != IS_SINGLE_EXECUTION_EDEFAULT;
            case UmlPackage.ACTIVITY__GROUP:
                return group != null && !group.isEmpty();
        }
        return super.eIsSet(featureID);
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
        result.append(" (isReadOnly: ");
        result.append(isReadOnly);
        result.append(", isSingleExecution: ");
        result.append(isSingleExecution);
        result.append(')');
        return result.toString();
    }

} //ActivityImpl
