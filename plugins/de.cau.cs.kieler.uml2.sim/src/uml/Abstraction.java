/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstraction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstraction is a relationship that relates two elements or sets of elements that represent the same concept at different levels of abstraction or from different viewpoints.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Abstraction#getMapping <em>Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getAbstraction()
 * @model
 * @generated
 */
public interface Abstraction extends Dependency {
    /**
     * Returns the value of the '<em><b>Mapping</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * An composition of an Expression that states the abstraction relationship between the supplier and the client. In some cases, such as Derivation, it is usually formal and unidirectional; in other cases, such as Trace, it is usually informal and bidirectional. The mapping expression is optional and may be omitted if the precise relationship between the elements is not specified.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mapping</em>' containment reference.
     * @see #setMapping(OpaqueExpression)
     * @see uml.UmlPackage#getAbstraction_Mapping()
     * @model containment="true" ordered="false"
     * @generated
     */
    OpaqueExpression getMapping();

    /**
     * Sets the value of the '{@link uml.Abstraction#getMapping <em>Mapping</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mapping</em>' containment reference.
     * @see #getMapping()
     * @generated
     */
    void setMapping(OpaqueExpression value);

} // Abstraction
