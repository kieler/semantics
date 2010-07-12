/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A connector end is an endpoint of a connector, which attaches the connector to a connectable element. Each connector end is part of one connector.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.ConnectorEnd#getDefiningEnd <em>Defining End</em>}</li>
 *   <li>{@link uml.ConnectorEnd#getRole <em>Role</em>}</li>
 *   <li>{@link uml.ConnectorEnd#getPartWithPort <em>Part With Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getConnectorEnd()
 * @model
 * @generated
 */
public interface ConnectorEnd extends MultiplicityElement {
    /**
     * Returns the value of the '<em><b>Defining End</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A derived association referencing the corresponding association end on the association which types the connector owing this connector end. This association is derived by selecting the association end at the same place in the ordering of association ends as this connector end.
     * 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Defining End</em>' reference.
     * @see uml.UmlPackage#getConnectorEnd_DefiningEnd()
     * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    Property getDefiningEnd();

    /**
     * Returns the value of the '<em><b>Role</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The connectable element attached at this connector end. When an instance of the containing classifier is created, a link may (depending on the multiplicities) be created to an instance of the classifier that types this connectable element.
     * 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Role</em>' reference.
     * @see #setRole(ConnectableElement)
     * @see uml.UmlPackage#getConnectorEnd_Role()
     * @model required="true" ordered="false"
     * @generated
     */
    ConnectableElement getRole();

    /**
     * Sets the value of the '{@link uml.ConnectorEnd#getRole <em>Role</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Role</em>' reference.
     * @see #getRole()
     * @generated
     */
    void setRole(ConnectableElement value);

    /**
     * Returns the value of the '<em><b>Part With Port</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates the role of the internal structure of a classifier with the port to which the connector end is attached.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Part With Port</em>' reference.
     * @see #setPartWithPort(Property)
     * @see uml.UmlPackage#getConnectorEnd_PartWithPort()
     * @model ordered="false"
     * @generated
     */
    Property getPartWithPort();

    /**
     * Sets the value of the '{@link uml.ConnectorEnd#getPartWithPort <em>Part With Port</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Part With Port</em>' reference.
     * @see #getPartWithPort()
     * @generated
     */
    void setPartWithPort(Property value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The multiplicity of the connector end may not be more general than the multiplicity of the association typing the owning connector.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean multiplicity(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If a connector end is attached to a port of the containing classifier, partWithPort will be empty.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean part_with_port_empty(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If a connector end references both a role and a partWithPort, then the role must be a port that is defined by the type of the partWithPort.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean role_and_part_with_port(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The property held in self.partWithPort must not be a Port.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean self_part_with_port(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ConnectorEnd
