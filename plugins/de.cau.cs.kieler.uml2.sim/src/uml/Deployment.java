/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A deployment is the allocation of an artifact or artifact instance to a deployment target.
 * A component deployment is the deployment of one or more artifacts or artifact instances to a deployment target, optionally parameterized by a deployment specification. Examples are executables and configuration files.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Deployment#getDeployedArtifact <em>Deployed Artifact</em>}</li>
 *   <li>{@link uml.Deployment#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link uml.Deployment#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends Dependency {
    /**
     * Returns the value of the '<em><b>Deployed Artifact</b></em>' reference list.
     * The list contents are of type {@link uml.DeployedArtifact}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The Artifacts that are deployed onto a Node. This association specializes the supplier association.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Deployed Artifact</em>' reference list.
     * @see uml.UmlPackage#getDeployment_DeployedArtifact()
     * @model ordered="false"
     * @generated
     */
    EList<DeployedArtifact> getDeployedArtifact();

    /**
     * Returns the value of the '<em><b>Configuration</b></em>' containment reference list.
     * The list contents are of type {@link uml.DeploymentSpecification}.
     * It is bidirectional and its opposite is '{@link uml.DeploymentSpecification#getDeployment <em>Deployment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The specification of properties that parameterize the deployment and execution of one or more Artifacts.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Configuration</em>' containment reference list.
     * @see uml.UmlPackage#getDeployment_Configuration()
     * @see uml.DeploymentSpecification#getDeployment
     * @model opposite="deployment" containment="true" ordered="false"
     * @generated
     */
    EList<DeploymentSpecification> getConfiguration();

    /**
     * Returns the value of the '<em><b>Location</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link uml.DeploymentTarget#getDeployment <em>Deployment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The DeployedTarget which is the target of a Deployment.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Location</em>' container reference.
     * @see #setLocation(DeploymentTarget)
     * @see uml.UmlPackage#getDeployment_Location()
     * @see uml.DeploymentTarget#getDeployment
     * @model opposite="deployment" required="true" transient="false" ordered="false"
     * @generated
     */
    DeploymentTarget getLocation();

    /**
     * Sets the value of the '{@link uml.Deployment#getLocation <em>Location</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Location</em>' container reference.
     * @see #getLocation()
     * @generated
     */
    void setLocation(DeploymentTarget value);

} // Deployment
