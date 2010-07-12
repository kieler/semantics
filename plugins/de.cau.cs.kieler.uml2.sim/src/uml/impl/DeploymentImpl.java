/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.DeployedArtifact;
import uml.Deployment;
import uml.DeploymentSpecification;
import uml.DeploymentTarget;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.DeploymentImpl#getDeployedArtifact <em>Deployed Artifact</em>}</li>
 *   <li>{@link uml.impl.DeploymentImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link uml.impl.DeploymentImpl#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentImpl extends DependencyImpl implements Deployment {
    /**
     * The cached value of the '{@link #getDeployedArtifact() <em>Deployed Artifact</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeployedArtifact()
     * @generated
     * @ordered
     */
    protected EList<DeployedArtifact> deployedArtifact;

    /**
     * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfiguration()
     * @generated
     * @ordered
     */
    protected EList<DeploymentSpecification> configuration;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DeploymentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getDeployment();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DeployedArtifact> getDeployedArtifact() {
        if (deployedArtifact == null) {
            deployedArtifact = new EObjectResolvingEList<DeployedArtifact>(DeployedArtifact.class, this, UmlPackage.DEPLOYMENT__DEPLOYED_ARTIFACT);
        }
        return deployedArtifact;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DeploymentSpecification> getConfiguration() {
        if (configuration == null) {
            configuration = new EObjectContainmentWithInverseEList<DeploymentSpecification>(DeploymentSpecification.class, this, UmlPackage.DEPLOYMENT__CONFIGURATION, UmlPackage.DEPLOYMENT_SPECIFICATION__DEPLOYMENT);
        }
        return configuration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeploymentTarget getLocation() {
        if (eContainerFeatureID() != UmlPackage.DEPLOYMENT__LOCATION) return null;
        return (DeploymentTarget)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLocation(DeploymentTarget newLocation, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newLocation, UmlPackage.DEPLOYMENT__LOCATION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocation(DeploymentTarget newLocation) {
        if (newLocation != eInternalContainer() || (eContainerFeatureID() != UmlPackage.DEPLOYMENT__LOCATION && newLocation != null)) {
            if (EcoreUtil.isAncestor(this, newLocation))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newLocation != null)
                msgs = ((InternalEObject)newLocation).eInverseAdd(this, UmlPackage.DEPLOYMENT_TARGET__DEPLOYMENT, DeploymentTarget.class, msgs);
            msgs = basicSetLocation(newLocation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.DEPLOYMENT__LOCATION, newLocation, newLocation));
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
            case UmlPackage.DEPLOYMENT__CONFIGURATION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getConfiguration()).basicAdd(otherEnd, msgs);
            case UmlPackage.DEPLOYMENT__LOCATION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetLocation((DeploymentTarget)otherEnd, msgs);
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
            case UmlPackage.DEPLOYMENT__CONFIGURATION:
                return ((InternalEList<?>)getConfiguration()).basicRemove(otherEnd, msgs);
            case UmlPackage.DEPLOYMENT__LOCATION:
                return basicSetLocation(null, msgs);
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
            case UmlPackage.DEPLOYMENT__LOCATION:
                return eInternalContainer().eInverseRemove(this, UmlPackage.DEPLOYMENT_TARGET__DEPLOYMENT, DeploymentTarget.class, msgs);
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
            case UmlPackage.DEPLOYMENT__DEPLOYED_ARTIFACT:
                return getDeployedArtifact();
            case UmlPackage.DEPLOYMENT__CONFIGURATION:
                return getConfiguration();
            case UmlPackage.DEPLOYMENT__LOCATION:
                return getLocation();
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
            case UmlPackage.DEPLOYMENT__DEPLOYED_ARTIFACT:
                getDeployedArtifact().clear();
                getDeployedArtifact().addAll((Collection<? extends DeployedArtifact>)newValue);
                return;
            case UmlPackage.DEPLOYMENT__CONFIGURATION:
                getConfiguration().clear();
                getConfiguration().addAll((Collection<? extends DeploymentSpecification>)newValue);
                return;
            case UmlPackage.DEPLOYMENT__LOCATION:
                setLocation((DeploymentTarget)newValue);
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
            case UmlPackage.DEPLOYMENT__DEPLOYED_ARTIFACT:
                getDeployedArtifact().clear();
                return;
            case UmlPackage.DEPLOYMENT__CONFIGURATION:
                getConfiguration().clear();
                return;
            case UmlPackage.DEPLOYMENT__LOCATION:
                setLocation((DeploymentTarget)null);
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
            case UmlPackage.DEPLOYMENT__DEPLOYED_ARTIFACT:
                return deployedArtifact != null && !deployedArtifact.isEmpty();
            case UmlPackage.DEPLOYMENT__CONFIGURATION:
                return configuration != null && !configuration.isEmpty();
            case UmlPackage.DEPLOYMENT__LOCATION:
                return getLocation() != null;
        }
        return super.eIsSet(featureID);
    }

} //DeploymentImpl
