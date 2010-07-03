/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receive Operation Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A receive operation event specifies the event of receiving an operation invocation for a particular operation by the target entity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.ReceiveOperationEvent#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getReceiveOperationEvent()
 * @model
 * @generated
 */
public interface ReceiveOperationEvent extends MessageEvent {
    /**
     * Returns the value of the '<em><b>Operation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The operation associated with this event.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Operation</em>' reference.
     * @see #setOperation(Operation)
     * @see uml.UmlPackage#getReceiveOperationEvent_Operation()
     * @model required="true" ordered="false"
     * @generated
     */
    Operation getOperation();

    /**
     * Sets the value of the '{@link uml.ReceiveOperationEvent#getOperation <em>Operation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operation</em>' reference.
     * @see #getOperation()
     * @generated
     */
    void setOperation(Operation value);

} // ReceiveOperationEvent
