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
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A signal is a specification of send request instances communicated between objects. The receiving object handles the received request instances as specified by its receptions. The data carried by a send request (which was passed to it by the send invocation occurrence that caused that request) are represented as attributes of the signal. A signal is defined independently of the classifiers handling the signal occurrence.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Signal#getOwnedAttribute <em>Owned Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getSignal()
 * @model
 * @generated
 */
public interface Signal extends Classifier {
    /**
     * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
     * The list contents are of type {@link uml.Property}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The attributes owned by the signal.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Owned Attribute</em>' containment reference list.
     * @see uml.UmlPackage#getSignal_OwnedAttribute()
     * @model containment="true"
     * @generated
     */
    EList<Property> getOwnedAttribute();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Creates a property with the specified name, type, lower bound, and upper bound as an owned attribute of this signal.
     * @param name The name for the new attribute, or null.
     * @param type The type for the new attribute, or null.
     * @param lower The lower bound for the new attribute.
     * @param upper The upper bound for the new attribute.
     * <!-- end-model-doc -->
     * @model required="true" ordered="false" nameDataType="uml.String" nameOrdered="false" typeOrdered="false" lowerDataType="uml.Integer" lowerRequired="true" lowerOrdered="false" upperDataType="uml.UnlimitedNatural" upperRequired="true" upperOrdered="false"
     * @generated
     */
    Property createOwnedAttribute(String name, Type type, int lower, int upper);

} // Signal
