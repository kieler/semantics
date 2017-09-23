/**
 */
package de.cau.cs.kieler.esterel;

import de.cau.cs.kieler.kexpressions.Expression;

import de.cau.cs.kieler.scl.StatementContainer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.Exec#getTask <em>Task</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.Exec#getReferenceParameters <em>Reference Parameters</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.Exec#getValueParameters <em>Value Parameters</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.Exec#getReturnSignal <em>Return Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.Exec#getExecCaseList <em>Exec Case List</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getExec()
 * @model
 * @generated
 */
public interface Exec extends EsterelStatement, StatementContainer {
    /**
     * Returns the value of the '<em><b>Task</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Task</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Task</em>' reference.
     * @see #setTask(Task)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getExec_Task()
     * @model
     * @generated
     */
    Task getTask();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.Exec#getTask <em>Task</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Task</em>' reference.
     * @see #getTask()
     * @generated
     */
    void setTask(Task value);

    /**
     * Returns the value of the '<em><b>Reference Parameters</b></em>' reference list.
     * The list contents are of type {@link de.cau.cs.kieler.esterel.Variable}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reference Parameters</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reference Parameters</em>' reference list.
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getExec_ReferenceParameters()
     * @model
     * @generated
     */
    EList<Variable> getReferenceParameters();

    /**
     * Returns the value of the '<em><b>Value Parameters</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.kexpressions.Expression}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value Parameters</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value Parameters</em>' containment reference list.
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getExec_ValueParameters()
     * @model containment="true"
     * @generated
     */
    EList<Expression> getValueParameters();

    /**
     * Returns the value of the '<em><b>Return Signal</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Return Signal</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Return Signal</em>' reference.
     * @see #setReturnSignal(Signal)
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getExec_ReturnSignal()
     * @model
     * @generated
     */
    Signal getReturnSignal();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.Exec#getReturnSignal <em>Return Signal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Return Signal</em>' reference.
     * @see #getReturnSignal()
     * @generated
     */
    void setReturnSignal(Signal value);

    /**
     * Returns the value of the '<em><b>Exec Case List</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.esterel.ExecCase}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exec Case List</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exec Case List</em>' containment reference list.
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getExec_ExecCaseList()
     * @model containment="true"
     * @generated
     */
    EList<ExecCase> getExecCaseList();

} // Exec
