/**
 */
package de.cau.kieler.scc.model.scctext.sccexp;

import org.yakindu.base.types.Type;

import org.yakindu.sct.model.stext.stext.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.Local#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.Local#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.Local#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.Local#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage#getLocal()
 * @model
 * @generated
 */
public interface Local extends LocalVariableDeclaration
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage#getLocal_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.kieler.scc.model.scctext.sccexp.Local#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Type)
   * @see de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage#getLocal_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link de.cau.kieler.scc.model.scctext.sccexp.Local#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Initial Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initial Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial Value</em>' containment reference.
   * @see #setInitialValue(Expression)
   * @see de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage#getLocal_InitialValue()
   * @model containment="true"
   * @generated
   */
  Expression getInitialValue();

  /**
   * Sets the value of the '{@link de.cau.kieler.scc.model.scctext.sccexp.Local#getInitialValue <em>Initial Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial Value</em>' containment reference.
   * @see #getInitialValue()
   * @generated
   */
  void setInitialValue(Expression value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.kieler.scc.model.scctext.sccexp.CombineOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see de.cau.kieler.scc.model.scctext.sccexp.CombineOperator
   * @see #setOperator(CombineOperator)
   * @see de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage#getLocal_Operator()
   * @model
   * @generated
   */
  CombineOperator getOperator();

  /**
   * Sets the value of the '{@link de.cau.kieler.scc.model.scctext.sccexp.Local#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see de.cau.kieler.scc.model.scctext.sccexp.CombineOperator
   * @see #getOperator()
   * @generated
   */
  void setOperator(CombineOperator value);

} // Local
