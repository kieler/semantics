/**
 */
package de.cau.cs.kieler.simulation.trace.ktrace;

import de.cau.cs.kieler.annotations.Pragmatable;

import de.cau.cs.kieler.kexpressions.ValuedObject;
import de.cau.cs.kieler.kexpressions.kext.DeclarationScope;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.simulation.trace.ktrace.TraceFile#getTraces <em>Traces</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simulation.trace.ktrace.TraceFile#getAggregatedValuedObjects <em>Aggregated Valued Objects</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.simulation.trace.ktrace.KTracePackage#getTraceFile()
 * @model
 * @generated
 */
public interface TraceFile extends Pragmatable {
    /**
     * Returns the value of the '<em><b>Traces</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.simulation.trace.ktrace.Trace}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Traces</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Traces</em>' containment reference list.
     * @see de.cau.cs.kieler.simulation.trace.ktrace.KTracePackage#getTraceFile_Traces()
     * @model containment="true"
     * @generated
     */
    EList<Trace> getTraces();

    /**
     * Returns the value of the '<em><b>Aggregated Valued Objects</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kexpressions.ValuedObject}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Aggregated Valued Objects</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Aggregated Valued Objects</em>' containment reference list.
     * @see de.cau.cs.kieler.simulation.trace.ktrace.KTracePackage#getTraceFile_AggregatedValuedObjects()
     * @model containment="true" transient="true"
     * @generated
     */
    EList<ValuedObject> getAggregatedValuedObjects();

} // TraceFile
