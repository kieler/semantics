/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.AggregationKind;
import uml.CommunicationPath;
import uml.Deployment;
import uml.DeploymentTarget;
import uml.Node;
import uml.PackageableElement;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.NodeImpl#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link uml.impl.NodeImpl#getDeployedElement <em>Deployed Element</em>}</li>
 *   <li>{@link uml.impl.NodeImpl#getNestedNode <em>Nested Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends ClassImpl implements Node {
    /**
     * The cached value of the '{@link #getDeployment() <em>Deployment</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeployment()
     * @generated
     * @ordered
     */
    protected EList<Deployment> deployment;

    /**
     * The cached value of the '{@link #getNestedNode() <em>Nested Node</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNestedNode()
     * @generated
     * @ordered
     */
    protected EList<Node> nestedNode;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getNode();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Deployment> getDeployment() {
        if (deployment == null) {
            deployment = new EObjectContainmentWithInverseEList<Deployment>(Deployment.class, this, UmlPackage.NODE__DEPLOYMENT, UmlPackage.DEPLOYMENT__LOCATION);
        }
        return deployment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PackageableElement> getDeployedElement() {
        // TODO: implement this method to return the 'Deployed Element' reference list
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
    public EList<Node> getNestedNode() {
        if (nestedNode == null) {
            nestedNode = new EObjectContainmentEList<Node>(Node.class, this, UmlPackage.NODE__NESTED_NODE);
        }
        return nestedNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean internal_structure(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.NODE__INTERNAL_STRUCTURE,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "internal_structure", EObjectValidator.getObjectLabel(this, context) }),
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
    public CommunicationPath createCommunicationPath(boolean end1IsNavigable, AggregationKind end1Aggregation, String end1Name, int end1Lower, int end1Upper, Node end1Node, boolean end2IsNavigable, AggregationKind end2Aggregation, String end2Name, int end2Lower, int end2Upper) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CommunicationPath> getCommunicationPaths() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PackageableElement> getDeployedElements() {
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
            case UmlPackage.NODE__DEPLOYMENT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getDeployment()).basicAdd(otherEnd, msgs);
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
            case UmlPackage.NODE__DEPLOYMENT:
                return ((InternalEList<?>)getDeployment()).basicRemove(otherEnd, msgs);
            case UmlPackage.NODE__NESTED_NODE:
                return ((InternalEList<?>)getNestedNode()).basicRemove(otherEnd, msgs);
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
            case UmlPackage.NODE__DEPLOYMENT:
                return getDeployment();
            case UmlPackage.NODE__DEPLOYED_ELEMENT:
                return getDeployedElement();
            case UmlPackage.NODE__NESTED_NODE:
                return getNestedNode();
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
            case UmlPackage.NODE__DEPLOYMENT:
                getDeployment().clear();
                getDeployment().addAll((Collection<? extends Deployment>)newValue);
                return;
            case UmlPackage.NODE__NESTED_NODE:
                getNestedNode().clear();
                getNestedNode().addAll((Collection<? extends Node>)newValue);
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
            case UmlPackage.NODE__DEPLOYMENT:
                getDeployment().clear();
                return;
            case UmlPackage.NODE__NESTED_NODE:
                getNestedNode().clear();
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
            case UmlPackage.NODE__DEPLOYMENT:
                return deployment != null && !deployment.isEmpty();
            case UmlPackage.NODE__DEPLOYED_ELEMENT:
                return !getDeployedElement().isEmpty();
            case UmlPackage.NODE__NESTED_NODE:
                return nestedNode != null && !nestedNode.isEmpty();
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
        if (baseClass == DeploymentTarget.class) {
            switch (derivedFeatureID) {
                case UmlPackage.NODE__DEPLOYMENT: return UmlPackage.DEPLOYMENT_TARGET__DEPLOYMENT;
                case UmlPackage.NODE__DEPLOYED_ELEMENT: return UmlPackage.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT;
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
        if (baseClass == DeploymentTarget.class) {
            switch (baseFeatureID) {
                case UmlPackage.DEPLOYMENT_TARGET__DEPLOYMENT: return UmlPackage.NODE__DEPLOYMENT;
                case UmlPackage.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT: return UmlPackage.NODE__DEPLOYED_ELEMENT;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //NodeImpl
