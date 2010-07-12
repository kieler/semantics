/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receive Signal Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A receive signal event specifies the event of receiving a signal by the target entity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.ReceiveSignalEvent#getSignal <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getReceiveSignalEvent()
 * @model
 * @generated
 */
public interface ReceiveSignalEvent extends MessageEvent {
    /**
     * Returns the value of the '<em><b>Signal</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The signal associated with this event.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Signal</em>' reference.
     * @see #setSignal(Signal)
     * @see uml.UmlPackage#getReceiveSignalEvent_Signal()
     * @model required="true" ordered="false"
     * @generated
     */
    Signal getSignal();

    /**
     * Sets the value of the '{@link uml.ReceiveSignalEvent#getSignal <em>Signal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Signal</em>' reference.
     * @see #getSignal()
     * @generated
     */
    void setSignal(Signal value);

} // ReceiveSignalEvent
