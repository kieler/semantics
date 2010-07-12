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
 * A representation of the model object '<em><b>Duration Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A duration constraint is a constraint that refers to a duration interval.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.DurationConstraint#getFirstEvent <em>First Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getDurationConstraint()
 * @model
 * @generated
 */
public interface DurationConstraint extends IntervalConstraint {
    /**
     * Returns the value of the '<em><b>First Event</b></em>' attribute list.
     * The list contents are of type {@link java.lang.Boolean}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The value of firstEvent[i] is related to constrainedElement[i] (where i is 1 or 2). If firstEvent[i] is true, then the corresponding observation event is the first time instant the execution enters constrainedElement[i]. If firstEvent[i] is false, then the corresponding observation event is the last time instant the execution is within constrainedElement[i]. Default value is true applied when constrainedElement[i] refers an element that represents only one time instant.
     * <!-- end-model-doc -->
     * @return the value of the '<em>First Event</em>' attribute list.
     * @see uml.UmlPackage#getDurationConstraint_FirstEvent()
     * @model default="true" dataType="uml.Boolean" upper="2" ordered="false"
     * @generated
     */
    EList<Boolean> getFirstEvent();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The multiplicity of firstEvent must be 2 if the multiplicity of constrainedElement is 2. Otherwise the multiplicity of firstEvent is 0.
     * if (constrainedElement->size() =2)
     *   then (firstEvent->size() = 2) else (firstEvent->size() = 0)
     * @param diagnostics The chain of diagnostics to which problems are to be appended.
     * @param context The cache of context-specific information.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean first_event_multiplicity(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DurationConstraint
