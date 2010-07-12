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
 * A representation of the model object '<em><b>Reply Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reply action is an action that accepts a set of return values and a value containing return information produced by a previous accept call action. The reply action returns the values to the caller of the previous call, completing execution of the call.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.ReplyAction#getReplyToCall <em>Reply To Call</em>}</li>
 *   <li>{@link uml.ReplyAction#getReturnInformation <em>Return Information</em>}</li>
 *   <li>{@link uml.ReplyAction#getReplyValue <em>Reply Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getReplyAction()
 * @model
 * @generated
 */
public interface ReplyAction extends Action {
    /**
     * Returns the value of the '<em><b>Reply To Call</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The trigger specifying the operation whose call is being replied to.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Reply To Call</em>' reference.
     * @see #setReplyToCall(Trigger)
     * @see uml.UmlPackage#getReplyAction_ReplyToCall()
     * @model required="true" ordered="false"
     * @generated
     */
    Trigger getReplyToCall();

    /**
     * Sets the value of the '{@link uml.ReplyAction#getReplyToCall <em>Reply To Call</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reply To Call</em>' reference.
     * @see #getReplyToCall()
     * @generated
     */
    void setReplyToCall(Trigger value);

    /**
     * Returns the value of the '<em><b>Return Information</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A pin containing the return information value produced by an earlier AcceptCallAction.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Return Information</em>' containment reference.
     * @see #setReturnInformation(InputPin)
     * @see uml.UmlPackage#getReplyAction_ReturnInformation()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    InputPin getReturnInformation();

    /**
     * Sets the value of the '{@link uml.ReplyAction#getReturnInformation <em>Return Information</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Return Information</em>' containment reference.
     * @see #getReturnInformation()
     * @generated
     */
    void setReturnInformation(InputPin value);

    /**
     * Returns the value of the '<em><b>Reply Value</b></em>' containment reference list.
     * The list contents are of type {@link uml.InputPin}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A list of pins containing the reply values of the operation. These values are returned to the caller.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Reply Value</em>' containment reference list.
     * @see uml.UmlPackage#getReplyAction_ReplyValue()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<InputPin> getReplyValue();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The reply value pins must match the return, out, and inout parameters of the operation on the event on the trigger in number, type, and order.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean pins_match_parameter(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The event on replyToCall trigger must be a CallEvent replyToCallEvent.oclIsKindOf(CallEvent)
     * replyToCallEvent.oclIsKindOf(CallEvent)
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean event_on_reply_to_call_trigger(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ReplyAction
