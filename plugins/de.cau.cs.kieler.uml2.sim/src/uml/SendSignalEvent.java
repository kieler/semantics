/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Signal Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A send signal event models the sending of a signal.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.SendSignalEvent#getSignal <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getSendSignalEvent()
 * @model
 * @generated
 */
public interface SendSignalEvent extends MessageEvent {
    /**
     * Returns the value of the '<em><b>Signal</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The signal associated with this event.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Signal</em>' reference.
     * @see #setSignal(Signal)
     * @see uml.UmlPackage#getSendSignalEvent_Signal()
     * @model required="true" ordered="false"
     * @generated
     */
    Signal getSignal();

    /**
     * Sets the value of the '{@link uml.SendSignalEvent#getSignal <em>Signal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Signal</em>' reference.
     * @see #getSignal()
     * @generated
     */
    void setSignal(Signal value);

} // SendSignalEvent
