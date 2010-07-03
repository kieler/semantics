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
import org.eclipse.emf.ecore.util.EcoreUtil;

import uml.Deployment;
import uml.DeploymentSpecification;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.DeploymentSpecificationImpl#getDeploymentLocation <em>Deployment Location</em>}</li>
 *   <li>{@link uml.impl.DeploymentSpecificationImpl#getExecutionLocation <em>Execution Location</em>}</li>
 *   <li>{@link uml.impl.DeploymentSpecificationImpl#getDeployment <em>Deployment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentSpecificationImpl extends ArtifactImpl implements DeploymentSpecification {
    /**
     * The default value of the '{@link #getDeploymentLocation() <em>Deployment Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeploymentLocation()
     * @generated
     * @ordered
     */
    protected static final String DEPLOYMENT_LOCATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDeploymentLocation() <em>Deployment Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeploymentLocation()
     * @generated
     * @ordered
     */
    protected String deploymentLocation = DEPLOYMENT_LOCATION_EDEFAULT;

    /**
     * This is true if the Deployment Location attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean deploymentLocationESet;

    /**
     * The default value of the '{@link #getExecutionLocation() <em>Execution Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecutionLocation()
     * @generated
     * @ordered
     */
    protected static final String EXECUTION_LOCATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getExecutionLocation() <em>Execution Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecutionLocation()
     * @generated
     * @ordered
     */
    protected String executionLocation = EXECUTION_LOCATION_EDEFAULT;

    /**
     * This is true if the Execution Location attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean executionLocationESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DeploymentSpecificationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getDeploymentSpecification();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDeploymentLocation() {
        return deploymentLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDeploymentLocation(String newDeploymentLocation) {
        String oldDeploymentLocation = deploymentLocation;
        deploymentLocation = newDeploymentLocation;
        boolean oldDeploymentLocationESet = deploymentLocationESet;
        deploymentLocationESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION, oldDeploymentLocation, deploymentLocation, !oldDeploymentLocationESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDeploymentLocation() {
        String oldDeploymentLocation = deploymentLocation;
        boolean oldDeploymentLocationESet = deploymentLocationESet;
        deploymentLocation = DEPLOYMENT_LOCATION_EDEFAULT;
        deploymentLocationESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION, oldDeploymentLocation, DEPLOYMENT_LOCATION_EDEFAULT, oldDeploymentLocationESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDeploymentLocation() {
        return deploymentLocationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getExecutionLocation() {
        return executionLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExecutionLocation(String newExecutionLocation) {
        String oldExecutionLocation = executionLocation;
        executionLocation = newExecutionLocation;
        boolean oldExecutionLocationESet = executionLocationESet;
        executionLocationESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION, oldExecutionLocation, executionLocation, !oldExecutionLocationESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetExecutionLocation() {
        String oldExecutionLocation = executionLocation;
        boolean oldExecutionLocationESet = executionLocationESet;
        executionLocation = EXECUTION_LOCATION_EDEFAULT;
        executionLocationESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION, oldExecutionLocation, EXECUTION_LOCATION_EDEFAULT, oldExecutionLocationESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetExecutionLocation() {
        return executionLocationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Deployment getDeployment() {
        if (eContainerFeatureID() != UmlPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT) return null;
        return (Deployment)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDeployment(Deployment newDeployment, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newDeployment, UmlPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDeployment(Deployment newDeployment) {
        if (newDeployment != eInternalContainer() || (eContainerFeatureID() != UmlPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT && newDeployment != null)) {
            if (EcoreUtil.isAncestor(this, newDeployment))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newDeployment != null)
                msgs = ((InternalEObject)newDeployment).eInverseAdd(this, UmlPackage.DEPLOYMENT__CONFIGURATION, Deployment.class, msgs);
            msgs = basicSetDeployment(newDeployment, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT, newDeployment, newDeployment));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean deployed_elements(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.DEPLOYMENT_SPECIFICATION__DEPLOYED_ELEMENTS,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "deployed_elements", EObjectValidator.getObjectLabel(this, context) }),
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
    public boolean deployment_target(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
                         UmlValidator.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_TARGET,
                         EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "deployment_target", EObjectValidator.getObjectLabel(this, context) }),
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
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetDeployment((Deployment)otherEnd, msgs);
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
            case UmlPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT:
                return basicSetDeployment(null, msgs);
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
            case UmlPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT:
                return eInternalContainer().eInverseRemove(this, UmlPackage.DEPLOYMENT__CONFIGURATION, Deployment.class, msgs);
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
            case UmlPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION:
                return getDeploymentLocation();
            case UmlPackage.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION:
                return getExecutionLocation();
            case UmlPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT:
                return getDeployment();
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
            case UmlPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION:
                setDeploymentLocation((String)newValue);
                return;
            case UmlPackage.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION:
                setExecutionLocation((String)newValue);
                return;
            case UmlPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT:
                setDeployment((Deployment)newValue);
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
            case UmlPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION:
                unsetDeploymentLocation();
                return;
            case UmlPackage.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION:
                unsetExecutionLocation();
                return;
            case UmlPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT:
                setDeployment((Deployment)null);
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
            case UmlPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION:
                return isSetDeploymentLocation();
            case UmlPackage.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION:
                return isSetExecutionLocation();
            case UmlPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT:
                return getDeployment() != null;
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
        result.append(" (deploymentLocation: ");
        if (deploymentLocationESet) result.append(deploymentLocation); else result.append("<unset>");
        result.append(", executionLocation: ");
        if (executionLocationESet) result.append(executionLocation); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //DeploymentSpecificationImpl
