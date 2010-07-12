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
 * A representation of the model object '<em><b>Send Signal Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A send signal action is an action that creates a signal instance from its inputs, and transmits it to the target object, where it may cause the firing of a state machine transition or the execution of an activity. The argument values are available to the execution of associated behaviors. The requestor continues execution immediately. Any reply message is ignored and is not transmitted to the requestor. If the input is already a signal instance, use a send object action.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.SendSignalAction#getTarget <em>Target</em>}</li>
 *   <li>{@link uml.SendSignalAction#getSignal <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getSendSignalAction()
 * @model
 * @generated
 */
public interface SendSignalAction extends InvocationAction {
    /**
     * Returns the value of the '<em><b>Target</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The target object to which the signal is sent.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Target</em>' containment reference.
     * @see #setTarget(InputPin)
     * @see uml.UmlPackage#getSendSignalAction_Target()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    InputPin getTarget();

    /**
     * Sets the value of the '{@link uml.SendSignalAction#getTarget <em>Target</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' containment reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(InputPin value);

    /**
     * Returns the value of the '<em><b>Signal</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The type of signal transmitted to the target object.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Signal</em>' reference.
     * @see #setSignal(Signal)
     * @see uml.UmlPackage#getSendSignalAction_Signal()
     * @model required="true" ordered="false"
     * @generated
     */
    Signal getSignal();

    /**
     * Sets the value of the '{@link uml.SendSignalAction#getSignal <em>Signal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Signal</em>' reference.
     * @see #getSignal()
     * @generated
     */
    void setSignal(Signal value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The number and order of argument pins must be the same as the number and order of attributes in the signal.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean number_order(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The type, ordering, and multiplicity of an argument pin must be the same as the corresponding attribute of the signal.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean type_ordering_multiplicity(DiagnosticChain diagnostics, Map<Object, Object> context);

} // SendSignalAction
