/**
 */
package de.cau.cs.kieler.esterel.esterel;

import de.cau.cs.kieler.core.kexpressions.ISignal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exec Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.ExecCase#getTask <em>Task</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.ExecCase#getBody <em>Body</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.ExecCase#getRetSignal <em>Ret Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getExecCase()
 * @model
 * @generated
 */
public interface ExecCase extends StatementContainer
{
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
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getExecCase_Task()
   * @model
   * @generated
   */
  Task getTask();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.ExecCase#getTask <em>Task</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task</em>' reference.
   * @see #getTask()
   * @generated
   */
  void setTask(Task value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(ExecBody)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getExecCase_Body()
   * @model containment="true"
   * @generated
   */
  ExecBody getBody();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.ExecCase#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(ExecBody value);

  /**
   * Returns the value of the '<em><b>Ret Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ret Signal</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ret Signal</em>' reference.
   * @see #setRetSignal(ISignal)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getExecCase_RetSignal()
   * @model
   * @generated
   */
  ISignal getRetSignal();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.ExecCase#getRetSignal <em>Ret Signal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ret Signal</em>' reference.
   * @see #getRetSignal()
   * @generated
   */
  void setRetSignal(ISignal value);

} // ExecCase
