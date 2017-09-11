/**
 */
package de.cau.cs.kieler.simulation.trace.ktrace;

import de.cau.cs.kieler.annotations.Pragmatable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.simulation.trace.ktrace.Trace#getTicks <em>Ticks</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.simulation.trace.ktrace.KTracePackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends Pragmatable {
    /**
     * Returns the value of the '<em><b>Ticks</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.simulation.trace.ktrace.Tick}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ticks</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ticks</em>' containment reference list.
     * @see de.cau.cs.kieler.simulation.trace.ktrace.KTracePackage#getTrace_Ticks()
     * @model containment="true"
     * @generated
     */
    EList<Tick> getTicks();

} // Trace
