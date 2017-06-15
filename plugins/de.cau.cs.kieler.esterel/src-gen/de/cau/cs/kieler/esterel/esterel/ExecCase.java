/**
 */
package de.cau.cs.kieler.esterel.esterel;

import de.cau.cs.kieler.kexpressions.Expression;

import de.cau.cs.kieler.scl.scl.StatementContainer;

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
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.ExecCase#getTask <em>Task</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.ExecCase#getVars <em>Vars</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.ExecCase#getKexpressions <em>Kexpressions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.ExecCase#getRetSignal <em>Ret Signal</em>}</li>
 * </ul>
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
   * Returns the value of the '<em><b>Vars</b></em>' reference list.
   * The list contents are of type {@link de.cau.cs.kieler.esterel.esterel.IVariable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getExecCase_Vars()
   * @model
   * @generated
   */
  EList<IVariable> getVars();

  /**
   * Returns the value of the '<em><b>Kexpressions</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.kexpressions.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kexpressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kexpressions</em>' containment reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getExecCase_Kexpressions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getKexpressions();

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
