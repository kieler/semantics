/**
 */
package de.cau.cs.kieler.simulation.trace.ktrace;

import de.cau.cs.kieler.annotations.Annotatable;

import de.cau.cs.kieler.annotations.NamedObject;
import de.cau.cs.kieler.kexpressions.keffects.Effect;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tick</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.simulation.trace.ktrace.Tick#getInputs <em>Inputs</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simulation.trace.ktrace.Tick#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link de.cau.cs.kieler.simulation.trace.ktrace.Tick#getGoto <em>Goto</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.simulation.trace.ktrace.KTracePackage#getTick()
 * @model
 * @generated
 */
public interface Tick extends Annotatable, NamedObject {
    /**
     * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kexpressions.keffects.Effect}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inputs</em>' containment reference list.
     * @see de.cau.cs.kieler.simulation.trace.ktrace.KTracePackage#getTick_Inputs()
     * @model containment="true"
     * @generated
     */
    EList<Effect> getInputs();

    /**
     * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kexpressions.keffects.Effect}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outputs</em>' containment reference list.
     * @see de.cau.cs.kieler.simulation.trace.ktrace.KTracePackage#getTick_Outputs()
     * @model containment="true"
     * @generated
     */
    EList<Effect> getOutputs();

    /**
     * Returns the value of the '<em><b>Goto</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Goto</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Goto</em>' reference.
     * @see #setGoto(Tick)
     * @see de.cau.cs.kieler.simulation.trace.ktrace.KTracePackage#getTick_Goto()
     * @model
     * @generated
     */
    Tick getGoto();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.simulation.trace.ktrace.Tick#getGoto <em>Goto</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Goto</em>' reference.
     * @see #getGoto()
     * @generated
     */
    void setGoto(Tick value);

} // Tick
