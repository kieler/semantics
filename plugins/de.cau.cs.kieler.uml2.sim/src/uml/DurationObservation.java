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
 * A representation of the model object '<em><b>Duration Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A duration observation is a reference to a duration during an execution. It points out the element(s) in the model to observe and whether the observations are when this model element is entered or when it is exited.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.DurationObservation#getEvent <em>Event</em>}</li>
 *   <li>{@link uml.DurationObservation#getFirstEvent <em>First Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getDurationObservation()
 * @model
 * @generated
 */
public interface DurationObservation extends Observation {
    /**
     * Returns the value of the '<em><b>Event</b></em>' reference list.
     * The list contents are of type {@link uml.NamedElement}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The observation is determined by the entering or exiting of the event element during execution.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Event</em>' reference list.
     * @see uml.UmlPackage#getDurationObservation_Event()
     * @model required="true" upper="2" ordered="false"
     * @generated
     */
    EList<NamedElement> getEvent();

    /**
     * Returns the value of the '<em><b>First Event</b></em>' attribute list.
     * The list contents are of type {@link java.lang.Boolean}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The value of firstEvent[i] is related to event[i] (where i is 1 or 2). If firstEvent[i] is true, then the corresponding observation event is the first time instant the execution enters event[i]. If firstEvent[i] is false, then the corresponding observation event is the time instant the execution exits event[i]. Default value is true applied when event[i] refers an element that represents only one time instant.
     * <!-- end-model-doc -->
     * @return the value of the '<em>First Event</em>' attribute list.
     * @see uml.UmlPackage#getDurationObservation_FirstEvent()
     * @model default="true" dataType="uml.Boolean" upper="2" ordered="false"
     * @generated
     */
    EList<Boolean> getFirstEvent();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The multiplicity of firstEvent must be 2 if the multiplicity of event is 2. Otherwise the multiplicity of firstEvent is 0.
     * if (event->size() = 2)
     *   then (firstEvent->size() = 2) else (firstEvent->size() = 0)
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean first_event_multiplicity(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DurationObservation
