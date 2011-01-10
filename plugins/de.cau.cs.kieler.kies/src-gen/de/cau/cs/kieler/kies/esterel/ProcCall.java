/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.kies.esterel;

import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.IVariable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proc Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.ProcCall#getProc <em>Proc</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.ProcCall#getVarList <em>Var List</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.ProcCall#getKexpressions <em>Kexpressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getProcCall()
 * @model
 * @generated
 */
public interface ProcCall extends Statement
{
  /**
   * Returns the value of the '<em><b>Proc</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Proc</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proc</em>' reference.
   * @see #setProc(Procedure)
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getProcCall_Proc()
   * @model
   * @generated
   */
  Procedure getProc();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.ProcCall#getProc <em>Proc</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Proc</em>' reference.
   * @see #getProc()
   * @generated
   */
  void setProc(Procedure value);

  /**
   * Returns the value of the '<em><b>Var List</b></em>' reference list.
   * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.IVariable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var List</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var List</em>' reference list.
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getProcCall_VarList()
   * @model
   * @generated
   */
  EList<IVariable> getVarList();

  /**
   * Returns the value of the '<em><b>Kexpressions</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kexpressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kexpressions</em>' containment reference list.
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getProcCall_Kexpressions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getKexpressions();

} // ProcCall
