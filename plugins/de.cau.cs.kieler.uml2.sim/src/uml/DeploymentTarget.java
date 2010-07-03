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
 * A representation of the model object '<em><b>Deployment Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A deployment target is the location for a deployed artifact.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.DeploymentTarget#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link uml.DeploymentTarget#getDeployedElement <em>Deployed Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getDeploymentTarget()
 * @model abstract="true"
 * @generated
 */
public interface DeploymentTarget extends NamedElement {
    /**
     * Returns the value of the '<em><b>Deployment</b></em>' containment reference list.
     * The list contents are of type {@link uml.Deployment}.
     * It is bidirectional and its opposite is '{@link uml.Deployment#getLocation <em>Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The set of Deployments for a DeploymentTarget.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Deployment</em>' containment reference list.
     * @see uml.UmlPackage#getDeploymentTarget_Deployment()
     * @see uml.Deployment#getLocation
     * @model opposite="location" containment="true" ordered="false"
     * @generated
     */
    EList<Deployment> getDeployment();

    /**
     * Returns the value of the '<em><b>Deployed Element</b></em>' reference list.
     * The list contents are of type {@link uml.PackageableElement}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The set of elements that are manifested in an Artifact that is involved in Deployment to a DeploymentTarget.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Deployed Element</em>' reference list.
     * @see uml.UmlPackage#getDeploymentTarget_DeployedElement()
     * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    EList<PackageableElement> getDeployedElement();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * result = ((self.deployment->collect(deployedArtifact))->collect(manifestation))->collect(utilizedElement)
     * <!-- end-model-doc -->
     * @model kind="operation" ordered="false"
     * @generated
     */
    EList<PackageableElement> getDeployedElements();

} // DeploymentTarget
