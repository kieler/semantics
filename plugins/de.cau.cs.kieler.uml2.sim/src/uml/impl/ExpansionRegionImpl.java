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

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.ExpansionKind;
import uml.ExpansionNode;
import uml.ExpansionRegion;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expansion Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ExpansionRegionImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link uml.impl.ExpansionRegionImpl#getInputElement <em>Input Element</em>}</li>
 *   <li>{@link uml.impl.ExpansionRegionImpl#getOutputElement <em>Output Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpansionRegionImpl extends StructuredActivityNodeImpl implements ExpansionRegion {
    /**
     * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMode()
     * @generated
     * @ordered
     */
    protected static final ExpansionKind MODE_EDEFAULT = ExpansionKind.ITERATIVE;

    /**
     * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMode()
     * @generated
     * @ordered
     */
    protected ExpansionKind mode = MODE_EDEFAULT;

    /**
     * The cached value of the '{@link #getInputElement() <em>Input Element</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputElement()
     * @generated
     * @ordered
     */
    protected EList<ExpansionNode> inputElement;

    /**
     * The cached value of the '{@link #getOutputElement() <em>Output Element</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputElement()
     * @generated
     * @ordered
     */
    protected EList<ExpansionNode> outputElement;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExpansionRegionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getExpansionRegion();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExpansionKind getMode() {
        return mode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMode(ExpansionKind newMode) {
        ExpansionKind oldMode = mode;
        mode = newMode == null ? MODE_EDEFAULT : newMode;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.EXPANSION_REGION__MODE, oldMode, mode));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ExpansionNode> getInputElement() {
        if (inputElement == null) {
            inputElement = new EObjectWithInverseResolvingEList<ExpansionNode>(ExpansionNode.class, this, UmlPackage.EXPANSION_REGION__INPUT_ELEMENT, UmlPackage.EXPANSION_NODE__REGION_AS_INPUT);
        }
        return inputElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ExpansionNode> getOutputElement() {
        if (outputElement == null) {
            outputElement = new EObjectWithInverseResolvingEList<ExpansionNode>(ExpansionNode.class, this, UmlPackage.EXPANSION_REGION__OUTPUT_ELEMENT, UmlPackage.EXPANSION_NODE__REGION_AS_OUTPUT);
        }
        return outputElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean expansion_nodes(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.EXPANSION_REGION__EXPANSION_NODES,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "expansion_nodes", EObjectValidator.getObjectLabel(this, context) }),
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
            case UmlPackage.EXPANSION_REGION__INPUT_ELEMENT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputElement()).basicAdd(otherEnd, msgs);
            case UmlPackage.EXPANSION_REGION__OUTPUT_ELEMENT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutputElement()).basicAdd(otherEnd, msgs);
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
            case UmlPackage.EXPANSION_REGION__INPUT_ELEMENT:
                return ((InternalEList<?>)getInputElement()).basicRemove(otherEnd, msgs);
            case UmlPackage.EXPANSION_REGION__OUTPUT_ELEMENT:
                return ((InternalEList<?>)getOutputElement()).basicRemove(otherEnd, msgs);
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
            case UmlPackage.EXPANSION_REGION__MODE:
                return getMode();
            case UmlPackage.EXPANSION_REGION__INPUT_ELEMENT:
                return getInputElement();
            case UmlPackage.EXPANSION_REGION__OUTPUT_ELEMENT:
                return getOutputElement();
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
            case UmlPackage.EXPANSION_REGION__MODE:
                setMode((ExpansionKind)newValue);
                return;
            case UmlPackage.EXPANSION_REGION__INPUT_ELEMENT:
                getInputElement().clear();
                getInputElement().addAll((Collection<? extends ExpansionNode>)newValue);
                return;
            case UmlPackage.EXPANSION_REGION__OUTPUT_ELEMENT:
                getOutputElement().clear();
                getOutputElement().addAll((Collection<? extends ExpansionNode>)newValue);
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
            case UmlPackage.EXPANSION_REGION__MODE:
                setMode(MODE_EDEFAULT);
                return;
            case UmlPackage.EXPANSION_REGION__INPUT_ELEMENT:
                getInputElement().clear();
                return;
            case UmlPackage.EXPANSION_REGION__OUTPUT_ELEMENT:
                getOutputElement().clear();
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
            case UmlPackage.EXPANSION_REGION__MODE:
                return mode != MODE_EDEFAULT;
            case UmlPackage.EXPANSION_REGION__INPUT_ELEMENT:
                return inputElement != null && !inputElement.isEmpty();
            case UmlPackage.EXPANSION_REGION__OUTPUT_ELEMENT:
                return outputElement != null && !outputElement.isEmpty();
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
        result.append(" (mode: ");
        result.append(mode);
        result.append(')');
        return result.toString();
    }

} //ExpansionRegionImpl
