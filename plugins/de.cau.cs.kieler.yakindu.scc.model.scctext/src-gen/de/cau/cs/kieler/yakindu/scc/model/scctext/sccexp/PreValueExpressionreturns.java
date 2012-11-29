/**
 */
package de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp;

import org.yakindu.sct.model.stext.stext.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pre Value Expressionreturns</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.PreValueExpressionreturns#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.SccexpPackage#getPreValueExpressionreturns()
 * @model
 * @generated
 */
public interface PreValueExpressionreturns extends Expression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Expression)
   * @see de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.SccexpPackage#getPreValueExpressionreturns_Value()
   * @model containment="true"
   * @generated
   */
  Expression getValue();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.yakindu.scc.model.scctext.sccexp.PreValueExpressionreturns#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Expression value);

} // PreValueExpressionreturns
