/**
 */
package de.cau.cs.kieler.kvis;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And Or Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kvis.AndOrExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kvis.AndOrExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kvis.AndOrExpression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kvis.KvisPackage#getAndOrExpression()
 * @model
 * @generated
 */
public interface AndOrExpression extends BooleanExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(BooleanExpression)
   * @see de.cau.cs.kieler.kvis.KvisPackage#getAndOrExpression_Left()
   * @model containment="true"
   * @generated
   */
  BooleanExpression getLeft();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kvis.AndOrExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(BooleanExpression value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.kieler.kvis.BooleanOperatorType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see de.cau.cs.kieler.kvis.BooleanOperatorType
   * @see #setOperator(BooleanOperatorType)
   * @see de.cau.cs.kieler.kvis.KvisPackage#getAndOrExpression_Operator()
   * @model
   * @generated
   */
  BooleanOperatorType getOperator();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kvis.AndOrExpression#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see de.cau.cs.kieler.kvis.BooleanOperatorType
   * @see #getOperator()
   * @generated
   */
  void setOperator(BooleanOperatorType value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see de.cau.cs.kieler.kvis.KvisPackage#getAndOrExpression_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kvis.AndOrExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

} // AndOrExpression
