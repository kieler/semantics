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
 * A representation of the model object '<em><b>Accept Call Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An accept call action is an accept event action representing the receipt of a synchronous call request. In addition to the normal operation parameters, the action produces an output that is needed later to supply the information to the reply action necessary to return control to the caller. This action is for synchronous calls. If it is used to handle an asynchronous call, execution of the subsequent reply action will complete immediately with no effects.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.AcceptCallAction#getReturnInformation <em>Return Information</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getAcceptCallAction()
 * @model
 * @generated
 */
public interface AcceptCallAction extends AcceptEventAction {
    /**
     * Returns the value of the '<em><b>Return Information</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pin where a value is placed containing sufficient information to perform a subsequent reply and return control to the caller. The contents of this value are opaque. It can be passed and copied but it cannot be manipulated by the model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Return Information</em>' containment reference.
     * @see #setReturnInformation(OutputPin)
     * @see uml.UmlPackage#getAcceptCallAction_ReturnInformation()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    OutputPin getReturnInformation();

    /**
     * Sets the value of the '{@link uml.AcceptCallAction#getReturnInformation <em>Return Information</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Return Information</em>' containment reference.
     * @see #getReturnInformation()
     * @generated
     */
    void setReturnInformation(OutputPin value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The result pins must match the in and inout parameters of the operation specified by the trigger event in number, type, and order.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean result_pins(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The trigger event must be a CallEvent.
     * trigger.event.oclIsKindOf(CallEvent)
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean trigger_call_event(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * isUnmrashall must be true for an AcceptCallAction.
     * isUnmarshall = true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean unmarshall(DiagnosticChain diagnostics, Map<Object, Object> context);

} // AcceptCallAction
