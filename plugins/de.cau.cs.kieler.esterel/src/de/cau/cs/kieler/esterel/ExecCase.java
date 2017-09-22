/**
 */
package de.cau.cs.kieler.esterel;

import de.cau.cs.kieler.kexpressions.Expression;

import de.cau.cs.kieler.scl.StatementContainer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exec Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.ExecCase#getTask <em>Task</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.ExecCase#getReferenceParameters <em>Reference Parameters</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.ExecCase#getValueParameters <em>Value Parameters</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.ExecCase#getReturnSignal <em>Return Signal</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.EsterelPackage#getExecCase()
 * @model
 * @generated
 */
public interface ExecCase extends StatementContainer {
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
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getExecCase_Task()
     * @model
     * @generated
     */
    Task getTask();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.ExecCase#getTask <em>Task</em>}' reference.
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
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getExecCase_ReferenceParameters()
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
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getExecCase_ValueParameters()
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
     * @see de.cau.cs.kieler.esterel.EsterelPackage#getExecCase_ReturnSignal()
     * @model
     * @generated
     */
    Signal getReturnSignal();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.esterel.ExecCase#getReturnSignal <em>Return Signal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Return Signal</em>' reference.
     * @see #getReturnSignal()
     * @generated
     */
    void setReturnSignal(Signal value);

} // ExecCase
