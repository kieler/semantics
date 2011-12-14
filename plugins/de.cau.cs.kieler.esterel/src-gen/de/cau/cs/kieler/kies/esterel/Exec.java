/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.kies.esterel;

import de.cau.cs.kieler.core.kexpressions.ISignal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.Exec#getTask <em>Task</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.Exec#getBody <em>Body</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.Exec#getRetSignal <em>Ret Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.Exec#getExecCaseList <em>Exec Case List</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.Exec#getOptEnd <em>Opt End</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getExec()
 * @model
 * @generated
 */
public interface Exec extends StatementContainer, Statement
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
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getExec_Task()
   * @model
   * @generated
   */
  Task getTask();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.Exec#getTask <em>Task</em>}' reference.
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
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getExec_Body()
   * @model containment="true"
   * @generated
   */
  ExecBody getBody();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.Exec#getBody <em>Body</em>}' containment reference.
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
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getExec_RetSignal()
   * @model
   * @generated
   */
  ISignal getRetSignal();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.Exec#getRetSignal <em>Ret Signal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ret Signal</em>' reference.
   * @see #getRetSignal()
   * @generated
   */
  void setRetSignal(ISignal value);

  /**
   * Returns the value of the '<em><b>Exec Case List</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.kies.esterel.ExecCase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exec Case List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exec Case List</em>' containment reference list.
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getExec_ExecCaseList()
   * @model containment="true"
   * @generated
   */
  EList<ExecCase> getExecCaseList();

  /**
   * Returns the value of the '<em><b>Opt End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opt End</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opt End</em>' attribute.
   * @see #setOptEnd(String)
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getExec_OptEnd()
   * @model
   * @generated
   */
  String getOptEnd();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.Exec#getOptEnd <em>Opt End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opt End</em>' attribute.
   * @see #getOptEnd()
   * @generated
   */
  void setOptEnd(String value);

} // Exec
