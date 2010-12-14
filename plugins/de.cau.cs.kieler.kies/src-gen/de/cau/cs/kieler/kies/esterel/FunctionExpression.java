/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.kies.esterel;

import de.cau.cs.kieler.core.kexpressions.Expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.FunctionExpression#getFuncion <em>Funcion</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kies.esterel.FunctionExpression#getKexpressions <em>Kexpressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getFunctionExpression()
 * @model
 * @generated
 */
public interface FunctionExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Funcion</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Funcion</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Funcion</em>' reference.
   * @see #setFuncion(Function)
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getFunctionExpression_Funcion()
   * @model
   * @generated
   */
  Function getFuncion();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kies.esterel.FunctionExpression#getFuncion <em>Funcion</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Funcion</em>' reference.
   * @see #getFuncion()
   * @generated
   */
  void setFuncion(Function value);

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
   * @see de.cau.cs.kieler.kies.esterel.EsterelPackage#getFunctionExpression_Kexpressions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getKexpressions();

} // FunctionExpression
