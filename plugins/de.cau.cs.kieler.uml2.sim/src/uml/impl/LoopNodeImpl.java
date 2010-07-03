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

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

import uml.ExecutableNode;
import uml.LoopNode;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.LoopNodeImpl#isIsTestedFirst <em>Is Tested First</em>}</li>
 *   <li>{@link uml.impl.LoopNodeImpl#getBodyPart <em>Body Part</em>}</li>
 *   <li>{@link uml.impl.LoopNodeImpl#getSetupPart <em>Setup Part</em>}</li>
 *   <li>{@link uml.impl.LoopNodeImpl#getTest <em>Test</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoopNodeImpl extends StructuredActivityNodeImpl implements LoopNode {
    /**
     * The default value of the '{@link #isIsTestedFirst() <em>Is Tested First</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsTestedFirst()
     * @generated
     * @ordered
     */
    protected static final boolean IS_TESTED_FIRST_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsTestedFirst() <em>Is Tested First</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsTestedFirst()
     * @generated
     * @ordered
     */
    protected boolean isTestedFirst = IS_TESTED_FIRST_EDEFAULT;

    /**
     * The cached value of the '{@link #getBodyPart() <em>Body Part</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBodyPart()
     * @generated
     * @ordered
     */
    protected EList<ExecutableNode> bodyPart;

    /**
     * The cached value of the '{@link #getSetupPart() <em>Setup Part</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSetupPart()
     * @generated
     * @ordered
     */
    protected EList<ExecutableNode> setupPart;

    /**
     * The cached value of the '{@link #getTest() <em>Test</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTest()
     * @generated
     * @ordered
     */
    protected EList<ExecutableNode> test;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LoopNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getLoopNode();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsTestedFirst() {
        return isTestedFirst;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsTestedFirst(boolean newIsTestedFirst) {
        boolean oldIsTestedFirst = isTestedFirst;
        isTestedFirst = newIsTestedFirst;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.LOOP_NODE__IS_TESTED_FIRST, oldIsTestedFirst, isTestedFirst));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ExecutableNode> getBodyPart() {
        if (bodyPart == null) {
            bodyPart = new EObjectResolvingEList<ExecutableNode>(ExecutableNode.class, this, UmlPackage.LOOP_NODE__BODY_PART);
        }
        return bodyPart;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ExecutableNode> getSetupPart() {
        if (setupPart == null) {
            setupPart = new EObjectResolvingEList<ExecutableNode>(ExecutableNode.class, this, UmlPackage.LOOP_NODE__SETUP_PART);
        }
        return setupPart;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ExecutableNode> getTest() {
        if (test == null) {
            test = new EObjectResolvingEList<ExecutableNode>(ExecutableNode.class, this, UmlPackage.LOOP_NODE__TEST);
        }
        return test;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean input_edges(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.LOOP_NODE__INPUT_EDGES,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "input_edges", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean body_output_pins(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.LOOP_NODE__BODY_OUTPUT_PINS,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "body_output_pins", EObjectValidator.getObjectLabel(this, context) }),
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
                         UmlValidator.LOOP_NODE__RESULT_NO_INCOMING,
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
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UmlPackage.LOOP_NODE__IS_TESTED_FIRST:
                return isIsTestedFirst();
            case UmlPackage.LOOP_NODE__BODY_PART:
                return getBodyPart();
            case UmlPackage.LOOP_NODE__SETUP_PART:
                return getSetupPart();
            case UmlPackage.LOOP_NODE__TEST:
                return getTest();
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
            case UmlPackage.LOOP_NODE__IS_TESTED_FIRST:
                setIsTestedFirst((Boolean)newValue);
                return;
            case UmlPackage.LOOP_NODE__BODY_PART:
                getBodyPart().clear();
                getBodyPart().addAll((Collection<? extends ExecutableNode>)newValue);
                return;
            case UmlPackage.LOOP_NODE__SETUP_PART:
                getSetupPart().clear();
                getSetupPart().addAll((Collection<? extends ExecutableNode>)newValue);
                return;
            case UmlPackage.LOOP_NODE__TEST:
                getTest().clear();
                getTest().addAll((Collection<? extends ExecutableNode>)newValue);
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
            case UmlPackage.LOOP_NODE__IS_TESTED_FIRST:
                setIsTestedFirst(IS_TESTED_FIRST_EDEFAULT);
                return;
            case UmlPackage.LOOP_NODE__BODY_PART:
                getBodyPart().clear();
                return;
            case UmlPackage.LOOP_NODE__SETUP_PART:
                getSetupPart().clear();
                return;
            case UmlPackage.LOOP_NODE__TEST:
                getTest().clear();
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
            case UmlPackage.LOOP_NODE__IS_TESTED_FIRST:
                return isTestedFirst != IS_TESTED_FIRST_EDEFAULT;
            case UmlPackage.LOOP_NODE__BODY_PART:
                return bodyPart != null && !bodyPart.isEmpty();
            case UmlPackage.LOOP_NODE__SETUP_PART:
                return setupPart != null && !setupPart.isEmpty();
            case UmlPackage.LOOP_NODE__TEST:
                return test != null && !test.isEmpty();
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
        result.append(" (isTestedFirst: ");
        result.append(isTestedFirst);
        result.append(')');
        return result.toString();
    }

} //LoopNodeImpl
