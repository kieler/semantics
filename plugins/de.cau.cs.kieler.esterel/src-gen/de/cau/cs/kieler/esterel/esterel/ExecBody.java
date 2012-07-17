/**
 */
package de.cau.cs.kieler.esterel.esterel;

import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.IVariable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exec Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.ExecBody#getVars <em>Vars</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.ExecBody#getKexpressions <em>Kexpressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getExecBody()
 * @model
 * @generated
 */
public interface ExecBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Vars</b></em>' reference list.
   * The list contents are of type {@link de.cau.cs.kieler.core.kexpressions.IVariable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' reference list.
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getExecBody_Vars()
   * @model
   * @generated
   */
  EList<IVariable> getVars();

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
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getExecBody_Kexpressions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getKexpressions();

} // ExecBody
