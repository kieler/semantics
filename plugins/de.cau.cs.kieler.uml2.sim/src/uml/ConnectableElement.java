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
 * A representation of the model object '<em><b>Connectable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ConnectableElement is an abstract metaclass representing a set of instances that play roles of a classifier. Connectable elements may be joined by attached connectors and specify configurations of linked instances to be created within an instance of the containing classifier.
 * A connectable element may be exposed as a connectable element template parameter.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.ConnectableElement#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getConnectableElement()
 * @model abstract="true"
 * @generated
 */
public interface ConnectableElement extends TypedElement, ParameterableElement {
    /**
     * Returns the value of the '<em><b>End</b></em>' reference list.
     * The list contents are of type {@link uml.ConnectorEnd}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Denotes a connector that attaches to this connectable element.
     * <!-- end-model-doc -->
     * @return the value of the '<em>End</em>' reference list.
     * @see uml.UmlPackage#getConnectableElement_End()
     * @model transient="true" volatile="true" derived="true"
     * @generated
     */
    EList<ConnectorEnd> getEnd();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" ordered="false"
     * @generated
     */
    EList<ConnectorEnd> getEnds();

} // ConnectableElement
