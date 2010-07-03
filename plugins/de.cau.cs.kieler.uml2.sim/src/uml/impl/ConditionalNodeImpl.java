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
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Clause;
import uml.ConditionalNode;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ConditionalNodeImpl#isIsDeterminate <em>Is Determinate</em>}</li>
 *   <li>{@link uml.impl.ConditionalNodeImpl#isIsAssured <em>Is Assured</em>}</li>
 *   <li>{@link uml.impl.ConditionalNodeImpl#getClause <em>Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalNodeImpl extends StructuredActivityNodeImpl implements ConditionalNode {
    /**
     * The default value of the '{@link #isIsDeterminate() <em>Is Determinate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsDeterminate()
     * @generated
     * @ordered
     */
    protected static final boolean IS_DETERMINATE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsDeterminate() <em>Is Determinate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsDeterminate()
     * @generated
     * @ordered
     */
    protected boolean isDeterminate = IS_DETERMINATE_EDEFAULT;

    /**
     * The default value of the '{@link #isIsAssured() <em>Is Assured</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsAssured()
     * @generated
     * @ordered
     */
    protected static final boolean IS_ASSURED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsAssured() <em>Is Assured</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsAssured()
     * @generated
     * @ordered
     */
    protected boolean isAssured = IS_ASSURED_EDEFAULT;

    /**
     * The cached value of the '{@link #getClause() <em>Clause</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClause()
     * @generated
     * @ordered
     */
    protected EList<Clause> clause;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConditionalNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getConditionalNode();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsDeterminate() {
        return isDeterminate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsDeterminate(boolean newIsDeterminate) {
        boolean oldIsDeterminate = isDeterminate;
        isDeterminate = newIsDeterminate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CONDITIONAL_NODE__IS_DETERMINATE, oldIsDeterminate, isDeterminate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsAssured() {
        return isAssured;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsAssured(boolean newIsAssured) {
        boolean oldIsAssured = isAssured;
        isAssured = newIsAssured;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CONDITIONAL_NODE__IS_ASSURED, oldIsAssured, isAssured));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Clause> getClause() {
        if (clause == null) {
            clause = new EObjectContainmentEList<Clause>(Clause.class, this, UmlPackage.CONDITIONAL_NODE__CLAUSE);
        }
        return clause;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean result_no_incoming(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.CONDITIONAL_NODE__RESULT_NO_INCOMING,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "result_no_incoming", EObjectValidator.getObjectLabel(this, context) }),
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
            case UmlPackage.CONDITIONAL_NODE__CLAUSE:
                return ((InternalEList<?>)getClause()).basicRemove(otherEnd, msgs);
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
            case UmlPackage.CONDITIONAL_NODE__IS_DETERMINATE:
                return isIsDeterminate();
            case UmlPackage.CONDITIONAL_NODE__IS_ASSURED:
                return isIsAssured();
            case UmlPackage.CONDITIONAL_NODE__CLAUSE:
                return getClause();
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
            case UmlPackage.CONDITIONAL_NODE__IS_DETERMINATE:
                setIsDeterminate((Boolean)newValue);
                return;
            case UmlPackage.CONDITIONAL_NODE__IS_ASSURED:
                setIsAssured((Boolean)newValue);
                return;
            case UmlPackage.CONDITIONAL_NODE__CLAUSE:
                getClause().clear();
                getClause().addAll((Collection<? extends Clause>)newValue);
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
            case UmlPackage.CONDITIONAL_NODE__IS_DETERMINATE:
                setIsDeterminate(IS_DETERMINATE_EDEFAULT);
                return;
            case UmlPackage.CONDITIONAL_NODE__IS_ASSURED:
                setIsAssured(IS_ASSURED_EDEFAULT);
                return;
            case UmlPackage.CONDITIONAL_NODE__CLAUSE:
                getClause().clear();
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
            case UmlPackage.CONDITIONAL_NODE__IS_DETERMINATE:
                return isDeterminate != IS_DETERMINATE_EDEFAULT;
            case UmlPackage.CONDITIONAL_NODE__IS_ASSURED:
                return isAssured != IS_ASSURED_EDEFAULT;
            case UmlPackage.CONDITIONAL_NODE__CLAUSE:
                return clause != null && !clause.isEmpty();
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
        result.append(" (isDeterminate: ");
        result.append(isDeterminate);
        result.append(", isAssured: ");
        result.append(isAssured);
        result.append(')');
        return result.toString();
    }

} //ConditionalNodeImpl
