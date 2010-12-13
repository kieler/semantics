/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.esterel.esterel;

import de.cau.cs.kieler.core.kexpressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.ConstantExpression#getConstant <em>Constant</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.ConstantExpression#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getConstantExpression()
 * @model
 * @generated
 */
public interface ConstantExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Constant</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant</em>' reference.
   * @see #setConstant(Constant)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getConstantExpression_Constant()
   * @model
   * @generated
   */
  Constant getConstant();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.ConstantExpression#getConstant <em>Constant</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant</em>' reference.
   * @see #getConstant()
   * @generated
   */
  void setConstant(Constant value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(ConstantValue)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getConstantExpression_Value()
   * @model containment="true"
   * @generated
   */
  ConstantValue getValue();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.ConstantExpression#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ConstantValue value);

} // ConstantExpression
