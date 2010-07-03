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
 * A representation of the model object '<em><b>Time Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A time event specifies a point in time. At the specified time, the event occurs.
 * A time event can be defined relative to entering the current state of the executing state machine.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.TimeEvent#isIsRelative <em>Is Relative</em>}</li>
 *   <li>{@link uml.TimeEvent#getWhen <em>When</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getTimeEvent()
 * @model
 * @generated
 */
public interface TimeEvent extends Event {
    /**
     * Returns the value of the '<em><b>Is Relative</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies whether it is relative or absolute time.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Is Relative</em>' attribute.
     * @see #setIsRelative(boolean)
     * @see uml.UmlPackage#getTimeEvent_IsRelative()
     * @model default="false" dataType="uml.Boolean" required="true" ordered="false"
     * @generated
     */
    boolean isIsRelative();

    /**
     * Sets the value of the '{@link uml.TimeEvent#isIsRelative <em>Is Relative</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Relative</em>' attribute.
     * @see #isIsRelative()
     * @generated
     */
    void setIsRelative(boolean value);

    /**
     * Returns the value of the '<em><b>When</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies the corresponding time deadline.
     * <!-- end-model-doc -->
     * @return the value of the '<em>When</em>' containment reference.
     * @see #setWhen(ValueSpecification)
     * @see uml.UmlPackage#getTimeEvent_When()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    ValueSpecification getWhen();

    /**
     * Sets the value of the '{@link uml.TimeEvent#getWhen <em>When</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>When</em>' containment reference.
     * @see #getWhen()
     * @generated
     */
    void setWhen(ValueSpecification value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The ValueSpecification when must return a non-negative Integer.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean when_non_negative(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The starting time for a relative time event may only be omitted for a time event that is the trigger of a state machine.
     * true
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean starting_time(DiagnosticChain diagnostics, Map<Object, Object> context);

} // TimeEvent
