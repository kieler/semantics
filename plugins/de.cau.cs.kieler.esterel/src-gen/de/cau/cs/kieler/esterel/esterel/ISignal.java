/**
 */
package de.cau.cs.kieler.esterel.esterel;

import de.cau.cs.kieler.kexpressions.Expression;
import de.cau.cs.kieler.kexpressions.ValueType;
import de.cau.cs.kieler.kexpressions.ValuedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISignal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.ISignal#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.ISignal#getTypeID <em>Type ID</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.ISignal#getFunc <em>Func</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.ISignal#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getISignal()
 * @model
 * @generated
 */
public interface ISignal extends ValuedObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.kieler.kexpressions.ValueType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see de.cau.cs.kieler.kexpressions.ValueType
   * @see #setType(ValueType)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getISignal_Type()
   * @model
   * @generated
   */
  ValueType getType();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.ISignal#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see de.cau.cs.kieler.kexpressions.ValueType
   * @see #getType()
   * @generated
   */
  void setType(ValueType value);

  /**
   * Returns the value of the '<em><b>Type ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type ID</em>' attribute.
   * @see #setTypeID(String)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getISignal_TypeID()
   * @model
   * @generated
   */
  String getTypeID();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.ISignal#getTypeID <em>Type ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type ID</em>' attribute.
   * @see #getTypeID()
   * @generated
   */
  void setTypeID(String value);

  /**
   * Returns the value of the '<em><b>Func</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Func</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func</em>' reference.
   * @see #setFunc(Function)
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getISignal_Func()
   * @model
   * @generated
   */
  Function getFunc();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.ISignal#getFunc <em>Func</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Func</em>' reference.
   * @see #getFunc()
   * @generated
   */
  void setFunc(Function value);

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
   * @see de.cau.cs.kieler.esterel.esterel.EsterelPackage#getISignal_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.esterel.esterel.ISignal#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // ISignal
