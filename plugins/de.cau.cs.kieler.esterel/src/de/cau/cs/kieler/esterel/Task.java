/**
 */
package de.cau.cs.kieler.esterel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.Task#getReferenceArguments <em>Reference Arguments</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.Task#getValueArguments <em>Value Arguments</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EsterelDefinition {
    /**
     * Returns the value of the '<em><b>Reference Arguments</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.esterel.TypeIdentifier}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reference Arguments</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reference Arguments</em>' containment reference list.
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getTask_ReferenceArguments()
     * @model containment="true"
     * @generated
     */
    EList<TypeIdentifier> getReferenceArguments();

    /**
     * Returns the value of the '<em><b>Value Arguments</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.esterel.TypeIdentifier}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value Arguments</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value Arguments</em>' containment reference list.
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getTask_ValueArguments()
     * @model containment="true"
     * @generated
     */
    EList<TypeIdentifier> getValueArguments();

} // Task
