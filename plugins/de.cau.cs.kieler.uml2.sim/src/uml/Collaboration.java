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
 * A representation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collaboration use represents the application of the pattern described by a collaboration to a specific situation involving specific classes or instances playing the roles of the collaboration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Collaboration#getCollaborationRole <em>Collaboration Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getCollaboration()
 * @model
 * @generated
 */
public interface Collaboration extends BehavioredClassifier, StructuredClassifier {
	/**
	 * Returns the value of the '<em><b>Collaboration Role</b></em>' reference list.
	 * The list contents are of type {@link uml.ConnectableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References connectable elements (possibly owned by other classifiers) which represent roles that instances may play in this collaboration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collaboration Role</em>' reference list.
	 * @see uml.UmlPackage#getCollaboration_CollaborationRole()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ConnectableElement> getCollaborationRole();

} // Collaboration
