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

import uml.CombinedFragment;
import uml.Gate;
import uml.InteractionOperand;
import uml.InteractionOperatorKind;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.CombinedFragmentImpl#getInteractionOperator <em>Interaction Operator</em>}</li>
 *   <li>{@link uml.impl.CombinedFragmentImpl#getOperand <em>Operand</em>}</li>
 *   <li>{@link uml.impl.CombinedFragmentImpl#getCfragmentGate <em>Cfragment Gate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CombinedFragmentImpl extends InteractionFragmentImpl implements CombinedFragment {
    /**
     * The default value of the '{@link #getInteractionOperator() <em>Interaction Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInteractionOperator()
     * @generated
     * @ordered
     */
    protected static final InteractionOperatorKind INTERACTION_OPERATOR_EDEFAULT = InteractionOperatorKind.SEQ;

    /**
     * The cached value of the '{@link #getInteractionOperator() <em>Interaction Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInteractionOperator()
     * @generated
     * @ordered
     */
    protected InteractionOperatorKind interactionOperator = INTERACTION_OPERATOR_EDEFAULT;

    /**
     * The cached value of the '{@link #getOperand() <em>Operand</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperand()
     * @generated
     * @ordered
     */
    protected EList<InteractionOperand> operand;

    /**
     * The cached value of the '{@link #getCfragmentGate() <em>Cfragment Gate</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCfragmentGate()
     * @generated
     * @ordered
     */
    protected EList<Gate> cfragmentGate;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CombinedFragmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getCombinedFragment();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionOperatorKind getInteractionOperator() {
        return interactionOperator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInteractionOperator(InteractionOperatorKind newInteractionOperator) {
        InteractionOperatorKind oldInteractionOperator = interactionOperator;
        interactionOperator = newInteractionOperator == null ? INTERACTION_OPERATOR_EDEFAULT : newInteractionOperator;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR, oldInteractionOperator, interactionOperator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InteractionOperand> getOperand() {
        if (operand == null) {
            operand = new EObjectContainmentEList<InteractionOperand>(InteractionOperand.class, this, UmlPackage.COMBINED_FRAGMENT__OPERAND);
        }
        return operand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Gate> getCfragmentGate() {
        if (cfragmentGate == null) {
            cfragmentGate = new EObjectContainmentEList<Gate>(Gate.class, this, UmlPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE);
        }
        return cfragmentGate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean opt_loop_break_neg(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.COMBINED_FRAGMENT__OPT_LOOP_BREAK_NEG,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "opt_loop_break_neg", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean minint_and_maxint(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.COMBINED_FRAGMENT__MININT_AND_MAXINT,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "minint_and_maxint", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean break_(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.COMBINED_FRAGMENT__BREAK_,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "break_", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean consider_and_ignore(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.COMBINED_FRAGMENT__CONSIDER_AND_IGNORE,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "consider_and_ignore", EObjectValidator.getObjectLabel(this, context) }),
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
            case UmlPackage.COMBINED_FRAGMENT__OPERAND:
                return ((InternalEList<?>)getOperand()).basicRemove(otherEnd, msgs);
            case UmlPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE:
                return ((InternalEList<?>)getCfragmentGate()).basicRemove(otherEnd, msgs);
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
            case UmlPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR:
                return getInteractionOperator();
            case UmlPackage.COMBINED_FRAGMENT__OPERAND:
                return getOperand();
            case UmlPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE:
                return getCfragmentGate();
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
            case UmlPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR:
                setInteractionOperator((InteractionOperatorKind)newValue);
                return;
            case UmlPackage.COMBINED_FRAGMENT__OPERAND:
                getOperand().clear();
                getOperand().addAll((Collection<? extends InteractionOperand>)newValue);
                return;
            case UmlPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE:
                getCfragmentGate().clear();
                getCfragmentGate().addAll((Collection<? extends Gate>)newValue);
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
            case UmlPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR:
                setInteractionOperator(INTERACTION_OPERATOR_EDEFAULT);
                return;
            case UmlPackage.COMBINED_FRAGMENT__OPERAND:
                getOperand().clear();
                return;
            case UmlPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE:
                getCfragmentGate().clear();
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
            case UmlPackage.COMBINED_FRAGMENT__INTERACTION_OPERATOR:
                return interactionOperator != INTERACTION_OPERATOR_EDEFAULT;
            case UmlPackage.COMBINED_FRAGMENT__OPERAND:
                return operand != null && !operand.isEmpty();
            case UmlPackage.COMBINED_FRAGMENT__CFRAGMENT_GATE:
                return cfragmentGate != null && !cfragmentGate.isEmpty();
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
        result.append(" (interactionOperator: ");
        result.append(interactionOperator);
        result.append(')');
        return result.toString();
    }

} //CombinedFragmentImpl
