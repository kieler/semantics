/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uml.JoinNode;
import uml.UmlPackage;
import uml.ValueSpecification;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.JoinNodeImpl#isIsCombineDuplicate <em>Is Combine Duplicate</em>}</li>
 *   <li>{@link uml.impl.JoinNodeImpl#getJoinSpec <em>Join Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JoinNodeImpl extends ControlNodeImpl implements JoinNode {
    /**
     * The default value of the '{@link #isIsCombineDuplicate() <em>Is Combine Duplicate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsCombineDuplicate()
     * @generated
     * @ordered
     */
    protected static final boolean IS_COMBINE_DUPLICATE_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isIsCombineDuplicate() <em>Is Combine Duplicate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsCombineDuplicate()
     * @generated
     * @ordered
     */
    protected boolean isCombineDuplicate = IS_COMBINE_DUPLICATE_EDEFAULT;

    /**
     * The cached value of the '{@link #getJoinSpec() <em>Join Spec</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJoinSpec()
     * @generated
     * @ordered
     */
    protected ValueSpecification joinSpec;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected JoinNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getJoinNode();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsCombineDuplicate() {
        return isCombineDuplicate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsCombineDuplicate(boolean newIsCombineDuplicate) {
        boolean oldIsCombineDuplicate = isCombineDuplicate;
        isCombineDuplicate = newIsCombineDuplicate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.JOIN_NODE__IS_COMBINE_DUPLICATE, oldIsCombineDuplicate, isCombineDuplicate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValueSpecification getJoinSpec() {
        return joinSpec;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetJoinSpec(ValueSpecification newJoinSpec, NotificationChain msgs) {
        ValueSpecification oldJoinSpec = joinSpec;
        joinSpec = newJoinSpec;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.JOIN_NODE__JOIN_SPEC, oldJoinSpec, newJoinSpec);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setJoinSpec(ValueSpecification newJoinSpec) {
        if (newJoinSpec != joinSpec) {
            NotificationChain msgs = null;
            if (joinSpec != null)
                msgs = ((InternalEObject)joinSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.JOIN_NODE__JOIN_SPEC, null, msgs);
            if (newJoinSpec != null)
                msgs = ((InternalEObject)newJoinSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.JOIN_NODE__JOIN_SPEC, null, msgs);
            msgs = basicSetJoinSpec(newJoinSpec, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.JOIN_NODE__JOIN_SPEC, newJoinSpec, newJoinSpec));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean one_outgoing_edge(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.JOIN_NODE__ONE_OUTGOING_EDGE,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "one_outgoing_edge", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean incoming_object_flow(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.JOIN_NODE__INCOMING_OBJECT_FLOW,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "incoming_object_flow", EObjectValidator.getObjectLabel(this, context) }),
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
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.JOIN_NODE__JOIN_SPEC:
                return basicSetJoinSpec(null, msgs);
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
            case UmlPackage.JOIN_NODE__IS_COMBINE_DUPLICATE:
                return isIsCombineDuplicate();
            case UmlPackage.JOIN_NODE__JOIN_SPEC:
                return getJoinSpec();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case UmlPackage.JOIN_NODE__IS_COMBINE_DUPLICATE:
                setIsCombineDuplicate((Boolean)newValue);
                return;
            case UmlPackage.JOIN_NODE__JOIN_SPEC:
                setJoinSpec((ValueSpecification)newValue);
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
            case UmlPackage.JOIN_NODE__IS_COMBINE_DUPLICATE:
                setIsCombineDuplicate(IS_COMBINE_DUPLICATE_EDEFAULT);
                return;
            case UmlPackage.JOIN_NODE__JOIN_SPEC:
                setJoinSpec((ValueSpecification)null);
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
            case UmlPackage.JOIN_NODE__IS_COMBINE_DUPLICATE:
                return isCombineDuplicate != IS_COMBINE_DUPLICATE_EDEFAULT;
            case UmlPackage.JOIN_NODE__JOIN_SPEC:
                return joinSpec != null;
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
        result.append(" (isCombineDuplicate: ");
        result.append(isCombineDuplicate);
        result.append(')');
        return result.toString();
    }

} //JoinNodeImpl
