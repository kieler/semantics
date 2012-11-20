/**
 */
package de.cau.kieler.scc.model.scctext.sccexp;

import org.yakindu.sct.model.stext.stext.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.Trigger#isIsImmediate <em>Is Immediate</em>}</li>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.Trigger#getDelay <em>Delay</em>}</li>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.Trigger#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage#getTrigger()
 * @model
 * @generated
 */
public interface Trigger extends org.yakindu.sct.model.sgraph.Trigger
{
  /**
   * Returns the value of the '<em><b>Is Immediate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Immediate</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Immediate</em>' attribute.
   * @see #setIsImmediate(boolean)
   * @see de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage#getTrigger_IsImmediate()
   * @model
   * @generated
   */
  boolean isIsImmediate();

  /**
   * Sets the value of the '{@link de.cau.kieler.scc.model.scctext.sccexp.Trigger#isIsImmediate <em>Is Immediate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Immediate</em>' attribute.
   * @see #isIsImmediate()
   * @generated
   */
  void setIsImmediate(boolean value);

  /**
   * Returns the value of the '<em><b>Delay</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delay</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delay</em>' attribute.
   * @see #setDelay(int)
   * @see de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage#getTrigger_Delay()
   * @model
   * @generated
   */
  int getDelay();

  /**
   * Sets the value of the '{@link de.cau.kieler.scc.model.scctext.sccexp.Trigger#getDelay <em>Delay</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delay</em>' attribute.
   * @see #getDelay()
   * @generated
   */
  void setDelay(int value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage#getTrigger_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link de.cau.kieler.scc.model.scctext.sccexp.Trigger#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // Trigger
