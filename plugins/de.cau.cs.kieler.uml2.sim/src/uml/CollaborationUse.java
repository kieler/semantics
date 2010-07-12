/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaboration Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collaboration use represents one particular use of a collaboration to explain the relationships between the properties of a classifier. A collaboration use shows how the pattern described by a collaboration is applied in a given context, by binding specific entities from that context to the roles of the collaboration. Depending on the context, these entities could be structural features of a classifier, instance specifications, or even roles in some containing collaboration. There may be multiple occurrences of a given collaboration within a classifier, each involving a different set of roles and connectors. A given role or connector may be involved in multiple occurrences of the same or different collaborations.
 * Associated dependencies map features of the collaboration type to features in the classifier. These dependencies indicate which role in the classifier plays which role in the collaboration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.CollaborationUse#getType <em>Type</em>}</li>
 *   <li>{@link uml.CollaborationUse#getRoleBinding <em>Role Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getCollaborationUse()
 * @model
 * @generated
 */
public interface CollaborationUse extends NamedElement {
    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The collaboration which is used in this occurrence. The collaboration defines the cooperation between its roles which are mapped to properties of the classifier owning the collaboration use.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(Collaboration)
     * @see uml.UmlPackage#getCollaborationUse_Type()
     * @model required="true" ordered="false"
     * @generated
     */
    Collaboration getType();

    /**
     * Sets the value of the '{@link uml.CollaborationUse#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(Collaboration value);

    /**
     * Returns the value of the '<em><b>Role Binding</b></em>' containment reference list.
     * The list contents are of type {@link uml.Dependency}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A mapping between features of the collaboration type and features of the classifier or operation. This mapping indicates which connectable element of the classifier or operation plays which role(s) in the collaboration. A connectable element may be bound to multiple roles in the same collaboration use (that is, it may play multiple roles).
     * 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Role Binding</em>' containment reference list.
     * @see uml.UmlPackage#getCollaborationUse_RoleBinding()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Dependency> getRoleBinding();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * All the client elements of a roleBinding are in one classifier and all supplier elements of a roleBinding are in one collaboration and they are compatible.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean client_elements(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Every role in the collaboration is bound within the collaboration use to a connectable element within the classifier or operation.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean every_role(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The connectors in the classifier connect according to the connectors in the collaboration
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean connectors(DiagnosticChain diagnostics, Map<Object, Object> context);

} // CollaborationUse
