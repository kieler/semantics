/**
 */
package de.cau.cs.kieler.esterel;

import de.cau.cs.kieler.scl.StatementContainer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.Trap#getTrapSignals <em>Trap Signals</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.Trap#getTrapHandler <em>Trap Handler</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getTrap()
 * @model
 * @generated
 */
public interface Trap extends EsterelStatement, StatementContainer {
    /**
     * Returns the value of the '<em><b>Trap Signals</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.esterel.Signal}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trap Signals</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trap Signals</em>' containment reference list.
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getTrap_TrapSignals()
     * @model containment="true"
     * @generated
     */
    EList<Signal> getTrapSignals();

    /**
     * Returns the value of the '<em><b>Trap Handler</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.esterel.TrapHandler}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trap Handler</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trap Handler</em>' containment reference list.
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getTrap_TrapHandler()
     * @model containment="true"
     * @generated
     */
    EList<TrapHandler> getTrapHandler();

} // Trap
