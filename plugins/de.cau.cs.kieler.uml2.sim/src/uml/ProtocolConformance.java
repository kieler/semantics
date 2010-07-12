/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Conformance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Protocol state machines can be redefined into more specific protocol state machines, or into behavioral state machines. Protocol conformance declares that the specific protocol state machine specifies a protocol that conforms to the general state machine one, or that the specific behavioral state machine abide by the protocol of the general protocol state machine.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.ProtocolConformance#getGeneralMachine <em>General Machine</em>}</li>
 *   <li>{@link uml.ProtocolConformance#getSpecificMachine <em>Specific Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getProtocolConformance()
 * @model
 * @generated
 */
public interface ProtocolConformance extends DirectedRelationship {
    /**
     * Returns the value of the '<em><b>General Machine</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies the protocol state machine to which the specific state machine conforms.
     * <!-- end-model-doc -->
     * @return the value of the '<em>General Machine</em>' reference.
     * @see #setGeneralMachine(ProtocolStateMachine)
     * @see uml.UmlPackage#getProtocolConformance_GeneralMachine()
     * @model required="true" ordered="false"
     * @generated
     */
    ProtocolStateMachine getGeneralMachine();

    /**
     * Sets the value of the '{@link uml.ProtocolConformance#getGeneralMachine <em>General Machine</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>General Machine</em>' reference.
     * @see #getGeneralMachine()
     * @generated
     */
    void setGeneralMachine(ProtocolStateMachine value);

    /**
     * Returns the value of the '<em><b>Specific Machine</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link uml.ProtocolStateMachine#getConformance <em>Conformance</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies the state machine which conforms to the general state machine.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Specific Machine</em>' container reference.
     * @see #setSpecificMachine(ProtocolStateMachine)
     * @see uml.UmlPackage#getProtocolConformance_SpecificMachine()
     * @see uml.ProtocolStateMachine#getConformance
     * @model opposite="conformance" required="true" transient="false" ordered="false"
     * @generated
     */
    ProtocolStateMachine getSpecificMachine();

    /**
     * Sets the value of the '{@link uml.ProtocolConformance#getSpecificMachine <em>Specific Machine</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Specific Machine</em>' container reference.
     * @see #getSpecificMachine()
     * @generated
     */
    void setSpecificMachine(ProtocolStateMachine value);

} // ProtocolConformance
