/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A call event models the receipt by an object of a message invoking a call of an operation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.CallEvent#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getCallEvent()
 * @model
 * @generated
 */
public interface CallEvent extends MessageEvent {
    /**
     * Returns the value of the '<em><b>Operation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Designates the operation whose invocation raised the call event.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Operation</em>' reference.
     * @see #setOperation(Operation)
     * @see uml.UmlPackage#getCallEvent_Operation()
     * @model required="true" ordered="false"
     * @generated
     */
    Operation getOperation();

    /**
     * Sets the value of the '{@link uml.CallEvent#getOperation <em>Operation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operation</em>' reference.
     * @see #getOperation()
     * @generated
     */
    void setOperation(Operation value);

} // CallEvent
